import sys
from antlr4 import *
from UNMLLexer import UNMLLexer
from UNMLParser import UNMLParser
from UNMLVisitor import UNMLVisitor
from EvalVisitor import EvalVisitor
 
def main(argv):
	if len(argv)>1:
		input = FileStream(argv[1])
	else:
		input = StdinStream()
	lexer = UNMLLexer(input)
	stream = CommonTokenStream(lexer)
	parser = UNMLParser(stream)
	tree = parser.compilationUnit()
	visitor =  EvalVisitor()
	visitor.visit(tree)
 
if __name__ == '__main__':
	main(sys.argv)
	#print("Compilation successful")