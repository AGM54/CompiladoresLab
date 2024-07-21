// Generated from C:/Users/marce/Desktop/funciones/src/ConfRoomScheduler.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class ConfRoomSchedulerLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, DATE=6, TIME=7, ID=8, NEWLINE=9, 
		WS=10;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "DATE", "TIME", "ID", "NEWLINE", 
			"WS", "DIGIT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'RESERVAR'", "'PARA'", "'DE'", "'A'", "'CANCELAR'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "DATE", "TIME", "ID", "NEWLINE", 
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


	public ConfRoomSchedulerLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ConfRoomScheduler.g4"; }

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
		"\u0004\u0000\nW\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0004\u0007F\b\u0007\u000b\u0007"+
		"\f\u0007G\u0001\b\u0003\bK\b\b\u0001\b\u0001\b\u0001\t\u0004\tP\b\t\u000b"+
		"\t\f\tQ\u0001\t\u0001\t\u0001\n\u0001\n\u0000\u0000\u000b\u0001\u0001"+
		"\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f"+
		"\b\u0011\t\u0013\n\u0015\u0000\u0001\u0000\u0003\u0003\u000009AZaz\u0002"+
		"\u0000\t\t  \u0001\u000009X\u0000\u0001\u0001\u0000\u0000\u0000\u0000"+
		"\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000"+
		"\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b"+
		"\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001"+
		"\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001"+
		"\u0000\u0000\u0000\u0001\u0017\u0001\u0000\u0000\u0000\u0003 \u0001\u0000"+
		"\u0000\u0000\u0005%\u0001\u0000\u0000\u0000\u0007(\u0001\u0000\u0000\u0000"+
		"\t*\u0001\u0000\u0000\u0000\u000b3\u0001\u0000\u0000\u0000\r>\u0001\u0000"+
		"\u0000\u0000\u000fE\u0001\u0000\u0000\u0000\u0011J\u0001\u0000\u0000\u0000"+
		"\u0013O\u0001\u0000\u0000\u0000\u0015U\u0001\u0000\u0000\u0000\u0017\u0018"+
		"\u0005R\u0000\u0000\u0018\u0019\u0005E\u0000\u0000\u0019\u001a\u0005S"+
		"\u0000\u0000\u001a\u001b\u0005E\u0000\u0000\u001b\u001c\u0005R\u0000\u0000"+
		"\u001c\u001d\u0005V\u0000\u0000\u001d\u001e\u0005A\u0000\u0000\u001e\u001f"+
		"\u0005R\u0000\u0000\u001f\u0002\u0001\u0000\u0000\u0000 !\u0005P\u0000"+
		"\u0000!\"\u0005A\u0000\u0000\"#\u0005R\u0000\u0000#$\u0005A\u0000\u0000"+
		"$\u0004\u0001\u0000\u0000\u0000%&\u0005D\u0000\u0000&\'\u0005E\u0000\u0000"+
		"\'\u0006\u0001\u0000\u0000\u0000()\u0005A\u0000\u0000)\b\u0001\u0000\u0000"+
		"\u0000*+\u0005C\u0000\u0000+,\u0005A\u0000\u0000,-\u0005N\u0000\u0000"+
		"-.\u0005C\u0000\u0000./\u0005E\u0000\u0000/0\u0005L\u0000\u000001\u0005"+
		"A\u0000\u000012\u0005R\u0000\u00002\n\u0001\u0000\u0000\u000034\u0003"+
		"\u0015\n\u000045\u0003\u0015\n\u000056\u0005/\u0000\u000067\u0003\u0015"+
		"\n\u000078\u0003\u0015\n\u000089\u0005/\u0000\u00009:\u0003\u0015\n\u0000"+
		":;\u0003\u0015\n\u0000;<\u0003\u0015\n\u0000<=\u0003\u0015\n\u0000=\f"+
		"\u0001\u0000\u0000\u0000>?\u0003\u0015\n\u0000?@\u0003\u0015\n\u0000@"+
		"A\u0005:\u0000\u0000AB\u0003\u0015\n\u0000BC\u0003\u0015\n\u0000C\u000e"+
		"\u0001\u0000\u0000\u0000DF\u0007\u0000\u0000\u0000ED\u0001\u0000\u0000"+
		"\u0000FG\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000GH\u0001\u0000"+
		"\u0000\u0000H\u0010\u0001\u0000\u0000\u0000IK\u0005\r\u0000\u0000JI\u0001"+
		"\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000"+
		"LM\u0005\n\u0000\u0000M\u0012\u0001\u0000\u0000\u0000NP\u0007\u0001\u0000"+
		"\u0000ON\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000QO\u0001\u0000"+
		"\u0000\u0000QR\u0001\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000ST\u0006"+
		"\t\u0000\u0000T\u0014\u0001\u0000\u0000\u0000UV\u0007\u0002\u0000\u0000"+
		"V\u0016\u0001\u0000\u0000\u0000\u0004\u0000GJQ\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}