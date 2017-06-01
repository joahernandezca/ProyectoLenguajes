//UN Modeling Language
grammar UNML; //Le podemos poner el nombre del programa ya

//Initial symbol
model
 : MODEL bloq ENDMODEL
 ;

//List of ID's
list_of_ids : ID (COMMA ID)* | ;

//Simple expressions
simple_exp : LF_PAREN simple_exp RG_PAREN | (op=(ADD | MINUS))? term (op2=(ADD| MINUS | OR) term)* | term;

//Compound expression
expression : LF_PAREN expression RG_PAREN | simple_exp op=(EQUAL | DIFFERENT  | MINOR_THAN | GREATER_THAN | MINOR | GREATER) simple_exp
 | LF_PAREN simple_exp RG_PAREN
 | simple_exp
 | NOT expression;

//Variable definition
variable
 : ID set | ID ;

//Term definition
term : LF_PAREN term  RG_PAREN | factor (op=(MULT | DIV | MOD | AND | OR | EXP) factor)* | NOT term  | factor;

//Factor definition
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

//List of parameters
param_list : LF_PAREN (expression | variable | ID) (COMMA (expression | variable | ID ))* RG_PAREN | LF_PAREN RG_PAREN ;

//Set definition
set : LF_BRACE (expression (COMMA expression )*)? RG_BRACE ;

//Type of return
type : INT | DOUBLE | STRING | BOOL;

//Bloq
bloq : LF_BRACE RG_BRACE | LF_BRACE propot_sec RG_BRACE ;

//Secuenciation
propot_sec : (propot)* propot;

//Possible sentences
propot : RETURN expression SEMICOLON
 | if_sent
 | while_sent
 | for
 | do_while_sent
 | assigment  SEMICOLON
 | ID param_list  SEMICOLON //Llamar función o procedimiento
 | LF_BRACE propot_sec RG_BRACE
 | OTHER {System.err.println("Caracter desconocido: " + $OTHER.text);}
 ;

//Assigment mode
assigment : ID ASSING expression #asigNum
 | ID ASSING set #asigVec ;

//Parameter assigment
parameter_assigment : ID PARAMETER_ASSING param ;

//If condition
if_sent : IF cond_bloq (ELSE IF cond_bloq )* (ELSE THEN? bloq )?;

//Conditional bloq
cond_bloq : expression THEN? bloq;

//While iteration
while_sent : WHILE cond_bloq ;

//Do while iteration
do_while_sent : DO bloq  WHILE expression ;

//For iteration
for : FOR assigment (COMMA assigment )* SEMICOLON expression SEMICOLON assigment (COMMA assigment )* bloq
 | FOR LF_PAREN assigment (COMMA assigment)* SEMICOLON expression SEMICOLON assigment (COMMA assigment )* RG_PAREN bloq ;

//Sentencias de función
function : LF_BRACE propot_sec SEMICOLON RG_BRACE;

//Minimize
minimize : param_list;   //creo que param_list no nos va a recibir funcions del tipo x+y+z.....*....>><< numero, x+y+z.....*....>><< numero

//Maximize
maximize : param_list;

//Restrictions
restriction : ID simple_exp op=( MINOR_THAN | GREATER_THAN | MINOR | GREATER) simple_exp;

//Var
var : VARIABLE ID expression;
                            //las dos tienen la misma forma, asi que parecen equivalentes cunado deberian diferenciarce
//Parameter
param : PARAMETER ID expression;

//Comments
COMMENT : ('#' ~[\r\n]*  |  '/*' .*? '*/') -> skip;

//Special characters
SEMICOLON : ';';
ASSING : '=';
PARAMETER_ASSING : ':=';
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

//Reserved words
MODEL : 'MODEL';
ENDMODEL : 'ENDMODEL';
SET : 'set';
SIMPLEX : 'simplex';
MINIMIZE : 'minimize';
MAXIMIZE : 'maximize';
RESTRICTION : 'rest';
SOLVE : 'solve';
VARIABLE : 'var';
PARAMETER : 'param';
RETURN : 'return';
INT : 'int';
DOUBLE : 'double';
STRING : 'string';
BOOL : 'boolean';
NULL : 'null';

//control structures
IF : 'if';
ELSE : 'else';
THEN : 'then';
WHILE : 'while';
BREAK : 'break';
DO : 'do';
FOR : 'for';
SELECT : 'select';
CASE : 'case';

//Relational operators
EQUAL : '==';
DIFFERENT : '!=' | '<>';
GREATER : '>';
MINOR : '<';
GREATER_THAN : '>=';
MINOR_THAN : '<=';

//Logic operators
AND: 'and' | '&&';
OR: 'or' | '||';
NOT : 'not' | '!' ;
TRUE : 'true';
FALSE : 'false';

//Aritmetic operators
ADD : '+';
MINUS : '-';
MULT : '*';
DIV : '/';
MOD : '%';
EXP : '^' | '**';

//Data types
SIGN : '-' | '+';
CHAR : [a-zA-Z];
DIGIT : [0-9];
ID : [a-zA-Z_] [a-zA-Z_0-9]*;
INTEGER : SIGN? [0-9]+;
REAL : SIGN* [0-9]* '.' [0-9]* ([eE] [+-]? [0-9]+)?;
WORD : '"' (~["\r\n] | '""')* '"';
