grammar TaskRules;


// palavras reservadas
CRONOGRAMA: 'cronograma'
;
TASK: 'task'
;
NAME: 'name'
;

// data (a separação do dia e do mes é feita na análise semântica)
DIAMES: [0-3][0-9]
;
ANO: [0-9][0-9][0-9][0-9]
;

DESCRIPTION: 'description'
;

// especificação da categoria
HOUSE_CHORES: 'casa'
;
SCHOOL_PROJECT: 'trabalho'
;
TEST: 'prova'
;
HOMEWORK: 'exercicio'
;
EVENT: 'eventos'
;
OTHERS: 'outros'
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

// cadeia de uma linha
CADEIA_LINHA_NAO_FECHADA: ('"' ('a'..'z'|'A'..'Z')( ESC_SEQ | ~('"'| '\n') )* ('\n'))
;
CADEIA_LINHA: ('"' ('a'..'z'|'A'..'Z')( ESC_SEQ | ~('"'| '\n') )* '"')
;

// cadeia multilinha
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
nome: 'name' ':' nome_tarefa=CADEIA_LINHA ';'
;

categoria: 'category' ':'   tipo_categoria  ';'
;

tipo_categoria: ('house_chores'|'school_project'| 'test' | 'homework' | 'event' | 'other')
;

local: 'local' ':' link=CADEIA_LINHA ';'
;

FORMATO_DATA: DIAMES '/' DIAMES '/' ANO
;

data: 'date' ':' FORMATO_DATA ';'
;

descricao: 'description' ':' desc=(CADEIA_LINHA|CADEIA_MULTILINHA) ';'
;

tarefa: 'task' '{' nome data local categoria descricao '}'
;

tarefas: (tarefa)+
;

programa: 'cronograma' '{' tarefas '}'
;
