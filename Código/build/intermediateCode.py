from build.NamesTable import *
from SemanticCube import *
from MemoryManager import *
from VirtualMachine import *

namesTable = NamesTable() #Crear instancia del directorio de variables
semanticCube = SemanticCube()

#CLASE QUE CONTIENE LOS DATOS DE LOS CUÁDRUPLOS
class Quad:
    def __init__(self, operador, operandoI, operandoD, resultado):
        self.Operador = operador
        self.OperandoI = operandoI
        self.OperandoD = operandoD
        self.Resultado = resultado
        
        

#CLASE QUE SE ENCARGA DEL MANEJO DE LOS CUÁDRUPLOS Y DEFINICIÓN DE PUNTOS NEURÁLGICOS
class Stack:
    def __init__(self):
        self.Quads = [] #Arreglo de cuádruplos
        self.O = [] #Stack de operadores
        self.Opd = [] #Stack de Operandos
        self.Saltos =  [] #Stack de Saltos
        self.Types = []#Stack de tipos
        self.tempCounter = 1 #Contador de varibles temporales creadas
        self.QuadCounter = 1 #Contará los Cuadruplos
        self.ParamCounter = dict()
        self.Dims=[] #Stack de dimensiones
    
    ############FUNCIONES AUXILIARES#####################
    def addOp(self, operator): #Para adjuntar un operador al stack de operandos
        self.O.append(operator)
    def exitAssign(self): #When assigning generate a unary quad
        self.generateUnaryQuad()
    def removeP(self): #removes parenthesis
        self.O.pop()
    def addOperand(self,name): #adds opperand
        if name in namesTable.globalsT: #Operando must already be defined in global
            #self.Opd.append(name) #Add name to Operand Vector
            self.Opd.append(namesTable.globalsT[name]["dir"]) #Add memory address to Operand Vector
            self.Types.append(namesTable.globalsT[name]["type"]) #Add type to Type Vector            
        elif name in namesTable.actualT:#Or in local
            #self.Opd.append(name) #Add name to Operand Vector
            self.Opd.append(namesTable.functionsT[namesTable.actualFuncName]["locals"][name]["dir"]) #Add memory address to Operand Vector
            self.Types.append(namesTable.actualT[name]) #Add type to Type Vector               
        else:
            raise Exception("Operand '" + name + "' not defined") #display exception
    
    ##Funciones para el manejo de constantes
    def addConstant(self,const):
        type = self.Types.pop()
        self.Types.append(type)
        if(namesTable.constantsT.get(const)):
            self.Opd.append(namesTable.constantsT[const]["dir"])
        else:
            memoryAdd = Memory.assignMemory("Constant",type,1)
            namesTable.constantsT[const] ={"type":type,"dir":memoryAdd}
            self.Opd.append(memoryAdd) 
         
    def addType(self,tipo):
        self.Types.append(tipo)
    

    #####################PUNTOS NEURALGICOS#################################
    
    ##EXPRESIONES

    #expression:  expLogic((SYM_OR | SYM_AND) expLogic)*;
    #expLogic: exp (logic_op exp)?;
    #exp:  term  ((SYM_PLUS | SYM_MINUS) term)*;
    #term:  factor (( SYM_MULT |  SYM_DIV) factor)*;
    #factor:  (SYM_PAREN_OPEN expression SYM_PAREN_CLOSE) | ( (SYM_PLUS|SYM_MINUS)? var_cte );
    
    def exitExpLogic(self): #Cuando se salga de la parser rule "expLogic"
        arrOp = ["||","&&"] # Habrá leido || o && desde expression
        self.auxExit(arrOp) #Manda a llamar a auxExit con los operadores validos

    def exitExp(self): #Cuando se salga de la parser rule "exp"
        arrOp = [">","<","==", ">=", "<=","!="] # Habrá leido un operador booleano desde expLogic
        self.auxExit(arrOp) #Manda a llamar a auxExit con los operadores validos

    def exitTerm(self): #Cuando se salga de la parser rule "term"
        arrOp = ["+","-"] # Habrá leido un + o - desde exp
        self.auxExit(arrOp) #Manda a llamar a auxExit con los operadores validos    
    
    def exitFactor(self): #Cuando se salga de la parser rule "factor"
        arrOp = ["*","/"] # Habrá leido un * o / desde termn
        self.auxExit(arrOp) #Manda a llamar a auxExit con los operadores validos
        
    #funcion Aux usada por exitExpLogic, exitExp, exitTerm y exitFactor
    #manda a generar un cuadrante binario y actualiza los vectores
    def auxExit(self, arrOp):
        if self.O == []:
            return
        while self.O != [] and self.O[len(self.O)-1] in arrOp:
            self.generateBinaryQuad() #genera un Cuadrante Binario
            
            #self.Opd.append("t"+str(self.tempCounter)) #Adjunta una variable temporal con el formato "t2" al vector de operadores
            self.tempCounter+=1 
    ##TERMINA EXPRESIONES

    #####################GENERADORES DE CUÁDRUPLOS#################################
    #format: 4 * A B t3
    def generateBinaryQuad(self):
        derOp = self.Opd.pop()
        izqOp = self.Opd.pop()
        derOpType = self.Types.pop()
        izqOpType = self.Types.pop()
        op = self.O.pop()
        #temp = "t"+str(self.tempCounter)
        tempType = semanticCube.cube[izqOpType][derOpType][op]
        if tempType == None:
            raise Exception(f"Operand '{izqOp}'({izqOpType}) is incompatible with operand '{derOpType}'({derOpType}) with operator: {op}")
        self.Types.append(tempType)
        tempDir = Memory.assignMemory("Temp",tempType,1)
        self.Opd.append(tempDir)
        #print(str(self.QuadCounter)+"- " + op + " " + str(izqOp) + " " + str(derOp) + " " + "t"+str(self.tempCounter))
        self.Quads.append(Quad(op,izqOp,derOp,tempDir))
        self.QuadCounter+=1
    
    #format: 6 = C _ F
    def generateUnaryQuad(self):
        op = self.O.pop()
        result = self.Opd.pop()
        resultType = self.Types.pop()
        asigned = self.Opd.pop()
        asignedType= self.Types.pop()
        tempType = semanticCube.cube[asignedType][resultType][op]
        if tempType == None:
            raise Exception(f"Operand '{asigned}'({asignedType}) is incompatible with operand '{result}'({resultType}) with operator: {op}")
            #self.Types.append(tempType)
        
        self.Quads.append(Quad(op,result,None,asigned))
        self.QuadCounter+=1
    
    #format: 6 print _ _ A
    def generatePrint(self):
        out = self.Opd.pop()
        tipo = self.Types.pop()
        self.Quads.append(Quad("print",None,None,out))
        self.QuadCounter+=1

    #format 6 read _ _ B
    def generateRead(self):
        out = self.Opd.pop()
        tipo = self.Types.pop()
        #print(str(self.QuadCounter) +"- " + "read" + " " + "_" + " " + "_" + " " + out )
        self.Quads.append(Quad("read",None,None,out))
        self.QuadCounter+=1

    #format 2 ERA funcName _ _
    def generateERA(self, fName):
        #print(str(self.QuadCounter)+"- "+fName+ " _ _")
        self.Quads.append(Quad("ERA",fName,None,None))
        self.QuadCounter+=1
        self.ParamCounter[fName] = 0

    #format 2 param paramName _ param1
    def generateParam(self,paramCount):
        paramName = self.Opd.pop()
        paramNum = "param" + str(paramCount)
        #print(str(self.QuadCounter)+"- "+fName+ " _ _")
        self.Quads.append(Quad("param",paramName,None,paramNum))
        self.QuadCounter+=1
 
    #format 2 gosub funcName _ _
    def generateGoSub(self,funcName):
        self.Quads.append(Quad("gosub",funcName,None,None))
        self.QuadCounter+=1

    def getParam(self, fName):
        parameterCounter = self.ParamCounter[fName]
        parameterNumber = namesTable.functionsT[fName]['parNum']
        #If number of given parameters exceed's functions number of expected parameters
        if (parameterCounter > parameterNumber-1):
            raise Exception(f"In function [{fName}]: expected [{parameterNumber}] parameters but more were given")  
        paramName = namesTable.functionsT[fName]["parameters"][parameterCounter]
        paramExpectedType = namesTable.functionsT[fName]["locals"][paramName]["type"]
        paramActualType = self.Types.pop() 
        #Type doesn't match expected parameter type
        if(paramExpectedType != paramActualType):
            raise Exception(f"In function [{fName}], parameter #{parameterCounter}: Expected type [{paramExpectedType}], but [{paramActualType}] were given")
        ##AQUI
        self.generateParam(parameterCounter+1)
        self.ParamCounter[fName]+=1
    
    def exitParams(self,fName):
        parameterCounter = self.ParamCounter[fName] 
        parameterNumber = namesTable.functionsT[fName]['parNum']
        if (parameterCounter < parameterNumber):
            raise Exception(f"In function [{fName}]: expected [{parameterNumber}] parameters but [{parameterCounter}] were given")

    ###GOTOF
    def generateGoToF(self):
        out = self.Opd.pop()
        tipo = self.Types.pop()
        if tipo != "bool":
            raise Exception("La expresión dentro del If debe resultar en bool")
        ###print(str(self.QuadCounter) +"- " + "GOTOF" + " " + out + " " + "_" + " " + "PEND" )
        self.Quads.append(Quad("GOTOF",out,None,"PEND"))
        self.QuadCounter+=1
    ###GOTO
    def generateGoTo(self):
        self.Quads.append(Quad("GOTO",None,None,"PEND"))
        self.QuadCounter+=1
    ##ENDPROC
    def generateEndProc(self):
        self.Quads.append(Quad("ENDPROC",None,None,None))
        self.QuadCounter+=1
        
    ###RELLENADOR DE CUÁDRUPLOS
    def fill(self,quad,position):
        self.Quads[quad-1].Resultado = position

    def enterCondition(self):
        self.Saltos.append(self.QuadCounter)
        self.generateGoToF()
    
    def enterElse(self):  
        salto=self.Saltos.pop()
        self.Saltos.append(self.QuadCounter)
        self.generateGoTo()
        self.fill(salto,self.QuadCounter)        
       
    def exitCondition(self):
        salto = self.Saltos.pop()
        self.fill(salto,self.QuadCounter)

    def enterCicle(self):
        self.Saltos.append(self.QuadCounter-1)
        self.generateGoToF()
        self.Saltos.append(self.QuadCounter-1)

    def exitCicle(self):
        saltoF = self.Saltos.pop()
        saltoInicio = self.Saltos.pop()
        self.generateGoTo()
        self.fill(self.QuadCounter-1,saltoInicio)
        self.fill(saltoF,self.QuadCounter)

    def enterFunc(self):
        namesTable.initLocalT()
        self.tempCounter = 1
        
    def exitFunc(self):
        namesTable.functionsT[namesTable.actualFuncName]["vars"] = self.countVarByTypeScope("Local")
        namesTable.functionsT[namesTable.actualFuncName]["temps"] = self.countVarByTypeScope("Temp")
        namesTable.parameterC = 0
        namesTable.varCnt = 0
        Memory.resetMemory("Local")
        Memory.resetMemory("Temp")
        self.generateEndProc()

    def countVarByTypeScope(self,scope):
        varCount = dict()
        for k in Memory.Directions[scope].keys():
            varCount[k] = Memory.Directions[scope][k]["declared"] 
        return varCount      
    
    def exitMain(self):
        self.Quads.append(Quad("end",None,None,None))
        self.exitFunc()
    
    def initProgram(self):
        self.Saltos.append(1)
        self.generateGoTo()

    #callfunc: TYPE_ID SYM_PAREN_OPEN (expression (SYM_COMMA expression)*)? SYM_PAREN_CLOSE SYM_SEMI_COL;
    def enterCallFunc(self, funcName):
        if funcName in namesTable.functionsT: #Verify that the procedure exists into the DirFunc
            self.generateERA(funcName)
            
        else:            
            raise Exception("Function '" + funcName + "' not defined") #display exception

    def exitCallFunc(self,funcName):
        self.generateGoSub(funcName)
        
    def dimEnter(self,varName):
        if(len(self.Dims)>0):
            front = self.Dims[-1]
            if(front[0] == varName):
                self.Dims.append([varName,front[1]+1])
            else:
                self.Dims.append([varName,1])
        else:
            self.Dims.append([varName,1])
        
        frontName = self.Dims[-1][0]
        frontDim = self.Dims[-1][1]

        limSup = namesTable.functionsT[namesTable.actualFuncName]["locals"][frontName]["dim"][frontDim-1]
        print("VER",self.Opd.pop(),"1",limSup)

    def printQuads(self):
        counter = 1
        for quad in self.Quads:
            #print(counter, quad.Operador, quad.OperandoI, quad.OperandoD, quad.Resultado)
            counter+=1
        tables = {"functions":namesTable.functionsT,"globals":namesTable.globalsT,"constants":namesTable.constantsT}
        virtualMachine = VirtualMachine(self.Quads,tables)
        print(self.Dims)
        ##virtualMachine.run()
        #print(namesTable.globalsT)
        #print(namesTable.constantsT)
        #print(namesTable.functionsT)
        

        
stack = Stack()

