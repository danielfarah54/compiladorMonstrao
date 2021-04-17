/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufscar.dc.compiladores.compiladorTask;

import java.util.HashMap;
import java.util.Map;


public class TabelaDeSimbolos {
     public enum TarefaCategoria{
        PROVA,
        TRABALHO,
        EXERCICIO,
        CASA,
        EVENTOS,
        OUTROS,
        INVALIDO
    }
     
     public TarefaCategoria getTarefaCategoria(String categoria){
         switch(categoria){
             case "prova":
                 return TarefaCategoria.PROVA;
             case "trabalho":
                 return TarefaCategoria.TRABALHO;
             case "exercicio":
                 return TarefaCategoria.EXERCICIO;
             case "casa":
                 return TarefaCategoria.CASA;
             case "eventos":
                 return TarefaCategoria.EVENTOS;
             case "outros":
                 return TarefaCategoria.OUTROS;
             default:
                return TarefaCategoria.INVALIDO;
         }
     }
    
    class EntradaTabelaDeSimbolos{
        String nome;
        TarefaCategoria tipo;
        
        private EntradaTabelaDeSimbolos(String nome, TarefaCategoria tipo){
            this.nome = nome;
            this.tipo = tipo;
        }
    }
    
    private final Map<String, EntradaTabelaDeSimbolos> tabela;
     
    public TabelaDeSimbolos(){
        this.tabela= new HashMap<>();
    }
    
    public void inserir(String nome, TarefaCategoria tipo){
       tabela.put(nome, new EntradaTabelaDeSimbolos(nome,tipo));
    }
    
    public boolean existe(String nome) {
        return tabela.containsKey(nome);
    }
    
    public TarefaCategoria verificar(String nome){
        return tabela.get(nome).tipo;
    }
}
