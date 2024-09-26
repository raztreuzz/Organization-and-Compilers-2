grammar ConfigD;

// Reglas de entrada
config: statement* EOF;

// Reglas de declaraciones
statement
    : ID '=' INT ';'                  // Asignación de un valor numérico
    | ID '=' BOOLEAN ';'              // Asignación de un valor booleano
    | ID '=' STRING ';'               // Asignación de una cadena
    | ID '=' FILEPATH ';'             // Asignación de una ruta de archivo
    | SET ID '=' STRING ';'           // Definición de una variable de usuario
    | IF '(' condition ')' '{' statement* '}' // Instrucción condicional
    ;

// Definición de tokens
SET     : 'SET' ;
IF      : 'IF' ;
ID      : [a-zA-Z_][a-zA-Z_0-9]* ;  // Identificadores
INT     : [0-9]+ ;                  // Números enteros
BOOLEAN : 'TRUE' | 'FALSE' ;        // Valores booleanos
STRING  : '"' .*? '"' ;              // Cadenas entre comillas
FILEPATH: '/' [a-zA-Z0-9_./]* ;      // Rutas de archivos
condition: ID ;                      // Condiciones simples basadas en variables
WS      : [ \t\r\n]+ -> skip ;      // Espacios en blanco
