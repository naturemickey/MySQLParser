// Generated from src/net/yeah/zhouyou/mickey/mysql/antlr4/MySQL.g4 by ANTLR 4.5.3
package net.yeah.zhouyou.mickey.mysql.antlr4;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MySQLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PLACEHOLDER=1, INSERT=2, INTO=3, VALUES=4, DELETE=5, FROM=6, WHERE=7, 
		LIMIT=8, SELECT=9, AND=10, OR=11, XOR=12, IS=13, NULL=14, LIKE=15, IN=16, 
		EXISTS=17, ALL=18, ANY=19, TRUE=20, FALSE=21, DIVIDE=22, MOD=23, BETWEEN=24, 
		REGEXP=25, PLUS=26, MINUS=27, NEGATION=28, VERTBAR=29, BITAND=30, POWER_OP=31, 
		BINARY=32, SHIFT_LEFT=33, SHIFT_RIGHT=34, ESCAPE=35, ASTERISK=36, RPAREN=37, 
		LPAREN=38, RBRACK=39, LBRACK=40, COLON=41, ALL_FIELDS=42, EQ=43, LTH=44, 
		GTH=45, NOT_EQ=46, NOT=47, LET=48, GET=49, SEMI=50, COMMA=51, DOT=52, 
		COLLATE=53, INNER=54, OUTER=55, JOIN=56, CROSS=57, USING=58, INDEX=59, 
		KEY=60, ORDER=61, GROUP=62, BY=63, FOR=64, USE=65, IGNORE=66, PARTITION=67, 
		STRAIGHT_JOIN=68, NATURAL=69, LEFT=70, RIGHT=71, OJ=72, ON=73, ID=74, 
		INT=75, NEWLINE=76, WS=77, USER_VAR=78;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"PLACEHOLDER", "INSERT", "INTO", "VALUES", "DELETE", "FROM", "WHERE", 
		"LIMIT", "SELECT", "AND", "OR", "XOR", "IS", "NULL", "LIKE", "IN", "EXISTS", 
		"ALL", "ANY", "TRUE", "FALSE", "DIVIDE", "MOD", "BETWEEN", "REGEXP", "PLUS", 
		"MINUS", "NEGATION", "VERTBAR", "BITAND", "POWER_OP", "BINARY", "SHIFT_LEFT", 
		"SHIFT_RIGHT", "ESCAPE", "ASTERISK", "RPAREN", "LPAREN", "RBRACK", "LBRACK", 
		"COLON", "ALL_FIELDS", "EQ", "LTH", "GTH", "NOT_EQ", "NOT", "LET", "GET", 
		"SEMI", "COMMA", "DOT", "COLLATE", "INNER", "OUTER", "JOIN", "CROSS", 
		"USING", "INDEX", "KEY", "ORDER", "GROUP", "BY", "FOR", "USE", "IGNORE", 
		"PARTITION", "STRAIGHT_JOIN", "NATURAL", "LEFT", "RIGHT", "OJ", "ON", 
		"ID", "INT", "NEWLINE", "WS", "USER_VAR", "USER_VAR_SUBFIX1", "USER_VAR_SUBFIX2", 
		"USER_VAR_SUBFIX3", "USER_VAR_SUBFIX4"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'?'", null, null, null, null, null, null, null, "'select'", null, 
		null, "'xor'", "'is'", "'null'", "'like'", "'in'", "'exists'", "'all'", 
		"'any'", "'true'", "'false'", null, null, "'between'", "'regexp'", "'+'", 
		"'-'", "'~'", "'|'", "'&'", "'^'", "'binary'", "'<<'", "'>>'", "'escape'", 
		"'*'", "')'", "'('", "']'", "'['", "':'", "'.*'", "'='", "'<'", "'>'", 
		"'!='", "'not'", "'<='", "'>='", "';'", "','", "'.'", "'collate'", "'inner'", 
		"'outer'", "'join'", "'cross'", "'using'", "'index'", "'key'", "'order'", 
		"'group'", "'by'", "'for'", "'use'", "'ignore'", "'partition'", "'straight_join'", 
		"'natural'", "'left'", "'right'", "'oj'", "'on'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "PLACEHOLDER", "INSERT", "INTO", "VALUES", "DELETE", "FROM", "WHERE", 
		"LIMIT", "SELECT", "AND", "OR", "XOR", "IS", "NULL", "LIKE", "IN", "EXISTS", 
		"ALL", "ANY", "TRUE", "FALSE", "DIVIDE", "MOD", "BETWEEN", "REGEXP", "PLUS", 
		"MINUS", "NEGATION", "VERTBAR", "BITAND", "POWER_OP", "BINARY", "SHIFT_LEFT", 
		"SHIFT_RIGHT", "ESCAPE", "ASTERISK", "RPAREN", "LPAREN", "RBRACK", "LBRACK", 
		"COLON", "ALL_FIELDS", "EQ", "LTH", "GTH", "NOT_EQ", "NOT", "LET", "GET", 
		"SEMI", "COMMA", "DOT", "COLLATE", "INNER", "OUTER", "JOIN", "CROSS", 
		"USING", "INDEX", "KEY", "ORDER", "GROUP", "BY", "FOR", "USE", "IGNORE", 
		"PARTITION", "STRAIGHT_JOIN", "NATURAL", "LEFT", "RIGHT", "OJ", "ON", 
		"ID", "INT", "NEWLINE", "WS", "USER_VAR"
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


	public MySQLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MySQL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2P\u0235\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\5\5\u00bc\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\13\3\13\3\13\3\13\3\13\5\13\u00e2\n\13\3\f\3\f\3\f\3\f\5\f\u00e8"+
		"\n\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\5\27\u011c\n\27\3\30\3\30\3\30"+
		"\3\30\5\30\u0122\n\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37"+
		"\3\37\3 \3 \3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3$\3$\3"+
		"$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3+\3,\3,\3-\3-\3.\3."+
		"\3/\3/\3/\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3\62\3\63\3\63"+
		"\3\64\3\64\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\67\3\67"+
		"\3\67\3\67\3\67\3\67\38\38\38\38\38\38\39\39\39\39\39\3:\3:\3:\3:\3:\3"+
		":\3;\3;\3;\3;\3;\3;\3<\3<\3<\3<\3<\3<\3=\3=\3=\3=\3>\3>\3>\3>\3>\3>\3"+
		"?\3?\3?\3?\3?\3?\3@\3@\3@\3A\3A\3A\3A\3B\3B\3B\3B\3C\3C\3C\3C\3C\3C\3"+
		"C\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3"+
		"E\3E\3F\3F\3F\3F\3F\3F\3F\3F\3G\3G\3G\3G\3G\3H\3H\3H\3H\3H\3H\3I\3I\3"+
		"I\3J\3J\3J\3K\6K\u01fa\nK\rK\16K\u01fb\3L\6L\u01ff\nL\rL\16L\u0200\3M"+
		"\5M\u0204\nM\3M\3M\3M\3M\3N\6N\u020b\nN\rN\16N\u020c\3N\3N\3O\3O\3O\3"+
		"O\3O\5O\u0216\nO\3P\3P\6P\u021a\nP\rP\16P\u021b\3P\3P\3Q\3Q\6Q\u0222\n"+
		"Q\rQ\16Q\u0223\3Q\3Q\3R\3R\6R\u022a\nR\rR\16R\u022b\3R\3R\3S\3S\6S\u0232"+
		"\nS\rS\16S\u0233\2\2T\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63"+
		"e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089"+
		"F\u008bG\u008dH\u008fI\u0091J\u0093K\u0095L\u0097M\u0099N\u009bO\u009d"+
		"P\u009f\2\u00a1\2\u00a3\2\u00a5\2\3\2\30\4\2KKkk\4\2PPpp\4\2UUuu\4\2G"+
		"Ggg\4\2TTtt\4\2VVvv\4\2QQqq\4\2XXxx\4\2CCcc\4\2NNnn\4\2WWww\4\2FFff\4"+
		"\2HHhh\4\2OOoo\4\2YYyy\4\2JJjj\5\2C\\aac|\5\2\13\f\17\17\"\"\3\2bb\3\2"+
		"))\3\2$$\7\2&&\62;C\\aac|\u0241\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2"+
		"\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2"+
		"\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2"+
		"\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O"+
		"\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2"+
		"\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2"+
		"\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u"+
		"\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081"+
		"\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2"+
		"\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093"+
		"\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2"+
		"\2\2\u009d\3\2\2\2\3\u00a7\3\2\2\2\5\u00a9\3\2\2\2\7\u00b0\3\2\2\2\t\u00b5"+
		"\3\2\2\2\13\u00bd\3\2\2\2\r\u00c4\3\2\2\2\17\u00c9\3\2\2\2\21\u00cf\3"+
		"\2\2\2\23\u00d5\3\2\2\2\25\u00e1\3\2\2\2\27\u00e7\3\2\2\2\31\u00e9\3\2"+
		"\2\2\33\u00ed\3\2\2\2\35\u00f0\3\2\2\2\37\u00f5\3\2\2\2!\u00fa\3\2\2\2"+
		"#\u00fd\3\2\2\2%\u0104\3\2\2\2\'\u0108\3\2\2\2)\u010c\3\2\2\2+\u0111\3"+
		"\2\2\2-\u011b\3\2\2\2/\u0121\3\2\2\2\61\u0123\3\2\2\2\63\u012b\3\2\2\2"+
		"\65\u0132\3\2\2\2\67\u0134\3\2\2\29\u0136\3\2\2\2;\u0138\3\2\2\2=\u013a"+
		"\3\2\2\2?\u013c\3\2\2\2A\u013e\3\2\2\2C\u0145\3\2\2\2E\u0148\3\2\2\2G"+
		"\u014b\3\2\2\2I\u0152\3\2\2\2K\u0154\3\2\2\2M\u0156\3\2\2\2O\u0158\3\2"+
		"\2\2Q\u015a\3\2\2\2S\u015c\3\2\2\2U\u015e\3\2\2\2W\u0161\3\2\2\2Y\u0163"+
		"\3\2\2\2[\u0165\3\2\2\2]\u0167\3\2\2\2_\u016a\3\2\2\2a\u016e\3\2\2\2c"+
		"\u0171\3\2\2\2e\u0174\3\2\2\2g\u0176\3\2\2\2i\u0178\3\2\2\2k\u017a\3\2"+
		"\2\2m\u0182\3\2\2\2o\u0188\3\2\2\2q\u018e\3\2\2\2s\u0193\3\2\2\2u\u0199"+
		"\3\2\2\2w\u019f\3\2\2\2y\u01a5\3\2\2\2{\u01a9\3\2\2\2}\u01af\3\2\2\2\177"+
		"\u01b5\3\2\2\2\u0081\u01b8\3\2\2\2\u0083\u01bc\3\2\2\2\u0085\u01c0\3\2"+
		"\2\2\u0087\u01c7\3\2\2\2\u0089\u01d1\3\2\2\2\u008b\u01df\3\2\2\2\u008d"+
		"\u01e7\3\2\2\2\u008f\u01ec\3\2\2\2\u0091\u01f2\3\2\2\2\u0093\u01f5\3\2"+
		"\2\2\u0095\u01f9\3\2\2\2\u0097\u01fe\3\2\2\2\u0099\u0203\3\2\2\2\u009b"+
		"\u020a\3\2\2\2\u009d\u0210\3\2\2\2\u009f\u0217\3\2\2\2\u00a1\u021f\3\2"+
		"\2\2\u00a3\u0227\3\2\2\2\u00a5\u0231\3\2\2\2\u00a7\u00a8\7A\2\2\u00a8"+
		"\4\3\2\2\2\u00a9\u00aa\t\2\2\2\u00aa\u00ab\t\3\2\2\u00ab\u00ac\t\4\2\2"+
		"\u00ac\u00ad\t\5\2\2\u00ad\u00ae\t\6\2\2\u00ae\u00af\t\7\2\2\u00af\6\3"+
		"\2\2\2\u00b0\u00b1\t\2\2\2\u00b1\u00b2\t\3\2\2\u00b2\u00b3\t\7\2\2\u00b3"+
		"\u00b4\t\b\2\2\u00b4\b\3\2\2\2\u00b5\u00b6\t\t\2\2\u00b6\u00b7\t\n\2\2"+
		"\u00b7\u00b8\t\13\2\2\u00b8\u00b9\t\f\2\2\u00b9\u00bb\t\5\2\2\u00ba\u00bc"+
		"\t\4\2\2\u00bb\u00ba\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\n\3\2\2\2\u00bd"+
		"\u00be\t\r\2\2\u00be\u00bf\t\5\2\2\u00bf\u00c0\t\13\2\2\u00c0\u00c1\t"+
		"\5\2\2\u00c1\u00c2\t\7\2\2\u00c2\u00c3\t\5\2\2\u00c3\f\3\2\2\2\u00c4\u00c5"+
		"\t\16\2\2\u00c5\u00c6\t\6\2\2\u00c6\u00c7\t\b\2\2\u00c7\u00c8\t\17\2\2"+
		"\u00c8\16\3\2\2\2\u00c9\u00ca\t\20\2\2\u00ca\u00cb\t\21\2\2\u00cb\u00cc"+
		"\t\5\2\2\u00cc\u00cd\t\6\2\2\u00cd\u00ce\t\5\2\2\u00ce\20\3\2\2\2\u00cf"+
		"\u00d0\t\13\2\2\u00d0\u00d1\t\2\2\2\u00d1\u00d2\t\17\2\2\u00d2\u00d3\t"+
		"\2\2\2\u00d3\u00d4\t\7\2\2\u00d4\22\3\2\2\2\u00d5\u00d6\7u\2\2\u00d6\u00d7"+
		"\7g\2\2\u00d7\u00d8\7n\2\2\u00d8\u00d9\7g\2\2\u00d9\u00da\7e\2\2\u00da"+
		"\u00db\7v\2\2\u00db\24\3\2\2\2\u00dc\u00dd\7c\2\2\u00dd\u00de\7p\2\2\u00de"+
		"\u00e2\7f\2\2\u00df\u00e0\7(\2\2\u00e0\u00e2\7(\2\2\u00e1\u00dc\3\2\2"+
		"\2\u00e1\u00df\3\2\2\2\u00e2\26\3\2\2\2\u00e3\u00e4\7q\2\2\u00e4\u00e8"+
		"\7t\2\2\u00e5\u00e6\7~\2\2\u00e6\u00e8\7~\2\2\u00e7\u00e3\3\2\2\2\u00e7"+
		"\u00e5\3\2\2\2\u00e8\30\3\2\2\2\u00e9\u00ea\7z\2\2\u00ea\u00eb\7q\2\2"+
		"\u00eb\u00ec\7t\2\2\u00ec\32\3\2\2\2\u00ed\u00ee\7k\2\2\u00ee\u00ef\7"+
		"u\2\2\u00ef\34\3\2\2\2\u00f0\u00f1\7p\2\2\u00f1\u00f2\7w\2\2\u00f2\u00f3"+
		"\7n\2\2\u00f3\u00f4\7n\2\2\u00f4\36\3\2\2\2\u00f5\u00f6\7n\2\2\u00f6\u00f7"+
		"\7k\2\2\u00f7\u00f8\7m\2\2\u00f8\u00f9\7g\2\2\u00f9 \3\2\2\2\u00fa\u00fb"+
		"\7k\2\2\u00fb\u00fc\7p\2\2\u00fc\"\3\2\2\2\u00fd\u00fe\7g\2\2\u00fe\u00ff"+
		"\7z\2\2\u00ff\u0100\7k\2\2\u0100\u0101\7u\2\2\u0101\u0102\7v\2\2\u0102"+
		"\u0103\7u\2\2\u0103$\3\2\2\2\u0104\u0105\7c\2\2\u0105\u0106\7n\2\2\u0106"+
		"\u0107\7n\2\2\u0107&\3\2\2\2\u0108\u0109\7c\2\2\u0109\u010a\7p\2\2\u010a"+
		"\u010b\7{\2\2\u010b(\3\2\2\2\u010c\u010d\7v\2\2\u010d\u010e\7t\2\2\u010e"+
		"\u010f\7w\2\2\u010f\u0110\7g\2\2\u0110*\3\2\2\2\u0111\u0112\7h\2\2\u0112"+
		"\u0113\7c\2\2\u0113\u0114\7n\2\2\u0114\u0115\7u\2\2\u0115\u0116\7g\2\2"+
		"\u0116,\3\2\2\2\u0117\u0118\7f\2\2\u0118\u0119\7k\2\2\u0119\u011c\7x\2"+
		"\2\u011a\u011c\7\61\2\2\u011b\u0117\3\2\2\2\u011b\u011a\3\2\2\2\u011c"+
		".\3\2\2\2\u011d\u011e\7o\2\2\u011e\u011f\7q\2\2\u011f\u0122\7f\2\2\u0120"+
		"\u0122\7\'\2\2\u0121\u011d\3\2\2\2\u0121\u0120\3\2\2\2\u0122\60\3\2\2"+
		"\2\u0123\u0124\7d\2\2\u0124\u0125\7g\2\2\u0125\u0126\7v\2\2\u0126\u0127"+
		"\7y\2\2\u0127\u0128\7g\2\2\u0128\u0129\7g\2\2\u0129\u012a\7p\2\2\u012a"+
		"\62\3\2\2\2\u012b\u012c\7t\2\2\u012c\u012d\7g\2\2\u012d\u012e\7i\2\2\u012e"+
		"\u012f\7g\2\2\u012f\u0130\7z\2\2\u0130\u0131\7r\2\2\u0131\64\3\2\2\2\u0132"+
		"\u0133\7-\2\2\u0133\66\3\2\2\2\u0134\u0135\7/\2\2\u01358\3\2\2\2\u0136"+
		"\u0137\7\u0080\2\2\u0137:\3\2\2\2\u0138\u0139\7~\2\2\u0139<\3\2\2\2\u013a"+
		"\u013b\7(\2\2\u013b>\3\2\2\2\u013c\u013d\7`\2\2\u013d@\3\2\2\2\u013e\u013f"+
		"\7d\2\2\u013f\u0140\7k\2\2\u0140\u0141\7p\2\2\u0141\u0142\7c\2\2\u0142"+
		"\u0143\7t\2\2\u0143\u0144\7{\2\2\u0144B\3\2\2\2\u0145\u0146\7>\2\2\u0146"+
		"\u0147\7>\2\2\u0147D\3\2\2\2\u0148\u0149\7@\2\2\u0149\u014a\7@\2\2\u014a"+
		"F\3\2\2\2\u014b\u014c\7g\2\2\u014c\u014d\7u\2\2\u014d\u014e\7e\2\2\u014e"+
		"\u014f\7c\2\2\u014f\u0150\7r\2\2\u0150\u0151\7g\2\2\u0151H\3\2\2\2\u0152"+
		"\u0153\7,\2\2\u0153J\3\2\2\2\u0154\u0155\7+\2\2\u0155L\3\2\2\2\u0156\u0157"+
		"\7*\2\2\u0157N\3\2\2\2\u0158\u0159\7_\2\2\u0159P\3\2\2\2\u015a\u015b\7"+
		"]\2\2\u015bR\3\2\2\2\u015c\u015d\7<\2\2\u015dT\3\2\2\2\u015e\u015f\7\60"+
		"\2\2\u015f\u0160\7,\2\2\u0160V\3\2\2\2\u0161\u0162\7?\2\2\u0162X\3\2\2"+
		"\2\u0163\u0164\7>\2\2\u0164Z\3\2\2\2\u0165\u0166\7@\2\2\u0166\\\3\2\2"+
		"\2\u0167\u0168\7#\2\2\u0168\u0169\7?\2\2\u0169^\3\2\2\2\u016a\u016b\7"+
		"p\2\2\u016b\u016c\7q\2\2\u016c\u016d\7v\2\2\u016d`\3\2\2\2\u016e\u016f"+
		"\7>\2\2\u016f\u0170\7?\2\2\u0170b\3\2\2\2\u0171\u0172\7@\2\2\u0172\u0173"+
		"\7?\2\2\u0173d\3\2\2\2\u0174\u0175\7=\2\2\u0175f\3\2\2\2\u0176\u0177\7"+
		".\2\2\u0177h\3\2\2\2\u0178\u0179\7\60\2\2\u0179j\3\2\2\2\u017a\u017b\7"+
		"e\2\2\u017b\u017c\7q\2\2\u017c\u017d\7n\2\2\u017d\u017e\7n\2\2\u017e\u017f"+
		"\7c\2\2\u017f\u0180\7v\2\2\u0180\u0181\7g\2\2\u0181l\3\2\2\2\u0182\u0183"+
		"\7k\2\2\u0183\u0184\7p\2\2\u0184\u0185\7p\2\2\u0185\u0186\7g\2\2\u0186"+
		"\u0187\7t\2\2\u0187n\3\2\2\2\u0188\u0189\7q\2\2\u0189\u018a\7w\2\2\u018a"+
		"\u018b\7v\2\2\u018b\u018c\7g\2\2\u018c\u018d\7t\2\2\u018dp\3\2\2\2\u018e"+
		"\u018f\7l\2\2\u018f\u0190\7q\2\2\u0190\u0191\7k\2\2\u0191\u0192\7p\2\2"+
		"\u0192r\3\2\2\2\u0193\u0194\7e\2\2\u0194\u0195\7t\2\2\u0195\u0196\7q\2"+
		"\2\u0196\u0197\7u\2\2\u0197\u0198\7u\2\2\u0198t\3\2\2\2\u0199\u019a\7"+
		"w\2\2\u019a\u019b\7u\2\2\u019b\u019c\7k\2\2\u019c\u019d\7p\2\2\u019d\u019e"+
		"\7i\2\2\u019ev\3\2\2\2\u019f\u01a0\7k\2\2\u01a0\u01a1\7p\2\2\u01a1\u01a2"+
		"\7f\2\2\u01a2\u01a3\7g\2\2\u01a3\u01a4\7z\2\2\u01a4x\3\2\2\2\u01a5\u01a6"+
		"\7m\2\2\u01a6\u01a7\7g\2\2\u01a7\u01a8\7{\2\2\u01a8z\3\2\2\2\u01a9\u01aa"+
		"\7q\2\2\u01aa\u01ab\7t\2\2\u01ab\u01ac\7f\2\2\u01ac\u01ad\7g\2\2\u01ad"+
		"\u01ae\7t\2\2\u01ae|\3\2\2\2\u01af\u01b0\7i\2\2\u01b0\u01b1\7t\2\2\u01b1"+
		"\u01b2\7q\2\2\u01b2\u01b3\7w\2\2\u01b3\u01b4\7r\2\2\u01b4~\3\2\2\2\u01b5"+
		"\u01b6\7d\2\2\u01b6\u01b7\7{\2\2\u01b7\u0080\3\2\2\2\u01b8\u01b9\7h\2"+
		"\2\u01b9\u01ba\7q\2\2\u01ba\u01bb\7t\2\2\u01bb\u0082\3\2\2\2\u01bc\u01bd"+
		"\7w\2\2\u01bd\u01be\7u\2\2\u01be\u01bf\7g\2\2\u01bf\u0084\3\2\2\2\u01c0"+
		"\u01c1\7k\2\2\u01c1\u01c2\7i\2\2\u01c2\u01c3\7p\2\2\u01c3\u01c4\7q\2\2"+
		"\u01c4\u01c5\7t\2\2\u01c5\u01c6\7g\2\2\u01c6\u0086\3\2\2\2\u01c7\u01c8"+
		"\7r\2\2\u01c8\u01c9\7c\2\2\u01c9\u01ca\7t\2\2\u01ca\u01cb\7v\2\2\u01cb"+
		"\u01cc\7k\2\2\u01cc\u01cd\7v\2\2\u01cd\u01ce\7k\2\2\u01ce\u01cf\7q\2\2"+
		"\u01cf\u01d0\7p\2\2\u01d0\u0088\3\2\2\2\u01d1\u01d2\7u\2\2\u01d2\u01d3"+
		"\7v\2\2\u01d3\u01d4\7t\2\2\u01d4\u01d5\7c\2\2\u01d5\u01d6\7k\2\2\u01d6"+
		"\u01d7\7i\2\2\u01d7\u01d8\7j\2\2\u01d8\u01d9\7v\2\2\u01d9\u01da\7a\2\2"+
		"\u01da\u01db\7l\2\2\u01db\u01dc\7q\2\2\u01dc\u01dd\7k\2\2\u01dd\u01de"+
		"\7p\2\2\u01de\u008a\3\2\2\2\u01df\u01e0\7p\2\2\u01e0\u01e1\7c\2\2\u01e1"+
		"\u01e2\7v\2\2\u01e2\u01e3\7w\2\2\u01e3\u01e4\7t\2\2\u01e4\u01e5\7c\2\2"+
		"\u01e5\u01e6\7n\2\2\u01e6\u008c\3\2\2\2\u01e7\u01e8\7n\2\2\u01e8\u01e9"+
		"\7g\2\2\u01e9\u01ea\7h\2\2\u01ea\u01eb\7v\2\2\u01eb\u008e\3\2\2\2\u01ec"+
		"\u01ed\7t\2\2\u01ed\u01ee\7k\2\2\u01ee\u01ef\7i\2\2\u01ef\u01f0\7j\2\2"+
		"\u01f0\u01f1\7v\2\2\u01f1\u0090\3\2\2\2\u01f2\u01f3\7q\2\2\u01f3\u01f4"+
		"\7l\2\2\u01f4\u0092\3\2\2\2\u01f5\u01f6\7q\2\2\u01f6\u01f7\7p\2\2\u01f7"+
		"\u0094\3\2\2\2\u01f8\u01fa\t\22\2\2\u01f9\u01f8\3\2\2\2\u01fa\u01fb\3"+
		"\2\2\2\u01fb\u01f9\3\2\2\2\u01fb\u01fc\3\2\2\2\u01fc\u0096\3\2\2\2\u01fd"+
		"\u01ff\4\62;\2\u01fe\u01fd\3\2\2\2\u01ff\u0200\3\2\2\2\u0200\u01fe\3\2"+
		"\2\2\u0200\u0201\3\2\2\2\u0201\u0098\3\2\2\2\u0202\u0204\7\17\2\2\u0203"+
		"\u0202\3\2\2\2\u0203\u0204\3\2\2\2\u0204\u0205\3\2\2\2\u0205\u0206\7\f"+
		"\2\2\u0206\u0207\3\2\2\2\u0207\u0208\bM\2\2\u0208\u009a\3\2\2\2\u0209"+
		"\u020b\t\23\2\2\u020a\u0209\3\2\2\2\u020b\u020c\3\2\2\2\u020c\u020a\3"+
		"\2\2\2\u020c\u020d\3\2\2\2\u020d\u020e\3\2\2\2\u020e\u020f\bN\2\2\u020f"+
		"\u009c\3\2\2\2\u0210\u0215\7B\2\2\u0211\u0216\5\u009fP\2\u0212\u0216\5"+
		"\u00a1Q\2\u0213\u0216\5\u00a3R\2\u0214\u0216\5\u00a5S\2\u0215\u0211\3"+
		"\2\2\2\u0215\u0212\3\2\2\2\u0215\u0213\3\2\2\2\u0215\u0214\3\2\2\2\u0216"+
		"\u009e\3\2\2\2\u0217\u0219\7b\2\2\u0218\u021a\n\24\2\2\u0219\u0218\3\2"+
		"\2\2\u021a\u021b\3\2\2\2\u021b\u0219\3\2\2\2\u021b\u021c\3\2\2\2\u021c"+
		"\u021d\3\2\2\2\u021d\u021e\7b\2\2\u021e\u00a0\3\2\2\2\u021f\u0221\7)\2"+
		"\2\u0220\u0222\n\25\2\2\u0221\u0220\3\2\2\2\u0222\u0223\3\2\2\2\u0223"+
		"\u0221\3\2\2\2\u0223\u0224\3\2\2\2\u0224\u0225\3\2\2\2\u0225\u0226\7)"+
		"\2\2\u0226\u00a2\3\2\2\2\u0227\u0229\7$\2\2\u0228\u022a\n\26\2\2\u0229"+
		"\u0228\3\2\2\2\u022a\u022b\3\2\2\2\u022b\u0229\3\2\2\2\u022b\u022c\3\2"+
		"\2\2\u022c\u022d\3\2\2\2\u022d\u022e\7$\2\2\u022e\u00a4\3\2\2\2\u022f"+
		"\u0232\t\27\2\2\u0230\u0232\5i\65\2\u0231\u022f\3\2\2\2\u0231\u0230\3"+
		"\2\2\2\u0232\u0233\3\2\2\2\u0233\u0231\3\2\2\2\u0233\u0234\3\2\2\2\u0234"+
		"\u00a6\3\2\2\2\22\2\u00bb\u00e1\u00e7\u011b\u0121\u01fb\u0200\u0203\u020c"+
		"\u0215\u021b\u0223\u022b\u0231\u0233\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}