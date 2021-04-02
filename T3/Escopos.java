package br.ufscar.dc.compiladores.expr.parser3;

import java.util.LinkedList;

public class Escopos {
    private LinkedList<TabelaDeSimbolos> pilhaDeTabelas;

    public Escopos(){
        pilhaDeTabelas = new LinkedList<>();
        criarNovoEscopo();
    }

    public void criarNovoEscopo(){
        pilhaDeTabelas.push(new TabelaDeSimbolos());
    }

    public TabelaDeSimbolos obterEscopoAtual() {
        return pilhaDeTabelas.peek();
    }

    public List<TabelaDeSimbolos> percorrerEscoposAninhados (){
        return pilhaDeTabelas;
    }

    public void abandonarEscopo(){
        pilhaDeTabelas.pop();
    }
}