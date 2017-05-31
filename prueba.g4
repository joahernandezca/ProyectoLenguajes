grammar prueba;

//Lista de identificadores
list_of_ids : ID (COMMA ID)* | ;

//Expresiones simples
simple_exp : LF_PAREN simple_exp RG_PAREN | (op=(ADD | MINUS))? term (op2=(ADD| MINUS | O) term)* | term;

//Expresiones compuestas
expression : LF_PAREN expression RG_PAREN | simple_exp op=(EQUAL | DIFFERENT  | MINOR_THAN | GREATER_THAN | MINOR | GREATER) simple_exp
 | LF_PAREN simple_exp RG_PAREN
 | simple_exp
 | NOT expression;

//Definición de variable
variable
 : ID set | ID ;

//Definición de término
term : LF_PAREN term  RG_PAREN | factor (op=(MULT | DIV | MOD | Y | O | EXP) factor)* | NOT term  | factor;

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
 | funct_sent
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

//Selección IF
if_sent : IF cond_bloq (ELSE IF cond_bloq )* (ELSE THEN? bloq )?;

//Expresión a evaluar y bloque de sentencias a ejecutar
cond_bloq : expression THEN? bloq;

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
funcion
 : LF_BRACE propot_sec SEMICOLON RG_BRACE;


COMMENT : ('#' ~[\r\n]*  |  '/*' .*? '*/') -> skip;
O : '||';
Y : '&&';
THEN : 'then';
EQUAL : '==';
DIFFERENT : '!=';
GREATER : '>';
MINOR : '<';
GREATER_THAN : '>=';
MINOR_THAN : '<=';
ADD : '+';
MINUS : '-';
MULT : '*';
DIV : '/';
MOD : '%';
EXP : '^';
NOT : '!';
RETURN : 'return';
INT : 'int';
DOUBLE : 'double';
STRING : 'string';
BOOL : 'boolean';
SEMICOLON : ';';
ASSING : '=';
LF_PAREN : '(';
RG_PAREN : ')';
LF_BRACE : '{';
RG_BRACE : '}';
LF_SPARE : '[';
RG_SPARE : ']';
COMMA : ',';
TWO_POINTS : ':';
TRUE : 'true';
FALSE : 'false';
NULL : 'nnul';
IF : 'if';
ELSE : 'else';
WHILE : 'while';
BREAK : 'break';
DO : 'do';
FOR : 'for';
ID : [a-zA-Z_] [a-zA-Z_0-9]*;
INTEGER : '[0-9]+';
REAL : '[0-9]* '.' [0-9]*';
WS : '[ \t\r\n] -> skip';
OTHER : .;
