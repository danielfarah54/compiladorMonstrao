/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufscar.dc.compiladores.compiladorAlguma;

import java.util.HashMap;


public class TabelaDeSimbolos {
    private HashMap<String, EntradaTabelaDeSimbolos> tabelaDeSimbolos;
    
    public enum TipoLA{
        INTEIRO,
        REAL,
        LITERAL,
        LOGICO,
        INVALIDO
    }
    
    
    public TabelaDeSimbolos(){
        tabelaDeSimbolos= new HashMap<>();
    }
    
    public void inserir(String nome, double valor){
        EntradaTabelaDeSimbolos entrada = new EntradaTabelaDeSimbolos();
        entrada.nome=nome;
        entrada.valor = valor;
        tabelaDeSimbolos.put(nome, entrada);
    }
    
    public EntradaTabelaDeSimbolos verificar(String nome){
        return tabelaDeSimbolos.get(nome);
    }
}
