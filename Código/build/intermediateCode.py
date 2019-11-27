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
        self.ParamCounter = []
        self.Dims=[] #Stack de dimensiones
    
    ############FUNCIONES AUXILIARES#####################
    def addOp(self, operator): #Para adjuntar un operador al stack de operandos
        self.O.append(operator)
    def exitAssign(self): #When assigning generate a unary quad
        self.generateUnaryQuad()
    def removeP(self): #removes parenthesis
        self.O.pop()
    def addOperand(self,name): #adds opperand
        if name in namesTable.functionsT:
            raise Exception(f"Cannot use [{name}] function as a varable.")
        if name in namesTable.globalsT: #Operando must already be defined in global
            #self.Opd.append(name) #Add name to Operand Vector
            self.Opd.append(namesTable.globalsT[name]["dir"]) #Add memory address to Operand Vector
            self.Types.append(namesTable.globalsT[name]["type"]) #Add type to Type Vector            
        elif name in namesTable.actualT:#Or in local
            #self.Opd.append(name) #Add name to Operand Vector
            self.Opd.append(namesTable.actualT[name]["dir"]) #Add memory address to Operand Vector
            self.Types.append(namesTable.actualT[name]["type"]) #Add type to Type Vector               
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
        if self.O == [] or self.O[-1] == '(':
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
        self.Quads.append(Quad("read",None,None,out))
        self.QuadCounter+=1

    #format 2 ERA funcName _ _
    def generateERA(self, fName):
        self.Quads.append(Quad("ERA",fName,None,None))
        self.QuadCounter+=1
        self.ParamCounter.append({fName:0})

    #format 2 param paramName _ param1
    def generateParam(self,paramCount):
        paramName = self.Opd.pop()
        paramNum = "param" + str(paramCount)
        self.Quads.append(Quad("param",paramName,None,paramNum))
        self.QuadCounter+=1
 
    #format 2 gosub funcName _ _
    def generateGoSub(self,funcName):
        self.Quads.append(Quad("gosub",funcName,None,None))
        self.QuadCounter+=1

    def generateVer(self, operando, limInf, limSup):
        self.Quads.append(Quad("VER",operando,limInf,limSup))
        self.QuadCounter+=1
    #####################FIN GENERADORES DE CUÁDRUPLOS#################################

    def getParam(self, fName):
        parameterCounter = self.ParamCounter[-1][fName] #Contador actual de los parámetros dados
        parameterNumber = namesTable.functionsT[fName]['parNum'] #Número de parámetos que recibe la función
        #If number of given parameters exceed's functions number of expected parameters
        if (parameterCounter > parameterNumber-1):
            raise Exception(f"In function [{fName}]: expected [{parameterNumber}] parameters but more were given")  
        paramName = namesTable.functionsT[fName]["parameters"][parameterCounter]
        paramExpectedType = namesTable.functionsT[fName]["parameters"][parameterCounter][1]
        paramActualType = self.Types.pop() 
        #Type doesn't match expected parameter type
        if(paramExpectedType != paramActualType):
            raise Exception(f"In function [{fName}], parameter #{parameterCounter}: Expected type [{paramExpectedType}], but [{paramActualType}] were given")
        ##AQUI
        self.generateParam(parameterCounter+1)
        self.ParamCounter[-1][fName]+=1
    
    def exitParams(self,fName):
        parameterCounter = self.ParamCounter[-1][fName] 
        parameterNumber = namesTable.functionsT[fName]['parNum']
        if (parameterCounter < parameterNumber):
            raise Exception(f"In function [{fName}]: expected [{parameterNumber}] parameters but [{parameterCounter}] were given")

    ###GOTOF
    def generateGoToF(self):
        out = self.Opd.pop()
        tipo = self.Types.pop()
        if tipo != "bool":
            raise Exception("La expresión dentro del If debe resultar en bool")
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
    
    ##RETURN PARA VOID
    def generateReturnVoid(self):
        function = namesTable.actualFuncName
        functType = namesTable.functionsT[function]["type"]
        if(functType != "void"): #La función debe de ser Void en este return
             raise Exception(f"Function '{function}' is [{functType}] and returned [void]") #display exception
        self.Quads.append(Quad("RETURN",None,None,None))
        self.QuadCounter+=1
        

    ##RETURN
    def generateReturn(self):
        function = namesTable.actualFuncName
        functType = namesTable.functionsT[function]["type"]
        stackType = self.Types.pop()
        if(functType != stackType): #La función debe de ser Void en este return
            raise Exception(f"Function '{function}' is [{functType}] and returned [{stackType}]")
        operand = self.Opd.pop()
        self.Quads.append(Quad("RETURN",None,None,operand))
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
        print(namesTable.actualT)
        ##ENDPROC SE GENERA EN FUNCIONES QUE NO SON main
        
        if(namesTable.actualFuncName != "main"):
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
        self.ParamCounter.pop()
        if(namesTable.functionsT[funcName]["type"] != "void"): #Si la funcion no es void generar su cúadruplo para el return
            functVarAdd = namesTable.globalsT[funcName]["dir"]
            functVarType = namesTable.globalsT[funcName]["type"]
            
            tempDir = Memory.assignMemory("Temp",functVarType,1)
            self.tempCounter +=1;

            self.O.append("=")
            self.Opd.append(tempDir)
            self.Opd.append(functVarAdd)
            self.Types.append(functVarType)
            self.Types.append(functVarType)
            self.generateUnaryQuad()
            self.Opd.append(tempDir)
            self.Types.append(functVarType)

    ##Funcion para verificar si no se está una función dimensionada como tal
    def checkVarDims(self,varName):
        if(len(namesTable.actualT[varName]["dim"]) != 0):
            raise Exception(f"[{varName}] is an Array")

    ##Inicializar el acceso a una variable dimensionada
    def initDimVar(self,varName):
        self.O.append("(")#Agregar tope a la pila de operadores
        listaDim = namesTable.actualT[varName]["dim"] #lista de dimensiones de la variable
        if(len(listaDim)==0): #Verificar que la variable sea dimensionada
            raise Exception(f"Variable [{varName}] is not an array")
        else:
            self.Dims.append(["(",0]) #Agregar nuevo tope a la pila de dimensiones
            self.Opd.pop() #Eliminar de la pila de operandos la dirección inicial del arreglo ya que luego se sustituirá por la dirección accedidad del arreglo

    ##Saliendo de la variable dimensionada
    def exitDimVar(self,varName):
        self.O.pop()#Eliminar el tope de la pila de operadores
        dimCount = len(namesTable.actualT[varName]["dim"]) #lista de dimensiones de la variable
        #Verificar que las dimensiones accedidas no sean menores a las definidas en la variable
        if(self.Dims[-1][1] != dimCount):
            raise Exception(f"Variable [{varName}]: [{self.Dims[-1][1] }] dimentions accessed but [{dimCount}] were expected.")
        #Remover las dimensiones ya revisadas del stack de dimensiones
        while(self.Dims[-1][0] != "("):
            self.Dims.pop()
        self.Dims.pop() #Eliminar el tope

    ##Al detectar el acceso a un índice
    def dimEnter(self,varName):
       
        #Agrega la dimensión a la pila de dimesiones
        if(len(self.Dims)>0):
            front = self.Dims[-1] #Front guarda la dimensión agregada más recientemente ##PENDIENTE: CHECAR SI SE REPITE EL NOMBRE ARREGLO DENTRO DE SÍ MISMO X[X[]][]
            if(front[0] == varName): #x[1][2]
                self.Dims.append([varName,front[1]+1])
            else: #Ej que cumple la condición x[1][a[1]]
                self.Dims.append([varName,1])
        else:
            self.Dims.append([varName,1]) #Agrega el nombre de la dimension y 1 (X[5] = append("X",1))
            
        
        ##Obtener el nombre de la variable y el número de la dimensión actual de la pila de Dimensiones
        frontName = self.Dims[-1][0]
        frontDim = self.Dims[-1][1] #Número de la dimensión actual

        listaDim = namesTable.actualT[frontName]["dim"]

        if(frontDim > len(listaDim)): #Checa que el número de dimensiones no exceda al número de dimensiones dadas en la definición de la variable
            raise Exception("Variable '" + frontName + "' with "+ str(frontDim) + " Dimensions not defined, " + str(len(listaDim)) + " where expected") #display exception

        print(listaDim)
        
        aux = self.Opd[-1]        

        #print("VER", aux, 0 , listaDim[frontDim-1]["ls"])
        self.generateVer(aux,0,listaDim[frontDim-1]["ls"])
        if(frontDim<len(listaDim)):        
            aux=self.Opd.pop() #Obtiene el index dentro de casilla
            indexType = self.Types.pop() #obtener el típo del índice
            if(indexType != "int"): raise Exception("Index must be int")
            T = Memory.assignMemory("Temp","int",1)
            self.tempCounter+=1
            #print("*",aux,listaDim[frontDim-1]["m"],T)
            #obtener valor constante de M
            #M = generateConstant(...)

            ##Generar u obtener dirección de la constante de la M de la dimensión
            mValue = int(listaDim[frontDim-1]["m"])
            self.Types.append("int")
            self.addConstant(str(mValue))
            self.Types.pop()
            mAdd = self.Opd.pop()
            
            self.Quads.append(Quad("*",aux,mAdd,T))
            self.QuadCounter+=1

            self.Opd.append(T);
            #self.Types.append("int")

        if(frontDim>1):
            aux2 = self.Opd.pop() #SN*MN
            aux1 = self.Opd.pop() #SN+1*MN+1
            
            T = Memory.assignMemory("Temp","int",1)
            self.Opd.append(T)
            #print("+",aux1,aux2,T)
            self.Quads.append(Quad("+",aux1,aux2,T))
            self.QuadCounter+=1

        if(frontDim==len(listaDim)):
            aux = self.Opd.pop() #Valor del índice
            indexType = self.Types.pop() #obtener el típo del índice
            if(indexType != "int"): raise Exception(f"Index must be int, given [{indexType}]")
            T = Memory.assignMemory("Temp","int",1)
            
            ##Generar u obtener dirección de la constante de la dirección inicial del arreglo
            addressValue = namesTable.actualT[frontName]["dir"]
            self.Types.append("int")
            self.addConstant(addressValue)
            self.Types.pop()
            addressLocation = self.Opd.pop()
            

            self.Quads.append(Quad("+",aux,addressLocation,T))
            self.QuadCounter+=1
            self.Opd.append("(" +str(T)+")")
        #print("VER",self.Opd.pop(),"1",limSup)

    ##Código para funciones especiales

    #Función que retorna el registro de la tabla de variables de la variable dada. Además confirma si existe
    def getVarData(self,varName):
        if(varName in namesTable.actualT):
            varData = namesTable.actualT[varName]
        elif(varName in namesTable.globalsT):
            varData = namesTable.globalsT[varName]
        else:
            raise Exception(f"Variable [{varName}] is not defined")
        return varData

    def openimg(self,varName):
        if(True): 
            tagType = self.Types.pop()
            tagAdd = self.Opd.pop()
            varData = self.getVarData(varName)
            vartype = varData["type"]
            varDims = varData["dim"]
            varAdd = varData["dir"]
            if(vartype!="color"):
                raise Exception(f"Expected type [color] but [{vartype}] were given")
            if(len(varDims)!=2):
                raise Exception(f"This function needs [2] dimentions in variable [{varName}] but it has [{len(varDims)}]")
            ##Generar cuádruplos de la función
            self.Quads.append(Quad("openimg",tagAdd,None,varAdd))
            self.Quads.append(Quad("openimgData",varDims[0]["ls"]+1,varDims[1]["ls"]+1,None))
            self.QuadCounter += 2;
        else:
            raise Exception("")

    def saveImg(self,varName):
        tagType = self.Types.pop()
        tagAdd = self.Opd.pop()
        varData = self.getVarData(varName)
        vartype = varData["type"]
        varDims = varData["dim"]
        varAdd = varData["dir"]
        if(vartype!="color"):
            raise Exception(f"Expected type [color] but [{vartype}] were given")
        if(len(varDims)!=2):
            raise Exception(f"[2] dimentions of variable [{varName}] are needed but it has [{len(varDims)}]")
        ##Generar cuádruplos de la función
        self.Quads.append(Quad("saveimg",tagAdd,None,varAdd))
        self.Quads.append(Quad("saveimgData",varDims[0]["ls"]+1,varDims[1]["ls"]+1,None))
        self.QuadCounter += 2;

    def colorReplace(self,image):
        targetColor = self.Opd.pop()
        targetColorType = self.Types.pop();
        actualColor = self.Opd.pop()
        actualColorType = self.Types.pop()
        if(actualColorType != "color"):
            raise Exception(f"In function [colorReplace], parameter [2], expected typge [color] but [{actualColorType}] were given")
        if(targetColorType != "color"):
            raise Exception(f"In function [colorReplace], parameter [3], expected typge [color] but [{targetColorType}] were given")
        varData = self.getVarData(image)
        vartype = varData["type"]
        varDims = varData["dim"]
        varAdd = varData["dir"]
        if(vartype!="color"):
            raise Exception(f"In function [colorReplace], parameter [1], expected type [color] but [{vartype}] were given")
        if(len(varDims)!=2):
            raise Exception(f"In function [colorReplace], [2] dimentions of variable [{image}] are needed but it has [{len(varDims)}]")
        ##Generar cuádruplos de la función
        self.Quads.append(Quad("colorReplace",actualColor,targetColor,varAdd))
        self.Quads.append(Quad("colorReplaceData",varDims[0]["ls"]+1,varDims[1]["ls"]+1,None))
        self.QuadCounter += 2;

    def grayscale(self,image):
        varData = self.getVarData(image)
        vartype = varData["type"]
        varDims = varData["dim"]
        varAdd = varData["dir"]
        if(vartype!="color"):
            raise Exception(f"In function [grayscale], parameter [1], expected type [color] but [{vartype}] were given")
        if(len(varDims)!=2):
            raise Exception(f"In function [grayscale], [2] dimentions of variable [{image}] are needed but it has [{len(varDims)}]")
        ##Generar cuádruplos de la función
        self.Quads.append(Quad("grayscale",varDims[0]["ls"]+1,varDims[1]["ls"]+1,varAdd))
        self.QuadCounter += 1

    def colorFilter(self,image):
        varData = self.getVarData(image)
        vartype = varData["type"]
        varDims = varData["dim"]
        varAdd = varData["dir"]
        keepColor = self.Opd.pop()
        keepColorType = self.Types.pop()
        if(keepColorType!="color"):
            raise Exception("In function [color filter], parameter #[2], expected type [color] but [{keepColorType}] were given")
        if(vartype!="color"):
            raise Exception(f"In function [colorFilter], parameter [1], expected type [color] but [{vartype}] were given")
        if(len(varDims)!=2):
            raise Exception(f"In function [colorFilter], [2] dimentions of variable [{image}] are needed but it has [{len(varDims)}]")
        ##Generar cuádruplos de la función
        self.Quads.append(Quad("colorFilter",keepColor,None,varAdd))
        self.Quads.append(Quad("colorFilterData",varDims[0]["ls"]+1,varDims[1]["ls"]+1,None))
        self.QuadCounter += 2

    def edgeDetection(self,image):
        varData = self.getVarData(image)
        vartype = varData["type"]
        varDims = varData["dim"]
        varAdd = varData["dir"]
        if(vartype!="color"):
            raise Exception(f"In function [edgeDetection], parameter [1], expected type [color] but [{vartype}] were given")
        if(len(varDims)!=2):
            raise Exception(f"In function [edgeDetection], [2] dimentions of variable [{image}] are needed but it has [{len(varDims)}]")
        ##Generar cuádruplos de la función
        self.Quads.append(Quad("edgeDetection",varDims[0]["ls"]+1,varDims[1]["ls"]+1,varAdd))
        self.QuadCounter += 1

    def checkReturn(self,ctx):
        functionName = ctx.getChild(0).getChild(0).getText()
        functionType = namesTable.functionsT[functionName]["type"]
       
        

        if(functionType == "void"):
            raise Exception(f"Function [{functionName}] can not be used in an expression because its a void function");

    def printQuads(self):
        counter = 1
        
        for quad in self.Quads:
            print(counter, quad.Operador, quad.OperandoI, quad.OperandoD, quad.Resultado)
            counter+=1
        tables = {"functions":namesTable.functionsT,"globals":namesTable.globalsT,"constants":namesTable.constantsT}
        
        #print(self.Dims)
        #print(namesTable.globalsT)
        print(namesTable.constantsT)
        namesTable.globalsT["vars"] = self.countVarByTypeScope("Global") #Obtener el conteo de memoria global
        
        virtualMachine = VirtualMachine(self.Quads,tables)

        #print(virtualMachine.virtualMemory.vMemory)

        virtualMachine.run()
        
        #print(virtualMachine.virtualMemory.vMemory)
                
stack = Stack()

