// Generated from ConfigC.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ConfigBLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, SET=3, ID=4, INT=5, BOOLEAN=6, STRING=7, FILEPATH=8, WS=9;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "SET", "ID", "INT", "BOOLEAN", "STRING", "FILEPATH", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "';'", "'SET'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "SET", "ID", "INT", "BOOLEAN", "STRING", "FILEPATH", 
			"WS"
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


	public ConfigBLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ConfigC.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\13K\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\7\5 \n\5\f\5\16\5#\13\5\3\6\6\6&\n\6"+
		"\r\6\16\6\'\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\63\n\7\3\b\3\b\7\b"+
		"\67\n\b\f\b\16\b:\13\b\3\b\3\b\3\t\3\t\7\t@\n\t\f\t\16\tC\13\t\3\n\6\n"+
		"F\n\n\r\n\16\nG\3\n\3\n\38\2\13\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\3\2\7\5\2C\\aac|\6\2\62;C\\aac|\3\2\62;\6\2\60;C\\aac|\5\2\13\f\17"+
		"\17\"\"\2P\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\3\25\3\2\2\2\5\27"+
		"\3\2\2\2\7\31\3\2\2\2\t\35\3\2\2\2\13%\3\2\2\2\r\62\3\2\2\2\17\64\3\2"+
		"\2\2\21=\3\2\2\2\23E\3\2\2\2\25\26\7?\2\2\26\4\3\2\2\2\27\30\7=\2\2\30"+
		"\6\3\2\2\2\31\32\7U\2\2\32\33\7G\2\2\33\34\7V\2\2\34\b\3\2\2\2\35!\t\2"+
		"\2\2\36 \t\3\2\2\37\36\3\2\2\2 #\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\"\n\3"+
		"\2\2\2#!\3\2\2\2$&\t\4\2\2%$\3\2\2\2&\'\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2"+
		"(\f\3\2\2\2)*\7V\2\2*+\7T\2\2+,\7W\2\2,\63\7G\2\2-.\7H\2\2./\7C\2\2/\60"+
		"\7N\2\2\60\61\7U\2\2\61\63\7G\2\2\62)\3\2\2\2\62-\3\2\2\2\63\16\3\2\2"+
		"\2\648\7$\2\2\65\67\13\2\2\2\66\65\3\2\2\2\67:\3\2\2\289\3\2\2\28\66\3"+
		"\2\2\29;\3\2\2\2:8\3\2\2\2;<\7$\2\2<\20\3\2\2\2=A\7\61\2\2>@\t\5\2\2?"+
		">\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2B\22\3\2\2\2CA\3\2\2\2DF\t\6\2"+
		"\2ED\3\2\2\2FG\3\2\2\2GE\3\2\2\2GH\3\2\2\2HI\3\2\2\2IJ\b\n\2\2J\24\3\2"+
		"\2\2\t\2!\'\628AG\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}