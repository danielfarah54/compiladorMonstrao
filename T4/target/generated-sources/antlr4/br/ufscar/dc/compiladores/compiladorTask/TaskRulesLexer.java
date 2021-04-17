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
		T__0=1, T__1=2, T__2=3, T__3=4, CRONOGRAMA=5, TASK=6, NAME=7, DIAMES=8, 
		ANO=9, DESCRIPTION=10, ABRE_CHAVE=11, FECHA_CHAVE=12, DOIS_PONTOS=13, 
		PONTO_VIRGULA=14, INT=15, CADEIA_LINHA_NAO_FECHADA=16, CADEIA_LINHA=17, 
		CADEIA_MULTILINHA_NAO_FECHADA=18, CADEIA_MULTILINHA=19, COMENTARIO=20, 
		WS=21, ERRO=22;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "CRONOGRAMA", "TASK", "NAME", "DIAMES", 
			"ANO", "DESCRIPTION", "ABRE_CHAVE", "FECHA_CHAVE", "DOIS_PONTOS", "PONTO_VIRGULA", 
			"INT", "CADEIA_LINHA_NAO_FECHADA", "CADEIA_LINHA", "CADEIA_MULTILINHA_NAO_FECHADA", 
			"CADEIA_MULTILINHA", "ESC_SEQ", "COMENTARIO", "WS", "ERRO"
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
			"CADEIA_MULTILINHA", "COMENTARIO", "WS", "ERRO"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\30\u00bc\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2"+
		"\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7"+
		"\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16"+
		"\3\17\3\17\3\20\6\20y\n\20\r\20\16\20z\3\21\3\21\3\21\3\21\7\21\u0081"+
		"\n\21\f\21\16\21\u0084\13\21\3\21\3\21\3\22\3\22\3\22\3\22\7\22\u008c"+
		"\n\22\f\22\16\22\u008f\13\22\3\22\3\22\3\23\3\23\3\23\3\23\7\23\u0097"+
		"\n\23\f\23\16\23\u009a\13\23\3\23\3\23\3\24\3\24\3\24\3\24\7\24\u00a2"+
		"\n\24\f\24\16\24\u00a5\13\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\7\26\u00ae"+
		"\n\26\f\26\16\26\u00b1\13\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3"+
		"\30\3\30\2\2\31\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\2+\26-\27/\30\3\2\n\3\2\62\65"+
		"\3\2\62;\4\2C\\c|\4\2\f\f$$\4\2$$\177\177\5\2$$==\177\177\3\2\f\f\5\2"+
		"\13\f\17\17\"\"\2\u00c4\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2+\3\2\2\2\2-\3\2\2"+
		"\2\2/\3\2\2\2\3\61\3\2\2\2\5\66\3\2\2\2\7?\3\2\2\2\tD\3\2\2\2\13F\3\2"+
		"\2\2\rQ\3\2\2\2\17V\3\2\2\2\21[\3\2\2\2\23^\3\2\2\2\25c\3\2\2\2\27o\3"+
		"\2\2\2\31q\3\2\2\2\33s\3\2\2\2\35u\3\2\2\2\37x\3\2\2\2!|\3\2\2\2#\u0087"+
		"\3\2\2\2%\u0092\3\2\2\2\'\u009d\3\2\2\2)\u00a8\3\2\2\2+\u00ab\3\2\2\2"+
		"-\u00b6\3\2\2\2/\u00ba\3\2\2\2\61\62\7e\2\2\62\63\7c\2\2\63\64\7u\2\2"+
		"\64\65\7c\2\2\65\4\3\2\2\2\66\67\7v\2\2\678\7t\2\289\7c\2\29:\7d\2\2:"+
		";\7c\2\2;<\7n\2\2<=\7j\2\2=>\7q\2\2>\6\3\2\2\2?@\7f\2\2@A\7c\2\2AB\7v"+
		"\2\2BC\7g\2\2C\b\3\2\2\2DE\7\61\2\2E\n\3\2\2\2FG\7e\2\2GH\7t\2\2HI\7q"+
		"\2\2IJ\7p\2\2JK\7q\2\2KL\7i\2\2LM\7t\2\2MN\7c\2\2NO\7o\2\2OP\7c\2\2P\f"+
		"\3\2\2\2QR\7v\2\2RS\7c\2\2ST\7u\2\2TU\7m\2\2U\16\3\2\2\2VW\7p\2\2WX\7"+
		"c\2\2XY\7o\2\2YZ\7g\2\2Z\20\3\2\2\2[\\\t\2\2\2\\]\t\3\2\2]\22\3\2\2\2"+
		"^_\t\3\2\2_`\t\3\2\2`a\t\3\2\2ab\t\3\2\2b\24\3\2\2\2cd\7f\2\2de\7g\2\2"+
		"ef\7u\2\2fg\7e\2\2gh\7t\2\2hi\7k\2\2ij\7r\2\2jk\7v\2\2kl\7k\2\2lm\7q\2"+
		"\2mn\7p\2\2n\26\3\2\2\2op\7}\2\2p\30\3\2\2\2qr\7\177\2\2r\32\3\2\2\2s"+
		"t\7<\2\2t\34\3\2\2\2uv\7=\2\2v\36\3\2\2\2wy\t\3\2\2xw\3\2\2\2yz\3\2\2"+
		"\2zx\3\2\2\2z{\3\2\2\2{ \3\2\2\2|}\7$\2\2}\u0082\t\4\2\2~\u0081\5)\25"+
		"\2\177\u0081\n\5\2\2\u0080~\3\2\2\2\u0080\177\3\2\2\2\u0081\u0084\3\2"+
		"\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0085\3\2\2\2\u0084"+
		"\u0082\3\2\2\2\u0085\u0086\7\f\2\2\u0086\"\3\2\2\2\u0087\u0088\7$\2\2"+
		"\u0088\u008d\t\4\2\2\u0089\u008c\5)\25\2\u008a\u008c\n\5\2\2\u008b\u0089"+
		"\3\2\2\2\u008b\u008a\3\2\2\2\u008c\u008f\3\2\2\2\u008d\u008b\3\2\2\2\u008d"+
		"\u008e\3\2\2\2\u008e\u0090\3\2\2\2\u008f\u008d\3\2\2\2\u0090\u0091\7$"+
		"\2\2\u0091$\3\2\2\2\u0092\u0093\7$\2\2\u0093\u0098\t\4\2\2\u0094\u0097"+
		"\5)\25\2\u0095\u0097\n\6\2\2\u0096\u0094\3\2\2\2\u0096\u0095\3\2\2\2\u0097"+
		"\u009a\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009b\3\2"+
		"\2\2\u009a\u0098\3\2\2\2\u009b\u009c\7\177\2\2\u009c&\3\2\2\2\u009d\u009e"+
		"\7$\2\2\u009e\u00a3\t\4\2\2\u009f\u00a2\5)\25\2\u00a0\u00a2\n\7\2\2\u00a1"+
		"\u009f\3\2\2\2\u00a1\u00a0\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3\u00a1\3\2"+
		"\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a6\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6"+
		"\u00a7\7$\2\2\u00a7(\3\2\2\2\u00a8\u00a9\7^\2\2\u00a9\u00aa\7)\2\2\u00aa"+
		"*\3\2\2\2\u00ab\u00af\7%\2\2\u00ac\u00ae\n\b\2\2\u00ad\u00ac\3\2\2\2\u00ae"+
		"\u00b1\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b2\3\2"+
		"\2\2\u00b1\u00af\3\2\2\2\u00b2\u00b3\7\f\2\2\u00b3\u00b4\3\2\2\2\u00b4"+
		"\u00b5\b\26\2\2\u00b5,\3\2\2\2\u00b6\u00b7\t\t\2\2\u00b7\u00b8\3\2\2\2"+
		"\u00b8\u00b9\b\27\2\2\u00b9.\3\2\2\2\u00ba\u00bb\13\2\2\2\u00bb\60\3\2"+
		"\2\2\r\2z\u0080\u0082\u008b\u008d\u0096\u0098\u00a1\u00a3\u00af\3\b\2"+
		"\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}