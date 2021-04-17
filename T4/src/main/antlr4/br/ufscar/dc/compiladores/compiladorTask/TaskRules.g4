grammar TaskRules;


// palavras reservadas
CRONOGRAMA: 'cronograma'
;
TASK: 'task'
;
NAME: 'name'
;
// data
DIAMES: [0-3][0-9]
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
CADEIA_LINHA_NAO_FECHADA: ('"' ('a'..'z'|'A'..'Z')( ESC_SEQ | ~('"'| '\n') )* ('\n'))
;
CADEIA_LINHA: ('"' ('a'..'z'|'A'..'Z')( ESC_SEQ | ~('"'| '\n') )* '"')
;

CADEIA_MULTILINHA_NAO_FECHADA: ('"' ('a'..'z'|'A'..'Z')( ESC_SEQ | ~('"'| '}') )* '}')
;
CADEIA_MULTILINHA: ('"' ('a'..'z'|'A'..'Z')( ESC_SEQ | ~('"'| ';' |'}') )* '"')
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
categoria: 'casa'|'trabalho'
;

local: CADEIA_LINHA
;

data: 'date' ':' DIAMES '/' DIAMES '/' ANO ';'
;
descricao: 'description' ':' (CADEIA2|CADEIA) ';'
;
tarefa: 'task' '{' nome data local categoria descricao '}'
;
tarefas: (tarefa)+
;
programa: 'cronograma' '{' tarefas '}'
;
