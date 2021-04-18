## Trabalho 4 - Compilador Completo de Linguagem para Geração de Cronogramas
O trabalho 4 (T4) da disciplina consiste em implementar um compilador completo para uma
linguagem de sua escolha. Não é necessário implementar uma linguagem de programação completa
(como LA, ou Alguma). Na verdade, isso não é recomendável, dado que irá tomar muito tempo. A
ideia é criar uma linguagem pequena, de preferência declarativa, para alguma aplicação específica
de interesse dos estudantes. O único requisito é que o compilador tenha:

- Análise léxica + sintática: em outras palavras, uma gramática;
- Análise semântica: três ou quatro (ou mais) verificações de conformidade que não são feitas pela gramática;
- Geração de código ou interpretação: algo de útil ou interessante feito com a linguagem.

### Descrição do nosso CompiladorTask

### Link do Video

### Localidade dos Casos de Uso

### Como extrair uma localidade para colocar em um caso de uso

### Dependências:

* ATLR4
* MAVEN
* JDK > 1.8


### Como compilar o Compilador (Pasta raiz do projeto):

```
$ mvn compile
```


### Como executar Analisador Lexico e Sintatico:

```
$ java -jar ./target/CompiladorTask-1.0-SNAPSHOT-jar-with-dependencies.jar ArquivoDeEntrada ArquivoDeSaida
```

### Como executar Analisador Semantico:

```
$ java -jar ./target/CompiladorTask-1.0-SNAPSHOT-jar-with-dependencies.jar ArquivoDeEntrada ArquivoDeSaida
```

### Como executar Gerador de codigo:

```
$ java -jar ./target/CompiladorTask-1.0-SNAPSHOT-jar-with-dependencies.jar ArquivoDeEntrada ArquivoDeSaida
```





