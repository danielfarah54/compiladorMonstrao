grammar TaskRules;


// palavras reservadas
CRONOGRAMA: 'cronograma'
;
TASK: 'task'
;
NAME: 'name'
;
// data
DIA: [0-3][0-9]
;
MES: [0-1][0-9]
;
ANO: [0-9][0-9][0-9][0-9]
;

DESCRIPTION: 'description'
;

// delimitadores
ABRE_CHAVE: '{'
;
FECHA_CHAVE: '}'
;
DOIS_PONTOS: ':'
;
PONTO_VIRGULA: ';'
;

// número inteiro
INT: [0-9]+
;

// cadeia literal
CADEIA_NAO_FECHADA: ('"' ('a'..'z'|'A'..'Z')( ESC_SEQ | ~('"'| '\n') )* ('\n'))
;
CADEIA: ('"' ('a'..'z'|'A'..'Z')( ESC_SEQ | ~('"'| '\n') )* '"')
;

CADEIA2_NAO_FECHADA: ('"' ('a'..'z'|'A'..'Z')( ESC_SEQ | ~('"'| '}') )* '}')
;
CADEIA2: ('"' ('a'..'z'|'A'..'Z')( ESC_SEQ | ~('"'| '}') )* '"')
;

fragment ESC_SEQ: '\\\''
;

// ignorar comentário
COMENTARIO: '#' ~('\n')* '\n' -> skip
;

// ignorar espaço em branco
WS: (' '|'\t'|'\r'|'\n') -> skip
;

// capturar erros
ERRO: .
;


// sintaxe
nome: 'name' ':' CADEIA ';'
;
data: 'date' ':' DIA '/' MES '/' ANO ';'
;
descricao: 'description' ':' CADEIA2 ';'
;
tarefa: 'task' '{' nome data descricao '}'
;
tarefas: (tarefa)+
;
programa: 'cronograma' '{' tarefas '}'
;
