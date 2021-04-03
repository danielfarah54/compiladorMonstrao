// Generated from br/ufscar/dc/compiladores/compiladorAlguma/Regras.g4 by ANTLR 4.9.1
package br.ufscar.dc.compiladores.compiladorAlguma;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link RegrasParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface RegrasVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link RegrasParser#tipo_basico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_basico(RegrasParser.Tipo_basicoContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegrasParser#tipo_basico_ident}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_basico_ident(RegrasParser.Tipo_basico_identContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegrasParser#tipo_estendido}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_estendido(RegrasParser.Tipo_estendidoContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegrasParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(RegrasParser.TipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegrasParser#decl_local_global}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_local_global(RegrasParser.Decl_local_globalContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegrasParser#declaracao_local}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracao_local(RegrasParser.Declaracao_localContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegrasParser#declaracao_global}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracao_global(RegrasParser.Declaracao_globalContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegrasParser#declaracoes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracoes(RegrasParser.DeclaracoesContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegrasParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(RegrasParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegrasParser#dimensao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimensao(RegrasParser.DimensaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegrasParser#identificador}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentificador(RegrasParser.IdentificadorContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegrasParser#parametro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametro(RegrasParser.ParametroContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegrasParser#parametros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametros(RegrasParser.ParametrosContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegrasParser#variavel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariavel(RegrasParser.VariavelContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegrasParser#valor_constante}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValor_constante(RegrasParser.Valor_constanteContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegrasParser#registro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegistro(RegrasParser.RegistroContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegrasParser#corpo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCorpo(RegrasParser.CorpoContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegrasParser#cmdLeia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdLeia(RegrasParser.CmdLeiaContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegrasParser#cmdEscreva}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdEscreva(RegrasParser.CmdEscrevaContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegrasParser#cmdSe}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdSe(RegrasParser.CmdSeContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegrasParser#cmdCaso}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdCaso(RegrasParser.CmdCasoContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegrasParser#cmdPara}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdPara(RegrasParser.CmdParaContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegrasParser#cmdEnquanto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdEnquanto(RegrasParser.CmdEnquantoContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegrasParser#cmdFaca}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdFaca(RegrasParser.CmdFacaContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegrasParser#cmdAtribuicao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdAtribuicao(RegrasParser.CmdAtribuicaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegrasParser#cmdChamada}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdChamada(RegrasParser.CmdChamadaContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegrasParser#cmdRetorne}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdRetorne(RegrasParser.CmdRetorneContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegrasParser#cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmd(RegrasParser.CmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegrasParser#item_selecao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItem_selecao(RegrasParser.Item_selecaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegrasParser#selecao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelecao(RegrasParser.SelecaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegrasParser#op_unario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_unario(RegrasParser.Op_unarioContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegrasParser#numero_intervalo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumero_intervalo(RegrasParser.Numero_intervaloContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegrasParser#constantes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantes(RegrasParser.ConstantesContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegrasParser#parcela_unario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParcela_unario(RegrasParser.Parcela_unarioContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegrasParser#parcela_nao_unario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParcela_nao_unario(RegrasParser.Parcela_nao_unarioContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegrasParser#parcela}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParcela(RegrasParser.ParcelaContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegrasParser#fator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFator(RegrasParser.FatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegrasParser#termo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermo(RegrasParser.TermoContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegrasParser#exp_aritmetica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp_aritmetica(RegrasParser.Exp_aritmeticaContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegrasParser#op1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp1(RegrasParser.Op1Context ctx);
	/**
	 * Visit a parse tree produced by {@link RegrasParser#op2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp2(RegrasParser.Op2Context ctx);
	/**
	 * Visit a parse tree produced by {@link RegrasParser#op3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp3(RegrasParser.Op3Context ctx);
	/**
	 * Visit a parse tree produced by {@link RegrasParser#op_relacional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_relacional(RegrasParser.Op_relacionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegrasParser#exp_relacional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp_relacional(RegrasParser.Exp_relacionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegrasParser#fator_logico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFator_logico(RegrasParser.Fator_logicoContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegrasParser#termo_logico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermo_logico(RegrasParser.Termo_logicoContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegrasParser#expressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressao(RegrasParser.ExpressaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegrasParser#parcela_logica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParcela_logica(RegrasParser.Parcela_logicaContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegrasParser#op_logico_1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_logico_1(RegrasParser.Op_logico_1Context ctx);
	/**
	 * Visit a parse tree produced by {@link RegrasParser#op_logico_2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_logico_2(RegrasParser.Op_logico_2Context ctx);
}