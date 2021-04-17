/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufscar.dc.compiladores.compiladorTask;

import java.util.HashMap;

public class AnalisadorSemantico extends TaskRulesBaseVisitor<Void> {

    static Escopos escoposAninhados = new Escopos();
    HashMap<String, String> tabelaTask = new HashMap<>();

    @Override
    public Void visitPrograma(TaskRulesParser.ProgramaContext ctx) {
        return super.visitPrograma(ctx);
    }

    @Override
    public Void visitTarefas(TaskRulesParser.TarefasContext ctx) {
        for(TaskRulesParser.TarefaContext tc : ctx.tarefa() ){
            visitTarefa(tc);
        }
        return super.visitTarefas(ctx);
    }
    
    @Override
    public Void visitTarefa(TaskRulesParser.TarefaContext ctx) {
        visitData(ctx.data());
        visitCategoria(ctx.categoria());
        return super.visitTarefa(ctx);
    }

    @Override
    public Void visitNome(TaskRulesParser.NomeContext ctx) {

        return super.visitNome(ctx);
    }

    @Override
    public Void visitData(TaskRulesParser.DataContext ctx) {
        SemanticoUtils.verificarData(ctx);
        return super.visitData(ctx);
    }
    
    @Override
    public Void visitCategoria(TaskRulesParser.CategoriaContext ctx){
        
        SemanticoUtils.verificarTipo(escoposAninhados.obterEscopoAtual(), ctx);
        
        return super.visitCategoria(ctx);
    }
}
