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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, TIPO_SALA=9, 
		DATE=10, TIME=11, ID=12, DESCRIPTION=13, COMMENT=14, NEWLINE=15, WS=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "TIPO_SALA", 
			"DATE", "TIME", "ID", "DESCRIPTION", "COMMENT", "NEWLINE", "WS", "DIGIT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'RESERVAR'", "'PARA'", "'DE'", "'A'", "'DESCRIPCION'", "'CANCELAR'", 
			"'REPROGRAMAR'", "'LISTAR'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "TIPO_SALA", "DATE", 
			"TIME", "ID", "DESCRIPTION", "COMMENT", "NEWLINE", "WS"
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
		"\u0004\u0000\u0010\u00b1\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0003\bx\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0004\u000b\u008c\b\u000b\u000b"+
		"\u000b\f\u000b\u008d\u0001\f\u0001\f\u0005\f\u0092\b\f\n\f\f\f\u0095\t"+
		"\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u009d\b\r\n"+
		"\r\f\r\u00a0\t\r\u0001\r\u0001\r\u0001\u000e\u0003\u000e\u00a5\b\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000f\u0004\u000f\u00aa\b\u000f\u000b\u000f"+
		"\f\u000f\u00ab\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0000\u0000"+
		"\u0011\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006"+
		"\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e"+
		"\u001d\u000f\u001f\u0010!\u0000\u0001\u0000\u0005\u0003\u000009AZaz\u0003"+
		"\u0000\n\n\r\r\"\"\u0002\u0000\n\n\r\r\u0002\u0000\t\t  \u0001\u00000"+
		"9\u00b6\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000"+
		"\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000"+
		"\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000"+
		"\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000"+
		"\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000"+
		"\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000"+
		"\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000"+
		"\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0001"+
		"#\u0001\u0000\u0000\u0000\u0003,\u0001\u0000\u0000\u0000\u00051\u0001"+
		"\u0000\u0000\u0000\u00074\u0001\u0000\u0000\u0000\t6\u0001\u0000\u0000"+
		"\u0000\u000bB\u0001\u0000\u0000\u0000\rK\u0001\u0000\u0000\u0000\u000f"+
		"W\u0001\u0000\u0000\u0000\u0011w\u0001\u0000\u0000\u0000\u0013y\u0001"+
		"\u0000\u0000\u0000\u0015\u0084\u0001\u0000\u0000\u0000\u0017\u008b\u0001"+
		"\u0000\u0000\u0000\u0019\u008f\u0001\u0000\u0000\u0000\u001b\u0098\u0001"+
		"\u0000\u0000\u0000\u001d\u00a4\u0001\u0000\u0000\u0000\u001f\u00a9\u0001"+
		"\u0000\u0000\u0000!\u00af\u0001\u0000\u0000\u0000#$\u0005R\u0000\u0000"+
		"$%\u0005E\u0000\u0000%&\u0005S\u0000\u0000&\'\u0005E\u0000\u0000\'(\u0005"+
		"R\u0000\u0000()\u0005V\u0000\u0000)*\u0005A\u0000\u0000*+\u0005R\u0000"+
		"\u0000+\u0002\u0001\u0000\u0000\u0000,-\u0005P\u0000\u0000-.\u0005A\u0000"+
		"\u0000./\u0005R\u0000\u0000/0\u0005A\u0000\u00000\u0004\u0001\u0000\u0000"+
		"\u000012\u0005D\u0000\u000023\u0005E\u0000\u00003\u0006\u0001\u0000\u0000"+
		"\u000045\u0005A\u0000\u00005\b\u0001\u0000\u0000\u000067\u0005D\u0000"+
		"\u000078\u0005E\u0000\u000089\u0005S\u0000\u00009:\u0005C\u0000\u0000"+
		":;\u0005R\u0000\u0000;<\u0005I\u0000\u0000<=\u0005P\u0000\u0000=>\u0005"+
		"C\u0000\u0000>?\u0005I\u0000\u0000?@\u0005O\u0000\u0000@A\u0005N\u0000"+
		"\u0000A\n\u0001\u0000\u0000\u0000BC\u0005C\u0000\u0000CD\u0005A\u0000"+
		"\u0000DE\u0005N\u0000\u0000EF\u0005C\u0000\u0000FG\u0005E\u0000\u0000"+
		"GH\u0005L\u0000\u0000HI\u0005A\u0000\u0000IJ\u0005R\u0000\u0000J\f\u0001"+
		"\u0000\u0000\u0000KL\u0005R\u0000\u0000LM\u0005E\u0000\u0000MN\u0005P"+
		"\u0000\u0000NO\u0005R\u0000\u0000OP\u0005O\u0000\u0000PQ\u0005G\u0000"+
		"\u0000QR\u0005R\u0000\u0000RS\u0005A\u0000\u0000ST\u0005M\u0000\u0000"+
		"TU\u0005A\u0000\u0000UV\u0005R\u0000\u0000V\u000e\u0001\u0000\u0000\u0000"+
		"WX\u0005L\u0000\u0000XY\u0005I\u0000\u0000YZ\u0005S\u0000\u0000Z[\u0005"+
		"T\u0000\u0000[\\\u0005A\u0000\u0000\\]\u0005R\u0000\u0000]\u0010\u0001"+
		"\u0000\u0000\u0000^_\u0005J\u0000\u0000_`\u0005U\u0000\u0000`a\u0005N"+
		"\u0000\u0000ab\u0005T\u0000\u0000bc\u0005A\u0000\u0000cx\u0005S\u0000"+
		"\u0000de\u0005C\u0000\u0000ef\u0005A\u0000\u0000fg\u0005P\u0000\u0000"+
		"gh\u0005A\u0000\u0000hi\u0005C\u0000\u0000ij\u0005I\u0000\u0000jk\u0005"+
		"T\u0000\u0000kl\u0005A\u0000\u0000lm\u0005C\u0000\u0000mn\u0005I\u0000"+
		"\u0000no\u0005O\u0000\u0000ox\u0005N\u0000\u0000pq\u0005R\u0000\u0000"+
		"qr\u0005E\u0000\u0000rs\u0005U\u0000\u0000st\u0005N\u0000\u0000tu\u0005"+
		"I\u0000\u0000uv\u0005O\u0000\u0000vx\u0005N\u0000\u0000w^\u0001\u0000"+
		"\u0000\u0000wd\u0001\u0000\u0000\u0000wp\u0001\u0000\u0000\u0000x\u0012"+
		"\u0001\u0000\u0000\u0000yz\u0003!\u0010\u0000z{\u0003!\u0010\u0000{|\u0005"+
		"/\u0000\u0000|}\u0003!\u0010\u0000}~\u0003!\u0010\u0000~\u007f\u0005/"+
		"\u0000\u0000\u007f\u0080\u0003!\u0010\u0000\u0080\u0081\u0003!\u0010\u0000"+
		"\u0081\u0082\u0003!\u0010\u0000\u0082\u0083\u0003!\u0010\u0000\u0083\u0014"+
		"\u0001\u0000\u0000\u0000\u0084\u0085\u0003!\u0010\u0000\u0085\u0086\u0003"+
		"!\u0010\u0000\u0086\u0087\u0005:\u0000\u0000\u0087\u0088\u0003!\u0010"+
		"\u0000\u0088\u0089\u0003!\u0010\u0000\u0089\u0016\u0001\u0000\u0000\u0000"+
		"\u008a\u008c\u0007\u0000\u0000\u0000\u008b\u008a\u0001\u0000\u0000\u0000"+
		"\u008c\u008d\u0001\u0000\u0000\u0000\u008d\u008b\u0001\u0000\u0000\u0000"+
		"\u008d\u008e\u0001\u0000\u0000\u0000\u008e\u0018\u0001\u0000\u0000\u0000"+
		"\u008f\u0093\u0005\"\u0000\u0000\u0090\u0092\b\u0001\u0000\u0000\u0091"+
		"\u0090\u0001\u0000\u0000\u0000\u0092\u0095\u0001\u0000\u0000\u0000\u0093"+
		"\u0091\u0001\u0000\u0000\u0000\u0093\u0094\u0001\u0000\u0000\u0000\u0094"+
		"\u0096\u0001\u0000\u0000\u0000\u0095\u0093\u0001\u0000\u0000\u0000\u0096"+
		"\u0097\u0005\"\u0000\u0000\u0097\u001a\u0001\u0000\u0000\u0000\u0098\u0099"+
		"\u0005/\u0000\u0000\u0099\u009a\u0005/\u0000\u0000\u009a\u009e\u0001\u0000"+
		"\u0000\u0000\u009b\u009d\b\u0002\u0000\u0000\u009c\u009b\u0001\u0000\u0000"+
		"\u0000\u009d\u00a0\u0001\u0000\u0000\u0000\u009e\u009c\u0001\u0000\u0000"+
		"\u0000\u009e\u009f\u0001\u0000\u0000\u0000\u009f\u00a1\u0001\u0000\u0000"+
		"\u0000\u00a0\u009e\u0001\u0000\u0000\u0000\u00a1\u00a2\u0006\r\u0000\u0000"+
		"\u00a2\u001c\u0001\u0000\u0000\u0000\u00a3\u00a5\u0005\r\u0000\u0000\u00a4"+
		"\u00a3\u0001\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a5"+
		"\u00a6\u0001\u0000\u0000\u0000\u00a6\u00a7\u0005\n\u0000\u0000\u00a7\u001e"+
		"\u0001\u0000\u0000\u0000\u00a8\u00aa\u0007\u0003\u0000\u0000\u00a9\u00a8"+
		"\u0001\u0000\u0000\u0000\u00aa\u00ab\u0001\u0000\u0000\u0000\u00ab\u00a9"+
		"\u0001\u0000\u0000\u0000\u00ab\u00ac\u0001\u0000\u0000\u0000\u00ac\u00ad"+
		"\u0001\u0000\u0000\u0000\u00ad\u00ae\u0006\u000f\u0000\u0000\u00ae \u0001"+
		"\u0000\u0000\u0000\u00af\u00b0\u0007\u0004\u0000\u0000\u00b0\"\u0001\u0000"+
		"\u0000\u0000\u0007\u0000w\u008d\u0093\u009e\u00a4\u00ab\u0001\u0006\u0000"+
		"\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}