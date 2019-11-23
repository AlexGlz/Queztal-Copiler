from MemoryManager import *


class VirtualMemory:
    def __init__(self,globals,constants):
        self.vMemory = {
            "Global": {
                "int":[],
                "float":[],
                "bool":[],
                "color":[]
                },
            "Constant":{
                "int":[],
                "float":[],
                "bool":[],
                "color":[]
            },
            "Stack":[]    
        }
        for (_,data) in globals.items():
            self.vMemory["Global"][data["type"]].append(None)

        for (cte,data) in constants.items():
            self.vMemory["Constant"][data["type"]].append(cte)


    def getLocation(self,address):
        defaultAdd = address - (address%Memory.MemSize)
        return Memory.Reference[defaultAdd]

    def getValue(self,address):
        #En caso de que se acceda a un apuntador ejemplo: (5000)
        if(str(address)[0]=="("):
            address = address[1:-1]#remover los paréntesis
            address = self.getValue(int(address)) #La dirección ahora será el valor del apuntador
        index = int(address)%Memory.MemSize
        location = self.getLocation(address)
        scope = location[0]
        type = location[1]
        if(scope == "Global" or scope == "Constant"):        
            valor=self.vMemory[scope][type][index]
        else:
            valor=self.vMemory["Stack"][-1][scope][type][index] #El -1 permite acceder al último elemento del stack
        if(type == "int"):
            return int(valor)
        elif(type == "float"):
            return float(valor)
        elif(type == "bool"):
            if(valor=="True" or valor==True):
                return True
            elif(valor=="False" or valor==False):
                return False
            else:
                return None
        elif(type == "memory"):
            return self.getValue(valor)
        else:
            return valor

    def setValue(self,value,address):
        #En caso de que se acceda a un apuntador ejemplo: (5000)
        if(str(address)[0]=="("):
            address = address[1:-1]#remover los paréntesis
            address = self.getValue(int(address)) #La dirección ahora será el valor del apuntador
        else:
            address = int(address)
        index = address%Memory.MemSize
        location = self.getLocation(address)
        scope = location[0]
        type = location[1]
        if(scope == "Global" or scope == "Constant"): ##SI LA DIRECCION ES PARTE DEL BLOQUE DE VARIABLES GLOBALES O CONSTANTES
            self.vMemory[scope][type][index] = value
        else:
            self.vMemory["Stack"][-1][scope][type][index] = value #El -1 permite acceder al último elemento del stack de llamadas

    
    def initializeMemBlock(self,size):
        if(size>Memory.MemSize):
            raise Exception("Stack Overflow")
        return [None]*size


    def ERA(self,sizes): 
        block = dict()
        for (scope,types) in sizes.items():
            block[scope] = dict()
            for (type,size) in types.items():
                block[scope][type]  = self.initializeMemBlock(size)
        self.vMemory["Stack"].append(block)


class VirtualMachine():
    

    def __init__(self,quads,tables):
        ##LISTAS DE OPERADORES DEL LEGUAJE
        self.aritmethicOP = ["+","-","*","/"]
        self.logicOp = ["==","!=",">",">=","<","<=","||","&&"]
        self.gotos = ["GOTOF","GOTO","GOTOV","GOSUB"]
        ##Instanciar Memoria virtual
        self.virtualMemory = VirtualMemory(tables["globals"],tables["constants"])
        ##Manejo de cuádruplos
        self.Quads = quads           
        self.QuadCounter = 0
        ##Tablas de funciones
        self.Tables = tables["functions"]
        self.CallStack = []
        self.PreparingMemory = []
        self.ParamData = []
        ##
        self.CounterStack = []

        ##VARIABLES Y TEMPORALES DE LA FUNCIÓN MAIN
        mainVars = tables["functions"]["main"]["vars"]
        mainTemps =tables["functions"]["main"]["temps"]
        self.virtualMemory.ERA({"Local":mainVars,"Temp":mainTemps})

        
    def run(self):
        
        while self.QuadCounter < len(self.Quads):
            quad = self.Quads[self.QuadCounter]
            operador = quad.Operador
            izq = quad.OperandoI
            der = quad.OperandoD
            resultado = quad.Resultado
            if(operador == "="):
                self.virtualMemory.setValue(self.virtualMemory.getValue(izq),resultado)
            elif(operador in self.aritmethicOP): 
                izqVal = self.virtualMemory.getValue(izq)
                derVal = self.virtualMemory.getValue(der)
                valor = self.aritmethicExp(izqVal,derVal,operador)
                self.virtualMemory.setValue(valor,resultado)
            elif(operador in self.logicOp):
                izqVal = self.virtualMemory.getValue(izq)
                derVal = self.virtualMemory.getValue(der)
                valor = self.logicExp(izqVal,derVal,operador)
                self.virtualMemory.setValue(valor,resultado)
            elif(operador in self.gotos):
                izqVal = 0
                if(izq is not None):
                    izqVal = self.virtualMemory.getValue(izq)
                else:
                    izqVal = None               
                self.goTo(izqVal,operador,resultado)
            elif(operador=="print"):
                print(self.virtualMemory.getValue(resultado))
            elif(operador=="ERA"):
                fVarCounts = self.Tables[izq]["vars"]
                fTempCounts = self.Tables[izq]["temps"]
                self.virtualMemory.ERA({"Local":fVarCounts,"Temp":fTempCounts})
                self.PreparingMemory.append(self.virtualMemory.vMemory["Stack"].pop())
                self.CallStack.append(izq)
                #Generar auxiliar de parámetros
                self.ParamData.append(dict())

            elif(operador=="param"):
                actualFunct = self.CallStack[-1]
                paramNumber = int(resultado[5:])-1 #Obtener el número de parametro
                paramName = self.Tables[actualFunct]["parameters"][paramNumber]
                paramAdd = self.Tables[actualFunct]["parameters"][paramNumber][2]
                paramValue = self.virtualMemory.getValue(izq)
                self.ParamData[-1][paramAdd] = paramValue
            elif(operador=="gosub"):
                #Agregar la memoria de la fución al stack de memoria de funciones
                self.virtualMemory.vMemory["Stack"].append(self.PreparingMemory.pop())
                #Vaciar el contenido de los parámetros en la memoria de la nueva funcion
                for (paramAdd,paramVal) in self.ParamData[-1].items():
                    self.virtualMemory.setValue(paramVal,paramAdd)
                #Mover el apuntador de los cuádruplos al correspondiente a la función
                self.CounterStack.append(self.QuadCounter)
                self.QuadCounter = self.Tables[self.CallStack[-1]]["position"] - 2
            elif(operador=="ENDPROC"):
                #Reestablecer el contador de cúadruplos y hacer pop en los stacks
                self.QuadCounter = self.CounterStack.pop()
                self.virtualMemory.vMemory["Stack"].pop() #Borrar la memoria de la función
                self.CallStack.pop() #Eliminar la función de la pila de llamadas
                self.ParamData.pop()
            elif(operador=="VER"): #Verifica si el operando no se sale del límite superior 
                index = self.virtualMemory.getValue(izq)
                limInf= int(der)
                limSup = int(resultado)
                if(index > limSup or index < limInf):
                    raise Exception("index out of range") #display exception                
                
            elif(operador=="RETURN"):
                actualFunct = self.CallStack[-1]
                functionVarAdd = self.Tables[actualFunct]["varPosition"]
                if(self.Tables[actualFunct]["type"]!="void"):
                    self.virtualMemory.setValue(self.virtualMemory.getValue(resultado),functionVarAdd)
                self.QuadCounter = self.CounterStack.pop() ##Regresar al apuntador de quad anterior
                self.virtualMemory.vMemory["Stack"].pop()
                self.CallStack.pop() #Eliminar la función de la pila de llamadas
                self.ParamData.pop()
                
            #Avanzar el cúadruplo
            self.QuadCounter += 1

    def aritmethicExp(self,valorIzq,valorDer,operador):
        if(operador == "+"):
            return valorIzq + valorDer
        elif (operador == "-"):
            return valorIzq - valorDer
        elif (operador == "*"):
            return valorIzq * valorDer
        elif (operador == "/"):
            return valorIzq / valorDer

    def logicExp(self,valorIzq,valorDer,operador):
        if(operador == ">"):
            return valorIzq > valorDer
        elif(operador == "<"):
            return valorIzq < valorDer
        elif(operador == ">="):
            return valorIzq >= valorDer
        elif(operador == "<="):
            return valorIzq <= valorDer
        elif(operador == "=="):
            return valorIzq == valorDer
        elif(operador == "!="):
            return valorIzq != valorDer
        elif(operador == "||"):
            return valorIzq or valorDer
        elif(operador == "&&"):
            return valorIzq and valorDer
        else:
            return None

    def goTo(self,valorIzq,operador,posicion):
        if(operador == "GOTO"):
            self.QuadCounter = posicion - 2
        if(operador == "GOTOF"):
            if(valorIzq == False):
                self.QuadCounter = posicion - 2
