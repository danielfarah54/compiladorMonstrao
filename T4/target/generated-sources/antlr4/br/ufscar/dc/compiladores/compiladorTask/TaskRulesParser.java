// Generated from br/ufscar/dc/compiladores/compiladorTask/TaskRules.g4 by ANTLR 4.9.1
package br.ufscar.dc.compiladores.compiladorTask;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TaskRulesParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, CRONOGRAMA=4, TASK=5, NAME=6, DIAMES=7, ANO=8, 
		DESCRIPTION=9, CASA=10, TRABALHO=11, PROVA=12, EXERCICIO=13, EVENTOS=14, 
		OUTROS=15, ABRE_CHAVE=16, FECHA_CHAVE=17, DOIS_PONTOS=18, PONTO_VIRGULA=19, 
		INT=20, CADEIA_LINHA_NAO_FECHADA=21, CADEIA_LINHA=22, CADEIA_MULTILINHA_NAO_FECHADA=23, 
		CADEIA_MULTILINHA=24, COMENTARIO=25, WS=26, ERRO=27, FORMATO_DATA=28;
	public static final int
		RULE_nome = 0, RULE_categoria = 1, RULE_tipo_categoria = 2, RULE_local = 3, 
		RULE_data = 4, RULE_descricao = 5, RULE_tarefa = 6, RULE_tarefas = 7, 
		RULE_programa = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"nome", "categoria", "tipo_categoria", "local", "data", "descricao", 
			"tarefa", "tarefas", "programa"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'category'", "'local'", "'date'", "'cronograma'", "'task'", "'name'", 
			null, null, "'description'", "'casa'", "'trabalho'", "'prova'", "'exercicio'", 
			"'eventos'", "'outros'", "'{'", "'}'", "':'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "CRONOGRAMA", "TASK", "NAME", "DIAMES", "ANO", 
			"DESCRIPTION", "CASA", "TRABALHO", "PROVA", "EXERCICIO", "EVENTOS", "OUTROS", 
			"ABRE_CHAVE", "FECHA_CHAVE", "DOIS_PONTOS", "PONTO_VIRGULA", "INT", "CADEIA_LINHA_NAO_FECHADA", 
			"CADEIA_LINHA", "CADEIA_MULTILINHA_NAO_FECHADA", "CADEIA_MULTILINHA", 
			"COMENTARIO", "WS", "ERRO", "FORMATO_DATA"
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
	public String getGrammarFileName() { return "TaskRules.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TaskRulesParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class NomeContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(TaskRulesParser.NAME, 0); }
		public TerminalNode DOIS_PONTOS() { return getToken(TaskRulesParser.DOIS_PONTOS, 0); }
		public TerminalNode CADEIA_LINHA() { return getToken(TaskRulesParser.CADEIA_LINHA, 0); }
		public TerminalNode PONTO_VIRGULA() { return getToken(TaskRulesParser.PONTO_VIRGULA, 0); }
		public NomeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nome; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaskRulesListener ) ((TaskRulesListener)listener).enterNome(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaskRulesListener ) ((TaskRulesListener)listener).exitNome(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaskRulesVisitor ) return ((TaskRulesVisitor<? extends T>)visitor).visitNome(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NomeContext nome() throws RecognitionException {
		NomeContext _localctx = new NomeContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_nome);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			match(NAME);
			setState(19);
			match(DOIS_PONTOS);
			setState(20);
			match(CADEIA_LINHA);
			setState(21);
			match(PONTO_VIRGULA);
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

	public static class CategoriaContext extends ParserRuleContext {
		public TerminalNode DOIS_PONTOS() { return getToken(TaskRulesParser.DOIS_PONTOS, 0); }
		public Tipo_categoriaContext tipo_categoria() {
			return getRuleContext(Tipo_categoriaContext.class,0);
		}
		public TerminalNode PONTO_VIRGULA() { return getToken(TaskRulesParser.PONTO_VIRGULA, 0); }
		public CategoriaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_categoria; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaskRulesListener ) ((TaskRulesListener)listener).enterCategoria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaskRulesListener ) ((TaskRulesListener)listener).exitCategoria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaskRulesVisitor ) return ((TaskRulesVisitor<? extends T>)visitor).visitCategoria(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CategoriaContext categoria() throws RecognitionException {
		CategoriaContext _localctx = new CategoriaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_categoria);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			match(T__0);
			setState(24);
			match(DOIS_PONTOS);
			setState(25);
			tipo_categoria();
			setState(26);
			match(PONTO_VIRGULA);
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

	public static class Tipo_categoriaContext extends ParserRuleContext {
		public TerminalNode CASA() { return getToken(TaskRulesParser.CASA, 0); }
		public TerminalNode TRABALHO() { return getToken(TaskRulesParser.TRABALHO, 0); }
		public TerminalNode PROVA() { return getToken(TaskRulesParser.PROVA, 0); }
		public TerminalNode EXERCICIO() { return getToken(TaskRulesParser.EXERCICIO, 0); }
		public TerminalNode EVENTOS() { return getToken(TaskRulesParser.EVENTOS, 0); }
		public TerminalNode OUTROS() { return getToken(TaskRulesParser.OUTROS, 0); }
		public Tipo_categoriaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_categoria; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaskRulesListener ) ((TaskRulesListener)listener).enterTipo_categoria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaskRulesListener ) ((TaskRulesListener)listener).exitTipo_categoria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaskRulesVisitor ) return ((TaskRulesVisitor<? extends T>)visitor).visitTipo_categoria(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tipo_categoriaContext tipo_categoria() throws RecognitionException {
		Tipo_categoriaContext _localctx = new Tipo_categoriaContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_tipo_categoria);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CASA) | (1L << TRABALHO) | (1L << PROVA) | (1L << EXERCICIO) | (1L << EVENTOS) | (1L << OUTROS))) != 0)) ) {
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

	public static class LocalContext extends ParserRuleContext {
		public Token link;
		public TerminalNode DOIS_PONTOS() { return getToken(TaskRulesParser.DOIS_PONTOS, 0); }
		public TerminalNode PONTO_VIRGULA() { return getToken(TaskRulesParser.PONTO_VIRGULA, 0); }
		public TerminalNode CADEIA_LINHA() { return getToken(TaskRulesParser.CADEIA_LINHA, 0); }
		public LocalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_local; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaskRulesListener ) ((TaskRulesListener)listener).enterLocal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaskRulesListener ) ((TaskRulesListener)listener).exitLocal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaskRulesVisitor ) return ((TaskRulesVisitor<? extends T>)visitor).visitLocal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalContext local() throws RecognitionException {
		LocalContext _localctx = new LocalContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_local);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			match(T__1);
			setState(31);
			match(DOIS_PONTOS);
			setState(32);
			((LocalContext)_localctx).link = match(CADEIA_LINHA);
			setState(33);
			match(PONTO_VIRGULA);
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

	public static class DataContext extends ParserRuleContext {
		public TerminalNode DOIS_PONTOS() { return getToken(TaskRulesParser.DOIS_PONTOS, 0); }
		public TerminalNode FORMATO_DATA() { return getToken(TaskRulesParser.FORMATO_DATA, 0); }
		public TerminalNode PONTO_VIRGULA() { return getToken(TaskRulesParser.PONTO_VIRGULA, 0); }
		public DataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaskRulesListener ) ((TaskRulesListener)listener).enterData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaskRulesListener ) ((TaskRulesListener)listener).exitData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaskRulesVisitor ) return ((TaskRulesVisitor<? extends T>)visitor).visitData(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataContext data() throws RecognitionException {
		DataContext _localctx = new DataContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_data);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			match(T__2);
			setState(36);
			match(DOIS_PONTOS);
			setState(37);
			match(FORMATO_DATA);
			setState(38);
			match(PONTO_VIRGULA);
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

	public static class DescricaoContext extends ParserRuleContext {
		public Token desc;
		public TerminalNode DESCRIPTION() { return getToken(TaskRulesParser.DESCRIPTION, 0); }
		public TerminalNode DOIS_PONTOS() { return getToken(TaskRulesParser.DOIS_PONTOS, 0); }
		public TerminalNode PONTO_VIRGULA() { return getToken(TaskRulesParser.PONTO_VIRGULA, 0); }
		public TerminalNode CADEIA_LINHA() { return getToken(TaskRulesParser.CADEIA_LINHA, 0); }
		public TerminalNode CADEIA_MULTILINHA() { return getToken(TaskRulesParser.CADEIA_MULTILINHA, 0); }
		public DescricaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_descricao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaskRulesListener ) ((TaskRulesListener)listener).enterDescricao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaskRulesListener ) ((TaskRulesListener)listener).exitDescricao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaskRulesVisitor ) return ((TaskRulesVisitor<? extends T>)visitor).visitDescricao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DescricaoContext descricao() throws RecognitionException {
		DescricaoContext _localctx = new DescricaoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_descricao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(DESCRIPTION);
			setState(41);
			match(DOIS_PONTOS);
			setState(42);
			((DescricaoContext)_localctx).desc = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==CADEIA_LINHA || _la==CADEIA_MULTILINHA) ) {
				((DescricaoContext)_localctx).desc = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(43);
			match(PONTO_VIRGULA);
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

	public static class TarefaContext extends ParserRuleContext {
		public TerminalNode TASK() { return getToken(TaskRulesParser.TASK, 0); }
		public TerminalNode ABRE_CHAVE() { return getToken(TaskRulesParser.ABRE_CHAVE, 0); }
		public NomeContext nome() {
			return getRuleContext(NomeContext.class,0);
		}
		public DataContext data() {
			return getRuleContext(DataContext.class,0);
		}
		public LocalContext local() {
			return getRuleContext(LocalContext.class,0);
		}
		public CategoriaContext categoria() {
			return getRuleContext(CategoriaContext.class,0);
		}
		public DescricaoContext descricao() {
			return getRuleContext(DescricaoContext.class,0);
		}
		public TerminalNode FECHA_CHAVE() { return getToken(TaskRulesParser.FECHA_CHAVE, 0); }
		public TarefaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tarefa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaskRulesListener ) ((TaskRulesListener)listener).enterTarefa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaskRulesListener ) ((TaskRulesListener)listener).exitTarefa(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaskRulesVisitor ) return ((TaskRulesVisitor<? extends T>)visitor).visitTarefa(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TarefaContext tarefa() throws RecognitionException {
		TarefaContext _localctx = new TarefaContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_tarefa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(TASK);
			setState(46);
			match(ABRE_CHAVE);
			setState(47);
			nome();
			setState(48);
			data();
			setState(49);
			local();
			setState(50);
			categoria();
			setState(51);
			descricao();
			setState(52);
			match(FECHA_CHAVE);
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

	public static class TarefasContext extends ParserRuleContext {
		public List<TarefaContext> tarefa() {
			return getRuleContexts(TarefaContext.class);
		}
		public TarefaContext tarefa(int i) {
			return getRuleContext(TarefaContext.class,i);
		}
		public TarefasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tarefas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaskRulesListener ) ((TaskRulesListener)listener).enterTarefas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaskRulesListener ) ((TaskRulesListener)listener).exitTarefas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaskRulesVisitor ) return ((TaskRulesVisitor<? extends T>)visitor).visitTarefas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TarefasContext tarefas() throws RecognitionException {
		TarefasContext _localctx = new TarefasContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_tarefas);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(54);
				tarefa();
				}
				}
				setState(57); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TASK );
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
		public TerminalNode CRONOGRAMA() { return getToken(TaskRulesParser.CRONOGRAMA, 0); }
		public TerminalNode ABRE_CHAVE() { return getToken(TaskRulesParser.ABRE_CHAVE, 0); }
		public TarefasContext tarefas() {
			return getRuleContext(TarefasContext.class,0);
		}
		public TerminalNode FECHA_CHAVE() { return getToken(TaskRulesParser.FECHA_CHAVE, 0); }
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TaskRulesListener ) ((TaskRulesListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TaskRulesListener ) ((TaskRulesListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TaskRulesVisitor ) return ((TaskRulesVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(CRONOGRAMA);
			setState(60);
			match(ABRE_CHAVE);
			setState(61);
			tarefas();
			setState(62);
			match(FECHA_CHAVE);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\36C\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2\3\2"+
		"\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3"+
		"\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\6\t"+
		":\n\t\r\t\16\t;\3\n\3\n\3\n\3\n\3\n\3\n\2\2\13\2\4\6\b\n\f\16\20\22\2"+
		"\4\3\2\f\21\4\2\30\30\32\32\2:\2\24\3\2\2\2\4\31\3\2\2\2\6\36\3\2\2\2"+
		"\b \3\2\2\2\n%\3\2\2\2\f*\3\2\2\2\16/\3\2\2\2\209\3\2\2\2\22=\3\2\2\2"+
		"\24\25\7\b\2\2\25\26\7\24\2\2\26\27\7\30\2\2\27\30\7\25\2\2\30\3\3\2\2"+
		"\2\31\32\7\3\2\2\32\33\7\24\2\2\33\34\5\6\4\2\34\35\7\25\2\2\35\5\3\2"+
		"\2\2\36\37\t\2\2\2\37\7\3\2\2\2 !\7\4\2\2!\"\7\24\2\2\"#\7\30\2\2#$\7"+
		"\25\2\2$\t\3\2\2\2%&\7\5\2\2&\'\7\24\2\2\'(\7\36\2\2()\7\25\2\2)\13\3"+
		"\2\2\2*+\7\13\2\2+,\7\24\2\2,-\t\3\2\2-.\7\25\2\2.\r\3\2\2\2/\60\7\7\2"+
		"\2\60\61\7\22\2\2\61\62\5\2\2\2\62\63\5\n\6\2\63\64\5\b\5\2\64\65\5\4"+
		"\3\2\65\66\5\f\7\2\66\67\7\23\2\2\67\17\3\2\2\28:\5\16\b\298\3\2\2\2:"+
		";\3\2\2\2;9\3\2\2\2;<\3\2\2\2<\21\3\2\2\2=>\7\6\2\2>?\7\22\2\2?@\5\20"+
		"\t\2@A\7\23\2\2A\23\3\2\2\2\3;";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}