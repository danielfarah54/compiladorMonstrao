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
		T__0=1, T__1=2, CRONOGRAMA=3, TASK=4, NAME=5, DIAMES=6, ANO=7, DESCRIPTION=8, 
		ABRE_CHAVE=9, FECHA_CHAVE=10, DOIS_PONTOS=11, PONTO_VIRGULA=12, INT=13, 
		CADEIA_LINHA_NAO_FECHADA=14, CADEIA_LINHA=15, CADEIA_MULTILINHA_NAO_FECHADA=16, 
		CADEIA_MULTILINHA=17, COMENTARIO=18, WS=19, ERRO=20;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "CRONOGRAMA", "TASK", "NAME", "DIAMES", "ANO", "DESCRIPTION", 
			"ABRE_CHAVE", "FECHA_CHAVE", "DOIS_PONTOS", "PONTO_VIRGULA", "INT", "CADEIA_LINHA_NAO_FECHADA", 
			"CADEIA_LINHA", "CADEIA_MULTILINHA_NAO_FECHADA", "CADEIA_MULTILINHA", 
			"ESC_SEQ", "COMENTARIO", "WS", "ERRO"
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
			"ABRE_CHAVE", "FECHA_CHAVE", "DOIS_PONTOS", "PONTO_VIRGULA", "INT", "CADEIA_LINHA_NAO_FECHADA", 
			"CADEIA_LINHA", "CADEIA_MULTILINHA_NAO_FECHADA", "CADEIA_MULTILINHA", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\26\u00aa\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\3\2\3\2\3\3"+
		"\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\6"+
		"\16g\n\16\r\16\16\16h\3\17\3\17\3\17\3\17\7\17o\n\17\f\17\16\17r\13\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\20\7\20z\n\20\f\20\16\20}\13\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\21\7\21\u0085\n\21\f\21\16\21\u0088\13\21\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\7\22\u0090\n\22\f\22\16\22\u0093\13\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\24\3\24\7\24\u009c\n\24\f\24\16\24\u009f\13\24\3\24"+
		"\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\2\2\27\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\2\'"+
		"\24)\25+\26\3\2\n\3\2\62\65\3\2\62;\4\2C\\c|\4\2\f\f$$\4\2$$\177\177\5"+
		"\2$$==\177\177\3\2\f\f\5\2\13\f\17\17\"\"\2\u00b2\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2\'\3\2\2\2\2)\3"+
		"\2\2\2\2+\3\2\2\2\3-\3\2\2\2\5\62\3\2\2\2\7\64\3\2\2\2\t?\3\2\2\2\13D"+
		"\3\2\2\2\rI\3\2\2\2\17L\3\2\2\2\21Q\3\2\2\2\23]\3\2\2\2\25_\3\2\2\2\27"+
		"a\3\2\2\2\31c\3\2\2\2\33f\3\2\2\2\35j\3\2\2\2\37u\3\2\2\2!\u0080\3\2\2"+
		"\2#\u008b\3\2\2\2%\u0096\3\2\2\2\'\u0099\3\2\2\2)\u00a4\3\2\2\2+\u00a8"+
		"\3\2\2\2-.\7f\2\2./\7c\2\2/\60\7v\2\2\60\61\7g\2\2\61\4\3\2\2\2\62\63"+
		"\7\61\2\2\63\6\3\2\2\2\64\65\7e\2\2\65\66\7t\2\2\66\67\7q\2\2\678\7p\2"+
		"\289\7q\2\29:\7i\2\2:;\7t\2\2;<\7c\2\2<=\7o\2\2=>\7c\2\2>\b\3\2\2\2?@"+
		"\7v\2\2@A\7c\2\2AB\7u\2\2BC\7m\2\2C\n\3\2\2\2DE\7p\2\2EF\7c\2\2FG\7o\2"+
		"\2GH\7g\2\2H\f\3\2\2\2IJ\t\2\2\2JK\t\3\2\2K\16\3\2\2\2LM\t\3\2\2MN\t\3"+
		"\2\2NO\t\3\2\2OP\t\3\2\2P\20\3\2\2\2QR\7f\2\2RS\7g\2\2ST\7u\2\2TU\7e\2"+
		"\2UV\7t\2\2VW\7k\2\2WX\7r\2\2XY\7v\2\2YZ\7k\2\2Z[\7q\2\2[\\\7p\2\2\\\22"+
		"\3\2\2\2]^\7}\2\2^\24\3\2\2\2_`\7\177\2\2`\26\3\2\2\2ab\7<\2\2b\30\3\2"+
		"\2\2cd\7=\2\2d\32\3\2\2\2eg\t\3\2\2fe\3\2\2\2gh\3\2\2\2hf\3\2\2\2hi\3"+
		"\2\2\2i\34\3\2\2\2jk\7$\2\2kp\t\4\2\2lo\5%\23\2mo\n\5\2\2nl\3\2\2\2nm"+
		"\3\2\2\2or\3\2\2\2pn\3\2\2\2pq\3\2\2\2qs\3\2\2\2rp\3\2\2\2st\7\f\2\2t"+
		"\36\3\2\2\2uv\7$\2\2v{\t\4\2\2wz\5%\23\2xz\n\5\2\2yw\3\2\2\2yx\3\2\2\2"+
		"z}\3\2\2\2{y\3\2\2\2{|\3\2\2\2|~\3\2\2\2}{\3\2\2\2~\177\7$\2\2\177 \3"+
		"\2\2\2\u0080\u0081\7$\2\2\u0081\u0086\t\4\2\2\u0082\u0085\5%\23\2\u0083"+
		"\u0085\n\6\2\2\u0084\u0082\3\2\2\2\u0084\u0083\3\2\2\2\u0085\u0088\3\2"+
		"\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0089\3\2\2\2\u0088"+
		"\u0086\3\2\2\2\u0089\u008a\7\177\2\2\u008a\"\3\2\2\2\u008b\u008c\7$\2"+
		"\2\u008c\u0091\t\4\2\2\u008d\u0090\5%\23\2\u008e\u0090\n\7\2\2\u008f\u008d"+
		"\3\2\2\2\u008f\u008e\3\2\2\2\u0090\u0093\3\2\2\2\u0091\u008f\3\2\2\2\u0091"+
		"\u0092\3\2\2\2\u0092\u0094\3\2\2\2\u0093\u0091\3\2\2\2\u0094\u0095\7$"+
		"\2\2\u0095$\3\2\2\2\u0096\u0097\7^\2\2\u0097\u0098\7)\2\2\u0098&\3\2\2"+
		"\2\u0099\u009d\7%\2\2\u009a\u009c\n\b\2\2\u009b\u009a\3\2\2\2\u009c\u009f"+
		"\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u00a0\3\2\2\2\u009f"+
		"\u009d\3\2\2\2\u00a0\u00a1\7\f\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3\b\24"+
		"\2\2\u00a3(\3\2\2\2\u00a4\u00a5\t\t\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a7"+
		"\b\25\2\2\u00a7*\3\2\2\2\u00a8\u00a9\13\2\2\2\u00a9,\3\2\2\2\r\2hnpy{"+
		"\u0084\u0086\u008f\u0091\u009d\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}