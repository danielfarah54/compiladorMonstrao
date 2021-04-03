grammar RegrasLexicas;


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
tipo_estendido: '^'? tipo_basico_ident;
tipo: registro | tipo_estendido;


declaracao_local: 'declare' variavel
                | 'constante' IDENT ':' tipo_basico '=' valor_constante
                | 'tipo' IDENT ':' tipo;

declaracao_global: 'procedimento' IDENT '(' parametros ? ')' (declaracao_local)* (cmd)* 'fim_procedimento'
                    | 'funcao' IDENT '(' parametros? ')' ':' tipo_estendido (declaracao_local)* (cmd)* 'fim_funcao';

decl_local_global: declaracao_global | declaracao_local;
declaracoes: (decl_local_global)*;
programa: declaracoes 'algoritmo' corpo 'fim_algoritmo' EOF;

dimensao: ('[' exp_aritmetica ']')*;
identificador: IDENT ('.' IDENT)* dimensao;

parametro: 'var'? identificador (',' '^'? identificador)* ')';
parametros: parametro (',' parametro)*;

variavel: identificador (',' identificador)*':' tipo;



valor_constante: '^'? tipo_basico_ident;
registro: CADEIA | NUM_INT | NUM_REAL | 'verdadeiro' | 'falso';



corpo: (declaracao_local)* (cmd)*;


cmdLeia: 'leia' '(' '^'? identificador (',' '^'? identificador)* ')';
cmdEscreva: 'escreva' '(' expressao (',' expressao)* ')';
cmdSe: 'se' expressao 'entao' (cmd)* ('senao' (cmd)*)? 'fim_se';

cmdCaso : 'caso' exp_aritmetica 'seja' selecao ('senao' (cmd)* )?  'fim_caso';
cmdPara: 'para' IDENT '<-' exp_aritmetica 'ate' exp_aritmetica 'faca' (cmd)* 'fim_para';
cmdEnquanto: 'enquanto' expressao 'faca' (cmd)* 'fim_enquanto';
cmdFaca: 'faca' (cmd)* 'ate' expressao;
cmdAtribuicao: '^'? identificador '<-' expressao;
cmdChamada: IDENT '(' expressao (',' expressao)* ')';
cmdRetorne: 'retorne' expressao;

cmd: cmdLeia | cmdEscreva | cmdSe | cmdCaso | cmdPara | cmdEnquanto
    | cmdFaca | cmdAtribuicao | cmdChamada | cmdRetorne | cmdLeia
    | cmdEscreva |cmdSe | cmdCaso | cmdPara | cmdEnquanto |cmdFaca
    | cmdAtribuicao | cmdChamada | cmdRetorne;


item_selecao: constantes ':' (cmd)*;
selecao: (item_selecao)*;

op_unario: '-';
numero_intervalo: op_unario? NUM_INT ('..' op_unario? NUM_INT)?;
constantes: numero_intervalo (',' numero_intervalo)*;

parcela_unario: '^'? identificador | IDENT '(' expressao (',' expressao)* ')'
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

fator_logico: 'nao'? parcela_logica;
termo_logico: fator_logico (op_logico_2 fator_logico)*;
expressao: termo_logico (op_relacional exp_aritmetica)*;
parcela_logica: ( 'verdadeiro' | 'falso' ) | exp_relacional;


op_logico_1: 'e';
op_logico_2: 'ou';