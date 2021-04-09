# CompiladorMonstrão

![image](https://user-images.githubusercontent.com/38228656/110389387-3842d400-8043-11eb-8959-f77642cb95a8.png)

## Integrantes
- [Daniel Farah, 417513](https://github.com/danielfarah54)
- [Matheus Yassuo, 746040](https://github.com/yasuo-00)
- [Mayk Bezerra, 727953](https://github.com/mayktu)


## Trabalho 1 - Análise Léxica
O trabalho 1 (T1) da disciplina consiste em implementar um analisador léxico para a [linguagem LA](https://github.com/yasuo-00/compiladorMonstrao/blob/main/Gramatica_LA.pdf)
(Linguagem Algorítmica) desenvolvida pelo prof. Jander, no âmbito do DC/UFSCar. O analisador
léxico deve ler um programa-fonte e produzir uma lista de tokens identificados.

### Dependências:

* ATLR4
* MAVEN
* JDK > 1.8


### Como compilar o Análisador Léxica (Pasta raiz do projeto):

```
$ mvn compile
```


### Como executar (Pasta raiz do projeto):

[Executável](https://github.com/yasuo-00/compiladorMonstrao/blob/main/T1/target/CompiladorAlguma-1.0-SNAPSHOT-jar-with-dependencies.jar)

```
$ java -jar ./target/CompiladorAlguma-1.0-SNAPSHOT-jar-with-dependencies.jar ArquivoDeEntrada ArquivoDeSaida
```

## Trabalho 2 - Análise Sintática
O trabalho 2 (T2) da disciplina consiste em implementar um analisador sintático para a [linguagem LA](https://github.com/yasuo-00/compiladorMonstrao/blob/main/Gramatica_LA.pdf)
(Linguagem Algorítmica) desenvolvida pelo prof. Jander, no âmbito do DC/UFSCar. O analisador
sintático deve ler um programa-fonte e apontar onde existe erro sintático, indicando a linha e o
lexema que causou a detecção do erro.

### Dependências:

* ATLR4
* MAVEN
* JDK > 1.8


### Como compilar o Análisador Léxica (Pasta raiz do projeto):

```
$ mvn compile
```


## Como executar (Pasta raiz do projeto):

[Executável](https://github.com/danielfarah54/compiladorMonstrao/blob/main/target/CompiladorAlguma-1.0-SNAPSHOT-jar-with-dependencies.jar)

```
$ java -jar ./target/CompiladorAlguma-1.0-SNAPSHOT-jar-with-dependencies.jar ArquivoDeEntrada ArquivoDeSaida
```


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
