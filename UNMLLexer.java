// Generated from UNML.g4 by ANTLR 4.7
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class UNMLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMMENT=1, SEMICOLON=2, ASSING=3, ALLOCATE=4, LF_PAREN=5, RG_PAREN=6, 
		LF_BRACE=7, RG_BRACE=8, LF_SPARE=9, RG_SPARE=10, SEPARATOR=11, COMMA=12, 
		TWO_POINTS=13, DELIMITER_BEGIN=14, DELIMITER_END=15, MODEL=16, ENDMODEL=17, 
		UNION=18, BY=19, CROSS=20, IN=21, WITHIN=22, DIFF=23, INTER=24, SYMDIFF=25, 
		SET=26, VECTOR=27, MATRIX=28, SIMPLEX=29, MINIMIZE=30, MAXIMIZE=31, CONSTRAIN=32, 
		SOLVE=33, VARIBLE=34, PARAMETER=35, INT=36, DOUBLE=37, STRING=38, BOOL=39, 
		NULL=40, IF=41, ELSE=42, THEN=43, WHILE=44, BREAK=45, DO=46, FOR=47, SELECT=48, 
		CASE=49, EQUAL=50, DIFFERENT=51, GREATER=52, MINOR=53, GREATER_THAN=54, 
		MINOR_THAN=55, AND=56, OR=57, NOT=58, TRUE=59, FALSE=60, ADD=61, MINUS=62, 
		MULT=63, DIV=64, MOD=65, EXP=66, ABS=67, ATAN=68, CARD=69, CEIL=70, COS=71, 
		EXP_FUN=72, FLOOR=73, LENGTH=74, LOG=75, LOGTEN=76, ROUND=77, SIN=78, 
		SQRT=79, TAN=80, TRUNCT=81, UNIFORM=82, NORMAL=83, SUBSTR=84, VAR_ID=85, 
		ID=86, INTEGER=87, REAL=88, WORD=89, WS=90, OTHER=91;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"COMMENT", "SEMICOLON", "ASSING", "ALLOCATE", "LF_PAREN", "RG_PAREN", 
		"LF_BRACE", "RG_BRACE", "LF_SPARE", "RG_SPARE", "SEPARATOR", "COMMA", 
		"TWO_POINTS", "DELIMITER_BEGIN", "DELIMITER_END", "MODEL", "ENDMODEL", 
		"UNION", "BY", "CROSS", "IN", "WITHIN", "DIFF", "INTER", "SYMDIFF", "SET", 
		"VECTOR", "MATRIX", "SIMPLEX", "MINIMIZE", "MAXIMIZE", "CONSTRAIN", "SOLVE", 
		"VARIBLE", "PARAMETER", "INT", "DOUBLE", "STRING", "BOOL", "NULL", "IF", 
		"ELSE", "THEN", "WHILE", "BREAK", "DO", "FOR", "SELECT", "CASE", "EQUAL", 
		"DIFFERENT", "GREATER", "MINOR", "GREATER_THAN", "MINOR_THAN", "AND", 
		"OR", "NOT", "TRUE", "FALSE", "ADD", "MINUS", "MULT", "DIV", "MOD", "EXP", 
		"ABS", "ATAN", "CARD", "CEIL", "COS", "EXP_FUN", "FLOOR", "LENGTH", "LOG", 
		"LOGTEN", "ROUND", "SIN", "SQRT", "TAN", "TRUNCT", "UNIFORM", "NORMAL", 
		"SUBSTR", "VAR_ID", "ID", "INTEGER", "REAL", "WORD", "WS", "OTHER"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "';'", "'='", "':='", "'('", "')'", "'{'", "'}'", "'['", "']'", 
		"'X~'", "','", "':'", "'begin'", "'end'", "'MODEL'", "'ENDMODEL'", "'union'", 
		"'by'", "'cross'", "'in'", "'within'", "'diff'", "'inter'", "'symdiff'", 
		"'set'", "'vector'", "'matrix'", "'simplex'", "'minimize'", "'maximize'", 
		"'constrain'", "'solve'", "'var'", "'param'", "'int'", "'double'", "'string'", 
		"'boolean'", "'null'", "'if'", "'else'", "'then'", "'while'", "'break'", 
		"'do'", "'for'", "'select'", "'case'", "'=='", null, "'>'", "'<'", "'>='", 
		"'<='", null, null, null, "'true'", "'false'", "'+'", "'-'", "'*'", "'/'", 
		"'%'", null, "'abs'", "'atan'", "'card'", "'ceil'", "'cos'", "'exp'", 
		"'floor'", "'length'", "'log'", "'log10'", "'round'", "'sin'", "'sqrt'", 
		"'tan'", "'trunc'", "'uniform'", "'normal'", "'substr'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "COMMENT", "SEMICOLON", "ASSING", "ALLOCATE", "LF_PAREN", "RG_PAREN", 
		"LF_BRACE", "RG_BRACE", "LF_SPARE", "RG_SPARE", "SEPARATOR", "COMMA", 
		"TWO_POINTS", "DELIMITER_BEGIN", "DELIMITER_END", "MODEL", "ENDMODEL", 
		"UNION", "BY", "CROSS", "IN", "WITHIN", "DIFF", "INTER", "SYMDIFF", "SET", 
		"VECTOR", "MATRIX", "SIMPLEX", "MINIMIZE", "MAXIMIZE", "CONSTRAIN", "SOLVE", 
		"VARIBLE", "PARAMETER", "INT", "DOUBLE", "STRING", "BOOL", "NULL", "IF", 
		"ELSE", "THEN", "WHILE", "BREAK", "DO", "FOR", "SELECT", "CASE", "EQUAL", 
		"DIFFERENT", "GREATER", "MINOR", "GREATER_THAN", "MINOR_THAN", "AND", 
		"OR", "NOT", "TRUE", "FALSE", "ADD", "MINUS", "MULT", "DIV", "MOD", "EXP", 
		"ABS", "ATAN", "CARD", "CEIL", "COS", "EXP_FUN", "FLOOR", "LENGTH", "LOG", 
		"LOGTEN", "ROUND", "SIN", "SQRT", "TAN", "TRUNCT", "UNIFORM", "NORMAL", 
		"SUBSTR", "VAR_ID", "ID", "INTEGER", "REAL", "WORD", "WS", "OTHER"
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


	public UNMLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "UNML.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2]\u0291\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\3\2\3\2\7\2\u00bc\n"+
		"\2\f\2\16\2\u00bf\13\2\3\2\3\2\3\2\3\2\7\2\u00c5\n\2\f\2\16\2\u00c8\13"+
		"\2\3\2\3\2\5\2\u00cc\n\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3"+
		"\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26"+
		"\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33"+
		"\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!"+
		"\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3$\3$\3$\3$\3$"+
		"\3$\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3"+
		"(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3*\3*\3*\3+\3+\3+\3+\3+\3,\3,\3,\3"+
		",\3,\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3/\3/\3/\3\60\3\60\3\60\3\60"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\63\3\63"+
		"\3\63\3\64\3\64\3\64\3\64\5\64\u01c7\n\64\3\65\3\65\3\66\3\66\3\67\3\67"+
		"\3\67\38\38\38\39\39\39\39\39\59\u01d8\n9\3:\3:\3:\3:\5:\u01de\n:\3;\3"+
		";\3;\3;\5;\u01e4\n;\3<\3<\3<\3<\3<\3=\3=\3=\3=\3=\3=\3>\3>\3?\3?\3@\3"+
		"@\3A\3A\3B\3B\3C\3C\3C\5C\u01fe\nC\3D\3D\3D\3D\3E\3E\3E\3E\3E\3F\3F\3"+
		"F\3F\3F\3G\3G\3G\3G\3G\3H\3H\3H\3H\3I\3I\3I\3I\3J\3J\3J\3J\3J\3J\3K\3"+
		"K\3K\3K\3K\3K\3K\3L\3L\3L\3L\3M\3M\3M\3M\3M\3M\3N\3N\3N\3N\3N\3N\3O\3"+
		"O\3O\3O\3P\3P\3P\3P\3P\3Q\3Q\3Q\3Q\3R\3R\3R\3R\3R\3R\3S\3S\3S\3S\3S\3"+
		"S\3S\3S\3T\3T\3T\3T\3T\3T\3T\3U\3U\3U\3U\3U\3U\3U\3V\3V\7V\u0263\nV\f"+
		"V\16V\u0266\13V\3W\3W\7W\u026a\nW\fW\16W\u026d\13W\3X\6X\u0270\nX\rX\16"+
		"X\u0271\3Y\7Y\u0275\nY\fY\16Y\u0278\13Y\3Y\3Y\7Y\u027c\nY\fY\16Y\u027f"+
		"\13Y\3Z\3Z\3Z\3Z\7Z\u0285\nZ\fZ\16Z\u0288\13Z\3Z\3Z\3[\3[\3[\3[\3\\\3"+
		"\\\3\u00c6\2]\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34"+
		"\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g"+
		"\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089F"+
		"\u008bG\u008dH\u008fI\u0091J\u0093K\u0095L\u0097M\u0099N\u009bO\u009d"+
		"P\u009fQ\u00a1R\u00a3S\u00a5T\u00a7U\u00a9V\u00abW\u00adX\u00afY\u00b1"+
		"Z\u00b3[\u00b5\\\u00b7]\3\2\t\4\2\f\f\17\17\4\2C\\aa\6\2\62;C\\aac|\4"+
		"\2aac|\3\2\62;\5\2\f\f\17\17$$\5\2\13\f\17\17\"\"\2\u029f\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2"+
		"\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2"+
		"\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2"+
		"\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W"+
		"\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2"+
		"\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2"+
		"\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}"+
		"\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2"+
		"\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f"+
		"\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2"+
		"\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2\2\2\u00a1"+
		"\3\2\2\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9\3\2\2"+
		"\2\2\u00ab\3\2\2\2\2\u00ad\3\2\2\2\2\u00af\3\2\2\2\2\u00b1\3\2\2\2\2\u00b3"+
		"\3\2\2\2\2\u00b5\3\2\2\2\2\u00b7\3\2\2\2\3\u00cb\3\2\2\2\5\u00cf\3\2\2"+
		"\2\7\u00d1\3\2\2\2\t\u00d3\3\2\2\2\13\u00d6\3\2\2\2\r\u00d8\3\2\2\2\17"+
		"\u00da\3\2\2\2\21\u00dc\3\2\2\2\23\u00de\3\2\2\2\25\u00e0\3\2\2\2\27\u00e2"+
		"\3\2\2\2\31\u00e5\3\2\2\2\33\u00e7\3\2\2\2\35\u00e9\3\2\2\2\37\u00ef\3"+
		"\2\2\2!\u00f3\3\2\2\2#\u00f9\3\2\2\2%\u0102\3\2\2\2\'\u0108\3\2\2\2)\u010b"+
		"\3\2\2\2+\u0111\3\2\2\2-\u0114\3\2\2\2/\u011b\3\2\2\2\61\u0120\3\2\2\2"+
		"\63\u0126\3\2\2\2\65\u012e\3\2\2\2\67\u0132\3\2\2\29\u0139\3\2\2\2;\u0140"+
		"\3\2\2\2=\u0148\3\2\2\2?\u0151\3\2\2\2A\u015a\3\2\2\2C\u0164\3\2\2\2E"+
		"\u016a\3\2\2\2G\u016e\3\2\2\2I\u0174\3\2\2\2K\u0178\3\2\2\2M\u017f\3\2"+
		"\2\2O\u0186\3\2\2\2Q\u018e\3\2\2\2S\u0193\3\2\2\2U\u0196\3\2\2\2W\u019b"+
		"\3\2\2\2Y\u01a0\3\2\2\2[\u01a6\3\2\2\2]\u01ac\3\2\2\2_\u01af\3\2\2\2a"+
		"\u01b3\3\2\2\2c\u01ba\3\2\2\2e\u01bf\3\2\2\2g\u01c6\3\2\2\2i\u01c8\3\2"+
		"\2\2k\u01ca\3\2\2\2m\u01cc\3\2\2\2o\u01cf\3\2\2\2q\u01d7\3\2\2\2s\u01dd"+
		"\3\2\2\2u\u01e3\3\2\2\2w\u01e5\3\2\2\2y\u01ea\3\2\2\2{\u01f0\3\2\2\2}"+
		"\u01f2\3\2\2\2\177\u01f4\3\2\2\2\u0081\u01f6\3\2\2\2\u0083\u01f8\3\2\2"+
		"\2\u0085\u01fd\3\2\2\2\u0087\u01ff\3\2\2\2\u0089\u0203\3\2\2\2\u008b\u0208"+
		"\3\2\2\2\u008d\u020d\3\2\2\2\u008f\u0212\3\2\2\2\u0091\u0216\3\2\2\2\u0093"+
		"\u021a\3\2\2\2\u0095\u0220\3\2\2\2\u0097\u0227\3\2\2\2\u0099\u022b\3\2"+
		"\2\2\u009b\u0231\3\2\2\2\u009d\u0237\3\2\2\2\u009f\u023b\3\2\2\2\u00a1"+
		"\u0240\3\2\2\2\u00a3\u0244\3\2\2\2\u00a5\u024a\3\2\2\2\u00a7\u0252\3\2"+
		"\2\2\u00a9\u0259\3\2\2\2\u00ab\u0260\3\2\2\2\u00ad\u0267\3\2\2\2\u00af"+
		"\u026f\3\2\2\2\u00b1\u0276\3\2\2\2\u00b3\u0280\3\2\2\2\u00b5\u028b\3\2"+
		"\2\2\u00b7\u028f\3\2\2\2\u00b9\u00bd\7%\2\2\u00ba\u00bc\n\2\2\2\u00bb"+
		"\u00ba\3\2\2\2\u00bc\u00bf\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2"+
		"\2\2\u00be\u00cc\3\2\2\2\u00bf\u00bd\3\2\2\2\u00c0\u00c1\7\61\2\2\u00c1"+
		"\u00c2\7,\2\2\u00c2\u00c6\3\2\2\2\u00c3\u00c5\13\2\2\2\u00c4\u00c3\3\2"+
		"\2\2\u00c5\u00c8\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c7"+
		"\u00c9\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c9\u00ca\7,\2\2\u00ca\u00cc\7\61"+
		"\2\2\u00cb\u00b9\3\2\2\2\u00cb\u00c0\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd"+
		"\u00ce\b\2\2\2\u00ce\4\3\2\2\2\u00cf\u00d0\7=\2\2\u00d0\6\3\2\2\2\u00d1"+
		"\u00d2\7?\2\2\u00d2\b\3\2\2\2\u00d3\u00d4\7<\2\2\u00d4\u00d5\7?\2\2\u00d5"+
		"\n\3\2\2\2\u00d6\u00d7\7*\2\2\u00d7\f\3\2\2\2\u00d8\u00d9\7+\2\2\u00d9"+
		"\16\3\2\2\2\u00da\u00db\7}\2\2\u00db\20\3\2\2\2\u00dc\u00dd\7\177\2\2"+
		"\u00dd\22\3\2\2\2\u00de\u00df\7]\2\2\u00df\24\3\2\2\2\u00e0\u00e1\7_\2"+
		"\2\u00e1\26\3\2\2\2\u00e2\u00e3\7Z\2\2\u00e3\u00e4\7\u0080\2\2\u00e4\30"+
		"\3\2\2\2\u00e5\u00e6\7.\2\2\u00e6\32\3\2\2\2\u00e7\u00e8\7<\2\2\u00e8"+
		"\34\3\2\2\2\u00e9\u00ea\7d\2\2\u00ea\u00eb\7g\2\2\u00eb\u00ec\7i\2\2\u00ec"+
		"\u00ed\7k\2\2\u00ed\u00ee\7p\2\2\u00ee\36\3\2\2\2\u00ef\u00f0\7g\2\2\u00f0"+
		"\u00f1\7p\2\2\u00f1\u00f2\7f\2\2\u00f2 \3\2\2\2\u00f3\u00f4\7O\2\2\u00f4"+
		"\u00f5\7Q\2\2\u00f5\u00f6\7F\2\2\u00f6\u00f7\7G\2\2\u00f7\u00f8\7N\2\2"+
		"\u00f8\"\3\2\2\2\u00f9\u00fa\7G\2\2\u00fa\u00fb\7P\2\2\u00fb\u00fc\7F"+
		"\2\2\u00fc\u00fd\7O\2\2\u00fd\u00fe\7Q\2\2\u00fe\u00ff\7F\2\2\u00ff\u0100"+
		"\7G\2\2\u0100\u0101\7N\2\2\u0101$\3\2\2\2\u0102\u0103\7w\2\2\u0103\u0104"+
		"\7p\2\2\u0104\u0105\7k\2\2\u0105\u0106\7q\2\2\u0106\u0107\7p\2\2\u0107"+
		"&\3\2\2\2\u0108\u0109\7d\2\2\u0109\u010a\7{\2\2\u010a(\3\2\2\2\u010b\u010c"+
		"\7e\2\2\u010c\u010d\7t\2\2\u010d\u010e\7q\2\2\u010e\u010f\7u\2\2\u010f"+
		"\u0110\7u\2\2\u0110*\3\2\2\2\u0111\u0112\7k\2\2\u0112\u0113\7p\2\2\u0113"+
		",\3\2\2\2\u0114\u0115\7y\2\2\u0115\u0116\7k\2\2\u0116\u0117\7v\2\2\u0117"+
		"\u0118\7j\2\2\u0118\u0119\7k\2\2\u0119\u011a\7p\2\2\u011a.\3\2\2\2\u011b"+
		"\u011c\7f\2\2\u011c\u011d\7k\2\2\u011d\u011e\7h\2\2\u011e\u011f\7h\2\2"+
		"\u011f\60\3\2\2\2\u0120\u0121\7k\2\2\u0121\u0122\7p\2\2\u0122\u0123\7"+
		"v\2\2\u0123\u0124\7g\2\2\u0124\u0125\7t\2\2\u0125\62\3\2\2\2\u0126\u0127"+
		"\7u\2\2\u0127\u0128\7{\2\2\u0128\u0129\7o\2\2\u0129\u012a\7f\2\2\u012a"+
		"\u012b\7k\2\2\u012b\u012c\7h\2\2\u012c\u012d\7h\2\2\u012d\64\3\2\2\2\u012e"+
		"\u012f\7u\2\2\u012f\u0130\7g\2\2\u0130\u0131\7v\2\2\u0131\66\3\2\2\2\u0132"+
		"\u0133\7x\2\2\u0133\u0134\7g\2\2\u0134\u0135\7e\2\2\u0135\u0136\7v\2\2"+
		"\u0136\u0137\7q\2\2\u0137\u0138\7t\2\2\u01388\3\2\2\2\u0139\u013a\7o\2"+
		"\2\u013a\u013b\7c\2\2\u013b\u013c\7v\2\2\u013c\u013d\7t\2\2\u013d\u013e"+
		"\7k\2\2\u013e\u013f\7z\2\2\u013f:\3\2\2\2\u0140\u0141\7u\2\2\u0141\u0142"+
		"\7k\2\2\u0142\u0143\7o\2\2\u0143\u0144\7r\2\2\u0144\u0145\7n\2\2\u0145"+
		"\u0146\7g\2\2\u0146\u0147\7z\2\2\u0147<\3\2\2\2\u0148\u0149\7o\2\2\u0149"+
		"\u014a\7k\2\2\u014a\u014b\7p\2\2\u014b\u014c\7k\2\2\u014c\u014d\7o\2\2"+
		"\u014d\u014e\7k\2\2\u014e\u014f\7|\2\2\u014f\u0150\7g\2\2\u0150>\3\2\2"+
		"\2\u0151\u0152\7o\2\2\u0152\u0153\7c\2\2\u0153\u0154\7z\2\2\u0154\u0155"+
		"\7k\2\2\u0155\u0156\7o\2\2\u0156\u0157\7k\2\2\u0157\u0158\7|\2\2\u0158"+
		"\u0159\7g\2\2\u0159@\3\2\2\2\u015a\u015b\7e\2\2\u015b\u015c\7q\2\2\u015c"+
		"\u015d\7p\2\2\u015d\u015e\7u\2\2\u015e\u015f\7v\2\2\u015f\u0160\7t\2\2"+
		"\u0160\u0161\7c\2\2\u0161\u0162\7k\2\2\u0162\u0163\7p\2\2\u0163B\3\2\2"+
		"\2\u0164\u0165\7u\2\2\u0165\u0166\7q\2\2\u0166\u0167\7n\2\2\u0167\u0168"+
		"\7x\2\2\u0168\u0169\7g\2\2\u0169D\3\2\2\2\u016a\u016b\7x\2\2\u016b\u016c"+
		"\7c\2\2\u016c\u016d\7t\2\2\u016dF\3\2\2\2\u016e\u016f\7r\2\2\u016f\u0170"+
		"\7c\2\2\u0170\u0171\7t\2\2\u0171\u0172\7c\2\2\u0172\u0173\7o\2\2\u0173"+
		"H\3\2\2\2\u0174\u0175\7k\2\2\u0175\u0176\7p\2\2\u0176\u0177\7v\2\2\u0177"+
		"J\3\2\2\2\u0178\u0179\7f\2\2\u0179\u017a\7q\2\2\u017a\u017b\7w\2\2\u017b"+
		"\u017c\7d\2\2\u017c\u017d\7n\2\2\u017d\u017e\7g\2\2\u017eL\3\2\2\2\u017f"+
		"\u0180\7u\2\2\u0180\u0181\7v\2\2\u0181\u0182\7t\2\2\u0182\u0183\7k\2\2"+
		"\u0183\u0184\7p\2\2\u0184\u0185\7i\2\2\u0185N\3\2\2\2\u0186\u0187\7d\2"+
		"\2\u0187\u0188\7q\2\2\u0188\u0189\7q\2\2\u0189\u018a\7n\2\2\u018a\u018b"+
		"\7g\2\2\u018b\u018c\7c\2\2\u018c\u018d\7p\2\2\u018dP\3\2\2\2\u018e\u018f"+
		"\7p\2\2\u018f\u0190\7w\2\2\u0190\u0191\7n\2\2\u0191\u0192\7n\2\2\u0192"+
		"R\3\2\2\2\u0193\u0194\7k\2\2\u0194\u0195\7h\2\2\u0195T\3\2\2\2\u0196\u0197"+
		"\7g\2\2\u0197\u0198\7n\2\2\u0198\u0199\7u\2\2\u0199\u019a\7g\2\2\u019a"+
		"V\3\2\2\2\u019b\u019c\7v\2\2\u019c\u019d\7j\2\2\u019d\u019e\7g\2\2\u019e"+
		"\u019f\7p\2\2\u019fX\3\2\2\2\u01a0\u01a1\7y\2\2\u01a1\u01a2\7j\2\2\u01a2"+
		"\u01a3\7k\2\2\u01a3\u01a4\7n\2\2\u01a4\u01a5\7g\2\2\u01a5Z\3\2\2\2\u01a6"+
		"\u01a7\7d\2\2\u01a7\u01a8\7t\2\2\u01a8\u01a9\7g\2\2\u01a9\u01aa\7c\2\2"+
		"\u01aa\u01ab\7m\2\2\u01ab\\\3\2\2\2\u01ac\u01ad\7f\2\2\u01ad\u01ae\7q"+
		"\2\2\u01ae^\3\2\2\2\u01af\u01b0\7h\2\2\u01b0\u01b1\7q\2\2\u01b1\u01b2"+
		"\7t\2\2\u01b2`\3\2\2\2\u01b3\u01b4\7u\2\2\u01b4\u01b5\7g\2\2\u01b5\u01b6"+
		"\7n\2\2\u01b6\u01b7\7g\2\2\u01b7\u01b8\7e\2\2\u01b8\u01b9\7v\2\2\u01b9"+
		"b\3\2\2\2\u01ba\u01bb\7e\2\2\u01bb\u01bc\7c\2\2\u01bc\u01bd\7u\2\2\u01bd"+
		"\u01be\7g\2\2\u01bed\3\2\2\2\u01bf\u01c0\7?\2\2\u01c0\u01c1\7?\2\2\u01c1"+
		"f\3\2\2\2\u01c2\u01c3\7#\2\2\u01c3\u01c7\7?\2\2\u01c4\u01c5\7>\2\2\u01c5"+
		"\u01c7\7@\2\2\u01c6\u01c2\3\2\2\2\u01c6\u01c4\3\2\2\2\u01c7h\3\2\2\2\u01c8"+
		"\u01c9\7@\2\2\u01c9j\3\2\2\2\u01ca\u01cb\7>\2\2\u01cbl\3\2\2\2\u01cc\u01cd"+
		"\7@\2\2\u01cd\u01ce\7?\2\2\u01cen\3\2\2\2\u01cf\u01d0\7>\2\2\u01d0\u01d1"+
		"\7?\2\2\u01d1p\3\2\2\2\u01d2\u01d3\7c\2\2\u01d3\u01d4\7p\2\2\u01d4\u01d8"+
		"\7f\2\2\u01d5\u01d6\7(\2\2\u01d6\u01d8\7(\2\2\u01d7\u01d2\3\2\2\2\u01d7"+
		"\u01d5\3\2\2\2\u01d8r\3\2\2\2\u01d9\u01da\7q\2\2\u01da\u01de\7t\2\2\u01db"+
		"\u01dc\7~\2\2\u01dc\u01de\7~\2\2\u01dd\u01d9\3\2\2\2\u01dd\u01db\3\2\2"+
		"\2\u01det\3\2\2\2\u01df\u01e0\7p\2\2\u01e0\u01e1\7q\2\2\u01e1\u01e4\7"+
		"v\2\2\u01e2\u01e4\7#\2\2\u01e3\u01df\3\2\2\2\u01e3\u01e2\3\2\2\2\u01e4"+
		"v\3\2\2\2\u01e5\u01e6\7v\2\2\u01e6\u01e7\7t\2\2\u01e7\u01e8\7w\2\2\u01e8"+
		"\u01e9\7g\2\2\u01e9x\3\2\2\2\u01ea\u01eb\7h\2\2\u01eb\u01ec\7c\2\2\u01ec"+
		"\u01ed\7n\2\2\u01ed\u01ee\7u\2\2\u01ee\u01ef\7g\2\2\u01efz\3\2\2\2\u01f0"+
		"\u01f1\7-\2\2\u01f1|\3\2\2\2\u01f2\u01f3\7/\2\2\u01f3~\3\2\2\2\u01f4\u01f5"+
		"\7,\2\2\u01f5\u0080\3\2\2\2\u01f6\u01f7\7\61\2\2\u01f7\u0082\3\2\2\2\u01f8"+
		"\u01f9\7\'\2\2\u01f9\u0084\3\2\2\2\u01fa\u01fe\7`\2\2\u01fb\u01fc\7,\2"+
		"\2\u01fc\u01fe\7,\2\2\u01fd\u01fa\3\2\2\2\u01fd\u01fb\3\2\2\2\u01fe\u0086"+
		"\3\2\2\2\u01ff\u0200\7c\2\2\u0200\u0201\7d\2\2\u0201\u0202\7u\2\2\u0202"+
		"\u0088\3\2\2\2\u0203\u0204\7c\2\2\u0204\u0205\7v\2\2\u0205\u0206\7c\2"+
		"\2\u0206\u0207\7p\2\2\u0207\u008a\3\2\2\2\u0208\u0209\7e\2\2\u0209\u020a"+
		"\7c\2\2\u020a\u020b\7t\2\2\u020b\u020c\7f\2\2\u020c\u008c\3\2\2\2\u020d"+
		"\u020e\7e\2\2\u020e\u020f\7g\2\2\u020f\u0210\7k\2\2\u0210\u0211\7n\2\2"+
		"\u0211\u008e\3\2\2\2\u0212\u0213\7e\2\2\u0213\u0214\7q\2\2\u0214\u0215"+
		"\7u\2\2\u0215\u0090\3\2\2\2\u0216\u0217\7g\2\2\u0217\u0218\7z\2\2\u0218"+
		"\u0219\7r\2\2\u0219\u0092\3\2\2\2\u021a\u021b\7h\2\2\u021b\u021c\7n\2"+
		"\2\u021c\u021d\7q\2\2\u021d\u021e\7q\2\2\u021e\u021f\7t\2\2\u021f\u0094"+
		"\3\2\2\2\u0220\u0221\7n\2\2\u0221\u0222\7g\2\2\u0222\u0223\7p\2\2\u0223"+
		"\u0224\7i\2\2\u0224\u0225\7v\2\2\u0225\u0226\7j\2\2\u0226\u0096\3\2\2"+
		"\2\u0227\u0228\7n\2\2\u0228\u0229\7q\2\2\u0229\u022a\7i\2\2\u022a\u0098"+
		"\3\2\2\2\u022b\u022c\7n\2\2\u022c\u022d\7q\2\2\u022d\u022e\7i\2\2\u022e"+
		"\u022f\7\63\2\2\u022f\u0230\7\62\2\2\u0230\u009a\3\2\2\2\u0231\u0232\7"+
		"t\2\2\u0232\u0233\7q\2\2\u0233\u0234\7w\2\2\u0234\u0235\7p\2\2\u0235\u0236"+
		"\7f\2\2\u0236\u009c\3\2\2\2\u0237\u0238\7u\2\2\u0238\u0239\7k\2\2\u0239"+
		"\u023a\7p\2\2\u023a\u009e\3\2\2\2\u023b\u023c\7u\2\2\u023c\u023d\7s\2"+
		"\2\u023d\u023e\7t\2\2\u023e\u023f\7v\2\2\u023f\u00a0\3\2\2\2\u0240\u0241"+
		"\7v\2\2\u0241\u0242\7c\2\2\u0242\u0243\7p\2\2\u0243\u00a2\3\2\2\2\u0244"+
		"\u0245\7v\2\2\u0245\u0246\7t\2\2\u0246\u0247\7w\2\2\u0247\u0248\7p\2\2"+
		"\u0248\u0249\7e\2\2\u0249\u00a4\3\2\2\2\u024a\u024b\7w\2\2\u024b\u024c"+
		"\7p\2\2\u024c\u024d\7k\2\2\u024d\u024e\7h\2\2\u024e\u024f\7q\2\2\u024f"+
		"\u0250\7t\2\2\u0250\u0251\7o\2\2\u0251\u00a6\3\2\2\2\u0252\u0253\7p\2"+
		"\2\u0253\u0254\7q\2\2\u0254\u0255\7t\2\2\u0255\u0256\7o\2\2\u0256\u0257"+
		"\7c\2\2\u0257\u0258\7n\2\2\u0258\u00a8\3\2\2\2\u0259\u025a\7u\2\2\u025a"+
		"\u025b\7w\2\2\u025b\u025c\7d\2\2\u025c\u025d\7u\2\2\u025d\u025e\7v\2\2"+
		"\u025e\u025f\7t\2\2\u025f\u00aa\3\2\2\2\u0260\u0264\t\3\2\2\u0261\u0263"+
		"\t\4\2\2\u0262\u0261\3\2\2\2\u0263\u0266\3\2\2\2\u0264\u0262\3\2\2\2\u0264"+
		"\u0265\3\2\2\2\u0265\u00ac\3\2\2\2\u0266\u0264\3\2\2\2\u0267\u026b\t\5"+
		"\2\2\u0268\u026a\t\4\2\2\u0269\u0268\3\2\2\2\u026a\u026d\3\2\2\2\u026b"+
		"\u0269\3\2\2\2\u026b\u026c\3\2\2\2\u026c\u00ae\3\2\2\2\u026d\u026b\3\2"+
		"\2\2\u026e\u0270\t\6\2\2\u026f\u026e\3\2\2\2\u0270\u0271\3\2\2\2\u0271"+
		"\u026f\3\2\2\2\u0271\u0272\3\2\2\2\u0272\u00b0\3\2\2\2\u0273\u0275\t\6"+
		"\2\2\u0274\u0273\3\2\2\2\u0275\u0278\3\2\2\2\u0276\u0274\3\2\2\2\u0276"+
		"\u0277\3\2\2\2\u0277\u0279\3\2\2\2\u0278\u0276\3\2\2\2\u0279\u027d\7\60"+
		"\2\2\u027a\u027c\t\6\2\2\u027b\u027a\3\2\2\2\u027c\u027f\3\2\2\2\u027d"+
		"\u027b\3\2\2\2\u027d\u027e\3\2\2\2\u027e\u00b2\3\2\2\2\u027f\u027d\3\2"+
		"\2\2\u0280\u0286\7$\2\2\u0281\u0285\n\7\2\2\u0282\u0283\7$\2\2\u0283\u0285"+
		"\7$\2\2\u0284\u0281\3\2\2\2\u0284\u0282\3\2\2\2\u0285\u0288\3\2\2\2\u0286"+
		"\u0284\3\2\2\2\u0286\u0287\3\2\2\2\u0287\u0289\3\2\2\2\u0288\u0286\3\2"+
		"\2\2\u0289\u028a\7$\2\2\u028a\u00b4\3\2\2\2\u028b\u028c\t\b\2\2\u028c"+
		"\u028d\3\2\2\2\u028d\u028e\b[\2\2\u028e\u00b6\3\2\2\2\u028f\u0290\13\2"+
		"\2\2\u0290\u00b8\3\2\2\2\22\2\u00bd\u00c6\u00cb\u01c6\u01d7\u01dd\u01e3"+
		"\u01fd\u0264\u026b\u0271\u0276\u027d\u0284\u0286\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}