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
        TEST,
        SCHOOL_PROJECT,
        HOMEWORK,
        HOUSE_CHORES,
        EVENT,
        OTHERS,
        INVALID
    }
     
     public TarefaCategoria getTarefaCategoria(String categoria){
         switch(categoria){
             case "test":
                 return TarefaCategoria.TEST;
             case "school_project":
                 return TarefaCategoria.SCHOOL_PROJECT;
             case "homework":
                 return TarefaCategoria.HOMEWORK;
             case "house_chores":
                 return TarefaCategoria.HOUSE_CHORES;
             case "event":
                 return TarefaCategoria.EVENT;
             case "others":
                 return TarefaCategoria.OTHERS;
             default:
                return TarefaCategoria.INVALID;
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
