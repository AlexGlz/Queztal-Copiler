from MemoryManager import *
from SpecialFunctions import *

class VirtualMemory:
    def __init__(self,globals,constants):
        self.vMemory = {
            "Global": {
                "int":[],
                "float":[],
                "bool":[],
                "color":[],
                "tag":[]
                },
            "Constant":{
                "int":[],
                "float":[],
                "bool":[],
                "color":[],
                "tag":[]
            },
            "Stack":[]    
        }
        for (_,data) in globals.items():
            self.vMemory["Global"][data["type"]].append(None)

        for (cte,data) in constants.items():
            self.vMemory["Constant"][data["type"]].append(cte)


    def getLocation(self,address):
        if(str(address)[0] == "("):
            address = address[1:-1]
            return self.getLocation(int(address))
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
        elif(type == 'tag'): #Si es tag, extra el caracter de comillas " que se encuentran en la primer y última posición
            return valor[1:-1]
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
                tipo = self.virtualMemory.getLocation(izq)[1]
                izqVal = self.virtualMemory.getValue(izq)
                derVal = self.virtualMemory.getValue(der)
                valor = self.aritmethicExp(izqVal,derVal,operador,tipo)
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
            elif(operador=="read"):
                readValue = input()
                type = self.virtualMemory.getLocation(resultado)[1]
                if(type == "int"):
                    try:
                        int(readValue)
                        self.virtualMemory.setValue(int(readValue),resultado)
                    except Exception:
                        raise Exception("Input Value invalid, expected int")
                elif(type == "float"):
                    try:
                        float(readValue)
                        self.virtualMemory.setValue(float(readValue),resultado)
                    except Exception:
                        raise Exception("Input Value invalid, expected float")
                elif(type == "color"):
                    if (len(readValue) == 7 and readValue[0] == "#"):
                        for char in readValue[1:]:
                            if( not (char.lower() == 'a' or char.lower() == 'b' or char.lower() == 'c' or char.lower() == 'd' or char.lower() == 'e' or char.lower() == 'f' or char == '0' or char == '1' or char == '2' or char == '3' or char == '4' or char == '5' or char == '6' or char == '7' or char == '8' or char == '9')):
                                raise Exception("Input Value invalid, expected color (#ffffff)")
                        self.virtualMemory.setValue(readValue.lower(),resultado)
                    else:
                        raise Exception("Input Value invalid, expected color (#ffffff)")  
                elif(type == "bool"):
                    if(readValue.lower() == "true"):
                        self.virtualMemory.setValue(True,resultado)
                    elif(readValue.lower() == "false"):
                        self.virtualMemory.setValue(False,resultado)
                    else:
                        raise Exception("Input Value invalid, expected bool")

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
                if(self.Tables[actualFunct]["type"] != "void"):
                    functionVarAdd = self.Tables[actualFunct]["varPosition"]
                    if(self.Tables[actualFunct]["type"]!="void"):
                       self.virtualMemory.setValue(self.virtualMemory.getValue(resultado),functionVarAdd)
                self.QuadCounter = self.CounterStack.pop() ##Regresar al apuntador de quad anterior
                self.virtualMemory.vMemory["Stack"].pop()
                self.CallStack.pop() #Eliminar la función de la pila de llamadas
                self.ParamData.pop()      

            ##########FUNCIONES ESPECIALES
            elif(operador=="openimg"):
                nextQuad = self.Quads[self.QuadCounter+1]
                self.QuadCounter+=1
                imagePath = self.virtualMemory.getValue(izq)
                arrayAdd = resultado
                arrayX = int(nextQuad.OperandoI)
                arrayY = int(nextQuad.OperandoD)
                openImg(imagePath,arrayX,arrayY,arrayAdd,self.virtualMemory)
            elif(operador=="saveimg"):
                nextQuad = self.Quads[self.QuadCounter+1]
                self.QuadCounter+=1
                imagePath = self.virtualMemory.getValue(izq)
                arrayAdd = resultado
                arrayX = int(nextQuad.OperandoI)
                arrayY = int(nextQuad.OperandoD)
                saveImg(imagePath,arrayX,arrayY,arrayAdd,self.virtualMemory)
            elif(operador=="grayscale"):
                nextQuad = self.Quads[self.QuadCounter+1]
                self.QuadCounter+=1
                imagePath = self.virtualMemory.getValue(izq)
                arrayAdd = resultado
                arrayX = int(nextQuad.OperandoI)
                arrayY = int(nextQuad.OperandoD)
                grayscale(imagePath,arrayX,arrayY,arrayAdd,self.virtualMemory)
                
            #Avanzar el cúadruplo
            self.QuadCounter += 1
    
    #Función que recibe dos valores hexadecimales en string (#ff0000) y una operación (+,-)
    #y regresa el resultado de la operación en hexadecimal
    def operacionesHexadecimales(self,hexNumUno, hexNumDos, operador):
        #hex color format: #ff0000 => where #ff(red)00(green),00(blue) = >(255,0,0)
        rValue1 = int(hexNumUno[1:3],16) # Primer par de digitos del codigo hexadecimal correpondientes a "Red" los convierte a entero
        rValue2 = int(hexNumDos[1:3],16)
        gValue1 = int(hexNumUno[3:5],16) # Segundo par de digitos del codigo hexadecimal correpondientes a "Green" los convierte a entero
        gValue2 = int(hexNumDos[3:5],16)
        bValue1 = int(hexNumUno[5:7],16) # Tercer par de digitos del codigo hexadecimal correpondientes a "Blue" los convierte a entero
        bValue2 = int(hexNumDos[5:7],16)

        #Se realiza la operación correspondiente para los valores red, green y blue
        if(operador == "+"):
            nuevoRValueInt = rValue1 + rValue2
            nuevoGValueInt = gValue1 + gValue2
            nuevoBValueInt = bValue1 + bValue2
        elif(operador == "-"):
            nuevoRValueInt = rValue1 - rValue2
            nuevoGValueInt = gValue1 - gValue2
            nuevoBValueInt = bValue1 - bValue2

        #Se verifica que ninguno de los resultados excedan los limites 255 ni 0, si sí, se truncan 
        if(nuevoRValueInt > 255):
            nuevoRValueInt = 255
        elif(nuevoRValueInt < 0):
            nuevoRValueInt = 0

        if(nuevoGValueInt > 255):
            nuevoGValueInt = 255
        elif(nuevoGValueInt < 0):
            nuevoGValueInt = 0

        if(nuevoBValueInt > 255):
            nuevoBValueInt = 255
        elif(nuevoBValueInt < 0):
            nuevoBValueInt = 0
        
        hexRvalue = str(hex(nuevoRValueInt)) #Convierte el valor int a Hexadecimal y posteriormente a string, queda con formato "0xff"
        hexRvalue = hexRvalue[2:] #Se omiten los primeros dos caracteres del string "0xff" => ff
        if(len(hexRvalue) == 1 ): #En caso de que el valor hexadecimal tena un solo caracter (Ej. '7') 
            hexRvalue = "0" + hexRvalue #Se agrega un 0 al principio => '07'
        
        hexGvalue = str(hex(nuevoGValueInt)) 
        hexGvalue = hexGvalue[2:] 
        if(len(hexGvalue) == 1 ):
            hexGvalue = "0" + hexGvalue 
        
        hexBvalue = str(hex(nuevoBValueInt)) 
        hexBvalue = hexBvalue[2:] 
        if(len(hexBvalue) == 1 ):
            hexBvalue = "0" + hexBvalue 
        
        #Se retorna un string con formato hexadecimal #ffffff
        return "#" + hexRvalue + hexGvalue + hexBvalue

    #tipo: [int, float, color]
    def aritmethicExp(self,valorIzq,valorDer,operador,tipo):
        if(tipo == "color"):
                return self.operacionesHexadecimales(valorIzq,valorDer,operador)
        elif(tipo != "color"):        
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
