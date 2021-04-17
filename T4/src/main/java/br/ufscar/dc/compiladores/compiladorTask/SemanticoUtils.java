/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufscar.dc.compiladores.compiladorTask;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
import org.antlr.v4.runtime.Token;

public class SemanticoUtils {

    public static List<String> errosSemanticos = new ArrayList<>();

    public static void adicionarErroSemantico(Token t, String mensagem) {
        int linha = t.getLine();
        errosSemanticos.add(String.format("Linha %d: %s", linha, mensagem));
    }

    private static boolean verificaAnoBissexto(int ano) {
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
    
    public static TabelaDeSimbolos.TarefaCategoria verificarTipo(TabelaDeSimbolos tabela, TaskRulesParser.Tipo_categoriaContext ctx){
        
        TabelaDeSimbolos.TarefaCategoria categoria = tabela.getTarefaCategoria(ctx.getText());
        
        if(categoria == TabelaDeSimbolos.TarefaCategoria.INVALIDO){
            adicionarErroSemantico(ctx.start, "Categoria inválida");
        }
        
        return categoria;
    }

    public static void verificarData(TaskRulesParser.DataContext ctx) {
        LocalDate dataAtual = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        try{
            LocalDate dataEntrada = LocalDate.parse(ctx.getText(), formatter);
            
            if(dataAtual.isAfter(dataEntrada)){
                adicionarErroSemantico(ctx.start, "Data inválida");
            }
        }catch (DateTimeParseException e){
             adicionarErroSemantico(ctx.start, "Data inválida");
        }
    }
}
