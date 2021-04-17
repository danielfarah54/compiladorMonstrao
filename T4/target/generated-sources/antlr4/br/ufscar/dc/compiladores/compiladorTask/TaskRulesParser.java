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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, CRONOGRAMA=12, TASK=13, NAME=14, DIAMES=15, ANO=16, 
		DESCRIPTION=17, ABRE_CHAVE=18, FECHA_CHAVE=19, DOIS_PONTOS=20, PONTO_VIRGULA=21, 
		INT=22, CADEIA_LINHA_NAO_FECHADA=23, CADEIA_LINHA=24, CADEIA_MULTILINHA_NAO_FECHADA=25, 
		CADEIA_MULTILINHA=26, COMENTARIO=27, WS=28, ERRO=29, CADEIA=30, CADEIA2=31;
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
			null, "'category'", "'\"'", "'casa'", "'trabalho'", "'prova'", "'exercicio'", 
			"'eventos'", "'outros'", "'local'", "'date'", "'/'", "'cronograma'", 
			"'task'", "'name'", null, null, "'description'", "'{'", "'}'", "':'", 
			"';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"CRONOGRAMA", "TASK", "NAME", "DIAMES", "ANO", "DESCRIPTION", "ABRE_CHAVE", 
			"FECHA_CHAVE", "DOIS_PONTOS", "PONTO_VIRGULA", "INT", "CADEIA_LINHA_NAO_FECHADA", 
			"CADEIA_LINHA", "CADEIA_MULTILINHA_NAO_FECHADA", "CADEIA_MULTILINHA", 
			"COMENTARIO", "WS", "ERRO", "CADEIA", "CADEIA2"
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
			setState(18);
			match(NAME);
			setState(19);
			match(DOIS_PONTOS);
			setState(20);
			match(CADEIA);
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
			match(T__1);
			setState(26);
			tipo_categoria();
			setState(27);
			match(T__1);
			setState(28);
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
			setState(30);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7))) != 0)) ) {
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
		public TerminalNode DOIS_PONTOS() { return getToken(TaskRulesParser.DOIS_PONTOS, 0); }
		public TerminalNode CADEIA_LINHA() { return getToken(TaskRulesParser.CADEIA_LINHA, 0); }
		public TerminalNode PONTO_VIRGULA() { return getToken(TaskRulesParser.PONTO_VIRGULA, 0); }
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
			setState(32);
			match(T__8);
			setState(33);
			match(DOIS_PONTOS);
			setState(34);
			match(CADEIA_LINHA);
			setState(35);
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
		enterRule(_localctx, 8, RULE_data);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			match(T__9);
			setState(38);
			match(DOIS_PONTOS);
			setState(39);
			match(DIAMES);
			setState(40);
			match(T__10);
			setState(41);
			match(DIAMES);
			setState(42);
			match(T__10);
			setState(43);
			match(ANO);
			setState(44);
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
		enterRule(_localctx, 10, RULE_descricao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(DESCRIPTION);
			setState(47);
			match(DOIS_PONTOS);
			setState(48);
			_la = _input.LA(1);
			if ( !(_la==CADEIA || _la==CADEIA2) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(49);
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
			setState(51);
			match(TASK);
			setState(52);
			match(ABRE_CHAVE);
			setState(53);
			nome();
			setState(54);
			data();
			setState(55);
			local();
			setState(56);
			categoria();
			setState(57);
			descricao();
			setState(58);
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
			setState(61); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(60);
				tarefa();
				}
				}
				setState(63); 
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
			setState(65);
			match(CRONOGRAMA);
			setState(66);
			match(ABRE_CHAVE);
			setState(67);
			tarefas();
			setState(68);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3!I\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2\3\2\3"+
		"\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\t\6\t@\n\t\r\t\16\tA\3\n\3\n\3\n\3\n\3\n\3\n\2\2\13\2"+
		"\4\6\b\n\f\16\20\22\2\4\3\2\5\n\3\2 !\2@\2\24\3\2\2\2\4\31\3\2\2\2\6 "+
		"\3\2\2\2\b\"\3\2\2\2\n\'\3\2\2\2\f\60\3\2\2\2\16\65\3\2\2\2\20?\3\2\2"+
		"\2\22C\3\2\2\2\24\25\7\20\2\2\25\26\7\26\2\2\26\27\7 \2\2\27\30\7\27\2"+
		"\2\30\3\3\2\2\2\31\32\7\3\2\2\32\33\7\26\2\2\33\34\7\4\2\2\34\35\5\6\4"+
		"\2\35\36\7\4\2\2\36\37\7\27\2\2\37\5\3\2\2\2 !\t\2\2\2!\7\3\2\2\2\"#\7"+
		"\13\2\2#$\7\26\2\2$%\7\32\2\2%&\7\27\2\2&\t\3\2\2\2\'(\7\f\2\2()\7\26"+
		"\2\2)*\7\21\2\2*+\7\r\2\2+,\7\21\2\2,-\7\r\2\2-.\7\22\2\2./\7\27\2\2/"+
		"\13\3\2\2\2\60\61\7\23\2\2\61\62\7\26\2\2\62\63\t\3\2\2\63\64\7\27\2\2"+
		"\64\r\3\2\2\2\65\66\7\17\2\2\66\67\7\24\2\2\678\5\2\2\289\5\n\6\29:\5"+
		"\b\5\2:;\5\4\3\2;<\5\f\7\2<=\7\25\2\2=\17\3\2\2\2>@\5\16\b\2?>\3\2\2\2"+
		"@A\3\2\2\2A?\3\2\2\2AB\3\2\2\2B\21\3\2\2\2CD\7\16\2\2DE\7\24\2\2EF\5\20"+
		"\t\2FG\7\25\2\2G\23\3\2\2\2\3A";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}