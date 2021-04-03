// Generated from br/ufscar/dc/compiladores/compiladorAlguma/RegrasLexicas.g4 by ANTLR 4.9.1
package br.ufscar.dc.compiladores.compiladorAlguma;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link RegrasLexicasParser}.
 */
public interface RegrasLexicasListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link RegrasLexicasParser#tipo_basico}.
	 * @param ctx the parse tree
	 */
	void enterTipo_basico(RegrasLexicasParser.Tipo_basicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegrasLexicasParser#tipo_basico}.
	 * @param ctx the parse tree
	 */
	void exitTipo_basico(RegrasLexicasParser.Tipo_basicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegrasLexicasParser#tipo_basico_ident}.
	 * @param ctx the parse tree
	 */
	void enterTipo_basico_ident(RegrasLexicasParser.Tipo_basico_identContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegrasLexicasParser#tipo_basico_ident}.
	 * @param ctx the parse tree
	 */
	void exitTipo_basico_ident(RegrasLexicasParser.Tipo_basico_identContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegrasLexicasParser#tipo_estendido}.
	 * @param ctx the parse tree
	 */
	void enterTipo_estendido(RegrasLexicasParser.Tipo_estendidoContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegrasLexicasParser#tipo_estendido}.
	 * @param ctx the parse tree
	 */
	void exitTipo_estendido(RegrasLexicasParser.Tipo_estendidoContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegrasLexicasParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(RegrasLexicasParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegrasLexicasParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(RegrasLexicasParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegrasLexicasParser#decl_local_global}.
	 * @param ctx the parse tree
	 */
	void enterDecl_local_global(RegrasLexicasParser.Decl_local_globalContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegrasLexicasParser#decl_local_global}.
	 * @param ctx the parse tree
	 */
	void exitDecl_local_global(RegrasLexicasParser.Decl_local_globalContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegrasLexicasParser#declaracao_local}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao_local(RegrasLexicasParser.Declaracao_localContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegrasLexicasParser#declaracao_local}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao_local(RegrasLexicasParser.Declaracao_localContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegrasLexicasParser#declaracao_global}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao_global(RegrasLexicasParser.Declaracao_globalContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegrasLexicasParser#declaracao_global}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao_global(RegrasLexicasParser.Declaracao_globalContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegrasLexicasParser#declaracoes}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracoes(RegrasLexicasParser.DeclaracoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegrasLexicasParser#declaracoes}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracoes(RegrasLexicasParser.DeclaracoesContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link RegrasLexicasParser#dimensao}.
	 * @param ctx the parse tree
	 */
	void enterDimensao(RegrasLexicasParser.DimensaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegrasLexicasParser#dimensao}.
	 * @param ctx the parse tree
	 */
	void exitDimensao(RegrasLexicasParser.DimensaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegrasLexicasParser#identificador}.
	 * @param ctx the parse tree
	 */
	void enterIdentificador(RegrasLexicasParser.IdentificadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegrasLexicasParser#identificador}.
	 * @param ctx the parse tree
	 */
	void exitIdentificador(RegrasLexicasParser.IdentificadorContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegrasLexicasParser#parametro}.
	 * @param ctx the parse tree
	 */
	void enterParametro(RegrasLexicasParser.ParametroContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegrasLexicasParser#parametro}.
	 * @param ctx the parse tree
	 */
	void exitParametro(RegrasLexicasParser.ParametroContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegrasLexicasParser#parametros}.
	 * @param ctx the parse tree
	 */
	void enterParametros(RegrasLexicasParser.ParametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegrasLexicasParser#parametros}.
	 * @param ctx the parse tree
	 */
	void exitParametros(RegrasLexicasParser.ParametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegrasLexicasParser#variavel}.
	 * @param ctx the parse tree
	 */
	void enterVariavel(RegrasLexicasParser.VariavelContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegrasLexicasParser#variavel}.
	 * @param ctx the parse tree
	 */
	void exitVariavel(RegrasLexicasParser.VariavelContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegrasLexicasParser#valor_constante}.
	 * @param ctx the parse tree
	 */
	void enterValor_constante(RegrasLexicasParser.Valor_constanteContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegrasLexicasParser#valor_constante}.
	 * @param ctx the parse tree
	 */
	void exitValor_constante(RegrasLexicasParser.Valor_constanteContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegrasLexicasParser#registro}.
	 * @param ctx the parse tree
	 */
	void enterRegistro(RegrasLexicasParser.RegistroContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegrasLexicasParser#registro}.
	 * @param ctx the parse tree
	 */
	void exitRegistro(RegrasLexicasParser.RegistroContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegrasLexicasParser#corpo}.
	 * @param ctx the parse tree
	 */
	void enterCorpo(RegrasLexicasParser.CorpoContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegrasLexicasParser#corpo}.
	 * @param ctx the parse tree
	 */
	void exitCorpo(RegrasLexicasParser.CorpoContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegrasLexicasParser#cmdLeia}.
	 * @param ctx the parse tree
	 */
	void enterCmdLeia(RegrasLexicasParser.CmdLeiaContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegrasLexicasParser#cmdLeia}.
	 * @param ctx the parse tree
	 */
	void exitCmdLeia(RegrasLexicasParser.CmdLeiaContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegrasLexicasParser#cmdEscreva}.
	 * @param ctx the parse tree
	 */
	void enterCmdEscreva(RegrasLexicasParser.CmdEscrevaContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegrasLexicasParser#cmdEscreva}.
	 * @param ctx the parse tree
	 */
	void exitCmdEscreva(RegrasLexicasParser.CmdEscrevaContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegrasLexicasParser#cmdSe}.
	 * @param ctx the parse tree
	 */
	void enterCmdSe(RegrasLexicasParser.CmdSeContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegrasLexicasParser#cmdSe}.
	 * @param ctx the parse tree
	 */
	void exitCmdSe(RegrasLexicasParser.CmdSeContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegrasLexicasParser#cmdCaso}.
	 * @param ctx the parse tree
	 */
	void enterCmdCaso(RegrasLexicasParser.CmdCasoContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegrasLexicasParser#cmdCaso}.
	 * @param ctx the parse tree
	 */
	void exitCmdCaso(RegrasLexicasParser.CmdCasoContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegrasLexicasParser#cmdPara}.
	 * @param ctx the parse tree
	 */
	void enterCmdPara(RegrasLexicasParser.CmdParaContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegrasLexicasParser#cmdPara}.
	 * @param ctx the parse tree
	 */
	void exitCmdPara(RegrasLexicasParser.CmdParaContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegrasLexicasParser#cmdEnquanto}.
	 * @param ctx the parse tree
	 */
	void enterCmdEnquanto(RegrasLexicasParser.CmdEnquantoContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegrasLexicasParser#cmdEnquanto}.
	 * @param ctx the parse tree
	 */
	void exitCmdEnquanto(RegrasLexicasParser.CmdEnquantoContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegrasLexicasParser#cmdFaca}.
	 * @param ctx the parse tree
	 */
	void enterCmdFaca(RegrasLexicasParser.CmdFacaContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegrasLexicasParser#cmdFaca}.
	 * @param ctx the parse tree
	 */
	void exitCmdFaca(RegrasLexicasParser.CmdFacaContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegrasLexicasParser#cmdAtribuicao}.
	 * @param ctx the parse tree
	 */
	void enterCmdAtribuicao(RegrasLexicasParser.CmdAtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegrasLexicasParser#cmdAtribuicao}.
	 * @param ctx the parse tree
	 */
	void exitCmdAtribuicao(RegrasLexicasParser.CmdAtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegrasLexicasParser#cmdChamada}.
	 * @param ctx the parse tree
	 */
	void enterCmdChamada(RegrasLexicasParser.CmdChamadaContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegrasLexicasParser#cmdChamada}.
	 * @param ctx the parse tree
	 */
	void exitCmdChamada(RegrasLexicasParser.CmdChamadaContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegrasLexicasParser#cmdRetorne}.
	 * @param ctx the parse tree
	 */
	void enterCmdRetorne(RegrasLexicasParser.CmdRetorneContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegrasLexicasParser#cmdRetorne}.
	 * @param ctx the parse tree
	 */
	void exitCmdRetorne(RegrasLexicasParser.CmdRetorneContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegrasLexicasParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterCmd(RegrasLexicasParser.CmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegrasLexicasParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitCmd(RegrasLexicasParser.CmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegrasLexicasParser#item_selecao}.
	 * @param ctx the parse tree
	 */
	void enterItem_selecao(RegrasLexicasParser.Item_selecaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegrasLexicasParser#item_selecao}.
	 * @param ctx the parse tree
	 */
	void exitItem_selecao(RegrasLexicasParser.Item_selecaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegrasLexicasParser#selecao}.
	 * @param ctx the parse tree
	 */
	void enterSelecao(RegrasLexicasParser.SelecaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegrasLexicasParser#selecao}.
	 * @param ctx the parse tree
	 */
	void exitSelecao(RegrasLexicasParser.SelecaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegrasLexicasParser#op_unario}.
	 * @param ctx the parse tree
	 */
	void enterOp_unario(RegrasLexicasParser.Op_unarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegrasLexicasParser#op_unario}.
	 * @param ctx the parse tree
	 */
	void exitOp_unario(RegrasLexicasParser.Op_unarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegrasLexicasParser#numero_intervalo}.
	 * @param ctx the parse tree
	 */
	void enterNumero_intervalo(RegrasLexicasParser.Numero_intervaloContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegrasLexicasParser#numero_intervalo}.
	 * @param ctx the parse tree
	 */
	void exitNumero_intervalo(RegrasLexicasParser.Numero_intervaloContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegrasLexicasParser#constantes}.
	 * @param ctx the parse tree
	 */
	void enterConstantes(RegrasLexicasParser.ConstantesContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegrasLexicasParser#constantes}.
	 * @param ctx the parse tree
	 */
	void exitConstantes(RegrasLexicasParser.ConstantesContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegrasLexicasParser#parcela_unario}.
	 * @param ctx the parse tree
	 */
	void enterParcela_unario(RegrasLexicasParser.Parcela_unarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegrasLexicasParser#parcela_unario}.
	 * @param ctx the parse tree
	 */
	void exitParcela_unario(RegrasLexicasParser.Parcela_unarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegrasLexicasParser#parcela_nao_unario}.
	 * @param ctx the parse tree
	 */
	void enterParcela_nao_unario(RegrasLexicasParser.Parcela_nao_unarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegrasLexicasParser#parcela_nao_unario}.
	 * @param ctx the parse tree
	 */
	void exitParcela_nao_unario(RegrasLexicasParser.Parcela_nao_unarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegrasLexicasParser#parcela}.
	 * @param ctx the parse tree
	 */
	void enterParcela(RegrasLexicasParser.ParcelaContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegrasLexicasParser#parcela}.
	 * @param ctx the parse tree
	 */
	void exitParcela(RegrasLexicasParser.ParcelaContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegrasLexicasParser#fator}.
	 * @param ctx the parse tree
	 */
	void enterFator(RegrasLexicasParser.FatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegrasLexicasParser#fator}.
	 * @param ctx the parse tree
	 */
	void exitFator(RegrasLexicasParser.FatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegrasLexicasParser#termo}.
	 * @param ctx the parse tree
	 */
	void enterTermo(RegrasLexicasParser.TermoContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegrasLexicasParser#termo}.
	 * @param ctx the parse tree
	 */
	void exitTermo(RegrasLexicasParser.TermoContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegrasLexicasParser#exp_aritmetica}.
	 * @param ctx the parse tree
	 */
	void enterExp_aritmetica(RegrasLexicasParser.Exp_aritmeticaContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegrasLexicasParser#exp_aritmetica}.
	 * @param ctx the parse tree
	 */
	void exitExp_aritmetica(RegrasLexicasParser.Exp_aritmeticaContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegrasLexicasParser#op1}.
	 * @param ctx the parse tree
	 */
	void enterOp1(RegrasLexicasParser.Op1Context ctx);
	/**
	 * Exit a parse tree produced by {@link RegrasLexicasParser#op1}.
	 * @param ctx the parse tree
	 */
	void exitOp1(RegrasLexicasParser.Op1Context ctx);
	/**
	 * Enter a parse tree produced by {@link RegrasLexicasParser#op2}.
	 * @param ctx the parse tree
	 */
	void enterOp2(RegrasLexicasParser.Op2Context ctx);
	/**
	 * Exit a parse tree produced by {@link RegrasLexicasParser#op2}.
	 * @param ctx the parse tree
	 */
	void exitOp2(RegrasLexicasParser.Op2Context ctx);
	/**
	 * Enter a parse tree produced by {@link RegrasLexicasParser#op3}.
	 * @param ctx the parse tree
	 */
	void enterOp3(RegrasLexicasParser.Op3Context ctx);
	/**
	 * Exit a parse tree produced by {@link RegrasLexicasParser#op3}.
	 * @param ctx the parse tree
	 */
	void exitOp3(RegrasLexicasParser.Op3Context ctx);
	/**
	 * Enter a parse tree produced by {@link RegrasLexicasParser#op_relacional}.
	 * @param ctx the parse tree
	 */
	void enterOp_relacional(RegrasLexicasParser.Op_relacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegrasLexicasParser#op_relacional}.
	 * @param ctx the parse tree
	 */
	void exitOp_relacional(RegrasLexicasParser.Op_relacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegrasLexicasParser#exp_relacional}.
	 * @param ctx the parse tree
	 */
	void enterExp_relacional(RegrasLexicasParser.Exp_relacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegrasLexicasParser#exp_relacional}.
	 * @param ctx the parse tree
	 */
	void exitExp_relacional(RegrasLexicasParser.Exp_relacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegrasLexicasParser#fator_logico}.
	 * @param ctx the parse tree
	 */
	void enterFator_logico(RegrasLexicasParser.Fator_logicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegrasLexicasParser#fator_logico}.
	 * @param ctx the parse tree
	 */
	void exitFator_logico(RegrasLexicasParser.Fator_logicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegrasLexicasParser#termo_logico}.
	 * @param ctx the parse tree
	 */
	void enterTermo_logico(RegrasLexicasParser.Termo_logicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegrasLexicasParser#termo_logico}.
	 * @param ctx the parse tree
	 */
	void exitTermo_logico(RegrasLexicasParser.Termo_logicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegrasLexicasParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressao(RegrasLexicasParser.ExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegrasLexicasParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressao(RegrasLexicasParser.ExpressaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegrasLexicasParser#parcela_logica}.
	 * @param ctx the parse tree
	 */
	void enterParcela_logica(RegrasLexicasParser.Parcela_logicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegrasLexicasParser#parcela_logica}.
	 * @param ctx the parse tree
	 */
	void exitParcela_logica(RegrasLexicasParser.Parcela_logicaContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegrasLexicasParser#op_logico_1}.
	 * @param ctx the parse tree
	 */
	void enterOp_logico_1(RegrasLexicasParser.Op_logico_1Context ctx);
	/**
	 * Exit a parse tree produced by {@link RegrasLexicasParser#op_logico_1}.
	 * @param ctx the parse tree
	 */
	void exitOp_logico_1(RegrasLexicasParser.Op_logico_1Context ctx);
	/**
	 * Enter a parse tree produced by {@link RegrasLexicasParser#op_logico_2}.
	 * @param ctx the parse tree
	 */
	void enterOp_logico_2(RegrasLexicasParser.Op_logico_2Context ctx);
	/**
	 * Exit a parse tree produced by {@link RegrasLexicasParser#op_logico_2}.
	 * @param ctx the parse tree
	 */
	void exitOp_logico_2(RegrasLexicasParser.Op_logico_2Context ctx);
}