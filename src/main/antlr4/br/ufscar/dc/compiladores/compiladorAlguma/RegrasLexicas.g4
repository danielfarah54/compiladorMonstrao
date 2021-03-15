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


CADEIA_NAO_FECHADA: (''' ( ESC_SEQ | ~('''|'\n') )* '\n')| ('\'' ( ESC_SEQ | ~('\''|'\\'| '\n') )* '\n');

COMENTARIO_NAO_FECHADO: '{'~('}'|'\n')*'\n';

WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {skip();};

CADEIA: (''' ( ESC_SEQ | ~('''| '\n') )* ''')| ('\'' ( ESC_SEQ | ~('\''|'\\'| '\n') )* '\'');


COMENTARIO:  '{'  ~('\n'|'}')*  '}' -> skip;

ERRO: .;

declaracoes: {decl_local_global};
programa: declaracoes 'algoritmo' corpo 'fim_algoritmo';
decl_local_global: declaracao_global | declaracao_local;
declaracao_local 'declare' variavel
                | 'constante' IDENT ':' tipo_basico '=' valor_constante
                | 'tipo' IDENT ':' tipo;


variavel: identificador {',' identificador} ':' tipo;

identificador: IDENT {'.' IDENT} dimensao;
dimensao: {'[' exp_aritmetica ']'};


tipo_basico: 'literal' | 'inteiro' | 'real' | 'logico';
tipo_basico_ident: tipo_basico | IDENT;
tipo_estendido: ['^'] tipo_basico_ident;
tipo: registro | tipo_estendido;


valor_constante: ['^'] tipo_basico_ident;
registro: CADEIA | NUM_INT | NUM_REAL | 'verdadeiro' | 'falso';


declaracao_global: 'procedimento' IDENT '(' [parametros] ')' {declaracao_local} {cmd};

parametro: ['var'] identificado {',' ['^'] identificador} ')';
parametros: parametro {',' parametro};
corpo: {declaracao_local} {cmd};

cmd: cmdLeia | cmdEscreva | cmdSe | cmdCaso | cmdPara | cmdEnquanto
    | cmdFaca | cmdAtribuicao | cmdChamada | cmdRetorne | cmdLeia
    | cmdEscreva |cmdSe | cmdCaso | cmdPara | cmdEnquanto |cdmFaca
    | dmcAtribuicao | cmdChamada | cmdRetorne;

cmdLeia: 'leia' '(' ['^'] identificador {',' ['^'] identificador} ')';
cmdEscreva: 'escreva' '(' expressao {',' expressao} ')';
cmdSe: 'se' expressao 'entao' {cmd} ['senao' {cmd}] 'fim_se';

cmdCaso : 'caso' exp_aritmetica 'seja' selecao ['senao {cmd} ]  'fim_caso';
cmdPara: 'para' IDENT '<-' exp_aritmetica 'ate' exp_aritmetica 'faca' {cmd} 'fim_para';
cmdEnquanto: 'enquanto' expressao 'faca' {cmd} 'fim_enquanto';
cmdFaca: 'faca' {cmd} 'ate' expressao;
cmdAtribuicao: ['^'] identificador '<-' expressao;
cmdChamada: IDENT '(' expressao {',' expressao} ')';
cmdRetorne: 'retorne' expressao;

selecao: {item_selecao};
item_selecao: constantes ':' {cmd};
constantes: numero_intervalo {',' numero_intervalo};
numero_intervalo: [op_unario] NUM-INT ['..' [op_unario] NUM_INT];
op_unario: '-';
exp_aritmetica: termo {op termo};
termo: fator {op2 fator};
fator: parcela {op3 parcela};
op1: '+' | '-';
op2: '*' | '/';
op3: '%';
parcela: [op_unario] parcela_unario | parcela_nao_unario;
parcela_unario: ['^'] identificador | IDENT '(' expressao {',' expressao} ')'
        | NUM_INT | NUM_REAL
        | '(' expressao ')';
parcela_nao_unario: '&' identificador | CADEIA;
exp_relacional: exp_aritmetica [op_relacional exp_aritmetica];
op_relacional:  '=' | '<>' | '>=' | '<=' | '>' | '<';
expressao: termo_logico {op_relacional exp_aritmetica};
termo_logico: fator_logico {op_logico_2 fator_logico};
fator_logico: ['nao'] parcela_logica;
parcela_logica: { 'verdadeiro' | 'falso' ) | exp_relacional;

op_logico_1: 'e' ;
op_logico_2: 'ou' ;
