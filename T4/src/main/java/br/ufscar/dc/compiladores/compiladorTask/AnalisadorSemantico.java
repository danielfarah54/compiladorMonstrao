/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufscar.dc.compiladores.compiladorTask;

import static br.ufscar.dc.compiladores.compiladorTask.SemanticoUtils.adicionarErroSemantico;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.antlr.v4.runtime.Token;

public class AnalisadorSemantico extends TaskRulesBaseVisitor<Void> {

    static Escopos escopo = new Escopos();
    HashMap<String, List<TaskRulesParser.TarefaContext>> tabelaTask = new HashMap<>();

    public void adicionarTarefaNoEscopo(String nome, String tipo, Token nomeT, Token tipoT) {
        TabelaDeSimbolos tabela = escopo.obterEscopoAtual();

        TabelaDeSimbolos.TarefaCategoria categoria = tabela.getTarefaCategoria(tipo);

        if (categoria != TabelaDeSimbolos.TarefaCategoria.INVALID) {
            tabela.inserir(nome, categoria);
        }
    }

    @Override
    public Void visitPrograma(TaskRulesParser.ProgramaContext ctx) {
        escopo.criarNovoEscopo();
        return super.visitPrograma(ctx);
    }


    @Override
    public Void visitTarefa(TaskRulesParser.TarefaContext ctx) {
        boolean semErro = true;
        if (tabelaTask.containsKey(ctx.nome().getText())) {
            System.out.println("Entrou");
            for (TaskRulesParser.TarefaContext tc : tabelaTask.get(ctx.nome().getText())) {
                if ((ctx.nome().getText().equals(tc.nome().getText())) && (ctx.data().getText().equals(tc.data().getText()))
                        && (ctx.categoria().getText().equals(tc.categoria().getText())) && (ctx.local().getText().equals(tc.local().getText()))) {

                    adicionarErroSemantico(ctx.start, "Tarefa " + ctx.nome().getText() + " já foi declarada anteriormente");
                    semErro = false;
                    break;

                }

            }
            if (semErro) {
                adicionarTarefaNoEscopo(ctx.nome().getText(), ctx.categoria().tipo_categoria().getText(), ctx.TASK().getSymbol(), ctx.categoria().tipo_categoria().getStart());
                tabelaTask.get(ctx.nome().getText()).add(ctx);
            }

        } else {
            System.out.println("Entrou no else");
            adicionarTarefaNoEscopo(ctx.nome().getText(), ctx.categoria().tipo_categoria().getText(), ctx.TASK().getSymbol(), ctx.categoria().tipo_categoria().getStart());
            List<TaskRulesParser.TarefaContext> listaTarefas = new ArrayList<TaskRulesParser.TarefaContext>();
            listaTarefas.add(ctx);
            tabelaTask.put(ctx.nome().getText(), listaTarefas);
        }

        return super.visitTarefa(ctx);
    }


    @Override
    public Void visitData(TaskRulesParser.DataContext ctx) {
        SemanticoUtils.verificarData(ctx);
        return super.visitData(ctx);
    }

    @Override
    public Void visitCategoria(TaskRulesParser.CategoriaContext ctx) {
        SemanticoUtils.verificarTipo(escopo.obterEscopoAtual(), ctx.tipo_categoria());
        return super.visitCategoria(ctx);
    }
}
