// Generated from br/ufscar/dc/compiladores/compiladorAlguma/RegrasLexicas.g4 by ANTLR 4.9.1
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
public class RegrasLexicasParser extends Parser {
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
		RULE_tipo = 3, RULE_declaracao_local = 4, RULE_declaracao_global = 5, 
		RULE_decl_local_global = 6, RULE_declaracoes = 7, RULE_programa = 8, RULE_dimensao = 9, 
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
			"tipo_basico", "tipo_basico_ident", "tipo_estendido", "tipo", "declaracao_local", 
			"declaracao_global", "decl_local_global", "declaracoes", "programa", 
			"dimensao", "identificador", "parametro", "parametros", "variavel", "valor_constante", 
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
	public String getGrammarFileName() { return "RegrasLexicas.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public RegrasLexicasParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class Tipo_basicoContext extends ParserRuleContext {
		public TerminalNode LITERAL() { return getToken(RegrasLexicasParser.LITERAL, 0); }
		public TerminalNode INTEIRO() { return getToken(RegrasLexicasParser.INTEIRO, 0); }
		public TerminalNode REAL() { return getToken(RegrasLexicasParser.REAL, 0); }
		public TerminalNode LOGICO() { return getToken(RegrasLexicasParser.LOGICO, 0); }
		public Tipo_basicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_basico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasLexicasListener ) ((RegrasLexicasListener)listener).enterTipo_basico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasLexicasListener ) ((RegrasLexicasListener)listener).exitTipo_basico(this);
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
		public TerminalNode IDENT() { return getToken(RegrasLexicasParser.IDENT, 0); }
		public Tipo_basico_identContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_basico_ident; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasLexicasListener ) ((RegrasLexicasListener)listener).enterTipo_basico_ident(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasLexicasListener ) ((RegrasLexicasListener)listener).exitTipo_basico_ident(this);
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
		public TerminalNode PONTEIRO() { return getToken(RegrasLexicasParser.PONTEIRO, 0); }
		public Tipo_estendidoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_estendido; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasLexicasListener ) ((RegrasLexicasListener)listener).enterTipo_estendido(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasLexicasListener ) ((RegrasLexicasListener)listener).exitTipo_estendido(this);
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
			if ( listener instanceof RegrasLexicasListener ) ((RegrasLexicasListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasLexicasListener ) ((RegrasLexicasListener)listener).exitTipo(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_tipo);
		try {
			setState(113);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VERDADEIRO:
			case FALSO:
			case NUM_INT:
			case NUM_REAL:
			case CADEIA:
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

	public static class Declaracao_localContext extends ParserRuleContext {
		public TerminalNode DECLARE() { return getToken(RegrasLexicasParser.DECLARE, 0); }
		public VariavelContext variavel() {
			return getRuleContext(VariavelContext.class,0);
		}
		public TerminalNode CONSTANTE() { return getToken(RegrasLexicasParser.CONSTANTE, 0); }
		public TerminalNode IDENT() { return getToken(RegrasLexicasParser.IDENT, 0); }
		public TerminalNode DELIM() { return getToken(RegrasLexicasParser.DELIM, 0); }
		public Tipo_basicoContext tipo_basico() {
			return getRuleContext(Tipo_basicoContext.class,0);
		}
		public TerminalNode IGUAL() { return getToken(RegrasLexicasParser.IGUAL, 0); }
		public Valor_constanteContext valor_constante() {
			return getRuleContext(Valor_constanteContext.class,0);
		}
		public TerminalNode TIPO() { return getToken(RegrasLexicasParser.TIPO, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public Declaracao_localContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao_local; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasLexicasListener ) ((RegrasLexicasListener)listener).enterDeclaracao_local(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasLexicasListener ) ((RegrasLexicasListener)listener).exitDeclaracao_local(this);
		}
	}

	public final Declaracao_localContext declaracao_local() throws RecognitionException {
		Declaracao_localContext _localctx = new Declaracao_localContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declaracao_local);
		try {
			setState(128);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECLARE:
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				match(DECLARE);
				setState(116);
				variavel();
				}
				break;
			case CONSTANTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				match(CONSTANTE);
				setState(118);
				match(IDENT);
				setState(119);
				match(DELIM);
				setState(120);
				tipo_basico();
				setState(121);
				match(IGUAL);
				setState(122);
				valor_constante();
				}
				break;
			case TIPO:
				enterOuterAlt(_localctx, 3);
				{
				setState(124);
				match(TIPO);
				setState(125);
				match(IDENT);
				setState(126);
				match(DELIM);
				setState(127);
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
		public TerminalNode PROCEDIMENTO() { return getToken(RegrasLexicasParser.PROCEDIMENTO, 0); }
		public TerminalNode IDENT() { return getToken(RegrasLexicasParser.IDENT, 0); }
		public TerminalNode ABRE_PARENTESES() { return getToken(RegrasLexicasParser.ABRE_PARENTESES, 0); }
		public TerminalNode FECHA_PARENTESES() { return getToken(RegrasLexicasParser.FECHA_PARENTESES, 0); }
		public TerminalNode FIM_PROCEDIMENTO() { return getToken(RegrasLexicasParser.FIM_PROCEDIMENTO, 0); }
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
		public TerminalNode FUNCAO() { return getToken(RegrasLexicasParser.FUNCAO, 0); }
		public TerminalNode DELIM() { return getToken(RegrasLexicasParser.DELIM, 0); }
		public Tipo_estendidoContext tipo_estendido() {
			return getRuleContext(Tipo_estendidoContext.class,0);
		}
		public TerminalNode FIM_FUNÇÃO() { return getToken(RegrasLexicasParser.FIM_FUNÇÃO, 0); }
		public Declaracao_globalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao_global; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasLexicasListener ) ((RegrasLexicasListener)listener).enterDeclaracao_global(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasLexicasListener ) ((RegrasLexicasListener)listener).exitDeclaracao_global(this);
		}
	}

	public final Declaracao_globalContext declaracao_global() throws RecognitionException {
		Declaracao_globalContext _localctx = new Declaracao_globalContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_declaracao_global);
		int _la;
		try {
			setState(173);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PROCEDIMENTO:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				match(PROCEDIMENTO);
				setState(131);
				match(IDENT);
				setState(132);
				match(ABRE_PARENTESES);
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR || _la==IDENT) {
					{
					setState(133);
					parametros();
					}
				}

				setState(136);
				match(FECHA_PARENTESES);
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DECLARE) | (1L << CONSTANTE) | (1L << TIPO))) != 0)) {
					{
					{
					setState(137);
					declaracao_local();
					}
					}
					setState(142);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & ((1L << (PONTEIRO - 10)) | (1L << (RETORNE - 10)) | (1L << (LEIA - 10)) | (1L << (ESCREVA - 10)) | (1L << (SE - 10)) | (1L << (CASO - 10)) | (1L << (PARA - 10)) | (1L << (FACA - 10)) | (1L << (ENQUANTO - 10)) | (1L << (IDENT - 10)))) != 0)) {
					{
					{
					setState(143);
					cmd();
					}
					}
					setState(148);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(149);
				match(FIM_PROCEDIMENTO);
				}
				break;
			case FUNCAO:
				enterOuterAlt(_localctx, 2);
				{
				setState(150);
				match(FUNCAO);
				setState(151);
				match(IDENT);
				setState(152);
				match(ABRE_PARENTESES);
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR || _la==IDENT) {
					{
					setState(153);
					parametros();
					}
				}

				setState(156);
				match(FECHA_PARENTESES);
				setState(157);
				match(DELIM);
				setState(158);
				tipo_estendido();
				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DECLARE) | (1L << CONSTANTE) | (1L << TIPO))) != 0)) {
					{
					{
					setState(159);
					declaracao_local();
					}
					}
					setState(164);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(168);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & ((1L << (PONTEIRO - 10)) | (1L << (RETORNE - 10)) | (1L << (LEIA - 10)) | (1L << (ESCREVA - 10)) | (1L << (SE - 10)) | (1L << (CASO - 10)) | (1L << (PARA - 10)) | (1L << (FACA - 10)) | (1L << (ENQUANTO - 10)) | (1L << (IDENT - 10)))) != 0)) {
					{
					{
					setState(165);
					cmd();
					}
					}
					setState(170);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(171);
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
			if ( listener instanceof RegrasLexicasListener ) ((RegrasLexicasListener)listener).enterDecl_local_global(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasLexicasListener ) ((RegrasLexicasListener)listener).exitDecl_local_global(this);
		}
	}

	public final Decl_local_globalContext decl_local_global() throws RecognitionException {
		Decl_local_globalContext _localctx = new Decl_local_globalContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_decl_local_global);
		try {
			setState(177);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PROCEDIMENTO:
			case FUNCAO:
				enterOuterAlt(_localctx, 1);
				{
				setState(175);
				declaracao_global();
				}
				break;
			case DECLARE:
			case CONSTANTE:
			case TIPO:
				enterOuterAlt(_localctx, 2);
				{
				setState(176);
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
			if ( listener instanceof RegrasLexicasListener ) ((RegrasLexicasListener)listener).enterDeclaracoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasLexicasListener ) ((RegrasLexicasListener)listener).exitDeclaracoes(this);
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
		public TerminalNode ALGORITMO() { return getToken(RegrasLexicasParser.ALGORITMO, 0); }
		public CorpoContext corpo() {
			return getRuleContext(CorpoContext.class,0);
		}
		public TerminalNode FIM_ALGORITMO() { return getToken(RegrasLexicasParser.FIM_ALGORITMO, 0); }
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasLexicasListener ) ((RegrasLexicasListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasLexicasListener ) ((RegrasLexicasListener)listener).exitPrograma(this);
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
		public List<TerminalNode> ABRE_COLCHETES() { return getTokens(RegrasLexicasParser.ABRE_COLCHETES); }
		public TerminalNode ABRE_COLCHETES(int i) {
			return getToken(RegrasLexicasParser.ABRE_COLCHETES, i);
		}
		public List<Exp_aritmeticaContext> exp_aritmetica() {
			return getRuleContexts(Exp_aritmeticaContext.class);
		}
		public Exp_aritmeticaContext exp_aritmetica(int i) {
			return getRuleContext(Exp_aritmeticaContext.class,i);
		}
		public List<TerminalNode> FECHA_COLCHETES() { return getTokens(RegrasLexicasParser.FECHA_COLCHETES); }
		public TerminalNode FECHA_COLCHETES(int i) {
			return getToken(RegrasLexicasParser.FECHA_COLCHETES, i);
		}
		public DimensaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimensao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasLexicasListener ) ((RegrasLexicasListener)listener).enterDimensao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasLexicasListener ) ((RegrasLexicasListener)listener).exitDimensao(this);
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
		public List<TerminalNode> IDENT() { return getTokens(RegrasLexicasParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(RegrasLexicasParser.IDENT, i);
		}
		public DimensaoContext dimensao() {
			return getRuleContext(DimensaoContext.class,0);
		}
		public List<TerminalNode> PONTO() { return getTokens(RegrasLexicasParser.PONTO); }
		public TerminalNode PONTO(int i) {
			return getToken(RegrasLexicasParser.PONTO, i);
		}
		public IdentificadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identificador; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasLexicasListener ) ((RegrasLexicasListener)listener).enterIdentificador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasLexicasListener ) ((RegrasLexicasListener)listener).exitIdentificador(this);
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
		public TerminalNode FECHA_PARENTESES() { return getToken(RegrasLexicasParser.FECHA_PARENTESES, 0); }
		public TerminalNode VAR() { return getToken(RegrasLexicasParser.VAR, 0); }
		public List<TerminalNode> VIRGULA() { return getTokens(RegrasLexicasParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(RegrasLexicasParser.VIRGULA, i);
		}
		public List<TerminalNode> PONTEIRO() { return getTokens(RegrasLexicasParser.PONTEIRO); }
		public TerminalNode PONTEIRO(int i) {
			return getToken(RegrasLexicasParser.PONTEIRO, i);
		}
		public ParametroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasLexicasListener ) ((RegrasLexicasListener)listener).enterParametro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasLexicasListener ) ((RegrasLexicasListener)listener).exitParametro(this);
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
			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(213);
				match(VIRGULA);
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PONTEIRO) {
					{
					setState(214);
					match(PONTEIRO);
					}
				}

				setState(217);
				identificador();
				}
				}
				setState(222);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(223);
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

	public static class ParametrosContext extends ParserRuleContext {
		public List<ParametroContext> parametro() {
			return getRuleContexts(ParametroContext.class);
		}
		public ParametroContext parametro(int i) {
			return getRuleContext(ParametroContext.class,i);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(RegrasLexicasParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(RegrasLexicasParser.VIRGULA, i);
		}
		public ParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasLexicasListener ) ((RegrasLexicasListener)listener).enterParametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasLexicasListener ) ((RegrasLexicasListener)listener).exitParametros(this);
		}
	}

	public final ParametrosContext parametros() throws RecognitionException {
		ParametrosContext _localctx = new ParametrosContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_parametros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			parametro();
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(226);
				match(VIRGULA);
				setState(227);
				parametro();
				}
				}
				setState(232);
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
		public TerminalNode DELIM() { return getToken(RegrasLexicasParser.DELIM, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(RegrasLexicasParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(RegrasLexicasParser.VIRGULA, i);
		}
		public VariavelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variavel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasLexicasListener ) ((RegrasLexicasListener)listener).enterVariavel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasLexicasListener ) ((RegrasLexicasListener)listener).exitVariavel(this);
		}
	}

	public final VariavelContext variavel() throws RecognitionException {
		VariavelContext _localctx = new VariavelContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_variavel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			identificador();
			setState(238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(234);
				match(VIRGULA);
				setState(235);
				identificador();
				}
				}
				setState(240);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(241);
			match(DELIM);
			setState(242);
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
		public Tipo_basico_identContext tipo_basico_ident() {
			return getRuleContext(Tipo_basico_identContext.class,0);
		}
		public TerminalNode PONTEIRO() { return getToken(RegrasLexicasParser.PONTEIRO, 0); }
		public Valor_constanteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor_constante; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasLexicasListener ) ((RegrasLexicasListener)listener).enterValor_constante(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasLexicasListener ) ((RegrasLexicasListener)listener).exitValor_constante(this);
		}
	}

	public final Valor_constanteContext valor_constante() throws RecognitionException {
		Valor_constanteContext _localctx = new Valor_constanteContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_valor_constante);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PONTEIRO) {
				{
				setState(244);
				match(PONTEIRO);
				}
			}

			setState(247);
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

	public static class RegistroContext extends ParserRuleContext {
		public TerminalNode CADEIA() { return getToken(RegrasLexicasParser.CADEIA, 0); }
		public TerminalNode NUM_INT() { return getToken(RegrasLexicasParser.NUM_INT, 0); }
		public TerminalNode NUM_REAL() { return getToken(RegrasLexicasParser.NUM_REAL, 0); }
		public TerminalNode VERDADEIRO() { return getToken(RegrasLexicasParser.VERDADEIRO, 0); }
		public TerminalNode FALSO() { return getToken(RegrasLexicasParser.FALSO, 0); }
		public RegistroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_registro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasLexicasListener ) ((RegrasLexicasListener)listener).enterRegistro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasLexicasListener ) ((RegrasLexicasListener)listener).exitRegistro(this);
		}
	}

	public final RegistroContext registro() throws RecognitionException {
		RegistroContext _localctx = new RegistroContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_registro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
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
			if ( listener instanceof RegrasLexicasListener ) ((RegrasLexicasListener)listener).enterCorpo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasLexicasListener ) ((RegrasLexicasListener)listener).exitCorpo(this);
		}
	}

	public final CorpoContext corpo() throws RecognitionException {
		CorpoContext _localctx = new CorpoContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_corpo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DECLARE) | (1L << CONSTANTE) | (1L << TIPO))) != 0)) {
				{
				{
				setState(251);
				declaracao_local();
				}
				}
				setState(256);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & ((1L << (PONTEIRO - 10)) | (1L << (RETORNE - 10)) | (1L << (LEIA - 10)) | (1L << (ESCREVA - 10)) | (1L << (SE - 10)) | (1L << (CASO - 10)) | (1L << (PARA - 10)) | (1L << (FACA - 10)) | (1L << (ENQUANTO - 10)) | (1L << (IDENT - 10)))) != 0)) {
				{
				{
				setState(257);
				cmd();
				}
				}
				setState(262);
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
		public TerminalNode LEIA() { return getToken(RegrasLexicasParser.LEIA, 0); }
		public TerminalNode ABRE_PARENTESES() { return getToken(RegrasLexicasParser.ABRE_PARENTESES, 0); }
		public List<IdentificadorContext> identificador() {
			return getRuleContexts(IdentificadorContext.class);
		}
		public IdentificadorContext identificador(int i) {
			return getRuleContext(IdentificadorContext.class,i);
		}
		public TerminalNode FECHA_PARENTESES() { return getToken(RegrasLexicasParser.FECHA_PARENTESES, 0); }
		public List<TerminalNode> PONTEIRO() { return getTokens(RegrasLexicasParser.PONTEIRO); }
		public TerminalNode PONTEIRO(int i) {
			return getToken(RegrasLexicasParser.PONTEIRO, i);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(RegrasLexicasParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(RegrasLexicasParser.VIRGULA, i);
		}
		public CmdLeiaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdLeia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasLexicasListener ) ((RegrasLexicasListener)listener).enterCmdLeia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasLexicasListener ) ((RegrasLexicasListener)listener).exitCmdLeia(this);
		}
	}

	public final CmdLeiaContext cmdLeia() throws RecognitionException {
		CmdLeiaContext _localctx = new CmdLeiaContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_cmdLeia);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			match(LEIA);
			setState(264);
			match(ABRE_PARENTESES);
			setState(266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PONTEIRO) {
				{
				setState(265);
				match(PONTEIRO);
				}
			}

			setState(268);
			identificador();
			setState(276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(269);
				match(VIRGULA);
				setState(271);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PONTEIRO) {
					{
					setState(270);
					match(PONTEIRO);
					}
				}

				setState(273);
				identificador();
				}
				}
				setState(278);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(279);
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
		public TerminalNode ESCREVA() { return getToken(RegrasLexicasParser.ESCREVA, 0); }
		public TerminalNode ABRE_PARENTESES() { return getToken(RegrasLexicasParser.ABRE_PARENTESES, 0); }
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode FECHA_PARENTESES() { return getToken(RegrasLexicasParser.FECHA_PARENTESES, 0); }
		public List<TerminalNode> VIRGULA() { return getTokens(RegrasLexicasParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(RegrasLexicasParser.VIRGULA, i);
		}
		public CmdEscrevaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdEscreva; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasLexicasListener ) ((RegrasLexicasListener)listener).enterCmdEscreva(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasLexicasListener ) ((RegrasLexicasListener)listener).exitCmdEscreva(this);
		}
	}

	public final CmdEscrevaContext cmdEscreva() throws RecognitionException {
		CmdEscrevaContext _localctx = new CmdEscrevaContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_cmdEscreva);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			match(ESCREVA);
			setState(282);
			match(ABRE_PARENTESES);
			setState(283);
			expressao();
			setState(288);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(284);
				match(VIRGULA);
				setState(285);
				expressao();
				}
				}
				setState(290);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(291);
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
		public TerminalNode SE() { return getToken(RegrasLexicasParser.SE, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode ENTAO() { return getToken(RegrasLexicasParser.ENTAO, 0); }
		public TerminalNode FIM_SE() { return getToken(RegrasLexicasParser.FIM_SE, 0); }
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public TerminalNode SENAO() { return getToken(RegrasLexicasParser.SENAO, 0); }
		public CmdSeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdSe; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasLexicasListener ) ((RegrasLexicasListener)listener).enterCmdSe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasLexicasListener ) ((RegrasLexicasListener)listener).exitCmdSe(this);
		}
	}

	public final CmdSeContext cmdSe() throws RecognitionException {
		CmdSeContext _localctx = new CmdSeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_cmdSe);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			match(SE);
			setState(294);
			expressao();
			setState(295);
			match(ENTAO);
			setState(299);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & ((1L << (PONTEIRO - 10)) | (1L << (RETORNE - 10)) | (1L << (LEIA - 10)) | (1L << (ESCREVA - 10)) | (1L << (SE - 10)) | (1L << (CASO - 10)) | (1L << (PARA - 10)) | (1L << (FACA - 10)) | (1L << (ENQUANTO - 10)) | (1L << (IDENT - 10)))) != 0)) {
				{
				{
				setState(296);
				cmd();
				}
				}
				setState(301);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(309);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SENAO) {
				{
				setState(302);
				match(SENAO);
				setState(306);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & ((1L << (PONTEIRO - 10)) | (1L << (RETORNE - 10)) | (1L << (LEIA - 10)) | (1L << (ESCREVA - 10)) | (1L << (SE - 10)) | (1L << (CASO - 10)) | (1L << (PARA - 10)) | (1L << (FACA - 10)) | (1L << (ENQUANTO - 10)) | (1L << (IDENT - 10)))) != 0)) {
					{
					{
					setState(303);
					cmd();
					}
					}
					setState(308);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(311);
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
		public TerminalNode CASO() { return getToken(RegrasLexicasParser.CASO, 0); }
		public Exp_aritmeticaContext exp_aritmetica() {
			return getRuleContext(Exp_aritmeticaContext.class,0);
		}
		public TerminalNode SEJA() { return getToken(RegrasLexicasParser.SEJA, 0); }
		public SelecaoContext selecao() {
			return getRuleContext(SelecaoContext.class,0);
		}
		public TerminalNode FIM_CASO() { return getToken(RegrasLexicasParser.FIM_CASO, 0); }
		public TerminalNode SENAO() { return getToken(RegrasLexicasParser.SENAO, 0); }
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
			if ( listener instanceof RegrasLexicasListener ) ((RegrasLexicasListener)listener).enterCmdCaso(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasLexicasListener ) ((RegrasLexicasListener)listener).exitCmdCaso(this);
		}
	}

	public final CmdCasoContext cmdCaso() throws RecognitionException {
		CmdCasoContext _localctx = new CmdCasoContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_cmdCaso);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			match(CASO);
			setState(314);
			exp_aritmetica();
			setState(315);
			match(SEJA);
			setState(316);
			selecao();
			setState(324);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SENAO) {
				{
				setState(317);
				match(SENAO);
				setState(321);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & ((1L << (PONTEIRO - 10)) | (1L << (RETORNE - 10)) | (1L << (LEIA - 10)) | (1L << (ESCREVA - 10)) | (1L << (SE - 10)) | (1L << (CASO - 10)) | (1L << (PARA - 10)) | (1L << (FACA - 10)) | (1L << (ENQUANTO - 10)) | (1L << (IDENT - 10)))) != 0)) {
					{
					{
					setState(318);
					cmd();
					}
					}
					setState(323);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(326);
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
		public TerminalNode PARA() { return getToken(RegrasLexicasParser.PARA, 0); }
		public TerminalNode IDENT() { return getToken(RegrasLexicasParser.IDENT, 0); }
		public TerminalNode OP_ATRIBUICAO() { return getToken(RegrasLexicasParser.OP_ATRIBUICAO, 0); }
		public List<Exp_aritmeticaContext> exp_aritmetica() {
			return getRuleContexts(Exp_aritmeticaContext.class);
		}
		public Exp_aritmeticaContext exp_aritmetica(int i) {
			return getRuleContext(Exp_aritmeticaContext.class,i);
		}
		public TerminalNode ATE() { return getToken(RegrasLexicasParser.ATE, 0); }
		public TerminalNode FACA() { return getToken(RegrasLexicasParser.FACA, 0); }
		public TerminalNode FIM_PARA() { return getToken(RegrasLexicasParser.FIM_PARA, 0); }
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
			if ( listener instanceof RegrasLexicasListener ) ((RegrasLexicasListener)listener).enterCmdPara(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasLexicasListener ) ((RegrasLexicasListener)listener).exitCmdPara(this);
		}
	}

	public final CmdParaContext cmdPara() throws RecognitionException {
		CmdParaContext _localctx = new CmdParaContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_cmdPara);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			match(PARA);
			setState(329);
			match(IDENT);
			setState(330);
			match(OP_ATRIBUICAO);
			setState(331);
			exp_aritmetica();
			setState(332);
			match(ATE);
			setState(333);
			exp_aritmetica();
			setState(334);
			match(FACA);
			setState(338);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & ((1L << (PONTEIRO - 10)) | (1L << (RETORNE - 10)) | (1L << (LEIA - 10)) | (1L << (ESCREVA - 10)) | (1L << (SE - 10)) | (1L << (CASO - 10)) | (1L << (PARA - 10)) | (1L << (FACA - 10)) | (1L << (ENQUANTO - 10)) | (1L << (IDENT - 10)))) != 0)) {
				{
				{
				setState(335);
				cmd();
				}
				}
				setState(340);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(341);
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
		public TerminalNode ENQUANTO() { return getToken(RegrasLexicasParser.ENQUANTO, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode FACA() { return getToken(RegrasLexicasParser.FACA, 0); }
		public TerminalNode FIM_ENQUANTO() { return getToken(RegrasLexicasParser.FIM_ENQUANTO, 0); }
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
			if ( listener instanceof RegrasLexicasListener ) ((RegrasLexicasListener)listener).enterCmdEnquanto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasLexicasListener ) ((RegrasLexicasListener)listener).exitCmdEnquanto(this);
		}
	}

	public final CmdEnquantoContext cmdEnquanto() throws RecognitionException {
		CmdEnquantoContext _localctx = new CmdEnquantoContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_cmdEnquanto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			match(ENQUANTO);
			setState(344);
			expressao();
			setState(345);
			match(FACA);
			setState(349);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & ((1L << (PONTEIRO - 10)) | (1L << (RETORNE - 10)) | (1L << (LEIA - 10)) | (1L << (ESCREVA - 10)) | (1L << (SE - 10)) | (1L << (CASO - 10)) | (1L << (PARA - 10)) | (1L << (FACA - 10)) | (1L << (ENQUANTO - 10)) | (1L << (IDENT - 10)))) != 0)) {
				{
				{
				setState(346);
				cmd();
				}
				}
				setState(351);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(352);
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
		public TerminalNode FACA() { return getToken(RegrasLexicasParser.FACA, 0); }
		public TerminalNode ATE() { return getToken(RegrasLexicasParser.ATE, 0); }
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
			if ( listener instanceof RegrasLexicasListener ) ((RegrasLexicasListener)listener).enterCmdFaca(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasLexicasListener ) ((RegrasLexicasListener)listener).exitCmdFaca(this);
		}
	}

	public final CmdFacaContext cmdFaca() throws RecognitionException {
		CmdFacaContext _localctx = new CmdFacaContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_cmdFaca);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			match(FACA);
			setState(358);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & ((1L << (PONTEIRO - 10)) | (1L << (RETORNE - 10)) | (1L << (LEIA - 10)) | (1L << (ESCREVA - 10)) | (1L << (SE - 10)) | (1L << (CASO - 10)) | (1L << (PARA - 10)) | (1L << (FACA - 10)) | (1L << (ENQUANTO - 10)) | (1L << (IDENT - 10)))) != 0)) {
				{
				{
				setState(355);
				cmd();
				}
				}
				setState(360);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(361);
			match(ATE);
			setState(362);
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
		public TerminalNode OP_ATRIBUICAO() { return getToken(RegrasLexicasParser.OP_ATRIBUICAO, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode PONTEIRO() { return getToken(RegrasLexicasParser.PONTEIRO, 0); }
		public CmdAtribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdAtribuicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasLexicasListener ) ((RegrasLexicasListener)listener).enterCmdAtribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasLexicasListener ) ((RegrasLexicasListener)listener).exitCmdAtribuicao(this);
		}
	}

	public final CmdAtribuicaoContext cmdAtribuicao() throws RecognitionException {
		CmdAtribuicaoContext _localctx = new CmdAtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_cmdAtribuicao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PONTEIRO) {
				{
				setState(364);
				match(PONTEIRO);
				}
			}

			setState(367);
			identificador();
			setState(368);
			match(OP_ATRIBUICAO);
			setState(369);
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
		public TerminalNode IDENT() { return getToken(RegrasLexicasParser.IDENT, 0); }
		public TerminalNode ABRE_PARENTESES() { return getToken(RegrasLexicasParser.ABRE_PARENTESES, 0); }
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode FECHA_PARENTESES() { return getToken(RegrasLexicasParser.FECHA_PARENTESES, 0); }
		public List<TerminalNode> VIRGULA() { return getTokens(RegrasLexicasParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(RegrasLexicasParser.VIRGULA, i);
		}
		public CmdChamadaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdChamada; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasLexicasListener ) ((RegrasLexicasListener)listener).enterCmdChamada(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasLexicasListener ) ((RegrasLexicasListener)listener).exitCmdChamada(this);
		}
	}

	public final CmdChamadaContext cmdChamada() throws RecognitionException {
		CmdChamadaContext _localctx = new CmdChamadaContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_cmdChamada);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			match(IDENT);
			setState(372);
			match(ABRE_PARENTESES);
			setState(373);
			expressao();
			setState(378);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(374);
				match(VIRGULA);
				setState(375);
				expressao();
				}
				}
				setState(380);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(381);
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
		public TerminalNode RETORNE() { return getToken(RegrasLexicasParser.RETORNE, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public CmdRetorneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdRetorne; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasLexicasListener ) ((RegrasLexicasListener)listener).enterCmdRetorne(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasLexicasListener ) ((RegrasLexicasListener)listener).exitCmdRetorne(this);
		}
	}

	public final CmdRetorneContext cmdRetorne() throws RecognitionException {
		CmdRetorneContext _localctx = new CmdRetorneContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_cmdRetorne);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			match(RETORNE);
			setState(384);
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
			if ( listener instanceof RegrasLexicasListener ) ((RegrasLexicasListener)listener).enterCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasLexicasListener ) ((RegrasLexicasListener)listener).exitCmd(this);
		}
	}

	public final CmdContext cmd() throws RecognitionException {
		CmdContext _localctx = new CmdContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_cmd);
		try {
			setState(406);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(386);
				cmdLeia();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(387);
				cmdEscreva();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(388);
				cmdSe();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(389);
				cmdCaso();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(390);
				cmdPara();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(391);
				cmdEnquanto();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(392);
				cmdFaca();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(393);
				cmdAtribuicao();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(394);
				cmdChamada();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(395);
				cmdRetorne();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(396);
				cmdLeia();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(397);
				cmdEscreva();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(398);
				cmdSe();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(399);
				cmdCaso();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(400);
				cmdPara();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(401);
				cmdEnquanto();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(402);
				cmdFaca();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(403);
				cmdAtribuicao();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(404);
				cmdChamada();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(405);
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
		public TerminalNode DELIM() { return getToken(RegrasLexicasParser.DELIM, 0); }
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
			if ( listener instanceof RegrasLexicasListener ) ((RegrasLexicasListener)listener).enterItem_selecao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasLexicasListener ) ((RegrasLexicasListener)listener).exitItem_selecao(this);
		}
	}

	public final Item_selecaoContext item_selecao() throws RecognitionException {
		Item_selecaoContext _localctx = new Item_selecaoContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_item_selecao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			constantes();
			setState(409);
			match(DELIM);
			setState(413);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & ((1L << (PONTEIRO - 10)) | (1L << (RETORNE - 10)) | (1L << (LEIA - 10)) | (1L << (ESCREVA - 10)) | (1L << (SE - 10)) | (1L << (CASO - 10)) | (1L << (PARA - 10)) | (1L << (FACA - 10)) | (1L << (ENQUANTO - 10)) | (1L << (IDENT - 10)))) != 0)) {
				{
				{
				setState(410);
				cmd();
				}
				}
				setState(415);
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
			if ( listener instanceof RegrasLexicasListener ) ((RegrasLexicasListener)listener).enterSelecao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasLexicasListener ) ((RegrasLexicasListener)listener).exitSelecao(this);
		}
	}

	public final SelecaoContext selecao() throws RecognitionException {
		SelecaoContext _localctx = new SelecaoContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_selecao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SUB || _la==NUM_INT) {
				{
				{
				setState(416);
				item_selecao();
				}
				}
				setState(421);
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
		public TerminalNode SUB() { return getToken(RegrasLexicasParser.SUB, 0); }
		public Op_unarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_unario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasLexicasListener ) ((RegrasLexicasListener)listener).enterOp_unario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasLexicasListener ) ((RegrasLexicasListener)listener).exitOp_unario(this);
		}
	}

	public final Op_unarioContext op_unario() throws RecognitionException {
		Op_unarioContext _localctx = new Op_unarioContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_op_unario);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
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
		public List<TerminalNode> NUM_INT() { return getTokens(RegrasLexicasParser.NUM_INT); }
		public TerminalNode NUM_INT(int i) {
			return getToken(RegrasLexicasParser.NUM_INT, i);
		}
		public List<Op_unarioContext> op_unario() {
			return getRuleContexts(Op_unarioContext.class);
		}
		public Op_unarioContext op_unario(int i) {
			return getRuleContext(Op_unarioContext.class,i);
		}
		public TerminalNode PONTOPONTO() { return getToken(RegrasLexicasParser.PONTOPONTO, 0); }
		public Numero_intervaloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numero_intervalo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasLexicasListener ) ((RegrasLexicasListener)listener).enterNumero_intervalo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasLexicasListener ) ((RegrasLexicasListener)listener).exitNumero_intervalo(this);
		}
	}

	public final Numero_intervaloContext numero_intervalo() throws RecognitionException {
		Numero_intervaloContext _localctx = new Numero_intervaloContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_numero_intervalo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(425);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SUB) {
				{
				setState(424);
				op_unario();
				}
			}

			setState(427);
			match(NUM_INT);
			setState(433);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PONTOPONTO) {
				{
				setState(428);
				match(PONTOPONTO);
				setState(430);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SUB) {
					{
					setState(429);
					op_unario();
					}
				}

				setState(432);
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
		public List<TerminalNode> VIRGULA() { return getTokens(RegrasLexicasParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(RegrasLexicasParser.VIRGULA, i);
		}
		public ConstantesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasLexicasListener ) ((RegrasLexicasListener)listener).enterConstantes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasLexicasListener ) ((RegrasLexicasListener)listener).exitConstantes(this);
		}
	}

	public final ConstantesContext constantes() throws RecognitionException {
		ConstantesContext _localctx = new ConstantesContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_constantes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
			numero_intervalo();
			setState(440);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(436);
				match(VIRGULA);
				setState(437);
				numero_intervalo();
				}
				}
				setState(442);
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
		public TerminalNode PONTEIRO() { return getToken(RegrasLexicasParser.PONTEIRO, 0); }
		public TerminalNode IDENT() { return getToken(RegrasLexicasParser.IDENT, 0); }
		public TerminalNode ABRE_PARENTESES() { return getToken(RegrasLexicasParser.ABRE_PARENTESES, 0); }
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode FECHA_PARENTESES() { return getToken(RegrasLexicasParser.FECHA_PARENTESES, 0); }
		public List<TerminalNode> VIRGULA() { return getTokens(RegrasLexicasParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(RegrasLexicasParser.VIRGULA, i);
		}
		public TerminalNode NUM_INT() { return getToken(RegrasLexicasParser.NUM_INT, 0); }
		public TerminalNode NUM_REAL() { return getToken(RegrasLexicasParser.NUM_REAL, 0); }
		public Parcela_unarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parcela_unario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasLexicasListener ) ((RegrasLexicasListener)listener).enterParcela_unario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasLexicasListener ) ((RegrasLexicasListener)listener).exitParcela_unario(this);
		}
	}

	public final Parcela_unarioContext parcela_unario() throws RecognitionException {
		Parcela_unarioContext _localctx = new Parcela_unarioContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_parcela_unario);
		int _la;
		try {
			setState(465);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(444);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PONTEIRO) {
					{
					setState(443);
					match(PONTEIRO);
					}
				}

				setState(446);
				identificador();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(447);
				match(IDENT);
				setState(448);
				match(ABRE_PARENTESES);
				setState(449);
				expressao();
				setState(454);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VIRGULA) {
					{
					{
					setState(450);
					match(VIRGULA);
					setState(451);
					expressao();
					}
					}
					setState(456);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(457);
				match(FECHA_PARENTESES);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(459);
				match(NUM_INT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(460);
				match(NUM_REAL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(461);
				match(ABRE_PARENTESES);
				setState(462);
				expressao();
				setState(463);
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
		public TerminalNode ENDERECO_DO_PONTEIRO() { return getToken(RegrasLexicasParser.ENDERECO_DO_PONTEIRO, 0); }
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public TerminalNode CADEIA() { return getToken(RegrasLexicasParser.CADEIA, 0); }
		public Parcela_nao_unarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parcela_nao_unario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasLexicasListener ) ((RegrasLexicasListener)listener).enterParcela_nao_unario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasLexicasListener ) ((RegrasLexicasListener)listener).exitParcela_nao_unario(this);
		}
	}

	public final Parcela_nao_unarioContext parcela_nao_unario() throws RecognitionException {
		Parcela_nao_unarioContext _localctx = new Parcela_nao_unarioContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_parcela_nao_unario);
		try {
			setState(470);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENDERECO_DO_PONTEIRO:
				enterOuterAlt(_localctx, 1);
				{
				setState(467);
				match(ENDERECO_DO_PONTEIRO);
				setState(468);
				identificador();
				}
				break;
			case CADEIA:
				enterOuterAlt(_localctx, 2);
				{
				setState(469);
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
			if ( listener instanceof RegrasLexicasListener ) ((RegrasLexicasListener)listener).enterParcela(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasLexicasListener ) ((RegrasLexicasListener)listener).exitParcela(this);
		}
	}

	public final ParcelaContext parcela() throws RecognitionException {
		ParcelaContext _localctx = new ParcelaContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_parcela);
		int _la;
		try {
			setState(477);
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
				setState(473);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SUB) {
					{
					setState(472);
					op_unario();
					}
				}

				setState(475);
				parcela_unario();
				}
				break;
			case ENDERECO_DO_PONTEIRO:
			case CADEIA:
				enterOuterAlt(_localctx, 2);
				{
				setState(476);
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
			if ( listener instanceof RegrasLexicasListener ) ((RegrasLexicasListener)listener).enterFator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasLexicasListener ) ((RegrasLexicasListener)listener).exitFator(this);
		}
	}

	public final FatorContext fator() throws RecognitionException {
		FatorContext _localctx = new FatorContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_fator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(479);
			parcela();
			setState(485);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PORCENTAGEM) {
				{
				{
				setState(480);
				op3();
				setState(481);
				parcela();
				}
				}
				setState(487);
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
			if ( listener instanceof RegrasLexicasListener ) ((RegrasLexicasListener)listener).enterTermo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasLexicasListener ) ((RegrasLexicasListener)listener).exitTermo(this);
		}
	}

	public final TermoContext termo() throws RecognitionException {
		TermoContext _localctx = new TermoContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_termo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(488);
			fator();
			setState(494);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULT || _la==DIV) {
				{
				{
				setState(489);
				op2();
				setState(490);
				fator();
				}
				}
				setState(496);
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
			if ( listener instanceof RegrasLexicasListener ) ((RegrasLexicasListener)listener).enterExp_aritmetica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasLexicasListener ) ((RegrasLexicasListener)listener).exitExp_aritmetica(this);
		}
	}

	public final Exp_aritmeticaContext exp_aritmetica() throws RecognitionException {
		Exp_aritmeticaContext _localctx = new Exp_aritmeticaContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_exp_aritmetica);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(497);
			termo();
			setState(503);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(498);
					op1();
					setState(499);
					termo();
					}
					} 
				}
				setState(505);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
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
		public TerminalNode SOMA() { return getToken(RegrasLexicasParser.SOMA, 0); }
		public TerminalNode SUB() { return getToken(RegrasLexicasParser.SUB, 0); }
		public Op1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasLexicasListener ) ((RegrasLexicasListener)listener).enterOp1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasLexicasListener ) ((RegrasLexicasListener)listener).exitOp1(this);
		}
	}

	public final Op1Context op1() throws RecognitionException {
		Op1Context _localctx = new Op1Context(_ctx, getState());
		enterRule(_localctx, 78, RULE_op1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(506);
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
		public TerminalNode MULT() { return getToken(RegrasLexicasParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(RegrasLexicasParser.DIV, 0); }
		public Op2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasLexicasListener ) ((RegrasLexicasListener)listener).enterOp2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasLexicasListener ) ((RegrasLexicasListener)listener).exitOp2(this);
		}
	}

	public final Op2Context op2() throws RecognitionException {
		Op2Context _localctx = new Op2Context(_ctx, getState());
		enterRule(_localctx, 80, RULE_op2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(508);
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
		public TerminalNode PORCENTAGEM() { return getToken(RegrasLexicasParser.PORCENTAGEM, 0); }
		public Op3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasLexicasListener ) ((RegrasLexicasListener)listener).enterOp3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasLexicasListener ) ((RegrasLexicasListener)listener).exitOp3(this);
		}
	}

	public final Op3Context op3() throws RecognitionException {
		Op3Context _localctx = new Op3Context(_ctx, getState());
		enterRule(_localctx, 82, RULE_op3);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(510);
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
		public TerminalNode IGUAL() { return getToken(RegrasLexicasParser.IGUAL, 0); }
		public TerminalNode DIFERENTE() { return getToken(RegrasLexicasParser.DIFERENTE, 0); }
		public TerminalNode MAIOR_IGUAL() { return getToken(RegrasLexicasParser.MAIOR_IGUAL, 0); }
		public TerminalNode MENOR_IGUAL() { return getToken(RegrasLexicasParser.MENOR_IGUAL, 0); }
		public TerminalNode MAIOR() { return getToken(RegrasLexicasParser.MAIOR, 0); }
		public TerminalNode MENOR() { return getToken(RegrasLexicasParser.MENOR, 0); }
		public Op_relacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_relacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasLexicasListener ) ((RegrasLexicasListener)listener).enterOp_relacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasLexicasListener ) ((RegrasLexicasListener)listener).exitOp_relacional(this);
		}
	}

	public final Op_relacionalContext op_relacional() throws RecognitionException {
		Op_relacionalContext _localctx = new Op_relacionalContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_op_relacional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(512);
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
			if ( listener instanceof RegrasLexicasListener ) ((RegrasLexicasListener)listener).enterExp_relacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasLexicasListener ) ((RegrasLexicasListener)listener).exitExp_relacional(this);
		}
	}

	public final Exp_relacionalContext exp_relacional() throws RecognitionException {
		Exp_relacionalContext _localctx = new Exp_relacionalContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_exp_relacional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(514);
			exp_aritmetica();
			setState(518);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				{
				setState(515);
				op_relacional();
				setState(516);
				exp_aritmetica();
				}
				break;
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
		public TerminalNode NEGACAO() { return getToken(RegrasLexicasParser.NEGACAO, 0); }
		public Fator_logicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fator_logico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasLexicasListener ) ((RegrasLexicasListener)listener).enterFator_logico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasLexicasListener ) ((RegrasLexicasListener)listener).exitFator_logico(this);
		}
	}

	public final Fator_logicoContext fator_logico() throws RecognitionException {
		Fator_logicoContext _localctx = new Fator_logicoContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_fator_logico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(521);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEGACAO) {
				{
				setState(520);
				match(NEGACAO);
				}
			}

			setState(523);
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
			if ( listener instanceof RegrasLexicasListener ) ((RegrasLexicasListener)listener).enterTermo_logico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasLexicasListener ) ((RegrasLexicasListener)listener).exitTermo_logico(this);
		}
	}

	public final Termo_logicoContext termo_logico() throws RecognitionException {
		Termo_logicoContext _localctx = new Termo_logicoContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_termo_logico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(525);
			fator_logico();
			setState(531);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OU) {
				{
				{
				setState(526);
				op_logico_2();
				setState(527);
				fator_logico();
				}
				}
				setState(533);
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
		public Termo_logicoContext termo_logico() {
			return getRuleContext(Termo_logicoContext.class,0);
		}
		public List<Op_relacionalContext> op_relacional() {
			return getRuleContexts(Op_relacionalContext.class);
		}
		public Op_relacionalContext op_relacional(int i) {
			return getRuleContext(Op_relacionalContext.class,i);
		}
		public List<Exp_aritmeticaContext> exp_aritmetica() {
			return getRuleContexts(Exp_aritmeticaContext.class);
		}
		public Exp_aritmeticaContext exp_aritmetica(int i) {
			return getRuleContext(Exp_aritmeticaContext.class,i);
		}
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasLexicasListener ) ((RegrasLexicasListener)listener).enterExpressao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasLexicasListener ) ((RegrasLexicasListener)listener).exitExpressao(this);
		}
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_expressao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(534);
			termo_logico();
			setState(540);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IGUAL) | (1L << DIFERENTE) | (1L << MAIOR) | (1L << MAIOR_IGUAL) | (1L << MENOR) | (1L << MENOR_IGUAL))) != 0)) {
				{
				{
				setState(535);
				op_relacional();
				setState(536);
				exp_aritmetica();
				}
				}
				setState(542);
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
		public TerminalNode VERDADEIRO() { return getToken(RegrasLexicasParser.VERDADEIRO, 0); }
		public TerminalNode FALSO() { return getToken(RegrasLexicasParser.FALSO, 0); }
		public Exp_relacionalContext exp_relacional() {
			return getRuleContext(Exp_relacionalContext.class,0);
		}
		public Parcela_logicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parcela_logica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasLexicasListener ) ((RegrasLexicasListener)listener).enterParcela_logica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasLexicasListener ) ((RegrasLexicasListener)listener).exitParcela_logica(this);
		}
	}

	public final Parcela_logicaContext parcela_logica() throws RecognitionException {
		Parcela_logicaContext _localctx = new Parcela_logicaContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_parcela_logica);
		int _la;
		try {
			setState(545);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VERDADEIRO:
			case FALSO:
				enterOuterAlt(_localctx, 1);
				{
				setState(543);
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
				setState(544);
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
		public TerminalNode E() { return getToken(RegrasLexicasParser.E, 0); }
		public Op_logico_1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_logico_1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasLexicasListener ) ((RegrasLexicasListener)listener).enterOp_logico_1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasLexicasListener ) ((RegrasLexicasListener)listener).exitOp_logico_1(this);
		}
	}

	public final Op_logico_1Context op_logico_1() throws RecognitionException {
		Op_logico_1Context _localctx = new Op_logico_1Context(_ctx, getState());
		enterRule(_localctx, 96, RULE_op_logico_1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(547);
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
		public TerminalNode OU() { return getToken(RegrasLexicasParser.OU, 0); }
		public Op_logico_2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_logico_2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasLexicasListener ) ((RegrasLexicasListener)listener).enterOp_logico_2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RegrasLexicasListener ) ((RegrasLexicasListener)listener).exitOp_logico_2(this);
		}
	}

	public final Op_logico_2Context op_logico_2() throws RecognitionException {
		Op_logico_2Context _localctx = new Op_logico_2Context(_ctx, getState());
		enterRule(_localctx, 98, RULE_op_logico_2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(549);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3H\u022a\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\3\2\3\2"+
		"\3\3\3\3\5\3k\n\3\3\4\5\4n\n\4\3\4\3\4\3\5\3\5\5\5t\n\5\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0083\n\6\3\7\3\7\3\7\3\7\5"+
		"\7\u0089\n\7\3\7\3\7\7\7\u008d\n\7\f\7\16\7\u0090\13\7\3\7\7\7\u0093\n"+
		"\7\f\7\16\7\u0096\13\7\3\7\3\7\3\7\3\7\3\7\5\7\u009d\n\7\3\7\3\7\3\7\3"+
		"\7\7\7\u00a3\n\7\f\7\16\7\u00a6\13\7\3\7\7\7\u00a9\n\7\f\7\16\7\u00ac"+
		"\13\7\3\7\3\7\5\7\u00b0\n\7\3\b\3\b\5\b\u00b4\n\b\3\t\7\t\u00b7\n\t\f"+
		"\t\16\t\u00ba\13\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\7\13\u00c5"+
		"\n\13\f\13\16\13\u00c8\13\13\3\f\3\f\3\f\7\f\u00cd\n\f\f\f\16\f\u00d0"+
		"\13\f\3\f\3\f\3\r\5\r\u00d5\n\r\3\r\3\r\3\r\5\r\u00da\n\r\3\r\7\r\u00dd"+
		"\n\r\f\r\16\r\u00e0\13\r\3\r\3\r\3\16\3\16\3\16\7\16\u00e7\n\16\f\16\16"+
		"\16\u00ea\13\16\3\17\3\17\3\17\7\17\u00ef\n\17\f\17\16\17\u00f2\13\17"+
		"\3\17\3\17\3\17\3\20\5\20\u00f8\n\20\3\20\3\20\3\21\3\21\3\22\7\22\u00ff"+
		"\n\22\f\22\16\22\u0102\13\22\3\22\7\22\u0105\n\22\f\22\16\22\u0108\13"+
		"\22\3\23\3\23\3\23\5\23\u010d\n\23\3\23\3\23\3\23\5\23\u0112\n\23\3\23"+
		"\7\23\u0115\n\23\f\23\16\23\u0118\13\23\3\23\3\23\3\24\3\24\3\24\3\24"+
		"\3\24\7\24\u0121\n\24\f\24\16\24\u0124\13\24\3\24\3\24\3\25\3\25\3\25"+
		"\3\25\7\25\u012c\n\25\f\25\16\25\u012f\13\25\3\25\3\25\7\25\u0133\n\25"+
		"\f\25\16\25\u0136\13\25\5\25\u0138\n\25\3\25\3\25\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\7\26\u0142\n\26\f\26\16\26\u0145\13\26\5\26\u0147\n\26\3\26"+
		"\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u0153\n\27\f\27\16"+
		"\27\u0156\13\27\3\27\3\27\3\30\3\30\3\30\3\30\7\30\u015e\n\30\f\30\16"+
		"\30\u0161\13\30\3\30\3\30\3\31\3\31\7\31\u0167\n\31\f\31\16\31\u016a\13"+
		"\31\3\31\3\31\3\31\3\32\5\32\u0170\n\32\3\32\3\32\3\32\3\32\3\33\3\33"+
		"\3\33\3\33\3\33\7\33\u017b\n\33\f\33\16\33\u017e\13\33\3\33\3\33\3\34"+
		"\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u0199\n\35\3\36\3\36\3\36"+
		"\7\36\u019e\n\36\f\36\16\36\u01a1\13\36\3\37\7\37\u01a4\n\37\f\37\16\37"+
		"\u01a7\13\37\3 \3 \3!\5!\u01ac\n!\3!\3!\3!\5!\u01b1\n!\3!\5!\u01b4\n!"+
		"\3\"\3\"\3\"\7\"\u01b9\n\"\f\"\16\"\u01bc\13\"\3#\5#\u01bf\n#\3#\3#\3"+
		"#\3#\3#\3#\7#\u01c7\n#\f#\16#\u01ca\13#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u01d4"+
		"\n#\3$\3$\3$\5$\u01d9\n$\3%\5%\u01dc\n%\3%\3%\5%\u01e0\n%\3&\3&\3&\3&"+
		"\7&\u01e6\n&\f&\16&\u01e9\13&\3\'\3\'\3\'\3\'\7\'\u01ef\n\'\f\'\16\'\u01f2"+
		"\13\'\3(\3(\3(\3(\7(\u01f8\n(\f(\16(\u01fb\13(\3)\3)\3*\3*\3+\3+\3,\3"+
		",\3-\3-\3-\3-\5-\u0209\n-\3.\5.\u020c\n.\3.\3.\3/\3/\3/\3/\7/\u0214\n"+
		"/\f/\16/\u0217\13/\3\60\3\60\3\60\3\60\7\60\u021d\n\60\f\60\16\60\u0220"+
		"\13\60\3\61\3\61\5\61\u0224\n\61\3\62\3\62\3\63\3\63\3\63\2\2\64\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRT"+
		"VXZ\\^`bd\2\b\3\2\r\20\5\2\21\2289FF\3\2\63\64\3\2\65\66\3\2-\62\3\2\21"+
		"\22\2\u0247\2f\3\2\2\2\4j\3\2\2\2\6m\3\2\2\2\bs\3\2\2\2\n\u0082\3\2\2"+
		"\2\f\u00af\3\2\2\2\16\u00b3\3\2\2\2\20\u00b8\3\2\2\2\22\u00bb\3\2\2\2"+
		"\24\u00c6\3\2\2\2\26\u00c9\3\2\2\2\30\u00d4\3\2\2\2\32\u00e3\3\2\2\2\34"+
		"\u00eb\3\2\2\2\36\u00f7\3\2\2\2 \u00fb\3\2\2\2\"\u0100\3\2\2\2$\u0109"+
		"\3\2\2\2&\u011b\3\2\2\2(\u0127\3\2\2\2*\u013b\3\2\2\2,\u014a\3\2\2\2."+
		"\u0159\3\2\2\2\60\u0164\3\2\2\2\62\u016f\3\2\2\2\64\u0175\3\2\2\2\66\u0181"+
		"\3\2\2\28\u0198\3\2\2\2:\u019a\3\2\2\2<\u01a5\3\2\2\2>\u01a8\3\2\2\2@"+
		"\u01ab\3\2\2\2B\u01b5\3\2\2\2D\u01d3\3\2\2\2F\u01d8\3\2\2\2H\u01df\3\2"+
		"\2\2J\u01e1\3\2\2\2L\u01ea\3\2\2\2N\u01f3\3\2\2\2P\u01fc\3\2\2\2R\u01fe"+
		"\3\2\2\2T\u0200\3\2\2\2V\u0202\3\2\2\2X\u0204\3\2\2\2Z\u020b\3\2\2\2\\"+
		"\u020f\3\2\2\2^\u0218\3\2\2\2`\u0223\3\2\2\2b\u0225\3\2\2\2d\u0227\3\2"+
		"\2\2fg\t\2\2\2g\3\3\2\2\2hk\5\2\2\2ik\7B\2\2jh\3\2\2\2ji\3\2\2\2k\5\3"+
		"\2\2\2ln\7\f\2\2ml\3\2\2\2mn\3\2\2\2no\3\2\2\2op\5\4\3\2p\7\3\2\2\2qt"+
		"\5 \21\2rt\5\6\4\2sq\3\2\2\2sr\3\2\2\2t\t\3\2\2\2uv\7\5\2\2v\u0083\5\34"+
		"\17\2wx\7\n\2\2xy\7B\2\2yz\7\6\2\2z{\5\2\2\2{|\7-\2\2|}\5\36\20\2}\u0083"+
		"\3\2\2\2~\177\7\13\2\2\177\u0080\7B\2\2\u0080\u0081\7\6\2\2\u0081\u0083"+
		"\5\b\5\2\u0082u\3\2\2\2\u0082w\3\2\2\2\u0082~\3\2\2\2\u0083\13\3\2\2\2"+
		"\u0084\u0085\7\25\2\2\u0085\u0086\7B\2\2\u0086\u0088\7:\2\2\u0087\u0089"+
		"\5\32\16\2\u0088\u0087\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008a\3\2\2\2"+
		"\u008a\u008e\7;\2\2\u008b\u008d\5\n\6\2\u008c\u008b\3\2\2\2\u008d\u0090"+
		"\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0094\3\2\2\2\u0090"+
		"\u008e\3\2\2\2\u0091\u0093\58\35\2\u0092\u0091\3\2\2\2\u0093\u0096\3\2"+
		"\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0097\3\2\2\2\u0096"+
		"\u0094\3\2\2\2\u0097\u00b0\7\26\2\2\u0098\u0099\7\27\2\2\u0099\u009a\7"+
		"B\2\2\u009a\u009c\7:\2\2\u009b\u009d\5\32\16\2\u009c\u009b\3\2\2\2\u009c"+
		"\u009d\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009f\7;\2\2\u009f\u00a0\7\6"+
		"\2\2\u00a0\u00a4\5\6\4\2\u00a1\u00a3\5\n\6\2\u00a2\u00a1\3\2\2\2\u00a3"+
		"\u00a6\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00aa\3\2"+
		"\2\2\u00a6\u00a4\3\2\2\2\u00a7\u00a9\58\35\2\u00a8\u00a7\3\2\2\2\u00a9"+
		"\u00ac\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ad\3\2"+
		"\2\2\u00ac\u00aa\3\2\2\2\u00ad\u00ae\7\32\2\2\u00ae\u00b0\3\2\2\2\u00af"+
		"\u0084\3\2\2\2\u00af\u0098\3\2\2\2\u00b0\r\3\2\2\2\u00b1\u00b4\5\f\7\2"+
		"\u00b2\u00b4\5\n\6\2\u00b3\u00b1\3\2\2\2\u00b3\u00b2\3\2\2\2\u00b4\17"+
		"\3\2\2\2\u00b5\u00b7\5\16\b\2\u00b6\u00b5\3\2\2\2\u00b7\u00ba\3\2\2\2"+
		"\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\21\3\2\2\2\u00ba\u00b8"+
		"\3\2\2\2\u00bb\u00bc\5\20\t\2\u00bc\u00bd\7\3\2\2\u00bd\u00be\5\"\22\2"+
		"\u00be\u00bf\7@\2\2\u00bf\23\3\2\2\2\u00c0\u00c1\7<\2\2\u00c1\u00c2\5"+
		"N(\2\u00c2\u00c3\7=\2\2\u00c3\u00c5\3\2\2\2\u00c4\u00c0\3\2\2\2\u00c5"+
		"\u00c8\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\25\3\2\2"+
		"\2\u00c8\u00c6\3\2\2\2\u00c9\u00ce\7B\2\2\u00ca\u00cb\7\b\2\2\u00cb\u00cd"+
		"\7B\2\2\u00cc\u00ca\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce"+
		"\u00cf\3\2\2\2\u00cf\u00d1\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1\u00d2\5\24"+
		"\13\2\u00d2\27\3\2\2\2\u00d3\u00d5\7?\2\2\u00d4\u00d3\3\2\2\2\u00d4\u00d5"+
		"\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00de\5\26\f\2\u00d7\u00d9\7\7\2\2"+
		"\u00d8\u00da\7\f\2\2\u00d9\u00d8\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00db"+
		"\3\2\2\2\u00db\u00dd\5\26\f\2\u00dc\u00d7\3\2\2\2\u00dd\u00e0\3\2\2\2"+
		"\u00de\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e1\3\2\2\2\u00e0\u00de"+
		"\3\2\2\2\u00e1\u00e2\7;\2\2\u00e2\31\3\2\2\2\u00e3\u00e8\5\30\r\2\u00e4"+
		"\u00e5\7\7\2\2\u00e5\u00e7\5\30\r\2\u00e6\u00e4\3\2\2\2\u00e7\u00ea\3"+
		"\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\33\3\2\2\2\u00ea"+
		"\u00e8\3\2\2\2\u00eb\u00f0\5\26\f\2\u00ec\u00ed\7\7\2\2\u00ed\u00ef\5"+
		"\26\f\2\u00ee\u00ec\3\2\2\2\u00ef\u00f2\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0"+
		"\u00f1\3\2\2\2\u00f1\u00f3\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f3\u00f4\7\6"+
		"\2\2\u00f4\u00f5\5\b\5\2\u00f5\35\3\2\2\2\u00f6\u00f8\7\f\2\2\u00f7\u00f6"+
		"\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fa\5\4\3\2\u00fa"+
		"\37\3\2\2\2\u00fb\u00fc\t\3\2\2\u00fc!\3\2\2\2\u00fd\u00ff\5\n\6\2\u00fe"+
		"\u00fd\3\2\2\2\u00ff\u0102\3\2\2\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2"+
		"\2\2\u0101\u0106\3\2\2\2\u0102\u0100\3\2\2\2\u0103\u0105\58\35\2\u0104"+
		"\u0103\3\2\2\2\u0105\u0108\3\2\2\2\u0106\u0104\3\2\2\2\u0106\u0107\3\2"+
		"\2\2\u0107#\3\2\2\2\u0108\u0106\3\2\2\2\u0109\u010a\7\33\2\2\u010a\u010c"+
		"\7:\2\2\u010b\u010d\7\f\2\2\u010c\u010b\3\2\2\2\u010c\u010d\3\2\2\2\u010d"+
		"\u010e\3\2\2\2\u010e\u0116\5\26\f\2\u010f\u0111\7\7\2\2\u0110\u0112\7"+
		"\f\2\2\u0111\u0110\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0113\3\2\2\2\u0113"+
		"\u0115\5\26\f\2\u0114\u010f\3\2\2\2\u0115\u0118\3\2\2\2\u0116\u0114\3"+
		"\2\2\2\u0116\u0117\3\2\2\2\u0117\u0119\3\2\2\2\u0118\u0116\3\2\2\2\u0119"+
		"\u011a\7;\2\2\u011a%\3\2\2\2\u011b\u011c\7\34\2\2\u011c\u011d\7:\2\2\u011d"+
		"\u0122\5^\60\2\u011e\u011f\7\7\2\2\u011f\u0121\5^\60\2\u0120\u011e\3\2"+
		"\2\2\u0121\u0124\3\2\2\2\u0122\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123"+
		"\u0125\3\2\2\2\u0124\u0122\3\2\2\2\u0125\u0126\7;\2\2\u0126\'\3\2\2\2"+
		"\u0127\u0128\7\35\2\2\u0128\u0129\5^\60\2\u0129\u012d\7\36\2\2\u012a\u012c"+
		"\58\35\2\u012b\u012a\3\2\2\2\u012c\u012f\3\2\2\2\u012d\u012b\3\2\2\2\u012d"+
		"\u012e\3\2\2\2\u012e\u0137\3\2\2\2\u012f\u012d\3\2\2\2\u0130\u0134\7\37"+
		"\2\2\u0131\u0133\58\35\2\u0132\u0131\3\2\2\2\u0133\u0136\3\2\2\2\u0134"+
		"\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0138\3\2\2\2\u0136\u0134\3\2"+
		"\2\2\u0137\u0130\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u0139\3\2\2\2\u0139"+
		"\u013a\7 \2\2\u013a)\3\2\2\2\u013b\u013c\7!\2\2\u013c\u013d\5N(\2\u013d"+
		"\u013e\7\"\2\2\u013e\u0146\5<\37\2\u013f\u0143\7\37\2\2\u0140\u0142\5"+
		"8\35\2\u0141\u0140\3\2\2\2\u0142\u0145\3\2\2\2\u0143\u0141\3\2\2\2\u0143"+
		"\u0144\3\2\2\2\u0144\u0147\3\2\2\2\u0145\u0143\3\2\2\2\u0146\u013f\3\2"+
		"\2\2\u0146\u0147\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u0149\7#\2\2\u0149"+
		"+\3\2\2\2\u014a\u014b\7$\2\2\u014b\u014c\7B\2\2\u014c\u014d\7\67\2\2\u014d"+
		"\u014e\5N(\2\u014e\u014f\7%\2\2\u014f\u0150\5N(\2\u0150\u0154\7&\2\2\u0151"+
		"\u0153\58\35\2\u0152\u0151\3\2\2\2\u0153\u0156\3\2\2\2\u0154\u0152\3\2"+
		"\2\2\u0154\u0155\3\2\2\2\u0155\u0157\3\2\2\2\u0156\u0154\3\2\2\2\u0157"+
		"\u0158\7\'\2\2\u0158-\3\2\2\2\u0159\u015a\7(\2\2\u015a\u015b\5^\60\2\u015b"+
		"\u015f\7&\2\2\u015c\u015e\58\35\2\u015d\u015c\3\2\2\2\u015e\u0161\3\2"+
		"\2\2\u015f\u015d\3\2\2\2\u015f\u0160\3\2\2\2\u0160\u0162\3\2\2\2\u0161"+
		"\u015f\3\2\2\2\u0162\u0163\7)\2\2\u0163/\3\2\2\2\u0164\u0168\7&\2\2\u0165"+
		"\u0167\58\35\2\u0166\u0165\3\2\2\2\u0167\u016a\3\2\2\2\u0168\u0166\3\2"+
		"\2\2\u0168\u0169\3\2\2\2\u0169\u016b\3\2\2\2\u016a\u0168\3\2\2\2\u016b"+
		"\u016c\7%\2\2\u016c\u016d\5^\60\2\u016d\61\3\2\2\2\u016e\u0170\7\f\2\2"+
		"\u016f\u016e\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u0171\3\2\2\2\u0171\u0172"+
		"\5\26\f\2\u0172\u0173\7\67\2\2\u0173\u0174\5^\60\2\u0174\63\3\2\2\2\u0175"+
		"\u0176\7B\2\2\u0176\u0177\7:\2\2\u0177\u017c\5^\60\2\u0178\u0179\7\7\2"+
		"\2\u0179\u017b\5^\60\2\u017a\u0178\3\2\2\2\u017b\u017e\3\2\2\2\u017c\u017a"+
		"\3\2\2\2\u017c\u017d\3\2\2\2\u017d\u017f\3\2\2\2\u017e\u017c\3\2\2\2\u017f"+
		"\u0180\7;\2\2\u0180\65\3\2\2\2\u0181\u0182\7\31\2\2\u0182\u0183\5^\60"+
		"\2\u0183\67\3\2\2\2\u0184\u0199\5$\23\2\u0185\u0199\5&\24\2\u0186\u0199"+
		"\5(\25\2\u0187\u0199\5*\26\2\u0188\u0199\5,\27\2\u0189\u0199\5.\30\2\u018a"+
		"\u0199\5\60\31\2\u018b\u0199\5\62\32\2\u018c\u0199\5\64\33\2\u018d\u0199"+
		"\5\66\34\2\u018e\u0199\5$\23\2\u018f\u0199\5&\24\2\u0190\u0199\5(\25\2"+
		"\u0191\u0199\5*\26\2\u0192\u0199\5,\27\2\u0193\u0199\5.\30\2\u0194\u0199"+
		"\5\60\31\2\u0195\u0199\5\62\32\2\u0196\u0199\5\64\33\2\u0197\u0199\5\66"+
		"\34\2\u0198\u0184\3\2\2\2\u0198\u0185\3\2\2\2\u0198\u0186\3\2\2\2\u0198"+
		"\u0187\3\2\2\2\u0198\u0188\3\2\2\2\u0198\u0189\3\2\2\2\u0198\u018a\3\2"+
		"\2\2\u0198\u018b\3\2\2\2\u0198\u018c\3\2\2\2\u0198\u018d\3\2\2\2\u0198"+
		"\u018e\3\2\2\2\u0198\u018f\3\2\2\2\u0198\u0190\3\2\2\2\u0198\u0191\3\2"+
		"\2\2\u0198\u0192\3\2\2\2\u0198\u0193\3\2\2\2\u0198\u0194\3\2\2\2\u0198"+
		"\u0195\3\2\2\2\u0198\u0196\3\2\2\2\u0198\u0197\3\2\2\2\u01999\3\2\2\2"+
		"\u019a\u019b\5B\"\2\u019b\u019f\7\6\2\2\u019c\u019e\58\35\2\u019d\u019c"+
		"\3\2\2\2\u019e\u01a1\3\2\2\2\u019f\u019d\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0"+
		";\3\2\2\2\u01a1\u019f\3\2\2\2\u01a2\u01a4\5:\36\2\u01a3\u01a2\3\2\2\2"+
		"\u01a4\u01a7\3\2\2\2\u01a5\u01a3\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6=\3"+
		"\2\2\2\u01a7\u01a5\3\2\2\2\u01a8\u01a9\7\64\2\2\u01a9?\3\2\2\2\u01aa\u01ac"+
		"\5> \2\u01ab\u01aa\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad"+
		"\u01b3\78\2\2\u01ae\u01b0\7\t\2\2\u01af\u01b1\5> \2\u01b0\u01af\3\2\2"+
		"\2\u01b0\u01b1\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2\u01b4\78\2\2\u01b3\u01ae"+
		"\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4A\3\2\2\2\u01b5\u01ba\5@!\2\u01b6\u01b7"+
		"\7\7\2\2\u01b7\u01b9\5@!\2\u01b8\u01b6\3\2\2\2\u01b9\u01bc\3\2\2\2\u01ba"+
		"\u01b8\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bbC\3\2\2\2\u01bc\u01ba\3\2\2\2"+
		"\u01bd\u01bf\7\f\2\2\u01be\u01bd\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf\u01c0"+
		"\3\2\2\2\u01c0\u01d4\5\26\f\2\u01c1\u01c2\7B\2\2\u01c2\u01c3\7:\2\2\u01c3"+
		"\u01c8\5^\60\2\u01c4\u01c5\7\7\2\2\u01c5\u01c7\5^\60\2\u01c6\u01c4\3\2"+
		"\2\2\u01c7\u01ca\3\2\2\2\u01c8\u01c6\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c9"+
		"\u01cb\3\2\2\2\u01ca\u01c8\3\2\2\2\u01cb\u01cc\7;\2\2\u01cc\u01d4\3\2"+
		"\2\2\u01cd\u01d4\78\2\2\u01ce\u01d4\79\2\2\u01cf\u01d0\7:\2\2\u01d0\u01d1"+
		"\5^\60\2\u01d1\u01d2\7;\2\2\u01d2\u01d4\3\2\2\2\u01d3\u01be\3\2\2\2\u01d3"+
		"\u01c1\3\2\2\2\u01d3\u01cd\3\2\2\2\u01d3\u01ce\3\2\2\2\u01d3\u01cf\3\2"+
		"\2\2\u01d4E\3\2\2\2\u01d5\u01d6\7A\2\2\u01d6\u01d9\5\26\f\2\u01d7\u01d9"+
		"\7F\2\2\u01d8\u01d5\3\2\2\2\u01d8\u01d7\3\2\2\2\u01d9G\3\2\2\2\u01da\u01dc"+
		"\5> \2\u01db\u01da\3\2\2\2\u01db\u01dc\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd"+
		"\u01e0\5D#\2\u01de\u01e0\5F$\2\u01df\u01db\3\2\2\2\u01df\u01de\3\2\2\2"+
		"\u01e0I\3\2\2\2\u01e1\u01e7\5H%\2\u01e2\u01e3\5T+\2\u01e3\u01e4\5H%\2"+
		"\u01e4\u01e6\3\2\2\2\u01e5\u01e2\3\2\2\2\u01e6\u01e9\3\2\2\2\u01e7\u01e5"+
		"\3\2\2\2\u01e7\u01e8\3\2\2\2\u01e8K\3\2\2\2\u01e9\u01e7\3\2\2\2\u01ea"+
		"\u01f0\5J&\2\u01eb\u01ec\5R*\2\u01ec\u01ed\5J&\2\u01ed\u01ef\3\2\2\2\u01ee"+
		"\u01eb\3\2\2\2\u01ef\u01f2\3\2\2\2\u01f0\u01ee\3\2\2\2\u01f0\u01f1\3\2"+
		"\2\2\u01f1M\3\2\2\2\u01f2\u01f0\3\2\2\2\u01f3\u01f9\5L\'\2\u01f4\u01f5"+
		"\5P)\2\u01f5\u01f6\5L\'\2\u01f6\u01f8\3\2\2\2\u01f7\u01f4\3\2\2\2\u01f8"+
		"\u01fb\3\2\2\2\u01f9\u01f7\3\2\2\2\u01f9\u01fa\3\2\2\2\u01faO\3\2\2\2"+
		"\u01fb\u01f9\3\2\2\2\u01fc\u01fd\t\4\2\2\u01fdQ\3\2\2\2\u01fe\u01ff\t"+
		"\5\2\2\u01ffS\3\2\2\2\u0200\u0201\7>\2\2\u0201U\3\2\2\2\u0202\u0203\t"+
		"\6\2\2\u0203W\3\2\2\2\u0204\u0208\5N(\2\u0205\u0206\5V,\2\u0206\u0207"+
		"\5N(\2\u0207\u0209\3\2\2\2\u0208\u0205\3\2\2\2\u0208\u0209\3\2\2\2\u0209"+
		"Y\3\2\2\2\u020a\u020c\7,\2\2\u020b\u020a\3\2\2\2\u020b\u020c\3\2\2\2\u020c"+
		"\u020d\3\2\2\2\u020d\u020e\5`\61\2\u020e[\3\2\2\2\u020f\u0215\5Z.\2\u0210"+
		"\u0211\5d\63\2\u0211\u0212\5Z.\2\u0212\u0214\3\2\2\2\u0213\u0210\3\2\2"+
		"\2\u0214\u0217\3\2\2\2\u0215\u0213\3\2\2\2\u0215\u0216\3\2\2\2\u0216]"+
		"\3\2\2\2\u0217\u0215\3\2\2\2\u0218\u021e\5\\/\2\u0219\u021a\5V,\2\u021a"+
		"\u021b\5N(\2\u021b\u021d\3\2\2\2\u021c\u0219\3\2\2\2\u021d\u0220\3\2\2"+
		"\2\u021e\u021c\3\2\2\2\u021e\u021f\3\2\2\2\u021f_\3\2\2\2\u0220\u021e"+
		"\3\2\2\2\u0221\u0224\t\7\2\2\u0222\u0224\5X-\2\u0223\u0221\3\2\2\2\u0223"+
		"\u0222\3\2\2\2\u0224a\3\2\2\2\u0225\u0226\7*\2\2\u0226c\3\2\2\2\u0227"+
		"\u0228\7+\2\2\u0228e\3\2\2\2<jms\u0082\u0088\u008e\u0094\u009c\u00a4\u00aa"+
		"\u00af\u00b3\u00b8\u00c6\u00ce\u00d4\u00d9\u00de\u00e8\u00f0\u00f7\u0100"+
		"\u0106\u010c\u0111\u0116\u0122\u012d\u0134\u0137\u0143\u0146\u0154\u015f"+
		"\u0168\u016f\u017c\u0198\u019f\u01a5\u01ab\u01b0\u01b3\u01ba\u01be\u01c8"+
		"\u01d3\u01d8\u01db\u01df\u01e7\u01f0\u01f9\u0208\u020b\u0215\u021e\u0223";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}