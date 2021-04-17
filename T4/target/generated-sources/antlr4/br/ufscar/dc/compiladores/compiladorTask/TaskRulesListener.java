// Generated from br/ufscar/dc/compiladores/compiladorTask/TaskRules.g4 by ANTLR 4.9.1
package br.ufscar.dc.compiladores.compiladorTask;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TaskRulesParser}.
 */
public interface TaskRulesListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TaskRulesParser#nome}.
	 * @param ctx the parse tree
	 */
	void enterNome(TaskRulesParser.NomeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaskRulesParser#nome}.
	 * @param ctx the parse tree
	 */
	void exitNome(TaskRulesParser.NomeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaskRulesParser#categoria}.
	 * @param ctx the parse tree
	 */
	void enterCategoria(TaskRulesParser.CategoriaContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaskRulesParser#categoria}.
	 * @param ctx the parse tree
	 */
	void exitCategoria(TaskRulesParser.CategoriaContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaskRulesParser#local}.
	 * @param ctx the parse tree
	 */
	void enterLocal(TaskRulesParser.LocalContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaskRulesParser#local}.
	 * @param ctx the parse tree
	 */
	void exitLocal(TaskRulesParser.LocalContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaskRulesParser#data}.
	 * @param ctx the parse tree
	 */
	void enterData(TaskRulesParser.DataContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaskRulesParser#data}.
	 * @param ctx the parse tree
	 */
	void exitData(TaskRulesParser.DataContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaskRulesParser#descricao}.
	 * @param ctx the parse tree
	 */
	void enterDescricao(TaskRulesParser.DescricaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaskRulesParser#descricao}.
	 * @param ctx the parse tree
	 */
	void exitDescricao(TaskRulesParser.DescricaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaskRulesParser#tarefa}.
	 * @param ctx the parse tree
	 */
	void enterTarefa(TaskRulesParser.TarefaContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaskRulesParser#tarefa}.
	 * @param ctx the parse tree
	 */
	void exitTarefa(TaskRulesParser.TarefaContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaskRulesParser#tarefas}.
	 * @param ctx the parse tree
	 */
	void enterTarefas(TaskRulesParser.TarefasContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaskRulesParser#tarefas}.
	 * @param ctx the parse tree
	 */
	void exitTarefas(TaskRulesParser.TarefasContext ctx);
	/**
	 * Enter a parse tree produced by {@link TaskRulesParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(TaskRulesParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link TaskRulesParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(TaskRulesParser.ProgramaContext ctx);
}