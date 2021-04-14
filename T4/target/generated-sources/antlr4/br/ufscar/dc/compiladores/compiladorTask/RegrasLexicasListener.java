// Generated from br/ufscar/dc/compiladores/compiladorTask/RegrasLexicas.g4 by ANTLR 4.9.1
package br.ufscar.dc.compiladores.compiladorTask;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link RegrasLexicasParser}.
 */
public interface RegrasLexicasListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link RegrasLexicasParser#nome}.
	 * @param ctx the parse tree
	 */
	void enterNome(RegrasLexicasParser.NomeContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegrasLexicasParser#nome}.
	 * @param ctx the parse tree
	 */
	void exitNome(RegrasLexicasParser.NomeContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegrasLexicasParser#data}.
	 * @param ctx the parse tree
	 */
	void enterData(RegrasLexicasParser.DataContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegrasLexicasParser#data}.
	 * @param ctx the parse tree
	 */
	void exitData(RegrasLexicasParser.DataContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegrasLexicasParser#descricao}.
	 * @param ctx the parse tree
	 */
	void enterDescricao(RegrasLexicasParser.DescricaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegrasLexicasParser#descricao}.
	 * @param ctx the parse tree
	 */
	void exitDescricao(RegrasLexicasParser.DescricaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegrasLexicasParser#tarefa}.
	 * @param ctx the parse tree
	 */
	void enterTarefa(RegrasLexicasParser.TarefaContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegrasLexicasParser#tarefa}.
	 * @param ctx the parse tree
	 */
	void exitTarefa(RegrasLexicasParser.TarefaContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegrasLexicasParser#tarefas}.
	 * @param ctx the parse tree
	 */
	void enterTarefas(RegrasLexicasParser.TarefasContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegrasLexicasParser#tarefas}.
	 * @param ctx the parse tree
	 */
	void exitTarefas(RegrasLexicasParser.TarefasContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegrasLexicasParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(RegrasLexicasParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegrasLexicasParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(RegrasLexicasParser.ProgramaContext ctx);
}