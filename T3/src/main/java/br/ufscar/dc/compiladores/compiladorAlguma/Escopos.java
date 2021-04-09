package br.ufscar.dc.compiladores.compiladorAlguma;

import java.util.LinkedList;
import java.util.List;

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
    /*
     static public EntradaTabelaDeSimbolos getSimbolo(String nome) {
        for (TabelaDeSimbolos ts : pilhaDeTabelas) {
            EntradaTabelaDeSimbolos entry = ts.getSimbolo(nome);
            if (entry != null) {
                return entry;
            }
        }
        return null;
    }*/
}