// Generated from LabeledExpr.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LabeledExprLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MUL=1, DIV=2, ADD=3, SUB=4, EQ=5, GREAT=6, LESS=7, IF=8, ELSE=9, PRINT=10, 
		WHILE=11, FOR=12, INT=13, FLOAT=14, CONST=15, STRING=16, ACHAVE=17, FCHAVE=18, 
		APAREN=19, FPAREN=20, VIG=21, PTVIG=22, ID=23, INTVAL=24, FLOATVAL=25, 
		STRINGVAL=26, NEWLINE=27, COMMENT=28, WS=29;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"MUL", "DIV", "ADD", "SUB", "EQ", "GREAT", "LESS", "IF", "ELSE", "PRINT", 
			"WHILE", "FOR", "INT", "FLOAT", "CONST", "STRING", "ACHAVE", "FCHAVE", 
			"APAREN", "FPAREN", "VIG", "PTVIG", "ID", "INTVAL", "FLOATVAL", "STRINGVAL", 
			"NEWLINE", "COMMENT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'*'", "'/'", "'+'", "'-'", "'='", "'>'", "'<'", "'if'", "'else'", 
			"'println'", "'while'", "'for'", "'int'", "'float'", "'const'", "'string'", 
			"'{'", "'}'", "'('", "')'", "','", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "MUL", "DIV", "ADD", "SUB", "EQ", "GREAT", "LESS", "IF", "ELSE", 
			"PRINT", "WHILE", "FOR", "INT", "FLOAT", "CONST", "STRING", "ACHAVE", 
			"FCHAVE", "APAREN", "FPAREN", "VIG", "PTVIG", "ID", "INTVAL", "FLOATVAL", 
			"STRINGVAL", "NEWLINE", "COMMENT", "WS"
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


	public LabeledExprLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LabeledExpr.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\37\u00c0\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n"+
		"\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22"+
		"\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\6\30\u008a\n\30"+
		"\r\30\16\30\u008b\3\31\6\31\u008f\n\31\r\31\16\31\u0090\3\32\6\32\u0094"+
		"\n\32\r\32\16\32\u0095\3\32\3\32\6\32\u009a\n\32\r\32\16\32\u009b\3\33"+
		"\3\33\7\33\u00a0\n\33\f\33\16\33\u00a3\13\33\3\33\3\33\3\34\5\34\u00a8"+
		"\n\34\3\34\3\34\3\35\3\35\3\35\3\35\7\35\u00b0\n\35\f\35\16\35\u00b3\13"+
		"\35\3\35\3\35\3\35\3\35\3\35\3\36\6\36\u00bb\n\36\r\36\16\36\u00bc\3\36"+
		"\3\36\4\u00a1\u00b1\2\37\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f"+
		"\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63"+
		"\33\65\34\67\359\36;\37\3\2\5\4\2C\\c|\3\2\62;\4\2\13\13\"\"\2\u00c7\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2"+
		"\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2"+
		"\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2"+
		"\2\2\3=\3\2\2\2\5?\3\2\2\2\7A\3\2\2\2\tC\3\2\2\2\13E\3\2\2\2\rG\3\2\2"+
		"\2\17I\3\2\2\2\21K\3\2\2\2\23N\3\2\2\2\25S\3\2\2\2\27[\3\2\2\2\31a\3\2"+
		"\2\2\33e\3\2\2\2\35i\3\2\2\2\37o\3\2\2\2!u\3\2\2\2#|\3\2\2\2%~\3\2\2\2"+
		"\'\u0080\3\2\2\2)\u0082\3\2\2\2+\u0084\3\2\2\2-\u0086\3\2\2\2/\u0089\3"+
		"\2\2\2\61\u008e\3\2\2\2\63\u0093\3\2\2\2\65\u009d\3\2\2\2\67\u00a7\3\2"+
		"\2\29\u00ab\3\2\2\2;\u00ba\3\2\2\2=>\7,\2\2>\4\3\2\2\2?@\7\61\2\2@\6\3"+
		"\2\2\2AB\7-\2\2B\b\3\2\2\2CD\7/\2\2D\n\3\2\2\2EF\7?\2\2F\f\3\2\2\2GH\7"+
		"@\2\2H\16\3\2\2\2IJ\7>\2\2J\20\3\2\2\2KL\7k\2\2LM\7h\2\2M\22\3\2\2\2N"+
		"O\7g\2\2OP\7n\2\2PQ\7u\2\2QR\7g\2\2R\24\3\2\2\2ST\7r\2\2TU\7t\2\2UV\7"+
		"k\2\2VW\7p\2\2WX\7v\2\2XY\7n\2\2YZ\7p\2\2Z\26\3\2\2\2[\\\7y\2\2\\]\7j"+
		"\2\2]^\7k\2\2^_\7n\2\2_`\7g\2\2`\30\3\2\2\2ab\7h\2\2bc\7q\2\2cd\7t\2\2"+
		"d\32\3\2\2\2ef\7k\2\2fg\7p\2\2gh\7v\2\2h\34\3\2\2\2ij\7h\2\2jk\7n\2\2"+
		"kl\7q\2\2lm\7c\2\2mn\7v\2\2n\36\3\2\2\2op\7e\2\2pq\7q\2\2qr\7p\2\2rs\7"+
		"u\2\2st\7v\2\2t \3\2\2\2uv\7u\2\2vw\7v\2\2wx\7t\2\2xy\7k\2\2yz\7p\2\2"+
		"z{\7i\2\2{\"\3\2\2\2|}\7}\2\2}$\3\2\2\2~\177\7\177\2\2\177&\3\2\2\2\u0080"+
		"\u0081\7*\2\2\u0081(\3\2\2\2\u0082\u0083\7+\2\2\u0083*\3\2\2\2\u0084\u0085"+
		"\7.\2\2\u0085,\3\2\2\2\u0086\u0087\7=\2\2\u0087.\3\2\2\2\u0088\u008a\t"+
		"\2\2\2\u0089\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u0089\3\2\2\2\u008b"+
		"\u008c\3\2\2\2\u008c\60\3\2\2\2\u008d\u008f\t\3\2\2\u008e\u008d\3\2\2"+
		"\2\u008f\u0090\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\62"+
		"\3\2\2\2\u0092\u0094\t\3\2\2\u0093\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095"+
		"\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0099\7\60"+
		"\2\2\u0098\u009a\t\3\2\2\u0099\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b"+
		"\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\64\3\2\2\2\u009d\u00a1\7$\2\2"+
		"\u009e\u00a0\13\2\2\2\u009f\u009e\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u00a2"+
		"\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2\u00a4\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4"+
		"\u00a5\7$\2\2\u00a5\66\3\2\2\2\u00a6\u00a8\7\17\2\2\u00a7\u00a6\3\2\2"+
		"\2\u00a7\u00a8\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00aa\7\f\2\2\u00aa8"+
		"\3\2\2\2\u00ab\u00ac\7\61\2\2\u00ac\u00ad\7,\2\2\u00ad\u00b1\3\2\2\2\u00ae"+
		"\u00b0\13\2\2\2\u00af\u00ae\3\2\2\2\u00b0\u00b3\3\2\2\2\u00b1\u00b2\3"+
		"\2\2\2\u00b1\u00af\3\2\2\2\u00b2\u00b4\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4"+
		"\u00b5\7,\2\2\u00b5\u00b6\7\61\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b8\b\35"+
		"\2\2\u00b8:\3\2\2\2\u00b9\u00bb\t\4\2\2\u00ba\u00b9\3\2\2\2\u00bb\u00bc"+
		"\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be\3\2\2\2\u00be"+
		"\u00bf\b\36\2\2\u00bf<\3\2\2\2\13\2\u008b\u0090\u0095\u009b\u00a1\u00a7"+
		"\u00b1\u00bc\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}