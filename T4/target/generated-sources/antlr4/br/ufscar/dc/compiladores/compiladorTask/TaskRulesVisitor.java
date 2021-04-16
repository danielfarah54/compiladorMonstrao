// Generated from br/ufscar/dc/compiladores/compiladorTask/TaskRules.g4 by ANTLR 4.9.1
package br.ufscar.dc.compiladores.compiladorTask;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TaskRulesParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TaskRulesVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TaskRulesParser#nome}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNome(TaskRulesParser.NomeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaskRulesParser#data}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData(TaskRulesParser.DataContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaskRulesParser#descricao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescricao(TaskRulesParser.DescricaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaskRulesParser#tarefa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTarefa(TaskRulesParser.TarefaContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaskRulesParser#tarefas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTarefas(TaskRulesParser.TarefasContext ctx);
	/**
	 * Visit a parse tree produced by {@link TaskRulesParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(TaskRulesParser.ProgramaContext ctx);
}