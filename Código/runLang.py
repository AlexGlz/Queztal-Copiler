from antlr4 import *
from build.QuetzalLexer import QuetzalLexer #Se importa el Léxico generado
from build.QuetzalParser import QuetzalParser #Se importa el Parser generados
#from QuetzalSemantic import QuetzalSemantic #Importar el analizador Semántico 

from antlr4.error.ErrorListener import ErrorListener
import sys

sys.tracebacklimit = 100

class CustomErrorListener(ErrorListener):

    def init(self):
        super(CustomErrorListener, self).init()

    def syntaxError(self, recognizer, offendingSymbol, line, column, msg, e):
        message = 'In line {0}, column {1}: {2}'.format(
            line, column, msg)
        raise Exception(message)

def main():
    filepath = './ejemplos/ejemploC1.txt' #Definir nombre del archivo
    input_stream = FileStream(filepath) 
    lexer = QuetzalLexer(input_stream)
    stream = CommonTokenStream(lexer)
    parser = QuetzalParser(stream)
    parser._listeners = [CustomErrorListener()]
    lexer._listeners = [CustomErrorListener()]
    tree = parser.program()
    #semantic = QuetzalSemantic()
    #walker = ParseTreeWalker()
    #walker.walk(semantic,tree)
    
    #visitor = QuetzalGrammar()
    #return visitor.visit(tree)

if __name__ == '__main__':
    main()