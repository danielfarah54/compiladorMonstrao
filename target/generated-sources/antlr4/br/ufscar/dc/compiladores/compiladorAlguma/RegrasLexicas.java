// Generated from br/ufscar/dc/compiladores/compiladorAlguma/RegrasLexicas.g4 by ANTLR 4.9.1
package br.ufscar.dc.compiladores.compiladorAlguma;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RegrasLexicas extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ALGORITMO=1, DOCUMENTACAO_DO_ALGORITMO=2, DECLARE=3, DELIM=4, VIRGULA=5, 
		PONTO=6, PONTOPONTO=7, CONSTANTE=8, TIPO=9, PONTEIRO=10, LITERAL=11, INTEIRO=12, 
		REAL=13, LOGICO=14, VERDADEIRO=15, FALSO=16, REGISTRO=17, FIM_REGISTRO=18, 
		PROCEDIMENTO=19, FIM_PROCEDIMENTO=20, FUNCAO=21, ROTINA=22, RETORNE=23, 
		FIM_FUNÇÃO=24, LEIA=25, ESCREVA=26, SE=27, ENTAO=28, SENAO=29, FIM_SE=30, 
		CASO=31, SEJA=32, FIM_CASO=33, PARA=34, ATE=35, FACA=36, FIM_PARA=37, 
		ENQUANTO=38, FIM_ENQUANTO=39, E=40, OU=41, NEGACAO=42, IGUAL=43, DIFERENTE=44, 
		MAIOR=45, MAIOR_IGUAL=46, MENOR=47, MENOR_IGUAL=48, SOMA=49, SUB=50, MULT=51, 
		DIV=52, OP_ATRIBUICAO=53, NUM_INT=54, NUM_REAL=55, ABRE_PARENTESES=56, 
		FECHA_PARENTESES=57, ABRE_COLCHETES=58, FECHA_COLCHETES=59, PORCENTAGEM=60, 
		VAR=61, FIM_ALGORITMO=62, ENDERECO_DO_PONTEIRO=63, IDENT=64, CADEIA_NAO_FECHADA=65, 
		COMENTARIO_NAO_FECHADO=66, WS=67, CADEIA=68, COMENTARIO=69, ERRO=70;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ALGORITMO", "DOCUMENTACAO_DO_ALGORITMO", "DECLARE", "DELIM", "VIRGULA", 
			"PONTO", "PONTOPONTO", "CONSTANTE", "TIPO", "PONTEIRO", "LITERAL", "INTEIRO", 
			"REAL", "LOGICO", "VERDADEIRO", "FALSO", "REGISTRO", "FIM_REGISTRO", 
			"PROCEDIMENTO", "FIM_PROCEDIMENTO", "FUNCAO", "ROTINA", "RETORNE", "FIM_FUNÇÃO", 
			"LEIA", "ESCREVA", "SE", "ENTAO", "SENAO", "FIM_SE", "CASO", "SEJA", 
			"FIM_CASO", "PARA", "ATE", "FACA", "FIM_PARA", "ENQUANTO", "FIM_ENQUANTO", 
			"E", "OU", "NEGACAO", "IGUAL", "DIFERENTE", "MAIOR", "MAIOR_IGUAL", "MENOR", 
			"MENOR_IGUAL", "SOMA", "SUB", "MULT", "DIV", "OP_ATRIBUICAO", "NUM_INT", 
			"NUM_REAL", "ABRE_PARENTESES", "FECHA_PARENTESES", "ABRE_COLCHETES", 
			"FECHA_COLCHETES", "PORCENTAGEM", "VAR", "FIM_ALGORITMO", "ENDERECO_DO_PONTEIRO", 
			"IDENT", "ESC_SEQ", "CADEIA_NAO_FECHADA", "COMENTARIO_NAO_FECHADO", "WS", 
			"CADEIA", "COMENTARIO", "ERRO"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'algoritmo'", "'documenta\u00E7\u00E3o_do_algoritmo'", "'declare'", 
			"':'", "','", "'.'", "'..'", "'constante'", "'tipo'", "'^'", "'literal'", 
			"'inteiro'", "'real'", "'logico'", "'verdadeiro'", "'falso'", "'registro'", 
			"'fim_registro'", "'procedimento'", "'fim_procedimento'", "'funcao'", 
			"'rotina'", "'retorne'", "'fim_funcao'", "'leia'", "'escreva'", "'se'", 
			"'entao'", "'senao'", "'fim_se'", "'caso'", "'seja'", "'fim_caso'", "'para'", 
			"'ate'", "'faca'", "'fim_para'", "'enquanto'", "'fim_enquanto'", "'e'", 
			"'ou'", "'nao'", "'='", "'<>'", "'>'", "'>='", "'<'", "'<='", "'+'", 
			"'-'", "'*'", "'/'", "'<-'", null, null, "'('", "')'", "'['", "']'", 
			"'%'", "'var'", "'fim_algoritmo'", "'&'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ALGORITMO", "DOCUMENTACAO_DO_ALGORITMO", "DECLARE", "DELIM", "VIRGULA", 
			"PONTO", "PONTOPONTO", "CONSTANTE", "TIPO", "PONTEIRO", "LITERAL", "INTEIRO", 
			"REAL", "LOGICO", "VERDADEIRO", "FALSO", "REGISTRO", "FIM_REGISTRO", 
			"PROCEDIMENTO", "FIM_PROCEDIMENTO", "FUNCAO", "ROTINA", "RETORNE", "FIM_FUN\u0007\u0008O", 
			"LEIA", "ESCREVA", "SE", "ENTAO", "SENAO", "FIM_SE", "CASO", "SEJA", 
			"FIM_CASO", "PARA", "ATE", "FACA", "FIM_PARA", "ENQUANTO", "FIM_ENQUANTO", 
			"E", "OU", "NEGACAO", "IGUAL", "DIFERENTE", "MAIOR", "MAIOR_IGUAL", "MENOR", 
			"MENOR_IGUAL", "SOMA", "SUB", "MULT", "DIV", "OP_ATRIBUICAO", "NUM_INT", 
			"NUM_REAL", "ABRE_PARENTESES", "FECHA_PARENTESES", "ABRE_COLCHETES", 
			"FECHA_COLCHETES", "PORCENTAGEM", "VAR", "FIM_ALGORITMO", "ENDERECO_DO_PONTEIRO", 
			"IDENT", "CADEIA_NAO_FECHADA", "COMENTARIO_NAO_FECHADO", "WS", "CADEIA", 
			"COMENTARIO", "ERRO"
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


	public RegrasLexicas(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "RegrasLexicas.g4"; }

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

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 67:
			WS_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			skip();
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2H\u025b\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3"+
		"\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3"+
		"\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3"+
		"\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3%\3%\3"+
		"%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3)\3)\3*\3*\3*\3+\3+\3+\3+\3,"+
		"\3,\3-\3-\3-\3.\3.\3/\3/\3/\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3\63\3"+
		"\63\3\64\3\64\3\65\3\65\3\66\3\66\3\66\3\67\6\67\u01e1\n\67\r\67\16\67"+
		"\u01e2\38\58\u01e6\n8\38\68\u01e9\n8\r8\168\u01ea\38\38\68\u01ef\n8\r"+
		"8\168\u01f0\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3>\3>\3?\3?\3?\3?\3?\3"+
		"?\3?\3?\3?\3?\3?\3?\3?\3?\3@\3@\3A\3A\7A\u0213\nA\fA\16A\u0216\13A\3B"+
		"\3B\3B\3C\3C\3C\7C\u021e\nC\fC\16C\u0221\13C\3C\3C\3C\3C\7C\u0227\nC\f"+
		"C\16C\u022a\13C\3C\5C\u022d\nC\3D\3D\7D\u0231\nD\fD\16D\u0234\13D\3D\3"+
		"D\3E\3E\3E\3F\3F\3F\7F\u023e\nF\fF\16F\u0241\13F\3F\3F\3F\3F\7F\u0247"+
		"\nF\fF\16F\u024a\13F\3F\5F\u024d\nF\3G\3G\7G\u0251\nG\fG\16G\u0254\13"+
		"G\3G\3G\3G\3G\3H\3H\2\2I\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f"+
		"\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63"+
		"\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62"+
		"c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083\2\u0085C\u0087"+
		"D\u0089E\u008bF\u008dG\u008fH\3\2\n\3\2\62;\4\2--//\4\2C\\c|\6\2\62;C"+
		"\\aac|\4\2\f\f$$\5\2\f\f))^^\4\2\f\f\177\177\5\2\13\f\17\17\"\"\2\u026a"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3"+
		"\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2"+
		"\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2"+
		"{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0085\3\2\2\2\2\u0087"+
		"\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2"+
		"\2\3\u0091\3\2\2\2\5\u009b\3\2\2\2\7\u00b5\3\2\2\2\t\u00bd\3\2\2\2\13"+
		"\u00bf\3\2\2\2\r\u00c1\3\2\2\2\17\u00c3\3\2\2\2\21\u00c6\3\2\2\2\23\u00d0"+
		"\3\2\2\2\25\u00d5\3\2\2\2\27\u00d7\3\2\2\2\31\u00df\3\2\2\2\33\u00e7\3"+
		"\2\2\2\35\u00ec\3\2\2\2\37\u00f3\3\2\2\2!\u00fe\3\2\2\2#\u0104\3\2\2\2"+
		"%\u010d\3\2\2\2\'\u011a\3\2\2\2)\u0127\3\2\2\2+\u0138\3\2\2\2-\u013f\3"+
		"\2\2\2/\u0146\3\2\2\2\61\u014e\3\2\2\2\63\u0159\3\2\2\2\65\u015e\3\2\2"+
		"\2\67\u0166\3\2\2\29\u0169\3\2\2\2;\u016f\3\2\2\2=\u0175\3\2\2\2?\u017c"+
		"\3\2\2\2A\u0181\3\2\2\2C\u0186\3\2\2\2E\u018f\3\2\2\2G\u0194\3\2\2\2I"+
		"\u0198\3\2\2\2K\u019d\3\2\2\2M\u01a6\3\2\2\2O\u01af\3\2\2\2Q\u01bc\3\2"+
		"\2\2S\u01be\3\2\2\2U\u01c1\3\2\2\2W\u01c5\3\2\2\2Y\u01c7\3\2\2\2[\u01ca"+
		"\3\2\2\2]\u01cc\3\2\2\2_\u01cf\3\2\2\2a\u01d1\3\2\2\2c\u01d4\3\2\2\2e"+
		"\u01d6\3\2\2\2g\u01d8\3\2\2\2i\u01da\3\2\2\2k\u01dc\3\2\2\2m\u01e0\3\2"+
		"\2\2o\u01e5\3\2\2\2q\u01f2\3\2\2\2s\u01f4\3\2\2\2u\u01f6\3\2\2\2w\u01f8"+
		"\3\2\2\2y\u01fa\3\2\2\2{\u01fc\3\2\2\2}\u0200\3\2\2\2\177\u020e\3\2\2"+
		"\2\u0081\u0210\3\2\2\2\u0083\u0217\3\2\2\2\u0085\u022c\3\2\2\2\u0087\u022e"+
		"\3\2\2\2\u0089\u0237\3\2\2\2\u008b\u024c\3\2\2\2\u008d\u024e\3\2\2\2\u008f"+
		"\u0259\3\2\2\2\u0091\u0092\7c\2\2\u0092\u0093\7n\2\2\u0093\u0094\7i\2"+
		"\2\u0094\u0095\7q\2\2\u0095\u0096\7t\2\2\u0096\u0097\7k\2\2\u0097\u0098"+
		"\7v\2\2\u0098\u0099\7o\2\2\u0099\u009a\7q\2\2\u009a\4\3\2\2\2\u009b\u009c"+
		"\7f\2\2\u009c\u009d\7q\2\2\u009d\u009e\7e\2\2\u009e\u009f\7w\2\2\u009f"+
		"\u00a0\7o\2\2\u00a0\u00a1\7g\2\2\u00a1\u00a2\7p\2\2\u00a2\u00a3\7v\2\2"+
		"\u00a3\u00a4\7c\2\2\u00a4\u00a5\7\u00e9\2\2\u00a5\u00a6\7\u00e5\2\2\u00a6"+
		"\u00a7\7q\2\2\u00a7\u00a8\7a\2\2\u00a8\u00a9\7f\2\2\u00a9\u00aa\7q\2\2"+
		"\u00aa\u00ab\7a\2\2\u00ab\u00ac\7c\2\2\u00ac\u00ad\7n\2\2\u00ad\u00ae"+
		"\7i\2\2\u00ae\u00af\7q\2\2\u00af\u00b0\7t\2\2\u00b0\u00b1\7k\2\2\u00b1"+
		"\u00b2\7v\2\2\u00b2\u00b3\7o\2\2\u00b3\u00b4\7q\2\2\u00b4\6\3\2\2\2\u00b5"+
		"\u00b6\7f\2\2\u00b6\u00b7\7g\2\2\u00b7\u00b8\7e\2\2\u00b8\u00b9\7n\2\2"+
		"\u00b9\u00ba\7c\2\2\u00ba\u00bb\7t\2\2\u00bb\u00bc\7g\2\2\u00bc\b\3\2"+
		"\2\2\u00bd\u00be\7<\2\2\u00be\n\3\2\2\2\u00bf\u00c0\7.\2\2\u00c0\f\3\2"+
		"\2\2\u00c1\u00c2\7\60\2\2\u00c2\16\3\2\2\2\u00c3\u00c4\7\60\2\2\u00c4"+
		"\u00c5\7\60\2\2\u00c5\20\3\2\2\2\u00c6\u00c7\7e\2\2\u00c7\u00c8\7q\2\2"+
		"\u00c8\u00c9\7p\2\2\u00c9\u00ca\7u\2\2\u00ca\u00cb\7v\2\2\u00cb\u00cc"+
		"\7c\2\2\u00cc\u00cd\7p\2\2\u00cd\u00ce\7v\2\2\u00ce\u00cf\7g\2\2\u00cf"+
		"\22\3\2\2\2\u00d0\u00d1\7v\2\2\u00d1\u00d2\7k\2\2\u00d2\u00d3\7r\2\2\u00d3"+
		"\u00d4\7q\2\2\u00d4\24\3\2\2\2\u00d5\u00d6\7`\2\2\u00d6\26\3\2\2\2\u00d7"+
		"\u00d8\7n\2\2\u00d8\u00d9\7k\2\2\u00d9\u00da\7v\2\2\u00da\u00db\7g\2\2"+
		"\u00db\u00dc\7t\2\2\u00dc\u00dd\7c\2\2\u00dd\u00de\7n\2\2\u00de\30\3\2"+
		"\2\2\u00df\u00e0\7k\2\2\u00e0\u00e1\7p\2\2\u00e1\u00e2\7v\2\2\u00e2\u00e3"+
		"\7g\2\2\u00e3\u00e4\7k\2\2\u00e4\u00e5\7t\2\2\u00e5\u00e6\7q\2\2\u00e6"+
		"\32\3\2\2\2\u00e7\u00e8\7t\2\2\u00e8\u00e9\7g\2\2\u00e9\u00ea\7c\2\2\u00ea"+
		"\u00eb\7n\2\2\u00eb\34\3\2\2\2\u00ec\u00ed\7n\2\2\u00ed\u00ee\7q\2\2\u00ee"+
		"\u00ef\7i\2\2\u00ef\u00f0\7k\2\2\u00f0\u00f1\7e\2\2\u00f1\u00f2\7q\2\2"+
		"\u00f2\36\3\2\2\2\u00f3\u00f4\7x\2\2\u00f4\u00f5\7g\2\2\u00f5\u00f6\7"+
		"t\2\2\u00f6\u00f7\7f\2\2\u00f7\u00f8\7c\2\2\u00f8\u00f9\7f\2\2\u00f9\u00fa"+
		"\7g\2\2\u00fa\u00fb\7k\2\2\u00fb\u00fc\7t\2\2\u00fc\u00fd\7q\2\2\u00fd"+
		" \3\2\2\2\u00fe\u00ff\7h\2\2\u00ff\u0100\7c\2\2\u0100\u0101\7n\2\2\u0101"+
		"\u0102\7u\2\2\u0102\u0103\7q\2\2\u0103\"\3\2\2\2\u0104\u0105\7t\2\2\u0105"+
		"\u0106\7g\2\2\u0106\u0107\7i\2\2\u0107\u0108\7k\2\2\u0108\u0109\7u\2\2"+
		"\u0109\u010a\7v\2\2\u010a\u010b\7t\2\2\u010b\u010c\7q\2\2\u010c$\3\2\2"+
		"\2\u010d\u010e\7h\2\2\u010e\u010f\7k\2\2\u010f\u0110\7o\2\2\u0110\u0111"+
		"\7a\2\2\u0111\u0112\7t\2\2\u0112\u0113\7g\2\2\u0113\u0114\7i\2\2\u0114"+
		"\u0115\7k\2\2\u0115\u0116\7u\2\2\u0116\u0117\7v\2\2\u0117\u0118\7t\2\2"+
		"\u0118\u0119\7q\2\2\u0119&\3\2\2\2\u011a\u011b\7r\2\2\u011b\u011c\7t\2"+
		"\2\u011c\u011d\7q\2\2\u011d\u011e\7e\2\2\u011e\u011f\7g\2\2\u011f\u0120"+
		"\7f\2\2\u0120\u0121\7k\2\2\u0121\u0122\7o\2\2\u0122\u0123\7g\2\2\u0123"+
		"\u0124\7p\2\2\u0124\u0125\7v\2\2\u0125\u0126\7q\2\2\u0126(\3\2\2\2\u0127"+
		"\u0128\7h\2\2\u0128\u0129\7k\2\2\u0129\u012a\7o\2\2\u012a\u012b\7a\2\2"+
		"\u012b\u012c\7r\2\2\u012c\u012d\7t\2\2\u012d\u012e\7q\2\2\u012e\u012f"+
		"\7e\2\2\u012f\u0130\7g\2\2\u0130\u0131\7f\2\2\u0131\u0132\7k\2\2\u0132"+
		"\u0133\7o\2\2\u0133\u0134\7g\2\2\u0134\u0135\7p\2\2\u0135\u0136\7v\2\2"+
		"\u0136\u0137\7q\2\2\u0137*\3\2\2\2\u0138\u0139\7h\2\2\u0139\u013a\7w\2"+
		"\2\u013a\u013b\7p\2\2\u013b\u013c\7e\2\2\u013c\u013d\7c\2\2\u013d\u013e"+
		"\7q\2\2\u013e,\3\2\2\2\u013f\u0140\7t\2\2\u0140\u0141\7q\2\2\u0141\u0142"+
		"\7v\2\2\u0142\u0143\7k\2\2\u0143\u0144\7p\2\2\u0144\u0145\7c\2\2\u0145"+
		".\3\2\2\2\u0146\u0147\7t\2\2\u0147\u0148\7g\2\2\u0148\u0149\7v\2\2\u0149"+
		"\u014a\7q\2\2\u014a\u014b\7t\2\2\u014b\u014c\7p\2\2\u014c\u014d\7g\2\2"+
		"\u014d\60\3\2\2\2\u014e\u014f\7h\2\2\u014f\u0150\7k\2\2\u0150\u0151\7"+
		"o\2\2\u0151\u0152\7a\2\2\u0152\u0153\7h\2\2\u0153\u0154\7w\2\2\u0154\u0155"+
		"\7p\2\2\u0155\u0156\7e\2\2\u0156\u0157\7c\2\2\u0157\u0158\7q\2\2\u0158"+
		"\62\3\2\2\2\u0159\u015a\7n\2\2\u015a\u015b\7g\2\2\u015b\u015c\7k\2\2\u015c"+
		"\u015d\7c\2\2\u015d\64\3\2\2\2\u015e\u015f\7g\2\2\u015f\u0160\7u\2\2\u0160"+
		"\u0161\7e\2\2\u0161\u0162\7t\2\2\u0162\u0163\7g\2\2\u0163\u0164\7x\2\2"+
		"\u0164\u0165\7c\2\2\u0165\66\3\2\2\2\u0166\u0167\7u\2\2\u0167\u0168\7"+
		"g\2\2\u01688\3\2\2\2\u0169\u016a\7g\2\2\u016a\u016b\7p\2\2\u016b\u016c"+
		"\7v\2\2\u016c\u016d\7c\2\2\u016d\u016e\7q\2\2\u016e:\3\2\2\2\u016f\u0170"+
		"\7u\2\2\u0170\u0171\7g\2\2\u0171\u0172\7p\2\2\u0172\u0173\7c\2\2\u0173"+
		"\u0174\7q\2\2\u0174<\3\2\2\2\u0175\u0176\7h\2\2\u0176\u0177\7k\2\2\u0177"+
		"\u0178\7o\2\2\u0178\u0179\7a\2\2\u0179\u017a\7u\2\2\u017a\u017b\7g\2\2"+
		"\u017b>\3\2\2\2\u017c\u017d\7e\2\2\u017d\u017e\7c\2\2\u017e\u017f\7u\2"+
		"\2\u017f\u0180\7q\2\2\u0180@\3\2\2\2\u0181\u0182\7u\2\2\u0182\u0183\7"+
		"g\2\2\u0183\u0184\7l\2\2\u0184\u0185\7c\2\2\u0185B\3\2\2\2\u0186\u0187"+
		"\7h\2\2\u0187\u0188\7k\2\2\u0188\u0189\7o\2\2\u0189\u018a\7a\2\2\u018a"+
		"\u018b\7e\2\2\u018b\u018c\7c\2\2\u018c\u018d\7u\2\2\u018d\u018e\7q\2\2"+
		"\u018eD\3\2\2\2\u018f\u0190\7r\2\2\u0190\u0191\7c\2\2\u0191\u0192\7t\2"+
		"\2\u0192\u0193\7c\2\2\u0193F\3\2\2\2\u0194\u0195\7c\2\2\u0195\u0196\7"+
		"v\2\2\u0196\u0197\7g\2\2\u0197H\3\2\2\2\u0198\u0199\7h\2\2\u0199\u019a"+
		"\7c\2\2\u019a\u019b\7e\2\2\u019b\u019c\7c\2\2\u019cJ\3\2\2\2\u019d\u019e"+
		"\7h\2\2\u019e\u019f\7k\2\2\u019f\u01a0\7o\2\2\u01a0\u01a1\7a\2\2\u01a1"+
		"\u01a2\7r\2\2\u01a2\u01a3\7c\2\2\u01a3\u01a4\7t\2\2\u01a4\u01a5\7c\2\2"+
		"\u01a5L\3\2\2\2\u01a6\u01a7\7g\2\2\u01a7\u01a8\7p\2\2\u01a8\u01a9\7s\2"+
		"\2\u01a9\u01aa\7w\2\2\u01aa\u01ab\7c\2\2\u01ab\u01ac\7p\2\2\u01ac\u01ad"+
		"\7v\2\2\u01ad\u01ae\7q\2\2\u01aeN\3\2\2\2\u01af\u01b0\7h\2\2\u01b0\u01b1"+
		"\7k\2\2\u01b1\u01b2\7o\2\2\u01b2\u01b3\7a\2\2\u01b3\u01b4\7g\2\2\u01b4"+
		"\u01b5\7p\2\2\u01b5\u01b6\7s\2\2\u01b6\u01b7\7w\2\2\u01b7\u01b8\7c\2\2"+
		"\u01b8\u01b9\7p\2\2\u01b9\u01ba\7v\2\2\u01ba\u01bb\7q\2\2\u01bbP\3\2\2"+
		"\2\u01bc\u01bd\7g\2\2\u01bdR\3\2\2\2\u01be\u01bf\7q\2\2\u01bf\u01c0\7"+
		"w\2\2\u01c0T\3\2\2\2\u01c1\u01c2\7p\2\2\u01c2\u01c3\7c\2\2\u01c3\u01c4"+
		"\7q\2\2\u01c4V\3\2\2\2\u01c5\u01c6\7?\2\2\u01c6X\3\2\2\2\u01c7\u01c8\7"+
		">\2\2\u01c8\u01c9\7@\2\2\u01c9Z\3\2\2\2\u01ca\u01cb\7@\2\2\u01cb\\\3\2"+
		"\2\2\u01cc\u01cd\7@\2\2\u01cd\u01ce\7?\2\2\u01ce^\3\2\2\2\u01cf\u01d0"+
		"\7>\2\2\u01d0`\3\2\2\2\u01d1\u01d2\7>\2\2\u01d2\u01d3\7?\2\2\u01d3b\3"+
		"\2\2\2\u01d4\u01d5\7-\2\2\u01d5d\3\2\2\2\u01d6\u01d7\7/\2\2\u01d7f\3\2"+
		"\2\2\u01d8\u01d9\7,\2\2\u01d9h\3\2\2\2\u01da\u01db\7\61\2\2\u01dbj\3\2"+
		"\2\2\u01dc\u01dd\7>\2\2\u01dd\u01de\7/\2\2\u01del\3\2\2\2\u01df\u01e1"+
		"\t\2\2\2\u01e0\u01df\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2\u01e0\3\2\2\2\u01e2"+
		"\u01e3\3\2\2\2\u01e3n\3\2\2\2\u01e4\u01e6\t\3\2\2\u01e5\u01e4\3\2\2\2"+
		"\u01e5\u01e6\3\2\2\2\u01e6\u01e8\3\2\2\2\u01e7\u01e9\t\2\2\2\u01e8\u01e7"+
		"\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea\u01e8\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb"+
		"\u01ec\3\2\2\2\u01ec\u01ee\7\60\2\2\u01ed\u01ef\t\2\2\2\u01ee\u01ed\3"+
		"\2\2\2\u01ef\u01f0\3\2\2\2\u01f0\u01ee\3\2\2\2\u01f0\u01f1\3\2\2\2\u01f1"+
		"p\3\2\2\2\u01f2\u01f3\7*\2\2\u01f3r\3\2\2\2\u01f4\u01f5\7+\2\2\u01f5t"+
		"\3\2\2\2\u01f6\u01f7\7]\2\2\u01f7v\3\2\2\2\u01f8\u01f9\7_\2\2\u01f9x\3"+
		"\2\2\2\u01fa\u01fb\7\'\2\2\u01fbz\3\2\2\2\u01fc\u01fd\7x\2\2\u01fd\u01fe"+
		"\7c\2\2\u01fe\u01ff\7t\2\2\u01ff|\3\2\2\2\u0200\u0201\7h\2\2\u0201\u0202"+
		"\7k\2\2\u0202\u0203\7o\2\2\u0203\u0204\7a\2\2\u0204\u0205\7c\2\2\u0205"+
		"\u0206\7n\2\2\u0206\u0207\7i\2\2\u0207\u0208\7q\2\2\u0208\u0209\7t\2\2"+
		"\u0209\u020a\7k\2\2\u020a\u020b\7v\2\2\u020b\u020c\7o\2\2\u020c\u020d"+
		"\7q\2\2\u020d~\3\2\2\2\u020e\u020f\7(\2\2\u020f\u0080\3\2\2\2\u0210\u0214"+
		"\t\4\2\2\u0211\u0213\t\5\2\2\u0212\u0211\3\2\2\2\u0213\u0216\3\2\2\2\u0214"+
		"\u0212\3\2\2\2\u0214\u0215\3\2\2\2\u0215\u0082\3\2\2\2\u0216\u0214\3\2"+
		"\2\2\u0217\u0218\7^\2\2\u0218\u0219\7)\2\2\u0219\u0084\3\2\2\2\u021a\u021f"+
		"\7$\2\2\u021b\u021e\5\u0083B\2\u021c\u021e\n\6\2\2\u021d\u021b\3\2\2\2"+
		"\u021d\u021c\3\2\2\2\u021e\u0221\3\2\2\2\u021f\u021d\3\2\2\2\u021f\u0220"+
		"\3\2\2\2\u0220\u0222\3\2\2\2\u0221\u021f\3\2\2\2\u0222\u022d\7\f\2\2\u0223"+
		"\u0228\7)\2\2\u0224\u0227\5\u0083B\2\u0225\u0227\n\7\2\2\u0226\u0224\3"+
		"\2\2\2\u0226\u0225\3\2\2\2\u0227\u022a\3\2\2\2\u0228\u0226\3\2\2\2\u0228"+
		"\u0229\3\2\2\2\u0229\u022b\3\2\2\2\u022a\u0228\3\2\2\2\u022b\u022d\7\f"+
		"\2\2\u022c\u021a\3\2\2\2\u022c\u0223\3\2\2\2\u022d\u0086\3\2\2\2\u022e"+
		"\u0232\7}\2\2\u022f\u0231\n\b\2\2\u0230\u022f\3\2\2\2\u0231\u0234\3\2"+
		"\2\2\u0232\u0230\3\2\2\2\u0232\u0233\3\2\2\2\u0233\u0235\3\2\2\2\u0234"+
		"\u0232\3\2\2\2\u0235\u0236\7\f\2\2\u0236\u0088\3\2\2\2\u0237\u0238\t\t"+
		"\2\2\u0238\u0239\bE\2\2\u0239\u008a\3\2\2\2\u023a\u023f\7$\2\2\u023b\u023e"+
		"\5\u0083B\2\u023c\u023e\n\6\2\2\u023d\u023b\3\2\2\2\u023d\u023c\3\2\2"+
		"\2\u023e\u0241\3\2\2\2\u023f\u023d\3\2\2\2\u023f\u0240\3\2\2\2\u0240\u0242"+
		"\3\2\2\2\u0241\u023f\3\2\2\2\u0242\u024d\7$\2\2\u0243\u0248\7)\2\2\u0244"+
		"\u0247\5\u0083B\2\u0245\u0247\n\7\2\2\u0246\u0244\3\2\2\2\u0246\u0245"+
		"\3\2\2\2\u0247\u024a\3\2\2\2\u0248\u0246\3\2\2\2\u0248\u0249\3\2\2\2\u0249"+
		"\u024b\3\2\2\2\u024a\u0248\3\2\2\2\u024b\u024d\7)\2\2\u024c\u023a\3\2"+
		"\2\2\u024c\u0243\3\2\2\2\u024d\u008c\3\2\2\2\u024e\u0252\7}\2\2\u024f"+
		"\u0251\n\b\2\2\u0250\u024f\3\2\2\2\u0251\u0254\3\2\2\2\u0252\u0250\3\2"+
		"\2\2\u0252\u0253\3\2\2\2\u0253\u0255\3\2\2\2\u0254\u0252\3\2\2\2\u0255"+
		"\u0256\7\177\2\2\u0256\u0257\3\2\2\2\u0257\u0258\bG\3\2\u0258\u008e\3"+
		"\2\2\2\u0259\u025a\13\2\2\2\u025a\u0090\3\2\2\2\24\2\u01e2\u01e5\u01ea"+
		"\u01f0\u0214\u021d\u021f\u0226\u0228\u022c\u0232\u023d\u023f\u0246\u0248"+
		"\u024c\u0252\4\3E\2\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}