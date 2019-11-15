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
        self.virtualMemory = VirtualMemory(tables["globals"],tables["constants"])
        self.Quads = quads
        mainVars = tables["functions"]["main"]["vars"]
        mainTemps =tables["functions"]["main"]["temps"]
        self.virtualMemory.ERA({"Local":mainVars,"Temp":mainTemps})
        
    def run(self):
        for quad in self.Quads:
            operador = quad.Operador
            izq = quad.OperandoI
            der = quad.OperandoD
            resultado = quad.Resultado
            if(operador == "="):
                self.virtualMemory.setValue(self.virtualMemory.getValue(izq),resultado)
            elif(operador=="+" or operador=="-"or operador=="*" or operador=='/'): 
                izqVal = self.virtualMemory.getValue(izq)
                derVal = self.virtualMemory.getValue(der)
                valor = self.aritmethicExp(izqVal,derVal,operador)
                self.virtualMemory.setValue(valor,resultado)
            elif(operador=="print"):
                print(self.virtualMemory.getValue(resultado))

    def aritmethicExp(self,valorIzq,valorDer,operador):
        if(operador == "+"):
            return valorIzq + valorDer
        elif (operador == "-"):
            return valorIzq - valorDer
        elif (operador == "*"):
            return valorIzq * valorDer
        elif (operador == "/"):
            return valorIzq / valorDer