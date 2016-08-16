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
		UNKNOWN=48, LOCK=49, SHARE=50, MODE=51, AND=52, OR=53, NOT=54, DIV=55, 
		MOD=56, PLUS=57, MINUS=58, VERTBAR=59, BITAND=60, SHIFT_LEFT=61, SHIFT_RIGHT=62, 
		ASTERISK=63, POWER_OP=64, INT=65, DECIMAL=66, STRING=67, ID=68, COLUMN_REL=69, 
		REGEXP=70, NEGATION=71, BINARY=72, ESCAPE=73, RPAREN=74, LPAREN=75, RBRACK=76, 
		LBRACK=77, COLON=78, ALL_FIELDS=79, EQ=80, LTH=81, GTH=82, NOT_EQ=83, 
		LET=84, GET=85, SEMI=86, COMMA=87, DOT=88, COLLATE=89, INDEX=90, KEY=91, 
		USE=92, IGNORE=93, PARTITION=94, STRAIGHT_JOIN=95, NATURAL=96, OJ=97, 
		NEWLINE=98, WS=99, USER_VAR=100;
	public static final int
		RULE_stat = 0, RULE_insertStat = 1, RULE_columnNames = 2, RULE_columnNamesSuffix = 3, 
		RULE_valueList = 4, RULE_valueListSuffix = 5, RULE_selectStat = 6, RULE_selectUnionSuffix = 7, 
		RULE_selectExprs = 8, RULE_selectExprsSuffix = 9, RULE_tables = 10, RULE_tableSuffix = 11, 
		RULE_tableRel = 12, RULE_tableFactor = 13, RULE_tableSubQuery = 14, RULE_tableRecu = 15, 
		RULE_tableJoin = 16, RULE_tableJoinSuffix = 17, RULE_tableJoinMod = 18, 
		RULE_joinCondition = 19, RULE_gbobExprs = 20, RULE_gbobExprSuffix = 21, 
		RULE_updateStat = 22, RULE_updateSingleTable = 23, RULE_updateMultipleTable = 24, 
		RULE_setExprs = 25, RULE_setExprSuffix = 26, RULE_setExpr = 27, RULE_deleteStat = 28, 
		RULE_tableNameAndAlias = 29, RULE_tableNameAndAliases = 30, RULE_tableNameAndAliasSuffix = 31, 
		RULE_whereCondition = 32, RULE_whereCondSub = 33, RULE_whereCondOp = 34, 
		RULE_expression = 35, RULE_exprRelational = 36, RULE_exprBetweenAnd = 37, 
		RULE_exprIsOrIsNotNull = 38, RULE_exprInSelect = 39, RULE_exprInValues = 40, 
		RULE_exprExists = 41, RULE_exprNot = 42, RULE_exprLike = 43, RULE_element = 44, 
		RULE_elementOpFactory = 45, RULE_elementText = 46, RULE_elementSubQuery = 47, 
		RULE_elementDate = 48, RULE_elementListFactor = 49, RULE_elementList = 50, 
		RULE_elementListSuffix = 51, RULE_elementOpEle = 52, RULE_elementOpEleSuffix = 53, 
		RULE_funCall = 54, RULE_paramList = 55, RULE_paramSuffix = 56;
	public static final String[] ruleNames = {
		"stat", "insertStat", "columnNames", "columnNamesSuffix", "valueList", 
		"valueListSuffix", "selectStat", "selectUnionSuffix", "selectExprs", "selectExprsSuffix", 
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
		null, null, null, null, null, null, null, null, null, "'+'", "'-'", "'|'", 
		"'&'", "'<<'", "'>>'", "'*'", "'^'", null, null, null, null, null, "'regexp'", 
		"'~'", "'binary'", "'escape'", "')'", "'('", "']'", "'['", "':'", "'.*'", 
		"'='", "'<'", "'>'", "'!='", "'<='", "'>='", "';'", "','", "'.'", "'collate'", 
		"'index'", "'key'", "'use'", "'ignore'", "'partition'", "'straight_join'", 
		"'natural'", "'oj'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "PLACEHOLDER", "SELECT", "INSERT", "INTO", "VALUES", "DELETE", 
		"FROM", "WHERE", "LIMIT", "NULL", "IS", "IN", "BETWEEN", "EXISTS", "TRUE", 
		"FALSE", "XOR", "DEFAULT", "UPDATE", "SET", "ORDER", "GROUP", "BY", "FOR", 
		"LIKE", "HAVING", "AS", "INNER", "OUTER", "JOIN", "LEFT", "RIGHT", "ON", 
		"DISTINCT", "OFFSET", "ASC", "DESC", "CROSS", "USING", "DATE", "TIME", 
		"TIMESTAMP", "ALL", "ANY", "SOME", "UNION", "UNKNOWN", "LOCK", "SHARE", 
		"MODE", "AND", "OR", "NOT", "DIV", "MOD", "PLUS", "MINUS", "VERTBAR", 
		"BITAND", "SHIFT_LEFT", "SHIFT_RIGHT", "ASTERISK", "POWER_OP", "INT", 
		"DECIMAL", "STRING", "ID", "COLUMN_REL", "REGEXP", "NEGATION", "BINARY", 
		"ESCAPE", "RPAREN", "LPAREN", "RBRACK", "LBRACK", "COLON", "ALL_FIELDS", 
		"EQ", "LTH", "GTH", "NOT_EQ", "LET", "GET", "SEMI", "COMMA", "DOT", "COLLATE", 
		"INDEX", "KEY", "USE", "IGNORE", "PARTITION", "STRAIGHT_JOIN", "NATURAL", 
		"OJ", "NEWLINE", "WS", "USER_VAR"
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
			setState(118);
			switch (_input.LA(1)) {
			case INSERT:
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				insertStat();
				}
				break;
			case UPDATE:
				enterOuterAlt(_localctx, 2);
				{
				setState(115);
				updateStat();
				}
				break;
			case DELETE:
				enterOuterAlt(_localctx, 3);
				{
				setState(116);
				deleteStat();
				}
				break;
			case SELECT:
				enterOuterAlt(_localctx, 4);
				{
				setState(117);
				selectStat();
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
		enterRule(_localctx, 2, RULE_insertStat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(INSERT);
			setState(122);
			_la = _input.LA(1);
			if (_la==INTO) {
				{
				setState(121);
				match(INTO);
				}
			}

			setState(124);
			((InsertStatContext)_localctx).tableName = match(ID);
			setState(129);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(125);
				match(LPAREN);
				setState(126);
				columnNames();
				setState(127);
				match(RPAREN);
				}
			}

			setState(137);
			switch (_input.LA(1)) {
			case VALUES:
				{
				{
				setState(131);
				match(VALUES);
				setState(132);
				match(LPAREN);
				setState(133);
				valueList();
				setState(134);
				match(RPAREN);
				}
				}
				break;
			case SELECT:
				{
				setState(136);
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
		enterRule(_localctx, 4, RULE_columnNames);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			((ColumnNamesContext)_localctx).name = match(ID);
			setState(141);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(140);
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
		enterRule(_localctx, 6, RULE_columnNamesSuffix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(COMMA);
			setState(144);
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
		enterRule(_localctx, 8, RULE_valueList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			element();
			setState(148);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(147);
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
		enterRule(_localctx, 10, RULE_valueListSuffix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(COMMA);
			setState(151);
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
		public Token distinct;
		public WhereConditionContext where;
		public GbobExprsContext groupByExprs;
		public WhereConditionContext having;
		public GbobExprsContext orderByExprs;
		public Token offset;
		public Token rowCount;
		public Token lock;
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
		public List<TerminalNode> BY() { return getTokens(MySQLParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(MySQLParser.BY, i);
		}
		public TerminalNode HAVING() { return getToken(MySQLParser.HAVING, 0); }
		public TerminalNode ORDER() { return getToken(MySQLParser.ORDER, 0); }
		public TerminalNode LIMIT() { return getToken(MySQLParser.LIMIT, 0); }
		public SelectUnionSuffixContext selectUnionSuffix() {
			return getRuleContext(SelectUnionSuffixContext.class,0);
		}
		public TerminalNode DISTINCT() { return getToken(MySQLParser.DISTINCT, 0); }
		public List<WhereConditionContext> whereCondition() {
			return getRuleContexts(WhereConditionContext.class);
		}
		public WhereConditionContext whereCondition(int i) {
			return getRuleContext(WhereConditionContext.class,i);
		}
		public List<GbobExprsContext> gbobExprs() {
			return getRuleContexts(GbobExprsContext.class);
		}
		public GbobExprsContext gbobExprs(int i) {
			return getRuleContext(GbobExprsContext.class,i);
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
		enterRule(_localctx, 12, RULE_selectStat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(SELECT);
			setState(155);
			_la = _input.LA(1);
			if (_la==DISTINCT) {
				{
				setState(154);
				((SelectStatContext)_localctx).distinct = match(DISTINCT);
				}
			}

			setState(157);
			selectExprs();
			setState(160);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(158);
				match(FROM);
				setState(159);
				tables();
				}
			}

			setState(164);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(162);
				match(WHERE);
				setState(163);
				((SelectStatContext)_localctx).where = whereCondition();
				}
			}

			setState(169);
			_la = _input.LA(1);
			if (_la==GROUP) {
				{
				setState(166);
				match(GROUP);
				setState(167);
				match(BY);
				setState(168);
				((SelectStatContext)_localctx).groupByExprs = gbobExprs();
				}
			}

			setState(173);
			_la = _input.LA(1);
			if (_la==HAVING) {
				{
				setState(171);
				match(HAVING);
				setState(172);
				((SelectStatContext)_localctx).having = whereCondition();
				}
			}

			setState(178);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(175);
				match(ORDER);
				setState(176);
				match(BY);
				setState(177);
				((SelectStatContext)_localctx).orderByExprs = gbobExprs();
				}
			}

			setState(189);
			switch (_input.LA(1)) {
			case LIMIT:
				{
				setState(180);
				match(LIMIT);
				{
				setState(183);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(181);
					((SelectStatContext)_localctx).offset = match(INT);
					setState(182);
					match(COMMA);
					}
					break;
				}
				setState(185);
				((SelectStatContext)_localctx).rowCount = match(INT);
				}
				}
				break;
			case INT:
				{
				{
				setState(186);
				((SelectStatContext)_localctx).rowCount = match(INT);
				setState(187);
				match(OFFSET);
				setState(188);
				((SelectStatContext)_localctx).offset = match(INT);
				}
				}
				break;
			case EOF:
			case FOR:
			case UNION:
			case LOCK:
			case RPAREN:
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(197);
			switch (_input.LA(1)) {
			case FOR:
				{
				{
				setState(191);
				match(FOR);
				setState(192);
				((SelectStatContext)_localctx).lock = match(UPDATE);
				}
				}
				break;
			case LOCK:
				{
				{
				setState(193);
				((SelectStatContext)_localctx).lock = match(LOCK);
				setState(194);
				match(IN);
				setState(195);
				match(SHARE);
				setState(196);
				match(MODE);
				}
				}
				break;
			case EOF:
			case UNION:
			case RPAREN:
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(200);
			_la = _input.LA(1);
			if (_la==UNION) {
				{
				setState(199);
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

	public static class SelectUnionSuffixContext extends ParserRuleContext {
		public Token method;
		public TerminalNode UNION() { return getToken(MySQLParser.UNION, 0); }
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
		enterRule(_localctx, 14, RULE_selectUnionSuffix);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(UNION);
			setState(204);
			_la = _input.LA(1);
			if (_la==DISTINCT || _la==ALL) {
				{
				setState(203);
				((SelectUnionSuffixContext)_localctx).method = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==DISTINCT || _la==ALL) ) {
					((SelectUnionSuffixContext)_localctx).method = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(206);
			selectStat();
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
		enterRule(_localctx, 16, RULE_selectExprs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			element();
			setState(213);
			_la = _input.LA(1);
			if (_la==AS || _la==ID) {
				{
				setState(210);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(209);
					match(AS);
					}
				}

				setState(212);
				((SelectExprsContext)_localctx).alias = match(ID);
				}
			}

			setState(216);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(215);
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
		enterRule(_localctx, 18, RULE_selectExprsSuffix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(COMMA);
			setState(219);
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
		enterRule(_localctx, 20, RULE_tables);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			tableRel();
			setState(223);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(222);
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
		enterRule(_localctx, 22, RULE_tableSuffix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(COMMA);
			setState(226);
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
		enterRule(_localctx, 24, RULE_tableRel);
		try {
			setState(230);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(228);
				tableFactor();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(229);
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
		enterRule(_localctx, 26, RULE_tableFactor);
		try {
			setState(235);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(232);
				tableNameAndAlias();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(233);
				tableSubQuery();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(234);
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
		enterRule(_localctx, 28, RULE_tableSubQuery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(LPAREN);
			setState(238);
			selectStat();
			setState(239);
			match(RPAREN);
			setState(241);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(240);
				match(AS);
				}
			}

			setState(243);
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
		enterRule(_localctx, 30, RULE_tableRecu);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			match(LPAREN);
			setState(246);
			tableRel();
			setState(247);
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
		enterRule(_localctx, 32, RULE_tableJoin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			tableNameAndAlias();
			setState(250);
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
		public TableNameAndAliasContext tableNameAndAlias() {
			return getRuleContext(TableNameAndAliasContext.class,0);
		}
		public JoinConditionContext joinCondition() {
			return getRuleContext(JoinConditionContext.class,0);
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
		enterRule(_localctx, 34, RULE_tableJoinSuffix);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			tableJoinMod();
			setState(253);
			match(JOIN);
			setState(254);
			tableNameAndAlias();
			setState(255);
			joinCondition();
			setState(257);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INNER) | (1L << LEFT) | (1L << RIGHT) | (1L << CROSS))) != 0)) {
				{
				setState(256);
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
		enterRule(_localctx, 36, RULE_tableJoinMod);
		int _la;
		try {
			setState(269);
			switch (_input.LA(1)) {
			case INNER:
				enterOuterAlt(_localctx, 1);
				{
				setState(259);
				match(INNER);
				}
				break;
			case CROSS:
				enterOuterAlt(_localctx, 2);
				{
				setState(260);
				match(CROSS);
				}
				break;
			case LEFT:
				enterOuterAlt(_localctx, 3);
				{
				setState(261);
				match(LEFT);
				setState(263);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(262);
					match(OUTER);
					}
				}

				}
				break;
			case RIGHT:
				enterOuterAlt(_localctx, 4);
				{
				setState(265);
				match(RIGHT);
				setState(267);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(266);
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
		enterRule(_localctx, 38, RULE_joinCondition);
		try {
			setState(278);
			switch (_input.LA(1)) {
			case ON:
				enterOuterAlt(_localctx, 1);
				{
				setState(271);
				match(ON);
				setState(272);
				whereCondition();
				}
				break;
			case USING:
				enterOuterAlt(_localctx, 2);
				{
				setState(273);
				match(USING);
				setState(274);
				match(LPAREN);
				setState(275);
				columnNames();
				setState(276);
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
		enterRule(_localctx, 40, RULE_gbobExprs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			element();
			setState(282);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(281);
				((GbobExprsContext)_localctx).sc = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
					((GbobExprsContext)_localctx).sc = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(285);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(284);
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
		enterRule(_localctx, 42, RULE_gbobExprSuffix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			match(COMMA);
			setState(288);
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
		enterRule(_localctx, 44, RULE_updateStat);
		try {
			setState(292);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(290);
				updateSingleTable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(291);
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
		enterRule(_localctx, 46, RULE_updateSingleTable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			match(UPDATE);
			setState(295);
			tableNameAndAlias();
			setState(296);
			match(SET);
			setState(297);
			setExprs();
			setState(300);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(298);
				match(WHERE);
				setState(299);
				whereCondition();
				}
			}

			setState(304);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(302);
				match(LIMIT);
				setState(303);
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
		enterRule(_localctx, 48, RULE_updateMultipleTable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			match(UPDATE);
			setState(307);
			tableNameAndAliases();
			setState(308);
			match(SET);
			setState(309);
			setExprs();
			setState(312);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(310);
				match(WHERE);
				setState(311);
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
		enterRule(_localctx, 50, RULE_setExprs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			setExpr();
			setState(316);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(315);
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
		enterRule(_localctx, 52, RULE_setExprSuffix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			match(COMMA);
			setState(319);
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
		enterRule(_localctx, 54, RULE_setExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			((SetExprContext)_localctx).left = element();
			setState(322);
			match(EQ);
			setState(325);
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
				setState(323);
				((SetExprContext)_localctx).right = element();
				}
				break;
			case DEFAULT:
				{
				setState(324);
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
		enterRule(_localctx, 56, RULE_deleteStat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			match(DELETE);
			setState(328);
			match(FROM);
			setState(329);
			tableNameAndAlias();
			setState(332);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(330);
				match(WHERE);
				setState(331);
				whereCondition();
				}
			}

			setState(336);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(334);
				match(LIMIT);
				setState(335);
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
		enterRule(_localctx, 58, RULE_tableNameAndAlias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			((TableNameAndAliasContext)_localctx).name = match(ID);
			setState(343);
			_la = _input.LA(1);
			if (_la==AS || _la==ID) {
				{
				setState(340);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(339);
					match(AS);
					}
				}

				setState(342);
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
		enterRule(_localctx, 60, RULE_tableNameAndAliases);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			tableNameAndAlias();
			setState(347);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(346);
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
		enterRule(_localctx, 62, RULE_tableNameAndAliasSuffix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			match(COMMA);
			setState(350);
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
		enterRule(_localctx, 64, RULE_whereCondition);
		try {
			setState(354);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(352);
				whereCondSub();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(353);
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
		enterRule(_localctx, 66, RULE_whereCondSub);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			match(LPAREN);
			setState(357);
			((WhereCondSubContext)_localctx).wc1 = whereCondition();
			setState(358);
			match(RPAREN);
			setState(361);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << XOR) | (1L << AND) | (1L << OR))) != 0)) {
				{
				setState(359);
				((WhereCondSubContext)_localctx).expressionOperator = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << XOR) | (1L << AND) | (1L << OR))) != 0)) ) {
					((WhereCondSubContext)_localctx).expressionOperator = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(360);
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
		enterRule(_localctx, 68, RULE_whereCondOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			expression();
			setState(366);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << XOR) | (1L << AND) | (1L << OR))) != 0)) {
				{
				setState(364);
				((WhereCondOpContext)_localctx).expressionOperator = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << XOR) | (1L << AND) | (1L << OR))) != 0)) ) {
					((WhereCondOpContext)_localctx).expressionOperator = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(365);
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
		enterRule(_localctx, 70, RULE_expression);
		try {
			setState(376);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(368);
				exprRelational();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(369);
				exprBetweenAnd();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(370);
				exprIsOrIsNotNull();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(371);
				exprInSelect();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(372);
				exprInValues();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(373);
				exprExists();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(374);
				exprNot();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(375);
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
		enterRule(_localctx, 72, RULE_exprRelational);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			((ExprRelationalContext)_localctx).left = element();
			setState(379);
			((ExprRelationalContext)_localctx).relationalOp = _input.LT(1);
			_la = _input.LA(1);
			if ( !(((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & ((1L << (EQ - 80)) | (1L << (LTH - 80)) | (1L << (GTH - 80)) | (1L << (NOT_EQ - 80)) | (1L << (LET - 80)) | (1L << (GET - 80)))) != 0)) ) {
				((ExprRelationalContext)_localctx).relationalOp = (Token)_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(380);
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
		enterRule(_localctx, 74, RULE_exprBetweenAnd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			((ExprBetweenAndContext)_localctx).el = element();
			setState(384);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(383);
				((ExprBetweenAndContext)_localctx).not = match(NOT);
				}
			}

			setState(386);
			match(BETWEEN);
			setState(387);
			((ExprBetweenAndContext)_localctx).left = element();
			setState(388);
			match(AND);
			setState(389);
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
		enterRule(_localctx, 76, RULE_exprIsOrIsNotNull);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			element();
			setState(392);
			match(IS);
			setState(394);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(393);
				((ExprIsOrIsNotNullContext)_localctx).not = match(NOT);
				}
			}

			setState(396);
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
		enterRule(_localctx, 78, RULE_exprInSelect);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(398);
			element();
			setState(400);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(399);
				((ExprInSelectContext)_localctx).not = match(NOT);
				}
			}

			setState(402);
			match(IN);
			setState(403);
			match(LPAREN);
			setState(404);
			selectStat();
			setState(405);
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
		enterRule(_localctx, 80, RULE_exprInValues);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
			element();
			setState(409);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(408);
				((ExprInValuesContext)_localctx).not = match(NOT);
				}
			}

			setState(411);
			match(IN);
			setState(412);
			match(LPAREN);
			setState(413);
			valueList();
			setState(414);
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
		enterRule(_localctx, 82, RULE_exprExists);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(417);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(416);
				((ExprExistsContext)_localctx).not = match(NOT);
				}
			}

			setState(419);
			match(EXISTS);
			setState(420);
			match(LPAREN);
			setState(421);
			selectStat();
			setState(422);
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
		enterRule(_localctx, 84, RULE_exprNot);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
			_la = _input.LA(1);
			if ( !(_la==T__0 || _la==NOT) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(425);
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
		enterRule(_localctx, 86, RULE_exprLike);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(427);
			((ExprLikeContext)_localctx).left = element();
			setState(429);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(428);
				((ExprLikeContext)_localctx).not = match(NOT);
				}
			}

			setState(431);
			match(LIKE);
			setState(432);
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
		enterRule(_localctx, 88, RULE_element);
		try {
			setState(437);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(434);
				elementOpFactory();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(435);
				elementListFactor();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(436);
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
		enterRule(_localctx, 90, RULE_elementOpFactory);
		try {
			setState(443);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(439);
				elementText();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(440);
				funCall();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(441);
				elementSubQuery();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(442);
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
		enterRule(_localctx, 92, RULE_elementText);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLACEHOLDER) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << UNKNOWN) | (1L << ASTERISK))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (INT - 65)) | (1L << (DECIMAL - 65)) | (1L << (STRING - 65)) | (1L << (ID - 65)) | (1L << (COLUMN_REL - 65)))) != 0)) ) {
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
		enterRule(_localctx, 94, RULE_elementSubQuery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALL) | (1L << ANY) | (1L << SOME))) != 0)) {
				{
				setState(447);
				((ElementSubQueryContext)_localctx).sqWith = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALL) | (1L << ANY) | (1L << SOME))) != 0)) ) {
					((ElementSubQueryContext)_localctx).sqWith = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(450);
			match(LPAREN);
			setState(451);
			selectStat();
			setState(452);
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
		enterRule(_localctx, 96, RULE_elementDate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
			((ElementDateContext)_localctx).dt = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DATE) | (1L << TIME) | (1L << TIMESTAMP))) != 0)) ) {
				((ElementDateContext)_localctx).dt = (Token)_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(455);
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
		enterRule(_localctx, 98, RULE_elementListFactor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
			match(LPAREN);
			setState(458);
			elementList();
			setState(459);
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
		enterRule(_localctx, 100, RULE_elementList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
			element();
			setState(463);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(462);
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
		enterRule(_localctx, 102, RULE_elementListSuffix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465);
			match(COMMA);
			setState(466);
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
		enterRule(_localctx, 104, RULE_elementOpEle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(468);
			elementOpFactory();
			setState(470);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				{
				setState(469);
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
		enterRule(_localctx, 106, RULE_elementOpEleSuffix);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(473);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				{
				setState(472);
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
			setState(475);
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
		enterRule(_localctx, 108, RULE_funCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(477);
			((FunCallContext)_localctx).funName = match(ID);
			setState(478);
			match(LPAREN);
			setState(480);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLACEHOLDER) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << DATE) | (1L << TIME) | (1L << TIMESTAMP) | (1L << ALL) | (1L << ANY) | (1L << SOME) | (1L << UNKNOWN) | (1L << ASTERISK))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (INT - 65)) | (1L << (DECIMAL - 65)) | (1L << (STRING - 65)) | (1L << (ID - 65)) | (1L << (COLUMN_REL - 65)) | (1L << (LPAREN - 65)))) != 0)) {
				{
				setState(479);
				paramList();
				}
			}

			setState(482);
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
		public ElementContext param;
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
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
		enterRule(_localctx, 110, RULE_paramList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(484);
			((ParamListContext)_localctx).param = element();
			setState(486);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(485);
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
		enterRule(_localctx, 112, RULE_paramSuffix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(488);
			match(COMMA);
			setState(489);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3f\u01ee\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\3\2\3\2\3\2\3\2\5"+
		"\2y\n\2\3\3\3\3\5\3}\n\3\3\3\3\3\3\3\3\3\3\3\5\3\u0084\n\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\5\3\u008c\n\3\3\4\3\4\5\4\u0090\n\4\3\5\3\5\3\5\3\6\3\6\5"+
		"\6\u0097\n\6\3\7\3\7\3\7\3\b\3\b\5\b\u009e\n\b\3\b\3\b\3\b\5\b\u00a3\n"+
		"\b\3\b\3\b\5\b\u00a7\n\b\3\b\3\b\3\b\5\b\u00ac\n\b\3\b\3\b\5\b\u00b0\n"+
		"\b\3\b\3\b\3\b\5\b\u00b5\n\b\3\b\3\b\3\b\5\b\u00ba\n\b\3\b\3\b\3\b\3\b"+
		"\5\b\u00c0\n\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00c8\n\b\3\b\5\b\u00cb\n\b"+
		"\3\t\3\t\5\t\u00cf\n\t\3\t\3\t\3\n\3\n\5\n\u00d5\n\n\3\n\5\n\u00d8\n\n"+
		"\3\n\5\n\u00db\n\n\3\13\3\13\3\13\3\f\3\f\5\f\u00e2\n\f\3\r\3\r\3\r\3"+
		"\16\3\16\5\16\u00e9\n\16\3\17\3\17\3\17\5\17\u00ee\n\17\3\20\3\20\3\20"+
		"\3\20\5\20\u00f4\n\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\3\23\3\23\5\23\u0104\n\23\3\24\3\24\3\24\3\24\5\24\u010a\n"+
		"\24\3\24\3\24\5\24\u010e\n\24\5\24\u0110\n\24\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\5\25\u0119\n\25\3\26\3\26\5\26\u011d\n\26\3\26\5\26\u0120\n"+
		"\26\3\27\3\27\3\27\3\30\3\30\5\30\u0127\n\30\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\5\31\u012f\n\31\3\31\3\31\5\31\u0133\n\31\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\5\32\u013b\n\32\3\33\3\33\5\33\u013f\n\33\3\34\3\34\3\34\3\35"+
		"\3\35\3\35\3\35\5\35\u0148\n\35\3\36\3\36\3\36\3\36\3\36\5\36\u014f\n"+
		"\36\3\36\3\36\5\36\u0153\n\36\3\37\3\37\5\37\u0157\n\37\3\37\5\37\u015a"+
		"\n\37\3 \3 \5 \u015e\n \3!\3!\3!\3\"\3\"\5\"\u0165\n\"\3#\3#\3#\3#\3#"+
		"\5#\u016c\n#\3$\3$\3$\5$\u0171\n$\3%\3%\3%\3%\3%\3%\3%\3%\5%\u017b\n%"+
		"\3&\3&\3&\3&\3\'\3\'\5\'\u0183\n\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\5(\u018d"+
		"\n(\3(\3(\3)\3)\5)\u0193\n)\3)\3)\3)\3)\3)\3*\3*\5*\u019c\n*\3*\3*\3*"+
		"\3*\3*\3+\5+\u01a4\n+\3+\3+\3+\3+\3+\3,\3,\3,\3-\3-\5-\u01b0\n-\3-\3-"+
		"\3-\3.\3.\3.\5.\u01b8\n.\3/\3/\3/\3/\5/\u01be\n/\3\60\3\60\3\61\5\61\u01c3"+
		"\n\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\64\3\64"+
		"\5\64\u01d2\n\64\3\65\3\65\3\65\3\66\3\66\5\66\u01d9\n\66\3\67\5\67\u01dc"+
		"\n\67\3\67\3\67\38\38\38\58\u01e3\n8\38\38\39\39\59\u01e9\n9\3:\3:\3:"+
		"\3:\2\2;\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668"+
		":<>@BDFHJLNPRTVXZ\\^`bdfhjlnpr\2\r\4\2%%..\3\2\'(\4\2\4\4CC\4\2\24\24"+
		"\66\67\3\2RW\5\2\r\r\22\23\62\62\4\2\3\388\b\2\4\4\r\r\22\23\62\62AAC"+
		"G\3\2.\60\3\2+-\4\2\36\369B\u0200\2x\3\2\2\2\4z\3\2\2\2\6\u008d\3\2\2"+
		"\2\b\u0091\3\2\2\2\n\u0094\3\2\2\2\f\u0098\3\2\2\2\16\u009b\3\2\2\2\20"+
		"\u00cc\3\2\2\2\22\u00d2\3\2\2\2\24\u00dc\3\2\2\2\26\u00df\3\2\2\2\30\u00e3"+
		"\3\2\2\2\32\u00e8\3\2\2\2\34\u00ed\3\2\2\2\36\u00ef\3\2\2\2 \u00f7\3\2"+
		"\2\2\"\u00fb\3\2\2\2$\u00fe\3\2\2\2&\u010f\3\2\2\2(\u0118\3\2\2\2*\u011a"+
		"\3\2\2\2,\u0121\3\2\2\2.\u0126\3\2\2\2\60\u0128\3\2\2\2\62\u0134\3\2\2"+
		"\2\64\u013c\3\2\2\2\66\u0140\3\2\2\28\u0143\3\2\2\2:\u0149\3\2\2\2<\u0154"+
		"\3\2\2\2>\u015b\3\2\2\2@\u015f\3\2\2\2B\u0164\3\2\2\2D\u0166\3\2\2\2F"+
		"\u016d\3\2\2\2H\u017a\3\2\2\2J\u017c\3\2\2\2L\u0180\3\2\2\2N\u0189\3\2"+
		"\2\2P\u0190\3\2\2\2R\u0199\3\2\2\2T\u01a3\3\2\2\2V\u01aa\3\2\2\2X\u01ad"+
		"\3\2\2\2Z\u01b7\3\2\2\2\\\u01bd\3\2\2\2^\u01bf\3\2\2\2`\u01c2\3\2\2\2"+
		"b\u01c8\3\2\2\2d\u01cb\3\2\2\2f\u01cf\3\2\2\2h\u01d3\3\2\2\2j\u01d6\3"+
		"\2\2\2l\u01db\3\2\2\2n\u01df\3\2\2\2p\u01e6\3\2\2\2r\u01ea\3\2\2\2ty\5"+
		"\4\3\2uy\5.\30\2vy\5:\36\2wy\5\16\b\2xt\3\2\2\2xu\3\2\2\2xv\3\2\2\2xw"+
		"\3\2\2\2y\3\3\2\2\2z|\7\6\2\2{}\7\7\2\2|{\3\2\2\2|}\3\2\2\2}~\3\2\2\2"+
		"~\u0083\7F\2\2\177\u0080\7M\2\2\u0080\u0081\5\6\4\2\u0081\u0082\7L\2\2"+
		"\u0082\u0084\3\2\2\2\u0083\177\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u008b"+
		"\3\2\2\2\u0085\u0086\7\b\2\2\u0086\u0087\7M\2\2\u0087\u0088\5\n\6\2\u0088"+
		"\u0089\7L\2\2\u0089\u008c\3\2\2\2\u008a\u008c\5\16\b\2\u008b\u0085\3\2"+
		"\2\2\u008b\u008a\3\2\2\2\u008c\5\3\2\2\2\u008d\u008f\7F\2\2\u008e\u0090"+
		"\5\b\5\2\u008f\u008e\3\2\2\2\u008f\u0090\3\2\2\2\u0090\7\3\2\2\2\u0091"+
		"\u0092\7Y\2\2\u0092\u0093\5\6\4\2\u0093\t\3\2\2\2\u0094\u0096\5Z.\2\u0095"+
		"\u0097\5\f\7\2\u0096\u0095\3\2\2\2\u0096\u0097\3\2\2\2\u0097\13\3\2\2"+
		"\2\u0098\u0099\7Y\2\2\u0099\u009a\5\n\6\2\u009a\r\3\2\2\2\u009b\u009d"+
		"\7\5\2\2\u009c\u009e\7%\2\2\u009d\u009c\3\2\2\2\u009d\u009e\3\2\2\2\u009e"+
		"\u009f\3\2\2\2\u009f\u00a2\5\22\n\2\u00a0\u00a1\7\n\2\2\u00a1\u00a3\5"+
		"\26\f\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a6\3\2\2\2\u00a4"+
		"\u00a5\7\13\2\2\u00a5\u00a7\5B\"\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2"+
		"\2\2\u00a7\u00ab\3\2\2\2\u00a8\u00a9\7\31\2\2\u00a9\u00aa\7\32\2\2\u00aa"+
		"\u00ac\5*\26\2\u00ab\u00a8\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00af\3\2"+
		"\2\2\u00ad\u00ae\7\35\2\2\u00ae\u00b0\5B\"\2\u00af\u00ad\3\2\2\2\u00af"+
		"\u00b0\3\2\2\2\u00b0\u00b4\3\2\2\2\u00b1\u00b2\7\30\2\2\u00b2\u00b3\7"+
		"\32\2\2\u00b3\u00b5\5*\26\2\u00b4\u00b1\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5"+
		"\u00bf\3\2\2\2\u00b6\u00b9\7\f\2\2\u00b7\u00b8\7C\2\2\u00b8\u00ba\7Y\2"+
		"\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00c0"+
		"\7C\2\2\u00bc\u00bd\7C\2\2\u00bd\u00be\7&\2\2\u00be\u00c0\7C\2\2\u00bf"+
		"\u00b6\3\2\2\2\u00bf\u00bc\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c7\3\2"+
		"\2\2\u00c1\u00c2\7\33\2\2\u00c2\u00c8\7\26\2\2\u00c3\u00c4\7\63\2\2\u00c4"+
		"\u00c5\7\17\2\2\u00c5\u00c6\7\64\2\2\u00c6\u00c8\7\65\2\2\u00c7\u00c1"+
		"\3\2\2\2\u00c7\u00c3\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00ca\3\2\2\2\u00c9"+
		"\u00cb\5\20\t\2\u00ca\u00c9\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\17\3\2\2"+
		"\2\u00cc\u00ce\7\61\2\2\u00cd\u00cf\t\2\2\2\u00ce\u00cd\3\2\2\2\u00ce"+
		"\u00cf\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\5\16\b\2\u00d1\21\3\2\2"+
		"\2\u00d2\u00d7\5Z.\2\u00d3\u00d5\7\36\2\2\u00d4\u00d3\3\2\2\2\u00d4\u00d5"+
		"\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d8\7F\2\2\u00d7\u00d4\3\2\2\2\u00d7"+
		"\u00d8\3\2\2\2\u00d8\u00da\3\2\2\2\u00d9\u00db\5\24\13\2\u00da\u00d9\3"+
		"\2\2\2\u00da\u00db\3\2\2\2\u00db\23\3\2\2\2\u00dc\u00dd\7Y\2\2\u00dd\u00de"+
		"\5\22\n\2\u00de\25\3\2\2\2\u00df\u00e1\5\32\16\2\u00e0\u00e2\5\30\r\2"+
		"\u00e1\u00e0\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\27\3\2\2\2\u00e3\u00e4"+
		"\7Y\2\2\u00e4\u00e5\5\26\f\2\u00e5\31\3\2\2\2\u00e6\u00e9\5\34\17\2\u00e7"+
		"\u00e9\5\"\22\2\u00e8\u00e6\3\2\2\2\u00e8\u00e7\3\2\2\2\u00e9\33\3\2\2"+
		"\2\u00ea\u00ee\5<\37\2\u00eb\u00ee\5\36\20\2\u00ec\u00ee\5 \21\2\u00ed"+
		"\u00ea\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ec\3\2\2\2\u00ee\35\3\2\2"+
		"\2\u00ef\u00f0\7M\2\2\u00f0\u00f1\5\16\b\2\u00f1\u00f3\7L\2\2\u00f2\u00f4"+
		"\7\36\2\2\u00f3\u00f2\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f5\3\2\2\2"+
		"\u00f5\u00f6\7F\2\2\u00f6\37\3\2\2\2\u00f7\u00f8\7M\2\2\u00f8\u00f9\5"+
		"\32\16\2\u00f9\u00fa\7L\2\2\u00fa!\3\2\2\2\u00fb\u00fc\5<\37\2\u00fc\u00fd"+
		"\5$\23\2\u00fd#\3\2\2\2\u00fe\u00ff\5&\24\2\u00ff\u0100\7!\2\2\u0100\u0101"+
		"\5<\37\2\u0101\u0103\5(\25\2\u0102\u0104\5$\23\2\u0103\u0102\3\2\2\2\u0103"+
		"\u0104\3\2\2\2\u0104%\3\2\2\2\u0105\u0110\7\37\2\2\u0106\u0110\7)\2\2"+
		"\u0107\u0109\7\"\2\2\u0108\u010a\7 \2\2\u0109\u0108\3\2\2\2\u0109\u010a"+
		"\3\2\2\2\u010a\u0110\3\2\2\2\u010b\u010d\7#\2\2\u010c\u010e\7 \2\2\u010d"+
		"\u010c\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u0110\3\2\2\2\u010f\u0105\3\2"+
		"\2\2\u010f\u0106\3\2\2\2\u010f\u0107\3\2\2\2\u010f\u010b\3\2\2\2\u0110"+
		"\'\3\2\2\2\u0111\u0112\7$\2\2\u0112\u0119\5B\"\2\u0113\u0114\7*\2\2\u0114"+
		"\u0115\7M\2\2\u0115\u0116\5\6\4\2\u0116\u0117\7L\2\2\u0117\u0119\3\2\2"+
		"\2\u0118\u0111\3\2\2\2\u0118\u0113\3\2\2\2\u0119)\3\2\2\2\u011a\u011c"+
		"\5Z.\2\u011b\u011d\t\3\2\2\u011c\u011b\3\2\2\2\u011c\u011d\3\2\2\2\u011d"+
		"\u011f\3\2\2\2\u011e\u0120\5,\27\2\u011f\u011e\3\2\2\2\u011f\u0120\3\2"+
		"\2\2\u0120+\3\2\2\2\u0121\u0122\7Y\2\2\u0122\u0123\5*\26\2\u0123-\3\2"+
		"\2\2\u0124\u0127\5\60\31\2\u0125\u0127\5\62\32\2\u0126\u0124\3\2\2\2\u0126"+
		"\u0125\3\2\2\2\u0127/\3\2\2\2\u0128\u0129\7\26\2\2\u0129\u012a\5<\37\2"+
		"\u012a\u012b\7\27\2\2\u012b\u012e\5\64\33\2\u012c\u012d\7\13\2\2\u012d"+
		"\u012f\5B\"\2\u012e\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0132\3\2"+
		"\2\2\u0130\u0131\7\f\2\2\u0131\u0133\t\4\2\2\u0132\u0130\3\2\2\2\u0132"+
		"\u0133\3\2\2\2\u0133\61\3\2\2\2\u0134\u0135\7\26\2\2\u0135\u0136\5> \2"+
		"\u0136\u0137\7\27\2\2\u0137\u013a\5\64\33\2\u0138\u0139\7\13\2\2\u0139"+
		"\u013b\5B\"\2\u013a\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013b\63\3\2\2\2"+
		"\u013c\u013e\58\35\2\u013d\u013f\5\66\34\2\u013e\u013d\3\2\2\2\u013e\u013f"+
		"\3\2\2\2\u013f\65\3\2\2\2\u0140\u0141\7Y\2\2\u0141\u0142\5\64\33\2\u0142"+
		"\67\3\2\2\2\u0143\u0144\5Z.\2\u0144\u0147\7R\2\2\u0145\u0148\5Z.\2\u0146"+
		"\u0148\7\25\2\2\u0147\u0145\3\2\2\2\u0147\u0146\3\2\2\2\u01489\3\2\2\2"+
		"\u0149\u014a\7\t\2\2\u014a\u014b\7\n\2\2\u014b\u014e\5<\37\2\u014c\u014d"+
		"\7\13\2\2\u014d\u014f\5B\"\2\u014e\u014c\3\2\2\2\u014e\u014f\3\2\2\2\u014f"+
		"\u0152\3\2\2\2\u0150\u0151\7\f\2\2\u0151\u0153\t\4\2\2\u0152\u0150\3\2"+
		"\2\2\u0152\u0153\3\2\2\2\u0153;\3\2\2\2\u0154\u0159\7F\2\2\u0155\u0157"+
		"\7\36\2\2\u0156\u0155\3\2\2\2\u0156\u0157\3\2\2\2\u0157\u0158\3\2\2\2"+
		"\u0158\u015a\7F\2\2\u0159\u0156\3\2\2\2\u0159\u015a\3\2\2\2\u015a=\3\2"+
		"\2\2\u015b\u015d\5<\37\2\u015c\u015e\5@!\2\u015d\u015c\3\2\2\2\u015d\u015e"+
		"\3\2\2\2\u015e?\3\2\2\2\u015f\u0160\7Y\2\2\u0160\u0161\5> \2\u0161A\3"+
		"\2\2\2\u0162\u0165\5D#\2\u0163\u0165\5F$\2\u0164\u0162\3\2\2\2\u0164\u0163"+
		"\3\2\2\2\u0165C\3\2\2\2\u0166\u0167\7M\2\2\u0167\u0168\5B\"\2\u0168\u016b"+
		"\7L\2\2\u0169\u016a\t\5\2\2\u016a\u016c\5B\"\2\u016b\u0169\3\2\2\2\u016b"+
		"\u016c\3\2\2\2\u016cE\3\2\2\2\u016d\u0170\5H%\2\u016e\u016f\t\5\2\2\u016f"+
		"\u0171\5B\"\2\u0170\u016e\3\2\2\2\u0170\u0171\3\2\2\2\u0171G\3\2\2\2\u0172"+
		"\u017b\5J&\2\u0173\u017b\5L\'\2\u0174\u017b\5N(\2\u0175\u017b\5P)\2\u0176"+
		"\u017b\5R*\2\u0177\u017b\5T+\2\u0178\u017b\5V,\2\u0179\u017b\5X-\2\u017a"+
		"\u0172\3\2\2\2\u017a\u0173\3\2\2\2\u017a\u0174\3\2\2\2\u017a\u0175\3\2"+
		"\2\2\u017a\u0176\3\2\2\2\u017a\u0177\3\2\2\2\u017a\u0178\3\2\2\2\u017a"+
		"\u0179\3\2\2\2\u017bI\3\2\2\2\u017c\u017d\5Z.\2\u017d\u017e\t\6\2\2\u017e"+
		"\u017f\5Z.\2\u017fK\3\2\2\2\u0180\u0182\5Z.\2\u0181\u0183\78\2\2\u0182"+
		"\u0181\3\2\2\2\u0182\u0183\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u0185\7\20"+
		"\2\2\u0185\u0186\5Z.\2\u0186\u0187\7\66\2\2\u0187\u0188\5Z.\2\u0188M\3"+
		"\2\2\2\u0189\u018a\5Z.\2\u018a\u018c\7\16\2\2\u018b\u018d\78\2\2\u018c"+
		"\u018b\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u018e\3\2\2\2\u018e\u018f\t\7"+
		"\2\2\u018fO\3\2\2\2\u0190\u0192\5Z.\2\u0191\u0193\78\2\2\u0192\u0191\3"+
		"\2\2\2\u0192\u0193\3\2\2\2\u0193\u0194\3\2\2\2\u0194\u0195\7\17\2\2\u0195"+
		"\u0196\7M\2\2\u0196\u0197\5\16\b\2\u0197\u0198\7L\2\2\u0198Q\3\2\2\2\u0199"+
		"\u019b\5Z.\2\u019a\u019c\78\2\2\u019b\u019a\3\2\2\2\u019b\u019c\3\2\2"+
		"\2\u019c\u019d\3\2\2\2\u019d\u019e\7\17\2\2\u019e\u019f\7M\2\2\u019f\u01a0"+
		"\5\n\6\2\u01a0\u01a1\7L\2\2\u01a1S\3\2\2\2\u01a2\u01a4\78\2\2\u01a3\u01a2"+
		"\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01a6\7\21\2\2"+
		"\u01a6\u01a7\7M\2\2\u01a7\u01a8\5\16\b\2\u01a8\u01a9\7L\2\2\u01a9U\3\2"+
		"\2\2\u01aa\u01ab\t\b\2\2\u01ab\u01ac\5H%\2\u01acW\3\2\2\2\u01ad\u01af"+
		"\5Z.\2\u01ae\u01b0\78\2\2\u01af\u01ae\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0"+
		"\u01b1\3\2\2\2\u01b1\u01b2\7\34\2\2\u01b2\u01b3\5Z.\2\u01b3Y\3\2\2\2\u01b4"+
		"\u01b8\5\\/\2\u01b5\u01b8\5d\63\2\u01b6\u01b8\5j\66\2\u01b7\u01b4\3\2"+
		"\2\2\u01b7\u01b5\3\2\2\2\u01b7\u01b6\3\2\2\2\u01b8[\3\2\2\2\u01b9\u01be"+
		"\5^\60\2\u01ba\u01be\5n8\2\u01bb\u01be\5`\61\2\u01bc\u01be\5b\62\2\u01bd"+
		"\u01b9\3\2\2\2\u01bd\u01ba\3\2\2\2\u01bd\u01bb\3\2\2\2\u01bd\u01bc\3\2"+
		"\2\2\u01be]\3\2\2\2\u01bf\u01c0\t\t\2\2\u01c0_\3\2\2\2\u01c1\u01c3\t\n"+
		"\2\2\u01c2\u01c1\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4"+
		"\u01c5\7M\2\2\u01c5\u01c6\5\16\b\2\u01c6\u01c7\7L\2\2\u01c7a\3\2\2\2\u01c8"+
		"\u01c9\t\13\2\2\u01c9\u01ca\7E\2\2\u01cac\3\2\2\2\u01cb\u01cc\7M\2\2\u01cc"+
		"\u01cd\5f\64\2\u01cd\u01ce\7L\2\2\u01cee\3\2\2\2\u01cf\u01d1\5Z.\2\u01d0"+
		"\u01d2\5h\65\2\u01d1\u01d0\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2g\3\2\2\2"+
		"\u01d3\u01d4\7Y\2\2\u01d4\u01d5\5f\64\2\u01d5i\3\2\2\2\u01d6\u01d8\5\\"+
		"/\2\u01d7\u01d9\5l\67\2\u01d8\u01d7\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9"+
		"k\3\2\2\2\u01da\u01dc\t\f\2\2\u01db\u01da\3\2\2\2\u01db\u01dc\3\2\2\2"+
		"\u01dc\u01dd\3\2\2\2\u01dd\u01de\5j\66\2\u01dem\3\2\2\2\u01df\u01e0\7"+
		"F\2\2\u01e0\u01e2\7M\2\2\u01e1\u01e3\5p9\2\u01e2\u01e1\3\2\2\2\u01e2\u01e3"+
		"\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4\u01e5\7L\2\2\u01e5o\3\2\2\2\u01e6\u01e8"+
		"\5Z.\2\u01e7\u01e9\5r:\2\u01e8\u01e7\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9"+
		"q\3\2\2\2\u01ea\u01eb\7Y\2\2\u01eb\u01ec\5p9\2\u01ecs\3\2\2\2>x|\u0083"+
		"\u008b\u008f\u0096\u009d\u00a2\u00a6\u00ab\u00af\u00b4\u00b9\u00bf\u00c7"+
		"\u00ca\u00ce\u00d4\u00d7\u00da\u00e1\u00e8\u00ed\u00f3\u0103\u0109\u010d"+
		"\u010f\u0118\u011c\u011f\u0126\u012e\u0132\u013a\u013e\u0147\u014e\u0152"+
		"\u0156\u0159\u015d\u0164\u016b\u0170\u017a\u0182\u018c\u0192\u019b\u01a3"+
		"\u01af\u01b7\u01bd\u01c2\u01d1\u01d8\u01db\u01e2\u01e8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}