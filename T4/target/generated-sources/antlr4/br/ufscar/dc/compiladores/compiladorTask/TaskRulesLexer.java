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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		CRONOGRAMA=10, TASK=11, NAME=12, DIAMES=13, ANO=14, DESCRIPTION=15, HOUSE_CHORES=16, 
		SCHOOL_PROJECT=17, TEST=18, HOMEWORK=19, EVENT=20, OTHERS=21, ABRE_CHAVE=22, 
		FECHA_CHAVE=23, DOIS_PONTOS=24, PONTO_VIRGULA=25, CADEIA_LINHA_NAO_FECHADA=26, 
		CADEIA_LINHA=27, CADEIA_MULTILINHA_NAO_FECHADA=28, CADEIA_MULTILINHA=29, 
		COMENTARIO=30, WS=31, ERRO=32, FORMATO_DATA=33;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"CRONOGRAMA", "TASK", "NAME", "DIAMES", "ANO", "DESCRIPTION", "HOUSE_CHORES", 
			"SCHOOL_PROJECT", "TEST", "HOMEWORK", "EVENT", "OTHERS", "ABRE_CHAVE", 
			"FECHA_CHAVE", "DOIS_PONTOS", "PONTO_VIRGULA", "CADEIA_LINHA_NAO_FECHADA", 
			"CADEIA_LINHA", "CADEIA_MULTILINHA_NAO_FECHADA", "CADEIA_MULTILINHA", 
			"ESC_SEQ", "COMENTARIO", "WS", "ERRO", "FORMATO_DATA"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'category'", "'house_chores'", "'school_project'", "'test'", "'homework'", 
			"'event'", "'other'", "'local'", "'date'", "'cronograma'", "'task'", 
			"'name'", null, null, "'description'", "'casa'", "'trabalho'", "'prova'", 
			"'exercicio'", "'eventos'", "'outros'", "'{'", "'}'", "':'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "CRONOGRAMA", 
			"TASK", "NAME", "DIAMES", "ANO", "DESCRIPTION", "HOUSE_CHORES", "SCHOOL_PROJECT", 
			"TEST", "HOMEWORK", "EVENT", "OTHERS", "ABRE_CHAVE", "FECHA_CHAVE", "DOIS_PONTOS", 
			"PONTO_VIRGULA", "CADEIA_LINHA_NAO_FECHADA", "CADEIA_LINHA", "CADEIA_MULTILINHA_NAO_FECHADA", 
			"CADEIA_MULTILINHA", "COMENTARIO", "WS", "ERRO", "FORMATO_DATA"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2#\u0135\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32"+
		"\3\32\3\33\3\33\3\33\3\33\7\33\u00f4\n\33\f\33\16\33\u00f7\13\33\3\33"+
		"\3\33\3\34\3\34\3\34\3\34\7\34\u00ff\n\34\f\34\16\34\u0102\13\34\3\34"+
		"\3\34\3\35\3\35\3\35\3\35\7\35\u010a\n\35\f\35\16\35\u010d\13\35\3\35"+
		"\3\35\3\36\3\36\3\36\3\36\7\36\u0115\n\36\f\36\16\36\u0118\13\36\3\36"+
		"\3\36\3\37\3\37\3\37\3 \3 \7 \u0121\n \f \16 \u0124\13 \3 \3 \3 \3 \3"+
		"!\3!\3!\3!\3\"\3\"\3#\3#\3#\3#\3#\3#\2\2$\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+"+
		"\27-\30/\31\61\32\63\33\65\34\67\359\36;\37=\2? A!C\"E#\3\2\n\3\2\62\65"+
		"\3\2\62;\4\2C\\c|\4\2\f\f$$\4\2$$\177\177\5\2$$==\177\177\3\2\f\f\5\2"+
		"\13\f\17\17\"\"\2\u013c\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2"+
		"\2\3G\3\2\2\2\5P\3\2\2\2\7]\3\2\2\2\tl\3\2\2\2\13q\3\2\2\2\rz\3\2\2\2"+
		"\17\u0080\3\2\2\2\21\u0086\3\2\2\2\23\u008c\3\2\2\2\25\u0091\3\2\2\2\27"+
		"\u009c\3\2\2\2\31\u00a1\3\2\2\2\33\u00a6\3\2\2\2\35\u00a9\3\2\2\2\37\u00ae"+
		"\3\2\2\2!\u00ba\3\2\2\2#\u00bf\3\2\2\2%\u00c8\3\2\2\2\'\u00ce\3\2\2\2"+
		")\u00d8\3\2\2\2+\u00e0\3\2\2\2-\u00e7\3\2\2\2/\u00e9\3\2\2\2\61\u00eb"+
		"\3\2\2\2\63\u00ed\3\2\2\2\65\u00ef\3\2\2\2\67\u00fa\3\2\2\29\u0105\3\2"+
		"\2\2;\u0110\3\2\2\2=\u011b\3\2\2\2?\u011e\3\2\2\2A\u0129\3\2\2\2C\u012d"+
		"\3\2\2\2E\u012f\3\2\2\2GH\7e\2\2HI\7c\2\2IJ\7v\2\2JK\7g\2\2KL\7i\2\2L"+
		"M\7q\2\2MN\7t\2\2NO\7{\2\2O\4\3\2\2\2PQ\7j\2\2QR\7q\2\2RS\7w\2\2ST\7u"+
		"\2\2TU\7g\2\2UV\7a\2\2VW\7e\2\2WX\7j\2\2XY\7q\2\2YZ\7t\2\2Z[\7g\2\2[\\"+
		"\7u\2\2\\\6\3\2\2\2]^\7u\2\2^_\7e\2\2_`\7j\2\2`a\7q\2\2ab\7q\2\2bc\7n"+
		"\2\2cd\7a\2\2de\7r\2\2ef\7t\2\2fg\7q\2\2gh\7l\2\2hi\7g\2\2ij\7e\2\2jk"+
		"\7v\2\2k\b\3\2\2\2lm\7v\2\2mn\7g\2\2no\7u\2\2op\7v\2\2p\n\3\2\2\2qr\7"+
		"j\2\2rs\7q\2\2st\7o\2\2tu\7g\2\2uv\7y\2\2vw\7q\2\2wx\7t\2\2xy\7m\2\2y"+
		"\f\3\2\2\2z{\7g\2\2{|\7x\2\2|}\7g\2\2}~\7p\2\2~\177\7v\2\2\177\16\3\2"+
		"\2\2\u0080\u0081\7q\2\2\u0081\u0082\7v\2\2\u0082\u0083\7j\2\2\u0083\u0084"+
		"\7g\2\2\u0084\u0085\7t\2\2\u0085\20\3\2\2\2\u0086\u0087\7n\2\2\u0087\u0088"+
		"\7q\2\2\u0088\u0089\7e\2\2\u0089\u008a\7c\2\2\u008a\u008b\7n\2\2\u008b"+
		"\22\3\2\2\2\u008c\u008d\7f\2\2\u008d\u008e\7c\2\2\u008e\u008f\7v\2\2\u008f"+
		"\u0090\7g\2\2\u0090\24\3\2\2\2\u0091\u0092\7e\2\2\u0092\u0093\7t\2\2\u0093"+
		"\u0094\7q\2\2\u0094\u0095\7p\2\2\u0095\u0096\7q\2\2\u0096\u0097\7i\2\2"+
		"\u0097\u0098\7t\2\2\u0098\u0099\7c\2\2\u0099\u009a\7o\2\2\u009a\u009b"+
		"\7c\2\2\u009b\26\3\2\2\2\u009c\u009d\7v\2\2\u009d\u009e\7c\2\2\u009e\u009f"+
		"\7u\2\2\u009f\u00a0\7m\2\2\u00a0\30\3\2\2\2\u00a1\u00a2\7p\2\2\u00a2\u00a3"+
		"\7c\2\2\u00a3\u00a4\7o\2\2\u00a4\u00a5\7g\2\2\u00a5\32\3\2\2\2\u00a6\u00a7"+
		"\t\2\2\2\u00a7\u00a8\t\3\2\2\u00a8\34\3\2\2\2\u00a9\u00aa\t\3\2\2\u00aa"+
		"\u00ab\t\3\2\2\u00ab\u00ac\t\3\2\2\u00ac\u00ad\t\3\2\2\u00ad\36\3\2\2"+
		"\2\u00ae\u00af\7f\2\2\u00af\u00b0\7g\2\2\u00b0\u00b1\7u\2\2\u00b1\u00b2"+
		"\7e\2\2\u00b2\u00b3\7t\2\2\u00b3\u00b4\7k\2\2\u00b4\u00b5\7r\2\2\u00b5"+
		"\u00b6\7v\2\2\u00b6\u00b7\7k\2\2\u00b7\u00b8\7q\2\2\u00b8\u00b9\7p\2\2"+
		"\u00b9 \3\2\2\2\u00ba\u00bb\7e\2\2\u00bb\u00bc\7c\2\2\u00bc\u00bd\7u\2"+
		"\2\u00bd\u00be\7c\2\2\u00be\"\3\2\2\2\u00bf\u00c0\7v\2\2\u00c0\u00c1\7"+
		"t\2\2\u00c1\u00c2\7c\2\2\u00c2\u00c3\7d\2\2\u00c3\u00c4\7c\2\2\u00c4\u00c5"+
		"\7n\2\2\u00c5\u00c6\7j\2\2\u00c6\u00c7\7q\2\2\u00c7$\3\2\2\2\u00c8\u00c9"+
		"\7r\2\2\u00c9\u00ca\7t\2\2\u00ca\u00cb\7q\2\2\u00cb\u00cc\7x\2\2\u00cc"+
		"\u00cd\7c\2\2\u00cd&\3\2\2\2\u00ce\u00cf\7g\2\2\u00cf\u00d0\7z\2\2\u00d0"+
		"\u00d1\7g\2\2\u00d1\u00d2\7t\2\2\u00d2\u00d3\7e\2\2\u00d3\u00d4\7k\2\2"+
		"\u00d4\u00d5\7e\2\2\u00d5\u00d6\7k\2\2\u00d6\u00d7\7q\2\2\u00d7(\3\2\2"+
		"\2\u00d8\u00d9\7g\2\2\u00d9\u00da\7x\2\2\u00da\u00db\7g\2\2\u00db\u00dc"+
		"\7p\2\2\u00dc\u00dd\7v\2\2\u00dd\u00de\7q\2\2\u00de\u00df\7u\2\2\u00df"+
		"*\3\2\2\2\u00e0\u00e1\7q\2\2\u00e1\u00e2\7w\2\2\u00e2\u00e3\7v\2\2\u00e3"+
		"\u00e4\7t\2\2\u00e4\u00e5\7q\2\2\u00e5\u00e6\7u\2\2\u00e6,\3\2\2\2\u00e7"+
		"\u00e8\7}\2\2\u00e8.\3\2\2\2\u00e9\u00ea\7\177\2\2\u00ea\60\3\2\2\2\u00eb"+
		"\u00ec\7<\2\2\u00ec\62\3\2\2\2\u00ed\u00ee\7=\2\2\u00ee\64\3\2\2\2\u00ef"+
		"\u00f0\7$\2\2\u00f0\u00f5\t\4\2\2\u00f1\u00f4\5=\37\2\u00f2\u00f4\n\5"+
		"\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f2\3\2\2\2\u00f4\u00f7\3\2\2\2\u00f5"+
		"\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f8\3\2\2\2\u00f7\u00f5\3\2"+
		"\2\2\u00f8\u00f9\7\f\2\2\u00f9\66\3\2\2\2\u00fa\u00fb\7$\2\2\u00fb\u0100"+
		"\t\4\2\2\u00fc\u00ff\5=\37\2\u00fd\u00ff\n\5\2\2\u00fe\u00fc\3\2\2\2\u00fe"+
		"\u00fd\3\2\2\2\u00ff\u0102\3\2\2\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2"+
		"\2\2\u0101\u0103\3\2\2\2\u0102\u0100\3\2\2\2\u0103\u0104\7$\2\2\u0104"+
		"8\3\2\2\2\u0105\u0106\7$\2\2\u0106\u010b\t\4\2\2\u0107\u010a\5=\37\2\u0108"+
		"\u010a\n\6\2\2\u0109\u0107\3\2\2\2\u0109\u0108\3\2\2\2\u010a\u010d\3\2"+
		"\2\2\u010b\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010e\3\2\2\2\u010d"+
		"\u010b\3\2\2\2\u010e\u010f\7\177\2\2\u010f:\3\2\2\2\u0110\u0111\7$\2\2"+
		"\u0111\u0116\t\4\2\2\u0112\u0115\5=\37\2\u0113\u0115\n\7\2\2\u0114\u0112"+
		"\3\2\2\2\u0114\u0113\3\2\2\2\u0115\u0118\3\2\2\2\u0116\u0114\3\2\2\2\u0116"+
		"\u0117\3\2\2\2\u0117\u0119\3\2\2\2\u0118\u0116\3\2\2\2\u0119\u011a\7$"+
		"\2\2\u011a<\3\2\2\2\u011b\u011c\7^\2\2\u011c\u011d\7)\2\2\u011d>\3\2\2"+
		"\2\u011e\u0122\7%\2\2\u011f\u0121\n\b\2\2\u0120\u011f\3\2\2\2\u0121\u0124"+
		"\3\2\2\2\u0122\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0125\3\2\2\2\u0124"+
		"\u0122\3\2\2\2\u0125\u0126\7\f\2\2\u0126\u0127\3\2\2\2\u0127\u0128\b "+
		"\2\2\u0128@\3\2\2\2\u0129\u012a\t\t\2\2\u012a\u012b\3\2\2\2\u012b\u012c"+
		"\b!\2\2\u012cB\3\2\2\2\u012d\u012e\13\2\2\2\u012eD\3\2\2\2\u012f\u0130"+
		"\5\33\16\2\u0130\u0131\7\61\2\2\u0131\u0132\5\33\16\2\u0132\u0133\7\61"+
		"\2\2\u0133\u0134\5\35\17\2\u0134F\3\2\2\2\f\2\u00f3\u00f5\u00fe\u0100"+
		"\u0109\u010b\u0114\u0116\u0122\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}