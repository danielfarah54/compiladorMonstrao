/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufscar.dc.compiladores.compiladorTask;

import static br.ufscar.dc.compiladores.compiladorTask.SemanticoUtils.adicionarErroSemantico;
import java.util.HashMap;
import org.antlr.v4.runtime.Token;

public class AnalisadorSemantico extends TaskRulesBaseVisitor<Void> {

    static Escopos escopo = new Escopos();
    HashMap<String, String> tabelaTask = new HashMap<>();

    public void adicionarTarefaNoEscopo(String nome, String tipo, Token nomeT, Token tipoT) {
        TabelaDeSimbolos tabela = escopo.obterEscopoAtual();

        TabelaDeSimbolos.TarefaCategoria categoria = tabela.getTarefaCategoria(tipo);

        if (categoria == TabelaDeSimbolos.TarefaCategoria.INVALIDO) {
            SemanticoUtils.adicionarErroSemantico(tipoT, "Categoria " + tipo + " inválido");
        } else {
            tabela.inserir(nome, categoria);
        }
    }

    @Override
    public Void visitPrograma(TaskRulesParser.ProgramaContext ctx) {
        escopo.criarNovoEscopo();
        return super.visitPrograma(ctx);
    }

    @Override
    public Void visitTarefas(TaskRulesParser.TarefasContext ctx) {
        for (TaskRulesParser.TarefaContext tc : ctx.tarefa()) {
            visitTarefa(tc);
        }
        return super.visitTarefas(ctx);
    }

    @Override
    public Void visitTarefa(TaskRulesParser.TarefaContext ctx) {
        if (tabelaTask.containsKey(ctx.TASK().getText())) {
            if (tabelaTask.get(ctx.TASK().getText()).equals(ctx.data().getText())) {
                adicionarErroSemantico(ctx.start, "Tarefa já foi declarada anteriormente");
            }else{
                adicionarTarefaNoEscopo(ctx.TASK().getText(), ctx.categoria().getText(), ctx.TASK().getSymbol(), ctx.categoria().getStart());
            }
        }else{
            adicionarTarefaNoEscopo(ctx.TASK().getText(), ctx.categoria().getText(), ctx.TASK().getSymbol(), ctx.categoria().getStart());
        }
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
    public Void visitCategoria(TaskRulesParser.CategoriaContext ctx) {

        SemanticoUtils.verificarTipo(escopo.obterEscopoAtual(), ctx);

        return super.visitCategoria(ctx);
    }
}
