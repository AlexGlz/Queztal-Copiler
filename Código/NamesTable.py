class NamesTable():
    def __init__(self):
        self.functionsT = dict()
        self.globalsT = dict()
        self.actualT = None
    
    def addFunction(self,newFunct,type):
        if newFunct in self.functionsT or newFunct in self.globalsT:
            raise Exception("Function '" + newFunct + "' already exists")
        else:
            self.functionsT[newFunct] = type
            return True
        

    def addLocalVar(self,newVar,type):
        if self.actualT == None: self.actualT = dict()
        if (newVar in self.actualT) or (newVar in self.globalsT) or (newVar in self.functionsT):
            raise Exception("Variable '" + newVar + "' already defined")
        else:
            self.actualT[newVar] = type
            return True

    def addGlobalVar(self,newVar,type):
        if (newVar in self.globalsT or newVar in self.functionsT):
            raise Exception("Variable '" + newVar + "' already defined")
        else:
            self.globalsT[newVar] = type
            return True

    def clearLocalT(self):
        self.actualT = dict()

