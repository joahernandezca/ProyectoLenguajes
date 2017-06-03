import sys
from antlr4 import *
from UNMLLexer import UNMLLexer
from UNMLParser import UNMLParser
 
def main(argv):
    input = FileStream(argv[1])
    lexer = UNMLLexer(input)
    stream = CommonTokenStream(lexer)
    parser = UNMLParser(stream)
    tree = parser.compilationUnit()
 
if __name__ == '__main__':
    main(sys.argv)
    #print("Compilation successful")