class NamesTable():
    def __init__(self):
        self.functionsT = dict()
        self.globalsT = dict()
        self.actualT = None
    
    def addFunction(self,newFunct,type): #function to register a newFunction
        if newFunct in self.functionsT or newFunct in self.globalsT: #checks if name of function already exists in functinosT or in globalsT
            raise Exception("Function '" + newFunct + "' already exists") #display exception
        else:
            self.functionsT[newFunct] = type #add function to functionsT
            return True
        

    def addLocalVar(self,newVar,type): #function to register a new Local Variable
        if self.actualT == None: self.actualT = dict() 
        if (newVar in self.actualT) or (newVar in self.globalsT) or (newVar in self.functionsT): #checks if name of is not already defined in local, global context or as a name of a function
            raise Exception("Variable '" + newVar + "' already defined") #display exception
        else:
            self.actualT[newVar] = type #add function to local actualT
            return True

    def addGlobalVar(self,newVar,type):
#function to register a ne
        if (newVar in self.globalsT or newVar in self.functionsT):
            raise Exception("Variable '" + newVar + "' already defined")
        else:
            self.globalsT[newVar] = type
            return True

    #Identifica el contexto actual de la creación de variables, posteriormente guarda la variable como local
    #o global según sea el caso
    def addVar(self,newVar,type):
        if self.actualT == None:
            self.addGlobalVar(newVar,type)
        else:
            self.addLocalVar(newVar,type)

    #Inicializa la tabla de variables locales
    def initLocalT(self):
        self.actualT = dict()

