grammar ConfigA;

// Reglas sintácticas
config : (statement ';')* EOF ;

statement : ID '=' INT ;

// Reglas léxicas
ID  : [a-zA-Z_][a-zA-Z_0-9]* ;
INT : [0-9]+ ;
WS  : [ \t\r\n]+ -> skip ;
