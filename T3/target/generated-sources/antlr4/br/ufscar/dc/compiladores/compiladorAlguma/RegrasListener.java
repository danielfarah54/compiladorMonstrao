// Generated from br/ufscar/dc/compiladores/compiladorAlguma/Regras.g4 by ANTLR 4.9.1
package br.ufscar.dc.compiladores.compiladorAlguma;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link RegrasParser}.
 */
public interface RegrasListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link RegrasParser#tipo_basico}.
	 * @param ctx the parse tree
	 */
	void enterTipo_basico(RegrasParser.Tipo_basicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegrasParser#tipo_basico}.
	 * @param ctx the parse tree
	 */
	void exitTipo_basico(RegrasParser.Tipo_basicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegrasParser#tipo_basico_ident}.
	 * @param ctx the parse tree
	 */
	void enterTipo_basico_ident(RegrasParser.Tipo_basico_identContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegrasParser#tipo_basico_ident}.
	 * @param ctx the parse tree
	 */
	void exitTipo_basico_ident(RegrasParser.Tipo_basico_identContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegrasParser#tipo_estendido}.
	 * @param ctx the parse tree
	 */
	void enterTipo_estendido(RegrasParser.Tipo_estendidoContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegrasParser#tipo_estendido}.
	 * @param ctx the parse tree
	 */
	void exitTipo_estendido(RegrasParser.Tipo_estendidoContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegrasParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(RegrasParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegrasParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(RegrasParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegrasParser#decl_local_global}.
	 * @param ctx the parse tree
	 */
	void enterDecl_local_global(RegrasParser.Decl_local_globalContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegrasParser#decl_local_global}.
	 * @param ctx the parse tree
	 */
	void exitDecl_local_global(RegrasParser.Decl_local_globalContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegrasParser#declaracao_local}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao_local(RegrasParser.Declaracao_localContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegrasParser#declaracao_local}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao_local(RegrasParser.Declaracao_localContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegrasParser#declaracao_global}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao_global(RegrasParser.Declaracao_globalContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegrasParser#declaracao_global}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao_global(RegrasParser.Declaracao_globalContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegrasParser#declaracoes}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracoes(RegrasParser.DeclaracoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegrasParser#declaracoes}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracoes(RegrasParser.DeclaracoesContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegrasParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(RegrasParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegrasParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(RegrasParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegrasParser#dimensao}.
	 * @param ctx the parse tree
	 */
	void enterDimensao(RegrasParser.DimensaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegrasParser#dimensao}.
	 * @param ctx the parse tree
	 */
	void exitDimensao(RegrasParser.DimensaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegrasParser#identificador}.
	 * @param ctx the parse tree
	 */
	void enterIdentificador(RegrasParser.IdentificadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegrasParser#identificador}.
	 * @param ctx the parse tree
	 */
	void exitIdentificador(RegrasParser.IdentificadorContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegrasParser#parametro}.
	 * @param ctx the parse tree
	 */
	void enterParametro(RegrasParser.ParametroContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegrasParser#parametro}.
	 * @param ctx the parse tree
	 */
	void exitParametro(RegrasParser.ParametroContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegrasParser#parametros}.
	 * @param ctx the parse tree
	 */
	void enterParametros(RegrasParser.ParametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegrasParser#parametros}.
	 * @param ctx the parse tree
	 */
	void exitParametros(RegrasParser.ParametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegrasParser#variavel}.
	 * @param ctx the parse tree
	 */
	void enterVariavel(RegrasParser.VariavelContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegrasParser#variavel}.
	 * @param ctx the parse tree
	 */
	void exitVariavel(RegrasParser.VariavelContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegrasParser#valor_constante}.
	 * @param ctx the parse tree
	 */
	void enterValor_constante(RegrasParser.Valor_constanteContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegrasParser#valor_constante}.
	 * @param ctx the parse tree
	 */
	void exitValor_constante(RegrasParser.Valor_constanteContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegrasParser#registro}.
	 * @param ctx the parse tree
	 */
	void enterRegistro(RegrasParser.RegistroContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegrasParser#registro}.
	 * @param ctx the parse tree
	 */
	void exitRegistro(RegrasParser.RegistroContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegrasParser#corpo}.
	 * @param ctx the parse tree
	 */
	void enterCorpo(RegrasParser.CorpoContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegrasParser#corpo}.
	 * @param ctx the parse tree
	 */
	void exitCorpo(RegrasParser.CorpoContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegrasParser#cmdLeia}.
	 * @param ctx the parse tree
	 */
	void enterCmdLeia(RegrasParser.CmdLeiaContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegrasParser#cmdLeia}.
	 * @param ctx the parse tree
	 */
	void exitCmdLeia(RegrasParser.CmdLeiaContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegrasParser#cmdEscreva}.
	 * @param ctx the parse tree
	 */
	void enterCmdEscreva(RegrasParser.CmdEscrevaContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegrasParser#cmdEscreva}.
	 * @param ctx the parse tree
	 */
	void exitCmdEscreva(RegrasParser.CmdEscrevaContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegrasParser#cmdSe}.
	 * @param ctx the parse tree
	 */
	void enterCmdSe(RegrasParser.CmdSeContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegrasParser#cmdSe}.
	 * @param ctx the parse tree
	 */
	void exitCmdSe(RegrasParser.CmdSeContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegrasParser#cmdCaso}.
	 * @param ctx the parse tree
	 */
	void enterCmdCaso(RegrasParser.CmdCasoContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegrasParser#cmdCaso}.
	 * @param ctx the parse tree
	 */
	void exitCmdCaso(RegrasParser.CmdCasoContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegrasParser#cmdPara}.
	 * @param ctx the parse tree
	 */
	void enterCmdPara(RegrasParser.CmdParaContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegrasParser#cmdPara}.
	 * @param ctx the parse tree
	 */
	void exitCmdPara(RegrasParser.CmdParaContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegrasParser#cmdEnquanto}.
	 * @param ctx the parse tree
	 */
	void enterCmdEnquanto(RegrasParser.CmdEnquantoContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegrasParser#cmdEnquanto}.
	 * @param ctx the parse tree
	 */
	void exitCmdEnquanto(RegrasParser.CmdEnquantoContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegrasParser#cmdFaca}.
	 * @param ctx the parse tree
	 */
	void enterCmdFaca(RegrasParser.CmdFacaContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegrasParser#cmdFaca}.
	 * @param ctx the parse tree
	 */
	void exitCmdFaca(RegrasParser.CmdFacaContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegrasParser#cmdAtribuicao}.
	 * @param ctx the parse tree
	 */
	void enterCmdAtribuicao(RegrasParser.CmdAtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegrasParser#cmdAtribuicao}.
	 * @param ctx the parse tree
	 */
	void exitCmdAtribuicao(RegrasParser.CmdAtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegrasParser#cmdChamada}.
	 * @param ctx the parse tree
	 */
	void enterCmdChamada(RegrasParser.CmdChamadaContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegrasParser#cmdChamada}.
	 * @param ctx the parse tree
	 */
	void exitCmdChamada(RegrasParser.CmdChamadaContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegrasParser#cmdRetorne}.
	 * @param ctx the parse tree
	 */
	void enterCmdRetorne(RegrasParser.CmdRetorneContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegrasParser#cmdRetorne}.
	 * @param ctx the parse tree
	 */
	void exitCmdRetorne(RegrasParser.CmdRetorneContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegrasParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterCmd(RegrasParser.CmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegrasParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitCmd(RegrasParser.CmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegrasParser#item_selecao}.
	 * @param ctx the parse tree
	 */
	void enterItem_selecao(RegrasParser.Item_selecaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegrasParser#item_selecao}.
	 * @param ctx the parse tree
	 */
	void exitItem_selecao(RegrasParser.Item_selecaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegrasParser#selecao}.
	 * @param ctx the parse tree
	 */
	void enterSelecao(RegrasParser.SelecaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegrasParser#selecao}.
	 * @param ctx the parse tree
	 */
	void exitSelecao(RegrasParser.SelecaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegrasParser#op_unario}.
	 * @param ctx the parse tree
	 */
	void enterOp_unario(RegrasParser.Op_unarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegrasParser#op_unario}.
	 * @param ctx the parse tree
	 */
	void exitOp_unario(RegrasParser.Op_unarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegrasParser#numero_intervalo}.
	 * @param ctx the parse tree
	 */
	void enterNumero_intervalo(RegrasParser.Numero_intervaloContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegrasParser#numero_intervalo}.
	 * @param ctx the parse tree
	 */
	void exitNumero_intervalo(RegrasParser.Numero_intervaloContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegrasParser#constantes}.
	 * @param ctx the parse tree
	 */
	void enterConstantes(RegrasParser.ConstantesContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegrasParser#constantes}.
	 * @param ctx the parse tree
	 */
	void exitConstantes(RegrasParser.ConstantesContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegrasParser#parcela_unario}.
	 * @param ctx the parse tree
	 */
	void enterParcela_unario(RegrasParser.Parcela_unarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegrasParser#parcela_unario}.
	 * @param ctx the parse tree
	 */
	void exitParcela_unario(RegrasParser.Parcela_unarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegrasParser#parcela_nao_unario}.
	 * @param ctx the parse tree
	 */
	void enterParcela_nao_unario(RegrasParser.Parcela_nao_unarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegrasParser#parcela_nao_unario}.
	 * @param ctx the parse tree
	 */
	void exitParcela_nao_unario(RegrasParser.Parcela_nao_unarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegrasParser#parcela}.
	 * @param ctx the parse tree
	 */
	void enterParcela(RegrasParser.ParcelaContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegrasParser#parcela}.
	 * @param ctx the parse tree
	 */
	void exitParcela(RegrasParser.ParcelaContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegrasParser#fator}.
	 * @param ctx the parse tree
	 */
	void enterFator(RegrasParser.FatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegrasParser#fator}.
	 * @param ctx the parse tree
	 */
	void exitFator(RegrasParser.FatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegrasParser#termo}.
	 * @param ctx the parse tree
	 */
	void enterTermo(RegrasParser.TermoContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegrasParser#termo}.
	 * @param ctx the parse tree
	 */
	void exitTermo(RegrasParser.TermoContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegrasParser#exp_aritmetica}.
	 * @param ctx the parse tree
	 */
	void enterExp_aritmetica(RegrasParser.Exp_aritmeticaContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegrasParser#exp_aritmetica}.
	 * @param ctx the parse tree
	 */
	void exitExp_aritmetica(RegrasParser.Exp_aritmeticaContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegrasParser#op1}.
	 * @param ctx the parse tree
	 */
	void enterOp1(RegrasParser.Op1Context ctx);
	/**
	 * Exit a parse tree produced by {@link RegrasParser#op1}.
	 * @param ctx the parse tree
	 */
	void exitOp1(RegrasParser.Op1Context ctx);
	/**
	 * Enter a parse tree produced by {@link RegrasParser#op2}.
	 * @param ctx the parse tree
	 */
	void enterOp2(RegrasParser.Op2Context ctx);
	/**
	 * Exit a parse tree produced by {@link RegrasParser#op2}.
	 * @param ctx the parse tree
	 */
	void exitOp2(RegrasParser.Op2Context ctx);
	/**
	 * Enter a parse tree produced by {@link RegrasParser#op3}.
	 * @param ctx the parse tree
	 */
	void enterOp3(RegrasParser.Op3Context ctx);
	/**
	 * Exit a parse tree produced by {@link RegrasParser#op3}.
	 * @param ctx the parse tree
	 */
	void exitOp3(RegrasParser.Op3Context ctx);
	/**
	 * Enter a parse tree produced by {@link RegrasParser#op_relacional}.
	 * @param ctx the parse tree
	 */
	void enterOp_relacional(RegrasParser.Op_relacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegrasParser#op_relacional}.
	 * @param ctx the parse tree
	 */
	void exitOp_relacional(RegrasParser.Op_relacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegrasParser#exp_relacional}.
	 * @param ctx the parse tree
	 */
	void enterExp_relacional(RegrasParser.Exp_relacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegrasParser#exp_relacional}.
	 * @param ctx the parse tree
	 */
	void exitExp_relacional(RegrasParser.Exp_relacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegrasParser#fator_logico}.
	 * @param ctx the parse tree
	 */
	void enterFator_logico(RegrasParser.Fator_logicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegrasParser#fator_logico}.
	 * @param ctx the parse tree
	 */
	void exitFator_logico(RegrasParser.Fator_logicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegrasParser#termo_logico}.
	 * @param ctx the parse tree
	 */
	void enterTermo_logico(RegrasParser.Termo_logicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegrasParser#termo_logico}.
	 * @param ctx the parse tree
	 */
	void exitTermo_logico(RegrasParser.Termo_logicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegrasParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressao(RegrasParser.ExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegrasParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressao(RegrasParser.ExpressaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegrasParser#parcela_logica}.
	 * @param ctx the parse tree
	 */
	void enterParcela_logica(RegrasParser.Parcela_logicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link RegrasParser#parcela_logica}.
	 * @param ctx the parse tree
	 */
	void exitParcela_logica(RegrasParser.Parcela_logicaContext ctx);
	/**
	 * Enter a parse tree produced by {@link RegrasParser#op_logico_1}.
	 * @param ctx the parse tree
	 */
	void enterOp_logico_1(RegrasParser.Op_logico_1Context ctx);
	/**
	 * Exit a parse tree produced by {@link RegrasParser#op_logico_1}.
	 * @param ctx the parse tree
	 */
	void exitOp_logico_1(RegrasParser.Op_logico_1Context ctx);
	/**
	 * Enter a parse tree produced by {@link RegrasParser#op_logico_2}.
	 * @param ctx the parse tree
	 */
	void enterOp_logico_2(RegrasParser.Op_logico_2Context ctx);
	/**
	 * Exit a parse tree produced by {@link RegrasParser#op_logico_2}.
	 * @param ctx the parse tree
	 */
	void exitOp_logico_2(RegrasParser.Op_logico_2Context ctx);
}