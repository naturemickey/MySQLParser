// Generated from src/net/yeah/zhouyou/mickey/mysql/antlr4/MySQL.g4 by ANTLR 4.5.3
package net.yeah.zhouyou.mickey.mysql.antlr4;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MySQLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, PLACEHOLDER=2, SELECT=3, INSERT=4, INTO=5, VALUES=6, DELETE=7, 
		FROM=8, WHERE=9, LIMIT=10, NULL=11, IS=12, IN=13, BETWEEN=14, EXISTS=15, 
		TRUE=16, FALSE=17, XOR=18, DEFAULT=19, UPDATE=20, SET=21, ORDER=22, GROUP=23, 
		BY=24, FOR=25, LIKE=26, HAVING=27, AS=28, INNER=29, OUTER=30, JOIN=31, 
		LEFT=32, RIGHT=33, ON=34, DISTINCT=35, OFFSET=36, ASC=37, DESC=38, CROSS=39, 
		USING=40, DATE=41, TIME=42, TIMESTAMP=43, ALL=44, ANY=45, SOME=46, UNION=47, 
		UNKNOWN=48, LOCK=49, SHARE=50, MODE=51, COMMIT=52, ROLLBACK=53, AND=54, 
		OR=55, NOT=56, DIV=57, MOD=58, PLUS=59, MINUS=60, VERTBAR=61, BITAND=62, 
		SHIFT_LEFT=63, SHIFT_RIGHT=64, ASTERISK=65, POWER_OP=66, INT=67, DECIMAL=68, 
		STRING=69, ID=70, COLUMN_REL=71, REGEXP=72, NEGATION=73, BINARY=74, ESCAPE=75, 
		RPAREN=76, LPAREN=77, RBRACK=78, LBRACK=79, COLON=80, ALL_FIELDS=81, EQ=82, 
		LTH=83, GTH=84, NOT_EQ=85, LET=86, GET=87, SEMI=88, COMMA=89, DOT=90, 
		COLLATE=91, INDEX=92, KEY=93, USE=94, IGNORE=95, PARTITION=96, STRAIGHT_JOIN=97, 
		NATURAL=98, OJ=99, NEWLINE=100, WS=101, COMMENT1=102, COMMENT2=103, USER_VAR=104;
	public static final int
		RULE_stat = 0, RULE_transcationStat = 1, RULE_commit = 2, RULE_rollback = 3, 
		RULE_insertStat = 4, RULE_columnNames = 5, RULE_columnNamesSuffix = 6, 
		RULE_valueList = 7, RULE_valueListSuffix = 8, RULE_selectStat = 9, RULE_selectInner = 10, 
		RULE_selectPrefix = 11, RULE_selectSuffix = 12, RULE_selectUnionSuffix = 13, 
		RULE_selectExprs = 14, RULE_selectExprsSuffix = 15, RULE_tables = 16, 
		RULE_tableSuffix = 17, RULE_tableRel = 18, RULE_tableFactor = 19, RULE_tableSubQuery = 20, 
		RULE_tableRecu = 21, RULE_tableJoin = 22, RULE_tableJoinSuffix = 23, RULE_tableJoinMod = 24, 
		RULE_joinCondition = 25, RULE_gbobExprs = 26, RULE_gbobExprSuffix = 27, 
		RULE_updateStat = 28, RULE_updateSingleTable = 29, RULE_updateMultipleTable = 30, 
		RULE_setExprs = 31, RULE_setExprSuffix = 32, RULE_setExpr = 33, RULE_deleteStat = 34, 
		RULE_tableNameAndAlias = 35, RULE_tableNameAndAliases = 36, RULE_tableNameAndAliasSuffix = 37, 
		RULE_whereCondition = 38, RULE_whereCondSub = 39, RULE_whereCondOp = 40, 
		RULE_expression = 41, RULE_exprRelational = 42, RULE_exprBetweenAnd = 43, 
		RULE_exprIsOrIsNotNull = 44, RULE_exprInSelect = 45, RULE_exprInValues = 46, 
		RULE_exprExists = 47, RULE_exprNot = 48, RULE_exprLike = 49, RULE_element = 50, 
		RULE_elementOpFactory = 51, RULE_elementText = 52, RULE_elementSubQuery = 53, 
		RULE_elementDate = 54, RULE_elementListFactor = 55, RULE_elementList = 56, 
		RULE_elementListSuffix = 57, RULE_elementOpEle = 58, RULE_elementOpEleSuffix = 59, 
		RULE_funCall = 60, RULE_paramList = 61, RULE_paramSuffix = 62;
	public static final String[] ruleNames = {
		"stat", "transcationStat", "commit", "rollback", "insertStat", "columnNames", 
		"columnNamesSuffix", "valueList", "valueListSuffix", "selectStat", "selectInner", 
		"selectPrefix", "selectSuffix", "selectUnionSuffix", "selectExprs", "selectExprsSuffix", 
		"tables", "tableSuffix", "tableRel", "tableFactor", "tableSubQuery", "tableRecu", 
		"tableJoin", "tableJoinSuffix", "tableJoinMod", "joinCondition", "gbobExprs", 
		"gbobExprSuffix", "updateStat", "updateSingleTable", "updateMultipleTable", 
		"setExprs", "setExprSuffix", "setExpr", "deleteStat", "tableNameAndAlias", 
		"tableNameAndAliases", "tableNameAndAliasSuffix", "whereCondition", "whereCondSub", 
		"whereCondOp", "expression", "exprRelational", "exprBetweenAnd", "exprIsOrIsNotNull", 
		"exprInSelect", "exprInValues", "exprExists", "exprNot", "exprLike", "element", 
		"elementOpFactory", "elementText", "elementSubQuery", "elementDate", "elementListFactor", 
		"elementList", "elementListSuffix", "elementOpEle", "elementOpEleSuffix", 
		"funCall", "paramList", "paramSuffix"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'!'", null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, "'+'", 
		"'-'", "'|'", "'&'", "'<<'", "'>>'", "'*'", "'^'", null, null, null, null, 
		null, "'regexp'", "'~'", "'binary'", "'escape'", "')'", "'('", "']'", 
		"'['", "':'", "'.*'", "'='", "'<'", "'>'", "'!='", "'<='", "'>='", "';'", 
		"','", "'.'", "'collate'", "'index'", "'key'", "'use'", "'ignore'", "'partition'", 
		"'straight_join'", "'natural'", "'oj'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "PLACEHOLDER", "SELECT", "INSERT", "INTO", "VALUES", "DELETE", 
		"FROM", "WHERE", "LIMIT", "NULL", "IS", "IN", "BETWEEN", "EXISTS", "TRUE", 
		"FALSE", "XOR", "DEFAULT", "UPDATE", "SET", "ORDER", "GROUP", "BY", "FOR", 
		"LIKE", "HAVING", "AS", "INNER", "OUTER", "JOIN", "LEFT", "RIGHT", "ON", 
		"DISTINCT", "OFFSET", "ASC", "DESC", "CROSS", "USING", "DATE", "TIME", 
		"TIMESTAMP", "ALL", "ANY", "SOME", "UNION", "UNKNOWN", "LOCK", "SHARE", 
		"MODE", "COMMIT", "ROLLBACK", "AND", "OR", "NOT", "DIV", "MOD", "PLUS", 
		"MINUS", "VERTBAR", "BITAND", "SHIFT_LEFT", "SHIFT_RIGHT", "ASTERISK", 
		"POWER_OP", "INT", "DECIMAL", "STRING", "ID", "COLUMN_REL", "REGEXP", 
		"NEGATION", "BINARY", "ESCAPE", "RPAREN", "LPAREN", "RBRACK", "LBRACK", 
		"COLON", "ALL_FIELDS", "EQ", "LTH", "GTH", "NOT_EQ", "LET", "GET", "SEMI", 
		"COMMA", "DOT", "COLLATE", "INDEX", "KEY", "USE", "IGNORE", "PARTITION", 
		"STRAIGHT_JOIN", "NATURAL", "OJ", "NEWLINE", "WS", "COMMENT1", "COMMENT2", 
		"USER_VAR"
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

	@Override
	public String getGrammarFileName() { return "MySQL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MySQLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StatContext extends ParserRuleContext {
		public InsertStatContext insertStat() {
			return getRuleContext(InsertStatContext.class,0);
		}
		public UpdateStatContext updateStat() {
			return getRuleContext(UpdateStatContext.class,0);
		}
		public DeleteStatContext deleteStat() {
			return getRuleContext(DeleteStatContext.class,0);
		}
		public SelectStatContext selectStat() {
			return getRuleContext(SelectStatContext.class,0);
		}
		public TranscationStatContext transcationStat() {
			return getRuleContext(TranscationStatContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_stat);
		try {
			setState(131);
			switch (_input.LA(1)) {
			case INSERT:
				enterOuterAlt(_localctx, 1);
				{
				setState(126);
				insertStat();
				}
				break;
			case UPDATE:
				enterOuterAlt(_localctx, 2);
				{
				setState(127);
				updateStat();
				}
				break;
			case DELETE:
				enterOuterAlt(_localctx, 3);
				{
				setState(128);
				deleteStat();
				}
				break;
			case SELECT:
			case LPAREN:
				enterOuterAlt(_localctx, 4);
				{
				setState(129);
				selectStat();
				}
				break;
			case COMMIT:
			case ROLLBACK:
				enterOuterAlt(_localctx, 5);
				{
				setState(130);
				transcationStat();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TranscationStatContext extends ParserRuleContext {
		public CommitContext commit() {
			return getRuleContext(CommitContext.class,0);
		}
		public RollbackContext rollback() {
			return getRuleContext(RollbackContext.class,0);
		}
		public TranscationStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transcationStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterTranscationStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitTranscationStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitTranscationStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TranscationStatContext transcationStat() throws RecognitionException {
		TranscationStatContext _localctx = new TranscationStatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_transcationStat);
		try {
			setState(135);
			switch (_input.LA(1)) {
			case COMMIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
				commit();
				}
				break;
			case ROLLBACK:
				enterOuterAlt(_localctx, 2);
				{
				setState(134);
				rollback();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommitContext extends ParserRuleContext {
		public TerminalNode COMMIT() { return getToken(MySQLParser.COMMIT, 0); }
		public CommitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterCommit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitCommit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitCommit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommitContext commit() throws RecognitionException {
		CommitContext _localctx = new CommitContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_commit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(COMMIT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RollbackContext extends ParserRuleContext {
		public TerminalNode ROLLBACK() { return getToken(MySQLParser.ROLLBACK, 0); }
		public RollbackContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rollback; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterRollback(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitRollback(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitRollback(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RollbackContext rollback() throws RecognitionException {
		RollbackContext _localctx = new RollbackContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_rollback);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(ROLLBACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InsertStatContext extends ParserRuleContext {
		public Token tableName;
		public TerminalNode INSERT() { return getToken(MySQLParser.INSERT, 0); }
		public TerminalNode ID() { return getToken(MySQLParser.ID, 0); }
		public SelectStatContext selectStat() {
			return getRuleContext(SelectStatContext.class,0);
		}
		public TerminalNode INTO() { return getToken(MySQLParser.INTO, 0); }
		public ColumnNamesContext columnNames() {
			return getRuleContext(ColumnNamesContext.class,0);
		}
		public TerminalNode VALUES() { return getToken(MySQLParser.VALUES, 0); }
		public ValueListContext valueList() {
			return getRuleContext(ValueListContext.class,0);
		}
		public InsertStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterInsertStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitInsertStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitInsertStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsertStatContext insertStat() throws RecognitionException {
		InsertStatContext _localctx = new InsertStatContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_insertStat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(INSERT);
			setState(143);
			_la = _input.LA(1);
			if (_la==INTO) {
				{
				setState(142);
				match(INTO);
				}
			}

			setState(145);
			((InsertStatContext)_localctx).tableName = match(ID);
			setState(150);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(146);
				match(LPAREN);
				setState(147);
				columnNames();
				setState(148);
				match(RPAREN);
				}
				break;
			}
			setState(158);
			switch (_input.LA(1)) {
			case VALUES:
				{
				{
				setState(152);
				match(VALUES);
				setState(153);
				match(LPAREN);
				setState(154);
				valueList();
				setState(155);
				match(RPAREN);
				}
				}
				break;
			case SELECT:
			case LPAREN:
				{
				setState(157);
				selectStat();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnNamesContext extends ParserRuleContext {
		public Token name;
		public TerminalNode ID() { return getToken(MySQLParser.ID, 0); }
		public ColumnNamesSuffixContext columnNamesSuffix() {
			return getRuleContext(ColumnNamesSuffixContext.class,0);
		}
		public ColumnNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnNames; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterColumnNames(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitColumnNames(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitColumnNames(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnNamesContext columnNames() throws RecognitionException {
		ColumnNamesContext _localctx = new ColumnNamesContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_columnNames);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			((ColumnNamesContext)_localctx).name = match(ID);
			setState(162);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(161);
				columnNamesSuffix();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnNamesSuffixContext extends ParserRuleContext {
		public ColumnNamesContext columnNames() {
			return getRuleContext(ColumnNamesContext.class,0);
		}
		public ColumnNamesSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnNamesSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterColumnNamesSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitColumnNamesSuffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitColumnNamesSuffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnNamesSuffixContext columnNamesSuffix() throws RecognitionException {
		ColumnNamesSuffixContext _localctx = new ColumnNamesSuffixContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_columnNamesSuffix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(COMMA);
			setState(165);
			columnNames();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueListContext extends ParserRuleContext {
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public ValueListSuffixContext valueListSuffix() {
			return getRuleContext(ValueListSuffixContext.class,0);
		}
		public ValueListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterValueList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitValueList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitValueList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueListContext valueList() throws RecognitionException {
		ValueListContext _localctx = new ValueListContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_valueList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			element();
			setState(169);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(168);
				valueListSuffix();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueListSuffixContext extends ParserRuleContext {
		public ValueListContext valueList() {
			return getRuleContext(ValueListContext.class,0);
		}
		public ValueListSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueListSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterValueListSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitValueListSuffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitValueListSuffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueListSuffixContext valueListSuffix() throws RecognitionException {
		ValueListSuffixContext _localctx = new ValueListSuffixContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_valueListSuffix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(COMMA);
			setState(172);
			valueList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectStatContext extends ParserRuleContext {
		public SelectInnerContext selectInner() {
			return getRuleContext(SelectInnerContext.class,0);
		}
		public SelectUnionSuffixContext selectUnionSuffix() {
			return getRuleContext(SelectUnionSuffixContext.class,0);
		}
		public SelectStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterSelectStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitSelectStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitSelectStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectStatContext selectStat() throws RecognitionException {
		SelectStatContext _localctx = new SelectStatContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_selectStat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			switch (_input.LA(1)) {
			case LPAREN:
				{
				setState(174);
				match(LPAREN);
				setState(175);
				selectInner();
				setState(176);
				match(RPAREN);
				}
				break;
			case SELECT:
				{
				setState(178);
				selectInner();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(182);
			_la = _input.LA(1);
			if (_la==UNION) {
				{
				setState(181);
				selectUnionSuffix();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectInnerContext extends ParserRuleContext {
		public SelectPrefixContext selectPrefix() {
			return getRuleContext(SelectPrefixContext.class,0);
		}
		public SelectSuffixContext selectSuffix() {
			return getRuleContext(SelectSuffixContext.class,0);
		}
		public SelectInnerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectInner; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterSelectInner(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitSelectInner(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitSelectInner(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectInnerContext selectInner() throws RecognitionException {
		SelectInnerContext _localctx = new SelectInnerContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_selectInner);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			selectPrefix();
			setState(185);
			selectSuffix();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectPrefixContext extends ParserRuleContext {
		public Token distinct;
		public WhereConditionContext where;
		public GbobExprsContext groupByExprs;
		public WhereConditionContext having;
		public TerminalNode SELECT() { return getToken(MySQLParser.SELECT, 0); }
		public SelectExprsContext selectExprs() {
			return getRuleContext(SelectExprsContext.class,0);
		}
		public TerminalNode FROM() { return getToken(MySQLParser.FROM, 0); }
		public TablesContext tables() {
			return getRuleContext(TablesContext.class,0);
		}
		public TerminalNode WHERE() { return getToken(MySQLParser.WHERE, 0); }
		public TerminalNode GROUP() { return getToken(MySQLParser.GROUP, 0); }
		public TerminalNode BY() { return getToken(MySQLParser.BY, 0); }
		public TerminalNode HAVING() { return getToken(MySQLParser.HAVING, 0); }
		public TerminalNode DISTINCT() { return getToken(MySQLParser.DISTINCT, 0); }
		public List<WhereConditionContext> whereCondition() {
			return getRuleContexts(WhereConditionContext.class);
		}
		public WhereConditionContext whereCondition(int i) {
			return getRuleContext(WhereConditionContext.class,i);
		}
		public GbobExprsContext gbobExprs() {
			return getRuleContext(GbobExprsContext.class,0);
		}
		public SelectPrefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectPrefix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterSelectPrefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitSelectPrefix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitSelectPrefix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectPrefixContext selectPrefix() throws RecognitionException {
		SelectPrefixContext _localctx = new SelectPrefixContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_selectPrefix);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(SELECT);
			setState(189);
			_la = _input.LA(1);
			if (_la==DISTINCT) {
				{
				setState(188);
				((SelectPrefixContext)_localctx).distinct = match(DISTINCT);
				}
			}

			setState(191);
			selectExprs();
			setState(194);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(192);
				match(FROM);
				setState(193);
				tables();
				}
			}

			setState(198);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(196);
				match(WHERE);
				setState(197);
				((SelectPrefixContext)_localctx).where = whereCondition();
				}
			}

			setState(203);
			_la = _input.LA(1);
			if (_la==GROUP) {
				{
				setState(200);
				match(GROUP);
				setState(201);
				match(BY);
				setState(202);
				((SelectPrefixContext)_localctx).groupByExprs = gbobExprs();
				}
			}

			setState(207);
			_la = _input.LA(1);
			if (_la==HAVING) {
				{
				setState(205);
				match(HAVING);
				setState(206);
				((SelectPrefixContext)_localctx).having = whereCondition();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectSuffixContext extends ParserRuleContext {
		public GbobExprsContext orderByExprs;
		public Token offset;
		public Token rowCount;
		public Token lock;
		public TerminalNode ORDER() { return getToken(MySQLParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(MySQLParser.BY, 0); }
		public TerminalNode LIMIT() { return getToken(MySQLParser.LIMIT, 0); }
		public GbobExprsContext gbobExprs() {
			return getRuleContext(GbobExprsContext.class,0);
		}
		public TerminalNode OFFSET() { return getToken(MySQLParser.OFFSET, 0); }
		public TerminalNode FOR() { return getToken(MySQLParser.FOR, 0); }
		public TerminalNode IN() { return getToken(MySQLParser.IN, 0); }
		public TerminalNode SHARE() { return getToken(MySQLParser.SHARE, 0); }
		public TerminalNode MODE() { return getToken(MySQLParser.MODE, 0); }
		public List<TerminalNode> INT() { return getTokens(MySQLParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(MySQLParser.INT, i);
		}
		public TerminalNode UPDATE() { return getToken(MySQLParser.UPDATE, 0); }
		public TerminalNode LOCK() { return getToken(MySQLParser.LOCK, 0); }
		public SelectSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterSelectSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitSelectSuffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitSelectSuffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectSuffixContext selectSuffix() throws RecognitionException {
		SelectSuffixContext _localctx = new SelectSuffixContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_selectSuffix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(209);
				match(ORDER);
				setState(210);
				match(BY);
				setState(211);
				((SelectSuffixContext)_localctx).orderByExprs = gbobExprs();
				}
				break;
			}
			setState(223);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(214);
				match(LIMIT);
				{
				setState(217);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(215);
					((SelectSuffixContext)_localctx).offset = match(INT);
					setState(216);
					match(COMMA);
					}
					break;
				}
				setState(219);
				((SelectSuffixContext)_localctx).rowCount = match(INT);
				}
				}
				break;
			case 2:
				{
				{
				setState(220);
				((SelectSuffixContext)_localctx).rowCount = match(INT);
				setState(221);
				match(OFFSET);
				setState(222);
				((SelectSuffixContext)_localctx).offset = match(INT);
				}
				}
				break;
			}
			setState(231);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				{
				setState(225);
				match(FOR);
				setState(226);
				((SelectSuffixContext)_localctx).lock = match(UPDATE);
				}
				}
				break;
			case 2:
				{
				{
				setState(227);
				((SelectSuffixContext)_localctx).lock = match(LOCK);
				setState(228);
				match(IN);
				setState(229);
				match(SHARE);
				setState(230);
				match(MODE);
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectUnionSuffixContext extends ParserRuleContext {
		public Token method;
		public TerminalNode UNION() { return getToken(MySQLParser.UNION, 0); }
		public SelectSuffixContext selectSuffix() {
			return getRuleContext(SelectSuffixContext.class,0);
		}
		public SelectStatContext selectStat() {
			return getRuleContext(SelectStatContext.class,0);
		}
		public TerminalNode ALL() { return getToken(MySQLParser.ALL, 0); }
		public TerminalNode DISTINCT() { return getToken(MySQLParser.DISTINCT, 0); }
		public SelectUnionSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectUnionSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterSelectUnionSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitSelectUnionSuffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitSelectUnionSuffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectUnionSuffixContext selectUnionSuffix() throws RecognitionException {
		SelectUnionSuffixContext _localctx = new SelectUnionSuffixContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_selectUnionSuffix);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			match(UNION);
			setState(235);
			_la = _input.LA(1);
			if (_la==DISTINCT || _la==ALL) {
				{
				setState(234);
				((SelectUnionSuffixContext)_localctx).method = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==DISTINCT || _la==ALL) ) {
					((SelectUnionSuffixContext)_localctx).method = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(242);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(237);
				match(LPAREN);
				setState(238);
				selectStat();
				setState(239);
				match(RPAREN);
				}
				break;
			case 2:
				{
				setState(241);
				selectStat();
				}
				break;
			}
			setState(244);
			selectSuffix();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectExprsContext extends ParserRuleContext {
		public Token alias;
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public SelectExprsSuffixContext selectExprsSuffix() {
			return getRuleContext(SelectExprsSuffixContext.class,0);
		}
		public TerminalNode ID() { return getToken(MySQLParser.ID, 0); }
		public TerminalNode AS() { return getToken(MySQLParser.AS, 0); }
		public SelectExprsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectExprs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterSelectExprs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitSelectExprs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitSelectExprs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectExprsContext selectExprs() throws RecognitionException {
		SelectExprsContext _localctx = new SelectExprsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_selectExprs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			element();
			setState(251);
			_la = _input.LA(1);
			if (_la==AS || _la==ID) {
				{
				setState(248);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(247);
					match(AS);
					}
				}

				setState(250);
				((SelectExprsContext)_localctx).alias = match(ID);
				}
			}

			setState(254);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(253);
				selectExprsSuffix();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectExprsSuffixContext extends ParserRuleContext {
		public SelectExprsContext selectExprs() {
			return getRuleContext(SelectExprsContext.class,0);
		}
		public SelectExprsSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectExprsSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterSelectExprsSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitSelectExprsSuffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitSelectExprsSuffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectExprsSuffixContext selectExprsSuffix() throws RecognitionException {
		SelectExprsSuffixContext _localctx = new SelectExprsSuffixContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_selectExprsSuffix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			match(COMMA);
			setState(257);
			selectExprs();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TablesContext extends ParserRuleContext {
		public TableRelContext tableRel() {
			return getRuleContext(TableRelContext.class,0);
		}
		public TableSuffixContext tableSuffix() {
			return getRuleContext(TableSuffixContext.class,0);
		}
		public TablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterTables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitTables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitTables(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablesContext tables() throws RecognitionException {
		TablesContext _localctx = new TablesContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_tables);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			tableRel();
			setState(261);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(260);
				tableSuffix();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableSuffixContext extends ParserRuleContext {
		public TablesContext tables() {
			return getRuleContext(TablesContext.class,0);
		}
		public TableSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterTableSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitTableSuffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitTableSuffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableSuffixContext tableSuffix() throws RecognitionException {
		TableSuffixContext _localctx = new TableSuffixContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_tableSuffix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			match(COMMA);
			setState(264);
			tables();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableRelContext extends ParserRuleContext {
		public TableFactorContext tableFactor() {
			return getRuleContext(TableFactorContext.class,0);
		}
		public TableJoinContext tableJoin() {
			return getRuleContext(TableJoinContext.class,0);
		}
		public TableRelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableRel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterTableRel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitTableRel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitTableRel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableRelContext tableRel() throws RecognitionException {
		TableRelContext _localctx = new TableRelContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_tableRel);
		try {
			setState(268);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(266);
				tableFactor();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(267);
				tableJoin();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableFactorContext extends ParserRuleContext {
		public TableNameAndAliasContext tableNameAndAlias() {
			return getRuleContext(TableNameAndAliasContext.class,0);
		}
		public TableSubQueryContext tableSubQuery() {
			return getRuleContext(TableSubQueryContext.class,0);
		}
		public TableRecuContext tableRecu() {
			return getRuleContext(TableRecuContext.class,0);
		}
		public TableFactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableFactor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterTableFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitTableFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitTableFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableFactorContext tableFactor() throws RecognitionException {
		TableFactorContext _localctx = new TableFactorContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_tableFactor);
		try {
			setState(273);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(270);
				tableNameAndAlias();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(271);
				tableSubQuery();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(272);
				tableRecu();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableSubQueryContext extends ParserRuleContext {
		public Token alias;
		public SelectStatContext selectStat() {
			return getRuleContext(SelectStatContext.class,0);
		}
		public TerminalNode ID() { return getToken(MySQLParser.ID, 0); }
		public TerminalNode AS() { return getToken(MySQLParser.AS, 0); }
		public TableSubQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableSubQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterTableSubQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitTableSubQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitTableSubQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableSubQueryContext tableSubQuery() throws RecognitionException {
		TableSubQueryContext _localctx = new TableSubQueryContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_tableSubQuery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			match(LPAREN);
			setState(276);
			selectStat();
			setState(277);
			match(RPAREN);
			setState(279);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(278);
				match(AS);
				}
			}

			setState(281);
			((TableSubQueryContext)_localctx).alias = match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableRecuContext extends ParserRuleContext {
		public TableRelContext tableRel() {
			return getRuleContext(TableRelContext.class,0);
		}
		public TableRecuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableRecu; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterTableRecu(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitTableRecu(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitTableRecu(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableRecuContext tableRecu() throws RecognitionException {
		TableRecuContext _localctx = new TableRecuContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_tableRecu);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			match(LPAREN);
			setState(284);
			tableRel();
			setState(285);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableJoinContext extends ParserRuleContext {
		public TableNameAndAliasContext tableNameAndAlias() {
			return getRuleContext(TableNameAndAliasContext.class,0);
		}
		public TableJoinSuffixContext tableJoinSuffix() {
			return getRuleContext(TableJoinSuffixContext.class,0);
		}
		public TableJoinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableJoin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterTableJoin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitTableJoin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitTableJoin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableJoinContext tableJoin() throws RecognitionException {
		TableJoinContext _localctx = new TableJoinContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_tableJoin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			tableNameAndAlias();
			setState(288);
			tableJoinSuffix();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableJoinSuffixContext extends ParserRuleContext {
		public TableJoinModContext tableJoinMod() {
			return getRuleContext(TableJoinModContext.class,0);
		}
		public TerminalNode JOIN() { return getToken(MySQLParser.JOIN, 0); }
		public JoinConditionContext joinCondition() {
			return getRuleContext(JoinConditionContext.class,0);
		}
		public TableNameAndAliasesContext tableNameAndAliases() {
			return getRuleContext(TableNameAndAliasesContext.class,0);
		}
		public TableJoinSuffixContext tableJoinSuffix() {
			return getRuleContext(TableJoinSuffixContext.class,0);
		}
		public TableJoinSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableJoinSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterTableJoinSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitTableJoinSuffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitTableJoinSuffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableJoinSuffixContext tableJoinSuffix() throws RecognitionException {
		TableJoinSuffixContext _localctx = new TableJoinSuffixContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_tableJoinSuffix);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			tableJoinMod();
			setState(291);
			match(JOIN);
			setState(297);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(292);
				tableNameAndAliases();
				}
				break;
			case LPAREN:
				{
				setState(293);
				match(LPAREN);
				setState(294);
				tableNameAndAliases();
				setState(295);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(299);
			joinCondition();
			setState(301);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INNER) | (1L << LEFT) | (1L << RIGHT) | (1L << CROSS))) != 0)) {
				{
				setState(300);
				tableJoinSuffix();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableJoinModContext extends ParserRuleContext {
		public TerminalNode INNER() { return getToken(MySQLParser.INNER, 0); }
		public TerminalNode CROSS() { return getToken(MySQLParser.CROSS, 0); }
		public TerminalNode LEFT() { return getToken(MySQLParser.LEFT, 0); }
		public TerminalNode OUTER() { return getToken(MySQLParser.OUTER, 0); }
		public TerminalNode RIGHT() { return getToken(MySQLParser.RIGHT, 0); }
		public TableJoinModContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableJoinMod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterTableJoinMod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitTableJoinMod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitTableJoinMod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableJoinModContext tableJoinMod() throws RecognitionException {
		TableJoinModContext _localctx = new TableJoinModContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_tableJoinMod);
		int _la;
		try {
			setState(313);
			switch (_input.LA(1)) {
			case INNER:
				enterOuterAlt(_localctx, 1);
				{
				setState(303);
				match(INNER);
				}
				break;
			case CROSS:
				enterOuterAlt(_localctx, 2);
				{
				setState(304);
				match(CROSS);
				}
				break;
			case LEFT:
				enterOuterAlt(_localctx, 3);
				{
				setState(305);
				match(LEFT);
				setState(307);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(306);
					match(OUTER);
					}
				}

				}
				break;
			case RIGHT:
				enterOuterAlt(_localctx, 4);
				{
				setState(309);
				match(RIGHT);
				setState(311);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(310);
					match(OUTER);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JoinConditionContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(MySQLParser.ON, 0); }
		public WhereConditionContext whereCondition() {
			return getRuleContext(WhereConditionContext.class,0);
		}
		public TerminalNode USING() { return getToken(MySQLParser.USING, 0); }
		public ColumnNamesContext columnNames() {
			return getRuleContext(ColumnNamesContext.class,0);
		}
		public JoinConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterJoinCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitJoinCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitJoinCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinConditionContext joinCondition() throws RecognitionException {
		JoinConditionContext _localctx = new JoinConditionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_joinCondition);
		try {
			setState(322);
			switch (_input.LA(1)) {
			case ON:
				enterOuterAlt(_localctx, 1);
				{
				setState(315);
				match(ON);
				setState(316);
				whereCondition();
				}
				break;
			case USING:
				enterOuterAlt(_localctx, 2);
				{
				setState(317);
				match(USING);
				setState(318);
				match(LPAREN);
				setState(319);
				columnNames();
				setState(320);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GbobExprsContext extends ParserRuleContext {
		public Token sc;
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public GbobExprSuffixContext gbobExprSuffix() {
			return getRuleContext(GbobExprSuffixContext.class,0);
		}
		public TerminalNode ASC() { return getToken(MySQLParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(MySQLParser.DESC, 0); }
		public GbobExprsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gbobExprs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterGbobExprs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitGbobExprs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitGbobExprs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GbobExprsContext gbobExprs() throws RecognitionException {
		GbobExprsContext _localctx = new GbobExprsContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_gbobExprs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			element();
			setState(326);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(325);
				((GbobExprsContext)_localctx).sc = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
					((GbobExprsContext)_localctx).sc = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(329);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(328);
				gbobExprSuffix();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GbobExprSuffixContext extends ParserRuleContext {
		public GbobExprsContext gbobExprs() {
			return getRuleContext(GbobExprsContext.class,0);
		}
		public GbobExprSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gbobExprSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterGbobExprSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitGbobExprSuffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitGbobExprSuffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GbobExprSuffixContext gbobExprSuffix() throws RecognitionException {
		GbobExprSuffixContext _localctx = new GbobExprSuffixContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_gbobExprSuffix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			match(COMMA);
			setState(332);
			gbobExprs();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UpdateStatContext extends ParserRuleContext {
		public UpdateSingleTableContext updateSingleTable() {
			return getRuleContext(UpdateSingleTableContext.class,0);
		}
		public UpdateMultipleTableContext updateMultipleTable() {
			return getRuleContext(UpdateMultipleTableContext.class,0);
		}
		public UpdateStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_updateStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterUpdateStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitUpdateStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitUpdateStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UpdateStatContext updateStat() throws RecognitionException {
		UpdateStatContext _localctx = new UpdateStatContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_updateStat);
		try {
			setState(336);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(334);
				updateSingleTable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(335);
				updateMultipleTable();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UpdateSingleTableContext extends ParserRuleContext {
		public Token rowCount;
		public TerminalNode UPDATE() { return getToken(MySQLParser.UPDATE, 0); }
		public TableNameAndAliasContext tableNameAndAlias() {
			return getRuleContext(TableNameAndAliasContext.class,0);
		}
		public TerminalNode SET() { return getToken(MySQLParser.SET, 0); }
		public SetExprsContext setExprs() {
			return getRuleContext(SetExprsContext.class,0);
		}
		public TerminalNode WHERE() { return getToken(MySQLParser.WHERE, 0); }
		public WhereConditionContext whereCondition() {
			return getRuleContext(WhereConditionContext.class,0);
		}
		public TerminalNode LIMIT() { return getToken(MySQLParser.LIMIT, 0); }
		public TerminalNode INT() { return getToken(MySQLParser.INT, 0); }
		public TerminalNode PLACEHOLDER() { return getToken(MySQLParser.PLACEHOLDER, 0); }
		public UpdateSingleTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_updateSingleTable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterUpdateSingleTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitUpdateSingleTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitUpdateSingleTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UpdateSingleTableContext updateSingleTable() throws RecognitionException {
		UpdateSingleTableContext _localctx = new UpdateSingleTableContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_updateSingleTable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			match(UPDATE);
			setState(339);
			tableNameAndAlias();
			setState(340);
			match(SET);
			setState(341);
			setExprs();
			setState(344);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(342);
				match(WHERE);
				setState(343);
				whereCondition();
				}
			}

			setState(348);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(346);
				match(LIMIT);
				setState(347);
				((UpdateSingleTableContext)_localctx).rowCount = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PLACEHOLDER || _la==INT) ) {
					((UpdateSingleTableContext)_localctx).rowCount = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UpdateMultipleTableContext extends ParserRuleContext {
		public TerminalNode UPDATE() { return getToken(MySQLParser.UPDATE, 0); }
		public TableNameAndAliasesContext tableNameAndAliases() {
			return getRuleContext(TableNameAndAliasesContext.class,0);
		}
		public TerminalNode SET() { return getToken(MySQLParser.SET, 0); }
		public SetExprsContext setExprs() {
			return getRuleContext(SetExprsContext.class,0);
		}
		public TerminalNode WHERE() { return getToken(MySQLParser.WHERE, 0); }
		public WhereConditionContext whereCondition() {
			return getRuleContext(WhereConditionContext.class,0);
		}
		public UpdateMultipleTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_updateMultipleTable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterUpdateMultipleTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitUpdateMultipleTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitUpdateMultipleTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UpdateMultipleTableContext updateMultipleTable() throws RecognitionException {
		UpdateMultipleTableContext _localctx = new UpdateMultipleTableContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_updateMultipleTable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			match(UPDATE);
			setState(351);
			tableNameAndAliases();
			setState(352);
			match(SET);
			setState(353);
			setExprs();
			setState(356);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(354);
				match(WHERE);
				setState(355);
				whereCondition();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetExprsContext extends ParserRuleContext {
		public SetExprContext setExpr() {
			return getRuleContext(SetExprContext.class,0);
		}
		public SetExprSuffixContext setExprSuffix() {
			return getRuleContext(SetExprSuffixContext.class,0);
		}
		public SetExprsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setExprs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterSetExprs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitSetExprs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitSetExprs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetExprsContext setExprs() throws RecognitionException {
		SetExprsContext _localctx = new SetExprsContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_setExprs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			setExpr();
			setState(360);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(359);
				setExprSuffix();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetExprSuffixContext extends ParserRuleContext {
		public SetExprsContext setExprs() {
			return getRuleContext(SetExprsContext.class,0);
		}
		public SetExprSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setExprSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterSetExprSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitSetExprSuffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitSetExprSuffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetExprSuffixContext setExprSuffix() throws RecognitionException {
		SetExprSuffixContext _localctx = new SetExprSuffixContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_setExprSuffix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			match(COMMA);
			setState(363);
			setExprs();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetExprContext extends ParserRuleContext {
		public ElementContext left;
		public ElementContext right;
		public Token rightDefault;
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public TerminalNode DEFAULT() { return getToken(MySQLParser.DEFAULT, 0); }
		public SetExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterSetExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitSetExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitSetExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetExprContext setExpr() throws RecognitionException {
		SetExprContext _localctx = new SetExprContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_setExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			((SetExprContext)_localctx).left = element();
			setState(366);
			match(EQ);
			setState(369);
			switch (_input.LA(1)) {
			case PLACEHOLDER:
			case NULL:
			case TRUE:
			case FALSE:
			case DATE:
			case TIME:
			case TIMESTAMP:
			case ALL:
			case ANY:
			case SOME:
			case UNKNOWN:
			case ASTERISK:
			case INT:
			case DECIMAL:
			case STRING:
			case ID:
			case COLUMN_REL:
			case LPAREN:
				{
				setState(367);
				((SetExprContext)_localctx).right = element();
				}
				break;
			case DEFAULT:
				{
				setState(368);
				((SetExprContext)_localctx).rightDefault = match(DEFAULT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeleteStatContext extends ParserRuleContext {
		public Token rowCount;
		public TerminalNode DELETE() { return getToken(MySQLParser.DELETE, 0); }
		public TerminalNode FROM() { return getToken(MySQLParser.FROM, 0); }
		public TableNameAndAliasContext tableNameAndAlias() {
			return getRuleContext(TableNameAndAliasContext.class,0);
		}
		public TerminalNode WHERE() { return getToken(MySQLParser.WHERE, 0); }
		public WhereConditionContext whereCondition() {
			return getRuleContext(WhereConditionContext.class,0);
		}
		public TerminalNode LIMIT() { return getToken(MySQLParser.LIMIT, 0); }
		public TerminalNode INT() { return getToken(MySQLParser.INT, 0); }
		public TerminalNode PLACEHOLDER() { return getToken(MySQLParser.PLACEHOLDER, 0); }
		public DeleteStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deleteStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterDeleteStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitDeleteStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitDeleteStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeleteStatContext deleteStat() throws RecognitionException {
		DeleteStatContext _localctx = new DeleteStatContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_deleteStat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			match(DELETE);
			setState(372);
			match(FROM);
			setState(373);
			tableNameAndAlias();
			setState(376);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(374);
				match(WHERE);
				setState(375);
				whereCondition();
				}
			}

			setState(380);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(378);
				match(LIMIT);
				setState(379);
				((DeleteStatContext)_localctx).rowCount = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PLACEHOLDER || _la==INT) ) {
					((DeleteStatContext)_localctx).rowCount = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableNameAndAliasContext extends ParserRuleContext {
		public Token name;
		public Token alias;
		public List<TerminalNode> ID() { return getTokens(MySQLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MySQLParser.ID, i);
		}
		public TerminalNode AS() { return getToken(MySQLParser.AS, 0); }
		public TableNameAndAliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableNameAndAlias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterTableNameAndAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitTableNameAndAlias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitTableNameAndAlias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableNameAndAliasContext tableNameAndAlias() throws RecognitionException {
		TableNameAndAliasContext _localctx = new TableNameAndAliasContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_tableNameAndAlias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			((TableNameAndAliasContext)_localctx).name = match(ID);
			setState(387);
			_la = _input.LA(1);
			if (_la==AS || _la==ID) {
				{
				setState(384);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(383);
					match(AS);
					}
				}

				setState(386);
				((TableNameAndAliasContext)_localctx).alias = match(ID);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableNameAndAliasesContext extends ParserRuleContext {
		public TableNameAndAliasContext tableNameAndAlias() {
			return getRuleContext(TableNameAndAliasContext.class,0);
		}
		public TableNameAndAliasSuffixContext tableNameAndAliasSuffix() {
			return getRuleContext(TableNameAndAliasSuffixContext.class,0);
		}
		public TableNameAndAliasesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableNameAndAliases; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterTableNameAndAliases(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitTableNameAndAliases(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitTableNameAndAliases(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableNameAndAliasesContext tableNameAndAliases() throws RecognitionException {
		TableNameAndAliasesContext _localctx = new TableNameAndAliasesContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_tableNameAndAliases);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			tableNameAndAlias();
			setState(391);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(390);
				tableNameAndAliasSuffix();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableNameAndAliasSuffixContext extends ParserRuleContext {
		public TableNameAndAliasesContext tableNameAndAliases() {
			return getRuleContext(TableNameAndAliasesContext.class,0);
		}
		public TableNameAndAliasSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableNameAndAliasSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterTableNameAndAliasSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitTableNameAndAliasSuffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitTableNameAndAliasSuffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableNameAndAliasSuffixContext tableNameAndAliasSuffix() throws RecognitionException {
		TableNameAndAliasSuffixContext _localctx = new TableNameAndAliasSuffixContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_tableNameAndAliasSuffix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			match(COMMA);
			setState(394);
			tableNameAndAliases();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhereConditionContext extends ParserRuleContext {
		public WhereCondSubContext whereCondSub() {
			return getRuleContext(WhereCondSubContext.class,0);
		}
		public WhereCondOpContext whereCondOp() {
			return getRuleContext(WhereCondOpContext.class,0);
		}
		public WhereConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterWhereCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitWhereCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitWhereCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereConditionContext whereCondition() throws RecognitionException {
		WhereConditionContext _localctx = new WhereConditionContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_whereCondition);
		try {
			setState(398);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(396);
				whereCondSub();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(397);
				whereCondOp();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhereCondSubContext extends ParserRuleContext {
		public WhereConditionContext wc1;
		public Token expressionOperator;
		public WhereConditionContext wc2;
		public List<WhereConditionContext> whereCondition() {
			return getRuleContexts(WhereConditionContext.class);
		}
		public WhereConditionContext whereCondition(int i) {
			return getRuleContext(WhereConditionContext.class,i);
		}
		public TerminalNode AND() { return getToken(MySQLParser.AND, 0); }
		public TerminalNode XOR() { return getToken(MySQLParser.XOR, 0); }
		public TerminalNode OR() { return getToken(MySQLParser.OR, 0); }
		public WhereCondSubContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereCondSub; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterWhereCondSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitWhereCondSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitWhereCondSub(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereCondSubContext whereCondSub() throws RecognitionException {
		WhereCondSubContext _localctx = new WhereCondSubContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_whereCondSub);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
			match(LPAREN);
			setState(401);
			((WhereCondSubContext)_localctx).wc1 = whereCondition();
			setState(402);
			match(RPAREN);
			setState(405);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << XOR) | (1L << AND) | (1L << OR))) != 0)) {
				{
				setState(403);
				((WhereCondSubContext)_localctx).expressionOperator = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << XOR) | (1L << AND) | (1L << OR))) != 0)) ) {
					((WhereCondSubContext)_localctx).expressionOperator = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(404);
				((WhereCondSubContext)_localctx).wc2 = whereCondition();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhereCondOpContext extends ParserRuleContext {
		public Token expressionOperator;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public WhereConditionContext whereCondition() {
			return getRuleContext(WhereConditionContext.class,0);
		}
		public TerminalNode AND() { return getToken(MySQLParser.AND, 0); }
		public TerminalNode XOR() { return getToken(MySQLParser.XOR, 0); }
		public TerminalNode OR() { return getToken(MySQLParser.OR, 0); }
		public WhereCondOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereCondOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterWhereCondOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitWhereCondOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitWhereCondOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereCondOpContext whereCondOp() throws RecognitionException {
		WhereCondOpContext _localctx = new WhereCondOpContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_whereCondOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
			expression();
			setState(410);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << XOR) | (1L << AND) | (1L << OR))) != 0)) {
				{
				setState(408);
				((WhereCondOpContext)_localctx).expressionOperator = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << XOR) | (1L << AND) | (1L << OR))) != 0)) ) {
					((WhereCondOpContext)_localctx).expressionOperator = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(409);
				whereCondition();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ExprRelationalContext exprRelational() {
			return getRuleContext(ExprRelationalContext.class,0);
		}
		public ExprBetweenAndContext exprBetweenAnd() {
			return getRuleContext(ExprBetweenAndContext.class,0);
		}
		public ExprIsOrIsNotNullContext exprIsOrIsNotNull() {
			return getRuleContext(ExprIsOrIsNotNullContext.class,0);
		}
		public ExprInSelectContext exprInSelect() {
			return getRuleContext(ExprInSelectContext.class,0);
		}
		public ExprInValuesContext exprInValues() {
			return getRuleContext(ExprInValuesContext.class,0);
		}
		public ExprExistsContext exprExists() {
			return getRuleContext(ExprExistsContext.class,0);
		}
		public ExprNotContext exprNot() {
			return getRuleContext(ExprNotContext.class,0);
		}
		public ExprLikeContext exprLike() {
			return getRuleContext(ExprLikeContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_expression);
		try {
			setState(420);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(412);
				exprRelational();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(413);
				exprBetweenAnd();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(414);
				exprIsOrIsNotNull();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(415);
				exprInSelect();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(416);
				exprInValues();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(417);
				exprExists();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(418);
				exprNot();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(419);
				exprLike();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprRelationalContext extends ParserRuleContext {
		public ElementContext left;
		public Token relationalOp;
		public ElementContext right;
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public TerminalNode EQ() { return getToken(MySQLParser.EQ, 0); }
		public TerminalNode LTH() { return getToken(MySQLParser.LTH, 0); }
		public TerminalNode GTH() { return getToken(MySQLParser.GTH, 0); }
		public TerminalNode NOT_EQ() { return getToken(MySQLParser.NOT_EQ, 0); }
		public TerminalNode LET() { return getToken(MySQLParser.LET, 0); }
		public TerminalNode GET() { return getToken(MySQLParser.GET, 0); }
		public ExprRelationalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprRelational; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterExprRelational(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitExprRelational(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitExprRelational(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprRelationalContext exprRelational() throws RecognitionException {
		ExprRelationalContext _localctx = new ExprRelationalContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_exprRelational);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
			((ExprRelationalContext)_localctx).left = element();
			setState(423);
			((ExprRelationalContext)_localctx).relationalOp = _input.LT(1);
			_la = _input.LA(1);
			if ( !(((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & ((1L << (EQ - 82)) | (1L << (LTH - 82)) | (1L << (GTH - 82)) | (1L << (NOT_EQ - 82)) | (1L << (LET - 82)) | (1L << (GET - 82)))) != 0)) ) {
				((ExprRelationalContext)_localctx).relationalOp = (Token)_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(424);
			((ExprRelationalContext)_localctx).right = element();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprBetweenAndContext extends ParserRuleContext {
		public ElementContext el;
		public Token not;
		public ElementContext left;
		public ElementContext right;
		public TerminalNode BETWEEN() { return getToken(MySQLParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(MySQLParser.AND, 0); }
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public TerminalNode NOT() { return getToken(MySQLParser.NOT, 0); }
		public ExprBetweenAndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprBetweenAnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterExprBetweenAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitExprBetweenAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitExprBetweenAnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprBetweenAndContext exprBetweenAnd() throws RecognitionException {
		ExprBetweenAndContext _localctx = new ExprBetweenAndContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_exprBetweenAnd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(426);
			((ExprBetweenAndContext)_localctx).el = element();
			setState(428);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(427);
				((ExprBetweenAndContext)_localctx).not = match(NOT);
				}
			}

			setState(430);
			match(BETWEEN);
			setState(431);
			((ExprBetweenAndContext)_localctx).left = element();
			setState(432);
			match(AND);
			setState(433);
			((ExprBetweenAndContext)_localctx).right = element();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprIsOrIsNotNullContext extends ParserRuleContext {
		public Token not;
		public Token what;
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public TerminalNode IS() { return getToken(MySQLParser.IS, 0); }
		public TerminalNode NULL() { return getToken(MySQLParser.NULL, 0); }
		public TerminalNode TRUE() { return getToken(MySQLParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(MySQLParser.FALSE, 0); }
		public TerminalNode UNKNOWN() { return getToken(MySQLParser.UNKNOWN, 0); }
		public TerminalNode NOT() { return getToken(MySQLParser.NOT, 0); }
		public ExprIsOrIsNotNullContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprIsOrIsNotNull; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterExprIsOrIsNotNull(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitExprIsOrIsNotNull(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitExprIsOrIsNotNull(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprIsOrIsNotNullContext exprIsOrIsNotNull() throws RecognitionException {
		ExprIsOrIsNotNullContext _localctx = new ExprIsOrIsNotNullContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_exprIsOrIsNotNull);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
			element();
			setState(436);
			match(IS);
			setState(438);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(437);
				((ExprIsOrIsNotNullContext)_localctx).not = match(NOT);
				}
			}

			setState(440);
			((ExprIsOrIsNotNullContext)_localctx).what = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << UNKNOWN))) != 0)) ) {
				((ExprIsOrIsNotNullContext)_localctx).what = (Token)_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprInSelectContext extends ParserRuleContext {
		public Token not;
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public TerminalNode IN() { return getToken(MySQLParser.IN, 0); }
		public SelectStatContext selectStat() {
			return getRuleContext(SelectStatContext.class,0);
		}
		public TerminalNode NOT() { return getToken(MySQLParser.NOT, 0); }
		public ExprInSelectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprInSelect; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterExprInSelect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitExprInSelect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitExprInSelect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprInSelectContext exprInSelect() throws RecognitionException {
		ExprInSelectContext _localctx = new ExprInSelectContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_exprInSelect);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(442);
			element();
			setState(444);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(443);
				((ExprInSelectContext)_localctx).not = match(NOT);
				}
			}

			setState(446);
			match(IN);
			setState(447);
			match(LPAREN);
			setState(448);
			selectStat();
			setState(449);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprInValuesContext extends ParserRuleContext {
		public Token not;
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public TerminalNode IN() { return getToken(MySQLParser.IN, 0); }
		public ValueListContext valueList() {
			return getRuleContext(ValueListContext.class,0);
		}
		public TerminalNode NOT() { return getToken(MySQLParser.NOT, 0); }
		public ExprInValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprInValues; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterExprInValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitExprInValues(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitExprInValues(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprInValuesContext exprInValues() throws RecognitionException {
		ExprInValuesContext _localctx = new ExprInValuesContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_exprInValues);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
			element();
			setState(453);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(452);
				((ExprInValuesContext)_localctx).not = match(NOT);
				}
			}

			setState(455);
			match(IN);
			setState(456);
			match(LPAREN);
			setState(457);
			valueList();
			setState(458);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprExistsContext extends ParserRuleContext {
		public Token not;
		public TerminalNode EXISTS() { return getToken(MySQLParser.EXISTS, 0); }
		public SelectStatContext selectStat() {
			return getRuleContext(SelectStatContext.class,0);
		}
		public TerminalNode NOT() { return getToken(MySQLParser.NOT, 0); }
		public ExprExistsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprExists; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterExprExists(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitExprExists(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitExprExists(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprExistsContext exprExists() throws RecognitionException {
		ExprExistsContext _localctx = new ExprExistsContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_exprExists);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(460);
				((ExprExistsContext)_localctx).not = match(NOT);
				}
			}

			setState(463);
			match(EXISTS);
			setState(464);
			match(LPAREN);
			setState(465);
			selectStat();
			setState(466);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprNotContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NOT() { return getToken(MySQLParser.NOT, 0); }
		public ExprNotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprNot; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterExprNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitExprNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitExprNot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprNotContext exprNot() throws RecognitionException {
		ExprNotContext _localctx = new ExprNotContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_exprNot);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(468);
			_la = _input.LA(1);
			if ( !(_la==T__0 || _la==NOT) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(469);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprLikeContext extends ParserRuleContext {
		public ElementContext left;
		public Token not;
		public ElementContext right;
		public TerminalNode LIKE() { return getToken(MySQLParser.LIKE, 0); }
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public TerminalNode NOT() { return getToken(MySQLParser.NOT, 0); }
		public ExprLikeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprLike; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterExprLike(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitExprLike(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitExprLike(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprLikeContext exprLike() throws RecognitionException {
		ExprLikeContext _localctx = new ExprLikeContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_exprLike);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(471);
			((ExprLikeContext)_localctx).left = element();
			setState(473);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(472);
				((ExprLikeContext)_localctx).not = match(NOT);
				}
			}

			setState(475);
			match(LIKE);
			setState(476);
			((ExprLikeContext)_localctx).right = element();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementContext extends ParserRuleContext {
		public ElementOpFactoryContext elementOpFactory() {
			return getRuleContext(ElementOpFactoryContext.class,0);
		}
		public ElementListFactorContext elementListFactor() {
			return getRuleContext(ElementListFactorContext.class,0);
		}
		public ElementOpEleContext elementOpEle() {
			return getRuleContext(ElementOpEleContext.class,0);
		}
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_element);
		try {
			setState(481);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(478);
				elementOpFactory();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(479);
				elementListFactor();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(480);
				elementOpEle();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementOpFactoryContext extends ParserRuleContext {
		public ElementTextContext elementText() {
			return getRuleContext(ElementTextContext.class,0);
		}
		public FunCallContext funCall() {
			return getRuleContext(FunCallContext.class,0);
		}
		public ElementSubQueryContext elementSubQuery() {
			return getRuleContext(ElementSubQueryContext.class,0);
		}
		public ElementDateContext elementDate() {
			return getRuleContext(ElementDateContext.class,0);
		}
		public ElementOpFactoryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementOpFactory; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterElementOpFactory(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitElementOpFactory(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitElementOpFactory(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementOpFactoryContext elementOpFactory() throws RecognitionException {
		ElementOpFactoryContext _localctx = new ElementOpFactoryContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_elementOpFactory);
		try {
			setState(487);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(483);
				elementText();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(484);
				funCall();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(485);
				elementSubQuery();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(486);
				elementDate();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementTextContext extends ParserRuleContext {
		public TerminalNode PLACEHOLDER() { return getToken(MySQLParser.PLACEHOLDER, 0); }
		public TerminalNode COLUMN_REL() { return getToken(MySQLParser.COLUMN_REL, 0); }
		public List<TerminalNode> DECIMAL() { return getTokens(MySQLParser.DECIMAL); }
		public TerminalNode DECIMAL(int i) {
			return getToken(MySQLParser.DECIMAL, i);
		}
		public TerminalNode STRING() { return getToken(MySQLParser.STRING, 0); }
		public TerminalNode ID() { return getToken(MySQLParser.ID, 0); }
		public TerminalNode TRUE() { return getToken(MySQLParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(MySQLParser.FALSE, 0); }
		public TerminalNode INT() { return getToken(MySQLParser.INT, 0); }
		public TerminalNode NULL() { return getToken(MySQLParser.NULL, 0); }
		public TerminalNode UNKNOWN() { return getToken(MySQLParser.UNKNOWN, 0); }
		public ElementTextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementText; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterElementText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitElementText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitElementText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementTextContext elementText() throws RecognitionException {
		ElementTextContext _localctx = new ElementTextContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_elementText);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(489);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLACEHOLDER) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << UNKNOWN))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (ASTERISK - 65)) | (1L << (INT - 65)) | (1L << (DECIMAL - 65)) | (1L << (STRING - 65)) | (1L << (ID - 65)) | (1L << (COLUMN_REL - 65)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementSubQueryContext extends ParserRuleContext {
		public Token sqWith;
		public SelectStatContext selectStat() {
			return getRuleContext(SelectStatContext.class,0);
		}
		public TerminalNode ANY() { return getToken(MySQLParser.ANY, 0); }
		public TerminalNode SOME() { return getToken(MySQLParser.SOME, 0); }
		public TerminalNode ALL() { return getToken(MySQLParser.ALL, 0); }
		public ElementSubQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementSubQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterElementSubQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitElementSubQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitElementSubQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementSubQueryContext elementSubQuery() throws RecognitionException {
		ElementSubQueryContext _localctx = new ElementSubQueryContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_elementSubQuery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(492);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALL) | (1L << ANY) | (1L << SOME))) != 0)) {
				{
				setState(491);
				((ElementSubQueryContext)_localctx).sqWith = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALL) | (1L << ANY) | (1L << SOME))) != 0)) ) {
					((ElementSubQueryContext)_localctx).sqWith = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(494);
			match(LPAREN);
			setState(495);
			selectStat();
			setState(496);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementDateContext extends ParserRuleContext {
		public Token dt;
		public TerminalNode STRING() { return getToken(MySQLParser.STRING, 0); }
		public TerminalNode DATE() { return getToken(MySQLParser.DATE, 0); }
		public TerminalNode TIME() { return getToken(MySQLParser.TIME, 0); }
		public TerminalNode TIMESTAMP() { return getToken(MySQLParser.TIMESTAMP, 0); }
		public ElementDateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementDate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterElementDate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitElementDate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitElementDate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementDateContext elementDate() throws RecognitionException {
		ElementDateContext _localctx = new ElementDateContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_elementDate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(498);
			((ElementDateContext)_localctx).dt = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DATE) | (1L << TIME) | (1L << TIMESTAMP))) != 0)) ) {
				((ElementDateContext)_localctx).dt = (Token)_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(499);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementListFactorContext extends ParserRuleContext {
		public ElementListContext elementList() {
			return getRuleContext(ElementListContext.class,0);
		}
		public ElementListFactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementListFactor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterElementListFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitElementListFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitElementListFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementListFactorContext elementListFactor() throws RecognitionException {
		ElementListFactorContext _localctx = new ElementListFactorContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_elementListFactor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(501);
			match(LPAREN);
			setState(502);
			elementList();
			setState(503);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementListContext extends ParserRuleContext {
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public ElementListSuffixContext elementListSuffix() {
			return getRuleContext(ElementListSuffixContext.class,0);
		}
		public ElementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterElementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitElementList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitElementList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementListContext elementList() throws RecognitionException {
		ElementListContext _localctx = new ElementListContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_elementList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(505);
			element();
			setState(507);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(506);
				elementListSuffix();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementListSuffixContext extends ParserRuleContext {
		public ElementListContext elementList() {
			return getRuleContext(ElementListContext.class,0);
		}
		public ElementListSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementListSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterElementListSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitElementListSuffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitElementListSuffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementListSuffixContext elementListSuffix() throws RecognitionException {
		ElementListSuffixContext _localctx = new ElementListSuffixContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_elementListSuffix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(509);
			match(COMMA);
			setState(510);
			elementList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementOpEleContext extends ParserRuleContext {
		public ElementOpFactoryContext elementOpFactory() {
			return getRuleContext(ElementOpFactoryContext.class,0);
		}
		public ElementOpEleSuffixContext elementOpEleSuffix() {
			return getRuleContext(ElementOpEleSuffixContext.class,0);
		}
		public ElementOpEleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementOpEle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterElementOpEle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitElementOpEle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitElementOpEle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementOpEleContext elementOpEle() throws RecognitionException {
		ElementOpEleContext _localctx = new ElementOpEleContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_elementOpEle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(512);
			elementOpFactory();
			setState(514);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				{
				setState(513);
				elementOpEleSuffix();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementOpEleSuffixContext extends ParserRuleContext {
		public Token op;
		public ElementOpEleContext elementOpEle() {
			return getRuleContext(ElementOpEleContext.class,0);
		}
		public TerminalNode DIV() { return getToken(MySQLParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(MySQLParser.MOD, 0); }
		public TerminalNode AS() { return getToken(MySQLParser.AS, 0); }
		public ElementOpEleSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementOpEleSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterElementOpEleSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitElementOpEleSuffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitElementOpEleSuffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementOpEleSuffixContext elementOpEleSuffix() throws RecognitionException {
		ElementOpEleSuffixContext _localctx = new ElementOpEleSuffixContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_elementOpEleSuffix);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(517);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				{
				setState(516);
				((ElementOpEleSuffixContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 28)) & ~0x3f) == 0 && ((1L << (_la - 28)) & ((1L << (AS - 28)) | (1L << (DIV - 28)) | (1L << (MOD - 28)) | (1L << (PLUS - 28)) | (1L << (MINUS - 28)) | (1L << (VERTBAR - 28)) | (1L << (BITAND - 28)) | (1L << (SHIFT_LEFT - 28)) | (1L << (SHIFT_RIGHT - 28)) | (1L << (ASTERISK - 28)) | (1L << (POWER_OP - 28)))) != 0)) ) {
					((ElementOpEleSuffixContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			}
			setState(519);
			elementOpEle();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunCallContext extends ParserRuleContext {
		public Token funName;
		public TerminalNode ID() { return getToken(MySQLParser.ID, 0); }
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public FunCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterFunCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitFunCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitFunCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunCallContext funCall() throws RecognitionException {
		FunCallContext _localctx = new FunCallContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_funCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(521);
			((FunCallContext)_localctx).funName = match(ID);
			setState(522);
			match(LPAREN);
			setState(524);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLACEHOLDER) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << DATE) | (1L << TIME) | (1L << TIMESTAMP) | (1L << ALL) | (1L << ANY) | (1L << SOME) | (1L << UNKNOWN))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (ASTERISK - 65)) | (1L << (INT - 65)) | (1L << (DECIMAL - 65)) | (1L << (STRING - 65)) | (1L << (ID - 65)) | (1L << (COLUMN_REL - 65)) | (1L << (LPAREN - 65)))) != 0)) {
				{
				setState(523);
				paramList();
				}
			}

			setState(526);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamListContext extends ParserRuleContext {
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public ExprRelationalContext exprRelational() {
			return getRuleContext(ExprRelationalContext.class,0);
		}
		public ParamSuffixContext paramSuffix() {
			return getRuleContext(ParamSuffixContext.class,0);
		}
		public ParamListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterParamList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitParamList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitParamList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamListContext paramList() throws RecognitionException {
		ParamListContext _localctx = new ParamListContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_paramList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(530);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				{
				setState(528);
				element();
				}
				break;
			case 2:
				{
				setState(529);
				exprRelational();
				}
				break;
			}
			setState(533);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(532);
				paramSuffix();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamSuffixContext extends ParserRuleContext {
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public ParamSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).enterParamSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MySQLListener ) ((MySQLListener)listener).exitParamSuffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MySQLVisitor ) return ((MySQLVisitor<? extends T>)visitor).visitParamSuffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamSuffixContext paramSuffix() throws RecognitionException {
		ParamSuffixContext _localctx = new ParamSuffixContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_paramSuffix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(535);
			match(COMMA);
			setState(536);
			paramList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3j\u021d\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\3\2\3\2\3\2\3\2\3\2\5\2\u0086\n\2\3\3\3\3\5\3\u008a"+
		"\n\3\3\4\3\4\3\5\3\5\3\6\3\6\5\6\u0092\n\6\3\6\3\6\3\6\3\6\3\6\5\6\u0099"+
		"\n\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00a1\n\6\3\7\3\7\5\7\u00a5\n\7\3\b\3"+
		"\b\3\b\3\t\3\t\5\t\u00ac\n\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\5\13"+
		"\u00b6\n\13\3\13\5\13\u00b9\n\13\3\f\3\f\3\f\3\r\3\r\5\r\u00c0\n\r\3\r"+
		"\3\r\3\r\5\r\u00c5\n\r\3\r\3\r\5\r\u00c9\n\r\3\r\3\r\3\r\5\r\u00ce\n\r"+
		"\3\r\3\r\5\r\u00d2\n\r\3\16\3\16\3\16\5\16\u00d7\n\16\3\16\3\16\3\16\5"+
		"\16\u00dc\n\16\3\16\3\16\3\16\3\16\5\16\u00e2\n\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\5\16\u00ea\n\16\3\17\3\17\5\17\u00ee\n\17\3\17\3\17\3\17\3"+
		"\17\3\17\5\17\u00f5\n\17\3\17\3\17\3\20\3\20\5\20\u00fb\n\20\3\20\5\20"+
		"\u00fe\n\20\3\20\5\20\u0101\n\20\3\21\3\21\3\21\3\22\3\22\5\22\u0108\n"+
		"\22\3\23\3\23\3\23\3\24\3\24\5\24\u010f\n\24\3\25\3\25\3\25\5\25\u0114"+
		"\n\25\3\26\3\26\3\26\3\26\5\26\u011a\n\26\3\26\3\26\3\27\3\27\3\27\3\27"+
		"\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u012c\n\31\3\31"+
		"\3\31\5\31\u0130\n\31\3\32\3\32\3\32\3\32\5\32\u0136\n\32\3\32\3\32\5"+
		"\32\u013a\n\32\5\32\u013c\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33"+
		"\u0145\n\33\3\34\3\34\5\34\u0149\n\34\3\34\5\34\u014c\n\34\3\35\3\35\3"+
		"\35\3\36\3\36\5\36\u0153\n\36\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u015b"+
		"\n\37\3\37\3\37\5\37\u015f\n\37\3 \3 \3 \3 \3 \3 \5 \u0167\n \3!\3!\5"+
		"!\u016b\n!\3\"\3\"\3\"\3#\3#\3#\3#\5#\u0174\n#\3$\3$\3$\3$\3$\5$\u017b"+
		"\n$\3$\3$\5$\u017f\n$\3%\3%\5%\u0183\n%\3%\5%\u0186\n%\3&\3&\5&\u018a"+
		"\n&\3\'\3\'\3\'\3(\3(\5(\u0191\n(\3)\3)\3)\3)\3)\5)\u0198\n)\3*\3*\3*"+
		"\5*\u019d\n*\3+\3+\3+\3+\3+\3+\3+\3+\5+\u01a7\n+\3,\3,\3,\3,\3-\3-\5-"+
		"\u01af\n-\3-\3-\3-\3-\3-\3.\3.\3.\5.\u01b9\n.\3.\3.\3/\3/\5/\u01bf\n/"+
		"\3/\3/\3/\3/\3/\3\60\3\60\5\60\u01c8\n\60\3\60\3\60\3\60\3\60\3\60\3\61"+
		"\5\61\u01d0\n\61\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\63\3\63\5\63"+
		"\u01dc\n\63\3\63\3\63\3\63\3\64\3\64\3\64\5\64\u01e4\n\64\3\65\3\65\3"+
		"\65\3\65\5\65\u01ea\n\65\3\66\3\66\3\67\5\67\u01ef\n\67\3\67\3\67\3\67"+
		"\3\67\38\38\38\39\39\39\39\3:\3:\5:\u01fe\n:\3;\3;\3;\3<\3<\5<\u0205\n"+
		"<\3=\5=\u0208\n=\3=\3=\3>\3>\3>\5>\u020f\n>\3>\3>\3?\3?\5?\u0215\n?\3"+
		"?\5?\u0218\n?\3@\3@\3@\3@\2\2A\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\2\r\4\2%%."+
		".\3\2\'(\4\2\4\4EE\4\2\24\2489\3\2TY\5\2\r\r\22\23\62\62\4\2\3\3::\b\2"+
		"\4\4\r\r\22\23\62\62CCEI\3\2.\60\3\2+-\4\2\36\36;D\u022f\2\u0085\3\2\2"+
		"\2\4\u0089\3\2\2\2\6\u008b\3\2\2\2\b\u008d\3\2\2\2\n\u008f\3\2\2\2\f\u00a2"+
		"\3\2\2\2\16\u00a6\3\2\2\2\20\u00a9\3\2\2\2\22\u00ad\3\2\2\2\24\u00b5\3"+
		"\2\2\2\26\u00ba\3\2\2\2\30\u00bd\3\2\2\2\32\u00d6\3\2\2\2\34\u00eb\3\2"+
		"\2\2\36\u00f8\3\2\2\2 \u0102\3\2\2\2\"\u0105\3\2\2\2$\u0109\3\2\2\2&\u010e"+
		"\3\2\2\2(\u0113\3\2\2\2*\u0115\3\2\2\2,\u011d\3\2\2\2.\u0121\3\2\2\2\60"+
		"\u0124\3\2\2\2\62\u013b\3\2\2\2\64\u0144\3\2\2\2\66\u0146\3\2\2\28\u014d"+
		"\3\2\2\2:\u0152\3\2\2\2<\u0154\3\2\2\2>\u0160\3\2\2\2@\u0168\3\2\2\2B"+
		"\u016c\3\2\2\2D\u016f\3\2\2\2F\u0175\3\2\2\2H\u0180\3\2\2\2J\u0187\3\2"+
		"\2\2L\u018b\3\2\2\2N\u0190\3\2\2\2P\u0192\3\2\2\2R\u0199\3\2\2\2T\u01a6"+
		"\3\2\2\2V\u01a8\3\2\2\2X\u01ac\3\2\2\2Z\u01b5\3\2\2\2\\\u01bc\3\2\2\2"+
		"^\u01c5\3\2\2\2`\u01cf\3\2\2\2b\u01d6\3\2\2\2d\u01d9\3\2\2\2f\u01e3\3"+
		"\2\2\2h\u01e9\3\2\2\2j\u01eb\3\2\2\2l\u01ee\3\2\2\2n\u01f4\3\2\2\2p\u01f7"+
		"\3\2\2\2r\u01fb\3\2\2\2t\u01ff\3\2\2\2v\u0202\3\2\2\2x\u0207\3\2\2\2z"+
		"\u020b\3\2\2\2|\u0214\3\2\2\2~\u0219\3\2\2\2\u0080\u0086\5\n\6\2\u0081"+
		"\u0086\5:\36\2\u0082\u0086\5F$\2\u0083\u0086\5\24\13\2\u0084\u0086\5\4"+
		"\3\2\u0085\u0080\3\2\2\2\u0085\u0081\3\2\2\2\u0085\u0082\3\2\2\2\u0085"+
		"\u0083\3\2\2\2\u0085\u0084\3\2\2\2\u0086\3\3\2\2\2\u0087\u008a\5\6\4\2"+
		"\u0088\u008a\5\b\5\2\u0089\u0087\3\2\2\2\u0089\u0088\3\2\2\2\u008a\5\3"+
		"\2\2\2\u008b\u008c\7\66\2\2\u008c\7\3\2\2\2\u008d\u008e\7\67\2\2\u008e"+
		"\t\3\2\2\2\u008f\u0091\7\6\2\2\u0090\u0092\7\7\2\2\u0091\u0090\3\2\2\2"+
		"\u0091\u0092\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0098\7H\2\2\u0094\u0095"+
		"\7O\2\2\u0095\u0096\5\f\7\2\u0096\u0097\7N\2\2\u0097\u0099\3\2\2\2\u0098"+
		"\u0094\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u00a0\3\2\2\2\u009a\u009b\7\b"+
		"\2\2\u009b\u009c\7O\2\2\u009c\u009d\5\20\t\2\u009d\u009e\7N\2\2\u009e"+
		"\u00a1\3\2\2\2\u009f\u00a1\5\24\13\2\u00a0\u009a\3\2\2\2\u00a0\u009f\3"+
		"\2\2\2\u00a1\13\3\2\2\2\u00a2\u00a4\7H\2\2\u00a3\u00a5\5\16\b\2\u00a4"+
		"\u00a3\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\r\3\2\2\2\u00a6\u00a7\7[\2\2"+
		"\u00a7\u00a8\5\f\7\2\u00a8\17\3\2\2\2\u00a9\u00ab\5f\64\2\u00aa\u00ac"+
		"\5\22\n\2\u00ab\u00aa\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\21\3\2\2\2\u00ad"+
		"\u00ae\7[\2\2\u00ae\u00af\5\20\t\2\u00af\23\3\2\2\2\u00b0\u00b1\7O\2\2"+
		"\u00b1\u00b2\5\26\f\2\u00b2\u00b3\7N\2\2\u00b3\u00b6\3\2\2\2\u00b4\u00b6"+
		"\5\26\f\2\u00b5\u00b0\3\2\2\2\u00b5\u00b4\3\2\2\2\u00b6\u00b8\3\2\2\2"+
		"\u00b7\u00b9\5\34\17\2\u00b8\u00b7\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\25"+
		"\3\2\2\2\u00ba\u00bb\5\30\r\2\u00bb\u00bc\5\32\16\2\u00bc\27\3\2\2\2\u00bd"+
		"\u00bf\7\5\2\2\u00be\u00c0\7%\2\2\u00bf\u00be\3\2\2\2\u00bf\u00c0\3\2"+
		"\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c4\5\36\20\2\u00c2\u00c3\7\n\2\2\u00c3"+
		"\u00c5\5\"\22\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c8\3"+
		"\2\2\2\u00c6\u00c7\7\13\2\2\u00c7\u00c9\5N(\2\u00c8\u00c6\3\2\2\2\u00c8"+
		"\u00c9\3\2\2\2\u00c9\u00cd\3\2\2\2\u00ca\u00cb\7\31\2\2\u00cb\u00cc\7"+
		"\32\2\2\u00cc\u00ce\5\66\34\2\u00cd\u00ca\3\2\2\2\u00cd\u00ce\3\2\2\2"+
		"\u00ce\u00d1\3\2\2\2\u00cf\u00d0\7\35\2\2\u00d0\u00d2\5N(\2\u00d1\u00cf"+
		"\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\31\3\2\2\2\u00d3\u00d4\7\30\2\2\u00d4"+
		"\u00d5\7\32\2\2\u00d5\u00d7\5\66\34\2\u00d6\u00d3\3\2\2\2\u00d6\u00d7"+
		"\3\2\2\2\u00d7\u00e1\3\2\2\2\u00d8\u00db\7\f\2\2\u00d9\u00da\7E\2\2\u00da"+
		"\u00dc\7[\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00dd\3\2"+
		"\2\2\u00dd\u00e2\7E\2\2\u00de\u00df\7E\2\2\u00df\u00e0\7&\2\2\u00e0\u00e2"+
		"\7E\2\2\u00e1\u00d8\3\2\2\2\u00e1\u00de\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2"+
		"\u00e9\3\2\2\2\u00e3\u00e4\7\33\2\2\u00e4\u00ea\7\26\2\2\u00e5\u00e6\7"+
		"\63\2\2\u00e6\u00e7\7\17\2\2\u00e7\u00e8\7\64\2\2\u00e8\u00ea\7\65\2\2"+
		"\u00e9\u00e3\3\2\2\2\u00e9\u00e5\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\33"+
		"\3\2\2\2\u00eb\u00ed\7\61\2\2\u00ec\u00ee\t\2\2\2\u00ed\u00ec\3\2\2\2"+
		"\u00ed\u00ee\3\2\2\2\u00ee\u00f4\3\2\2\2\u00ef\u00f0\7O\2\2\u00f0\u00f1"+
		"\5\24\13\2\u00f1\u00f2\7N\2\2\u00f2\u00f5\3\2\2\2\u00f3\u00f5\5\24\13"+
		"\2\u00f4\u00ef\3\2\2\2\u00f4\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f7"+
		"\5\32\16\2\u00f7\35\3\2\2\2\u00f8\u00fd\5f\64\2\u00f9\u00fb\7\36\2\2\u00fa"+
		"\u00f9\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fe\7H"+
		"\2\2\u00fd\u00fa\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u0100\3\2\2\2\u00ff"+
		"\u0101\5 \21\2\u0100\u00ff\3\2\2\2\u0100\u0101\3\2\2\2\u0101\37\3\2\2"+
		"\2\u0102\u0103\7[\2\2\u0103\u0104\5\36\20\2\u0104!\3\2\2\2\u0105\u0107"+
		"\5&\24\2\u0106\u0108\5$\23\2\u0107\u0106\3\2\2\2\u0107\u0108\3\2\2\2\u0108"+
		"#\3\2\2\2\u0109\u010a\7[\2\2\u010a\u010b\5\"\22\2\u010b%\3\2\2\2\u010c"+
		"\u010f\5(\25\2\u010d\u010f\5.\30\2\u010e\u010c\3\2\2\2\u010e\u010d\3\2"+
		"\2\2\u010f\'\3\2\2\2\u0110\u0114\5H%\2\u0111\u0114\5*\26\2\u0112\u0114"+
		"\5,\27\2\u0113\u0110\3\2\2\2\u0113\u0111\3\2\2\2\u0113\u0112\3\2\2\2\u0114"+
		")\3\2\2\2\u0115\u0116\7O\2\2\u0116\u0117\5\24\13\2\u0117\u0119\7N\2\2"+
		"\u0118\u011a\7\36\2\2\u0119\u0118\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u011b"+
		"\3\2\2\2\u011b\u011c\7H\2\2\u011c+\3\2\2\2\u011d\u011e\7O\2\2\u011e\u011f"+
		"\5&\24\2\u011f\u0120\7N\2\2\u0120-\3\2\2\2\u0121\u0122\5H%\2\u0122\u0123"+
		"\5\60\31\2\u0123/\3\2\2\2\u0124\u0125\5\62\32\2\u0125\u012b\7!\2\2\u0126"+
		"\u012c\5J&\2\u0127\u0128\7O\2\2\u0128\u0129\5J&\2\u0129\u012a\7N\2\2\u012a"+
		"\u012c\3\2\2\2\u012b\u0126\3\2\2\2\u012b\u0127\3\2\2\2\u012c\u012d\3\2"+
		"\2\2\u012d\u012f\5\64\33\2\u012e\u0130\5\60\31\2\u012f\u012e\3\2\2\2\u012f"+
		"\u0130\3\2\2\2\u0130\61\3\2\2\2\u0131\u013c\7\37\2\2\u0132\u013c\7)\2"+
		"\2\u0133\u0135\7\"\2\2\u0134\u0136\7 \2\2\u0135\u0134\3\2\2\2\u0135\u0136"+
		"\3\2\2\2\u0136\u013c\3\2\2\2\u0137\u0139\7#\2\2\u0138\u013a\7 \2\2\u0139"+
		"\u0138\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u013c\3\2\2\2\u013b\u0131\3\2"+
		"\2\2\u013b\u0132\3\2\2\2\u013b\u0133\3\2\2\2\u013b\u0137\3\2\2\2\u013c"+
		"\63\3\2\2\2\u013d\u013e\7$\2\2\u013e\u0145\5N(\2\u013f\u0140\7*\2\2\u0140"+
		"\u0141\7O\2\2\u0141\u0142\5\f\7\2\u0142\u0143\7N\2\2\u0143\u0145\3\2\2"+
		"\2\u0144\u013d\3\2\2\2\u0144\u013f\3\2\2\2\u0145\65\3\2\2\2\u0146\u0148"+
		"\5f\64\2\u0147\u0149\t\3\2\2\u0148\u0147\3\2\2\2\u0148\u0149\3\2\2\2\u0149"+
		"\u014b\3\2\2\2\u014a\u014c\58\35\2\u014b\u014a\3\2\2\2\u014b\u014c\3\2"+
		"\2\2\u014c\67\3\2\2\2\u014d\u014e\7[\2\2\u014e\u014f\5\66\34\2\u014f9"+
		"\3\2\2\2\u0150\u0153\5<\37\2\u0151\u0153\5> \2\u0152\u0150\3\2\2\2\u0152"+
		"\u0151\3\2\2\2\u0153;\3\2\2\2\u0154\u0155\7\26\2\2\u0155\u0156\5H%\2\u0156"+
		"\u0157\7\27\2\2\u0157\u015a\5@!\2\u0158\u0159\7\13\2\2\u0159\u015b\5N"+
		"(\2\u015a\u0158\3\2\2\2\u015a\u015b\3\2\2\2\u015b\u015e\3\2\2\2\u015c"+
		"\u015d\7\f\2\2\u015d\u015f\t\4\2\2\u015e\u015c\3\2\2\2\u015e\u015f\3\2"+
		"\2\2\u015f=\3\2\2\2\u0160\u0161\7\26\2\2\u0161\u0162\5J&\2\u0162\u0163"+
		"\7\27\2\2\u0163\u0166\5@!\2\u0164\u0165\7\13\2\2\u0165\u0167\5N(\2\u0166"+
		"\u0164\3\2\2\2\u0166\u0167\3\2\2\2\u0167?\3\2\2\2\u0168\u016a\5D#\2\u0169"+
		"\u016b\5B\"\2\u016a\u0169\3\2\2\2\u016a\u016b\3\2\2\2\u016bA\3\2\2\2\u016c"+
		"\u016d\7[\2\2\u016d\u016e\5@!\2\u016eC\3\2\2\2\u016f\u0170\5f\64\2\u0170"+
		"\u0173\7T\2\2\u0171\u0174\5f\64\2\u0172\u0174\7\25\2\2\u0173\u0171\3\2"+
		"\2\2\u0173\u0172\3\2\2\2\u0174E\3\2\2\2\u0175\u0176\7\t\2\2\u0176\u0177"+
		"\7\n\2\2\u0177\u017a\5H%\2\u0178\u0179\7\13\2\2\u0179\u017b\5N(\2\u017a"+
		"\u0178\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u017e\3\2\2\2\u017c\u017d\7\f"+
		"\2\2\u017d\u017f\t\4\2\2\u017e\u017c\3\2\2\2\u017e\u017f\3\2\2\2\u017f"+
		"G\3\2\2\2\u0180\u0185\7H\2\2\u0181\u0183\7\36\2\2\u0182\u0181\3\2\2\2"+
		"\u0182\u0183\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u0186\7H\2\2\u0185\u0182"+
		"\3\2\2\2\u0185\u0186\3\2\2\2\u0186I\3\2\2\2\u0187\u0189\5H%\2\u0188\u018a"+
		"\5L\'\2\u0189\u0188\3\2\2\2\u0189\u018a\3\2\2\2\u018aK\3\2\2\2\u018b\u018c"+
		"\7[\2\2\u018c\u018d\5J&\2\u018dM\3\2\2\2\u018e\u0191\5P)\2\u018f\u0191"+
		"\5R*\2\u0190\u018e\3\2\2\2\u0190\u018f\3\2\2\2\u0191O\3\2\2\2\u0192\u0193"+
		"\7O\2\2\u0193\u0194\5N(\2\u0194\u0197\7N\2\2\u0195\u0196\t\5\2\2\u0196"+
		"\u0198\5N(\2\u0197\u0195\3\2\2\2\u0197\u0198\3\2\2\2\u0198Q\3\2\2\2\u0199"+
		"\u019c\5T+\2\u019a\u019b\t\5\2\2\u019b\u019d\5N(\2\u019c\u019a\3\2\2\2"+
		"\u019c\u019d\3\2\2\2\u019dS\3\2\2\2\u019e\u01a7\5V,\2\u019f\u01a7\5X-"+
		"\2\u01a0\u01a7\5Z.\2\u01a1\u01a7\5\\/\2\u01a2\u01a7\5^\60\2\u01a3\u01a7"+
		"\5`\61\2\u01a4\u01a7\5b\62\2\u01a5\u01a7\5d\63\2\u01a6\u019e\3\2\2\2\u01a6"+
		"\u019f\3\2\2\2\u01a6\u01a0\3\2\2\2\u01a6\u01a1\3\2\2\2\u01a6\u01a2\3\2"+
		"\2\2\u01a6\u01a3\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a6\u01a5\3\2\2\2\u01a7"+
		"U\3\2\2\2\u01a8\u01a9\5f\64\2\u01a9\u01aa\t\6\2\2\u01aa\u01ab\5f\64\2"+
		"\u01abW\3\2\2\2\u01ac\u01ae\5f\64\2\u01ad\u01af\7:\2\2\u01ae\u01ad\3\2"+
		"\2\2\u01ae\u01af\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0\u01b1\7\20\2\2\u01b1"+
		"\u01b2\5f\64\2\u01b2\u01b3\78\2\2\u01b3\u01b4\5f\64\2\u01b4Y\3\2\2\2\u01b5"+
		"\u01b6\5f\64\2\u01b6\u01b8\7\16\2\2\u01b7\u01b9\7:\2\2\u01b8\u01b7\3\2"+
		"\2\2\u01b8\u01b9\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba\u01bb\t\7\2\2\u01bb"+
		"[\3\2\2\2\u01bc\u01be\5f\64\2\u01bd\u01bf\7:\2\2\u01be\u01bd\3\2\2\2\u01be"+
		"\u01bf\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0\u01c1\7\17\2\2\u01c1\u01c2\7"+
		"O\2\2\u01c2\u01c3\5\24\13\2\u01c3\u01c4\7N\2\2\u01c4]\3\2\2\2\u01c5\u01c7"+
		"\5f\64\2\u01c6\u01c8\7:\2\2\u01c7\u01c6\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8"+
		"\u01c9\3\2\2\2\u01c9\u01ca\7\17\2\2\u01ca\u01cb\7O\2\2\u01cb\u01cc\5\20"+
		"\t\2\u01cc\u01cd\7N\2\2\u01cd_\3\2\2\2\u01ce\u01d0\7:\2\2\u01cf\u01ce"+
		"\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1\u01d2\7\21\2\2"+
		"\u01d2\u01d3\7O\2\2\u01d3\u01d4\5\24\13\2\u01d4\u01d5\7N\2\2\u01d5a\3"+
		"\2\2\2\u01d6\u01d7\t\b\2\2\u01d7\u01d8\5T+\2\u01d8c\3\2\2\2\u01d9\u01db"+
		"\5f\64\2\u01da\u01dc\7:\2\2\u01db\u01da\3\2\2\2\u01db\u01dc\3\2\2\2\u01dc"+
		"\u01dd\3\2\2\2\u01dd\u01de\7\34\2\2\u01de\u01df\5f\64\2\u01dfe\3\2\2\2"+
		"\u01e0\u01e4\5h\65\2\u01e1\u01e4\5p9\2\u01e2\u01e4\5v<\2\u01e3\u01e0\3"+
		"\2\2\2\u01e3\u01e1\3\2\2\2\u01e3\u01e2\3\2\2\2\u01e4g\3\2\2\2\u01e5\u01ea"+
		"\5j\66\2\u01e6\u01ea\5z>\2\u01e7\u01ea\5l\67\2\u01e8\u01ea\5n8\2\u01e9"+
		"\u01e5\3\2\2\2\u01e9\u01e6\3\2\2\2\u01e9\u01e7\3\2\2\2\u01e9\u01e8\3\2"+
		"\2\2\u01eai\3\2\2\2\u01eb\u01ec\t\t\2\2\u01eck\3\2\2\2\u01ed\u01ef\t\n"+
		"\2\2\u01ee\u01ed\3\2\2\2\u01ee\u01ef\3\2\2\2\u01ef\u01f0\3\2\2\2\u01f0"+
		"\u01f1\7O\2\2\u01f1\u01f2\5\24\13\2\u01f2\u01f3\7N\2\2\u01f3m\3\2\2\2"+
		"\u01f4\u01f5\t\13\2\2\u01f5\u01f6\7G\2\2\u01f6o\3\2\2\2\u01f7\u01f8\7"+
		"O\2\2\u01f8\u01f9\5r:\2\u01f9\u01fa\7N\2\2\u01faq\3\2\2\2\u01fb\u01fd"+
		"\5f\64\2\u01fc\u01fe\5t;\2\u01fd\u01fc\3\2\2\2\u01fd\u01fe\3\2\2\2\u01fe"+
		"s\3\2\2\2\u01ff\u0200\7[\2\2\u0200\u0201\5r:\2\u0201u\3\2\2\2\u0202\u0204"+
		"\5h\65\2\u0203\u0205\5x=\2\u0204\u0203\3\2\2\2\u0204\u0205\3\2\2\2\u0205"+
		"w\3\2\2\2\u0206\u0208\t\f\2\2\u0207\u0206\3\2\2\2\u0207\u0208\3\2\2\2"+
		"\u0208\u0209\3\2\2\2\u0209\u020a\5v<\2\u020ay\3\2\2\2\u020b\u020c\7H\2"+
		"\2\u020c\u020e\7O\2\2\u020d\u020f\5|?\2\u020e\u020d\3\2\2\2\u020e\u020f"+
		"\3\2\2\2\u020f\u0210\3\2\2\2\u0210\u0211\7N\2\2\u0211{\3\2\2\2\u0212\u0215"+
		"\5f\64\2\u0213\u0215\5V,\2\u0214\u0212\3\2\2\2\u0214\u0213\3\2\2\2\u0215"+
		"\u0217\3\2\2\2\u0216\u0218\5~@\2\u0217\u0216\3\2\2\2\u0217\u0218\3\2\2"+
		"\2\u0218}\3\2\2\2\u0219\u021a\7[\2\2\u021a\u021b\5|?\2\u021b\177\3\2\2"+
		"\2C\u0085\u0089\u0091\u0098\u00a0\u00a4\u00ab\u00b5\u00b8\u00bf\u00c4"+
		"\u00c8\u00cd\u00d1\u00d6\u00db\u00e1\u00e9\u00ed\u00f4\u00fa\u00fd\u0100"+
		"\u0107\u010e\u0113\u0119\u012b\u012f\u0135\u0139\u013b\u0144\u0148\u014b"+
		"\u0152\u015a\u015e\u0166\u016a\u0173\u017a\u017e\u0182\u0185\u0189\u0190"+
		"\u0197\u019c\u01a6\u01ae\u01b8\u01be\u01c7\u01cf\u01db\u01e3\u01e9\u01ee"+
		"\u01fd\u0204\u0207\u020e\u0214\u0217";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}