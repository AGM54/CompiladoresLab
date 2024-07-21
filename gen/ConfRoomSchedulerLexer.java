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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, DATE=8, TIME=9, 
		ID=10, DESCRIPTION=11, COMMENT=12, NEWLINE=13, WS=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "DATE", "TIME", 
			"ID", "DESCRIPTION", "COMMENT", "NEWLINE", "WS", "DIGIT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'RESERVAR'", "'PARA'", "'DE'", "'A'", "'DESCRIPCION'", "'CANCELAR'", 
			"'LISTAR'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "DATE", "TIME", "ID", 
			"DESCRIPTION", "COMMENT", "NEWLINE", "WS"
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
		"\u0004\u0000\u000e\u0086\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\t\u0004\ta\b\t\u000b\t\f\tb\u0001\n\u0001"+
		"\n\u0005\ng\b\n\n\n\f\nj\t\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0005\u000br\b\u000b\n\u000b\f\u000bu\t\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0003\fz\b\f\u0001\f\u0001\f\u0001\r\u0004"+
		"\r\u007f\b\r\u000b\r\f\r\u0080\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0000\u0000\u000f\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005"+
		"\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019"+
		"\r\u001b\u000e\u001d\u0000\u0001\u0000\u0005\u0003\u000009AZaz\u0003\u0000"+
		"\n\n\r\r\"\"\u0002\u0000\n\n\r\r\u0002\u0000\t\t  \u0001\u000009\u0089"+
		"\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000"+
		"\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000"+
		"\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000"+
		"\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0001\u001f"+
		"\u0001\u0000\u0000\u0000\u0003(\u0001\u0000\u0000\u0000\u0005-\u0001\u0000"+
		"\u0000\u0000\u00070\u0001\u0000\u0000\u0000\t2\u0001\u0000\u0000\u0000"+
		"\u000b>\u0001\u0000\u0000\u0000\rG\u0001\u0000\u0000\u0000\u000fN\u0001"+
		"\u0000\u0000\u0000\u0011Y\u0001\u0000\u0000\u0000\u0013`\u0001\u0000\u0000"+
		"\u0000\u0015d\u0001\u0000\u0000\u0000\u0017m\u0001\u0000\u0000\u0000\u0019"+
		"y\u0001\u0000\u0000\u0000\u001b~\u0001\u0000\u0000\u0000\u001d\u0084\u0001"+
		"\u0000\u0000\u0000\u001f \u0005R\u0000\u0000 !\u0005E\u0000\u0000!\"\u0005"+
		"S\u0000\u0000\"#\u0005E\u0000\u0000#$\u0005R\u0000\u0000$%\u0005V\u0000"+
		"\u0000%&\u0005A\u0000\u0000&\'\u0005R\u0000\u0000\'\u0002\u0001\u0000"+
		"\u0000\u0000()\u0005P\u0000\u0000)*\u0005A\u0000\u0000*+\u0005R\u0000"+
		"\u0000+,\u0005A\u0000\u0000,\u0004\u0001\u0000\u0000\u0000-.\u0005D\u0000"+
		"\u0000./\u0005E\u0000\u0000/\u0006\u0001\u0000\u0000\u000001\u0005A\u0000"+
		"\u00001\b\u0001\u0000\u0000\u000023\u0005D\u0000\u000034\u0005E\u0000"+
		"\u000045\u0005S\u0000\u000056\u0005C\u0000\u000067\u0005R\u0000\u0000"+
		"78\u0005I\u0000\u000089\u0005P\u0000\u00009:\u0005C\u0000\u0000:;\u0005"+
		"I\u0000\u0000;<\u0005O\u0000\u0000<=\u0005N\u0000\u0000=\n\u0001\u0000"+
		"\u0000\u0000>?\u0005C\u0000\u0000?@\u0005A\u0000\u0000@A\u0005N\u0000"+
		"\u0000AB\u0005C\u0000\u0000BC\u0005E\u0000\u0000CD\u0005L\u0000\u0000"+
		"DE\u0005A\u0000\u0000EF\u0005R\u0000\u0000F\f\u0001\u0000\u0000\u0000"+
		"GH\u0005L\u0000\u0000HI\u0005I\u0000\u0000IJ\u0005S\u0000\u0000JK\u0005"+
		"T\u0000\u0000KL\u0005A\u0000\u0000LM\u0005R\u0000\u0000M\u000e\u0001\u0000"+
		"\u0000\u0000NO\u0003\u001d\u000e\u0000OP\u0003\u001d\u000e\u0000PQ\u0005"+
		"/\u0000\u0000QR\u0003\u001d\u000e\u0000RS\u0003\u001d\u000e\u0000ST\u0005"+
		"/\u0000\u0000TU\u0003\u001d\u000e\u0000UV\u0003\u001d\u000e\u0000VW\u0003"+
		"\u001d\u000e\u0000WX\u0003\u001d\u000e\u0000X\u0010\u0001\u0000\u0000"+
		"\u0000YZ\u0003\u001d\u000e\u0000Z[\u0003\u001d\u000e\u0000[\\\u0005:\u0000"+
		"\u0000\\]\u0003\u001d\u000e\u0000]^\u0003\u001d\u000e\u0000^\u0012\u0001"+
		"\u0000\u0000\u0000_a\u0007\u0000\u0000\u0000`_\u0001\u0000\u0000\u0000"+
		"ab\u0001\u0000\u0000\u0000b`\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000"+
		"\u0000c\u0014\u0001\u0000\u0000\u0000dh\u0005\"\u0000\u0000eg\b\u0001"+
		"\u0000\u0000fe\u0001\u0000\u0000\u0000gj\u0001\u0000\u0000\u0000hf\u0001"+
		"\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000ik\u0001\u0000\u0000\u0000"+
		"jh\u0001\u0000\u0000\u0000kl\u0005\"\u0000\u0000l\u0016\u0001\u0000\u0000"+
		"\u0000mn\u0005/\u0000\u0000no\u0005/\u0000\u0000os\u0001\u0000\u0000\u0000"+
		"pr\b\u0002\u0000\u0000qp\u0001\u0000\u0000\u0000ru\u0001\u0000\u0000\u0000"+
		"sq\u0001\u0000\u0000\u0000st\u0001\u0000\u0000\u0000tv\u0001\u0000\u0000"+
		"\u0000us\u0001\u0000\u0000\u0000vw\u0006\u000b\u0000\u0000w\u0018\u0001"+
		"\u0000\u0000\u0000xz\u0005\r\u0000\u0000yx\u0001\u0000\u0000\u0000yz\u0001"+
		"\u0000\u0000\u0000z{\u0001\u0000\u0000\u0000{|\u0005\n\u0000\u0000|\u001a"+
		"\u0001\u0000\u0000\u0000}\u007f\u0007\u0003\u0000\u0000~}\u0001\u0000"+
		"\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000\u0080~\u0001\u0000\u0000"+
		"\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081\u0082\u0001\u0000\u0000"+
		"\u0000\u0082\u0083\u0006\r\u0000\u0000\u0083\u001c\u0001\u0000\u0000\u0000"+
		"\u0084\u0085\u0007\u0004\u0000\u0000\u0085\u001e\u0001\u0000\u0000\u0000"+
		"\u0006\u0000bhsy\u0080\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}