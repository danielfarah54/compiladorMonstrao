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
		RULE_programa = 0, RULE_declaracoes = 1, RULE_decl_local_global = 2, RULE_declaracao_local = 3, 
		RULE_declaracao_global = 4, RULE_identificador = 5, RULE_dimensao = 6, 
		RULE_tipo = 7, RULE_tipo_basico = 8, RULE_tipo_basico_ident = 9, RULE_tipo_estendido = 10, 
		RULE_valor_constante = 11, RULE_parametro = 12, RULE_parametros = 13, 
		RULE_registro = 14, RULE_variavel = 15, RULE_corpo = 16, RULE_cmd = 17, 
		RULE_cmdLeia = 18, RULE_cmdEscreva = 19, RULE_cmdSe = 20, RULE_cmdCaso = 21, 
		RULE_cmdPara = 22, RULE_cmdEnquanto = 23, RULE_cmdFaca = 24, RULE_cmdAtribuicao = 25, 
		RULE_cmdChamada = 26, RULE_cmdRetorne = 27, RULE_item_selecao = 28, RULE_selecao = 29, 
		RULE_op_unario = 30, RULE_numero_intervalo = 31, RULE_constantes = 32, 
		RULE_exp_aritmetica = 33, RULE_termo = 34, RULE_fator = 35, RULE_parcela = 36, 
		RULE_parcela_unario = 37, RULE_parcela_nao_unario = 38, RULE_op1 = 39, 
		RULE_op2 = 40, RULE_op3 = 41, RULE_op_relacional = 42, RULE_exp_relacional = 43, 
		RULE_expressao = 44, RULE_termo_logico = 45, RULE_fator_logico = 46, RULE_parcela_logica = 47, 
		RULE_op_logico_1 = 48, RULE_op_logico_2 = 49;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "declaracoes", "decl_local_global", "declaracao_local", "declaracao_global", 
			"identificador", "dimensao", "tipo", "tipo_basico", "tipo_basico_ident", 
			"tipo_estendido", "valor_constante", "parametro", "parametros", "registro", 
			"variavel", "corpo", "cmd", "cmdLeia", "cmdEscreva", "cmdSe", "cmdCaso", 
			"cmdPara", "cmdEnquanto", "cmdFaca", "cmdAtribuicao", "cmdChamada", "cmdRetorne", 
			"item_selecao", "selecao", "op_unario", "numero_intervalo", "constantes", 
			"exp_aritmetica", "termo", "fator", "parcela", "parcela_unario", "parcela_nao_unario", 
			"op1", "op2", "op3", "op_relacional", "exp_relacional", "expressao", 
			"termo_logico", "fator_logico", "parcela_logica", "op_logico_1", "op_logico_2"
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

	public static class ProgramaContext extends ParserRuleContext {
		public DeclaracoesContext declaracoes() {
			return getRuleContext(DeclaracoesContext.class,0);
		}
		public TerminalNode ALGORITMO() { return getToken(RegrasParser.ALGORITMO, 0); }
		public CorpoContext corpo() {
			return getRuleContext(CorpoContext.class,0);
		}
		public TerminalNode FIM_ALGORITMO() { return getToken(RegrasParser.FIM_ALGORITMO, 0); }
		public TerminalNode EOF() { return getToken(RegrasParser.EOF, 0); }
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
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			declaracoes();
			setState(101);
			match(ALGORITMO);
			setState(102);
			corpo();
			setState(103);
			match(FIM_ALGORITMO);
			setState(104);
			match(EOF);
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
		enterRule(_localctx, 2, RULE_declaracoes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DECLARE) | (1L << CONSTANTE) | (1L << TIPO) | (1L << PROCEDIMENTO) | (1L << FUNCAO))) != 0)) {
				{
				{
				setState(106);
				decl_local_global();
				}
				}
				setState(111);
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
		enterRule(_localctx, 4, RULE_decl_local_global);
		try {
			setState(114);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PROCEDIMENTO:
			case FUNCAO:
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				declaracao_global();
				}
				break;
			case DECLARE:
			case CONSTANTE:
			case TIPO:
				enterOuterAlt(_localctx, 2);
				{
				setState(113);
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
		public Token decl;
		public Token constant;
		public Token decl_tipo;
		public VariavelContext variavel() {
			return getRuleContext(VariavelContext.class,0);
		}
		public TerminalNode DECLARE() { return getToken(RegrasParser.DECLARE, 0); }
		public TerminalNode IDENT() { return getToken(RegrasParser.IDENT, 0); }
		public TerminalNode DELIM() { return getToken(RegrasParser.DELIM, 0); }
		public Tipo_basicoContext tipo_basico() {
			return getRuleContext(Tipo_basicoContext.class,0);
		}
		public TerminalNode IGUAL() { return getToken(RegrasParser.IGUAL, 0); }
		public Valor_constanteContext valor_constante() {
			return getRuleContext(Valor_constanteContext.class,0);
		}
		public TerminalNode CONSTANTE() { return getToken(RegrasParser.CONSTANTE, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode TIPO() { return getToken(RegrasParser.TIPO, 0); }
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
		enterRule(_localctx, 6, RULE_declaracao_local);
		try {
			setState(129);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECLARE:
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				((Declaracao_localContext)_localctx).decl = match(DECLARE);
				setState(117);
				variavel();
				}
				break;
			case CONSTANTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(118);
				((Declaracao_localContext)_localctx).constant = match(CONSTANTE);
				setState(119);
				match(IDENT);
				setState(120);
				match(DELIM);
				setState(121);
				tipo_basico();
				setState(122);
				match(IGUAL);
				setState(123);
				valor_constante();
				}
				break;
			case TIPO:
				enterOuterAlt(_localctx, 3);
				{
				setState(125);
				((Declaracao_localContext)_localctx).decl_tipo = match(TIPO);
				setState(126);
				match(IDENT);
				setState(127);
				match(DELIM);
				setState(128);
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
		public Token proc;
		public Token func;
		public TerminalNode IDENT() { return getToken(RegrasParser.IDENT, 0); }
		public TerminalNode ABRE_PARENTESES() { return getToken(RegrasParser.ABRE_PARENTESES, 0); }
		public TerminalNode FECHA_PARENTESES() { return getToken(RegrasParser.FECHA_PARENTESES, 0); }
		public TerminalNode FIM_PROCEDIMENTO() { return getToken(RegrasParser.FIM_PROCEDIMENTO, 0); }
		public TerminalNode PROCEDIMENTO() { return getToken(RegrasParser.PROCEDIMENTO, 0); }
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
		public TerminalNode DELIM() { return getToken(RegrasParser.DELIM, 0); }
		public Tipo_estendidoContext tipo_estendido() {
			return getRuleContext(Tipo_estendidoContext.class,0);
		}
		public TerminalNode FIM_FUNÇÃO() { return getToken(RegrasParser.FIM_FUNÇÃO, 0); }
		public TerminalNode FUNCAO() { return getToken(RegrasParser.FUNCAO, 0); }
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
		enterRule(_localctx, 8, RULE_declaracao_global);
		int _la;
		try {
			setState(174);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PROCEDIMENTO:
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				((Declaracao_globalContext)_localctx).proc = match(PROCEDIMENTO);
				setState(132);
				match(IDENT);
				setState(133);
				match(ABRE_PARENTESES);
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR || _la==IDENT) {
					{
					setState(134);
					parametros();
					}
				}

				setState(137);
				match(FECHA_PARENTESES);
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DECLARE) | (1L << CONSTANTE) | (1L << TIPO))) != 0)) {
					{
					{
					setState(138);
					declaracao_local();
					}
					}
					setState(143);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & ((1L << (PONTEIRO - 10)) | (1L << (RETORNE - 10)) | (1L << (LEIA - 10)) | (1L << (ESCREVA - 10)) | (1L << (SE - 10)) | (1L << (CASO - 10)) | (1L << (PARA - 10)) | (1L << (FACA - 10)) | (1L << (ENQUANTO - 10)) | (1L << (IDENT - 10)))) != 0)) {
					{
					{
					setState(144);
					cmd();
					}
					}
					setState(149);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(150);
				match(FIM_PROCEDIMENTO);
				}
				break;
			case FUNCAO:
				enterOuterAlt(_localctx, 2);
				{
				setState(151);
				((Declaracao_globalContext)_localctx).func = match(FUNCAO);
				setState(152);
				match(IDENT);
				setState(153);
				match(ABRE_PARENTESES);
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR || _la==IDENT) {
					{
					setState(154);
					parametros();
					}
				}

				setState(157);
				match(FECHA_PARENTESES);
				setState(158);
				match(DELIM);
				setState(159);
				tipo_estendido();
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DECLARE) | (1L << CONSTANTE) | (1L << TIPO))) != 0)) {
					{
					{
					setState(160);
					declaracao_local();
					}
					}
					setState(165);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & ((1L << (PONTEIRO - 10)) | (1L << (RETORNE - 10)) | (1L << (LEIA - 10)) | (1L << (ESCREVA - 10)) | (1L << (SE - 10)) | (1L << (CASO - 10)) | (1L << (PARA - 10)) | (1L << (FACA - 10)) | (1L << (ENQUANTO - 10)) | (1L << (IDENT - 10)))) != 0)) {
					{
					{
					setState(166);
					cmd();
					}
					}
					setState(171);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(172);
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

	public static class IdentificadorContext extends ParserRuleContext {
		public Token primeiroIdent;
		public Token IDENT;
		public List<Token> outrosIdent = new ArrayList<Token>();
		public DimensaoContext dimensao() {
			return getRuleContext(DimensaoContext.class,0);
		}
		public List<TerminalNode> IDENT() { return getTokens(RegrasParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(RegrasParser.IDENT, i);
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
		enterRule(_localctx, 10, RULE_identificador);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			((IdentificadorContext)_localctx).primeiroIdent = match(IDENT);
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PONTO) {
				{
				{
				setState(177);
				match(PONTO);
				setState(178);
				((IdentificadorContext)_localctx).IDENT = match(IDENT);
				((IdentificadorContext)_localctx).outrosIdent.add(((IdentificadorContext)_localctx).IDENT);
				}
				}
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(184);
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
		enterRule(_localctx, 12, RULE_dimensao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ABRE_COLCHETES) {
				{
				{
				setState(186);
				match(ABRE_COLCHETES);
				setState(187);
				exp_aritmetica();
				setState(188);
				match(FECHA_COLCHETES);
				}
				}
				setState(194);
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
		enterRule(_localctx, 14, RULE_tipo);
		try {
			setState(197);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REGISTRO:
				enterOuterAlt(_localctx, 1);
				{
				setState(195);
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
				setState(196);
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
		enterRule(_localctx, 16, RULE_tipo_basico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
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
		enterRule(_localctx, 18, RULE_tipo_basico_ident);
		try {
			setState(203);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LITERAL:
			case INTEIRO:
			case REAL:
			case LOGICO:
				enterOuterAlt(_localctx, 1);
				{
				setState(201);
				tipo_basico();
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(202);
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
		enterRule(_localctx, 20, RULE_tipo_estendido);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PONTEIRO) {
				{
				setState(205);
				match(PONTEIRO);
				}
			}

			setState(208);
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
		enterRule(_localctx, 22, RULE_valor_constante);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
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

	public static class ParametroContext extends ParserRuleContext {
		public IdentificadorContext primeiroID;
		public IdentificadorContext identificador;
		public List<IdentificadorContext> outrosId = new ArrayList<IdentificadorContext>();
		public TerminalNode DELIM() { return getToken(RegrasParser.DELIM, 0); }
		public Tipo_estendidoContext tipo_estendido() {
			return getRuleContext(Tipo_estendidoContext.class,0);
		}
		public List<IdentificadorContext> identificador() {
			return getRuleContexts(IdentificadorContext.class);
		}
		public IdentificadorContext identificador(int i) {
			return getRuleContext(IdentificadorContext.class,i);
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
		enterRule(_localctx, 24, RULE_parametro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(212);
				match(VAR);
				}
			}

			setState(215);
			((ParametroContext)_localctx).primeiroID = identificador();
			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(216);
				match(VIRGULA);
				setState(217);
				((ParametroContext)_localctx).identificador = identificador();
				((ParametroContext)_localctx).outrosId.add(((ParametroContext)_localctx).identificador);
				}
				}
				setState(222);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(223);
			match(DELIM);
			setState(224);
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
		public ParametroContext primeiroParam;
		public ParametroContext parametro;
		public List<ParametroContext> outrosParam = new ArrayList<ParametroContext>();
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
		enterRule(_localctx, 26, RULE_parametros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			((ParametrosContext)_localctx).primeiroParam = parametro();
			setState(231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(227);
				match(VIRGULA);
				setState(228);
				((ParametrosContext)_localctx).parametro = parametro();
				((ParametrosContext)_localctx).outrosParam.add(((ParametrosContext)_localctx).parametro);
				}
				}
				setState(233);
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
		enterRule(_localctx, 28, RULE_registro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(REGISTRO);
			setState(238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENT) {
				{
				{
				setState(235);
				variavel();
				}
				}
				setState(240);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(241);
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

	public static class VariavelContext extends ParserRuleContext {
		public IdentificadorContext primeiroId;
		public IdentificadorContext identificador;
		public List<IdentificadorContext> outrosID = new ArrayList<IdentificadorContext>();
		public TerminalNode DELIM() { return getToken(RegrasParser.DELIM, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public List<IdentificadorContext> identificador() {
			return getRuleContexts(IdentificadorContext.class);
		}
		public IdentificadorContext identificador(int i) {
			return getRuleContext(IdentificadorContext.class,i);
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
		enterRule(_localctx, 30, RULE_variavel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			((VariavelContext)_localctx).primeiroId = identificador();
			setState(248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(244);
				match(VIRGULA);
				setState(245);
				((VariavelContext)_localctx).identificador = identificador();
				((VariavelContext)_localctx).outrosID.add(((VariavelContext)_localctx).identificador);
				}
				}
				setState(250);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(251);
			match(DELIM);
			setState(252);
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
			setState(257);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DECLARE) | (1L << CONSTANTE) | (1L << TIPO))) != 0)) {
				{
				{
				setState(254);
				declaracao_local();
				}
				}
				setState(259);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & ((1L << (PONTEIRO - 10)) | (1L << (RETORNE - 10)) | (1L << (LEIA - 10)) | (1L << (ESCREVA - 10)) | (1L << (SE - 10)) | (1L << (CASO - 10)) | (1L << (PARA - 10)) | (1L << (FACA - 10)) | (1L << (ENQUANTO - 10)) | (1L << (IDENT - 10)))) != 0)) {
				{
				{
				setState(260);
				cmd();
				}
				}
				setState(265);
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
		enterRule(_localctx, 34, RULE_cmd);
		try {
			setState(286);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(266);
				cmdLeia();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(267);
				cmdEscreva();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(268);
				cmdSe();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(269);
				cmdCaso();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(270);
				cmdPara();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(271);
				cmdEnquanto();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(272);
				cmdFaca();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(273);
				cmdAtribuicao();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(274);
				cmdChamada();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(275);
				cmdRetorne();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(276);
				cmdLeia();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(277);
				cmdEscreva();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(278);
				cmdSe();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(279);
				cmdCaso();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(280);
				cmdPara();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(281);
				cmdEnquanto();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(282);
				cmdFaca();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(283);
				cmdAtribuicao();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(284);
				cmdChamada();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(285);
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

	public static class CmdLeiaContext extends ParserRuleContext {
		public IdentificadorContext primeiroId;
		public IdentificadorContext identificador;
		public List<IdentificadorContext> outrosId = new ArrayList<IdentificadorContext>();
		public TerminalNode LEIA() { return getToken(RegrasParser.LEIA, 0); }
		public TerminalNode ABRE_PARENTESES() { return getToken(RegrasParser.ABRE_PARENTESES, 0); }
		public TerminalNode FECHA_PARENTESES() { return getToken(RegrasParser.FECHA_PARENTESES, 0); }
		public List<IdentificadorContext> identificador() {
			return getRuleContexts(IdentificadorContext.class);
		}
		public IdentificadorContext identificador(int i) {
			return getRuleContext(IdentificadorContext.class,i);
		}
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
		enterRule(_localctx, 36, RULE_cmdLeia);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			match(LEIA);
			setState(289);
			match(ABRE_PARENTESES);
			setState(291);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PONTEIRO) {
				{
				setState(290);
				match(PONTEIRO);
				}
			}

			setState(293);
			((CmdLeiaContext)_localctx).primeiroId = identificador();
			setState(301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(294);
				match(VIRGULA);
				setState(296);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PONTEIRO) {
					{
					setState(295);
					match(PONTEIRO);
					}
				}

				setState(298);
				((CmdLeiaContext)_localctx).identificador = identificador();
				((CmdLeiaContext)_localctx).outrosId.add(((CmdLeiaContext)_localctx).identificador);
				}
				}
				setState(303);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(304);
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
		public ExpressaoContext primeiraExp;
		public ExpressaoContext expressao;
		public List<ExpressaoContext> outrasExp = new ArrayList<ExpressaoContext>();
		public TerminalNode ESCREVA() { return getToken(RegrasParser.ESCREVA, 0); }
		public TerminalNode ABRE_PARENTESES() { return getToken(RegrasParser.ABRE_PARENTESES, 0); }
		public TerminalNode FECHA_PARENTESES() { return getToken(RegrasParser.FECHA_PARENTESES, 0); }
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
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
		enterRule(_localctx, 38, RULE_cmdEscreva);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			match(ESCREVA);
			setState(307);
			match(ABRE_PARENTESES);
			setState(308);
			((CmdEscrevaContext)_localctx).primeiraExp = expressao();
			setState(313);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(309);
				match(VIRGULA);
				setState(310);
				((CmdEscrevaContext)_localctx).expressao = expressao();
				((CmdEscrevaContext)_localctx).outrasExp.add(((CmdEscrevaContext)_localctx).expressao);
				}
				}
				setState(315);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(316);
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
		public CmdContext cmd;
		public List<CmdContext> comandos = new ArrayList<CmdContext>();
		public List<CmdContext> outrosComandos = new ArrayList<CmdContext>();
		public TerminalNode SE() { return getToken(RegrasParser.SE, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode ENTAO() { return getToken(RegrasParser.ENTAO, 0); }
		public TerminalNode FIM_SE() { return getToken(RegrasParser.FIM_SE, 0); }
		public TerminalNode SENAO() { return getToken(RegrasParser.SENAO, 0); }
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
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
		enterRule(_localctx, 40, RULE_cmdSe);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			match(SE);
			setState(319);
			expressao();
			setState(320);
			match(ENTAO);
			setState(324);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & ((1L << (PONTEIRO - 10)) | (1L << (RETORNE - 10)) | (1L << (LEIA - 10)) | (1L << (ESCREVA - 10)) | (1L << (SE - 10)) | (1L << (CASO - 10)) | (1L << (PARA - 10)) | (1L << (FACA - 10)) | (1L << (ENQUANTO - 10)) | (1L << (IDENT - 10)))) != 0)) {
				{
				{
				setState(321);
				((CmdSeContext)_localctx).cmd = cmd();
				((CmdSeContext)_localctx).comandos.add(((CmdSeContext)_localctx).cmd);
				}
				}
				setState(326);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(334);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SENAO) {
				{
				setState(327);
				match(SENAO);
				setState(331);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & ((1L << (PONTEIRO - 10)) | (1L << (RETORNE - 10)) | (1L << (LEIA - 10)) | (1L << (ESCREVA - 10)) | (1L << (SE - 10)) | (1L << (CASO - 10)) | (1L << (PARA - 10)) | (1L << (FACA - 10)) | (1L << (ENQUANTO - 10)) | (1L << (IDENT - 10)))) != 0)) {
					{
					{
					setState(328);
					((CmdSeContext)_localctx).cmd = cmd();
					((CmdSeContext)_localctx).outrosComandos.add(((CmdSeContext)_localctx).cmd);
					}
					}
					setState(333);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(336);
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
		enterRule(_localctx, 42, RULE_cmdCaso);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			match(CASO);
			setState(339);
			exp_aritmetica();
			setState(340);
			match(SEJA);
			setState(341);
			selecao();
			setState(349);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SENAO) {
				{
				setState(342);
				match(SENAO);
				setState(346);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & ((1L << (PONTEIRO - 10)) | (1L << (RETORNE - 10)) | (1L << (LEIA - 10)) | (1L << (ESCREVA - 10)) | (1L << (SE - 10)) | (1L << (CASO - 10)) | (1L << (PARA - 10)) | (1L << (FACA - 10)) | (1L << (ENQUANTO - 10)) | (1L << (IDENT - 10)))) != 0)) {
					{
					{
					setState(343);
					cmd();
					}
					}
					setState(348);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(351);
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
		enterRule(_localctx, 44, RULE_cmdPara);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			match(PARA);
			setState(354);
			match(IDENT);
			setState(355);
			match(OP_ATRIBUICAO);
			setState(356);
			exp_aritmetica();
			setState(357);
			match(ATE);
			setState(358);
			exp_aritmetica();
			setState(359);
			match(FACA);
			setState(363);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & ((1L << (PONTEIRO - 10)) | (1L << (RETORNE - 10)) | (1L << (LEIA - 10)) | (1L << (ESCREVA - 10)) | (1L << (SE - 10)) | (1L << (CASO - 10)) | (1L << (PARA - 10)) | (1L << (FACA - 10)) | (1L << (ENQUANTO - 10)) | (1L << (IDENT - 10)))) != 0)) {
				{
				{
				setState(360);
				cmd();
				}
				}
				setState(365);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(366);
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
		enterRule(_localctx, 46, RULE_cmdEnquanto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			match(ENQUANTO);
			setState(369);
			expressao();
			setState(370);
			match(FACA);
			setState(374);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & ((1L << (PONTEIRO - 10)) | (1L << (RETORNE - 10)) | (1L << (LEIA - 10)) | (1L << (ESCREVA - 10)) | (1L << (SE - 10)) | (1L << (CASO - 10)) | (1L << (PARA - 10)) | (1L << (FACA - 10)) | (1L << (ENQUANTO - 10)) | (1L << (IDENT - 10)))) != 0)) {
				{
				{
				setState(371);
				cmd();
				}
				}
				setState(376);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(377);
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
		enterRule(_localctx, 48, RULE_cmdFaca);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			match(FACA);
			setState(383);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & ((1L << (PONTEIRO - 10)) | (1L << (RETORNE - 10)) | (1L << (LEIA - 10)) | (1L << (ESCREVA - 10)) | (1L << (SE - 10)) | (1L << (CASO - 10)) | (1L << (PARA - 10)) | (1L << (FACA - 10)) | (1L << (ENQUANTO - 10)) | (1L << (IDENT - 10)))) != 0)) {
				{
				{
				setState(380);
				cmd();
				}
				}
				setState(385);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(386);
			match(ATE);
			setState(387);
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
		enterRule(_localctx, 50, RULE_cmdAtribuicao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PONTEIRO) {
				{
				setState(389);
				match(PONTEIRO);
				}
			}

			setState(392);
			identificador();
			setState(393);
			match(OP_ATRIBUICAO);
			setState(394);
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
		public ExpressaoContext primeiraExp;
		public ExpressaoContext outrasExp;
		public TerminalNode IDENT() { return getToken(RegrasParser.IDENT, 0); }
		public TerminalNode ABRE_PARENTESES() { return getToken(RegrasParser.ABRE_PARENTESES, 0); }
		public TerminalNode FECHA_PARENTESES() { return getToken(RegrasParser.FECHA_PARENTESES, 0); }
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
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
		enterRule(_localctx, 52, RULE_cmdChamada);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			match(IDENT);
			setState(397);
			match(ABRE_PARENTESES);
			setState(398);
			((CmdChamadaContext)_localctx).primeiraExp = expressao();
			setState(403);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(399);
				match(VIRGULA);
				setState(400);
				((CmdChamadaContext)_localctx).outrasExp = expressao();
				}
				}
				setState(405);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(406);
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
		enterRule(_localctx, 54, RULE_cmdRetorne);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			match(RETORNE);
			setState(409);
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
			setState(411);
			constantes();
			setState(412);
			match(DELIM);
			setState(416);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & ((1L << (PONTEIRO - 10)) | (1L << (RETORNE - 10)) | (1L << (LEIA - 10)) | (1L << (ESCREVA - 10)) | (1L << (SE - 10)) | (1L << (CASO - 10)) | (1L << (PARA - 10)) | (1L << (FACA - 10)) | (1L << (ENQUANTO - 10)) | (1L << (IDENT - 10)))) != 0)) {
				{
				{
				setState(413);
				cmd();
				}
				}
				setState(418);
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
			setState(422);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SUB || _la==NUM_INT) {
				{
				{
				setState(419);
				item_selecao();
				}
				}
				setState(424);
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
			setState(425);
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
		public Token primeiroNum;
		public Token segundoNum;
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
			setState(428);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SUB) {
				{
				setState(427);
				op_unario();
				}
			}

			setState(430);
			((Numero_intervaloContext)_localctx).primeiroNum = match(NUM_INT);
			setState(436);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PONTOPONTO) {
				{
				setState(431);
				match(PONTOPONTO);
				setState(433);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SUB) {
					{
					setState(432);
					op_unario();
					}
				}

				setState(435);
				((Numero_intervaloContext)_localctx).segundoNum = match(NUM_INT);
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
			setState(438);
			numero_intervalo();
			setState(443);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(439);
				match(VIRGULA);
				setState(440);
				numero_intervalo();
				}
				}
				setState(445);
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
		public TermoContext primeiroTermo;
		public TermoContext termo;
		public List<TermoContext> outrosTermos = new ArrayList<TermoContext>();
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
		enterRule(_localctx, 66, RULE_exp_aritmetica);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
			((Exp_aritmeticaContext)_localctx).primeiroTermo = termo();
			setState(452);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(447);
					op1();
					setState(448);
					((Exp_aritmeticaContext)_localctx).termo = termo();
					((Exp_aritmeticaContext)_localctx).outrosTermos.add(((Exp_aritmeticaContext)_localctx).termo);
					}
					} 
				}
				setState(454);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
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
		public FatorContext primeiroFat;
		public FatorContext fator;
		public List<FatorContext> outrosFat = new ArrayList<FatorContext>();
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
		enterRule(_localctx, 68, RULE_termo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(455);
			((TermoContext)_localctx).primeiroFat = fator();
			setState(461);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULT || _la==DIV) {
				{
				{
				setState(456);
				op2();
				setState(457);
				((TermoContext)_localctx).fator = fator();
				((TermoContext)_localctx).outrosFat.add(((TermoContext)_localctx).fator);
				}
				}
				setState(463);
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

	public static class FatorContext extends ParserRuleContext {
		public ParcelaContext primeiraPar;
		public ParcelaContext parcela;
		public List<ParcelaContext> outrasPar = new ArrayList<ParcelaContext>();
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
		enterRule(_localctx, 70, RULE_fator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(464);
			((FatorContext)_localctx).primeiraPar = parcela();
			setState(470);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PORCENTAGEM) {
				{
				{
				setState(465);
				op3();
				setState(466);
				((FatorContext)_localctx).parcela = parcela();
				((FatorContext)_localctx).outrasPar.add(((FatorContext)_localctx).parcela);
				}
				}
				setState(472);
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
		enterRule(_localctx, 72, RULE_parcela);
		int _la;
		try {
			setState(478);
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
				setState(474);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SUB) {
					{
					setState(473);
					op_unario();
					}
				}

				setState(476);
				parcela_unario();
				}
				break;
			case ENDERECO_DO_PONTEIRO:
			case CADEIA:
				enterOuterAlt(_localctx, 2);
				{
				setState(477);
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

	public static class Parcela_unarioContext extends ParserRuleContext {
		public ExpressaoContext primeiraExp;
		public ExpressaoContext expressao;
		public List<ExpressaoContext> outrasExp = new ArrayList<ExpressaoContext>();
		public ExpressaoContext outraExp;
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public TerminalNode PONTEIRO() { return getToken(RegrasParser.PONTEIRO, 0); }
		public TerminalNode IDENT() { return getToken(RegrasParser.IDENT, 0); }
		public TerminalNode ABRE_PARENTESES() { return getToken(RegrasParser.ABRE_PARENTESES, 0); }
		public TerminalNode FECHA_PARENTESES() { return getToken(RegrasParser.FECHA_PARENTESES, 0); }
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
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
		enterRule(_localctx, 74, RULE_parcela_unario);
		int _la;
		try {
			setState(502);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(481);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PONTEIRO) {
					{
					setState(480);
					match(PONTEIRO);
					}
				}

				setState(483);
				identificador();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(484);
				match(IDENT);
				setState(485);
				match(ABRE_PARENTESES);
				setState(486);
				((Parcela_unarioContext)_localctx).primeiraExp = expressao();
				setState(491);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VIRGULA) {
					{
					{
					setState(487);
					match(VIRGULA);
					setState(488);
					((Parcela_unarioContext)_localctx).expressao = expressao();
					((Parcela_unarioContext)_localctx).outrasExp.add(((Parcela_unarioContext)_localctx).expressao);
					}
					}
					setState(493);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(494);
				match(FECHA_PARENTESES);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(496);
				match(NUM_INT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(497);
				match(NUM_REAL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(498);
				match(ABRE_PARENTESES);
				setState(499);
				((Parcela_unarioContext)_localctx).outraExp = expressao();
				setState(500);
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
		enterRule(_localctx, 76, RULE_parcela_nao_unario);
		try {
			setState(507);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENDERECO_DO_PONTEIRO:
				enterOuterAlt(_localctx, 1);
				{
				setState(504);
				match(ENDERECO_DO_PONTEIRO);
				setState(505);
				identificador();
				}
				break;
			case CADEIA:
				enterOuterAlt(_localctx, 2);
				{
				setState(506);
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
			setState(509);
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
			setState(511);
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
			setState(513);
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
			setState(515);
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
			setState(517);
			exp_aritmetica();
			setState(521);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IGUAL) | (1L << DIFERENTE) | (1L << MAIOR) | (1L << MAIOR_IGUAL) | (1L << MENOR) | (1L << MENOR_IGUAL))) != 0)) {
				{
				setState(518);
				op_relacional();
				setState(519);
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

	public static class ExpressaoContext extends ParserRuleContext {
		public Termo_logicoContext primeiroTermoLog;
		public Termo_logicoContext termo_logico;
		public List<Termo_logicoContext> outrosTermosLog = new ArrayList<Termo_logicoContext>();
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
		enterRule(_localctx, 88, RULE_expressao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(523);
			((ExpressaoContext)_localctx).primeiroTermoLog = termo_logico();
			setState(529);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==E) {
				{
				{
				setState(524);
				op_logico_1();
				setState(525);
				((ExpressaoContext)_localctx).termo_logico = termo_logico();
				((ExpressaoContext)_localctx).outrosTermosLog.add(((ExpressaoContext)_localctx).termo_logico);
				}
				}
				setState(531);
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

	public static class Termo_logicoContext extends ParserRuleContext {
		public Fator_logicoContext primeiroFatLogico;
		public Fator_logicoContext fator_logico;
		public List<Fator_logicoContext> outrosFatLogico = new ArrayList<Fator_logicoContext>();
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
			setState(532);
			((Termo_logicoContext)_localctx).primeiroFatLogico = fator_logico();
			setState(538);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OU) {
				{
				{
				setState(533);
				op_logico_2();
				setState(534);
				((Termo_logicoContext)_localctx).fator_logico = fator_logico();
				((Termo_logicoContext)_localctx).outrosFatLogico.add(((Termo_logicoContext)_localctx).fator_logico);
				}
				}
				setState(540);
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
		enterRule(_localctx, 92, RULE_fator_logico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(542);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEGACAO) {
				{
				setState(541);
				match(NEGACAO);
				}
			}

			setState(544);
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
			setState(548);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VERDADEIRO:
			case FALSO:
				enterOuterAlt(_localctx, 1);
				{
				setState(546);
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
				setState(547);
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
			setState(550);
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
			setState(552);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3H\u022d\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\3\7\3n\n\3\f\3\16\3q\13\3\3\4\3\4\5\4u\n\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0084\n\5\3\6\3\6\3\6"+
		"\3\6\5\6\u008a\n\6\3\6\3\6\7\6\u008e\n\6\f\6\16\6\u0091\13\6\3\6\7\6\u0094"+
		"\n\6\f\6\16\6\u0097\13\6\3\6\3\6\3\6\3\6\3\6\5\6\u009e\n\6\3\6\3\6\3\6"+
		"\3\6\7\6\u00a4\n\6\f\6\16\6\u00a7\13\6\3\6\7\6\u00aa\n\6\f\6\16\6\u00ad"+
		"\13\6\3\6\3\6\5\6\u00b1\n\6\3\7\3\7\3\7\7\7\u00b6\n\7\f\7\16\7\u00b9\13"+
		"\7\3\7\3\7\3\b\3\b\3\b\3\b\7\b\u00c1\n\b\f\b\16\b\u00c4\13\b\3\t\3\t\5"+
		"\t\u00c8\n\t\3\n\3\n\3\13\3\13\5\13\u00ce\n\13\3\f\5\f\u00d1\n\f\3\f\3"+
		"\f\3\r\3\r\3\16\5\16\u00d8\n\16\3\16\3\16\3\16\7\16\u00dd\n\16\f\16\16"+
		"\16\u00e0\13\16\3\16\3\16\3\16\3\17\3\17\3\17\7\17\u00e8\n\17\f\17\16"+
		"\17\u00eb\13\17\3\20\3\20\7\20\u00ef\n\20\f\20\16\20\u00f2\13\20\3\20"+
		"\3\20\3\21\3\21\3\21\7\21\u00f9\n\21\f\21\16\21\u00fc\13\21\3\21\3\21"+
		"\3\21\3\22\7\22\u0102\n\22\f\22\16\22\u0105\13\22\3\22\7\22\u0108\n\22"+
		"\f\22\16\22\u010b\13\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0121\n\23"+
		"\3\24\3\24\3\24\5\24\u0126\n\24\3\24\3\24\3\24\5\24\u012b\n\24\3\24\7"+
		"\24\u012e\n\24\f\24\16\24\u0131\13\24\3\24\3\24\3\25\3\25\3\25\3\25\3"+
		"\25\7\25\u013a\n\25\f\25\16\25\u013d\13\25\3\25\3\25\3\26\3\26\3\26\3"+
		"\26\7\26\u0145\n\26\f\26\16\26\u0148\13\26\3\26\3\26\7\26\u014c\n\26\f"+
		"\26\16\26\u014f\13\26\5\26\u0151\n\26\3\26\3\26\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\7\27\u015b\n\27\f\27\16\27\u015e\13\27\5\27\u0160\n\27\3\27\3"+
		"\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\7\30\u016c\n\30\f\30\16\30"+
		"\u016f\13\30\3\30\3\30\3\31\3\31\3\31\3\31\7\31\u0177\n\31\f\31\16\31"+
		"\u017a\13\31\3\31\3\31\3\32\3\32\7\32\u0180\n\32\f\32\16\32\u0183\13\32"+
		"\3\32\3\32\3\32\3\33\5\33\u0189\n\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34"+
		"\3\34\3\34\7\34\u0194\n\34\f\34\16\34\u0197\13\34\3\34\3\34\3\35\3\35"+
		"\3\35\3\36\3\36\3\36\7\36\u01a1\n\36\f\36\16\36\u01a4\13\36\3\37\7\37"+
		"\u01a7\n\37\f\37\16\37\u01aa\13\37\3 \3 \3!\5!\u01af\n!\3!\3!\3!\5!\u01b4"+
		"\n!\3!\5!\u01b7\n!\3\"\3\"\3\"\7\"\u01bc\n\"\f\"\16\"\u01bf\13\"\3#\3"+
		"#\3#\3#\7#\u01c5\n#\f#\16#\u01c8\13#\3$\3$\3$\3$\7$\u01ce\n$\f$\16$\u01d1"+
		"\13$\3%\3%\3%\3%\7%\u01d7\n%\f%\16%\u01da\13%\3&\5&\u01dd\n&\3&\3&\5&"+
		"\u01e1\n&\3\'\5\'\u01e4\n\'\3\'\3\'\3\'\3\'\3\'\3\'\7\'\u01ec\n\'\f\'"+
		"\16\'\u01ef\13\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u01f9\n\'\3(\3(\3"+
		"(\5(\u01fe\n(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3-\3-\5-\u020c\n-\3.\3.\3"+
		".\3.\7.\u0212\n.\f.\16.\u0215\13.\3/\3/\3/\3/\7/\u021b\n/\f/\16/\u021e"+
		"\13/\3\60\5\60\u0221\n\60\3\60\3\60\3\61\3\61\5\61\u0227\n\61\3\62\3\62"+
		"\3\63\3\63\3\63\2\2\64\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,"+
		".\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bd\2\b\3\2\r\20\5\2\21\2289FF\3\2\63"+
		"\64\3\2\65\66\3\2-\62\3\2\21\22\2\u0249\2f\3\2\2\2\4o\3\2\2\2\6t\3\2\2"+
		"\2\b\u0083\3\2\2\2\n\u00b0\3\2\2\2\f\u00b2\3\2\2\2\16\u00c2\3\2\2\2\20"+
		"\u00c7\3\2\2\2\22\u00c9\3\2\2\2\24\u00cd\3\2\2\2\26\u00d0\3\2\2\2\30\u00d4"+
		"\3\2\2\2\32\u00d7\3\2\2\2\34\u00e4\3\2\2\2\36\u00ec\3\2\2\2 \u00f5\3\2"+
		"\2\2\"\u0103\3\2\2\2$\u0120\3\2\2\2&\u0122\3\2\2\2(\u0134\3\2\2\2*\u0140"+
		"\3\2\2\2,\u0154\3\2\2\2.\u0163\3\2\2\2\60\u0172\3\2\2\2\62\u017d\3\2\2"+
		"\2\64\u0188\3\2\2\2\66\u018e\3\2\2\28\u019a\3\2\2\2:\u019d\3\2\2\2<\u01a8"+
		"\3\2\2\2>\u01ab\3\2\2\2@\u01ae\3\2\2\2B\u01b8\3\2\2\2D\u01c0\3\2\2\2F"+
		"\u01c9\3\2\2\2H\u01d2\3\2\2\2J\u01e0\3\2\2\2L\u01f8\3\2\2\2N\u01fd\3\2"+
		"\2\2P\u01ff\3\2\2\2R\u0201\3\2\2\2T\u0203\3\2\2\2V\u0205\3\2\2\2X\u0207"+
		"\3\2\2\2Z\u020d\3\2\2\2\\\u0216\3\2\2\2^\u0220\3\2\2\2`\u0226\3\2\2\2"+
		"b\u0228\3\2\2\2d\u022a\3\2\2\2fg\5\4\3\2gh\7\3\2\2hi\5\"\22\2ij\7@\2\2"+
		"jk\7\2\2\3k\3\3\2\2\2ln\5\6\4\2ml\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3\2\2"+
		"\2p\5\3\2\2\2qo\3\2\2\2ru\5\n\6\2su\5\b\5\2tr\3\2\2\2ts\3\2\2\2u\7\3\2"+
		"\2\2vw\7\5\2\2w\u0084\5 \21\2xy\7\n\2\2yz\7B\2\2z{\7\6\2\2{|\5\22\n\2"+
		"|}\7-\2\2}~\5\30\r\2~\u0084\3\2\2\2\177\u0080\7\13\2\2\u0080\u0081\7B"+
		"\2\2\u0081\u0082\7\6\2\2\u0082\u0084\5\20\t\2\u0083v\3\2\2\2\u0083x\3"+
		"\2\2\2\u0083\177\3\2\2\2\u0084\t\3\2\2\2\u0085\u0086\7\25\2\2\u0086\u0087"+
		"\7B\2\2\u0087\u0089\7:\2\2\u0088\u008a\5\34\17\2\u0089\u0088\3\2\2\2\u0089"+
		"\u008a\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008f\7;\2\2\u008c\u008e\5\b"+
		"\5\2\u008d\u008c\3\2\2\2\u008e\u0091\3\2\2\2\u008f\u008d\3\2\2\2\u008f"+
		"\u0090\3\2\2\2\u0090\u0095\3\2\2\2\u0091\u008f\3\2\2\2\u0092\u0094\5$"+
		"\23\2\u0093\u0092\3\2\2\2\u0094\u0097\3\2\2\2\u0095\u0093\3\2\2\2\u0095"+
		"\u0096\3\2\2\2\u0096\u0098\3\2\2\2\u0097\u0095\3\2\2\2\u0098\u00b1\7\26"+
		"\2\2\u0099\u009a\7\27\2\2\u009a\u009b\7B\2\2\u009b\u009d\7:\2\2\u009c"+
		"\u009e\5\34\17\2\u009d\u009c\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009f\3"+
		"\2\2\2\u009f\u00a0\7;\2\2\u00a0\u00a1\7\6\2\2\u00a1\u00a5\5\26\f\2\u00a2"+
		"\u00a4\5\b\5\2\u00a3\u00a2\3\2\2\2\u00a4\u00a7\3\2\2\2\u00a5\u00a3\3\2"+
		"\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00ab\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8"+
		"\u00aa\5$\23\2\u00a9\u00a8\3\2\2\2\u00aa\u00ad\3\2\2\2\u00ab\u00a9\3\2"+
		"\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ae\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae"+
		"\u00af\7\32\2\2\u00af\u00b1\3\2\2\2\u00b0\u0085\3\2\2\2\u00b0\u0099\3"+
		"\2\2\2\u00b1\13\3\2\2\2\u00b2\u00b7\7B\2\2\u00b3\u00b4\7\b\2\2\u00b4\u00b6"+
		"\7B\2\2\u00b5\u00b3\3\2\2\2\u00b6\u00b9\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7"+
		"\u00b8\3\2\2\2\u00b8\u00ba\3\2\2\2\u00b9\u00b7\3\2\2\2\u00ba\u00bb\5\16"+
		"\b\2\u00bb\r\3\2\2\2\u00bc\u00bd\7<\2\2\u00bd\u00be\5D#\2\u00be\u00bf"+
		"\7=\2\2\u00bf\u00c1\3\2\2\2\u00c0\u00bc\3\2\2\2\u00c1\u00c4\3\2\2\2\u00c2"+
		"\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\17\3\2\2\2\u00c4\u00c2\3\2\2"+
		"\2\u00c5\u00c8\5\36\20\2\u00c6\u00c8\5\26\f\2\u00c7\u00c5\3\2\2\2\u00c7"+
		"\u00c6\3\2\2\2\u00c8\21\3\2\2\2\u00c9\u00ca\t\2\2\2\u00ca\23\3\2\2\2\u00cb"+
		"\u00ce\5\22\n\2\u00cc\u00ce\7B\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00cc\3\2"+
		"\2\2\u00ce\25\3\2\2\2\u00cf\u00d1\7\f\2\2\u00d0\u00cf\3\2\2\2\u00d0\u00d1"+
		"\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d3\5\24\13\2\u00d3\27\3\2\2\2\u00d4"+
		"\u00d5\t\3\2\2\u00d5\31\3\2\2\2\u00d6\u00d8\7?\2\2\u00d7\u00d6\3\2\2\2"+
		"\u00d7\u00d8\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00de\5\f\7\2\u00da\u00db"+
		"\7\7\2\2\u00db\u00dd\5\f\7\2\u00dc\u00da\3\2\2\2\u00dd\u00e0\3\2\2\2\u00de"+
		"\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e1\3\2\2\2\u00e0\u00de\3\2"+
		"\2\2\u00e1\u00e2\7\6\2\2\u00e2\u00e3\5\26\f\2\u00e3\33\3\2\2\2\u00e4\u00e9"+
		"\5\32\16\2\u00e5\u00e6\7\7\2\2\u00e6\u00e8\5\32\16\2\u00e7\u00e5\3\2\2"+
		"\2\u00e8\u00eb\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\35"+
		"\3\2\2\2\u00eb\u00e9\3\2\2\2\u00ec\u00f0\7\23\2\2\u00ed\u00ef\5 \21\2"+
		"\u00ee\u00ed\3\2\2\2\u00ef\u00f2\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1"+
		"\3\2\2\2\u00f1\u00f3\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f3\u00f4\7\24\2\2"+
		"\u00f4\37\3\2\2\2\u00f5\u00fa\5\f\7\2\u00f6\u00f7\7\7\2\2\u00f7\u00f9"+
		"\5\f\7\2\u00f8\u00f6\3\2\2\2\u00f9\u00fc\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa"+
		"\u00fb\3\2\2\2\u00fb\u00fd\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fd\u00fe\7\6"+
		"\2\2\u00fe\u00ff\5\20\t\2\u00ff!\3\2\2\2\u0100\u0102\5\b\5\2\u0101\u0100"+
		"\3\2\2\2\u0102\u0105\3\2\2\2\u0103\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104"+
		"\u0109\3\2\2\2\u0105\u0103\3\2\2\2\u0106\u0108\5$\23\2\u0107\u0106\3\2"+
		"\2\2\u0108\u010b\3\2\2\2\u0109\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a"+
		"#\3\2\2\2\u010b\u0109\3\2\2\2\u010c\u0121\5&\24\2\u010d\u0121\5(\25\2"+
		"\u010e\u0121\5*\26\2\u010f\u0121\5,\27\2\u0110\u0121\5.\30\2\u0111\u0121"+
		"\5\60\31\2\u0112\u0121\5\62\32\2\u0113\u0121\5\64\33\2\u0114\u0121\5\66"+
		"\34\2\u0115\u0121\58\35\2\u0116\u0121\5&\24\2\u0117\u0121\5(\25\2\u0118"+
		"\u0121\5*\26\2\u0119\u0121\5,\27\2\u011a\u0121\5.\30\2\u011b\u0121\5\60"+
		"\31\2\u011c\u0121\5\62\32\2\u011d\u0121\5\64\33\2\u011e\u0121\5\66\34"+
		"\2\u011f\u0121\58\35\2\u0120\u010c\3\2\2\2\u0120\u010d\3\2\2\2\u0120\u010e"+
		"\3\2\2\2\u0120\u010f\3\2\2\2\u0120\u0110\3\2\2\2\u0120\u0111\3\2\2\2\u0120"+
		"\u0112\3\2\2\2\u0120\u0113\3\2\2\2\u0120\u0114\3\2\2\2\u0120\u0115\3\2"+
		"\2\2\u0120\u0116\3\2\2\2\u0120\u0117\3\2\2\2\u0120\u0118\3\2\2\2\u0120"+
		"\u0119\3\2\2\2\u0120\u011a\3\2\2\2\u0120\u011b\3\2\2\2\u0120\u011c\3\2"+
		"\2\2\u0120\u011d\3\2\2\2\u0120\u011e\3\2\2\2\u0120\u011f\3\2\2\2\u0121"+
		"%\3\2\2\2\u0122\u0123\7\33\2\2\u0123\u0125\7:\2\2\u0124\u0126\7\f\2\2"+
		"\u0125\u0124\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u012f"+
		"\5\f\7\2\u0128\u012a\7\7\2\2\u0129\u012b\7\f\2\2\u012a\u0129\3\2\2\2\u012a"+
		"\u012b\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012e\5\f\7\2\u012d\u0128\3\2"+
		"\2\2\u012e\u0131\3\2\2\2\u012f\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130"+
		"\u0132\3\2\2\2\u0131\u012f\3\2\2\2\u0132\u0133\7;\2\2\u0133\'\3\2\2\2"+
		"\u0134\u0135\7\34\2\2\u0135\u0136\7:\2\2\u0136\u013b\5Z.\2\u0137\u0138"+
		"\7\7\2\2\u0138\u013a\5Z.\2\u0139\u0137\3\2\2\2\u013a\u013d\3\2\2\2\u013b"+
		"\u0139\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013e\3\2\2\2\u013d\u013b\3\2"+
		"\2\2\u013e\u013f\7;\2\2\u013f)\3\2\2\2\u0140\u0141\7\35\2\2\u0141\u0142"+
		"\5Z.\2\u0142\u0146\7\36\2\2\u0143\u0145\5$\23\2\u0144\u0143\3\2\2\2\u0145"+
		"\u0148\3\2\2\2\u0146\u0144\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0150\3\2"+
		"\2\2\u0148\u0146\3\2\2\2\u0149\u014d\7\37\2\2\u014a\u014c\5$\23\2\u014b"+
		"\u014a\3\2\2\2\u014c\u014f\3\2\2\2\u014d\u014b\3\2\2\2\u014d\u014e\3\2"+
		"\2\2\u014e\u0151\3\2\2\2\u014f\u014d\3\2\2\2\u0150\u0149\3\2\2\2\u0150"+
		"\u0151\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0153\7 \2\2\u0153+\3\2\2\2\u0154"+
		"\u0155\7!\2\2\u0155\u0156\5D#\2\u0156\u0157\7\"\2\2\u0157\u015f\5<\37"+
		"\2\u0158\u015c\7\37\2\2\u0159\u015b\5$\23\2\u015a\u0159\3\2\2\2\u015b"+
		"\u015e\3\2\2\2\u015c\u015a\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u0160\3\2"+
		"\2\2\u015e\u015c\3\2\2\2\u015f\u0158\3\2\2\2\u015f\u0160\3\2\2\2\u0160"+
		"\u0161\3\2\2\2\u0161\u0162\7#\2\2\u0162-\3\2\2\2\u0163\u0164\7$\2\2\u0164"+
		"\u0165\7B\2\2\u0165\u0166\7\67\2\2\u0166\u0167\5D#\2\u0167\u0168\7%\2"+
		"\2\u0168\u0169\5D#\2\u0169\u016d\7&\2\2\u016a\u016c\5$\23\2\u016b\u016a"+
		"\3\2\2\2\u016c\u016f\3\2\2\2\u016d\u016b\3\2\2\2\u016d\u016e\3\2\2\2\u016e"+
		"\u0170\3\2\2\2\u016f\u016d\3\2\2\2\u0170\u0171\7\'\2\2\u0171/\3\2\2\2"+
		"\u0172\u0173\7(\2\2\u0173\u0174\5Z.\2\u0174\u0178\7&\2\2\u0175\u0177\5"+
		"$\23\2\u0176\u0175\3\2\2\2\u0177\u017a\3\2\2\2\u0178\u0176\3\2\2\2\u0178"+
		"\u0179\3\2\2\2\u0179\u017b\3\2\2\2\u017a\u0178\3\2\2\2\u017b\u017c\7)"+
		"\2\2\u017c\61\3\2\2\2\u017d\u0181\7&\2\2\u017e\u0180\5$\23\2\u017f\u017e"+
		"\3\2\2\2\u0180\u0183\3\2\2\2\u0181\u017f\3\2\2\2\u0181\u0182\3\2\2\2\u0182"+
		"\u0184\3\2\2\2\u0183\u0181\3\2\2\2\u0184\u0185\7%\2\2\u0185\u0186\5Z."+
		"\2\u0186\63\3\2\2\2\u0187\u0189\7\f\2\2\u0188\u0187\3\2\2\2\u0188\u0189"+
		"\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u018b\5\f\7\2\u018b\u018c\7\67\2\2"+
		"\u018c\u018d\5Z.\2\u018d\65\3\2\2\2\u018e\u018f\7B\2\2\u018f\u0190\7:"+
		"\2\2\u0190\u0195\5Z.\2\u0191\u0192\7\7\2\2\u0192\u0194\5Z.\2\u0193\u0191"+
		"\3\2\2\2\u0194\u0197\3\2\2\2\u0195\u0193\3\2\2\2\u0195\u0196\3\2\2\2\u0196"+
		"\u0198\3\2\2\2\u0197\u0195\3\2\2\2\u0198\u0199\7;\2\2\u0199\67\3\2\2\2"+
		"\u019a\u019b\7\31\2\2\u019b\u019c\5Z.\2\u019c9\3\2\2\2\u019d\u019e\5B"+
		"\"\2\u019e\u01a2\7\6\2\2\u019f\u01a1\5$\23\2\u01a0\u019f\3\2\2\2\u01a1"+
		"\u01a4\3\2\2\2\u01a2\u01a0\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3;\3\2\2\2"+
		"\u01a4\u01a2\3\2\2\2\u01a5\u01a7\5:\36\2\u01a6\u01a5\3\2\2\2\u01a7\u01aa"+
		"\3\2\2\2\u01a8\u01a6\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9=\3\2\2\2\u01aa"+
		"\u01a8\3\2\2\2\u01ab\u01ac\7\64\2\2\u01ac?\3\2\2\2\u01ad\u01af\5> \2\u01ae"+
		"\u01ad\3\2\2\2\u01ae\u01af\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0\u01b6\78"+
		"\2\2\u01b1\u01b3\7\t\2\2\u01b2\u01b4\5> \2\u01b3\u01b2\3\2\2\2\u01b3\u01b4"+
		"\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01b7\78\2\2\u01b6\u01b1\3\2\2\2\u01b6"+
		"\u01b7\3\2\2\2\u01b7A\3\2\2\2\u01b8\u01bd\5@!\2\u01b9\u01ba\7\7\2\2\u01ba"+
		"\u01bc\5@!\2\u01bb\u01b9\3\2\2\2\u01bc\u01bf\3\2\2\2\u01bd\u01bb\3\2\2"+
		"\2\u01bd\u01be\3\2\2\2\u01beC\3\2\2\2\u01bf\u01bd\3\2\2\2\u01c0\u01c6"+
		"\5F$\2\u01c1\u01c2\5P)\2\u01c2\u01c3\5F$\2\u01c3\u01c5\3\2\2\2\u01c4\u01c1"+
		"\3\2\2\2\u01c5\u01c8\3\2\2\2\u01c6\u01c4\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7"+
		"E\3\2\2\2\u01c8\u01c6\3\2\2\2\u01c9\u01cf\5H%\2\u01ca\u01cb\5R*\2\u01cb"+
		"\u01cc\5H%\2\u01cc\u01ce\3\2\2\2\u01cd\u01ca\3\2\2\2\u01ce\u01d1\3\2\2"+
		"\2\u01cf\u01cd\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0G\3\2\2\2\u01d1\u01cf"+
		"\3\2\2\2\u01d2\u01d8\5J&\2\u01d3\u01d4\5T+\2\u01d4\u01d5\5J&\2\u01d5\u01d7"+
		"\3\2\2\2\u01d6\u01d3\3\2\2\2\u01d7\u01da\3\2\2\2\u01d8\u01d6\3\2\2\2\u01d8"+
		"\u01d9\3\2\2\2\u01d9I\3\2\2\2\u01da\u01d8\3\2\2\2\u01db\u01dd\5> \2\u01dc"+
		"\u01db\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd\u01de\3\2\2\2\u01de\u01e1\5L"+
		"\'\2\u01df\u01e1\5N(\2\u01e0\u01dc\3\2\2\2\u01e0\u01df\3\2\2\2\u01e1K"+
		"\3\2\2\2\u01e2\u01e4\7\f\2\2\u01e3\u01e2\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4"+
		"\u01e5\3\2\2\2\u01e5\u01f9\5\f\7\2\u01e6\u01e7\7B\2\2\u01e7\u01e8\7:\2"+
		"\2\u01e8\u01ed\5Z.\2\u01e9\u01ea\7\7\2\2\u01ea\u01ec\5Z.\2\u01eb\u01e9"+
		"\3\2\2\2\u01ec\u01ef\3\2\2\2\u01ed\u01eb\3\2\2\2\u01ed\u01ee\3\2\2\2\u01ee"+
		"\u01f0\3\2\2\2\u01ef\u01ed\3\2\2\2\u01f0\u01f1\7;\2\2\u01f1\u01f9\3\2"+
		"\2\2\u01f2\u01f9\78\2\2\u01f3\u01f9\79\2\2\u01f4\u01f5\7:\2\2\u01f5\u01f6"+
		"\5Z.\2\u01f6\u01f7\7;\2\2\u01f7\u01f9\3\2\2\2\u01f8\u01e3\3\2\2\2\u01f8"+
		"\u01e6\3\2\2\2\u01f8\u01f2\3\2\2\2\u01f8\u01f3\3\2\2\2\u01f8\u01f4\3\2"+
		"\2\2\u01f9M\3\2\2\2\u01fa\u01fb\7A\2\2\u01fb\u01fe\5\f\7\2\u01fc\u01fe"+
		"\7F\2\2\u01fd\u01fa\3\2\2\2\u01fd\u01fc\3\2\2\2\u01feO\3\2\2\2\u01ff\u0200"+
		"\t\4\2\2\u0200Q\3\2\2\2\u0201\u0202\t\5\2\2\u0202S\3\2\2\2\u0203\u0204"+
		"\7>\2\2\u0204U\3\2\2\2\u0205\u0206\t\6\2\2\u0206W\3\2\2\2\u0207\u020b"+
		"\5D#\2\u0208\u0209\5V,\2\u0209\u020a\5D#\2\u020a\u020c\3\2\2\2\u020b\u0208"+
		"\3\2\2\2\u020b\u020c\3\2\2\2\u020cY\3\2\2\2\u020d\u0213\5\\/\2\u020e\u020f"+
		"\5b\62\2\u020f\u0210\5\\/\2\u0210\u0212\3\2\2\2\u0211\u020e\3\2\2\2\u0212"+
		"\u0215\3\2\2\2\u0213\u0211\3\2\2\2\u0213\u0214\3\2\2\2\u0214[\3\2\2\2"+
		"\u0215\u0213\3\2\2\2\u0216\u021c\5^\60\2\u0217\u0218\5d\63\2\u0218\u0219"+
		"\5^\60\2\u0219\u021b\3\2\2\2\u021a\u0217\3\2\2\2\u021b\u021e\3\2\2\2\u021c"+
		"\u021a\3\2\2\2\u021c\u021d\3\2\2\2\u021d]\3\2\2\2\u021e\u021c\3\2\2\2"+
		"\u021f\u0221\7,\2\2\u0220\u021f\3\2\2\2\u0220\u0221\3\2\2\2\u0221\u0222"+
		"\3\2\2\2\u0222\u0223\5`\61\2\u0223_\3\2\2\2\u0224\u0227\t\7\2\2\u0225"+
		"\u0227\5X-\2\u0226\u0224\3\2\2\2\u0226\u0225\3\2\2\2\u0227a\3\2\2\2\u0228"+
		"\u0229\7*\2\2\u0229c\3\2\2\2\u022a\u022b\7+\2\2\u022be\3\2\2\2;ot\u0083"+
		"\u0089\u008f\u0095\u009d\u00a5\u00ab\u00b0\u00b7\u00c2\u00c7\u00cd\u00d0"+
		"\u00d7\u00de\u00e9\u00f0\u00fa\u0103\u0109\u0120\u0125\u012a\u012f\u013b"+
		"\u0146\u014d\u0150\u015c\u015f\u016d\u0178\u0181\u0188\u0195\u01a2\u01a8"+
		"\u01ae\u01b3\u01b6\u01bd\u01c6\u01cf\u01d8\u01dc\u01e0\u01e3\u01ed\u01f8"+
		"\u01fd\u020b\u0213\u021c\u0220\u0226";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}