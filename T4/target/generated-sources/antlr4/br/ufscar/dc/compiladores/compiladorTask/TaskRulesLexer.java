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
		T__0=1, T__1=2, T__2=3, CRONOGRAMA=4, TASK=5, NAME=6, DIAMES=7, ANO=8, 
		DESCRIPTION=9, CASA=10, TRABALHO=11, PROVA=12, EXERCICIO=13, EVENTOS=14, 
		OUTROS=15, ABRE_CHAVE=16, FECHA_CHAVE=17, DOIS_PONTOS=18, PONTO_VIRGULA=19, 
		INT=20, CADEIA_LINHA_NAO_FECHADA=21, CADEIA_LINHA=22, CADEIA_MULTILINHA_NAO_FECHADA=23, 
		CADEIA_MULTILINHA=24, COMENTARIO=25, WS=26, ERRO=27, FORMATO_DATA=28;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "CRONOGRAMA", "TASK", "NAME", "DIAMES", "ANO", 
			"DESCRIPTION", "CASA", "TRABALHO", "PROVA", "EXERCICIO", "EVENTOS", "OUTROS", 
			"ABRE_CHAVE", "FECHA_CHAVE", "DOIS_PONTOS", "PONTO_VIRGULA", "INT", "CADEIA_LINHA_NAO_FECHADA", 
			"CADEIA_LINHA", "CADEIA_MULTILINHA_NAO_FECHADA", "CADEIA_MULTILINHA", 
			"ESC_SEQ", "COMENTARIO", "WS", "ERRO", "FORMATO_DATA"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\36\u00fa\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3"+
		"\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\6\25"+
		"\u00b1\n\25\r\25\16\25\u00b2\3\26\3\26\3\26\3\26\7\26\u00b9\n\26\f\26"+
		"\16\26\u00bc\13\26\3\26\3\26\3\27\3\27\3\27\3\27\7\27\u00c4\n\27\f\27"+
		"\16\27\u00c7\13\27\3\27\3\27\3\30\3\30\3\30\3\30\7\30\u00cf\n\30\f\30"+
		"\16\30\u00d2\13\30\3\30\3\30\3\31\3\31\3\31\3\31\7\31\u00da\n\31\f\31"+
		"\16\31\u00dd\13\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\7\33\u00e6\n\33"+
		"\f\33\16\33\u00e9\13\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3"+
		"\35\3\36\3\36\3\36\3\36\3\36\3\36\2\2\37\3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27"+
		"-\30/\31\61\32\63\2\65\33\67\349\35;\36\3\2\n\3\2\62\65\3\2\62;\4\2C\\"+
		"c|\4\2\f\f$$\4\2$$\177\177\5\2$$==\177\177\3\2\f\f\5\2\13\f\17\17\"\""+
		"\2\u0102\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2"+
		"\2\3=\3\2\2\2\5F\3\2\2\2\7L\3\2\2\2\tQ\3\2\2\2\13\\\3\2\2\2\ra\3\2\2\2"+
		"\17f\3\2\2\2\21i\3\2\2\2\23n\3\2\2\2\25z\3\2\2\2\27\177\3\2\2\2\31\u0088"+
		"\3\2\2\2\33\u008e\3\2\2\2\35\u0098\3\2\2\2\37\u00a0\3\2\2\2!\u00a7\3\2"+
		"\2\2#\u00a9\3\2\2\2%\u00ab\3\2\2\2\'\u00ad\3\2\2\2)\u00b0\3\2\2\2+\u00b4"+
		"\3\2\2\2-\u00bf\3\2\2\2/\u00ca\3\2\2\2\61\u00d5\3\2\2\2\63\u00e0\3\2\2"+
		"\2\65\u00e3\3\2\2\2\67\u00ee\3\2\2\29\u00f2\3\2\2\2;\u00f4\3\2\2\2=>\7"+
		"e\2\2>?\7c\2\2?@\7v\2\2@A\7g\2\2AB\7i\2\2BC\7q\2\2CD\7t\2\2DE\7{\2\2E"+
		"\4\3\2\2\2FG\7n\2\2GH\7q\2\2HI\7e\2\2IJ\7c\2\2JK\7n\2\2K\6\3\2\2\2LM\7"+
		"f\2\2MN\7c\2\2NO\7v\2\2OP\7g\2\2P\b\3\2\2\2QR\7e\2\2RS\7t\2\2ST\7q\2\2"+
		"TU\7p\2\2UV\7q\2\2VW\7i\2\2WX\7t\2\2XY\7c\2\2YZ\7o\2\2Z[\7c\2\2[\n\3\2"+
		"\2\2\\]\7v\2\2]^\7c\2\2^_\7u\2\2_`\7m\2\2`\f\3\2\2\2ab\7p\2\2bc\7c\2\2"+
		"cd\7o\2\2de\7g\2\2e\16\3\2\2\2fg\t\2\2\2gh\t\3\2\2h\20\3\2\2\2ij\t\3\2"+
		"\2jk\t\3\2\2kl\t\3\2\2lm\t\3\2\2m\22\3\2\2\2no\7f\2\2op\7g\2\2pq\7u\2"+
		"\2qr\7e\2\2rs\7t\2\2st\7k\2\2tu\7r\2\2uv\7v\2\2vw\7k\2\2wx\7q\2\2xy\7"+
		"p\2\2y\24\3\2\2\2z{\7e\2\2{|\7c\2\2|}\7u\2\2}~\7c\2\2~\26\3\2\2\2\177"+
		"\u0080\7v\2\2\u0080\u0081\7t\2\2\u0081\u0082\7c\2\2\u0082\u0083\7d\2\2"+
		"\u0083\u0084\7c\2\2\u0084\u0085\7n\2\2\u0085\u0086\7j\2\2\u0086\u0087"+
		"\7q\2\2\u0087\30\3\2\2\2\u0088\u0089\7r\2\2\u0089\u008a\7t\2\2\u008a\u008b"+
		"\7q\2\2\u008b\u008c\7x\2\2\u008c\u008d\7c\2\2\u008d\32\3\2\2\2\u008e\u008f"+
		"\7g\2\2\u008f\u0090\7z\2\2\u0090\u0091\7g\2\2\u0091\u0092\7t\2\2\u0092"+
		"\u0093\7e\2\2\u0093\u0094\7k\2\2\u0094\u0095\7e\2\2\u0095\u0096\7k\2\2"+
		"\u0096\u0097\7q\2\2\u0097\34\3\2\2\2\u0098\u0099\7g\2\2\u0099\u009a\7"+
		"x\2\2\u009a\u009b\7g\2\2\u009b\u009c\7p\2\2\u009c\u009d\7v\2\2\u009d\u009e"+
		"\7q\2\2\u009e\u009f\7u\2\2\u009f\36\3\2\2\2\u00a0\u00a1\7q\2\2\u00a1\u00a2"+
		"\7w\2\2\u00a2\u00a3\7v\2\2\u00a3\u00a4\7t\2\2\u00a4\u00a5\7q\2\2\u00a5"+
		"\u00a6\7u\2\2\u00a6 \3\2\2\2\u00a7\u00a8\7}\2\2\u00a8\"\3\2\2\2\u00a9"+
		"\u00aa\7\177\2\2\u00aa$\3\2\2\2\u00ab\u00ac\7<\2\2\u00ac&\3\2\2\2\u00ad"+
		"\u00ae\7=\2\2\u00ae(\3\2\2\2\u00af\u00b1\t\3\2\2\u00b0\u00af\3\2\2\2\u00b1"+
		"\u00b2\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3*\3\2\2\2"+
		"\u00b4\u00b5\7$\2\2\u00b5\u00ba\t\4\2\2\u00b6\u00b9\5\63\32\2\u00b7\u00b9"+
		"\n\5\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b7\3\2\2\2\u00b9\u00bc\3\2\2\2\u00ba"+
		"\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bd\3\2\2\2\u00bc\u00ba\3\2"+
		"\2\2\u00bd\u00be\7\f\2\2\u00be,\3\2\2\2\u00bf\u00c0\7$\2\2\u00c0\u00c5"+
		"\t\4\2\2\u00c1\u00c4\5\63\32\2\u00c2\u00c4\n\5\2\2\u00c3\u00c1\3\2\2\2"+
		"\u00c3\u00c2\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6"+
		"\3\2\2\2\u00c6\u00c8\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8\u00c9\7$\2\2\u00c9"+
		".\3\2\2\2\u00ca\u00cb\7$\2\2\u00cb\u00d0\t\4\2\2\u00cc\u00cf\5\63\32\2"+
		"\u00cd\u00cf\n\6\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cd\3\2\2\2\u00cf\u00d2"+
		"\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d3\3\2\2\2\u00d2"+
		"\u00d0\3\2\2\2\u00d3\u00d4\7\177\2\2\u00d4\60\3\2\2\2\u00d5\u00d6\7$\2"+
		"\2\u00d6\u00db\t\4\2\2\u00d7\u00da\5\63\32\2\u00d8\u00da\n\7\2\2\u00d9"+
		"\u00d7\3\2\2\2\u00d9\u00d8\3\2\2\2\u00da\u00dd\3\2\2\2\u00db\u00d9\3\2"+
		"\2\2\u00db\u00dc\3\2\2\2\u00dc\u00de\3\2\2\2\u00dd\u00db\3\2\2\2\u00de"+
		"\u00df\7$\2\2\u00df\62\3\2\2\2\u00e0\u00e1\7^\2\2\u00e1\u00e2\7)\2\2\u00e2"+
		"\64\3\2\2\2\u00e3\u00e7\7%\2\2\u00e4\u00e6\n\b\2\2\u00e5\u00e4\3\2\2\2"+
		"\u00e6\u00e9\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00ea"+
		"\3\2\2\2\u00e9\u00e7\3\2\2\2\u00ea\u00eb\7\f\2\2\u00eb\u00ec\3\2\2\2\u00ec"+
		"\u00ed\b\33\2\2\u00ed\66\3\2\2\2\u00ee\u00ef\t\t\2\2\u00ef\u00f0\3\2\2"+
		"\2\u00f0\u00f1\b\34\2\2\u00f18\3\2\2\2\u00f2\u00f3\13\2\2\2\u00f3:\3\2"+
		"\2\2\u00f4\u00f5\5\17\b\2\u00f5\u00f6\7\61\2\2\u00f6\u00f7\5\17\b\2\u00f7"+
		"\u00f8\7\61\2\2\u00f8\u00f9\5\21\t\2\u00f9<\3\2\2\2\r\2\u00b2\u00b8\u00ba"+
		"\u00c3\u00c5\u00ce\u00d0\u00d9\u00db\u00e7\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}