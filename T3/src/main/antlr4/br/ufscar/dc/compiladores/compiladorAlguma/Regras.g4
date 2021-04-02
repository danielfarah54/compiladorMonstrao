grammar Regras;

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

tipo_basico: 'literal' | 'inteiro' | 'real' | 'logico';
tipo_basico_ident: tipo_basico | IDENT;
tipo_estendido: PONTEIRO? tipo_basico_ident;
tipo: registro | tipo_estendido;

decl_local_global: declaracao_global | declaracao_local;

declaracao_local: 'declare' variavel
                | 'constante' IDENT ':' tipo_basico '=' valor_constante
                | 'tipo' IDENT ':' tipo;

declaracao_global: 'procedimento' IDENT '(' parametros? ')' (declaracao_local)* (cmd)* 'fim_procedimento'
                    | 'funcao' IDENT '(' parametros? ')' ':' tipo_estendido (declaracao_local)* (cmd)* 'fim_funcao';

declaracoes: (decl_local_global)*;

programa: declaracoes 'algoritmo' corpo 'fim_algoritmo';

dimensao: ('[' exp_aritmetica ']')*;
identificador: IDENT ('.' IDENT)* dimensao;

parametro: 'var'? identificador (',' identificador)* ':' tipo_estendido;
parametros: parametro (',' parametro)*;

variavel: identificador (',' identificador)* ':' tipo;

valor_constante: CADEIA | NUM_INT | NUM_REAL | VERDADEIRO | FALSO;
registro: 'registro' (variavel)* 'fim_registro';

corpo: (declaracao_local)* (cmd)*;

cmdLeia: LEIA '(' PONTEIRO? identificador (',' PONTEIRO? identificador)* ')';
cmdEscreva: ESCREVA '(' expressao (',' expressao)* ')';
cmdSe: SE expressao ENTAO (cmd)* ( SENAO (cmd)*)? FIM_SE;

cmdCaso : CASO exp_aritmetica SEJA selecao (SENAO (cmd)* )?  FIM_CASO;
cmdPara: PARA IDENT '<-' exp_aritmetica ATE exp_aritmetica FACA (cmd)* FIM_PARA;
cmdEnquanto: ENQUANTO expressao FACA (cmd)* FIM_ENQUANTO;
cmdFaca: FACA (cmd)* ATE expressao;
cmdAtribuicao: PONTEIRO? identificador '<-' expressao;
cmdChamada: IDENT '(' expressao (',' expressao)* ')';
cmdRetorne: RETORNE expressao;

cmd: cmdLeia | cmdEscreva | cmdSe | cmdCaso | cmdPara | cmdEnquanto
    | cmdFaca | cmdAtribuicao | cmdChamada | cmdRetorne | cmdLeia
    | cmdEscreva |cmdSe | cmdCaso | cmdPara | cmdEnquanto |cmdFaca
    | cmdAtribuicao | cmdChamada | cmdRetorne;

item_selecao: constantes ':' (cmd)*;
selecao: (item_selecao)*;

op_unario: '-';
numero_intervalo: op_unario? NUM_INT ('..' op_unario? NUM_INT)?;
constantes: numero_intervalo (',' numero_intervalo)*;

parcela_unario: PONTEIRO? identificador | IDENT '(' expressao (',' expressao)* ')'
        | NUM_INT | NUM_REAL
        | '(' expressao ')';
parcela_nao_unario: '&' identificador | CADEIA;
parcela: op_unario? parcela_unario | parcela_nao_unario;

fator: parcela (op3 parcela)*;
termo: fator (op2 fator)*;
exp_aritmetica: termo (op1 termo)*;

op1: '+' | '-';
op2: '*' | '/';
op3: '%';

op_relacional:  '=' | '<>' | '>=' | '<=' | '>' | '<';
exp_relacional: exp_aritmetica (op_relacional exp_aritmetica)?;

fator_logico: NEGACAO? parcela_logica;
termo_logico: fator_logico (op_logico_2 fator_logico)*;
expressao: termo_logico (op_logico_1 termo_logico)*;
parcela_logica: ( VERDADEIRO | FALSO ) | exp_relacional;

op_logico_1: 'e';
op_logico_2: 'ou';
