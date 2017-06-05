//UN Modeling Language 

//Crear una estructura que reciba expresiones (inecuaciones < > >= <= == !=).
//No vamos a tomar funciones y procedimientos.
//Intentar el árbol con Python
//Cuidado con el Spanglish

//Se reciben parametros y variables
//Parametros son datos que se asignan
// TYPE ID = ASIGNACIÓN
//Variable es un parametro que es una inecuación
//Basarnos en los ejemplos de Gusek
//UN Modeling Language 
grammar UNML;

//Simbolo inicial
compilationUnit
	: MODEL LF_BRACE block RG_BRACE ENDMODEL
	| MODEL LF_BRACE RG_BRACE ENDMODEL
	| MODEL lineal_expression ENDMODEL
	; 

block
	: propositions_sequence
	;

propositions_sequence
	:	(proposition)* proposition
	;

proposition
	: (assign_statement)+ (building_block)+ prop_solve
	;

assign_statement
	: VARIBLE VAR_ID  SEMICOLON
	| PARAMETER ID ( ALLOCATE numeric_literal )? SEMICOLON 
	;

inequation_operator
	: GREATER_THAN
	| ASSING
	| MINOR_THAN
	;

numeric_literal
	: (OP=(ADD | MINUS))? numeric_unsing 
	| ID 
	;

numeric_unsing
	: INTEGER
	| REAL
	;


building_block
	: DELIMITER_BEGIN function_statement constrain_statement+ DELIMITER_END
	;

function_statement
	: type_objective ID TWO_POINTS lineal_expression SEMICOLON
	;

constrain_statement
	: CONSTRAIN ID TWO_POINTS lineal_expression COMMA inequation_operator numeric_literal (COMMA inequation_operator numeric_literal)* SEMICOLON
	;

type_objective
	: MAXIMIZE
	| MINIMIZE
	;

short_lineal_exp
	: VAR_ID
	| numeric_literal VAR_ID
	| LF_PAREN (numeric_literal aritmetic_operator numeric_literal)* RG_PAREN VAR_ID 
	| LF_PAREN short_lineal_exp RG_PAREN
	;


lineal_expression
	: short_lineal_exp (lineal_operator short_lineal_exp)*
	| LF_PAREN (numeric_literal aritmetic_operator numeric_literal)* RG_PAREN lineal_operator
	;

lineal_operator
	: ADD
	| MINUS
	;

aritmetic_operator
	: ADD
	| MINUS
	| MULT
	| DIV
	| MOD
	| EXP
	;

numeric_expression
	: LF_PAREN numeric_expression RG_PAREN
	| numeric_literal
	| subscripted_parameters
	| function_reference
	| conditional_expression
	| 
	;

aritmetic_expression
	: LF_PAREN aritmetic_expression RG_PAREN
	| numeric_literal aritmetic_operator numeric_literal (aritmetic_operator aritmetic_expression)*
	| numeric_expression
	| logical_expression
//	| symbolic_expression

	;
//	| indexing_expression
//	| set_expression
//	| logical_expression


//symbolic_expression
//	: function_reference
//	| symbolic_expression '&' symbolic_expression
//	;

//indexing_expression
//	: LF_BRACE ID (COMMA ID)* RG_BRACE
//	;

//set_expression
//	: LF_BRACE (aritmetic_expression (COMMA aritmetic_expression)*)? RG_BRACE
//	;

logical_expression
	: LF_PAREN logical_expression RG_PAREN
	| NOT LF_PAREN ID RG_PAREN
	| NOT LF_PAREN logical_expression RG_PAREN  	
	| LF_PAREN ID inequation_operator ID RG_PAREN
	| LF_PAREN ID logic_operator ID RG_PAREN
	| LF_PAREN logical_expression logic_operator logical_expression RG_PAREN
	;


subscripted_parameters
	: ID LF_SPARE logical_expression (COMMA logical_expression)* SEMICOLON
	| ID LF_SPARE numeric_expression (COMMA numeric_expression)* SEMICOLON
	;

function_reference
	: ABS LF_PAREN numeric_literal RG_PAREN
	| ATAN LF_PAREN numeric_literal RG_PAREN 
	| ATAN LF_PAREN numeric_literal COMMA numeric_literal RG_PAREN 
	| CARD LF_PAREN numeric_literal RG_PAREN
	| CEIL LF_PAREN numeric_literal RG_PAREN
	| COS LF_PAREN numeric_literal RG_PAREN
//	| EXP LF_PAREN numeric_literal RG_PAREN
	| FLOOR LF_PAREN numeric_literal RG_PAREN
	| LENGTH LF_PAREN numeric_literal RG_PAREN
	| LOG LF_PAREN numeric_literal RG_PAREN
	| LOGTEN LF_PAREN numeric_literal RG_PAREN
	| MAXIMIZE LF_PAREN list_of_ids RG_PAREN
	| MINIMIZE LF_PAREN list_of_ids RG_PAREN
	| ROUND LF_PAREN numeric_literal RG_PAREN
	| ROUND LF_PAREN numeric_literal COMMA numeric_literal RG_PAREN
	| SIN LF_PAREN numeric_literal RG_PAREN
	| SQRT LF_PAREN numeric_literal RG_PAREN
	| TAN LF_PAREN numeric_literal RG_PAREN
	| TRUNCT LF_PAREN numeric_literal RG_PAREN
	| UNIFORM LF_PAREN RG_PAREN
	| UNIFORM LF_PAREN numeric_literal COMMA numeric_literal RG_PAREN
	| NORMAL LF_PAREN RG_PAREN
	| NORMAL LF_PAREN numeric_literal COMMA numeric_literal RG_PAREN
	| SUBSTR LF_PAREN numeric_literal COMMA numeric_literal RG_PAREN
	| SUBSTR LF_PAREN numeric_literal COMMA numeric_literal COMMA numeric_literal RG_PAREN
	;

conditional_expression
	: IF logical_expression THEN numeric_expression
	| IF logical_expression THEN numeric_expression ELSE numeric_expression
	;

list_of_ids 
	: ID (COMMA ID)*
	;



logic_operator
	: AND
	| OR
	;
prop_solve
	: SOLVE SEMICOLON
	;

//Comentarios
COMMENT : ('#' ~[\r\n]*  |  '/*' .*? '*/') -> skip;

//Caracteres especiales
SEMICOLON : ';';
ASSING : '=';
ALLOCATE : ':=';
LF_PAREN : '(';
RG_PAREN : ')';
LF_BRACE : '{';
RG_BRACE : '}';
LF_SPARE : '[';
RG_SPARE : ']';
SEPARATOR : 'X~';
COMMA : ',';
TWO_POINTS : ':';
DELIMITER_BEGIN : 'begin';
DELIMITER_END : 'end';


//Palabras reservadas
MODEL : 'MODEL';
ENDMODEL : 'ENDMODEL';
UNION : 'union';
BY : 'by';
CROSS : 'cross';
IN : 'in';
WITHIN : 'within';
DIFF : 'diff';
INTER : 'inter';
SYMDIFF : 'symdiff';
SET : 'set';
VECTOR : 'vector';
MATRIX : 'matrix';
SIMPLEX : 'simplex';
MINIMIZE : 'minimize';
MAXIMIZE : 'maximize';
CONSTRAIN : 'constrain';
SOLVE : 'solve';
VARIBLE : 'var';
PARAMETER : 'param';


INT : 'int';
DOUBLE : 'double';
STRING : 'string';
BOOL : 'boolean';

NULL : 'null';

//Estructuras de control
IF : 'if';
ELSE : 'else';
THEN : 'then';
WHILE : 'while';
BREAK : 'break';
DO : 'do';
FOR : 'for';
SELECT : 'select';
CASE : 'case';

//Operadores relacionales
EQUAL : '==';
DIFFERENT : '!=' | '<>';
GREATER : '>';
MINOR : '<';
GREATER_THAN : '>=';
MINOR_THAN : '<=';

//Operadores lógicos
AND: 'and' | '&&';
OR: 'or' | '||';
NOT : 'not' | '!' ;
TRUE : 'true';
FALSE : 'false';

//Operadores aritméticos
ADD : '+';
MINUS : '-';
MULT : '*';
DIV : '/';
MOD : '%';
EXP : '^' | '**';

//funciones matemáticas
ABS : 'abs';
ATAN : 'atan';
CARD : 'card';
CEIL : 'ceil';
COS : 'cos';
EXP_FUN : 'exp';
FLOOR : 'floor';
LENGTH : 'length';
LOG : 'log';
LOGTEN : 'log10';
//MAX : 'max';
//MIN : 'min';
ROUND : 'round';
SIN : 'sin';
SQRT : 'sqrt';
TAN : 'tan';
TRUNCT : 'trunc';
UNIFORM : 'uniform';
NORMAL : 'normal';
SUBSTR : 'substr';

//Tipos de dato
VAR_ID : [A-Z_][a-zA-Z_0-9]*;
ID : [a-z_][a-zA-Z_0-9]*;
INTEGER : [0-9]+;
REAL :  [0-9]* '.' [0-9]*;
WORD : '"' (~["\r\n] | '""')* '"';
WS : [ \t\r\n] -> skip;
OTHER : .;

