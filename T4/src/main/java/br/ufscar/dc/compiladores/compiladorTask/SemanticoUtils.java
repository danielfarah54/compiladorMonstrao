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


    //verifica se a categoria é válida
    public static TabelaDeSimbolos.TarefaCategoria verificarTipo(TabelaDeSimbolos tabela, TaskRulesParser.Tipo_categoriaContext ctx){
        
        TabelaDeSimbolos.TarefaCategoria categoria = tabela.getTarefaCategoria(ctx.getText());
        
        if(categoria == TabelaDeSimbolos.TarefaCategoria.INVALID){
            adicionarErroSemantico(ctx.start, "Categoria "+ctx.getText()+ " inválida");
        }
        
        return categoria;
    }

    //função que verifica data válida e se a data de entrada é >= data atual
    public static void verificarData(TaskRulesParser.DataContext ctx) {
        LocalDate dataAtual = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        //tenta realizar o parser da string data de entrada
        try{
            LocalDate dataEntrada = LocalDate.parse(ctx.FORMATO_DATA().getText(), formatter);
            
            //se data atual vem depois da data de entrada
            if(dataAtual.isAfter(dataEntrada)){
                adicionarErroSemantico(ctx.start, "Data "+ctx.FORMATO_DATA().getText()+" de entrada anterior à atual");
            }
        //se não conseguir realizar o parser
        }catch (DateTimeParseException e){
             adicionarErroSemantico(ctx.start, "Data "+ctx.FORMATO_DATA().getText()+" inválida");
        }catch (NullPointerException e){
            adicionarErroSemantico(ctx.start, "Data inválida");
        }
    }
}
