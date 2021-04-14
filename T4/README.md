## Trabalho 4 - Compilador Completo de Linguagem para Geração de Cronogramas
O trabalho 4 (T4) da disciplina consiste em implementar um compilador completo para alguma linguagem de escolha do grupo.
O exemplo escolhido foi uma linguagem para especificação de tarefas e prazos, que gera um cronograma em HTML.

### Dependências:

* ATLR4
* MAVEN
* JDK > 1.8


### Como compilar o Compilador (Pasta raiz do projeto):

```
$ mvn compile
```


### Como executar (Pasta raiz do projeto):

```
$ java -jar ./target/CompiladorTask-1.0-SNAPSHOT-jar-with-dependencies.jar ArquivoDeEntrada ArquivoDeSaida
```

### Para executar o corretor automatico do professor Lucredio

```
java -jar corretor-automatico.jar  "java -jar compilador_jar_cronograma.jar" gcc caminho_resultado_casos caminho_absoluto_casos_de_teste "746040,727953,417513" semantico
```
