class Memory:
    """ANTIGUA DECLARACION DE LAS DIRECCIONES DE MEMORIA
    MemSize = 1000
    Reference={
        MemSize*1:["Global","int"],
        MemSize*2:["Global","float"],
        MemSize*3:["Local","int"],
        MemSize*4:["Local","float"],
        MemSize*5:["Temp","int"],
        MemSize*6:["Temp","float"],
        MemSize*7:["Temp","bool"],
        MemSize*8:["Constant","int"],
        MemSize*9:["Constant","float"]
    }
    Directions={
    "Global":
        {
            "int":{"dir":MemSize*1,"declared":0},
            "float":{"dir":MemSize*2,"declared":0}
        },
    "Local":
        {
            "int":{"dir":MemSize*3,"declared":0},
            "float":{"dir":MemSize*4,"declared":0}
        },
    "Temp":
        {
            "int":{"dir":MemSize*5,"declared":0},
            "float":{"dir":MemSize*6,"declared":0},
            "bool":{"dir":MemSize*7,"declared":0}
        },
    "Constant":
        {
            "int":{"dir":MemSize*8,"declared":0},
            "float":{"dir":MemSize*9,"declared":0},
            "color":{"dir":MemSize*10,"declared":0}
        }
    }"""
    Reference= dict()
    Directions = dict()
    MemSize = 10000000
    counter = 1
    scopes = ["Global","Local","Temp","Constant"]
    types = ["int","float","bool","color","tag"]
    for scope in scopes:
        Directions[scope] = dict()
        for type in types:
            Reference[MemSize*counter] = [scope,type]
            Directions[scope][type] = {"dir":MemSize*counter,"declared":0}
            counter+=1

    @staticmethod
    def assignMemory(scope,type,size):
        direccion = Memory.Directions[scope][type]["dir"] + Memory.Directions[scope][type]["declared"]
        Memory.Directions[scope][type]["declared"] += size
        ##NOT SURE IF THIS GOES HERE
        #if(Memory.Directions[scope][type]["declared"] >= Memory.MemSize):
        #   raise Exception("Stack Overflow")        
        return direccion
    
    @staticmethod
    def resetMemory(scope): #used to clean temps and local variables
        for k in Memory.Directions[scope].keys():
            Memory.Directions[scope][k]["declared"] = 0
