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
        index = address%Memory.MemSize
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
        else:
            return valor

    def setValue(self,value,address):
        index = address%Memory.MemSize
        location = self.getLocation(address)
        scope = location[0]
        type = location[1]
        if(scope == "Global" or scope == "Constant"):
            self.vMemory[scope][type][index] = value
        else:
            self.vMemory["Stack"][-1][scope][type][index] = value #El -1 permite acceder al último elemento del stack

    
    def initializeMemBlock(self,size):
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
