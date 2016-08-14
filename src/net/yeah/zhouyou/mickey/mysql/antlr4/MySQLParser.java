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
		FROM=8, WHERE=9, LIMIT=10, NULL=11, IS=12, NOT=13, IN=14, BETWEEN=15, 
		AND=16, EXISTS=17, TRUE=18, FALSE=19, OR=20, XOR=21, DEFAULT=22, UPDATE=23, 
		SET=24, ORDER=25, GROUP=26, BY=27, FOR=28, LIKE=29, HAVING=30, AS=31, 
		INNER=32, OUTER=33, JOIN=34, LEFT=35, RIGHT=36, ON=37, DISTINCT=38, OFFSET=39, 
		ASC=40, DESC=41, INT=42, DECIMAL=43, STRING=44, ID=45, COLUMN_REL=46, 
		ALL=47, ANY=48, DIVIDE=49, MOD=50, REGEXP=51, PLUS=52, MINUS=53, NEGATION=54, 
		VERTBAR=55, BITAND=56, POWER_OP=57, BINARY=58, SHIFT_LEFT=59, SHIFT_RIGHT=60, 
		ESCAPE=61, ASTERISK=62, RPAREN=63, LPAREN=64, RBRACK=65, LBRACK=66, COLON=67, 
		ALL_FIELDS=68, EQ=69, LTH=70, GTH=71, NOT_EQ=72, LET=73, GET=74, SEMI=75, 
		COMMA=76, DOT=77, COLLATE=78, CROSS=79, USING=80, INDEX=81, KEY=82, USE=83, 
		IGNORE=84, PARTITION=85, STRAIGHT_JOIN=86, NATURAL=87, OJ=88, NEWLINE=89, 
		WS=90, USER_VAR=91;
	public static final int
		RULE_stat = 0, RULE_insertStat = 1, RULE_columnNames = 2, RULE_columnNamesSuffix = 3, 
		RULE_valueList = 4, RULE_valueListSuffix = 5, RULE_selectStat = 6, RULE_selectExprs = 7, 
		RULE_selectExprsSuffix = 8, RULE_tables = 9, RULE_tableSuffix = 10, RULE_tableRel = 11, 
		RULE_tableSubQuery = 12, RULE_tableRecu = 13, RULE_tableJoin = 14, RULE_gbobExprs = 15, 
		RULE_gbobExprSuffix = 16, RULE_updateStat = 17, RULE_updateSingleTable = 18, 
		RULE_updateMultipleTable = 19, RULE_setExprs = 20, RULE_setExprSuffix = 21, 
		RULE_setExpr = 22, RULE_deleteStat = 23, RULE_tableNameAndAlias = 24, 
		RULE_tableNameAndAliases = 25, RULE_tableNameAndAliasSuffix = 26, RULE_whereCondition = 27, 
		RULE_whereCondSub = 28, RULE_whereCondOp = 29, RULE_expression = 30, RULE_exprRelational = 31, 
		RULE_exprBetweenAnd = 32, RULE_exprIsOrIsNotNull = 33, RULE_exprInSelect = 34, 
		RULE_exprInValues = 35, RULE_exprExists = 36, RULE_exprNot = 37, RULE_element = 38, 
		RULE_funCall = 39, RULE_paramList = 40, RULE_paramSuffix = 41;
	public static final String[] ruleNames = {
		"stat", "insertStat", "columnNames", "columnNamesSuffix", "valueList", 
		"valueListSuffix", "selectStat", "selectExprs", "selectExprsSuffix", "tables", 
		"tableSuffix", "tableRel", "tableSubQuery", "tableRecu", "tableJoin", 
		"gbobExprs", "gbobExprSuffix", "updateStat", "updateSingleTable", "updateMultipleTable", 
		"setExprs", "setExprSuffix", "setExpr", "deleteStat", "tableNameAndAlias", 
		"tableNameAndAliases", "tableNameAndAliasSuffix", "whereCondition", "whereCondSub", 
		"whereCondOp", "expression", "exprRelational", "exprBetweenAnd", "exprIsOrIsNotNull", 
		"exprInSelect", "exprInValues", "exprExists", "exprNot", "element", "funCall", 
		"paramList", "paramSuffix"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'!'", null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, "'all'", 
		"'any'", null, null, "'regexp'", "'+'", "'-'", "'~'", "'|'", "'&'", "'^'", 
		"'binary'", "'<<'", "'>>'", "'escape'", "'*'", "')'", "'('", "']'", "'['", 
		"':'", "'.*'", "'='", "'<'", "'>'", "'!='", "'<='", "'>='", "';'", "','", 
		"'.'", "'collate'", "'cross'", "'using'", "'index'", "'key'", "'use'", 
		"'ignore'", "'partition'", "'straight_join'", "'natural'", "'oj'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "PLACEHOLDER", "SELECT", "INSERT", "INTO", "VALUES", "DELETE", 
		"FROM", "WHERE", "LIMIT", "NULL", "IS", "NOT", "IN", "BETWEEN", "AND", 
		"EXISTS", "TRUE", "FALSE", "OR", "XOR", "DEFAULT", "UPDATE", "SET", "ORDER", 
		"GROUP", "BY", "FOR", "LIKE", "HAVING", "AS", "INNER", "OUTER", "JOIN", 
		"LEFT", "RIGHT", "ON", "DISTINCT", "OFFSET", "ASC", "DESC", "INT", "DECIMAL", 
		"STRING", "ID", "COLUMN_REL", "ALL", "ANY", "DIVIDE", "MOD", "REGEXP", 
		"PLUS", "MINUS", "NEGATION", "VERTBAR", "BITAND", "POWER_OP", "BINARY", 
		"SHIFT_LEFT", "SHIFT_RIGHT", "ESCAPE", "ASTERISK", "RPAREN", "LPAREN", 
		"RBRACK", "LBRACK", "COLON", "ALL_FIELDS", "EQ", "LTH", "GTH", "NOT_EQ", 
		"LET", "GET", "SEMI", "COMMA", "DOT", "COLLATE", "CROSS", "USING", "INDEX", 
		"KEY", "USE", "IGNORE", "PARTITION", "STRAIGHT_JOIN", "NATURAL", "OJ", 
		"NEWLINE", "WS", "USER_VAR"
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
			setState(88);
			switch (_input.LA(1)) {
			case INSERT:
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				insertStat();
				}
				break;
			case UPDATE:
				enterOuterAlt(_localctx, 2);
				{
				setState(85);
				updateStat();
				}
				break;
			case DELETE:
				enterOuterAlt(_localctx, 3);
				{
				setState(86);
				deleteStat();
				}
				break;
			case SELECT:
				enterOuterAlt(_localctx, 4);
				{
				setState(87);
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
		public ColumnNamesContext columnNames() {
			return getRuleContext(ColumnNamesContext.class,0);
		}
		public TerminalNode VALUES() { return getToken(MySQLParser.VALUES, 0); }
		public ValueListContext valueList() {
			return getRuleContext(ValueListContext.class,0);
		}
		public TerminalNode ID() { return getToken(MySQLParser.ID, 0); }
		public TerminalNode INTO() { return getToken(MySQLParser.INTO, 0); }
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
			setState(90);
			match(INSERT);
			setState(92);
			_la = _input.LA(1);
			if (_la==INTO) {
				{
				setState(91);
				match(INTO);
				}
			}

			setState(94);
			((InsertStatContext)_localctx).tableName = match(ID);
			setState(95);
			match(LPAREN);
			setState(96);
			columnNames();
			setState(97);
			match(RPAREN);
			setState(98);
			match(VALUES);
			setState(99);
			match(LPAREN);
			setState(100);
			valueList();
			setState(101);
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
			setState(103);
			((ColumnNamesContext)_localctx).name = match(ID);
			setState(105);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(104);
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
			setState(107);
			match(COMMA);
			setState(108);
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
		public Token name;
		public TerminalNode PLACEHOLDER() { return getToken(MySQLParser.PLACEHOLDER, 0); }
		public TerminalNode ID() { return getToken(MySQLParser.ID, 0); }
		public TerminalNode STRING() { return getToken(MySQLParser.STRING, 0); }
		public TerminalNode NULL() { return getToken(MySQLParser.NULL, 0); }
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
			setState(110);
			((ValueListContext)_localctx).name = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLACEHOLDER) | (1L << NULL) | (1L << STRING) | (1L << ID))) != 0)) ) {
				((ValueListContext)_localctx).name = (Token)_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(112);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(111);
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
			setState(114);
			match(COMMA);
			setState(115);
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
		public TerminalNode FOR() { return getToken(MySQLParser.FOR, 0); }
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
		public TerminalNode UPDATE() { return getToken(MySQLParser.UPDATE, 0); }
		public TerminalNode OFFSET() { return getToken(MySQLParser.OFFSET, 0); }
		public List<TerminalNode> INT() { return getTokens(MySQLParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(MySQLParser.INT, i);
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
		enterRule(_localctx, 12, RULE_selectStat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(SELECT);
			setState(119);
			_la = _input.LA(1);
			if (_la==DISTINCT) {
				{
				setState(118);
				((SelectStatContext)_localctx).distinct = match(DISTINCT);
				}
			}

			setState(121);
			selectExprs();
			setState(124);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(122);
				match(FROM);
				setState(123);
				tables();
				}
			}

			setState(128);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(126);
				match(WHERE);
				setState(127);
				((SelectStatContext)_localctx).where = whereCondition();
				}
			}

			setState(133);
			_la = _input.LA(1);
			if (_la==GROUP) {
				{
				setState(130);
				match(GROUP);
				setState(131);
				match(BY);
				setState(132);
				((SelectStatContext)_localctx).groupByExprs = gbobExprs();
				}
			}

			setState(137);
			_la = _input.LA(1);
			if (_la==HAVING) {
				{
				setState(135);
				match(HAVING);
				setState(136);
				((SelectStatContext)_localctx).having = whereCondition();
				}
			}

			setState(142);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(139);
				match(ORDER);
				setState(140);
				match(BY);
				setState(141);
				((SelectStatContext)_localctx).orderByExprs = gbobExprs();
				}
			}

			setState(153);
			switch (_input.LA(1)) {
			case LIMIT:
				{
				setState(144);
				match(LIMIT);
				{
				setState(147);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(145);
					((SelectStatContext)_localctx).offset = match(INT);
					setState(146);
					match(COMMA);
					}
					break;
				}
				setState(149);
				((SelectStatContext)_localctx).rowCount = match(INT);
				}
				}
				break;
			case INT:
				{
				{
				setState(150);
				((SelectStatContext)_localctx).rowCount = match(INT);
				setState(151);
				match(OFFSET);
				setState(152);
				((SelectStatContext)_localctx).offset = match(INT);
				}
				}
				break;
			case EOF:
			case FOR:
			case RPAREN:
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(157);
			_la = _input.LA(1);
			if (_la==FOR) {
				{
				setState(155);
				match(FOR);
				setState(156);
				((SelectStatContext)_localctx).lock = match(UPDATE);
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
		enterRule(_localctx, 14, RULE_selectExprs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			element();
			setState(164);
			_la = _input.LA(1);
			if (_la==AS || _la==ID) {
				{
				setState(161);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(160);
					match(AS);
					}
				}

				setState(163);
				((SelectExprsContext)_localctx).alias = match(ID);
				}
			}

			setState(167);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(166);
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
		enterRule(_localctx, 16, RULE_selectExprsSuffix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(COMMA);
			setState(170);
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
		enterRule(_localctx, 18, RULE_tables);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			tableRel();
			setState(174);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(173);
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
		enterRule(_localctx, 20, RULE_tableSuffix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(COMMA);
			setState(177);
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
		public TableNameAndAliasContext tableNameAndAlias() {
			return getRuleContext(TableNameAndAliasContext.class,0);
		}
		public TableSubQueryContext tableSubQuery() {
			return getRuleContext(TableSubQueryContext.class,0);
		}
		public TableRecuContext tableRecu() {
			return getRuleContext(TableRecuContext.class,0);
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
		enterRule(_localctx, 22, RULE_tableRel);
		try {
			setState(183);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(179);
				tableNameAndAlias();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(180);
				tableSubQuery();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(181);
				tableRecu();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(182);
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
		enterRule(_localctx, 24, RULE_tableSubQuery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(LPAREN);
			setState(186);
			selectStat();
			setState(187);
			match(RPAREN);
			setState(189);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(188);
				match(AS);
				}
			}

			setState(191);
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
		enterRule(_localctx, 26, RULE_tableRecu);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(LPAREN);
			setState(194);
			tableRel();
			setState(195);
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
		enterRule(_localctx, 28, RULE_tableJoin);
		try {
			enterOuterAlt(_localctx, 1);
			{
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
		enterRule(_localctx, 30, RULE_gbobExprs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			element();
			setState(201);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(200);
				((GbobExprsContext)_localctx).sc = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
					((GbobExprsContext)_localctx).sc = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(204);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(203);
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
		enterRule(_localctx, 32, RULE_gbobExprSuffix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(COMMA);
			setState(207);
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
		enterRule(_localctx, 34, RULE_updateStat);
		try {
			setState(211);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(209);
				updateSingleTable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(210);
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
		enterRule(_localctx, 36, RULE_updateSingleTable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(UPDATE);
			setState(214);
			tableNameAndAlias();
			setState(215);
			match(SET);
			setState(216);
			setExprs();
			setState(219);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(217);
				match(WHERE);
				setState(218);
				whereCondition();
				}
			}

			setState(223);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(221);
				match(LIMIT);
				setState(222);
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
		enterRule(_localctx, 38, RULE_updateMultipleTable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(UPDATE);
			setState(226);
			tableNameAndAliases();
			setState(227);
			match(SET);
			setState(228);
			setExprs();
			setState(231);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(229);
				match(WHERE);
				setState(230);
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
		enterRule(_localctx, 40, RULE_setExprs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			setExpr();
			setState(235);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(234);
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
		enterRule(_localctx, 42, RULE_setExprSuffix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(COMMA);
			setState(238);
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
		enterRule(_localctx, 44, RULE_setExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			((SetExprContext)_localctx).left = element();
			setState(241);
			match(EQ);
			setState(244);
			switch (_input.LA(1)) {
			case PLACEHOLDER:
			case TRUE:
			case FALSE:
			case DECIMAL:
			case STRING:
			case ID:
			case COLUMN_REL:
			case ASTERISK:
			case LPAREN:
				{
				setState(242);
				((SetExprContext)_localctx).right = element();
				}
				break;
			case DEFAULT:
				{
				setState(243);
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
		enterRule(_localctx, 46, RULE_deleteStat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			match(DELETE);
			setState(247);
			match(FROM);
			setState(248);
			tableNameAndAlias();
			setState(251);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(249);
				match(WHERE);
				setState(250);
				whereCondition();
				}
			}

			setState(255);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(253);
				match(LIMIT);
				setState(254);
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
		enterRule(_localctx, 48, RULE_tableNameAndAlias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			((TableNameAndAliasContext)_localctx).name = match(ID);
			setState(262);
			_la = _input.LA(1);
			if (_la==AS || _la==ID) {
				{
				setState(259);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(258);
					match(AS);
					}
				}

				setState(261);
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
		enterRule(_localctx, 50, RULE_tableNameAndAliases);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			tableNameAndAlias();
			setState(266);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(265);
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
		enterRule(_localctx, 52, RULE_tableNameAndAliasSuffix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			match(COMMA);
			setState(269);
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
		enterRule(_localctx, 54, RULE_whereCondition);
		try {
			setState(273);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(271);
				whereCondSub();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(272);
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
		public WhereConditionContext whereCondition() {
			return getRuleContext(WhereConditionContext.class,0);
		}
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
		enterRule(_localctx, 56, RULE_whereCondSub);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			match(LPAREN);
			setState(276);
			whereCondition();
			setState(277);
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
		enterRule(_localctx, 58, RULE_whereCondOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			expression();
			setState(282);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << OR) | (1L << XOR))) != 0)) {
				{
				setState(280);
				((WhereCondOpContext)_localctx).expressionOperator = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << OR) | (1L << XOR))) != 0)) ) {
					((WhereCondOpContext)_localctx).expressionOperator = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(281);
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
		enterRule(_localctx, 60, RULE_expression);
		try {
			setState(290);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(284);
				exprRelational();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(285);
				exprBetweenAnd();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(286);
				exprIsOrIsNotNull();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(287);
				exprInSelect();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(288);
				exprInValues();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(289);
				exprExists();
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
		enterRule(_localctx, 62, RULE_exprRelational);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			((ExprRelationalContext)_localctx).left = element();
			setState(293);
			((ExprRelationalContext)_localctx).relationalOp = _input.LT(1);
			_la = _input.LA(1);
			if ( !(((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (EQ - 69)) | (1L << (LTH - 69)) | (1L << (GTH - 69)) | (1L << (NOT_EQ - 69)) | (1L << (LET - 69)) | (1L << (GET - 69)))) != 0)) ) {
				((ExprRelationalContext)_localctx).relationalOp = (Token)_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(294);
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
		enterRule(_localctx, 64, RULE_exprBetweenAnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			((ExprBetweenAndContext)_localctx).el = element();
			setState(297);
			match(BETWEEN);
			setState(298);
			((ExprBetweenAndContext)_localctx).left = element();
			setState(299);
			match(AND);
			setState(300);
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
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public TerminalNode IS() { return getToken(MySQLParser.IS, 0); }
		public TerminalNode NULL() { return getToken(MySQLParser.NULL, 0); }
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
		enterRule(_localctx, 66, RULE_exprIsOrIsNotNull);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			element();
			setState(303);
			match(IS);
			setState(305);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(304);
				((ExprIsOrIsNotNullContext)_localctx).not = match(NOT);
				}
			}

			setState(307);
			match(NULL);
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
		enterRule(_localctx, 68, RULE_exprInSelect);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			element();
			setState(311);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(310);
				((ExprInSelectContext)_localctx).not = match(NOT);
				}
			}

			setState(313);
			match(IN);
			setState(314);
			match(LPAREN);
			setState(315);
			selectStat();
			setState(316);
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
		enterRule(_localctx, 70, RULE_exprInValues);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			element();
			setState(320);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(319);
				((ExprInValuesContext)_localctx).not = match(NOT);
				}
			}

			setState(322);
			match(IN);
			setState(323);
			match(LPAREN);
			setState(324);
			valueList();
			setState(325);
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
		enterRule(_localctx, 72, RULE_exprExists);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(327);
				((ExprExistsContext)_localctx).not = match(NOT);
				}
			}

			setState(330);
			match(EXISTS);
			setState(331);
			match(LPAREN);
			setState(332);
			selectStat();
			setState(333);
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
		enterRule(_localctx, 74, RULE_exprNot);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			_la = _input.LA(1);
			if ( !(_la==T__0 || _la==NOT) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(336);
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

	public static class ElementContext extends ParserRuleContext {
		public Token txt;
		public TerminalNode PLACEHOLDER() { return getToken(MySQLParser.PLACEHOLDER, 0); }
		public TerminalNode COLUMN_REL() { return getToken(MySQLParser.COLUMN_REL, 0); }
		public TerminalNode DECIMAL() { return getToken(MySQLParser.DECIMAL, 0); }
		public TerminalNode STRING() { return getToken(MySQLParser.STRING, 0); }
		public TerminalNode ID() { return getToken(MySQLParser.ID, 0); }
		public TerminalNode TRUE() { return getToken(MySQLParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(MySQLParser.FALSE, 0); }
		public FunCallContext funCall() {
			return getRuleContext(FunCallContext.class,0);
		}
		public SelectStatContext selectStat() {
			return getRuleContext(SelectStatContext.class,0);
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
		enterRule(_localctx, 76, RULE_element);
		int _la;
		try {
			setState(344);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(338);
				((ElementContext)_localctx).txt = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLACEHOLDER) | (1L << TRUE) | (1L << FALSE) | (1L << DECIMAL) | (1L << STRING) | (1L << ID) | (1L << COLUMN_REL) | (1L << ASTERISK))) != 0)) ) {
					((ElementContext)_localctx).txt = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(339);
				funCall();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(340);
				match(LPAREN);
				setState(341);
				selectStat();
				setState(342);
				match(RPAREN);
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

	public static class FunCallContext extends ParserRuleContext {
		public Token funName;
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public TerminalNode ID() { return getToken(MySQLParser.ID, 0); }
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
		enterRule(_localctx, 78, RULE_funCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			((FunCallContext)_localctx).funName = match(ID);
			setState(347);
			match(LPAREN);
			setState(348);
			paramList();
			setState(349);
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
		enterRule(_localctx, 80, RULE_paramList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			((ParamListContext)_localctx).param = element();
			setState(353);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(352);
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
		enterRule(_localctx, 82, RULE_paramSuffix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			match(COMMA);
			setState(356);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3]\u0169\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\3"+
		"\2\3\2\3\2\3\2\5\2[\n\2\3\3\3\3\5\3_\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\4\3\4\5\4l\n\4\3\5\3\5\3\5\3\6\3\6\5\6s\n\6\3\7\3\7\3\7\3\b\3"+
		"\b\5\bz\n\b\3\b\3\b\3\b\5\b\177\n\b\3\b\3\b\5\b\u0083\n\b\3\b\3\b\3\b"+
		"\5\b\u0088\n\b\3\b\3\b\5\b\u008c\n\b\3\b\3\b\3\b\5\b\u0091\n\b\3\b\3\b"+
		"\3\b\5\b\u0096\n\b\3\b\3\b\3\b\3\b\5\b\u009c\n\b\3\b\3\b\5\b\u00a0\n\b"+
		"\3\t\3\t\5\t\u00a4\n\t\3\t\5\t\u00a7\n\t\3\t\5\t\u00aa\n\t\3\n\3\n\3\n"+
		"\3\13\3\13\5\13\u00b1\n\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\5\r\u00ba\n\r\3"+
		"\16\3\16\3\16\3\16\5\16\u00c0\n\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20"+
		"\3\20\3\21\3\21\5\21\u00cc\n\21\3\21\5\21\u00cf\n\21\3\22\3\22\3\22\3"+
		"\23\3\23\5\23\u00d6\n\23\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00de\n\24"+
		"\3\24\3\24\5\24\u00e2\n\24\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u00ea\n"+
		"\25\3\26\3\26\5\26\u00ee\n\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30\5\30"+
		"\u00f7\n\30\3\31\3\31\3\31\3\31\3\31\5\31\u00fe\n\31\3\31\3\31\5\31\u0102"+
		"\n\31\3\32\3\32\5\32\u0106\n\32\3\32\5\32\u0109\n\32\3\33\3\33\5\33\u010d"+
		"\n\33\3\34\3\34\3\34\3\35\3\35\5\35\u0114\n\35\3\36\3\36\3\36\3\36\3\37"+
		"\3\37\3\37\5\37\u011d\n\37\3 \3 \3 \3 \3 \3 \5 \u0125\n \3!\3!\3!\3!\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\5#\u0134\n#\3#\3#\3$\3$\5$\u013a\n$\3"+
		"$\3$\3$\3$\3$\3%\3%\5%\u0143\n%\3%\3%\3%\3%\3%\3&\5&\u014b\n&\3&\3&\3"+
		"&\3&\3&\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\5(\u015b\n(\3)\3)\3)\3)\3)\3*\3"+
		"*\5*\u0164\n*\3+\3+\3+\3+\2\2,\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:<>@BDFHJLNPRT\2\t\5\2\4\4\r\r./\3\2*+\4\2\4\4,"+
		",\4\2\22\22\26\27\3\2GL\4\2\3\3\17\17\6\2\4\4\24\25-\60@@\u0171\2Z\3\2"+
		"\2\2\4\\\3\2\2\2\6i\3\2\2\2\bm\3\2\2\2\np\3\2\2\2\ft\3\2\2\2\16w\3\2\2"+
		"\2\20\u00a1\3\2\2\2\22\u00ab\3\2\2\2\24\u00ae\3\2\2\2\26\u00b2\3\2\2\2"+
		"\30\u00b9\3\2\2\2\32\u00bb\3\2\2\2\34\u00c3\3\2\2\2\36\u00c7\3\2\2\2 "+
		"\u00c9\3\2\2\2\"\u00d0\3\2\2\2$\u00d5\3\2\2\2&\u00d7\3\2\2\2(\u00e3\3"+
		"\2\2\2*\u00eb\3\2\2\2,\u00ef\3\2\2\2.\u00f2\3\2\2\2\60\u00f8\3\2\2\2\62"+
		"\u0103\3\2\2\2\64\u010a\3\2\2\2\66\u010e\3\2\2\28\u0113\3\2\2\2:\u0115"+
		"\3\2\2\2<\u0119\3\2\2\2>\u0124\3\2\2\2@\u0126\3\2\2\2B\u012a\3\2\2\2D"+
		"\u0130\3\2\2\2F\u0137\3\2\2\2H\u0140\3\2\2\2J\u014a\3\2\2\2L\u0151\3\2"+
		"\2\2N\u015a\3\2\2\2P\u015c\3\2\2\2R\u0161\3\2\2\2T\u0165\3\2\2\2V[\5\4"+
		"\3\2W[\5$\23\2X[\5\60\31\2Y[\5\16\b\2ZV\3\2\2\2ZW\3\2\2\2ZX\3\2\2\2ZY"+
		"\3\2\2\2[\3\3\2\2\2\\^\7\6\2\2]_\7\7\2\2^]\3\2\2\2^_\3\2\2\2_`\3\2\2\2"+
		"`a\7/\2\2ab\7B\2\2bc\5\6\4\2cd\7A\2\2de\7\b\2\2ef\7B\2\2fg\5\n\6\2gh\7"+
		"A\2\2h\5\3\2\2\2ik\7/\2\2jl\5\b\5\2kj\3\2\2\2kl\3\2\2\2l\7\3\2\2\2mn\7"+
		"N\2\2no\5\6\4\2o\t\3\2\2\2pr\t\2\2\2qs\5\f\7\2rq\3\2\2\2rs\3\2\2\2s\13"+
		"\3\2\2\2tu\7N\2\2uv\5\n\6\2v\r\3\2\2\2wy\7\5\2\2xz\7(\2\2yx\3\2\2\2yz"+
		"\3\2\2\2z{\3\2\2\2{~\5\20\t\2|}\7\n\2\2}\177\5\24\13\2~|\3\2\2\2~\177"+
		"\3\2\2\2\177\u0082\3\2\2\2\u0080\u0081\7\13\2\2\u0081\u0083\58\35\2\u0082"+
		"\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0087\3\2\2\2\u0084\u0085\7\34"+
		"\2\2\u0085\u0086\7\35\2\2\u0086\u0088\5 \21\2\u0087\u0084\3\2\2\2\u0087"+
		"\u0088\3\2\2\2\u0088\u008b\3\2\2\2\u0089\u008a\7 \2\2\u008a\u008c\58\35"+
		"\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u0090\3\2\2\2\u008d\u008e"+
		"\7\33\2\2\u008e\u008f\7\35\2\2\u008f\u0091\5 \21\2\u0090\u008d\3\2\2\2"+
		"\u0090\u0091\3\2\2\2\u0091\u009b\3\2\2\2\u0092\u0095\7\f\2\2\u0093\u0094"+
		"\7,\2\2\u0094\u0096\7N\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096"+
		"\u0097\3\2\2\2\u0097\u009c\7,\2\2\u0098\u0099\7,\2\2\u0099\u009a\7)\2"+
		"\2\u009a\u009c\7,\2\2\u009b\u0092\3\2\2\2\u009b\u0098\3\2\2\2\u009b\u009c"+
		"\3\2\2\2\u009c\u009f\3\2\2\2\u009d\u009e\7\36\2\2\u009e\u00a0\7\31\2\2"+
		"\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\17\3\2\2\2\u00a1\u00a6"+
		"\5N(\2\u00a2\u00a4\7!\2\2\u00a3\u00a2\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4"+
		"\u00a5\3\2\2\2\u00a5\u00a7\7/\2\2\u00a6\u00a3\3\2\2\2\u00a6\u00a7\3\2"+
		"\2\2\u00a7\u00a9\3\2\2\2\u00a8\u00aa\5\22\n\2\u00a9\u00a8\3\2\2\2\u00a9"+
		"\u00aa\3\2\2\2\u00aa\21\3\2\2\2\u00ab\u00ac\7N\2\2\u00ac\u00ad\5\20\t"+
		"\2\u00ad\23\3\2\2\2\u00ae\u00b0\5\30\r\2\u00af\u00b1\5\26\f\2\u00b0\u00af"+
		"\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\25\3\2\2\2\u00b2\u00b3\7N\2\2\u00b3"+
		"\u00b4\5\24\13\2\u00b4\27\3\2\2\2\u00b5\u00ba\5\62\32\2\u00b6\u00ba\5"+
		"\32\16\2\u00b7\u00ba\5\34\17\2\u00b8\u00ba\5\36\20\2\u00b9\u00b5\3\2\2"+
		"\2\u00b9\u00b6\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00b8\3\2\2\2\u00ba\31"+
		"\3\2\2\2\u00bb\u00bc\7B\2\2\u00bc\u00bd\5\16\b\2\u00bd\u00bf\7A\2\2\u00be"+
		"\u00c0\7!\2\2\u00bf\u00be\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c1\3\2"+
		"\2\2\u00c1\u00c2\7/\2\2\u00c2\33\3\2\2\2\u00c3\u00c4\7B\2\2\u00c4\u00c5"+
		"\5\30\r\2\u00c5\u00c6\7A\2\2\u00c6\35\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8"+
		"\37\3\2\2\2\u00c9\u00cb\5N(\2\u00ca\u00cc\t\3\2\2\u00cb\u00ca\3\2\2\2"+
		"\u00cb\u00cc\3\2\2\2\u00cc\u00ce\3\2\2\2\u00cd\u00cf\5\"\22\2\u00ce\u00cd"+
		"\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf!\3\2\2\2\u00d0\u00d1\7N\2\2\u00d1\u00d2"+
		"\5 \21\2\u00d2#\3\2\2\2\u00d3\u00d6\5&\24\2\u00d4\u00d6\5(\25\2\u00d5"+
		"\u00d3\3\2\2\2\u00d5\u00d4\3\2\2\2\u00d6%\3\2\2\2\u00d7\u00d8\7\31\2\2"+
		"\u00d8\u00d9\5\62\32\2\u00d9\u00da\7\32\2\2\u00da\u00dd\5*\26\2\u00db"+
		"\u00dc\7\13\2\2\u00dc\u00de\58\35\2\u00dd\u00db\3\2\2\2\u00dd\u00de\3"+
		"\2\2\2\u00de\u00e1\3\2\2\2\u00df\u00e0\7\f\2\2\u00e0\u00e2\t\4\2\2\u00e1"+
		"\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\'\3\2\2\2\u00e3\u00e4\7\31\2"+
		"\2\u00e4\u00e5\5\64\33\2\u00e5\u00e6\7\32\2\2\u00e6\u00e9\5*\26\2\u00e7"+
		"\u00e8\7\13\2\2\u00e8\u00ea\58\35\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3"+
		"\2\2\2\u00ea)\3\2\2\2\u00eb\u00ed\5.\30\2\u00ec\u00ee\5,\27\2\u00ed\u00ec"+
		"\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee+\3\2\2\2\u00ef\u00f0\7N\2\2\u00f0\u00f1"+
		"\5*\26\2\u00f1-\3\2\2\2\u00f2\u00f3\5N(\2\u00f3\u00f6\7G\2\2\u00f4\u00f7"+
		"\5N(\2\u00f5\u00f7\7\30\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f5\3\2\2\2\u00f7"+
		"/\3\2\2\2\u00f8\u00f9\7\t\2\2\u00f9\u00fa\7\n\2\2\u00fa\u00fd\5\62\32"+
		"\2\u00fb\u00fc\7\13\2\2\u00fc\u00fe\58\35\2\u00fd\u00fb\3\2\2\2\u00fd"+
		"\u00fe\3\2\2\2\u00fe\u0101\3\2\2\2\u00ff\u0100\7\f\2\2\u0100\u0102\t\4"+
		"\2\2\u0101\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102\61\3\2\2\2\u0103\u0108"+
		"\7/\2\2\u0104\u0106\7!\2\2\u0105\u0104\3\2\2\2\u0105\u0106\3\2\2\2\u0106"+
		"\u0107\3\2\2\2\u0107\u0109\7/\2\2\u0108\u0105\3\2\2\2\u0108\u0109\3\2"+
		"\2\2\u0109\63\3\2\2\2\u010a\u010c\5\62\32\2\u010b\u010d\5\66\34\2\u010c"+
		"\u010b\3\2\2\2\u010c\u010d\3\2\2\2\u010d\65\3\2\2\2\u010e\u010f\7N\2\2"+
		"\u010f\u0110\5\64\33\2\u0110\67\3\2\2\2\u0111\u0114\5:\36\2\u0112\u0114"+
		"\5<\37\2\u0113\u0111\3\2\2\2\u0113\u0112\3\2\2\2\u01149\3\2\2\2\u0115"+
		"\u0116\7B\2\2\u0116\u0117\58\35\2\u0117\u0118\7A\2\2\u0118;\3\2\2\2\u0119"+
		"\u011c\5> \2\u011a\u011b\t\5\2\2\u011b\u011d\58\35\2\u011c\u011a\3\2\2"+
		"\2\u011c\u011d\3\2\2\2\u011d=\3\2\2\2\u011e\u0125\5@!\2\u011f\u0125\5"+
		"B\"\2\u0120\u0125\5D#\2\u0121\u0125\5F$\2\u0122\u0125\5H%\2\u0123\u0125"+
		"\5J&\2\u0124\u011e\3\2\2\2\u0124\u011f\3\2\2\2\u0124\u0120\3\2\2\2\u0124"+
		"\u0121\3\2\2\2\u0124\u0122\3\2\2\2\u0124\u0123\3\2\2\2\u0125?\3\2\2\2"+
		"\u0126\u0127\5N(\2\u0127\u0128\t\6\2\2\u0128\u0129\5N(\2\u0129A\3\2\2"+
		"\2\u012a\u012b\5N(\2\u012b\u012c\7\21\2\2\u012c\u012d\5N(\2\u012d\u012e"+
		"\7\22\2\2\u012e\u012f\5N(\2\u012fC\3\2\2\2\u0130\u0131\5N(\2\u0131\u0133"+
		"\7\16\2\2\u0132\u0134\7\17\2\2\u0133\u0132\3\2\2\2\u0133\u0134\3\2\2\2"+
		"\u0134\u0135\3\2\2\2\u0135\u0136\7\r\2\2\u0136E\3\2\2\2\u0137\u0139\5"+
		"N(\2\u0138\u013a\7\17\2\2\u0139\u0138\3\2\2\2\u0139\u013a\3\2\2\2\u013a"+
		"\u013b\3\2\2\2\u013b\u013c\7\20\2\2\u013c\u013d\7B\2\2\u013d\u013e\5\16"+
		"\b\2\u013e\u013f\7A\2\2\u013fG\3\2\2\2\u0140\u0142\5N(\2\u0141\u0143\7"+
		"\17\2\2\u0142\u0141\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0144\3\2\2\2\u0144"+
		"\u0145\7\20\2\2\u0145\u0146\7B\2\2\u0146\u0147\5\n\6\2\u0147\u0148\7A"+
		"\2\2\u0148I\3\2\2\2\u0149\u014b\7\17\2\2\u014a\u0149\3\2\2\2\u014a\u014b"+
		"\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u014d\7\23\2\2\u014d\u014e\7B\2\2\u014e"+
		"\u014f\5\16\b\2\u014f\u0150\7A\2\2\u0150K\3\2\2\2\u0151\u0152\t\7\2\2"+
		"\u0152\u0153\5> \2\u0153M\3\2\2\2\u0154\u015b\t\b\2\2\u0155\u015b\5P)"+
		"\2\u0156\u0157\7B\2\2\u0157\u0158\5\16\b\2\u0158\u0159\7A\2\2\u0159\u015b"+
		"\3\2\2\2\u015a\u0154\3\2\2\2\u015a\u0155\3\2\2\2\u015a\u0156\3\2\2\2\u015b"+
		"O\3\2\2\2\u015c\u015d\7/\2\2\u015d\u015e\7B\2\2\u015e\u015f\5R*\2\u015f"+
		"\u0160\7A\2\2\u0160Q\3\2\2\2\u0161\u0163\5N(\2\u0162\u0164\5T+\2\u0163"+
		"\u0162\3\2\2\2\u0163\u0164\3\2\2\2\u0164S\3\2\2\2\u0165\u0166\7N\2\2\u0166"+
		"\u0167\5R*\2\u0167U\3\2\2\2+Z^kry~\u0082\u0087\u008b\u0090\u0095\u009b"+
		"\u009f\u00a3\u00a6\u00a9\u00b0\u00b9\u00bf\u00cb\u00ce\u00d5\u00dd\u00e1"+
		"\u00e9\u00ed\u00f6\u00fd\u0101\u0105\u0108\u010c\u0113\u011c\u0124\u0133"+
		"\u0139\u0142\u014a\u015a\u0163";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}