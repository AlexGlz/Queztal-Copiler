from MemoryManager import *

class NamesTable():
    def __init__(self):
        self.functionsT = dict()
        self.globalsT = dict()
        self.actualT = None
        self.parameterC = 0
        self.actualFuncName = ""
        self.varCnt = 0
        self.constantsT = dict()
        self.dimensions = []
        self.actualR = 1
    
    def addFunction(self,newFunct,type,position): #function to register a newFunction
        if newFunct in self.functionsT or newFunct in self.globalsT: #checks if name of function already exists in functinosT or in globalsT
            raise Exception("Function '" + newFunct + "' already exists") #display exception
        else:
            self.functionsT[newFunct] = {}
            self.functionsT[newFunct]["type"] = type #add function to functionsT
            self.functionsT[newFunct]["position"] = position
            self.functionsT[newFunct]["parameters"] = []
            self.functionsT[newFunct]["locals"] = dict()
            self.actualFuncName = newFunct
            return True
    def addDimension(self,dimSize):
        dimSize = int(dimSize)
        self.dimensions.append({"ls":dimSize-1,"m":1})
        self.actualR = self.actualR * dimSize
    
    def dimentionDef(self):
        print(self.actualR)
        suma = 0
        for i in range(0,len(self.dimensions)):
            self.dimensions[i]["m"] = self.actualR/(self.dimensions[i]["ls"]+1)
            self.actualR= self.dimensions[i]["m"]
        

        

    def addLocalVar(self,newVar,type): #function to register a new Local Variable
        if self.actualT == None: self.actualT = dict() 
        if (newVar in self.actualT) or (newVar in self.globalsT) or (newVar in self.functionsT): #checks if name of is not already defined in local, global context or as a name of a function
            raise Exception("Variable '" + newVar + "' already defined") #display exception
        else:
            virtualAdd = Memory.assignMemory("Local",type,1)
            self.dimentionDef()
            self.functionsT[self.actualFuncName]["locals"][newVar] = {"type":type,"dir":virtualAdd,"dim":self.dimensions}
            self.dimensions = []
            self.actualR = 1
            self.actualT[newVar] = type #add function to local actualT
            return True

    def addGlobalVar(self,newVar,type):
#function to register a ne
        if (newVar in self.globalsT or newVar in self.functionsT):
            raise Exception("Variable '" + newVar + "' already defined")
        else:
            memLocation = Memory.assignMemory("Global",type,1)
            self.dimentionDef()
            self.globalsT[newVar] = {"type":type,"dir":memLocation,"dim":self.dimensions}
            self.dimensions = []
            return True

    #Identifica el contexto actual de la creación de variables, posteriormente guarda la variable como local
    #o global según sea el caso
    def addVar(self,newVar,type):
        if self.actualT == None:
            self.addGlobalVar(newVar,type)
        else:
            self.addLocalVar(newVar,type)
            self.varCnt +=1
    
    def addParameter(self,newVar,type):
        self.addVar(newVar,type)
        self.parameterC += 1
        self.functionsT[self.actualFuncName]["parameters"].append(newVar)

    def exitParams(self):
        self.functionsT[self.actualFuncName]["parNum"] = self.parameterC
        

    #Inicializa la tabla de variables locales
    def initLocalT(self):
        self.actualT = dict()
        self.parameterC = 0

