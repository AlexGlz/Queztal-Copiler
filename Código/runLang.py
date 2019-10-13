import sys

from antlr4 import *
from build.QuetzalLexer import QuetzalLexer #Se importa el Léxico generado
from build.QuetzalParser import QuetzalParser #Se importa el Parser generados
from QuetzalSemantic import QuetzalSemantic #Importar el analizador Semántico 



def main():
    filepath = './ejemplos/ejemploC1.txt' #Definir nombre del archivo
    input_stream = FileStream(filepath) 
    lexer = QuetzalLexer(input_stream)
    stream = CommonTokenStream(lexer)
    parser = QuetzalParser(stream)
    tree = parser.program()
    semantic = QuetzalSemantic()
    walker = ParseTreeWalker()
    walker.walk(semantic,tree)
    
    #visitor = QuetzalGrammar()
    
    #return visitor.visit(tree)

if __name__ == '__main__':
    main()