from build.QuetzalParser import QuetzalParser
from build.QuetzalParser import stack
from build.QuetzalListener import QuetzalListener
from NamesTable import NamesTable

namesTable = NamesTable()
bGlobalsDeclared = False

class QuetzalSemantic(QuetzalListener):
     # Enter a parse tree produced by QuetzalParser#program.
    def enterProgram(self, ctx:QuetzalParser.ProgramContext):         
        pass

    # Exit a parse tree produced by QuetzalParser#program.
    def exitProgram(self, ctx:QuetzalParser.ProgramContext):
        pass
        

     # Enter a parse tree produced by QuetzalParser#main.
    def enterMain(self, ctx:QuetzalParser.MainContext):
        namesTable.actualT = dict() #Inicializa el Directorio de variables de la funcion Main
        pass

    # Exit a parse tree produced by QuetzalParser#main.
    def exitMain(self, ctx:QuetzalParser.MainContext):
        pass
    
    # Enter a parse tree produced by QuetzalParser#variables.
    def enterVariables(self, ctx:QuetzalParser.VariablesContext):
        sType = ctx.types().getText()
        for sID in ctx.TYPE_ID():
            if namesTable.actualT == None:
                namesTable.addGlobalVar(sID.getText(),sType)
            else: 
                namesTable.addLocalVar(sID.getText(),sType)
            
        

    # Exit a parse tree produced by QuetzalParser#variables.
    def exitVariables(self, ctx:QuetzalParser.VariablesContext):     
        pass
    
    # Enter a parse tree produced by QuetzalParser#function.
    #function: TK_FUNC (types | TK_VOID) TYPE_ID SYM_PAREN_OPEN 
    #(types TYPE_ID (SYM_COMMA types TYPE_ID)*)? SYM_PAREN_CLOSE SYM_CURLY_BRACK_OPEN variables?
    #statute* SYM_CURLY_BRACK_CLOSE;
    def enterFunction(self, ctx:QuetzalParser.FunctionContext):
        arrID = [] #Arreglo que guardará todos los IDs presentes en la función 
        arrTypes = [] #Arreglo que guardará todos los types presentes en la función
        #Obtiene el arreglo de IDs Dados leyendo los "TYPE_ID"
        for x in ctx.TYPE_ID():
            arrID.append(x.getText())
        #Obtiene el arreglo de todos los tipos leídos en la regla leyendo los "types"
        for x in ctx.types():
            arrTypes.append(x.getText())        
        #Asigna el tipo del valor que retorna la función y lo asigna en functionType, 
        #ya sea void o no void (int, float...)
        functionType = ""
        if ctx.TK_VOID(): #Si existe TL_VOID es porque la función esta definida como void
            functionType = "void"
        else:
            functionType = arrTypes.pop(0) #Se hace pop porque el primer "types" que aparece corresponde 
                                           #a lo que retorna la función ya guardada el tipo de la función, 
                                           #ya no se necesita ese "types"        
        functionName = arrID.pop(0) #Se guarda el nombre de la función, el cual corresponde al primer 
                                    #"TYPE_ID" se le hace pop porque ya no se necesita 
        namesTable.addFunction(functionName,functionType) #Se registra el nombre de la función junto 
                                                          #con su tipo a través del método addFunction 
                                                          #en la clase NamesTable    
        for x in arrID:
            namesTable.addLocalVar(x,arrTypes.pop(0)) #Se registra el nombre y tipo de todas las variables 
                                                       #locales a través del método addLocalVar de la clase 
                                                       #NamesTable
        

    # Exit a parse tree produced by QuetzalParser#function.
    def exitFunction(self, ctx:QuetzalParser.FunctionContext):
        #print(namesTable.actualT)
        namesTable.clearLocalT()
        #print("Exit function")
        #pass

        
    # Enter a parse tree produced by QuetzalParser#exp.
    def enterExp(self, ctx:QuetzalParser.ExpContext):
        stack = []
        buffer = ctx.getChildren()
        for token in buffer:
            #print(token in ctx.term())
            ##print(token.getText())
            if token in ctx.term():
                stack +=  self.enterTerm(token)
                #if len(stack)>0:
                    #print(stack[len(stack)-1])
            if token in ctx.SYM_PLUS():
                stack.append("+")
        #print(stack)


        
        

    # Exit a parse tree produced by QuetzalParser#exp.
    def exitExp(self, ctx:QuetzalParser.ExpContext):
        pass

    # Enter a parse tree produced by QuetzalParser#term.
    def enterTerm(self, ctx:QuetzalParser.TermContext):
        stack = []
        buffer = ctx.getChildren()
        for token in buffer:
            if token in  ctx.SYM_MULT():
                stack.append("*")
        return stack

    # Exit a parse tree produced by QuetzalParser#term.
    def exitTerm(self, ctx:QuetzalParser.TermContext):
        pass

