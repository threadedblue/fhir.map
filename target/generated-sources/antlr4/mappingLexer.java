// Generated from mapping.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class mappingLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, BOOL=40, DATETIME=41, TIME=42, IDENTIFIER=43, DELIMITEDIDENTIFIER=44, 
		STRING=45, INTEGER=46, NUMBER=47, WS=48, COMMENT=49, LINE_COMMENT=50;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
		"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
		"T__33", "T__34", "T__35", "T__36", "T__37", "T__38", "BOOL", "DATETIME", 
		"TIME", "TIMEFORMAT", "IDENTIFIER", "DELIMITEDIDENTIFIER", "STRING", "INTEGER", 
		"NUMBER", "WS", "COMMENT", "LINE_COMMENT", "ESC", "UNICODE", "HEX"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'map'", "'='", "'uses'", "'as'", "'alias'", "'imports'", "'group'", 
		"'{'", "'}'", "'<<'", "'>>'", "'extends_'", "'('", "','", "')'", "':'", 
		"'->'", "';'", "'..'", "'*'", "'.'", "'default'", "'where'", "'check'", 
		"'log'", "'then'", "'types'", "'type+'", "'first'", "'not_first'", "'last'", 
		"'not_last'", "'only_one'", "'share'", "'collate'", "'source'", "'target'", 
		"'queried'", "'produced'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "BOOL", "DATETIME", "TIME", "IDENTIFIER", "DELIMITEDIDENTIFIER", 
		"STRING", "INTEGER", "NUMBER", "WS", "COMMENT", "LINE_COMMENT"
	};
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


	public mappingLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "mapping.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\64\u01d9\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3"+
		"\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\f\3"+
		"\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3"+
		"\20\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\26\3"+
		"\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3"+
		"\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3"+
		"\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3"+
		"\37\3\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\""+
		"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3"+
		"%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3("+
		"\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)\3)\5)\u013f\n)\3*\3*\3*"+
		"\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\5*\u014e\n*\5*\u0150\n*\5*\u0152\n*\3*"+
		"\5*\u0155\n*\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\6,\u0165\n,\r,"+
		"\16,\u0166\5,\u0169\n,\5,\u016b\n,\5,\u016d\n,\3,\3,\3,\3,\3,\3,\3,\5"+
		",\u0176\n,\3-\5-\u0179\n-\3-\7-\u017c\n-\f-\16-\u017f\13-\3.\3.\3.\7."+
		"\u0184\n.\f.\16.\u0187\13.\3.\3.\3.\3.\7.\u018d\n.\f.\16.\u0190\13.\3"+
		".\5.\u0193\n.\3/\3/\3/\7/\u0198\n/\f/\16/\u019b\13/\3/\3/\3\60\6\60\u01a0"+
		"\n\60\r\60\16\60\u01a1\3\61\3\61\3\61\6\61\u01a7\n\61\r\61\16\61\u01a8"+
		"\5\61\u01ab\n\61\3\62\6\62\u01ae\n\62\r\62\16\62\u01af\3\62\3\62\3\63"+
		"\3\63\3\63\3\63\7\63\u01b8\n\63\f\63\16\63\u01bb\13\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\64\3\64\3\64\3\64\7\64\u01c6\n\64\f\64\16\64\u01c9\13\64"+
		"\3\64\3\64\3\65\3\65\3\65\5\65\u01d0\n\65\3\66\3\66\3\66\3\66\3\66\3\66"+
		"\3\67\3\67\6\u0185\u018e\u0199\u01b9\28\3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27"+
		"-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W"+
		"\2Y-[.]/_\60a\61c\62e\63g\64i\2k\2m\2\3\2\n\3\2\62;\4\2--//\5\2C\\aac"+
		"|\6\2\62;C\\aac|\5\2\13\f\17\17\"\"\4\2\f\f\17\17\n\2$$))\61\61^^hhpp"+
		"ttvv\5\2\62;CHch\2\u01ee\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2"+
		"\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2"+
		"Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3"+
		"\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\3o\3\2\2\2\5s\3\2\2"+
		"\2\7u\3\2\2\2\tz\3\2\2\2\13}\3\2\2\2\r\u0083\3\2\2\2\17\u008b\3\2\2\2"+
		"\21\u0091\3\2\2\2\23\u0093\3\2\2\2\25\u0095\3\2\2\2\27\u0098\3\2\2\2\31"+
		"\u009b\3\2\2\2\33\u00a4\3\2\2\2\35\u00a6\3\2\2\2\37\u00a8\3\2\2\2!\u00aa"+
		"\3\2\2\2#\u00ac\3\2\2\2%\u00af\3\2\2\2\'\u00b1\3\2\2\2)\u00b4\3\2\2\2"+
		"+\u00b6\3\2\2\2-\u00b8\3\2\2\2/\u00c0\3\2\2\2\61\u00c6\3\2\2\2\63\u00cc"+
		"\3\2\2\2\65\u00d0\3\2\2\2\67\u00d5\3\2\2\29\u00db\3\2\2\2;\u00e1\3\2\2"+
		"\2=\u00e7\3\2\2\2?\u00f1\3\2\2\2A\u00f6\3\2\2\2C\u00ff\3\2\2\2E\u0108"+
		"\3\2\2\2G\u010e\3\2\2\2I\u0116\3\2\2\2K\u011d\3\2\2\2M\u0124\3\2\2\2O"+
		"\u012c\3\2\2\2Q\u013e\3\2\2\2S\u0140\3\2\2\2U\u0156\3\2\2\2W\u015a\3\2"+
		"\2\2Y\u0178\3\2\2\2[\u0192\3\2\2\2]\u0194\3\2\2\2_\u019f\3\2\2\2a\u01a3"+
		"\3\2\2\2c\u01ad\3\2\2\2e\u01b3\3\2\2\2g\u01c1\3\2\2\2i\u01cc\3\2\2\2k"+
		"\u01d1\3\2\2\2m\u01d7\3\2\2\2op\7o\2\2pq\7c\2\2qr\7r\2\2r\4\3\2\2\2st"+
		"\7?\2\2t\6\3\2\2\2uv\7w\2\2vw\7u\2\2wx\7g\2\2xy\7u\2\2y\b\3\2\2\2z{\7"+
		"c\2\2{|\7u\2\2|\n\3\2\2\2}~\7c\2\2~\177\7n\2\2\177\u0080\7k\2\2\u0080"+
		"\u0081\7c\2\2\u0081\u0082\7u\2\2\u0082\f\3\2\2\2\u0083\u0084\7k\2\2\u0084"+
		"\u0085\7o\2\2\u0085\u0086\7r\2\2\u0086\u0087\7q\2\2\u0087\u0088\7t\2\2"+
		"\u0088\u0089\7v\2\2\u0089\u008a\7u\2\2\u008a\16\3\2\2\2\u008b\u008c\7"+
		"i\2\2\u008c\u008d\7t\2\2\u008d\u008e\7q\2\2\u008e\u008f\7w\2\2\u008f\u0090"+
		"\7r\2\2\u0090\20\3\2\2\2\u0091\u0092\7}\2\2\u0092\22\3\2\2\2\u0093\u0094"+
		"\7\177\2\2\u0094\24\3\2\2\2\u0095\u0096\7>\2\2\u0096\u0097\7>\2\2\u0097"+
		"\26\3\2\2\2\u0098\u0099\7@\2\2\u0099\u009a\7@\2\2\u009a\30\3\2\2\2\u009b"+
		"\u009c\7g\2\2\u009c\u009d\7z\2\2\u009d\u009e\7v\2\2\u009e\u009f\7g\2\2"+
		"\u009f\u00a0\7p\2\2\u00a0\u00a1\7f\2\2\u00a1\u00a2\7u\2\2\u00a2\u00a3"+
		"\7a\2\2\u00a3\32\3\2\2\2\u00a4\u00a5\7*\2\2\u00a5\34\3\2\2\2\u00a6\u00a7"+
		"\7.\2\2\u00a7\36\3\2\2\2\u00a8\u00a9\7+\2\2\u00a9 \3\2\2\2\u00aa\u00ab"+
		"\7<\2\2\u00ab\"\3\2\2\2\u00ac\u00ad\7/\2\2\u00ad\u00ae\7@\2\2\u00ae$\3"+
		"\2\2\2\u00af\u00b0\7=\2\2\u00b0&\3\2\2\2\u00b1\u00b2\7\60\2\2\u00b2\u00b3"+
		"\7\60\2\2\u00b3(\3\2\2\2\u00b4\u00b5\7,\2\2\u00b5*\3\2\2\2\u00b6\u00b7"+
		"\7\60\2\2\u00b7,\3\2\2\2\u00b8\u00b9\7f\2\2\u00b9\u00ba\7g\2\2\u00ba\u00bb"+
		"\7h\2\2\u00bb\u00bc\7c\2\2\u00bc\u00bd\7w\2\2\u00bd\u00be\7n\2\2\u00be"+
		"\u00bf\7v\2\2\u00bf.\3\2\2\2\u00c0\u00c1\7y\2\2\u00c1\u00c2\7j\2\2\u00c2"+
		"\u00c3\7g\2\2\u00c3\u00c4\7t\2\2\u00c4\u00c5\7g\2\2\u00c5\60\3\2\2\2\u00c6"+
		"\u00c7\7e\2\2\u00c7\u00c8\7j\2\2\u00c8\u00c9\7g\2\2\u00c9\u00ca\7e\2\2"+
		"\u00ca\u00cb\7m\2\2\u00cb\62\3\2\2\2\u00cc\u00cd\7n\2\2\u00cd\u00ce\7"+
		"q\2\2\u00ce\u00cf\7i\2\2\u00cf\64\3\2\2\2\u00d0\u00d1\7v\2\2\u00d1\u00d2"+
		"\7j\2\2\u00d2\u00d3\7g\2\2\u00d3\u00d4\7p\2\2\u00d4\66\3\2\2\2\u00d5\u00d6"+
		"\7v\2\2\u00d6\u00d7\7{\2\2\u00d7\u00d8\7r\2\2\u00d8\u00d9\7g\2\2\u00d9"+
		"\u00da\7u\2\2\u00da8\3\2\2\2\u00db\u00dc\7v\2\2\u00dc\u00dd\7{\2\2\u00dd"+
		"\u00de\7r\2\2\u00de\u00df\7g\2\2\u00df\u00e0\7-\2\2\u00e0:\3\2\2\2\u00e1"+
		"\u00e2\7h\2\2\u00e2\u00e3\7k\2\2\u00e3\u00e4\7t\2\2\u00e4\u00e5\7u\2\2"+
		"\u00e5\u00e6\7v\2\2\u00e6<\3\2\2\2\u00e7\u00e8\7p\2\2\u00e8\u00e9\7q\2"+
		"\2\u00e9\u00ea\7v\2\2\u00ea\u00eb\7a\2\2\u00eb\u00ec\7h\2\2\u00ec\u00ed"+
		"\7k\2\2\u00ed\u00ee\7t\2\2\u00ee\u00ef\7u\2\2\u00ef\u00f0\7v\2\2\u00f0"+
		">\3\2\2\2\u00f1\u00f2\7n\2\2\u00f2\u00f3\7c\2\2\u00f3\u00f4\7u\2\2\u00f4"+
		"\u00f5\7v\2\2\u00f5@\3\2\2\2\u00f6\u00f7\7p\2\2\u00f7\u00f8\7q\2\2\u00f8"+
		"\u00f9\7v\2\2\u00f9\u00fa\7a\2\2\u00fa\u00fb\7n\2\2\u00fb\u00fc\7c\2\2"+
		"\u00fc\u00fd\7u\2\2\u00fd\u00fe\7v\2\2\u00feB\3\2\2\2\u00ff\u0100\7q\2"+
		"\2\u0100\u0101\7p\2\2\u0101\u0102\7n\2\2\u0102\u0103\7{\2\2\u0103\u0104"+
		"\7a\2\2\u0104\u0105\7q\2\2\u0105\u0106\7p\2\2\u0106\u0107\7g\2\2\u0107"+
		"D\3\2\2\2\u0108\u0109\7u\2\2\u0109\u010a\7j\2\2\u010a\u010b\7c\2\2\u010b"+
		"\u010c\7t\2\2\u010c\u010d\7g\2\2\u010dF\3\2\2\2\u010e\u010f\7e\2\2\u010f"+
		"\u0110\7q\2\2\u0110\u0111\7n\2\2\u0111\u0112\7n\2\2\u0112\u0113\7c\2\2"+
		"\u0113\u0114\7v\2\2\u0114\u0115\7g\2\2\u0115H\3\2\2\2\u0116\u0117\7u\2"+
		"\2\u0117\u0118\7q\2\2\u0118\u0119\7w\2\2\u0119\u011a\7t\2\2\u011a\u011b"+
		"\7e\2\2\u011b\u011c\7g\2\2\u011cJ\3\2\2\2\u011d\u011e\7v\2\2\u011e\u011f"+
		"\7c\2\2\u011f\u0120\7t\2\2\u0120\u0121\7i\2\2\u0121\u0122\7g\2\2\u0122"+
		"\u0123\7v\2\2\u0123L\3\2\2\2\u0124\u0125\7s\2\2\u0125\u0126\7w\2\2\u0126"+
		"\u0127\7g\2\2\u0127\u0128\7t\2\2\u0128\u0129\7k\2\2\u0129\u012a\7g\2\2"+
		"\u012a\u012b\7f\2\2\u012bN\3\2\2\2\u012c\u012d\7r\2\2\u012d\u012e\7t\2"+
		"\2\u012e\u012f\7q\2\2\u012f\u0130\7f\2\2\u0130\u0131\7w\2\2\u0131\u0132"+
		"\7e\2\2\u0132\u0133\7g\2\2\u0133\u0134\7f\2\2\u0134P\3\2\2\2\u0135\u0136"+
		"\7v\2\2\u0136\u0137\7t\2\2\u0137\u0138\7w\2\2\u0138\u013f\7g\2\2\u0139"+
		"\u013a\7h\2\2\u013a\u013b\7c\2\2\u013b\u013c\7n\2\2\u013c\u013d\7u\2\2"+
		"\u013d\u013f\7g\2\2\u013e\u0135\3\2\2\2\u013e\u0139\3\2\2\2\u013fR\3\2"+
		"\2\2\u0140\u0141\7B\2\2\u0141\u0142\t\2\2\2\u0142\u0143\t\2\2\2\u0143"+
		"\u0144\t\2\2\2\u0144\u0151\t\2\2\2\u0145\u0146\7/\2\2\u0146\u0147\t\2"+
		"\2\2\u0147\u014f\t\2\2\2\u0148\u0149\7/\2\2\u0149\u014a\t\2\2\2\u014a"+
		"\u014d\t\2\2\2\u014b\u014c\7V\2\2\u014c\u014e\5W,\2\u014d\u014b\3\2\2"+
		"\2\u014d\u014e\3\2\2\2\u014e\u0150\3\2\2\2\u014f\u0148\3\2\2\2\u014f\u0150"+
		"\3\2\2\2\u0150\u0152\3\2\2\2\u0151\u0145\3\2\2\2\u0151\u0152\3\2\2\2\u0152"+
		"\u0154\3\2\2\2\u0153\u0155\7\\\2\2\u0154\u0153\3\2\2\2\u0154\u0155\3\2"+
		"\2\2\u0155T\3\2\2\2\u0156\u0157\7B\2\2\u0157\u0158\7V\2\2\u0158\u0159"+
		"\5W,\2\u0159V\3\2\2\2\u015a\u015b\t\2\2\2\u015b\u016c\t\2\2\2\u015c\u015d"+
		"\7<\2\2\u015d\u015e\t\2\2\2\u015e\u016a\t\2\2\2\u015f\u0160\7<\2\2\u0160"+
		"\u0161\t\2\2\2\u0161\u0168\t\2\2\2\u0162\u0164\7\60\2\2\u0163\u0165\t"+
		"\2\2\2\u0164\u0163\3\2\2\2\u0165\u0166\3\2\2\2\u0166\u0164\3\2\2\2\u0166"+
		"\u0167\3\2\2\2\u0167\u0169\3\2\2\2\u0168\u0162\3\2\2\2\u0168\u0169\3\2"+
		"\2\2\u0169\u016b\3\2\2\2\u016a\u015f\3\2\2\2\u016a\u016b\3\2\2\2\u016b"+
		"\u016d\3\2\2\2\u016c\u015c\3\2\2\2\u016c\u016d\3\2\2\2\u016d\u0175\3\2"+
		"\2\2\u016e\u0176\7\\\2\2\u016f\u0170\t\3\2\2\u0170\u0171\t\2\2\2\u0171"+
		"\u0172\t\2\2\2\u0172\u0173\7<\2\2\u0173\u0174\t\2\2\2\u0174\u0176\t\2"+
		"\2\2\u0175\u016e\3\2\2\2\u0175\u016f\3\2\2\2\u0175\u0176\3\2\2\2\u0176"+
		"X\3\2\2\2\u0177\u0179\t\4\2\2\u0178\u0177\3\2\2\2\u0179\u017d\3\2\2\2"+
		"\u017a\u017c\t\5\2\2\u017b\u017a\3\2\2\2\u017c\u017f\3\2\2\2\u017d\u017b"+
		"\3\2\2\2\u017d\u017e\3\2\2\2\u017eZ\3\2\2\2\u017f\u017d\3\2\2\2\u0180"+
		"\u0185\7$\2\2\u0181\u0184\5i\65\2\u0182\u0184\13\2\2\2\u0183\u0181\3\2"+
		"\2\2\u0183\u0182\3\2\2\2\u0184\u0187\3\2\2\2\u0185\u0186\3\2\2\2\u0185"+
		"\u0183\3\2\2\2\u0186\u0188\3\2\2\2\u0187\u0185\3\2\2\2\u0188\u0193\7$"+
		"\2\2\u0189\u018e\7b\2\2\u018a\u018d\5i\65\2\u018b\u018d\13\2\2\2\u018c"+
		"\u018a\3\2\2\2\u018c\u018b\3\2\2\2\u018d\u0190\3\2\2\2\u018e\u018f\3\2"+
		"\2\2\u018e\u018c\3\2\2\2\u018f\u0191\3\2\2\2\u0190\u018e\3\2\2\2\u0191"+
		"\u0193\7b\2\2\u0192\u0180\3\2\2\2\u0192\u0189\3\2\2\2\u0193\\\3\2\2\2"+
		"\u0194\u0199\7)\2\2\u0195\u0198\5i\65\2\u0196\u0198\13\2\2\2\u0197\u0195"+
		"\3\2\2\2\u0197\u0196\3\2\2\2\u0198\u019b\3\2\2\2\u0199\u019a\3\2\2\2\u0199"+
		"\u0197\3\2\2\2\u019a\u019c\3\2\2\2\u019b\u0199\3\2\2\2\u019c\u019d\7)"+
		"\2\2\u019d^\3\2\2\2\u019e\u01a0\t\2\2\2\u019f\u019e\3\2\2\2\u01a0\u01a1"+
		"\3\2\2\2\u01a1\u019f\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2`\3\2\2\2\u01a3"+
		"\u01aa\5_\60\2\u01a4\u01a6\7\60\2\2\u01a5\u01a7\t\2\2\2\u01a6\u01a5\3"+
		"\2\2\2\u01a7\u01a8\3\2\2\2\u01a8\u01a6\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9"+
		"\u01ab\3\2\2\2\u01aa\u01a4\3\2\2\2\u01aa\u01ab\3\2\2\2\u01abb\3\2\2\2"+
		"\u01ac\u01ae\t\6\2\2\u01ad\u01ac\3\2\2\2\u01ae\u01af\3\2\2\2\u01af\u01ad"+
		"\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1\u01b2\b\62\2\2"+
		"\u01b2d\3\2\2\2\u01b3\u01b4\7\61\2\2\u01b4\u01b5\7,\2\2\u01b5\u01b9\3"+
		"\2\2\2\u01b6\u01b8\13\2\2\2\u01b7\u01b6\3\2\2\2\u01b8\u01bb\3\2\2\2\u01b9"+
		"\u01ba\3\2\2\2\u01b9\u01b7\3\2\2\2\u01ba\u01bc\3\2\2\2\u01bb\u01b9\3\2"+
		"\2\2\u01bc\u01bd\7,\2\2\u01bd\u01be\7\61\2\2\u01be\u01bf\3\2\2\2\u01bf"+
		"\u01c0\b\63\2\2\u01c0f\3\2\2\2\u01c1\u01c2\7\61\2\2\u01c2\u01c3\7\61\2"+
		"\2\u01c3\u01c7\3\2\2\2\u01c4\u01c6\n\7\2\2\u01c5\u01c4\3\2\2\2\u01c6\u01c9"+
		"\3\2\2\2\u01c7\u01c5\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8\u01ca\3\2\2\2\u01c9"+
		"\u01c7\3\2\2\2\u01ca\u01cb\b\64\2\2\u01cbh\3\2\2\2\u01cc\u01cf\7^\2\2"+
		"\u01cd\u01d0\t\b\2\2\u01ce\u01d0\5k\66\2\u01cf\u01cd\3\2\2\2\u01cf\u01ce"+
		"\3\2\2\2\u01d0j\3\2\2\2\u01d1\u01d2\7w\2\2\u01d2\u01d3\5m\67\2\u01d3\u01d4"+
		"\5m\67\2\u01d4\u01d5\5m\67\2\u01d5\u01d6\5m\67\2\u01d6l\3\2\2\2\u01d7"+
		"\u01d8\t\t\2\2\u01d8n\3\2\2\2\36\2\u013e\u014d\u014f\u0151\u0154\u0166"+
		"\u0168\u016a\u016c\u0175\u0178\u017b\u017d\u0183\u0185\u018c\u018e\u0192"+
		"\u0197\u0199\u01a1\u01a8\u01aa\u01af\u01b9\u01c7\u01cf\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}