//UN Modeling Language 
grammar UNML;

//Crear una estructura que reciba expresiones (inecuaciones < > >= <= == !=).
//No vamos a tomar funciones y procedimientos.
//Intentar el árbol con Python
//Cuidado con el Spanglish

//Se reciben parametros y variables
//Parametros son datos que se asignan
// TYPE ID = ASIGNACIÓN
//Variable es un parametro que es una inecuación
//Basarnos en los ejemplos de Gusek


//Símbolo inicial
model
 : MODEL bloq ENDMODEL
 ;

//Lista de identificadores
list_of_ids : TYPE ID (COMMA ID)*;

//Selección IF
if_sent : IF cond_bloq (ELSE IF cond_bloq )* (ELSE THEN? bloq )?;

//Expresión a evaluar y bloque de sentencias a ejecutar
cond_bloq : expression THEN? bloq;



//Expresiones simples
simple_exp : LF_PAREN simple_exp RG_PAREN | (op=(ADD | MINUS))? term (op2=(ADD| MINUS | OR) term)* | term;

//Expresiones compuestas
expression : LF_PAREN expression RG_PAREN | simple_exp op=(EQUAL | DIFFERENT  | MINOR_THAN | GREATER_THAN | MINOR | GREATER) simple_exp
 | LF_PAREN simple_exp RG_PAREN
 | simple_exp
 | NOT expression;

//Definición de variable
variable
 : ID set | ID ;

//Definición de término
term : LF_PAREN term  RG_PAREN | factor (op=(MULT | DIV | MOD | AND | OR | EXP) factor)* | NOT term  | factor;

//Definición de factor
factor
 : INTEGER
 | REAL
 | STRING
 | NULL
 | variable
 | ID param_list?
 | ID (LF_SPARE factor RG_SPARE)+
 | ID
 | NOT factor
 | TRUE
 | FALSE
 | set
 | LF_PAREN expression RG_PAREN
 ;

//Lista de parámetros
param_list : LF_PAREN (expression | variable | ID) (COMMA (expression | variable | ID ))* RG_PAREN | LF_PAREN RG_PAREN ;

//Definición de conjunto
set : LF_BRACE (expression (COMMA expression )*)? RG_BRACE ;

//Identificador de tipo de retorno
type : INT | DOUBLE | STRING | BOOL;

//Bloque
bloq : LF_BRACE RG_BRACE | LF_BRACE propot_sec RG_BRACE ;

//Secuenciación
propot_sec : (propot)* propot;

//Conjunto de posibles sentencias
propot : RETURN expression SEMICOLON
 | funct_sent   //ya podriamos quitar las funciones y procedimientos
 | proc_sent
 | if_sent
 | seleccionar_senten
 | while_sent
 | for
 | do_while_sent
 | assigment  SEMICOLON
 | ID param_list  SEMICOLON //Llamar función o procedimiento
 | LF_BRACE propot_sec RG_BRACE
 | OTHER {System.err.println("Caracter desconocido: " + $OTHER.text);}
 ;

//Modo de asignación
assigment : ID ASSING expression #asigNum
 | ID ASSING set #asigVec ;



//Iteración WHILE
while_sent : WHILE cond_bloq ;

//Iteración DO WHILE
do_while_sent : DO bloq  WHILE expression ;

//Selección SWITCH
seleccionar_senten : SELECCIONAR ID LF_BRACE casos RG_BRACE ;

//Bloque de casos del SWITCH
casos : CASO expression TWO_POINTS propot_sec (BREAK SEMICOLON)? casos     #casosGen
| DEFECTO TWO_POINTS propot_sec #casosDef ;

//Iteración FOR
for : FOR assigment (COMMA assigment )* SEMICOLON expression SEMICOLON assigment (COMMA assigment )* bloq
 | FOR LF_PAREN assigment (COMMA assigment)* SEMICOLON expression SEMICOLON assigment (COMMA assigment )* RG_PAREN bloq ;

//Función
funct_sent : DEF type ID LF_PAREN list_of_ids RG_PAREN bloq ;

//Procedimiento
proc_sent : DEF ID LF_PAREN list_of_ids RG_PAREN bloq ;

//Sentencias de función
function : LF_BRACE propot_sec SEMICOLON RG_BRACE;

//Minimize
minimize : param_list;
                                 //creo que param_list no nos va a recibir funcions del tipo x+y+z.....*....>><< numero, x+y+z.....*....>><< numero
//Maximize
maximize : param_list;

//Restrictions
restriction : ID simple_exp op=( MINOR_THAN | GREATER_THAN | MINOR | GREATER) simple_exp

//Var
var : VAR ID expresion;
                            //las dos tienen la misma forma, asi que parecen equivalentes cunado deberian diferenciarce
//Parameter

param : PARAM ID expresion;


//Comentarios
COMMENT : ('#' ~[\r\n]*  |  '/*' .*? '*/') -> skip;

//Caracteres especiales
SEMICOLON : ';';
ASSING : '=';
PARAMETER_ASSING : ':='
LF_PAREN : '(';
RG_PAREN : ')';
LF_BRACE : '{';
RG_BRACE : '}';
LF_SPARE : '[';
RG_SPARE : ']';
COMMA : ',';
TWO_POINTS : ':';
WS : [ \t\r\n] -> skip;
OTHER : .;

//Palabras reservadas
MODEL : 'MODEL';
END : 'ENDMODEL';
UNION : 'union';
BY : 'by'
CROSS : 'cross';
IN : 'in';
WITHIN : 'within';
DIFF : 'diff';
INTER : 'inter';
SYMDIFF : 'symdiff';
SET : 'set';
MINIMIZE : 'minimize';
MAXIMIZE : 'maximize';
REST : 'restriction';
SOLVE : 'solve';
VARIBLE : 'var';
PARAMETER : 'param';
RETURN : 'return';
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

//Tipos de dato
SIGN : '-' | '+';
CHAR : [a-zA-Z];
DIGIT : [0-9];
ID : [a-zA-Z_] [a-zA-Z_0-9]*;
INTEGER : SIGN? [0-9]+;
REAL : SIGN* [0-9]* '.' [0-9]* ([eE] [+-]? [0-9]+)?;
WORD : '"' (~["\r\n] | '""')* '"';
