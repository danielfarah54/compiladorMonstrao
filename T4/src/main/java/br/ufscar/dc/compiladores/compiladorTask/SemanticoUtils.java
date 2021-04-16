/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufscar.dc.compiladores.compiladorTask;

import java.util.ArrayList;
import java.util.List;
import org.antlr.v4.runtime.Token;

public class SemanticoUtils {

    public static List<String> errosSemanticos = new ArrayList<>();

    public static void adicionarErroSemantico(Token t, String mensagem) {
        int linha = t.getLine();
        errosSemanticos.add(String.format("Linha %d: %s", linha, mensagem));
    }

    public static boolean verificaAnoBissexto(int ano) {
        if (ano % 4 != 0) {
            return false;
        } else if (ano % 400 == 0) {
            return true;
        } else if (ano % 100 == 0) {
            return false;
        } else {
            return true;
        }
    }

    public static void verificarData(TaskRulesParser.DataContext ctx) {
        boolean anoBissexto = verificaAnoBissexto(Integer.parseInt(ctx.ANO().getText()));
        if (Integer.parseInt(ctx.DIAMES(1).getText()) <= 12) {
            //verificação para os meses de Janeiro à Julho
            if (Integer.parseInt(ctx.DIAMES(1).getText()) <= 7) {
                //verifica caso especial (fevereiro)
                if (Integer.parseInt(ctx.DIAMES(1).getText()) == 2) {
                    //se for ano bissexto
                    if (anoBissexto) {
                       if (Integer.parseInt(ctx.DIAMES(0).getText())> 28) {
                           adicionarErroSemantico(ctx.start, "Data inválida");
                        }
                    } else { //senao for ano bissexto
                        if (Integer.parseInt(ctx.DIAMES(0).getText()) > 27) {
                           adicionarErroSemantico(ctx.start, "Data inválida");
                        }
                    }

                }else{
                    if(Integer.parseInt(ctx.ANO().getText())%2==0 && Integer.parseInt(ctx.DIAMES(0).getText())>30){
                        adicionarErroSemantico(ctx.start, "Data inválida");
                    }else if((Integer.parseInt(ctx.ANO().getText())%2==1 && Integer.parseInt(ctx.DIAMES(0).getText())>31)){
                        adicionarErroSemantico(ctx.start, "Data inválida");
                    }
                }
            //verificação dos meses de Agosto à Dezembro
            } else {
                  if(Integer.parseInt(ctx.ANO().getText())%2==0 && Integer.parseInt(ctx.DIAMES(0).getText())>31){
                        adicionarErroSemantico(ctx.start, "Data inválida");
                    }else if((Integer.parseInt(ctx.ANO().getText())%2==1 && Integer.parseInt(ctx.DIAMES(0).getText())>30)){
                        adicionarErroSemantico(ctx.start, "Data inválida");
                    }
            }
        } else {
              adicionarErroSemantico(ctx.start, "Data inválida");  
        }
    }
}
