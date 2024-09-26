// Generated from ConfigD.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ConfigDLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, SET=7, IF=8, ID=9, INT=10, 
		BOOLEAN=11, STRING=12, FILEPATH=13, WS=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "SET", "IF", "ID", "INT", 
			"BOOLEAN", "STRING", "FILEPATH", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "';'", "'('", "')'", "'{'", "'}'", "'SET'", "'IF'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "SET", "IF", "ID", "INT", "BOOLEAN", 
			"STRING", "FILEPATH", "WS"
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


	public ConfigDLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ConfigD.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\20`\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3"+
		"\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\7\n\65\n\n\f\n"+
		"\16\n8\13\n\3\13\6\13;\n\13\r\13\16\13<\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\5\fH\n\f\3\r\3\r\7\rL\n\r\f\r\16\rO\13\r\3\r\3\r\3\16\3\16\7\16"+
		"U\n\16\f\16\16\16X\13\16\3\17\6\17[\n\17\r\17\16\17\\\3\17\3\17\3M\2\20"+
		"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\3\2\7\5\2C\\aac|\6\2\62;C\\aac|\3\2\62;\6\2\60;C\\aac|\5\2\13\f\17\17"+
		"\"\"\2e\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\3\37\3\2\2\2\5!\3\2\2\2"+
		"\7#\3\2\2\2\t%\3\2\2\2\13\'\3\2\2\2\r)\3\2\2\2\17+\3\2\2\2\21/\3\2\2\2"+
		"\23\62\3\2\2\2\25:\3\2\2\2\27G\3\2\2\2\31I\3\2\2\2\33R\3\2\2\2\35Z\3\2"+
		"\2\2\37 \7?\2\2 \4\3\2\2\2!\"\7=\2\2\"\6\3\2\2\2#$\7*\2\2$\b\3\2\2\2%"+
		"&\7+\2\2&\n\3\2\2\2\'(\7}\2\2(\f\3\2\2\2)*\7\177\2\2*\16\3\2\2\2+,\7U"+
		"\2\2,-\7G\2\2-.\7V\2\2.\20\3\2\2\2/\60\7K\2\2\60\61\7H\2\2\61\22\3\2\2"+
		"\2\62\66\t\2\2\2\63\65\t\3\2\2\64\63\3\2\2\2\658\3\2\2\2\66\64\3\2\2\2"+
		"\66\67\3\2\2\2\67\24\3\2\2\28\66\3\2\2\29;\t\4\2\2:9\3\2\2\2;<\3\2\2\2"+
		"<:\3\2\2\2<=\3\2\2\2=\26\3\2\2\2>?\7V\2\2?@\7T\2\2@A\7W\2\2AH\7G\2\2B"+
		"C\7H\2\2CD\7C\2\2DE\7N\2\2EF\7U\2\2FH\7G\2\2G>\3\2\2\2GB\3\2\2\2H\30\3"+
		"\2\2\2IM\7$\2\2JL\13\2\2\2KJ\3\2\2\2LO\3\2\2\2MN\3\2\2\2MK\3\2\2\2NP\3"+
		"\2\2\2OM\3\2\2\2PQ\7$\2\2Q\32\3\2\2\2RV\7\61\2\2SU\t\5\2\2TS\3\2\2\2U"+
		"X\3\2\2\2VT\3\2\2\2VW\3\2\2\2W\34\3\2\2\2XV\3\2\2\2Y[\t\6\2\2ZY\3\2\2"+
		"\2[\\\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]^\3\2\2\2^_\b\17\2\2_\36\3\2\2\2\t"+
		"\2\66<GMV\\\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}