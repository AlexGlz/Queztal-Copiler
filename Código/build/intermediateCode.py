from build.NamesTable import *
from SemanticCube import *
import sys

sys.tracebacklimit = 0

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
        self.QuadCounter = 1 #Contará los Cuadruplos´
    
    def addOp(self, operator): #Para adjuntar un operador al stack de operandos
        self.O.append(operator)
    def exitAssign(self): #When assigning generate a unary quad
        self.generateUnaryQuad()
    def removeP(self): #removes parenthesis
        self.O.pop()
    def addOperand(self,name): #adds opperand
        if name in namesTable.globalsT: #Operando must already be defined in global
            self.Opd.append(name) #Add name to Operand Vector
            self.Types.append(namesTable.globalsT[name]) #Add type to Type Vector            
        elif name in namesTable.actualT:#Or in local
            self.Opd.append(name) #Add name to Operand Vector
            self.Types.append(namesTable.actualT[name]) #Add type to Type Vector               
        else:
            raise Exception("Operand '" + name + "' not defined") #display exception

    def addConstant(self,const):
        self.Opd.append(const)     
    def addType(self,tipo):
        self.Types.append(tipo)
    
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
            self.Opd.append("t"+str(self.tempCounter)) #Adjunta una variable temporal con el formato "t2" al vector de operadores
            self.tempCounter+=1 

    #format: 4- * A B t3
    def generateBinaryQuad(self):
        derOp = self.Opd.pop()
        izqOp = self.Opd.pop()
        derOpType = self.Types.pop()
        izqOpType = self.Types.pop()
        op = self.O.pop()
        temp = "t"+str(self.tempCounter)
        tempType = semanticCube.cube[izqOpType][derOpType][op]
        if tempType == None:
            raise Exception(f"Operand '{izqOp}'({izqOpType}) is incompatible with operand '{derOpType}'({derOpType}) with operator: {op}")
        self.Types.append(tempType)
        #print(str(self.QuadCounter)+"- " + op + " " + str(izqOp) + " " + str(derOp) + " " + "t"+str(self.tempCounter))
        self.Quads.append(Quad(op,izqOp,derOp,temp))
        self.QuadCounter+=1
    
    #format: 6- = C _ F
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
    
    #format: 6- print _ _ A
    def generatePrint(self):
        out = self.Opd.pop()
        tipo = self.Types.pop()
        self.Quads.append(Quad("print",None,None,out))
        self.QuadCounter+=1

    #format 6- read _ _ B
    def generateRead(self):
        out = self.Opd.pop()
        tipo = self.Types.pop()
        #print(str(self.QuadCounter) +"- " + "read" + " " + "_" + " " + "_" + " " + out )
        self.Quads.append(Quad("read",None,None,out))
        self.QuadCounter+=1

    def generateGoToF(self):
        out = self.Opd.pop()
        tipo = self.Types.pop()
        if tipo != "bool":
            raise Exception("La expresión dentro del If debe resultar en bool")
        ###print(str(self.QuadCounter) +"- " + "GOTOF" + " " + out + " " + "_" + " " + "PEND" )
        self.Quads.append(Quad("GOTOF",out,None,"PEND"))
        self.QuadCounter+=1
    
    def generateGoTo(self):
        self.Quads.append(Quad("GOTO",None,None,"PEND"))
        self.QuadCounter+=1

    def fill(self,position):
        self.Quads[position-1].Resultado = self.QuadCounter

    def enterCondition(self):
        self.Saltos.append(self.QuadCounter)
        self.generateGoToF()
    
    def enterElse(self):  
        position=self.Saltos.pop()
        self.Saltos.append(self.QuadCounter)
        self.generateGoTo()
        self.fill(position)        
       
    def exitCondition(self):
        position = self.Saltos.pop()
        self.fill(position)

    def printQuads(self):
        #print(self.Types)
        counter = 1
        for quad in self.Quads:
            print(counter, quad.Operador, quad.OperandoI, quad.OperandoD, quad.Resultado)
            counter+=1

stack = Stack()