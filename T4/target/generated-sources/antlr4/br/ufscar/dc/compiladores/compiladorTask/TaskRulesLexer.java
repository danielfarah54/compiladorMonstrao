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
		SCHOOL_PROJECT=17, TEST=18, EXERCICIO=19, EVENT=20, OTHERS=21, ABRE_CHAVE=22, 
		FECHA_CHAVE=23, DOIS_PONTOS=24, PONTO_VIRGULA=25, INT=26, CADEIA_LINHA_NAO_FECHADA=27, 
		CADEIA_LINHA=28, CADEIA_MULTILINHA_NAO_FECHADA=29, CADEIA_MULTILINHA=30, 
		COMENTARIO=31, WS=32, ERRO=33, FORMATO_DATA=34;
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
			"SCHOOL_PROJECT", "TEST", "EXERCICIO", "EVENT", "OTHERS", "ABRE_CHAVE", 
			"FECHA_CHAVE", "DOIS_PONTOS", "PONTO_VIRGULA", "INT", "CADEIA_LINHA_NAO_FECHADA", 
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
			"TEST", "EXERCICIO", "EVENT", "OTHERS", "ABRE_CHAVE", "FECHA_CHAVE", 
			"DOIS_PONTOS", "PONTO_VIRGULA", "INT", "CADEIA_LINHA_NAO_FECHADA", "CADEIA_LINHA", 
			"CADEIA_MULTILINHA_NAO_FECHADA", "CADEIA_MULTILINHA", "COMENTARIO", "WS", 
			"ERRO", "FORMATO_DATA"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2$\u013c\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31"+
		"\3\32\3\32\3\33\6\33\u00f3\n\33\r\33\16\33\u00f4\3\34\3\34\3\34\3\34\7"+
		"\34\u00fb\n\34\f\34\16\34\u00fe\13\34\3\34\3\34\3\35\3\35\3\35\3\35\7"+
		"\35\u0106\n\35\f\35\16\35\u0109\13\35\3\35\3\35\3\36\3\36\3\36\3\36\7"+
		"\36\u0111\n\36\f\36\16\36\u0114\13\36\3\36\3\36\3\37\3\37\3\37\3\37\7"+
		"\37\u011c\n\37\f\37\16\37\u011f\13\37\3\37\3\37\3 \3 \3 \3!\3!\7!\u0128"+
		"\n!\f!\16!\u012b\13!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3#\3#\3$\3$\3$\3$\3$"+
		"\3$\2\2%\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17"+
		"\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\35"+
		"9\36;\37= ?\2A!C\"E#G$\3\2\n\3\2\62\65\3\2\62;\4\2C\\c|\4\2\f\f$$\4\2"+
		"$$\177\177\5\2$$==\177\177\3\2\f\f\5\2\13\f\17\17\"\"\2\u0144\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3"+
		"\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3"+
		"\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2"+
		"=\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\3I\3\2\2\2\5R\3"+
		"\2\2\2\7_\3\2\2\2\tn\3\2\2\2\13s\3\2\2\2\r|\3\2\2\2\17\u0082\3\2\2\2\21"+
		"\u0088\3\2\2\2\23\u008e\3\2\2\2\25\u0093\3\2\2\2\27\u009e\3\2\2\2\31\u00a3"+
		"\3\2\2\2\33\u00a8\3\2\2\2\35\u00ab\3\2\2\2\37\u00b0\3\2\2\2!\u00bc\3\2"+
		"\2\2#\u00c1\3\2\2\2%\u00ca\3\2\2\2\'\u00d0\3\2\2\2)\u00da\3\2\2\2+\u00e2"+
		"\3\2\2\2-\u00e9\3\2\2\2/\u00eb\3\2\2\2\61\u00ed\3\2\2\2\63\u00ef\3\2\2"+
		"\2\65\u00f2\3\2\2\2\67\u00f6\3\2\2\29\u0101\3\2\2\2;\u010c\3\2\2\2=\u0117"+
		"\3\2\2\2?\u0122\3\2\2\2A\u0125\3\2\2\2C\u0130\3\2\2\2E\u0134\3\2\2\2G"+
		"\u0136\3\2\2\2IJ\7e\2\2JK\7c\2\2KL\7v\2\2LM\7g\2\2MN\7i\2\2NO\7q\2\2O"+
		"P\7t\2\2PQ\7{\2\2Q\4\3\2\2\2RS\7j\2\2ST\7q\2\2TU\7w\2\2UV\7u\2\2VW\7g"+
		"\2\2WX\7a\2\2XY\7e\2\2YZ\7j\2\2Z[\7q\2\2[\\\7t\2\2\\]\7g\2\2]^\7u\2\2"+
		"^\6\3\2\2\2_`\7u\2\2`a\7e\2\2ab\7j\2\2bc\7q\2\2cd\7q\2\2de\7n\2\2ef\7"+
		"a\2\2fg\7r\2\2gh\7t\2\2hi\7q\2\2ij\7l\2\2jk\7g\2\2kl\7e\2\2lm\7v\2\2m"+
		"\b\3\2\2\2no\7v\2\2op\7g\2\2pq\7u\2\2qr\7v\2\2r\n\3\2\2\2st\7j\2\2tu\7"+
		"q\2\2uv\7o\2\2vw\7g\2\2wx\7y\2\2xy\7q\2\2yz\7t\2\2z{\7m\2\2{\f\3\2\2\2"+
		"|}\7g\2\2}~\7x\2\2~\177\7g\2\2\177\u0080\7p\2\2\u0080\u0081\7v\2\2\u0081"+
		"\16\3\2\2\2\u0082\u0083\7q\2\2\u0083\u0084\7v\2\2\u0084\u0085\7j\2\2\u0085"+
		"\u0086\7g\2\2\u0086\u0087\7t\2\2\u0087\20\3\2\2\2\u0088\u0089\7n\2\2\u0089"+
		"\u008a\7q\2\2\u008a\u008b\7e\2\2\u008b\u008c\7c\2\2\u008c\u008d\7n\2\2"+
		"\u008d\22\3\2\2\2\u008e\u008f\7f\2\2\u008f\u0090\7c\2\2\u0090\u0091\7"+
		"v\2\2\u0091\u0092\7g\2\2\u0092\24\3\2\2\2\u0093\u0094\7e\2\2\u0094\u0095"+
		"\7t\2\2\u0095\u0096\7q\2\2\u0096\u0097\7p\2\2\u0097\u0098\7q\2\2\u0098"+
		"\u0099\7i\2\2\u0099\u009a\7t\2\2\u009a\u009b\7c\2\2\u009b\u009c\7o\2\2"+
		"\u009c\u009d\7c\2\2\u009d\26\3\2\2\2\u009e\u009f\7v\2\2\u009f\u00a0\7"+
		"c\2\2\u00a0\u00a1\7u\2\2\u00a1\u00a2\7m\2\2\u00a2\30\3\2\2\2\u00a3\u00a4"+
		"\7p\2\2\u00a4\u00a5\7c\2\2\u00a5\u00a6\7o\2\2\u00a6\u00a7\7g\2\2\u00a7"+
		"\32\3\2\2\2\u00a8\u00a9\t\2\2\2\u00a9\u00aa\t\3\2\2\u00aa\34\3\2\2\2\u00ab"+
		"\u00ac\t\3\2\2\u00ac\u00ad\t\3\2\2\u00ad\u00ae\t\3\2\2\u00ae\u00af\t\3"+
		"\2\2\u00af\36\3\2\2\2\u00b0\u00b1\7f\2\2\u00b1\u00b2\7g\2\2\u00b2\u00b3"+
		"\7u\2\2\u00b3\u00b4\7e\2\2\u00b4\u00b5\7t\2\2\u00b5\u00b6\7k\2\2\u00b6"+
		"\u00b7\7r\2\2\u00b7\u00b8\7v\2\2\u00b8\u00b9\7k\2\2\u00b9\u00ba\7q\2\2"+
		"\u00ba\u00bb\7p\2\2\u00bb \3\2\2\2\u00bc\u00bd\7e\2\2\u00bd\u00be\7c\2"+
		"\2\u00be\u00bf\7u\2\2\u00bf\u00c0\7c\2\2\u00c0\"\3\2\2\2\u00c1\u00c2\7"+
		"v\2\2\u00c2\u00c3\7t\2\2\u00c3\u00c4\7c\2\2\u00c4\u00c5\7d\2\2\u00c5\u00c6"+
		"\7c\2\2\u00c6\u00c7\7n\2\2\u00c7\u00c8\7j\2\2\u00c8\u00c9\7q\2\2\u00c9"+
		"$\3\2\2\2\u00ca\u00cb\7r\2\2\u00cb\u00cc\7t\2\2\u00cc\u00cd\7q\2\2\u00cd"+
		"\u00ce\7x\2\2\u00ce\u00cf\7c\2\2\u00cf&\3\2\2\2\u00d0\u00d1\7g\2\2\u00d1"+
		"\u00d2\7z\2\2\u00d2\u00d3\7g\2\2\u00d3\u00d4\7t\2\2\u00d4\u00d5\7e\2\2"+
		"\u00d5\u00d6\7k\2\2\u00d6\u00d7\7e\2\2\u00d7\u00d8\7k\2\2\u00d8\u00d9"+
		"\7q\2\2\u00d9(\3\2\2\2\u00da\u00db\7g\2\2\u00db\u00dc\7x\2\2\u00dc\u00dd"+
		"\7g\2\2\u00dd\u00de\7p\2\2\u00de\u00df\7v\2\2\u00df\u00e0\7q\2\2\u00e0"+
		"\u00e1\7u\2\2\u00e1*\3\2\2\2\u00e2\u00e3\7q\2\2\u00e3\u00e4\7w\2\2\u00e4"+
		"\u00e5\7v\2\2\u00e5\u00e6\7t\2\2\u00e6\u00e7\7q\2\2\u00e7\u00e8\7u\2\2"+
		"\u00e8,\3\2\2\2\u00e9\u00ea\7}\2\2\u00ea.\3\2\2\2\u00eb\u00ec\7\177\2"+
		"\2\u00ec\60\3\2\2\2\u00ed\u00ee\7<\2\2\u00ee\62\3\2\2\2\u00ef\u00f0\7"+
		"=\2\2\u00f0\64\3\2\2\2\u00f1\u00f3\t\3\2\2\u00f2\u00f1\3\2\2\2\u00f3\u00f4"+
		"\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\66\3\2\2\2\u00f6"+
		"\u00f7\7$\2\2\u00f7\u00fc\t\4\2\2\u00f8\u00fb\5? \2\u00f9\u00fb\n\5\2"+
		"\2\u00fa\u00f8\3\2\2\2\u00fa\u00f9\3\2\2\2\u00fb\u00fe\3\2\2\2\u00fc\u00fa"+
		"\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00ff\3\2\2\2\u00fe\u00fc\3\2\2\2\u00ff"+
		"\u0100\7\f\2\2\u01008\3\2\2\2\u0101\u0102\7$\2\2\u0102\u0107\t\4\2\2\u0103"+
		"\u0106\5? \2\u0104\u0106\n\5\2\2\u0105\u0103\3\2\2\2\u0105\u0104\3\2\2"+
		"\2\u0106\u0109\3\2\2\2\u0107\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u010a"+
		"\3\2\2\2\u0109\u0107\3\2\2\2\u010a\u010b\7$\2\2\u010b:\3\2\2\2\u010c\u010d"+
		"\7$\2\2\u010d\u0112\t\4\2\2\u010e\u0111\5? \2\u010f\u0111\n\6\2\2\u0110"+
		"\u010e\3\2\2\2\u0110\u010f\3\2\2\2\u0111\u0114\3\2\2\2\u0112\u0110\3\2"+
		"\2\2\u0112\u0113\3\2\2\2\u0113\u0115\3\2\2\2\u0114\u0112\3\2\2\2\u0115"+
		"\u0116\7\177\2\2\u0116<\3\2\2\2\u0117\u0118\7$\2\2\u0118\u011d\t\4\2\2"+
		"\u0119\u011c\5? \2\u011a\u011c\n\7\2\2\u011b\u0119\3\2\2\2\u011b\u011a"+
		"\3\2\2\2\u011c\u011f\3\2\2\2\u011d\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e"+
		"\u0120\3\2\2\2\u011f\u011d\3\2\2\2\u0120\u0121\7$\2\2\u0121>\3\2\2\2\u0122"+
		"\u0123\7^\2\2\u0123\u0124\7)\2\2\u0124@\3\2\2\2\u0125\u0129\7%\2\2\u0126"+
		"\u0128\n\b\2\2\u0127\u0126\3\2\2\2\u0128\u012b\3\2\2\2\u0129\u0127\3\2"+
		"\2\2\u0129\u012a\3\2\2\2\u012a\u012c\3\2\2\2\u012b\u0129\3\2\2\2\u012c"+
		"\u012d\7\f\2\2\u012d\u012e\3\2\2\2\u012e\u012f\b!\2\2\u012fB\3\2\2\2\u0130"+
		"\u0131\t\t\2\2\u0131\u0132\3\2\2\2\u0132\u0133\b\"\2\2\u0133D\3\2\2\2"+
		"\u0134\u0135\13\2\2\2\u0135F\3\2\2\2\u0136\u0137\5\33\16\2\u0137\u0138"+
		"\7\61\2\2\u0138\u0139\5\33\16\2\u0139\u013a\7\61\2\2\u013a\u013b\5\35"+
		"\17\2\u013bH\3\2\2\2\r\2\u00f4\u00fa\u00fc\u0105\u0107\u0110\u0112\u011b"+
		"\u011d\u0129\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}