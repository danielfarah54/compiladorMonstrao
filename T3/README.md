## Trabalho 3 - Análise Semantica e Gerador de Codigos
O trabalho 3 (T3) da disciplina consiste em implementar um analisador semântico e um gerador de
código para a linguagem LA (Linguagem Algorítmica) desenvolvida pelo prof. Jander, no âmbito do
DC/UFSCar.

O analisador semântico deve detectar 6 tipos de erros:
1. Identificador (variável, constante, procedimento, função, tipo) já declarado anteriormente no
escopo
2. Tipo não declarado
3. Identificador (variável, constante, procedimento, função) não declarado
4. Incompatibilidade entre argumentos e parâmetros formais (número, ordem e tipo) na
5. Atribuição não compatível com o tipo declarado
6. Uso do comando 'retorne' em um escopo não permitido

O gerador de código deverá produzir código executável em C equivalente ao programa de entrada.

### Dependências:

* ATLR4
* MAVEN
* JDK > 1.8


### Como compilar o Análisador Léxica(Pasta raiz do projeto):

```
$ mvn compile
```


### Como executar(Pasta raiz do projeto):

```
$ java -jar ./target/CompiladorAlguma-1.0-SNAPSHOT-jar-with-dependencies.jar ArquivoDeEntrada ArquivoDeSaida
```

### Para executar o corretor automatico do professor Lucredio

```
java -jar corretor-automatico.jar  "java -jar compilador_jar_semantico.jar" gcc caminho_resultado_casos caminho_absoluto_casos_de_teste "746040,727953,417513" semantico
```
