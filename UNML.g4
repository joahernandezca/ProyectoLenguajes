//Simbolo inicial 
compilationUnit 
  : MODEL block ENDMODEL 
  ; 
 
block 
  :  propositions_sequence 
  ; 
 
propositions_sequence 
  :  (proposition)* proposition 
  ; 
 
proposition 
  : numeric_expression 
  | symbolic_expression 
  | indexing_expression 
  | set_expression 
  | logical_expresion 
  | linear_expresion 
  | SOLVE SEMICOLON   
  ; 
 
numeric_expression 
  : LF_PAREN numeric_expression RG_PAREN 
  | numeric_literal 
  | dummy_indices 
  | subscripted_parameters 
  | function_reference 
  | conditional_expression 
  ; 
 
symbolic_expression 
  : function_reference 
  | symbolic_operator 
  ; 
   
indexing_expression 
  : 
  ; 
set_expression 
  : literal set 
  | unsubscripted_set 
  | subscripted_parameters 
  | aritmetic_set 
  | indexing_expression 
  | iterated_set_expression 
  | conditional_set_expression 
  | parenthesized_set_expression 
  ; 
 
logical_expression 
  : LF_PAREN logical_expresion RG_PAREN 
  | NOT LF_PAREN ID RG_PAREN 
  | NOT LF_PAREN logical_expresion RG_PAREN   
  | LF_PAREN ID logic_operator ID RG_PAREN 
  | LF_PAREN logical_expresion logic_operator logical_expresion RG_PAREN 
  ; 
 
 
linear_expresion 
  : 
  ; 
 
numeric_literal 
  : INTEGER 
  | REAL 
  ; 
 
dummy_index 
  : ID 
  ; 
 
subscripted_parameters 
  : ID LF_SPARE numeric_expression (COMMA numeric_expression)* SEMICOLON 
  | ID LF_SPARE logical_expresion (COMMA logical_expresion)* SEMICOLON 
  ; 
 
function_reference 
  : ABS LF_PAREN ID RG_PAREN 
  | ATAN LF_PAREN ID RG_PAREN  
  | ATAN LF_PAREN ID COMMA ID RG_PAREN  
  | CARD LF_PAREN ID RG_PAREN 
  | CEIL LF_PAREN ID RG_PAREN 
  | COS LF_PAREN ID RG_PAREN 
  | EXP LF_PAREN ID RG_PAREN 
  | FLOOR LF_PAREN ID RG_PAREN 
  | LENGTH LF_PAREN ID RG_PAREN 
  | LOG LF_PAREN ID RG_PAREN 
  | LOGTEN LF_PAREN ID RG_PAREN 
  | MAX LF_PAREN list_of_ids RG_PAREN 
  | MIN LF_PAREN list_of_ids RG_PAREN 
  | ROUND LF_PAREN ID RG_PAREN 
  | ROUND LF_PAREN ID COMMA ID RG_PAREN 
  | SIN LF_PAREN ID RG_PAREN 
  | SQRT LF_PAREN ID RG_PAREN 
  | TAN LF_PAREN ID RG_PAREN 
  | TRUNCT LF_PAREN ID RG_PAREN 
  | IRAND LF_PAREN RG_PAREN 
  | UNIFORM LF_PAREN RG_PAREN 
  | UNIFORM LF_PAREN ID COMMA ID RG_PAREN 
  | NORMAL LF_PAREN RG_PAREN 
  | NORMAL LF_PAREN ID COMMA ID RG_PAREN 
  ; 
conditional_expression 
  : IF logical_expresion THEN numeric_expression 
  | IF logical_expresion THEN numeric_expression ELSE numeric_expression 
  ; 
 
list_of_ids  
  : ID (COMMA ID)* 
  ; 
 
aritmetic_operator: 
  | ADD 
  | MINUS 
  | MULT 
  | DIV 
  | MOD 
  | EXP 
  ; 
logic_operator: 
  | AND 
  | OR 
  ; 
 
aritmetic_expression 
  : LF_PAREN aritmetic_expression RG_PAREN 
  | numeric_literal aritmetic_operator numeric_literal 
  ; 
 
//Se reciben parametros y variables 
//Parametros son datos que se asignan 
// TYPE ID = ASIGNACION 
//Variable es un parametro que es una inecuacion 
//Basarnos en los ejemplos de Gusek 
 
 
//Simbolo inicial 
model 
 : MODEL bloq ENDMODEL 
 ; 
 
//Lista de identificadores 
list_of_ids : TYPE ID (COMMA ID)*; 
 
//Seleccion IF 
if_sent : IF cond_bloq (ELSE IF cond_bloq )* (ELSE THEN? bloq )?; 
 
//Expresion a evaluar y bloque de sentencias a ejecutar 
cond_bloq : expression THEN? bloq; 
 
 
 
//Expresiones simples 
simple_exp : LF_PAREN simple_exp RG_PAREN | (op=(ADD | MINUS))? term (op2=(ADD| MINUS | OR) term)* | term; 
 
//Expresiones compuestas 
expression : LF_PAREN expression RG_PAREN | simple_exp op=(EQUAL | DIFFERENT  | MINOR_THAN | GREATER_THAN | MINOR | GREATER) simple_exp 
 | LF_PAREN simple_exp RG_PAREN 
 | simple_exp 
 | NOT expression; 
 
//Definicion de variable 
variable 
 : ID set | ID ; 
 
//Definicion de termino 
term : LF_PAREN term  RG_PAREN | factor (op=(MULT | DIV | MOD | AND | OR | EXP) factor)* | NOT term  | factor; 
 
//Definicion de factor 
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
 
//Lista de parametros 
param_list : LF_PAREN (expression | variable | ID) (COMMA (expression | variable | ID ))* RG_PAREN | LF_PAREN RG_PAREN ; 
 
//Definicion de conjunto 
set : LF_BRACE (expression (COMMA expression )*)? RG_BRACE ; 
 
//Identificador de tipo de retorno 
type : INT | DOUBLE | STRING | BOOL; 
 
//Bloque 
bloq : LF_BRACE RG_BRACE | LF_BRACE propot_sec RG_BRACE ; 
 
//Secuenciacion 
propot_sec : (propot)* propot; 
 : ID set_expression | ID ; 
 
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
 | ID param_list  SEMICOLON //Llamar funcion o procedimiento 
 | LF_BRACE propot_sec RG_BRACE 
 | OTHER {System.err.println("Caracter desconocido: " + $OTHER.text);} 
 ; 
set_expression : LF_BRACE (expression (COMMA expression )*)? RG_BRACE ; 
 
//Modo de asignacion 
assigment : ID ASSING expression #asigNum 
 | ID ASSING set #asigVec ; 
 
 
 
//Iteracion WHILE 
while_sent : WHILE cond_bloq ; 
 
//Iteracion DO WHILE 
do_while_sent : DO bloq  WHILE expression ; 
 
//Seleccion SWITCH 
seleccionar_senten : SELECCIONAR ID LF_BRACE casos RG_BRACE ; 
 
//Bloque de casos del SWITCH 
casos : CASO expression TWO_POINTS propot_sec (BREAK SEMICOLON)? casos     #casosGen 
| DEFECTO TWO_POINTS propot_sec #casosDef ; 
 
//Iteracion FOR 
for : FOR assigment (COMMA assigment )* SEMICOLON expression SEMICOLON assigment (COMMA assigment )* bloq 
 | FOR LF_PAREN assigment (COMMA assigment)* SEMICOLON expression SEMICOLON assigment (COMMA assigment )* RG_PAREN bloq ; 
 
//Funcion 
funct_sent : DEF type ID LF_PAREN list_of_ids RG_PAREN bloq ; 
 
//Procedimiento 
proc_sent : DEF ID LF_PAREN list_of_ids RG_PAREN bloq ; 
 
//Sentencias de funcion 
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
SET_ASSING : ':='; 
LF_PAREN : '('; 
RG_PAREN : ')'; 
LF_BRACE : '{'; 
@@ -161,9 +161,9 @@ OTHER : .;
 
//Palabras reservadas 
MODEL : 'MODEL'; 
END : 'ENDMODEL'; 
ENDMODEL : 'ENDMODEL'; 
UNION : 'union'; 
BY : 'by' 
BY : 'by'; 
CROSS : 'cross'; 
IN : 'in'; 
WITHIN : 'within'; 
@@ -219,6 +219,27 @@ DIV : '/';
MOD : '%'; 
EXP : '^' | '**'; 
 
//funciones matematicas 
ABS : 'abs'; 
ATAN : 'atan'; 
CARD : 'card'; 
CEIL : 'ceil'; 
COS : 'cos'; 
EXP_FUN : 'exp'; 
FLOOR : 'floor';; 
LENGTH : 'length'; 
LOG : 'log'; 
LOGTEN : 'log10'; 
MAX : 'max'; 
MIN : 'min'; 
ROUND : 'round'; 
SIN : 'sin'; 
SQRT : 'sqrt'; 
TAN : 'tan'; 
TRUNCT : 'trunc'; 
UNIFORM : 'uniform'; 
NORMAL : 'normal'; 
 
//Tipos de dato 
SIGN : '-' | '+'; 
CHAR : [a-zA-Z]; 
@@ -227,4 +248,3 @@ ID : [a-zA-Z_] [a-zA-Z_0-9]*;
INTEGER : SIGN? [0-9]+; 
REAL : SIGN* [0-9]* '.' [0-9]* ([eE] [+-]? [0-9]+)?; 
WORD : '"' (~["\r\n] | '""')* '"'; 