// Generated from br/ufscar/dc/compiladores/compiladorTask/TaskRules.g4 by ANTLR 4.9.1
package br.ufscar.dc.compiladores.compiladorTask;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TaskRulesLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, CRONOGRAMA=3, TASK=4, NAME=5, DIA=6, MES=7, ANO=8, DESCRIPTION=9, 
		ABRE_CHAVE=10, FECHA_CHAVE=11, DOIS_PONTOS=12, PONTO_VIRGULA=13, INT=14, 
		CADEIA_NAO_FECHADA=15, CADEIA=16, CADEIA2_NAO_FECHADA=17, CADEIA2=18, 
		COMENTARIO=19, WS=20, ERRO=21;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "CRONOGRAMA", "TASK", "NAME", "DIA", "MES", "ANO", "DESCRIPTION", 
			"ABRE_CHAVE", "FECHA_CHAVE", "DOIS_PONTOS", "PONTO_VIRGULA", "INT", "CADEIA_NAO_FECHADA", 
			"CADEIA", "CADEIA2_NAO_FECHADA", "CADEIA2", "ESC_SEQ", "COMENTARIO", 
			"WS", "ERRO"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'date'", "'/'", "'cronograma'", "'task'", "'name'", null, null, 
			null, "'description'", "'{'", "'}'", "':'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "CRONOGRAMA", "TASK", "NAME", "DIA", "MES", "ANO", 
			"DESCRIPTION", "ABRE_CHAVE", "FECHA_CHAVE", "DOIS_PONTOS", "PONTO_VIRGULA", 
			"INT", "CADEIA_NAO_FECHADA", "CADEIA", "CADEIA2_NAO_FECHADA", "CADEIA2", 
			"COMENTARIO", "WS", "ERRO"
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


	public TaskRulesLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "TaskRules.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\27\u00af\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\2\3"+
		"\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3"+
		"\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3"+
		"\r\3\r\3\16\3\16\3\17\6\17l\n\17\r\17\16\17m\3\20\3\20\3\20\3\20\7\20"+
		"t\n\20\f\20\16\20w\13\20\3\20\3\20\3\21\3\21\3\21\3\21\7\21\177\n\21\f"+
		"\21\16\21\u0082\13\21\3\21\3\21\3\22\3\22\3\22\3\22\7\22\u008a\n\22\f"+
		"\22\16\22\u008d\13\22\3\22\3\22\3\23\3\23\3\23\3\23\7\23\u0095\n\23\f"+
		"\23\16\23\u0098\13\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\7\25\u00a1\n"+
		"\25\f\25\16\25\u00a4\13\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27"+
		"\3\27\2\2\30\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\35\20\37\21!\22#\23%\24\'\2)\25+\26-\27\3\2\13\3\2\62\65\3\2\62"+
		";\3\2\62\63\4\2C\\c|\4\2\f\f$$\5\2\f\f$$==\4\2$$\177\177\3\2\f\f\5\2\13"+
		"\f\17\17\"\"\2\u00b7\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3"+
		"\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2"+
		"\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\3"+
		"/\3\2\2\2\5\64\3\2\2\2\7\66\3\2\2\2\tA\3\2\2\2\13F\3\2\2\2\rK\3\2\2\2"+
		"\17N\3\2\2\2\21Q\3\2\2\2\23V\3\2\2\2\25b\3\2\2\2\27d\3\2\2\2\31f\3\2\2"+
		"\2\33h\3\2\2\2\35k\3\2\2\2\37o\3\2\2\2!z\3\2\2\2#\u0085\3\2\2\2%\u0090"+
		"\3\2\2\2\'\u009b\3\2\2\2)\u009e\3\2\2\2+\u00a9\3\2\2\2-\u00ad\3\2\2\2"+
		"/\60\7f\2\2\60\61\7c\2\2\61\62\7v\2\2\62\63\7g\2\2\63\4\3\2\2\2\64\65"+
		"\7\61\2\2\65\6\3\2\2\2\66\67\7e\2\2\678\7t\2\289\7q\2\29:\7p\2\2:;\7q"+
		"\2\2;<\7i\2\2<=\7t\2\2=>\7c\2\2>?\7o\2\2?@\7c\2\2@\b\3\2\2\2AB\7v\2\2"+
		"BC\7c\2\2CD\7u\2\2DE\7m\2\2E\n\3\2\2\2FG\7p\2\2GH\7c\2\2HI\7o\2\2IJ\7"+
		"g\2\2J\f\3\2\2\2KL\t\2\2\2LM\t\3\2\2M\16\3\2\2\2NO\t\4\2\2OP\t\3\2\2P"+
		"\20\3\2\2\2QR\t\3\2\2RS\t\3\2\2ST\t\3\2\2TU\t\3\2\2U\22\3\2\2\2VW\7f\2"+
		"\2WX\7g\2\2XY\7u\2\2YZ\7e\2\2Z[\7t\2\2[\\\7k\2\2\\]\7r\2\2]^\7v\2\2^_"+
		"\7k\2\2_`\7q\2\2`a\7p\2\2a\24\3\2\2\2bc\7}\2\2c\26\3\2\2\2de\7\177\2\2"+
		"e\30\3\2\2\2fg\7<\2\2g\32\3\2\2\2hi\7=\2\2i\34\3\2\2\2jl\t\3\2\2kj\3\2"+
		"\2\2lm\3\2\2\2mk\3\2\2\2mn\3\2\2\2n\36\3\2\2\2op\7$\2\2pu\t\5\2\2qt\5"+
		"\'\24\2rt\n\6\2\2sq\3\2\2\2sr\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3\2\2\2vx"+
		"\3\2\2\2wu\3\2\2\2xy\7=\2\2y \3\2\2\2z{\7$\2\2{\u0080\t\5\2\2|\177\5\'"+
		"\24\2}\177\n\7\2\2~|\3\2\2\2~}\3\2\2\2\177\u0082\3\2\2\2\u0080~\3\2\2"+
		"\2\u0080\u0081\3\2\2\2\u0081\u0083\3\2\2\2\u0082\u0080\3\2\2\2\u0083\u0084"+
		"\7$\2\2\u0084\"\3\2\2\2\u0085\u0086\7$\2\2\u0086\u008b\t\5\2\2\u0087\u008a"+
		"\5\'\24\2\u0088\u008a\n\b\2\2\u0089\u0087\3\2\2\2\u0089\u0088\3\2\2\2"+
		"\u008a\u008d\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008e"+
		"\3\2\2\2\u008d\u008b\3\2\2\2\u008e\u008f\7\177\2\2\u008f$\3\2\2\2\u0090"+
		"\u0091\7$\2\2\u0091\u0096\t\5\2\2\u0092\u0095\5\'\24\2\u0093\u0095\n\b"+
		"\2\2\u0094\u0092\3\2\2\2\u0094\u0093\3\2\2\2\u0095\u0098\3\2\2\2\u0096"+
		"\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0099\3\2\2\2\u0098\u0096\3\2"+
		"\2\2\u0099\u009a\7$\2\2\u009a&\3\2\2\2\u009b\u009c\7^\2\2\u009c\u009d"+
		"\7)\2\2\u009d(\3\2\2\2\u009e\u00a2\7%\2\2\u009f\u00a1\n\t\2\2\u00a0\u009f"+
		"\3\2\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3"+
		"\u00a5\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5\u00a6\7\f\2\2\u00a6\u00a7\3\2"+
		"\2\2\u00a7\u00a8\b\25\2\2\u00a8*\3\2\2\2\u00a9\u00aa\t\n\2\2\u00aa\u00ab"+
		"\3\2\2\2\u00ab\u00ac\b\26\2\2\u00ac,\3\2\2\2\u00ad\u00ae\13\2\2\2\u00ae"+
		".\3\2\2\2\r\2msu~\u0080\u0089\u008b\u0094\u0096\u00a2\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}