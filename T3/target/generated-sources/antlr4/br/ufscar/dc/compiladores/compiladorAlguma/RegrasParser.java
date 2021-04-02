// Generated from br/ufscar/dc/compiladores/compiladorAlguma/Regras.g4 by ANTLR 4.9.1
package br.ufscar.dc.compiladores.compiladorAlguma;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RegrasParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ALGORITMO=1, DOCUMENTACAO_DO_ALGORITMO=2, DECLARE=3, DELIM=4, VIRGULA=5, 
		PONTO=6, PONTOPONTO=7, CONSTANTE=8, TIPO=9, PONTEIRO=10, LITERAL=11, INTEIRO=12, 
		REAL=13, LOGICO=14, VERDADEIRO=15, FALSO=16, REGISTRO=17, FIM_REGISTRO=18, 
		PROCEDIMENTO=19, FIM_PROCEDIMENTO=20, FUNCAO=21, ROTINA=22, RETORNE=23, 
		FIM_FUNÇÃO=24, LEIA=25, ESCREVA=26, SE=27, ENTAO=28, SENAO=29, FIM_SE=30, 
		CASO=31, SEJA=32, FIM_CASO=33, PARA=34, ATE=35, FACA=36, FIM_PARA=37, 
		ENQUANTO=38, FIM_ENQUANTO=39, E=40, OU=41, NEGACAO=42, IGUAL=43, DIFERENTE=44, 
		MAIOR=45, MAIOR_IGUAL=46, MENOR=47, MENOR_IGUAL=48, SOMA=49, SUB=50, MULT=51, 
		DIV=52, OP_ATRIBUICAO=53, NUM_INT=54, NUM_REAL=55, ABRE_PARENTESES=56, 
		FECHA_PARENTESES=57, ABRE_COLCHETES=58, FECHA_COLCHETES=59, PORCENTAGEM=60, 
		VAR=61, FIM_ALGORITMO=62, ENDERECO_DO_PONTEIRO=63, IDENT=64, CADEIA_NAO_FECHADA=65, 
		COMENTARIO_NAO_FECHADO=66, WS=67, CADEIA=68, COMENTARIO=69, ERRO=70;
	public static final int
		RULE_tipo_basico = 0, RULE_tipo_basico_ident = 1, RULE_tipo_estendido = 2, 
		RULE_tipo = 3, RULE_decl_local_global = 4, RULE_declaracao_local = 5, 
		RULE_declaracao_global = 6, RULE_declaracoes = 7, RULE_programa = 8, RULE_dimensao = 9, 
		RULE_identificador = 10, RULE_parametro = 11, RULE_parametros = 12, RULE_variavel = 13, 
		RULE_valor_constante = 14, RULE_registro = 15, RULE_corpo = 16, RULE_cmdLeia = 17, 
		RULE_cmdEscreva = 18, RULE_cmdSe = 19, RULE_cmdCaso = 20, RULE_cmdPara = 21, 
		RULE_cmdEnquanto = 22, RULE_cmdFaca = 23, RULE_cmdAtribuicao = 24, RULE_cmdChamada = 25, 
		RULE_cmdRetorne = 26, RULE_cmd = 27, RULE_item_selecao = 28, RULE_selecao = 29, 
		RULE_op_unario = 30, RULE_numero_intervalo = 31, RULE_constantes = 32, 
		RULE_parcela_unario = 33, RULE_parcela_nao_unario = 34, RULE_parcela = 35, 
		RULE_fator = 36, RULE_termo = 37, RULE_exp_aritmetica = 38, RULE_op1 = 39, 
		RULE_op2 = 40, RULE_op3 = 41, RULE_op_relacional = 42, RULE_exp_relacional = 43, 
		RULE_fator_logico = 44, RULE_termo_logico = 45, RULE_expressao = 46, RULE_parcela_logica = 47, 
		RULE_op_logico_1 = 48, RULE_op_logico_2 = 49;
	private static String[] makeRuleNames() {
		return new String[] {
			"tipo_basico", "tipo_basico_ident", "tipo_estendido", "tipo", "decl_local_global", 
			"declaracao_local", "declaracao_global", "declaracoes", "programa", "dimensao", 
			"identificador", "parametro", "parametros", "variavel", "valor_constante", 
			"registro", "corpo", "cmdLeia", "cmdEscreva", "cmdSe", "cmdCaso", "cmdPara", 
			"cmdEnquanto", "cmdFaca", "cmdAtribuicao", "cmdChamada", "cmdRetorne", 
			"cmd", "item_selecao", "selecao", "op_unario", "numero_intervalo", "constantes", 
			"parcela_unario", "parcela_nao_unario", "parcela", "fator", "termo", 
			"exp_aritmetica", "op1", "op2", "op3", "op_relacional", "exp_relacional", 
			"fator_logico", "termo_logico", "expressao", "parcela_logica", "op_logico_1", 
			"op_logico_2"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'algoritmo'", "'documenta\u00E7\u00E3o_do_algoritmo'", "'declare'", 
			"':'", "','", "'.'", "'..'", "'constante'", "'tipo'", "'^'", "'literal'", 
			"'inteiro'", "'real'", "'logico'", "'verdadeiro'", "'falso'", "'registro'", 
			"'fim_registro'", "'procedimento'", "'fim_procedimento'", "'funcao'", 
			"'rotina'", "'retorne'", "'fim_funcao'", "'leia'", "'escreva'", "'se'", 
			"'entao'", "'senao'", "'fim_se'", "'caso'", "'seja'", "'fim_caso'", "'para'", 
			"'ate'", "'faca'", "'fim_para'", "'enquanto'", "'fim_enquanto'", "'e'", 
			"'ou'", "'nao'", "'='", "'<>'", "'>'", "'>='", "'<'", "'<='", "'+'", 
			"'-'", "'*'", "'/'", "'<-'", null, null, "'('", "')'", "'['", "']'", 
			"'%'", "'var'", "'fim_algoritmo'", "'&'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ALGORITMO", "DOCUMENTACAO_DO_ALGORITMO", "DECLARE", "DELIM", "VIRGULA", 
			"PONTO", "PONTOPONTO", "CONSTANTE", "TIPO", "PONTEIRO", "LITERAL", "INTEIRO", 
			"REAL", "LOGICO", "VERDADEIRO", "FALSO", "REGISTRO", "FIM_REGISTRO", 
			"PROCEDIMENTO", "FIM_PROCEDIMENTO", "FUNCAO", "ROTINA", "RETORNE", "FIM_FUN\u0007\u0008O", 
			"LEIA", "ESCREVA", "SE", "ENTAO", "SENAO", "FIM_SE", "CASO", "SEJA", 
			"FIM_CASO", "PARA", "ATE", "FACA", "FIM_PARA", "ENQUANTO", "FIM_ENQUANTO", 
			"E", "OU", "NEGACAO", "IGUAL", "DIFERENTE", "MAIOR", "MAIOR_IGUAL", "MENOR", 
			"MENOR_IGUAL", "SOMA", "SUB", "MULT", "DIV", "OP_ATRIBUICAO", "NUM_INT", 
			"NUM_REAL", "ABRE_PARENTESES", "FECHA_PARENTESES", "ABRE_COLCHETES", 
			"FECHA_COLCHETES", "PORCENTAGEM", "VAR", "FIM_ALGORITMO", "ENDERECO_DO_PONTEIRO", 
			"IDENT", "CADEIA_NAO_FECHADA", "COMENTARIO_NAO_FECHADO", "WS", "CADEIA", 
			"COMENTARIO", "ERRO"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Regras.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public RegrasParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class Tipo_basicoContext extends ParserRuleContext {
		public TerminalNode LITERAL() { return getToken(RegrasParser.LITERAL, 0); }
		public TerminalNode INTEIRO() { return getToken(RegrasParser.INTEIRO, 0); }
		public TerminalNode REAL() { return getToken(RegrasParser.REAL, 0); }
		public TerminalNode LOGICO() { return getToken(RegrasParser.LOGICO, 0); }
		public Tipo_basicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_basico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasListener ) ((RegrasListener)listener).enterTipo_basico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasListener ) ((RegrasListener)listener).exitTipo_basico(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegrasVisitor ) return ((RegrasVisitor<? extends T>)visitor).visitTipo_basico(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tipo_basicoContext tipo_basico() throws RecognitionException {
		Tipo_basicoContext _localctx = new Tipo_basicoContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_tipo_basico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LITERAL) | (1L << INTEIRO) | (1L << REAL) | (1L << LOGICO))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tipo_basico_identContext extends ParserRuleContext {
		public Tipo_basicoContext tipo_basico() {
			return getRuleContext(Tipo_basicoContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(RegrasParser.IDENT, 0); }
		public Tipo_basico_identContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_basico_ident; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasListener ) ((RegrasListener)listener).enterTipo_basico_ident(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasListener ) ((RegrasListener)listener).exitTipo_basico_ident(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegrasVisitor ) return ((RegrasVisitor<? extends T>)visitor).visitTipo_basico_ident(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tipo_basico_identContext tipo_basico_ident() throws RecognitionException {
		Tipo_basico_identContext _localctx = new Tipo_basico_identContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_tipo_basico_ident);
		try {
			setState(104);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LITERAL:
			case INTEIRO:
			case REAL:
			case LOGICO:
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				tipo_basico();
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(103);
				match(IDENT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tipo_estendidoContext extends ParserRuleContext {
		public Tipo_basico_identContext tipo_basico_ident() {
			return getRuleContext(Tipo_basico_identContext.class,0);
		}
		public TerminalNode PONTEIRO() { return getToken(RegrasParser.PONTEIRO, 0); }
		public Tipo_estendidoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_estendido; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasListener ) ((RegrasListener)listener).enterTipo_estendido(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasListener ) ((RegrasListener)listener).exitTipo_estendido(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegrasVisitor ) return ((RegrasVisitor<? extends T>)visitor).visitTipo_estendido(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tipo_estendidoContext tipo_estendido() throws RecognitionException {
		Tipo_estendidoContext _localctx = new Tipo_estendidoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_tipo_estendido);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PONTEIRO) {
				{
				setState(106);
				match(PONTEIRO);
				}
			}

			setState(109);
			tipo_basico_ident();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TipoContext extends ParserRuleContext {
		public RegistroContext registro() {
			return getRuleContext(RegistroContext.class,0);
		}
		public Tipo_estendidoContext tipo_estendido() {
			return getRuleContext(Tipo_estendidoContext.class,0);
		}
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasListener ) ((RegrasListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasListener ) ((RegrasListener)listener).exitTipo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegrasVisitor ) return ((RegrasVisitor<? extends T>)visitor).visitTipo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_tipo);
		try {
			setState(113);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REGISTRO:
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				registro();
				}
				break;
			case PONTEIRO:
			case LITERAL:
			case INTEIRO:
			case REAL:
			case LOGICO:
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				tipo_estendido();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Decl_local_globalContext extends ParserRuleContext {
		public Declaracao_globalContext declaracao_global() {
			return getRuleContext(Declaracao_globalContext.class,0);
		}
		public Declaracao_localContext declaracao_local() {
			return getRuleContext(Declaracao_localContext.class,0);
		}
		public Decl_local_globalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl_local_global; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasListener ) ((RegrasListener)listener).enterDecl_local_global(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasListener ) ((RegrasListener)listener).exitDecl_local_global(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegrasVisitor ) return ((RegrasVisitor<? extends T>)visitor).visitDecl_local_global(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Decl_local_globalContext decl_local_global() throws RecognitionException {
		Decl_local_globalContext _localctx = new Decl_local_globalContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_decl_local_global);
		try {
			setState(117);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PROCEDIMENTO:
			case FUNCAO:
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				declaracao_global();
				}
				break;
			case DECLARE:
			case CONSTANTE:
			case TIPO:
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
				declaracao_local();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declaracao_localContext extends ParserRuleContext {
		public TerminalNode DECLARE() { return getToken(RegrasParser.DECLARE, 0); }
		public VariavelContext variavel() {
			return getRuleContext(VariavelContext.class,0);
		}
		public TerminalNode CONSTANTE() { return getToken(RegrasParser.CONSTANTE, 0); }
		public TerminalNode IDENT() { return getToken(RegrasParser.IDENT, 0); }
		public TerminalNode DELIM() { return getToken(RegrasParser.DELIM, 0); }
		public Tipo_basicoContext tipo_basico() {
			return getRuleContext(Tipo_basicoContext.class,0);
		}
		public TerminalNode IGUAL() { return getToken(RegrasParser.IGUAL, 0); }
		public Valor_constanteContext valor_constante() {
			return getRuleContext(Valor_constanteContext.class,0);
		}
		public TerminalNode TIPO() { return getToken(RegrasParser.TIPO, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public Declaracao_localContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao_local; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasListener ) ((RegrasListener)listener).enterDeclaracao_local(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasListener ) ((RegrasListener)listener).exitDeclaracao_local(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegrasVisitor ) return ((RegrasVisitor<? extends T>)visitor).visitDeclaracao_local(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaracao_localContext declaracao_local() throws RecognitionException {
		Declaracao_localContext _localctx = new Declaracao_localContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_declaracao_local);
		try {
			setState(132);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECLARE:
				enterOuterAlt(_localctx, 1);
				{
				setState(119);
				match(DECLARE);
				setState(120);
				variavel();
				}
				break;
			case CONSTANTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(121);
				match(CONSTANTE);
				setState(122);
				match(IDENT);
				setState(123);
				match(DELIM);
				setState(124);
				tipo_basico();
				setState(125);
				match(IGUAL);
				setState(126);
				valor_constante();
				}
				break;
			case TIPO:
				enterOuterAlt(_localctx, 3);
				{
				setState(128);
				match(TIPO);
				setState(129);
				match(IDENT);
				setState(130);
				match(DELIM);
				setState(131);
				tipo();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declaracao_globalContext extends ParserRuleContext {
		public TerminalNode PROCEDIMENTO() { return getToken(RegrasParser.PROCEDIMENTO, 0); }
		public TerminalNode IDENT() { return getToken(RegrasParser.IDENT, 0); }
		public TerminalNode ABRE_PARENTESES() { return getToken(RegrasParser.ABRE_PARENTESES, 0); }
		public TerminalNode FECHA_PARENTESES() { return getToken(RegrasParser.FECHA_PARENTESES, 0); }
		public TerminalNode FIM_PROCEDIMENTO() { return getToken(RegrasParser.FIM_PROCEDIMENTO, 0); }
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public List<Declaracao_localContext> declaracao_local() {
			return getRuleContexts(Declaracao_localContext.class);
		}
		public Declaracao_localContext declaracao_local(int i) {
			return getRuleContext(Declaracao_localContext.class,i);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public TerminalNode FUNCAO() { return getToken(RegrasParser.FUNCAO, 0); }
		public TerminalNode DELIM() { return getToken(RegrasParser.DELIM, 0); }
		public Tipo_estendidoContext tipo_estendido() {
			return getRuleContext(Tipo_estendidoContext.class,0);
		}
		public TerminalNode FIM_FUNÇÃO() { return getToken(RegrasParser.FIM_FUNÇÃO, 0); }
		public Declaracao_globalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao_global; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasListener ) ((RegrasListener)listener).enterDeclaracao_global(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasListener ) ((RegrasListener)listener).exitDeclaracao_global(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegrasVisitor ) return ((RegrasVisitor<? extends T>)visitor).visitDeclaracao_global(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaracao_globalContext declaracao_global() throws RecognitionException {
		Declaracao_globalContext _localctx = new Declaracao_globalContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_declaracao_global);
		int _la;
		try {
			setState(177);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PROCEDIMENTO:
				enterOuterAlt(_localctx, 1);
				{
				setState(134);
				match(PROCEDIMENTO);
				setState(135);
				match(IDENT);
				setState(136);
				match(ABRE_PARENTESES);
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR || _la==IDENT) {
					{
					setState(137);
					parametros();
					}
				}

				setState(140);
				match(FECHA_PARENTESES);
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DECLARE) | (1L << CONSTANTE) | (1L << TIPO))) != 0)) {
					{
					{
					setState(141);
					declaracao_local();
					}
					}
					setState(146);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & ((1L << (PONTEIRO - 10)) | (1L << (RETORNE - 10)) | (1L << (LEIA - 10)) | (1L << (ESCREVA - 10)) | (1L << (SE - 10)) | (1L << (CASO - 10)) | (1L << (PARA - 10)) | (1L << (FACA - 10)) | (1L << (ENQUANTO - 10)) | (1L << (IDENT - 10)))) != 0)) {
					{
					{
					setState(147);
					cmd();
					}
					}
					setState(152);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(153);
				match(FIM_PROCEDIMENTO);
				}
				break;
			case FUNCAO:
				enterOuterAlt(_localctx, 2);
				{
				setState(154);
				match(FUNCAO);
				setState(155);
				match(IDENT);
				setState(156);
				match(ABRE_PARENTESES);
				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR || _la==IDENT) {
					{
					setState(157);
					parametros();
					}
				}

				setState(160);
				match(FECHA_PARENTESES);
				setState(161);
				match(DELIM);
				setState(162);
				tipo_estendido();
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DECLARE) | (1L << CONSTANTE) | (1L << TIPO))) != 0)) {
					{
					{
					setState(163);
					declaracao_local();
					}
					}
					setState(168);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(172);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & ((1L << (PONTEIRO - 10)) | (1L << (RETORNE - 10)) | (1L << (LEIA - 10)) | (1L << (ESCREVA - 10)) | (1L << (SE - 10)) | (1L << (CASO - 10)) | (1L << (PARA - 10)) | (1L << (FACA - 10)) | (1L << (ENQUANTO - 10)) | (1L << (IDENT - 10)))) != 0)) {
					{
					{
					setState(169);
					cmd();
					}
					}
					setState(174);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(175);
				match(FIM_FUNÇÃO);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaracoesContext extends ParserRuleContext {
		public List<Decl_local_globalContext> decl_local_global() {
			return getRuleContexts(Decl_local_globalContext.class);
		}
		public Decl_local_globalContext decl_local_global(int i) {
			return getRuleContext(Decl_local_globalContext.class,i);
		}
		public DeclaracoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracoes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasListener ) ((RegrasListener)listener).enterDeclaracoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasListener ) ((RegrasListener)listener).exitDeclaracoes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegrasVisitor ) return ((RegrasVisitor<? extends T>)visitor).visitDeclaracoes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracoesContext declaracoes() throws RecognitionException {
		DeclaracoesContext _localctx = new DeclaracoesContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_declaracoes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DECLARE) | (1L << CONSTANTE) | (1L << TIPO) | (1L << PROCEDIMENTO) | (1L << FUNCAO))) != 0)) {
				{
				{
				setState(179);
				decl_local_global();
				}
				}
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProgramaContext extends ParserRuleContext {
		public DeclaracoesContext declaracoes() {
			return getRuleContext(DeclaracoesContext.class,0);
		}
		public TerminalNode ALGORITMO() { return getToken(RegrasParser.ALGORITMO, 0); }
		public CorpoContext corpo() {
			return getRuleContext(CorpoContext.class,0);
		}
		public TerminalNode FIM_ALGORITMO() { return getToken(RegrasParser.FIM_ALGORITMO, 0); }
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasListener ) ((RegrasListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasListener ) ((RegrasListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegrasVisitor ) return ((RegrasVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			declaracoes();
			setState(186);
			match(ALGORITMO);
			setState(187);
			corpo();
			setState(188);
			match(FIM_ALGORITMO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DimensaoContext extends ParserRuleContext {
		public List<TerminalNode> ABRE_COLCHETES() { return getTokens(RegrasParser.ABRE_COLCHETES); }
		public TerminalNode ABRE_COLCHETES(int i) {
			return getToken(RegrasParser.ABRE_COLCHETES, i);
		}
		public List<Exp_aritmeticaContext> exp_aritmetica() {
			return getRuleContexts(Exp_aritmeticaContext.class);
		}
		public Exp_aritmeticaContext exp_aritmetica(int i) {
			return getRuleContext(Exp_aritmeticaContext.class,i);
		}
		public List<TerminalNode> FECHA_COLCHETES() { return getTokens(RegrasParser.FECHA_COLCHETES); }
		public TerminalNode FECHA_COLCHETES(int i) {
			return getToken(RegrasParser.FECHA_COLCHETES, i);
		}
		public DimensaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimensao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasListener ) ((RegrasListener)listener).enterDimensao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasListener ) ((RegrasListener)listener).exitDimensao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegrasVisitor ) return ((RegrasVisitor<? extends T>)visitor).visitDimensao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DimensaoContext dimensao() throws RecognitionException {
		DimensaoContext _localctx = new DimensaoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_dimensao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ABRE_COLCHETES) {
				{
				{
				setState(190);
				match(ABRE_COLCHETES);
				setState(191);
				exp_aritmetica();
				setState(192);
				match(FECHA_COLCHETES);
				}
				}
				setState(198);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentificadorContext extends ParserRuleContext {
		public List<TerminalNode> IDENT() { return getTokens(RegrasParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(RegrasParser.IDENT, i);
		}
		public DimensaoContext dimensao() {
			return getRuleContext(DimensaoContext.class,0);
		}
		public List<TerminalNode> PONTO() { return getTokens(RegrasParser.PONTO); }
		public TerminalNode PONTO(int i) {
			return getToken(RegrasParser.PONTO, i);
		}
		public IdentificadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identificador; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasListener ) ((RegrasListener)listener).enterIdentificador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasListener ) ((RegrasListener)listener).exitIdentificador(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegrasVisitor ) return ((RegrasVisitor<? extends T>)visitor).visitIdentificador(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentificadorContext identificador() throws RecognitionException {
		IdentificadorContext _localctx = new IdentificadorContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_identificador);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(IDENT);
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PONTO) {
				{
				{
				setState(200);
				match(PONTO);
				setState(201);
				match(IDENT);
				}
				}
				setState(206);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(207);
			dimensao();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParametroContext extends ParserRuleContext {
		public List<IdentificadorContext> identificador() {
			return getRuleContexts(IdentificadorContext.class);
		}
		public IdentificadorContext identificador(int i) {
			return getRuleContext(IdentificadorContext.class,i);
		}
		public TerminalNode DELIM() { return getToken(RegrasParser.DELIM, 0); }
		public Tipo_estendidoContext tipo_estendido() {
			return getRuleContext(Tipo_estendidoContext.class,0);
		}
		public TerminalNode VAR() { return getToken(RegrasParser.VAR, 0); }
		public List<TerminalNode> VIRGULA() { return getTokens(RegrasParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(RegrasParser.VIRGULA, i);
		}
		public ParametroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasListener ) ((RegrasListener)listener).enterParametro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasListener ) ((RegrasListener)listener).exitParametro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegrasVisitor ) return ((RegrasVisitor<? extends T>)visitor).visitParametro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametroContext parametro() throws RecognitionException {
		ParametroContext _localctx = new ParametroContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_parametro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(209);
				match(VAR);
				}
			}

			setState(212);
			identificador();
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(213);
				match(VIRGULA);
				setState(214);
				identificador();
				}
				}
				setState(219);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(220);
			match(DELIM);
			setState(221);
			tipo_estendido();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParametrosContext extends ParserRuleContext {
		public List<ParametroContext> parametro() {
			return getRuleContexts(ParametroContext.class);
		}
		public ParametroContext parametro(int i) {
			return getRuleContext(ParametroContext.class,i);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(RegrasParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(RegrasParser.VIRGULA, i);
		}
		public ParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasListener ) ((RegrasListener)listener).enterParametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasListener ) ((RegrasListener)listener).exitParametros(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegrasVisitor ) return ((RegrasVisitor<? extends T>)visitor).visitParametros(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametrosContext parametros() throws RecognitionException {
		ParametrosContext _localctx = new ParametrosContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_parametros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			parametro();
			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(224);
				match(VIRGULA);
				setState(225);
				parametro();
				}
				}
				setState(230);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariavelContext extends ParserRuleContext {
		public List<IdentificadorContext> identificador() {
			return getRuleContexts(IdentificadorContext.class);
		}
		public IdentificadorContext identificador(int i) {
			return getRuleContext(IdentificadorContext.class,i);
		}
		public TerminalNode DELIM() { return getToken(RegrasParser.DELIM, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(RegrasParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(RegrasParser.VIRGULA, i);
		}
		public VariavelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variavel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasListener ) ((RegrasListener)listener).enterVariavel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasListener ) ((RegrasListener)listener).exitVariavel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegrasVisitor ) return ((RegrasVisitor<? extends T>)visitor).visitVariavel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariavelContext variavel() throws RecognitionException {
		VariavelContext _localctx = new VariavelContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_variavel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			identificador();
			setState(236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(232);
				match(VIRGULA);
				setState(233);
				identificador();
				}
				}
				setState(238);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(239);
			match(DELIM);
			setState(240);
			tipo();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Valor_constanteContext extends ParserRuleContext {
		public TerminalNode CADEIA() { return getToken(RegrasParser.CADEIA, 0); }
		public TerminalNode NUM_INT() { return getToken(RegrasParser.NUM_INT, 0); }
		public TerminalNode NUM_REAL() { return getToken(RegrasParser.NUM_REAL, 0); }
		public TerminalNode VERDADEIRO() { return getToken(RegrasParser.VERDADEIRO, 0); }
		public TerminalNode FALSO() { return getToken(RegrasParser.FALSO, 0); }
		public Valor_constanteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor_constante; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasListener ) ((RegrasListener)listener).enterValor_constante(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasListener ) ((RegrasListener)listener).exitValor_constante(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegrasVisitor ) return ((RegrasVisitor<? extends T>)visitor).visitValor_constante(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Valor_constanteContext valor_constante() throws RecognitionException {
		Valor_constanteContext _localctx = new Valor_constanteContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_valor_constante);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			_la = _input.LA(1);
			if ( !(((((_la - 15)) & ~0x3f) == 0 && ((1L << (_la - 15)) & ((1L << (VERDADEIRO - 15)) | (1L << (FALSO - 15)) | (1L << (NUM_INT - 15)) | (1L << (NUM_REAL - 15)) | (1L << (CADEIA - 15)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RegistroContext extends ParserRuleContext {
		public TerminalNode REGISTRO() { return getToken(RegrasParser.REGISTRO, 0); }
		public TerminalNode FIM_REGISTRO() { return getToken(RegrasParser.FIM_REGISTRO, 0); }
		public List<VariavelContext> variavel() {
			return getRuleContexts(VariavelContext.class);
		}
		public VariavelContext variavel(int i) {
			return getRuleContext(VariavelContext.class,i);
		}
		public RegistroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_registro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasListener ) ((RegrasListener)listener).enterRegistro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasListener ) ((RegrasListener)listener).exitRegistro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegrasVisitor ) return ((RegrasVisitor<? extends T>)visitor).visitRegistro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RegistroContext registro() throws RecognitionException {
		RegistroContext _localctx = new RegistroContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_registro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			match(REGISTRO);
			setState(248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENT) {
				{
				{
				setState(245);
				variavel();
				}
				}
				setState(250);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(251);
			match(FIM_REGISTRO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CorpoContext extends ParserRuleContext {
		public List<Declaracao_localContext> declaracao_local() {
			return getRuleContexts(Declaracao_localContext.class);
		}
		public Declaracao_localContext declaracao_local(int i) {
			return getRuleContext(Declaracao_localContext.class,i);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public CorpoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_corpo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasListener ) ((RegrasListener)listener).enterCorpo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasListener ) ((RegrasListener)listener).exitCorpo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegrasVisitor ) return ((RegrasVisitor<? extends T>)visitor).visitCorpo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CorpoContext corpo() throws RecognitionException {
		CorpoContext _localctx = new CorpoContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_corpo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DECLARE) | (1L << CONSTANTE) | (1L << TIPO))) != 0)) {
				{
				{
				setState(253);
				declaracao_local();
				}
				}
				setState(258);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & ((1L << (PONTEIRO - 10)) | (1L << (RETORNE - 10)) | (1L << (LEIA - 10)) | (1L << (ESCREVA - 10)) | (1L << (SE - 10)) | (1L << (CASO - 10)) | (1L << (PARA - 10)) | (1L << (FACA - 10)) | (1L << (ENQUANTO - 10)) | (1L << (IDENT - 10)))) != 0)) {
				{
				{
				setState(259);
				cmd();
				}
				}
				setState(264);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdLeiaContext extends ParserRuleContext {
		public TerminalNode LEIA() { return getToken(RegrasParser.LEIA, 0); }
		public TerminalNode ABRE_PARENTESES() { return getToken(RegrasParser.ABRE_PARENTESES, 0); }
		public List<IdentificadorContext> identificador() {
			return getRuleContexts(IdentificadorContext.class);
		}
		public IdentificadorContext identificador(int i) {
			return getRuleContext(IdentificadorContext.class,i);
		}
		public TerminalNode FECHA_PARENTESES() { return getToken(RegrasParser.FECHA_PARENTESES, 0); }
		public List<TerminalNode> PONTEIRO() { return getTokens(RegrasParser.PONTEIRO); }
		public TerminalNode PONTEIRO(int i) {
			return getToken(RegrasParser.PONTEIRO, i);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(RegrasParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(RegrasParser.VIRGULA, i);
		}
		public CmdLeiaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdLeia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasListener ) ((RegrasListener)listener).enterCmdLeia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasListener ) ((RegrasListener)listener).exitCmdLeia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegrasVisitor ) return ((RegrasVisitor<? extends T>)visitor).visitCmdLeia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdLeiaContext cmdLeia() throws RecognitionException {
		CmdLeiaContext _localctx = new CmdLeiaContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_cmdLeia);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			match(LEIA);
			setState(266);
			match(ABRE_PARENTESES);
			setState(268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PONTEIRO) {
				{
				setState(267);
				match(PONTEIRO);
				}
			}

			setState(270);
			identificador();
			setState(278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(271);
				match(VIRGULA);
				setState(273);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PONTEIRO) {
					{
					setState(272);
					match(PONTEIRO);
					}
				}

				setState(275);
				identificador();
				}
				}
				setState(280);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(281);
			match(FECHA_PARENTESES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdEscrevaContext extends ParserRuleContext {
		public TerminalNode ESCREVA() { return getToken(RegrasParser.ESCREVA, 0); }
		public TerminalNode ABRE_PARENTESES() { return getToken(RegrasParser.ABRE_PARENTESES, 0); }
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode FECHA_PARENTESES() { return getToken(RegrasParser.FECHA_PARENTESES, 0); }
		public List<TerminalNode> VIRGULA() { return getTokens(RegrasParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(RegrasParser.VIRGULA, i);
		}
		public CmdEscrevaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdEscreva; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasListener ) ((RegrasListener)listener).enterCmdEscreva(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasListener ) ((RegrasListener)listener).exitCmdEscreva(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegrasVisitor ) return ((RegrasVisitor<? extends T>)visitor).visitCmdEscreva(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdEscrevaContext cmdEscreva() throws RecognitionException {
		CmdEscrevaContext _localctx = new CmdEscrevaContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_cmdEscreva);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			match(ESCREVA);
			setState(284);
			match(ABRE_PARENTESES);
			setState(285);
			expressao();
			setState(290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(286);
				match(VIRGULA);
				setState(287);
				expressao();
				}
				}
				setState(292);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(293);
			match(FECHA_PARENTESES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdSeContext extends ParserRuleContext {
		public TerminalNode SE() { return getToken(RegrasParser.SE, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode ENTAO() { return getToken(RegrasParser.ENTAO, 0); }
		public TerminalNode FIM_SE() { return getToken(RegrasParser.FIM_SE, 0); }
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public TerminalNode SENAO() { return getToken(RegrasParser.SENAO, 0); }
		public CmdSeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdSe; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasListener ) ((RegrasListener)listener).enterCmdSe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasListener ) ((RegrasListener)listener).exitCmdSe(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegrasVisitor ) return ((RegrasVisitor<? extends T>)visitor).visitCmdSe(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdSeContext cmdSe() throws RecognitionException {
		CmdSeContext _localctx = new CmdSeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_cmdSe);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			match(SE);
			setState(296);
			expressao();
			setState(297);
			match(ENTAO);
			setState(301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & ((1L << (PONTEIRO - 10)) | (1L << (RETORNE - 10)) | (1L << (LEIA - 10)) | (1L << (ESCREVA - 10)) | (1L << (SE - 10)) | (1L << (CASO - 10)) | (1L << (PARA - 10)) | (1L << (FACA - 10)) | (1L << (ENQUANTO - 10)) | (1L << (IDENT - 10)))) != 0)) {
				{
				{
				setState(298);
				cmd();
				}
				}
				setState(303);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(311);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SENAO) {
				{
				setState(304);
				match(SENAO);
				setState(308);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & ((1L << (PONTEIRO - 10)) | (1L << (RETORNE - 10)) | (1L << (LEIA - 10)) | (1L << (ESCREVA - 10)) | (1L << (SE - 10)) | (1L << (CASO - 10)) | (1L << (PARA - 10)) | (1L << (FACA - 10)) | (1L << (ENQUANTO - 10)) | (1L << (IDENT - 10)))) != 0)) {
					{
					{
					setState(305);
					cmd();
					}
					}
					setState(310);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(313);
			match(FIM_SE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdCasoContext extends ParserRuleContext {
		public TerminalNode CASO() { return getToken(RegrasParser.CASO, 0); }
		public Exp_aritmeticaContext exp_aritmetica() {
			return getRuleContext(Exp_aritmeticaContext.class,0);
		}
		public TerminalNode SEJA() { return getToken(RegrasParser.SEJA, 0); }
		public SelecaoContext selecao() {
			return getRuleContext(SelecaoContext.class,0);
		}
		public TerminalNode FIM_CASO() { return getToken(RegrasParser.FIM_CASO, 0); }
		public TerminalNode SENAO() { return getToken(RegrasParser.SENAO, 0); }
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public CmdCasoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdCaso; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasListener ) ((RegrasListener)listener).enterCmdCaso(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasListener ) ((RegrasListener)listener).exitCmdCaso(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegrasVisitor ) return ((RegrasVisitor<? extends T>)visitor).visitCmdCaso(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdCasoContext cmdCaso() throws RecognitionException {
		CmdCasoContext _localctx = new CmdCasoContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_cmdCaso);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			match(CASO);
			setState(316);
			exp_aritmetica();
			setState(317);
			match(SEJA);
			setState(318);
			selecao();
			setState(326);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SENAO) {
				{
				setState(319);
				match(SENAO);
				setState(323);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & ((1L << (PONTEIRO - 10)) | (1L << (RETORNE - 10)) | (1L << (LEIA - 10)) | (1L << (ESCREVA - 10)) | (1L << (SE - 10)) | (1L << (CASO - 10)) | (1L << (PARA - 10)) | (1L << (FACA - 10)) | (1L << (ENQUANTO - 10)) | (1L << (IDENT - 10)))) != 0)) {
					{
					{
					setState(320);
					cmd();
					}
					}
					setState(325);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(328);
			match(FIM_CASO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdParaContext extends ParserRuleContext {
		public TerminalNode PARA() { return getToken(RegrasParser.PARA, 0); }
		public TerminalNode IDENT() { return getToken(RegrasParser.IDENT, 0); }
		public TerminalNode OP_ATRIBUICAO() { return getToken(RegrasParser.OP_ATRIBUICAO, 0); }
		public List<Exp_aritmeticaContext> exp_aritmetica() {
			return getRuleContexts(Exp_aritmeticaContext.class);
		}
		public Exp_aritmeticaContext exp_aritmetica(int i) {
			return getRuleContext(Exp_aritmeticaContext.class,i);
		}
		public TerminalNode ATE() { return getToken(RegrasParser.ATE, 0); }
		public TerminalNode FACA() { return getToken(RegrasParser.FACA, 0); }
		public TerminalNode FIM_PARA() { return getToken(RegrasParser.FIM_PARA, 0); }
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public CmdParaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdPara; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasListener ) ((RegrasListener)listener).enterCmdPara(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasListener ) ((RegrasListener)listener).exitCmdPara(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegrasVisitor ) return ((RegrasVisitor<? extends T>)visitor).visitCmdPara(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdParaContext cmdPara() throws RecognitionException {
		CmdParaContext _localctx = new CmdParaContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_cmdPara);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			match(PARA);
			setState(331);
			match(IDENT);
			setState(332);
			match(OP_ATRIBUICAO);
			setState(333);
			exp_aritmetica();
			setState(334);
			match(ATE);
			setState(335);
			exp_aritmetica();
			setState(336);
			match(FACA);
			setState(340);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & ((1L << (PONTEIRO - 10)) | (1L << (RETORNE - 10)) | (1L << (LEIA - 10)) | (1L << (ESCREVA - 10)) | (1L << (SE - 10)) | (1L << (CASO - 10)) | (1L << (PARA - 10)) | (1L << (FACA - 10)) | (1L << (ENQUANTO - 10)) | (1L << (IDENT - 10)))) != 0)) {
				{
				{
				setState(337);
				cmd();
				}
				}
				setState(342);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(343);
			match(FIM_PARA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdEnquantoContext extends ParserRuleContext {
		public TerminalNode ENQUANTO() { return getToken(RegrasParser.ENQUANTO, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode FACA() { return getToken(RegrasParser.FACA, 0); }
		public TerminalNode FIM_ENQUANTO() { return getToken(RegrasParser.FIM_ENQUANTO, 0); }
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public CmdEnquantoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdEnquanto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasListener ) ((RegrasListener)listener).enterCmdEnquanto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasListener ) ((RegrasListener)listener).exitCmdEnquanto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegrasVisitor ) return ((RegrasVisitor<? extends T>)visitor).visitCmdEnquanto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdEnquantoContext cmdEnquanto() throws RecognitionException {
		CmdEnquantoContext _localctx = new CmdEnquantoContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_cmdEnquanto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			match(ENQUANTO);
			setState(346);
			expressao();
			setState(347);
			match(FACA);
			setState(351);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & ((1L << (PONTEIRO - 10)) | (1L << (RETORNE - 10)) | (1L << (LEIA - 10)) | (1L << (ESCREVA - 10)) | (1L << (SE - 10)) | (1L << (CASO - 10)) | (1L << (PARA - 10)) | (1L << (FACA - 10)) | (1L << (ENQUANTO - 10)) | (1L << (IDENT - 10)))) != 0)) {
				{
				{
				setState(348);
				cmd();
				}
				}
				setState(353);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(354);
			match(FIM_ENQUANTO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdFacaContext extends ParserRuleContext {
		public TerminalNode FACA() { return getToken(RegrasParser.FACA, 0); }
		public TerminalNode ATE() { return getToken(RegrasParser.ATE, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public CmdFacaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdFaca; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasListener ) ((RegrasListener)listener).enterCmdFaca(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasListener ) ((RegrasListener)listener).exitCmdFaca(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegrasVisitor ) return ((RegrasVisitor<? extends T>)visitor).visitCmdFaca(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdFacaContext cmdFaca() throws RecognitionException {
		CmdFacaContext _localctx = new CmdFacaContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_cmdFaca);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			match(FACA);
			setState(360);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & ((1L << (PONTEIRO - 10)) | (1L << (RETORNE - 10)) | (1L << (LEIA - 10)) | (1L << (ESCREVA - 10)) | (1L << (SE - 10)) | (1L << (CASO - 10)) | (1L << (PARA - 10)) | (1L << (FACA - 10)) | (1L << (ENQUANTO - 10)) | (1L << (IDENT - 10)))) != 0)) {
				{
				{
				setState(357);
				cmd();
				}
				}
				setState(362);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(363);
			match(ATE);
			setState(364);
			expressao();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdAtribuicaoContext extends ParserRuleContext {
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public TerminalNode OP_ATRIBUICAO() { return getToken(RegrasParser.OP_ATRIBUICAO, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode PONTEIRO() { return getToken(RegrasParser.PONTEIRO, 0); }
		public CmdAtribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdAtribuicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasListener ) ((RegrasListener)listener).enterCmdAtribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasListener ) ((RegrasListener)listener).exitCmdAtribuicao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegrasVisitor ) return ((RegrasVisitor<? extends T>)visitor).visitCmdAtribuicao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdAtribuicaoContext cmdAtribuicao() throws RecognitionException {
		CmdAtribuicaoContext _localctx = new CmdAtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_cmdAtribuicao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PONTEIRO) {
				{
				setState(366);
				match(PONTEIRO);
				}
			}

			setState(369);
			identificador();
			setState(370);
			match(OP_ATRIBUICAO);
			setState(371);
			expressao();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdChamadaContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(RegrasParser.IDENT, 0); }
		public TerminalNode ABRE_PARENTESES() { return getToken(RegrasParser.ABRE_PARENTESES, 0); }
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode FECHA_PARENTESES() { return getToken(RegrasParser.FECHA_PARENTESES, 0); }
		public List<TerminalNode> VIRGULA() { return getTokens(RegrasParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(RegrasParser.VIRGULA, i);
		}
		public CmdChamadaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdChamada; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasListener ) ((RegrasListener)listener).enterCmdChamada(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasListener ) ((RegrasListener)listener).exitCmdChamada(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegrasVisitor ) return ((RegrasVisitor<? extends T>)visitor).visitCmdChamada(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdChamadaContext cmdChamada() throws RecognitionException {
		CmdChamadaContext _localctx = new CmdChamadaContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_cmdChamada);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			match(IDENT);
			setState(374);
			match(ABRE_PARENTESES);
			setState(375);
			expressao();
			setState(380);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(376);
				match(VIRGULA);
				setState(377);
				expressao();
				}
				}
				setState(382);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(383);
			match(FECHA_PARENTESES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdRetorneContext extends ParserRuleContext {
		public TerminalNode RETORNE() { return getToken(RegrasParser.RETORNE, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public CmdRetorneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdRetorne; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasListener ) ((RegrasListener)listener).enterCmdRetorne(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasListener ) ((RegrasListener)listener).exitCmdRetorne(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegrasVisitor ) return ((RegrasVisitor<? extends T>)visitor).visitCmdRetorne(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdRetorneContext cmdRetorne() throws RecognitionException {
		CmdRetorneContext _localctx = new CmdRetorneContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_cmdRetorne);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
			match(RETORNE);
			setState(386);
			expressao();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdContext extends ParserRuleContext {
		public CmdLeiaContext cmdLeia() {
			return getRuleContext(CmdLeiaContext.class,0);
		}
		public CmdEscrevaContext cmdEscreva() {
			return getRuleContext(CmdEscrevaContext.class,0);
		}
		public CmdSeContext cmdSe() {
			return getRuleContext(CmdSeContext.class,0);
		}
		public CmdCasoContext cmdCaso() {
			return getRuleContext(CmdCasoContext.class,0);
		}
		public CmdParaContext cmdPara() {
			return getRuleContext(CmdParaContext.class,0);
		}
		public CmdEnquantoContext cmdEnquanto() {
			return getRuleContext(CmdEnquantoContext.class,0);
		}
		public CmdFacaContext cmdFaca() {
			return getRuleContext(CmdFacaContext.class,0);
		}
		public CmdAtribuicaoContext cmdAtribuicao() {
			return getRuleContext(CmdAtribuicaoContext.class,0);
		}
		public CmdChamadaContext cmdChamada() {
			return getRuleContext(CmdChamadaContext.class,0);
		}
		public CmdRetorneContext cmdRetorne() {
			return getRuleContext(CmdRetorneContext.class,0);
		}
		public CmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasListener ) ((RegrasListener)listener).enterCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasListener ) ((RegrasListener)listener).exitCmd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegrasVisitor ) return ((RegrasVisitor<? extends T>)visitor).visitCmd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdContext cmd() throws RecognitionException {
		CmdContext _localctx = new CmdContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_cmd);
		try {
			setState(408);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(388);
				cmdLeia();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(389);
				cmdEscreva();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(390);
				cmdSe();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(391);
				cmdCaso();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(392);
				cmdPara();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(393);
				cmdEnquanto();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(394);
				cmdFaca();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(395);
				cmdAtribuicao();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(396);
				cmdChamada();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(397);
				cmdRetorne();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(398);
				cmdLeia();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(399);
				cmdEscreva();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(400);
				cmdSe();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(401);
				cmdCaso();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(402);
				cmdPara();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(403);
				cmdEnquanto();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(404);
				cmdFaca();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(405);
				cmdAtribuicao();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(406);
				cmdChamada();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(407);
				cmdRetorne();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Item_selecaoContext extends ParserRuleContext {
		public ConstantesContext constantes() {
			return getRuleContext(ConstantesContext.class,0);
		}
		public TerminalNode DELIM() { return getToken(RegrasParser.DELIM, 0); }
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public Item_selecaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_item_selecao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasListener ) ((RegrasListener)listener).enterItem_selecao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasListener ) ((RegrasListener)listener).exitItem_selecao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegrasVisitor ) return ((RegrasVisitor<? extends T>)visitor).visitItem_selecao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Item_selecaoContext item_selecao() throws RecognitionException {
		Item_selecaoContext _localctx = new Item_selecaoContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_item_selecao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
			constantes();
			setState(411);
			match(DELIM);
			setState(415);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & ((1L << (PONTEIRO - 10)) | (1L << (RETORNE - 10)) | (1L << (LEIA - 10)) | (1L << (ESCREVA - 10)) | (1L << (SE - 10)) | (1L << (CASO - 10)) | (1L << (PARA - 10)) | (1L << (FACA - 10)) | (1L << (ENQUANTO - 10)) | (1L << (IDENT - 10)))) != 0)) {
				{
				{
				setState(412);
				cmd();
				}
				}
				setState(417);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelecaoContext extends ParserRuleContext {
		public List<Item_selecaoContext> item_selecao() {
			return getRuleContexts(Item_selecaoContext.class);
		}
		public Item_selecaoContext item_selecao(int i) {
			return getRuleContext(Item_selecaoContext.class,i);
		}
		public SelecaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selecao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasListener ) ((RegrasListener)listener).enterSelecao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasListener ) ((RegrasListener)listener).exitSelecao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegrasVisitor ) return ((RegrasVisitor<? extends T>)visitor).visitSelecao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelecaoContext selecao() throws RecognitionException {
		SelecaoContext _localctx = new SelecaoContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_selecao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(421);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SUB || _la==NUM_INT) {
				{
				{
				setState(418);
				item_selecao();
				}
				}
				setState(423);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_unarioContext extends ParserRuleContext {
		public TerminalNode SUB() { return getToken(RegrasParser.SUB, 0); }
		public Op_unarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_unario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasListener ) ((RegrasListener)listener).enterOp_unario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasListener ) ((RegrasListener)listener).exitOp_unario(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegrasVisitor ) return ((RegrasVisitor<? extends T>)visitor).visitOp_unario(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_unarioContext op_unario() throws RecognitionException {
		Op_unarioContext _localctx = new Op_unarioContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_op_unario);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
			match(SUB);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Numero_intervaloContext extends ParserRuleContext {
		public List<TerminalNode> NUM_INT() { return getTokens(RegrasParser.NUM_INT); }
		public TerminalNode NUM_INT(int i) {
			return getToken(RegrasParser.NUM_INT, i);
		}
		public List<Op_unarioContext> op_unario() {
			return getRuleContexts(Op_unarioContext.class);
		}
		public Op_unarioContext op_unario(int i) {
			return getRuleContext(Op_unarioContext.class,i);
		}
		public TerminalNode PONTOPONTO() { return getToken(RegrasParser.PONTOPONTO, 0); }
		public Numero_intervaloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numero_intervalo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasListener ) ((RegrasListener)listener).enterNumero_intervalo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasListener ) ((RegrasListener)listener).exitNumero_intervalo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegrasVisitor ) return ((RegrasVisitor<? extends T>)visitor).visitNumero_intervalo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Numero_intervaloContext numero_intervalo() throws RecognitionException {
		Numero_intervaloContext _localctx = new Numero_intervaloContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_numero_intervalo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(427);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SUB) {
				{
				setState(426);
				op_unario();
				}
			}

			setState(429);
			match(NUM_INT);
			setState(435);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PONTOPONTO) {
				{
				setState(430);
				match(PONTOPONTO);
				setState(432);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SUB) {
					{
					setState(431);
					op_unario();
					}
				}

				setState(434);
				match(NUM_INT);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantesContext extends ParserRuleContext {
		public List<Numero_intervaloContext> numero_intervalo() {
			return getRuleContexts(Numero_intervaloContext.class);
		}
		public Numero_intervaloContext numero_intervalo(int i) {
			return getRuleContext(Numero_intervaloContext.class,i);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(RegrasParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(RegrasParser.VIRGULA, i);
		}
		public ConstantesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasListener ) ((RegrasListener)listener).enterConstantes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasListener ) ((RegrasListener)listener).exitConstantes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegrasVisitor ) return ((RegrasVisitor<? extends T>)visitor).visitConstantes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantesContext constantes() throws RecognitionException {
		ConstantesContext _localctx = new ConstantesContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_constantes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			numero_intervalo();
			setState(442);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(438);
				match(VIRGULA);
				setState(439);
				numero_intervalo();
				}
				}
				setState(444);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parcela_unarioContext extends ParserRuleContext {
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public TerminalNode PONTEIRO() { return getToken(RegrasParser.PONTEIRO, 0); }
		public TerminalNode IDENT() { return getToken(RegrasParser.IDENT, 0); }
		public TerminalNode ABRE_PARENTESES() { return getToken(RegrasParser.ABRE_PARENTESES, 0); }
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode FECHA_PARENTESES() { return getToken(RegrasParser.FECHA_PARENTESES, 0); }
		public List<TerminalNode> VIRGULA() { return getTokens(RegrasParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(RegrasParser.VIRGULA, i);
		}
		public TerminalNode NUM_INT() { return getToken(RegrasParser.NUM_INT, 0); }
		public TerminalNode NUM_REAL() { return getToken(RegrasParser.NUM_REAL, 0); }
		public Parcela_unarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parcela_unario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasListener ) ((RegrasListener)listener).enterParcela_unario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasListener ) ((RegrasListener)listener).exitParcela_unario(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegrasVisitor ) return ((RegrasVisitor<? extends T>)visitor).visitParcela_unario(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parcela_unarioContext parcela_unario() throws RecognitionException {
		Parcela_unarioContext _localctx = new Parcela_unarioContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_parcela_unario);
		int _la;
		try {
			setState(467);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(446);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PONTEIRO) {
					{
					setState(445);
					match(PONTEIRO);
					}
				}

				setState(448);
				identificador();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(449);
				match(IDENT);
				setState(450);
				match(ABRE_PARENTESES);
				setState(451);
				expressao();
				setState(456);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VIRGULA) {
					{
					{
					setState(452);
					match(VIRGULA);
					setState(453);
					expressao();
					}
					}
					setState(458);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(459);
				match(FECHA_PARENTESES);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(461);
				match(NUM_INT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(462);
				match(NUM_REAL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(463);
				match(ABRE_PARENTESES);
				setState(464);
				expressao();
				setState(465);
				match(FECHA_PARENTESES);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parcela_nao_unarioContext extends ParserRuleContext {
		public TerminalNode ENDERECO_DO_PONTEIRO() { return getToken(RegrasParser.ENDERECO_DO_PONTEIRO, 0); }
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public TerminalNode CADEIA() { return getToken(RegrasParser.CADEIA, 0); }
		public Parcela_nao_unarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parcela_nao_unario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasListener ) ((RegrasListener)listener).enterParcela_nao_unario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasListener ) ((RegrasListener)listener).exitParcela_nao_unario(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegrasVisitor ) return ((RegrasVisitor<? extends T>)visitor).visitParcela_nao_unario(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parcela_nao_unarioContext parcela_nao_unario() throws RecognitionException {
		Parcela_nao_unarioContext _localctx = new Parcela_nao_unarioContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_parcela_nao_unario);
		try {
			setState(472);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENDERECO_DO_PONTEIRO:
				enterOuterAlt(_localctx, 1);
				{
				setState(469);
				match(ENDERECO_DO_PONTEIRO);
				setState(470);
				identificador();
				}
				break;
			case CADEIA:
				enterOuterAlt(_localctx, 2);
				{
				setState(471);
				match(CADEIA);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParcelaContext extends ParserRuleContext {
		public Parcela_unarioContext parcela_unario() {
			return getRuleContext(Parcela_unarioContext.class,0);
		}
		public Op_unarioContext op_unario() {
			return getRuleContext(Op_unarioContext.class,0);
		}
		public Parcela_nao_unarioContext parcela_nao_unario() {
			return getRuleContext(Parcela_nao_unarioContext.class,0);
		}
		public ParcelaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parcela; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasListener ) ((RegrasListener)listener).enterParcela(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasListener ) ((RegrasListener)listener).exitParcela(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegrasVisitor ) return ((RegrasVisitor<? extends T>)visitor).visitParcela(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParcelaContext parcela() throws RecognitionException {
		ParcelaContext _localctx = new ParcelaContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_parcela);
		int _la;
		try {
			setState(479);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PONTEIRO:
			case SUB:
			case NUM_INT:
			case NUM_REAL:
			case ABRE_PARENTESES:
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(475);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SUB) {
					{
					setState(474);
					op_unario();
					}
				}

				setState(477);
				parcela_unario();
				}
				break;
			case ENDERECO_DO_PONTEIRO:
			case CADEIA:
				enterOuterAlt(_localctx, 2);
				{
				setState(478);
				parcela_nao_unario();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FatorContext extends ParserRuleContext {
		public List<ParcelaContext> parcela() {
			return getRuleContexts(ParcelaContext.class);
		}
		public ParcelaContext parcela(int i) {
			return getRuleContext(ParcelaContext.class,i);
		}
		public List<Op3Context> op3() {
			return getRuleContexts(Op3Context.class);
		}
		public Op3Context op3(int i) {
			return getRuleContext(Op3Context.class,i);
		}
		public FatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasListener ) ((RegrasListener)listener).enterFator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasListener ) ((RegrasListener)listener).exitFator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegrasVisitor ) return ((RegrasVisitor<? extends T>)visitor).visitFator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FatorContext fator() throws RecognitionException {
		FatorContext _localctx = new FatorContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_fator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(481);
			parcela();
			setState(487);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PORCENTAGEM) {
				{
				{
				setState(482);
				op3();
				setState(483);
				parcela();
				}
				}
				setState(489);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermoContext extends ParserRuleContext {
		public List<FatorContext> fator() {
			return getRuleContexts(FatorContext.class);
		}
		public FatorContext fator(int i) {
			return getRuleContext(FatorContext.class,i);
		}
		public List<Op2Context> op2() {
			return getRuleContexts(Op2Context.class);
		}
		public Op2Context op2(int i) {
			return getRuleContext(Op2Context.class,i);
		}
		public TermoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasListener ) ((RegrasListener)listener).enterTermo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasListener ) ((RegrasListener)listener).exitTermo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegrasVisitor ) return ((RegrasVisitor<? extends T>)visitor).visitTermo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermoContext termo() throws RecognitionException {
		TermoContext _localctx = new TermoContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_termo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(490);
			fator();
			setState(496);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULT || _la==DIV) {
				{
				{
				setState(491);
				op2();
				setState(492);
				fator();
				}
				}
				setState(498);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Exp_aritmeticaContext extends ParserRuleContext {
		public List<TermoContext> termo() {
			return getRuleContexts(TermoContext.class);
		}
		public TermoContext termo(int i) {
			return getRuleContext(TermoContext.class,i);
		}
		public List<Op1Context> op1() {
			return getRuleContexts(Op1Context.class);
		}
		public Op1Context op1(int i) {
			return getRuleContext(Op1Context.class,i);
		}
		public Exp_aritmeticaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_aritmetica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasListener ) ((RegrasListener)listener).enterExp_aritmetica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasListener ) ((RegrasListener)listener).exitExp_aritmetica(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegrasVisitor ) return ((RegrasVisitor<? extends T>)visitor).visitExp_aritmetica(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exp_aritmeticaContext exp_aritmetica() throws RecognitionException {
		Exp_aritmeticaContext _localctx = new Exp_aritmeticaContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_exp_aritmetica);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(499);
			termo();
			setState(505);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(500);
					op1();
					setState(501);
					termo();
					}
					} 
				}
				setState(507);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op1Context extends ParserRuleContext {
		public TerminalNode SOMA() { return getToken(RegrasParser.SOMA, 0); }
		public TerminalNode SUB() { return getToken(RegrasParser.SUB, 0); }
		public Op1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasListener ) ((RegrasListener)listener).enterOp1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasListener ) ((RegrasListener)listener).exitOp1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegrasVisitor ) return ((RegrasVisitor<? extends T>)visitor).visitOp1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op1Context op1() throws RecognitionException {
		Op1Context _localctx = new Op1Context(_ctx, getState());
		enterRule(_localctx, 78, RULE_op1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(508);
			_la = _input.LA(1);
			if ( !(_la==SOMA || _la==SUB) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op2Context extends ParserRuleContext {
		public TerminalNode MULT() { return getToken(RegrasParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(RegrasParser.DIV, 0); }
		public Op2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasListener ) ((RegrasListener)listener).enterOp2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasListener ) ((RegrasListener)listener).exitOp2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegrasVisitor ) return ((RegrasVisitor<? extends T>)visitor).visitOp2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op2Context op2() throws RecognitionException {
		Op2Context _localctx = new Op2Context(_ctx, getState());
		enterRule(_localctx, 80, RULE_op2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(510);
			_la = _input.LA(1);
			if ( !(_la==MULT || _la==DIV) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op3Context extends ParserRuleContext {
		public TerminalNode PORCENTAGEM() { return getToken(RegrasParser.PORCENTAGEM, 0); }
		public Op3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasListener ) ((RegrasListener)listener).enterOp3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasListener ) ((RegrasListener)listener).exitOp3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegrasVisitor ) return ((RegrasVisitor<? extends T>)visitor).visitOp3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op3Context op3() throws RecognitionException {
		Op3Context _localctx = new Op3Context(_ctx, getState());
		enterRule(_localctx, 82, RULE_op3);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(512);
			match(PORCENTAGEM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_relacionalContext extends ParserRuleContext {
		public TerminalNode IGUAL() { return getToken(RegrasParser.IGUAL, 0); }
		public TerminalNode DIFERENTE() { return getToken(RegrasParser.DIFERENTE, 0); }
		public TerminalNode MAIOR_IGUAL() { return getToken(RegrasParser.MAIOR_IGUAL, 0); }
		public TerminalNode MENOR_IGUAL() { return getToken(RegrasParser.MENOR_IGUAL, 0); }
		public TerminalNode MAIOR() { return getToken(RegrasParser.MAIOR, 0); }
		public TerminalNode MENOR() { return getToken(RegrasParser.MENOR, 0); }
		public Op_relacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_relacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasListener ) ((RegrasListener)listener).enterOp_relacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasListener ) ((RegrasListener)listener).exitOp_relacional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegrasVisitor ) return ((RegrasVisitor<? extends T>)visitor).visitOp_relacional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_relacionalContext op_relacional() throws RecognitionException {
		Op_relacionalContext _localctx = new Op_relacionalContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_op_relacional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(514);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IGUAL) | (1L << DIFERENTE) | (1L << MAIOR) | (1L << MAIOR_IGUAL) | (1L << MENOR) | (1L << MENOR_IGUAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Exp_relacionalContext extends ParserRuleContext {
		public List<Exp_aritmeticaContext> exp_aritmetica() {
			return getRuleContexts(Exp_aritmeticaContext.class);
		}
		public Exp_aritmeticaContext exp_aritmetica(int i) {
			return getRuleContext(Exp_aritmeticaContext.class,i);
		}
		public Op_relacionalContext op_relacional() {
			return getRuleContext(Op_relacionalContext.class,0);
		}
		public Exp_relacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_relacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasListener ) ((RegrasListener)listener).enterExp_relacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasListener ) ((RegrasListener)listener).exitExp_relacional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegrasVisitor ) return ((RegrasVisitor<? extends T>)visitor).visitExp_relacional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exp_relacionalContext exp_relacional() throws RecognitionException {
		Exp_relacionalContext _localctx = new Exp_relacionalContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_exp_relacional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(516);
			exp_aritmetica();
			setState(520);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IGUAL) | (1L << DIFERENTE) | (1L << MAIOR) | (1L << MAIOR_IGUAL) | (1L << MENOR) | (1L << MENOR_IGUAL))) != 0)) {
				{
				setState(517);
				op_relacional();
				setState(518);
				exp_aritmetica();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fator_logicoContext extends ParserRuleContext {
		public Parcela_logicaContext parcela_logica() {
			return getRuleContext(Parcela_logicaContext.class,0);
		}
		public TerminalNode NEGACAO() { return getToken(RegrasParser.NEGACAO, 0); }
		public Fator_logicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fator_logico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasListener ) ((RegrasListener)listener).enterFator_logico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasListener ) ((RegrasListener)listener).exitFator_logico(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegrasVisitor ) return ((RegrasVisitor<? extends T>)visitor).visitFator_logico(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fator_logicoContext fator_logico() throws RecognitionException {
		Fator_logicoContext _localctx = new Fator_logicoContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_fator_logico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(523);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEGACAO) {
				{
				setState(522);
				match(NEGACAO);
				}
			}

			setState(525);
			parcela_logica();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Termo_logicoContext extends ParserRuleContext {
		public List<Fator_logicoContext> fator_logico() {
			return getRuleContexts(Fator_logicoContext.class);
		}
		public Fator_logicoContext fator_logico(int i) {
			return getRuleContext(Fator_logicoContext.class,i);
		}
		public List<Op_logico_2Context> op_logico_2() {
			return getRuleContexts(Op_logico_2Context.class);
		}
		public Op_logico_2Context op_logico_2(int i) {
			return getRuleContext(Op_logico_2Context.class,i);
		}
		public Termo_logicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo_logico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasListener ) ((RegrasListener)listener).enterTermo_logico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasListener ) ((RegrasListener)listener).exitTermo_logico(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegrasVisitor ) return ((RegrasVisitor<? extends T>)visitor).visitTermo_logico(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Termo_logicoContext termo_logico() throws RecognitionException {
		Termo_logicoContext _localctx = new Termo_logicoContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_termo_logico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(527);
			fator_logico();
			setState(533);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OU) {
				{
				{
				setState(528);
				op_logico_2();
				setState(529);
				fator_logico();
				}
				}
				setState(535);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressaoContext extends ParserRuleContext {
		public List<Termo_logicoContext> termo_logico() {
			return getRuleContexts(Termo_logicoContext.class);
		}
		public Termo_logicoContext termo_logico(int i) {
			return getRuleContext(Termo_logicoContext.class,i);
		}
		public List<Op_logico_1Context> op_logico_1() {
			return getRuleContexts(Op_logico_1Context.class);
		}
		public Op_logico_1Context op_logico_1(int i) {
			return getRuleContext(Op_logico_1Context.class,i);
		}
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasListener ) ((RegrasListener)listener).enterExpressao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasListener ) ((RegrasListener)listener).exitExpressao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegrasVisitor ) return ((RegrasVisitor<? extends T>)visitor).visitExpressao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_expressao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(536);
			termo_logico();
			setState(542);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==E) {
				{
				{
				setState(537);
				op_logico_1();
				setState(538);
				termo_logico();
				}
				}
				setState(544);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parcela_logicaContext extends ParserRuleContext {
		public TerminalNode VERDADEIRO() { return getToken(RegrasParser.VERDADEIRO, 0); }
		public TerminalNode FALSO() { return getToken(RegrasParser.FALSO, 0); }
		public Exp_relacionalContext exp_relacional() {
			return getRuleContext(Exp_relacionalContext.class,0);
		}
		public Parcela_logicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parcela_logica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasListener ) ((RegrasListener)listener).enterParcela_logica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasListener ) ((RegrasListener)listener).exitParcela_logica(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegrasVisitor ) return ((RegrasVisitor<? extends T>)visitor).visitParcela_logica(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parcela_logicaContext parcela_logica() throws RecognitionException {
		Parcela_logicaContext _localctx = new Parcela_logicaContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_parcela_logica);
		int _la;
		try {
			setState(547);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VERDADEIRO:
			case FALSO:
				enterOuterAlt(_localctx, 1);
				{
				setState(545);
				_la = _input.LA(1);
				if ( !(_la==VERDADEIRO || _la==FALSO) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case PONTEIRO:
			case SUB:
			case NUM_INT:
			case NUM_REAL:
			case ABRE_PARENTESES:
			case ENDERECO_DO_PONTEIRO:
			case IDENT:
			case CADEIA:
				enterOuterAlt(_localctx, 2);
				{
				setState(546);
				exp_relacional();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_logico_1Context extends ParserRuleContext {
		public TerminalNode E() { return getToken(RegrasParser.E, 0); }
		public Op_logico_1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_logico_1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasListener ) ((RegrasListener)listener).enterOp_logico_1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasListener ) ((RegrasListener)listener).exitOp_logico_1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegrasVisitor ) return ((RegrasVisitor<? extends T>)visitor).visitOp_logico_1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_logico_1Context op_logico_1() throws RecognitionException {
		Op_logico_1Context _localctx = new Op_logico_1Context(_ctx, getState());
		enterRule(_localctx, 96, RULE_op_logico_1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(549);
			match(E);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_logico_2Context extends ParserRuleContext {
		public TerminalNode OU() { return getToken(RegrasParser.OU, 0); }
		public Op_logico_2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_logico_2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasListener ) ((RegrasListener)listener).enterOp_logico_2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasListener ) ((RegrasListener)listener).exitOp_logico_2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegrasVisitor ) return ((RegrasVisitor<? extends T>)visitor).visitOp_logico_2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_logico_2Context op_logico_2() throws RecognitionException {
		Op_logico_2Context _localctx = new Op_logico_2Context(_ctx, getState());
		enterRule(_localctx, 98, RULE_op_logico_2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(551);
			match(OU);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3H\u022c\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\3\2\3\2"+
		"\3\3\3\3\5\3k\n\3\3\4\5\4n\n\4\3\4\3\4\3\5\3\5\5\5t\n\5\3\6\3\6\5\6x\n"+
		"\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0087\n\7\3"+
		"\b\3\b\3\b\3\b\5\b\u008d\n\b\3\b\3\b\7\b\u0091\n\b\f\b\16\b\u0094\13\b"+
		"\3\b\7\b\u0097\n\b\f\b\16\b\u009a\13\b\3\b\3\b\3\b\3\b\3\b\5\b\u00a1\n"+
		"\b\3\b\3\b\3\b\3\b\7\b\u00a7\n\b\f\b\16\b\u00aa\13\b\3\b\7\b\u00ad\n\b"+
		"\f\b\16\b\u00b0\13\b\3\b\3\b\5\b\u00b4\n\b\3\t\7\t\u00b7\n\t\f\t\16\t"+
		"\u00ba\13\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\7\13\u00c5\n\13\f"+
		"\13\16\13\u00c8\13\13\3\f\3\f\3\f\7\f\u00cd\n\f\f\f\16\f\u00d0\13\f\3"+
		"\f\3\f\3\r\5\r\u00d5\n\r\3\r\3\r\3\r\7\r\u00da\n\r\f\r\16\r\u00dd\13\r"+
		"\3\r\3\r\3\r\3\16\3\16\3\16\7\16\u00e5\n\16\f\16\16\16\u00e8\13\16\3\17"+
		"\3\17\3\17\7\17\u00ed\n\17\f\17\16\17\u00f0\13\17\3\17\3\17\3\17\3\20"+
		"\3\20\3\21\3\21\7\21\u00f9\n\21\f\21\16\21\u00fc\13\21\3\21\3\21\3\22"+
		"\7\22\u0101\n\22\f\22\16\22\u0104\13\22\3\22\7\22\u0107\n\22\f\22\16\22"+
		"\u010a\13\22\3\23\3\23\3\23\5\23\u010f\n\23\3\23\3\23\3\23\5\23\u0114"+
		"\n\23\3\23\7\23\u0117\n\23\f\23\16\23\u011a\13\23\3\23\3\23\3\24\3\24"+
		"\3\24\3\24\3\24\7\24\u0123\n\24\f\24\16\24\u0126\13\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\25\7\25\u012e\n\25\f\25\16\25\u0131\13\25\3\25\3\25\7\25"+
		"\u0135\n\25\f\25\16\25\u0138\13\25\5\25\u013a\n\25\3\25\3\25\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\7\26\u0144\n\26\f\26\16\26\u0147\13\26\5\26\u0149"+
		"\n\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u0155\n\27"+
		"\f\27\16\27\u0158\13\27\3\27\3\27\3\30\3\30\3\30\3\30\7\30\u0160\n\30"+
		"\f\30\16\30\u0163\13\30\3\30\3\30\3\31\3\31\7\31\u0169\n\31\f\31\16\31"+
		"\u016c\13\31\3\31\3\31\3\31\3\32\5\32\u0172\n\32\3\32\3\32\3\32\3\32\3"+
		"\33\3\33\3\33\3\33\3\33\7\33\u017d\n\33\f\33\16\33\u0180\13\33\3\33\3"+
		"\33\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3"+
		"\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u019b\n\35\3\36"+
		"\3\36\3\36\7\36\u01a0\n\36\f\36\16\36\u01a3\13\36\3\37\7\37\u01a6\n\37"+
		"\f\37\16\37\u01a9\13\37\3 \3 \3!\5!\u01ae\n!\3!\3!\3!\5!\u01b3\n!\3!\5"+
		"!\u01b6\n!\3\"\3\"\3\"\7\"\u01bb\n\"\f\"\16\"\u01be\13\"\3#\5#\u01c1\n"+
		"#\3#\3#\3#\3#\3#\3#\7#\u01c9\n#\f#\16#\u01cc\13#\3#\3#\3#\3#\3#\3#\3#"+
		"\3#\5#\u01d6\n#\3$\3$\3$\5$\u01db\n$\3%\5%\u01de\n%\3%\3%\5%\u01e2\n%"+
		"\3&\3&\3&\3&\7&\u01e8\n&\f&\16&\u01eb\13&\3\'\3\'\3\'\3\'\7\'\u01f1\n"+
		"\'\f\'\16\'\u01f4\13\'\3(\3(\3(\3(\7(\u01fa\n(\f(\16(\u01fd\13(\3)\3)"+
		"\3*\3*\3+\3+\3,\3,\3-\3-\3-\3-\5-\u020b\n-\3.\5.\u020e\n.\3.\3.\3/\3/"+
		"\3/\3/\7/\u0216\n/\f/\16/\u0219\13/\3\60\3\60\3\60\3\60\7\60\u021f\n\60"+
		"\f\60\16\60\u0222\13\60\3\61\3\61\5\61\u0226\n\61\3\62\3\62\3\63\3\63"+
		"\3\63\2\2\64\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64"+
		"\668:<>@BDFHJLNPRTVXZ\\^`bd\2\b\3\2\r\20\5\2\21\2289FF\3\2\63\64\3\2\65"+
		"\66\3\2-\62\3\2\21\22\2\u0248\2f\3\2\2\2\4j\3\2\2\2\6m\3\2\2\2\bs\3\2"+
		"\2\2\nw\3\2\2\2\f\u0086\3\2\2\2\16\u00b3\3\2\2\2\20\u00b8\3\2\2\2\22\u00bb"+
		"\3\2\2\2\24\u00c6\3\2\2\2\26\u00c9\3\2\2\2\30\u00d4\3\2\2\2\32\u00e1\3"+
		"\2\2\2\34\u00e9\3\2\2\2\36\u00f4\3\2\2\2 \u00f6\3\2\2\2\"\u0102\3\2\2"+
		"\2$\u010b\3\2\2\2&\u011d\3\2\2\2(\u0129\3\2\2\2*\u013d\3\2\2\2,\u014c"+
		"\3\2\2\2.\u015b\3\2\2\2\60\u0166\3\2\2\2\62\u0171\3\2\2\2\64\u0177\3\2"+
		"\2\2\66\u0183\3\2\2\28\u019a\3\2\2\2:\u019c\3\2\2\2<\u01a7\3\2\2\2>\u01aa"+
		"\3\2\2\2@\u01ad\3\2\2\2B\u01b7\3\2\2\2D\u01d5\3\2\2\2F\u01da\3\2\2\2H"+
		"\u01e1\3\2\2\2J\u01e3\3\2\2\2L\u01ec\3\2\2\2N\u01f5\3\2\2\2P\u01fe\3\2"+
		"\2\2R\u0200\3\2\2\2T\u0202\3\2\2\2V\u0204\3\2\2\2X\u0206\3\2\2\2Z\u020d"+
		"\3\2\2\2\\\u0211\3\2\2\2^\u021a\3\2\2\2`\u0225\3\2\2\2b\u0227\3\2\2\2"+
		"d\u0229\3\2\2\2fg\t\2\2\2g\3\3\2\2\2hk\5\2\2\2ik\7B\2\2jh\3\2\2\2ji\3"+
		"\2\2\2k\5\3\2\2\2ln\7\f\2\2ml\3\2\2\2mn\3\2\2\2no\3\2\2\2op\5\4\3\2p\7"+
		"\3\2\2\2qt\5 \21\2rt\5\6\4\2sq\3\2\2\2sr\3\2\2\2t\t\3\2\2\2ux\5\16\b\2"+
		"vx\5\f\7\2wu\3\2\2\2wv\3\2\2\2x\13\3\2\2\2yz\7\5\2\2z\u0087\5\34\17\2"+
		"{|\7\n\2\2|}\7B\2\2}~\7\6\2\2~\177\5\2\2\2\177\u0080\7-\2\2\u0080\u0081"+
		"\5\36\20\2\u0081\u0087\3\2\2\2\u0082\u0083\7\13\2\2\u0083\u0084\7B\2\2"+
		"\u0084\u0085\7\6\2\2\u0085\u0087\5\b\5\2\u0086y\3\2\2\2\u0086{\3\2\2\2"+
		"\u0086\u0082\3\2\2\2\u0087\r\3\2\2\2\u0088\u0089\7\25\2\2\u0089\u008a"+
		"\7B\2\2\u008a\u008c\7:\2\2\u008b\u008d\5\32\16\2\u008c\u008b\3\2\2\2\u008c"+
		"\u008d\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u0092\7;\2\2\u008f\u0091\5\f"+
		"\7\2\u0090\u008f\3\2\2\2\u0091\u0094\3\2\2\2\u0092\u0090\3\2\2\2\u0092"+
		"\u0093\3\2\2\2\u0093\u0098\3\2\2\2\u0094\u0092\3\2\2\2\u0095\u0097\58"+
		"\35\2\u0096\u0095\3\2\2\2\u0097\u009a\3\2\2\2\u0098\u0096\3\2\2\2\u0098"+
		"\u0099\3\2\2\2\u0099\u009b\3\2\2\2\u009a\u0098\3\2\2\2\u009b\u00b4\7\26"+
		"\2\2\u009c\u009d\7\27\2\2\u009d\u009e\7B\2\2\u009e\u00a0\7:\2\2\u009f"+
		"\u00a1\5\32\16\2\u00a0\u009f\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2\3"+
		"\2\2\2\u00a2\u00a3\7;\2\2\u00a3\u00a4\7\6\2\2\u00a4\u00a8\5\6\4\2\u00a5"+
		"\u00a7\5\f\7\2\u00a6\u00a5\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8\u00a6\3\2"+
		"\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00ae\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab"+
		"\u00ad\58\35\2\u00ac\u00ab\3\2\2\2\u00ad\u00b0\3\2\2\2\u00ae\u00ac\3\2"+
		"\2\2\u00ae\u00af\3\2\2\2\u00af\u00b1\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b1"+
		"\u00b2\7\32\2\2\u00b2\u00b4\3\2\2\2\u00b3\u0088\3\2\2\2\u00b3\u009c\3"+
		"\2\2\2\u00b4\17\3\2\2\2\u00b5\u00b7\5\n\6\2\u00b6\u00b5\3\2\2\2\u00b7"+
		"\u00ba\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\21\3\2\2"+
		"\2\u00ba\u00b8\3\2\2\2\u00bb\u00bc\5\20\t\2\u00bc\u00bd\7\3\2\2\u00bd"+
		"\u00be\5\"\22\2\u00be\u00bf\7@\2\2\u00bf\23\3\2\2\2\u00c0\u00c1\7<\2\2"+
		"\u00c1\u00c2\5N(\2\u00c2\u00c3\7=\2\2\u00c3\u00c5\3\2\2\2\u00c4\u00c0"+
		"\3\2\2\2\u00c5\u00c8\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7"+
		"\25\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c9\u00ce\7B\2\2\u00ca\u00cb\7\b\2\2"+
		"\u00cb\u00cd\7B\2\2\u00cc\u00ca\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cc"+
		"\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d1\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1"+
		"\u00d2\5\24\13\2\u00d2\27\3\2\2\2\u00d3\u00d5\7?\2\2\u00d4\u00d3\3\2\2"+
		"\2\u00d4\u00d5\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00db\5\26\f\2\u00d7"+
		"\u00d8\7\7\2\2\u00d8\u00da\5\26\f\2\u00d9\u00d7\3\2\2\2\u00da\u00dd\3"+
		"\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00de\3\2\2\2\u00dd"+
		"\u00db\3\2\2\2\u00de\u00df\7\6\2\2\u00df\u00e0\5\6\4\2\u00e0\31\3\2\2"+
		"\2\u00e1\u00e6\5\30\r\2\u00e2\u00e3\7\7\2\2\u00e3\u00e5\5\30\r\2\u00e4"+
		"\u00e2\3\2\2\2\u00e5\u00e8\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2"+
		"\2\2\u00e7\33\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e9\u00ee\5\26\f\2\u00ea\u00eb"+
		"\7\7\2\2\u00eb\u00ed\5\26\f\2\u00ec\u00ea\3\2\2\2\u00ed\u00f0\3\2\2\2"+
		"\u00ee\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f1\3\2\2\2\u00f0\u00ee"+
		"\3\2\2\2\u00f1\u00f2\7\6\2\2\u00f2\u00f3\5\b\5\2\u00f3\35\3\2\2\2\u00f4"+
		"\u00f5\t\3\2\2\u00f5\37\3\2\2\2\u00f6\u00fa\7\23\2\2\u00f7\u00f9\5\34"+
		"\17\2\u00f8\u00f7\3\2\2\2\u00f9\u00fc\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa"+
		"\u00fb\3\2\2\2\u00fb\u00fd\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fd\u00fe\7\24"+
		"\2\2\u00fe!\3\2\2\2\u00ff\u0101\5\f\7\2\u0100\u00ff\3\2\2\2\u0101\u0104"+
		"\3\2\2\2\u0102\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0108\3\2\2\2\u0104"+
		"\u0102\3\2\2\2\u0105\u0107\58\35\2\u0106\u0105\3\2\2\2\u0107\u010a\3\2"+
		"\2\2\u0108\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109#\3\2\2\2\u010a\u0108"+
		"\3\2\2\2\u010b\u010c\7\33\2\2\u010c\u010e\7:\2\2\u010d\u010f\7\f\2\2\u010e"+
		"\u010d\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0118\5\26"+
		"\f\2\u0111\u0113\7\7\2\2\u0112\u0114\7\f\2\2\u0113\u0112\3\2\2\2\u0113"+
		"\u0114\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0117\5\26\f\2\u0116\u0111\3"+
		"\2\2\2\u0117\u011a\3\2\2\2\u0118\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119"+
		"\u011b\3\2\2\2\u011a\u0118\3\2\2\2\u011b\u011c\7;\2\2\u011c%\3\2\2\2\u011d"+
		"\u011e\7\34\2\2\u011e\u011f\7:\2\2\u011f\u0124\5^\60\2\u0120\u0121\7\7"+
		"\2\2\u0121\u0123\5^\60\2\u0122\u0120\3\2\2\2\u0123\u0126\3\2\2\2\u0124"+
		"\u0122\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0127\3\2\2\2\u0126\u0124\3\2"+
		"\2\2\u0127\u0128\7;\2\2\u0128\'\3\2\2\2\u0129\u012a\7\35\2\2\u012a\u012b"+
		"\5^\60\2\u012b\u012f\7\36\2\2\u012c\u012e\58\35\2\u012d\u012c\3\2\2\2"+
		"\u012e\u0131\3\2\2\2\u012f\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0139"+
		"\3\2\2\2\u0131\u012f\3\2\2\2\u0132\u0136\7\37\2\2\u0133\u0135\58\35\2"+
		"\u0134\u0133\3\2\2\2\u0135\u0138\3\2\2\2\u0136\u0134\3\2\2\2\u0136\u0137"+
		"\3\2\2\2\u0137\u013a\3\2\2\2\u0138\u0136\3\2\2\2\u0139\u0132\3\2\2\2\u0139"+
		"\u013a\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u013c\7 \2\2\u013c)\3\2\2\2\u013d"+
		"\u013e\7!\2\2\u013e\u013f\5N(\2\u013f\u0140\7\"\2\2\u0140\u0148\5<\37"+
		"\2\u0141\u0145\7\37\2\2\u0142\u0144\58\35\2\u0143\u0142\3\2\2\2\u0144"+
		"\u0147\3\2\2\2\u0145\u0143\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0149\3\2"+
		"\2\2\u0147\u0145\3\2\2\2\u0148\u0141\3\2\2\2\u0148\u0149\3\2\2\2\u0149"+
		"\u014a\3\2\2\2\u014a\u014b\7#\2\2\u014b+\3\2\2\2\u014c\u014d\7$\2\2\u014d"+
		"\u014e\7B\2\2\u014e\u014f\7\67\2\2\u014f\u0150\5N(\2\u0150\u0151\7%\2"+
		"\2\u0151\u0152\5N(\2\u0152\u0156\7&\2\2\u0153\u0155\58\35\2\u0154\u0153"+
		"\3\2\2\2\u0155\u0158\3\2\2\2\u0156\u0154\3\2\2\2\u0156\u0157\3\2\2\2\u0157"+
		"\u0159\3\2\2\2\u0158\u0156\3\2\2\2\u0159\u015a\7\'\2\2\u015a-\3\2\2\2"+
		"\u015b\u015c\7(\2\2\u015c\u015d\5^\60\2\u015d\u0161\7&\2\2\u015e\u0160"+
		"\58\35\2\u015f\u015e\3\2\2\2\u0160\u0163\3\2\2\2\u0161\u015f\3\2\2\2\u0161"+
		"\u0162\3\2\2\2\u0162\u0164\3\2\2\2\u0163\u0161\3\2\2\2\u0164\u0165\7)"+
		"\2\2\u0165/\3\2\2\2\u0166\u016a\7&\2\2\u0167\u0169\58\35\2\u0168\u0167"+
		"\3\2\2\2\u0169\u016c\3\2\2\2\u016a\u0168\3\2\2\2\u016a\u016b\3\2\2\2\u016b"+
		"\u016d\3\2\2\2\u016c\u016a\3\2\2\2\u016d\u016e\7%\2\2\u016e\u016f\5^\60"+
		"\2\u016f\61\3\2\2\2\u0170\u0172\7\f\2\2\u0171\u0170\3\2\2\2\u0171\u0172"+
		"\3\2\2\2\u0172\u0173\3\2\2\2\u0173\u0174\5\26\f\2\u0174\u0175\7\67\2\2"+
		"\u0175\u0176\5^\60\2\u0176\63\3\2\2\2\u0177\u0178\7B\2\2\u0178\u0179\7"+
		":\2\2\u0179\u017e\5^\60\2\u017a\u017b\7\7\2\2\u017b\u017d\5^\60\2\u017c"+
		"\u017a\3\2\2\2\u017d\u0180\3\2\2\2\u017e\u017c\3\2\2\2\u017e\u017f\3\2"+
		"\2\2\u017f\u0181\3\2\2\2\u0180\u017e\3\2\2\2\u0181\u0182\7;\2\2\u0182"+
		"\65\3\2\2\2\u0183\u0184\7\31\2\2\u0184\u0185\5^\60\2\u0185\67\3\2\2\2"+
		"\u0186\u019b\5$\23\2\u0187\u019b\5&\24\2\u0188\u019b\5(\25\2\u0189\u019b"+
		"\5*\26\2\u018a\u019b\5,\27\2\u018b\u019b\5.\30\2\u018c\u019b\5\60\31\2"+
		"\u018d\u019b\5\62\32\2\u018e\u019b\5\64\33\2\u018f\u019b\5\66\34\2\u0190"+
		"\u019b\5$\23\2\u0191\u019b\5&\24\2\u0192\u019b\5(\25\2\u0193\u019b\5*"+
		"\26\2\u0194\u019b\5,\27\2\u0195\u019b\5.\30\2\u0196\u019b\5\60\31\2\u0197"+
		"\u019b\5\62\32\2\u0198\u019b\5\64\33\2\u0199\u019b\5\66\34\2\u019a\u0186"+
		"\3\2\2\2\u019a\u0187\3\2\2\2\u019a\u0188\3\2\2\2\u019a\u0189\3\2\2\2\u019a"+
		"\u018a\3\2\2\2\u019a\u018b\3\2\2\2\u019a\u018c\3\2\2\2\u019a\u018d\3\2"+
		"\2\2\u019a\u018e\3\2\2\2\u019a\u018f\3\2\2\2\u019a\u0190\3\2\2\2\u019a"+
		"\u0191\3\2\2\2\u019a\u0192\3\2\2\2\u019a\u0193\3\2\2\2\u019a\u0194\3\2"+
		"\2\2\u019a\u0195\3\2\2\2\u019a\u0196\3\2\2\2\u019a\u0197\3\2\2\2\u019a"+
		"\u0198\3\2\2\2\u019a\u0199\3\2\2\2\u019b9\3\2\2\2\u019c\u019d\5B\"\2\u019d"+
		"\u01a1\7\6\2\2\u019e\u01a0\58\35\2\u019f\u019e\3\2\2\2\u01a0\u01a3\3\2"+
		"\2\2\u01a1\u019f\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2;\3\2\2\2\u01a3\u01a1"+
		"\3\2\2\2\u01a4\u01a6\5:\36\2\u01a5\u01a4\3\2\2\2\u01a6\u01a9\3\2\2\2\u01a7"+
		"\u01a5\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8=\3\2\2\2\u01a9\u01a7\3\2\2\2"+
		"\u01aa\u01ab\7\64\2\2\u01ab?\3\2\2\2\u01ac\u01ae\5> \2\u01ad\u01ac\3\2"+
		"\2\2\u01ad\u01ae\3\2\2\2\u01ae\u01af\3\2\2\2\u01af\u01b5\78\2\2\u01b0"+
		"\u01b2\7\t\2\2\u01b1\u01b3\5> \2\u01b2\u01b1\3\2\2\2\u01b2\u01b3\3\2\2"+
		"\2\u01b3\u01b4\3\2\2\2\u01b4\u01b6\78\2\2\u01b5\u01b0\3\2\2\2\u01b5\u01b6"+
		"\3\2\2\2\u01b6A\3\2\2\2\u01b7\u01bc\5@!\2\u01b8\u01b9\7\7\2\2\u01b9\u01bb"+
		"\5@!\2\u01ba\u01b8\3\2\2\2\u01bb\u01be\3\2\2\2\u01bc\u01ba\3\2\2\2\u01bc"+
		"\u01bd\3\2\2\2\u01bdC\3\2\2\2\u01be\u01bc\3\2\2\2\u01bf\u01c1\7\f\2\2"+
		"\u01c0\u01bf\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2\u01d6"+
		"\5\26\f\2\u01c3\u01c4\7B\2\2\u01c4\u01c5\7:\2\2\u01c5\u01ca\5^\60\2\u01c6"+
		"\u01c7\7\7\2\2\u01c7\u01c9\5^\60\2\u01c8\u01c6\3\2\2\2\u01c9\u01cc\3\2"+
		"\2\2\u01ca\u01c8\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb\u01cd\3\2\2\2\u01cc"+
		"\u01ca\3\2\2\2\u01cd\u01ce\7;\2\2\u01ce\u01d6\3\2\2\2\u01cf\u01d6\78\2"+
		"\2\u01d0\u01d6\79\2\2\u01d1\u01d2\7:\2\2\u01d2\u01d3\5^\60\2\u01d3\u01d4"+
		"\7;\2\2\u01d4\u01d6\3\2\2\2\u01d5\u01c0\3\2\2\2\u01d5\u01c3\3\2\2\2\u01d5"+
		"\u01cf\3\2\2\2\u01d5\u01d0\3\2\2\2\u01d5\u01d1\3\2\2\2\u01d6E\3\2\2\2"+
		"\u01d7\u01d8\7A\2\2\u01d8\u01db\5\26\f\2\u01d9\u01db\7F\2\2\u01da\u01d7"+
		"\3\2\2\2\u01da\u01d9\3\2\2\2\u01dbG\3\2\2\2\u01dc\u01de\5> \2\u01dd\u01dc"+
		"\3\2\2\2\u01dd\u01de\3\2\2\2\u01de\u01df\3\2\2\2\u01df\u01e2\5D#\2\u01e0"+
		"\u01e2\5F$\2\u01e1\u01dd\3\2\2\2\u01e1\u01e0\3\2\2\2\u01e2I\3\2\2\2\u01e3"+
		"\u01e9\5H%\2\u01e4\u01e5\5T+\2\u01e5\u01e6\5H%\2\u01e6\u01e8\3\2\2\2\u01e7"+
		"\u01e4\3\2\2\2\u01e8\u01eb\3\2\2\2\u01e9\u01e7\3\2\2\2\u01e9\u01ea\3\2"+
		"\2\2\u01eaK\3\2\2\2\u01eb\u01e9\3\2\2\2\u01ec\u01f2\5J&\2\u01ed\u01ee"+
		"\5R*\2\u01ee\u01ef\5J&\2\u01ef\u01f1\3\2\2\2\u01f0\u01ed\3\2\2\2\u01f1"+
		"\u01f4\3\2\2\2\u01f2\u01f0\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3M\3\2\2\2"+
		"\u01f4\u01f2\3\2\2\2\u01f5\u01fb\5L\'\2\u01f6\u01f7\5P)\2\u01f7\u01f8"+
		"\5L\'\2\u01f8\u01fa\3\2\2\2\u01f9\u01f6\3\2\2\2\u01fa\u01fd\3\2\2\2\u01fb"+
		"\u01f9\3\2\2\2\u01fb\u01fc\3\2\2\2\u01fcO\3\2\2\2\u01fd\u01fb\3\2\2\2"+
		"\u01fe\u01ff\t\4\2\2\u01ffQ\3\2\2\2\u0200\u0201\t\5\2\2\u0201S\3\2\2\2"+
		"\u0202\u0203\7>\2\2\u0203U\3\2\2\2\u0204\u0205\t\6\2\2\u0205W\3\2\2\2"+
		"\u0206\u020a\5N(\2\u0207\u0208\5V,\2\u0208\u0209\5N(\2\u0209\u020b\3\2"+
		"\2\2\u020a\u0207\3\2\2\2\u020a\u020b\3\2\2\2\u020bY\3\2\2\2\u020c\u020e"+
		"\7,\2\2\u020d\u020c\3\2\2\2\u020d\u020e\3\2\2\2\u020e\u020f\3\2\2\2\u020f"+
		"\u0210\5`\61\2\u0210[\3\2\2\2\u0211\u0217\5Z.\2\u0212\u0213\5d\63\2\u0213"+
		"\u0214\5Z.\2\u0214\u0216\3\2\2\2\u0215\u0212\3\2\2\2\u0216\u0219\3\2\2"+
		"\2\u0217\u0215\3\2\2\2\u0217\u0218\3\2\2\2\u0218]\3\2\2\2\u0219\u0217"+
		"\3\2\2\2\u021a\u0220\5\\/\2\u021b\u021c\5b\62\2\u021c\u021d\5\\/\2\u021d"+
		"\u021f\3\2\2\2\u021e\u021b\3\2\2\2\u021f\u0222\3\2\2\2\u0220\u021e\3\2"+
		"\2\2\u0220\u0221\3\2\2\2\u0221_\3\2\2\2\u0222\u0220\3\2\2\2\u0223\u0226"+
		"\t\7\2\2\u0224\u0226\5X-\2\u0225\u0223\3\2\2\2\u0225\u0224\3\2\2\2\u0226"+
		"a\3\2\2\2\u0227\u0228\7*\2\2\u0228c\3\2\2\2\u0229\u022a\7+\2\2\u022ae"+
		"\3\2\2\2;jmsw\u0086\u008c\u0092\u0098\u00a0\u00a8\u00ae\u00b3\u00b8\u00c6"+
		"\u00ce\u00d4\u00db\u00e6\u00ee\u00fa\u0102\u0108\u010e\u0113\u0118\u0124"+
		"\u012f\u0136\u0139\u0145\u0148\u0156\u0161\u016a\u0171\u017e\u019a\u01a1"+
		"\u01a7\u01ad\u01b2\u01b5\u01bc\u01c0\u01ca\u01d5\u01da\u01dd\u01e1\u01e9"+
		"\u01f2\u01fb\u020a\u020d\u0217\u0220\u0225";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}