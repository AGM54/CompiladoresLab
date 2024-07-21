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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, TIPO_SALA=8, DATE=9, 
		TIME=10, ID=11, DESCRIPTION=12, COMMENT=13, NEWLINE=14, WS=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "TIPO_SALA", 
			"DATE", "TIME", "ID", "DESCRIPTION", "COMMENT", "NEWLINE", "WS", "DIGIT"
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
			null, null, null, null, null, null, null, null, "TIPO_SALA", "DATE", 
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
		"\u0004\u0000\u000f\u00a3\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0003\u0007j\b\u0007\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0004\n~\b\n\u000b"+
		"\n\f\n\u007f\u0001\u000b\u0001\u000b\u0005\u000b\u0084\b\u000b\n\u000b"+
		"\f\u000b\u0087\t\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0005\f\u008f\b\f\n\f\f\f\u0092\t\f\u0001\f\u0001\f\u0001\r\u0003"+
		"\r\u0097\b\r\u0001\r\u0001\r\u0001\u000e\u0004\u000e\u009c\b\u000e\u000b"+
		"\u000e\f\u000e\u009d\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0000"+
		"\u0000\u0010\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b"+
		"\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b"+
		"\u000e\u001d\u000f\u001f\u0000\u0001\u0000\u0005\u0003\u000009AZaz\u0003"+
		"\u0000\n\n\r\r\"\"\u0002\u0000\n\n\r\r\u0002\u0000\t\t  \u0001\u00000"+
		"9\u00a8\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000"+
		"\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000"+
		"\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000"+
		"\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000"+
		"\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000"+
		"\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000"+
		"\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000"+
		"\u001d\u0001\u0000\u0000\u0000\u0001!\u0001\u0000\u0000\u0000\u0003*\u0001"+
		"\u0000\u0000\u0000\u0005/\u0001\u0000\u0000\u0000\u00072\u0001\u0000\u0000"+
		"\u0000\t4\u0001\u0000\u0000\u0000\u000b@\u0001\u0000\u0000\u0000\rI\u0001"+
		"\u0000\u0000\u0000\u000fi\u0001\u0000\u0000\u0000\u0011k\u0001\u0000\u0000"+
		"\u0000\u0013v\u0001\u0000\u0000\u0000\u0015}\u0001\u0000\u0000\u0000\u0017"+
		"\u0081\u0001\u0000\u0000\u0000\u0019\u008a\u0001\u0000\u0000\u0000\u001b"+
		"\u0096\u0001\u0000\u0000\u0000\u001d\u009b\u0001\u0000\u0000\u0000\u001f"+
		"\u00a1\u0001\u0000\u0000\u0000!\"\u0005R\u0000\u0000\"#\u0005E\u0000\u0000"+
		"#$\u0005S\u0000\u0000$%\u0005E\u0000\u0000%&\u0005R\u0000\u0000&\'\u0005"+
		"V\u0000\u0000\'(\u0005A\u0000\u0000()\u0005R\u0000\u0000)\u0002\u0001"+
		"\u0000\u0000\u0000*+\u0005P\u0000\u0000+,\u0005A\u0000\u0000,-\u0005R"+
		"\u0000\u0000-.\u0005A\u0000\u0000.\u0004\u0001\u0000\u0000\u0000/0\u0005"+
		"D\u0000\u000001\u0005E\u0000\u00001\u0006\u0001\u0000\u0000\u000023\u0005"+
		"A\u0000\u00003\b\u0001\u0000\u0000\u000045\u0005D\u0000\u000056\u0005"+
		"E\u0000\u000067\u0005S\u0000\u000078\u0005C\u0000\u000089\u0005R\u0000"+
		"\u00009:\u0005I\u0000\u0000:;\u0005P\u0000\u0000;<\u0005C\u0000\u0000"+
		"<=\u0005I\u0000\u0000=>\u0005O\u0000\u0000>?\u0005N\u0000\u0000?\n\u0001"+
		"\u0000\u0000\u0000@A\u0005C\u0000\u0000AB\u0005A\u0000\u0000BC\u0005N"+
		"\u0000\u0000CD\u0005C\u0000\u0000DE\u0005E\u0000\u0000EF\u0005L\u0000"+
		"\u0000FG\u0005A\u0000\u0000GH\u0005R\u0000\u0000H\f\u0001\u0000\u0000"+
		"\u0000IJ\u0005L\u0000\u0000JK\u0005I\u0000\u0000KL\u0005S\u0000\u0000"+
		"LM\u0005T\u0000\u0000MN\u0005A\u0000\u0000NO\u0005R\u0000\u0000O\u000e"+
		"\u0001\u0000\u0000\u0000PQ\u0005J\u0000\u0000QR\u0005U\u0000\u0000RS\u0005"+
		"N\u0000\u0000ST\u0005T\u0000\u0000TU\u0005A\u0000\u0000Uj\u0005S\u0000"+
		"\u0000VW\u0005C\u0000\u0000WX\u0005A\u0000\u0000XY\u0005P\u0000\u0000"+
		"YZ\u0005A\u0000\u0000Z[\u0005C\u0000\u0000[\\\u0005I\u0000\u0000\\]\u0005"+
		"T\u0000\u0000]^\u0005A\u0000\u0000^_\u0005C\u0000\u0000_`\u0005I\u0000"+
		"\u0000`a\u0005O\u0000\u0000aj\u0005N\u0000\u0000bc\u0005R\u0000\u0000"+
		"cd\u0005E\u0000\u0000de\u0005U\u0000\u0000ef\u0005N\u0000\u0000fg\u0005"+
		"I\u0000\u0000gh\u0005O\u0000\u0000hj\u0005N\u0000\u0000iP\u0001\u0000"+
		"\u0000\u0000iV\u0001\u0000\u0000\u0000ib\u0001\u0000\u0000\u0000j\u0010"+
		"\u0001\u0000\u0000\u0000kl\u0003\u001f\u000f\u0000lm\u0003\u001f\u000f"+
		"\u0000mn\u0005/\u0000\u0000no\u0003\u001f\u000f\u0000op\u0003\u001f\u000f"+
		"\u0000pq\u0005/\u0000\u0000qr\u0003\u001f\u000f\u0000rs\u0003\u001f\u000f"+
		"\u0000st\u0003\u001f\u000f\u0000tu\u0003\u001f\u000f\u0000u\u0012\u0001"+
		"\u0000\u0000\u0000vw\u0003\u001f\u000f\u0000wx\u0003\u001f\u000f\u0000"+
		"xy\u0005:\u0000\u0000yz\u0003\u001f\u000f\u0000z{\u0003\u001f\u000f\u0000"+
		"{\u0014\u0001\u0000\u0000\u0000|~\u0007\u0000\u0000\u0000}|\u0001\u0000"+
		"\u0000\u0000~\u007f\u0001\u0000\u0000\u0000\u007f}\u0001\u0000\u0000\u0000"+
		"\u007f\u0080\u0001\u0000\u0000\u0000\u0080\u0016\u0001\u0000\u0000\u0000"+
		"\u0081\u0085\u0005\"\u0000\u0000\u0082\u0084\b\u0001\u0000\u0000\u0083"+
		"\u0082\u0001\u0000\u0000\u0000\u0084\u0087\u0001\u0000\u0000\u0000\u0085"+
		"\u0083\u0001\u0000\u0000\u0000\u0085\u0086\u0001\u0000\u0000\u0000\u0086"+
		"\u0088\u0001\u0000\u0000\u0000\u0087\u0085\u0001\u0000\u0000\u0000\u0088"+
		"\u0089\u0005\"\u0000\u0000\u0089\u0018\u0001\u0000\u0000\u0000\u008a\u008b"+
		"\u0005/\u0000\u0000\u008b\u008c\u0005/\u0000\u0000\u008c\u0090\u0001\u0000"+
		"\u0000\u0000\u008d\u008f\b\u0002\u0000\u0000\u008e\u008d\u0001\u0000\u0000"+
		"\u0000\u008f\u0092\u0001\u0000\u0000\u0000\u0090\u008e\u0001\u0000\u0000"+
		"\u0000\u0090\u0091\u0001\u0000\u0000\u0000\u0091\u0093\u0001\u0000\u0000"+
		"\u0000\u0092\u0090\u0001\u0000\u0000\u0000\u0093\u0094\u0006\f\u0000\u0000"+
		"\u0094\u001a\u0001\u0000\u0000\u0000\u0095\u0097\u0005\r\u0000\u0000\u0096"+
		"\u0095\u0001\u0000\u0000\u0000\u0096\u0097\u0001\u0000\u0000\u0000\u0097"+
		"\u0098\u0001\u0000\u0000\u0000\u0098\u0099\u0005\n\u0000\u0000\u0099\u001c"+
		"\u0001\u0000\u0000\u0000\u009a\u009c\u0007\u0003\u0000\u0000\u009b\u009a"+
		"\u0001\u0000\u0000\u0000\u009c\u009d\u0001\u0000\u0000\u0000\u009d\u009b"+
		"\u0001\u0000\u0000\u0000\u009d\u009e\u0001\u0000\u0000\u0000\u009e\u009f"+
		"\u0001\u0000\u0000\u0000\u009f\u00a0\u0006\u000e\u0000\u0000\u00a0\u001e"+
		"\u0001\u0000\u0000\u0000\u00a1\u00a2\u0007\u0004\u0000\u0000\u00a2 \u0001"+
		"\u0000\u0000\u0000\u0007\u0000i\u007f\u0085\u0090\u0096\u009d\u0001\u0006"+
		"\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}