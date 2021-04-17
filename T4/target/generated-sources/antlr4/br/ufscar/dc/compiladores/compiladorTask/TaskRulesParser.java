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
		T__0=1, T__1=2, T__2=3, T__3=4, CRONOGRAMA=5, TASK=6, NAME=7, DIAMES=8, 
		ANO=9, DESCRIPTION=10, ABRE_CHAVE=11, FECHA_CHAVE=12, DOIS_PONTOS=13, 
		PONTO_VIRGULA=14, INT=15, CADEIA_LINHA_NAO_FECHADA=16, CADEIA_LINHA=17, 
		CADEIA_MULTILINHA_NAO_FECHADA=18, CADEIA_MULTILINHA=19, COMENTARIO=20, 
		WS=21, ERRO=22, CADEIA=23, CADEIA2=24;
	public static final int
		RULE_nome = 0, RULE_categoria = 1, RULE_local = 2, RULE_data = 3, RULE_descricao = 4, 
		RULE_tarefa = 5, RULE_tarefas = 6, RULE_programa = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"nome", "categoria", "local", "data", "descricao", "tarefa", "tarefas", 
			"programa"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'casa'", "'trabalho'", "'date'", "'/'", "'cronograma'", "'task'", 
			"'name'", null, null, "'description'", "'{'", "'}'", "':'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "CRONOGRAMA", "TASK", "NAME", "DIAMES", 
			"ANO", "DESCRIPTION", "ABRE_CHAVE", "FECHA_CHAVE", "DOIS_PONTOS", "PONTO_VIRGULA", 
			"INT", "CADEIA_LINHA_NAO_FECHADA", "CADEIA_LINHA", "CADEIA_MULTILINHA_NAO_FECHADA", 
			"CADEIA_MULTILINHA", "COMENTARIO", "WS", "ERRO", "CADEIA", "CADEIA2"
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
		public TerminalNode CADEIA() { return getToken(TaskRulesParser.CADEIA, 0); }
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
			setState(16);
			match(NAME);
			setState(17);
			match(DOIS_PONTOS);
			setState(18);
			match(CADEIA);
			setState(19);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			_la = _input.LA(1);
			if ( !(_la==T__0 || _la==T__1) ) {
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
		enterRule(_localctx, 4, RULE_local);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			match(CADEIA_LINHA);
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
		public List<TerminalNode> DIAMES() { return getTokens(TaskRulesParser.DIAMES); }
		public TerminalNode DIAMES(int i) {
			return getToken(TaskRulesParser.DIAMES, i);
		}
		public TerminalNode ANO() { return getToken(TaskRulesParser.ANO, 0); }
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
		enterRule(_localctx, 6, RULE_data);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			match(T__2);
			setState(26);
			match(DOIS_PONTOS);
			setState(27);
			match(DIAMES);
			setState(28);
			match(T__3);
			setState(29);
			match(DIAMES);
			setState(30);
			match(T__3);
			setState(31);
			match(ANO);
			setState(32);
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
		public TerminalNode DESCRIPTION() { return getToken(TaskRulesParser.DESCRIPTION, 0); }
		public TerminalNode DOIS_PONTOS() { return getToken(TaskRulesParser.DOIS_PONTOS, 0); }
		public TerminalNode PONTO_VIRGULA() { return getToken(TaskRulesParser.PONTO_VIRGULA, 0); }
		public TerminalNode CADEIA2() { return getToken(TaskRulesParser.CADEIA2, 0); }
		public TerminalNode CADEIA() { return getToken(TaskRulesParser.CADEIA, 0); }
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
		enterRule(_localctx, 8, RULE_descricao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			match(DESCRIPTION);
			setState(35);
			match(DOIS_PONTOS);
			setState(36);
			_la = _input.LA(1);
			if ( !(_la==CADEIA || _la==CADEIA2) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(37);
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
		enterRule(_localctx, 10, RULE_tarefa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			match(TASK);
			setState(40);
			match(ABRE_CHAVE);
			setState(41);
			nome();
			setState(42);
			data();
			setState(43);
			local();
			setState(44);
			categoria();
			setState(45);
			descricao();
			setState(46);
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
		enterRule(_localctx, 12, RULE_tarefas);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(48);
				tarefa();
				}
				}
				setState(51); 
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
		enterRule(_localctx, 14, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(CRONOGRAMA);
			setState(54);
			match(ABRE_CHAVE);
			setState(55);
			tarefas();
			setState(56);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\32=\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\3\2\3\2"+
		"\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3"+
		"\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\6\b\64\n\b\r\b\16\b\65\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\2\2\n\2\4\6\b\n\f\16\20\2\4\3\2\3\4\3\2\31\32\2\65"+
		"\2\22\3\2\2\2\4\27\3\2\2\2\6\31\3\2\2\2\b\33\3\2\2\2\n$\3\2\2\2\f)\3\2"+
		"\2\2\16\63\3\2\2\2\20\67\3\2\2\2\22\23\7\t\2\2\23\24\7\17\2\2\24\25\7"+
		"\31\2\2\25\26\7\20\2\2\26\3\3\2\2\2\27\30\t\2\2\2\30\5\3\2\2\2\31\32\7"+
		"\23\2\2\32\7\3\2\2\2\33\34\7\5\2\2\34\35\7\17\2\2\35\36\7\n\2\2\36\37"+
		"\7\6\2\2\37 \7\n\2\2 !\7\6\2\2!\"\7\13\2\2\"#\7\20\2\2#\t\3\2\2\2$%\7"+
		"\f\2\2%&\7\17\2\2&\'\t\3\2\2\'(\7\20\2\2(\13\3\2\2\2)*\7\b\2\2*+\7\r\2"+
		"\2+,\5\2\2\2,-\5\b\5\2-.\5\6\4\2./\5\4\3\2/\60\5\n\6\2\60\61\7\16\2\2"+
		"\61\r\3\2\2\2\62\64\5\f\7\2\63\62\3\2\2\2\64\65\3\2\2\2\65\63\3\2\2\2"+
		"\65\66\3\2\2\2\66\17\3\2\2\2\678\7\7\2\289\7\r\2\29:\5\16\b\2:;\7\16\2"+
		"\2;\21\3\2\2\2\3\65";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}