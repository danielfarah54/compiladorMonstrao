grammar RegrasLexicas;


// palavras reservadas
CRONOGRAMA: 'cronograma'
;
TASK: 'task'
;
NAME: 'name'
;
DATE: 'date'
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
CADEIA_NAO_FECHADA: ('"' ('a'..'z'|'A'..'Z')( ESC_SEQ | ~('"'| '\n') )* '\n')
;
CADEIA: ('"' ('a'..'z'|'A'..'Z')( ESC_SEQ | ~('"'| '\n') )* '"')
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
data: 'date' ':' INT '/' INT '/' INT ';'
;
descricao: 'description' ':' CADEIA ';'
;
tarefa: 'task' '{' nome data descricao '}'
;
tarefas: (tarefa)+
;
programa: 'cronograma' '{' tarefas '}'
;
