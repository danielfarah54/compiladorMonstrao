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
		T__0=1, T__1=2, CRONOGRAMA=3, TASK=4, NAME=5, DIAMES=6, ANO=7, DESCRIPTION=8, 
		ABRE_CHAVE=9, FECHA_CHAVE=10, DOIS_PONTOS=11, PONTO_VIRGULA=12, INT=13, 
		CADEIA_NAO_FECHADA=14, CADEIA=15, CADEIA2_NAO_FECHADA=16, CADEIA2=17, 
		COMENTARIO=18, WS=19, ERRO=20;
	public static final int
		RULE_nome = 0, RULE_data = 1, RULE_descricao = 2, RULE_tarefa = 3, RULE_tarefas = 4, 
		RULE_programa = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"nome", "data", "descricao", "tarefa", "tarefas", "programa"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'date'", "'/'", "'cronograma'", "'task'", "'name'", null, null, 
			"'description'", "'{'", "'}'", "':'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "CRONOGRAMA", "TASK", "NAME", "DIAMES", "ANO", "DESCRIPTION", 
			"ABRE_CHAVE", "FECHA_CHAVE", "DOIS_PONTOS", "PONTO_VIRGULA", "INT", "CADEIA_NAO_FECHADA", 
			"CADEIA", "CADEIA2_NAO_FECHADA", "CADEIA2", "COMENTARIO", "WS", "ERRO"
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
			setState(12);
			match(NAME);
			setState(13);
			match(DOIS_PONTOS);
			setState(14);
			match(CADEIA);
			setState(15);
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
		enterRule(_localctx, 2, RULE_data);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(17);
			match(T__0);
			setState(18);
			match(DOIS_PONTOS);
			setState(19);
			match(DIAMES);
			setState(20);
			match(T__1);
			setState(21);
			match(DIAMES);
			setState(22);
			match(T__1);
			setState(23);
			match(ANO);
			setState(24);
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
		public TerminalNode CADEIA() { return getToken(TaskRulesParser.CADEIA, 0); }
		public TerminalNode PONTO_VIRGULA() { return getToken(TaskRulesParser.PONTO_VIRGULA, 0); }
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
		enterRule(_localctx, 4, RULE_descricao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			match(DESCRIPTION);
			setState(27);
			match(DOIS_PONTOS);
			setState(28);
			match(CADEIA);
			setState(29);
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
		enterRule(_localctx, 6, RULE_tarefa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			match(TASK);
			setState(32);
			match(ABRE_CHAVE);
			setState(33);
			nome();
			setState(34);
			data();
			setState(35);
			descricao();
			setState(36);
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
		enterRule(_localctx, 8, RULE_tarefas);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(38);
				tarefa();
				}
				}
				setState(41); 
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
		enterRule(_localctx, 10, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			match(CRONOGRAMA);
			setState(44);
			match(ABRE_CHAVE);
			setState(45);
			tarefas();
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\26\63\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\6\6\6*\n\6\r\6\16\6+\3\7\3\7\3\7\3\7\3\7\3\7\2\2\b\2\4\6\b\n\f\2\2"+
		"\2-\2\16\3\2\2\2\4\23\3\2\2\2\6\34\3\2\2\2\b!\3\2\2\2\n)\3\2\2\2\f-\3"+
		"\2\2\2\16\17\7\7\2\2\17\20\7\r\2\2\20\21\7\21\2\2\21\22\7\16\2\2\22\3"+
		"\3\2\2\2\23\24\7\3\2\2\24\25\7\r\2\2\25\26\7\b\2\2\26\27\7\4\2\2\27\30"+
		"\7\b\2\2\30\31\7\4\2\2\31\32\7\t\2\2\32\33\7\16\2\2\33\5\3\2\2\2\34\35"+
		"\7\n\2\2\35\36\7\r\2\2\36\37\7\21\2\2\37 \7\16\2\2 \7\3\2\2\2!\"\7\6\2"+
		"\2\"#\7\13\2\2#$\5\2\2\2$%\5\4\3\2%&\5\6\4\2&\'\7\f\2\2\'\t\3\2\2\2(*"+
		"\5\b\5\2)(\3\2\2\2*+\3\2\2\2+)\3\2\2\2+,\3\2\2\2,\13\3\2\2\2-.\7\5\2\2"+
		"./\7\13\2\2/\60\5\n\6\2\60\61\7\f\2\2\61\r\3\2\2\2\3+";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}