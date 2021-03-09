lexer grammar RegrasLexicas;


ALGORITMO: 'algoritmo';
DOCUMENTACAO_DO_ALGORITMO: 'documentação_do_algoritmo';
DECLARE:'declare';
DELIM : ':';
VIRGULA: ',';
PONTO: '.';
PONTOPONTO: '..';
CONSTANTE: 'constante';
TIPO: 'tipo';
PONTEIRO: '^';
LITERAL: 'literal';
INTEIRO: 'inteiro';
REAL: 'real';
LOGICO: 'logico';
VERDADEIRO: 'verdadeiro';
FALSO: 'falso';
REGISTRO: 'registro';
FIM_REGISTRO: 'fim_registro';
PROCEDIMENTO: 'procedimento';
FIM_PROCEDIMENTO: 'fim_procedimento';
FUNCAO: 'funcao';
ROTINA: 'rotina';
RETORNE: 'retorne';
FIM_FUNÇÃO: 'fim_funcao';
LEIA: 'leia';
ESCREVA: 'escreva';
SE: 'se';
ENTAO: 'entao';
SENAO: 'senao';
FIM_SE: 'fim_se';
CASO: 'caso';
SEJA: 'seja';
FIM_CASO: 'fim_caso';
PARA: 'para';
ATE: 'ate';
FACA: 'faca';
FIM_PARA: 'fim_para';
ENQUANTO: 'enquanto';
FIM_ENQUANTO: 'fim_enquanto';
E: 'e';
OU:'ou';
NEGACAO: 'nao';
IGUAL: '=';
DIFERENTE: '<>';
MAIOR:'>';
MAIOR_IGUAL: '>=';
MENOR: '<';
MENOR_IGUAL: '<=';
SOMA: '+';
SUB:  '-';
MULT:  '*';
DIV: '/';
OP_ATRIBUICAO: '<-';
NUM_INT: [0-9]+;
NUM_REAL: ('+' | '-') ? [0-9] + '.' [0-9]+;
ABRE_PARENTESES: '(';
FECHA_PARENTESES: ')';
ABRE_COLCHETES : '[';
FECHA_COLCHETES: ']';
PORCENTAGEM: '%';
VAR: 'var';
FIM_ALGORITMO: 'fim_algoritmo';
ENDERECO_DO_PONTEIRO: '&';
IDENT : ('a'..'z'|'A'..'Z')('_'| 'a'..'z'|'A'..'Z'|'0'..'9')*;
fragment ESC_SEQ: '\\\'';


CADEIA_NAO_FECHADA: ('"' ( ESC_SEQ | ~('"'|'\n') )* '\n')| ('\'' ( ESC_SEQ | ~('\''|'\\'| '\n') )* '\n');

COMENTARIO_NAO_FECHADO: '{'~('}'|'\n')*'\n';

WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {skip();};

CADEIA: ('"' ( ESC_SEQ | ~('"'| '\n') )* '"')| ('\'' ( ESC_SEQ | ~('\''|'\\'| '\n') )* '\'');


COMENTARIO:  '{'  ~('\n'|'}')*  '}' -> skip;

ERRO: .;
