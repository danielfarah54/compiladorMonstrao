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
