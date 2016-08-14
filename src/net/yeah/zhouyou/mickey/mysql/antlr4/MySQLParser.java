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
		T__0=1, SELECT=2, PLACEHOLDER=3, INSERT=4, INTO=5, VALUES=6, DELETE=7, 
		FROM=8, WHERE=9, LIMIT=10, NULL=11, IS=12, NOT=13, IN=14, BETWEEN=15, 
		AND=16, EXISTS=17, TRUE=18, FALSE=19, OR=20, XOR=21, DEFAULT=22, UPDATE=23, 
		SET=24, ORDER=25, GROUP=26, BY=27, FOR=28, LIKE=29, HAVING=30, AS=31, 
		INNER=32, OUTER=33, JOIN=34, LEFT=35, RIGHT=36, ON=37, DISTINCT=38, OFFSET=39, 
		INT=40, DECIMAL=41, STRING=42, ID=43, COLUMN_REL=44, ALL=45, ANY=46, DIVIDE=47, 
		MOD=48, REGEXP=49, PLUS=50, MINUS=51, NEGATION=52, VERTBAR=53, BITAND=54, 
		POWER_OP=55, BINARY=56, SHIFT_LEFT=57, SHIFT_RIGHT=58, ESCAPE=59, ASTERISK=60, 
		RPAREN=61, LPAREN=62, RBRACK=63, LBRACK=64, COLON=65, ALL_FIELDS=66, EQ=67, 
		LTH=68, GTH=69, NOT_EQ=70, LET=71, GET=72, SEMI=73, COMMA=74, DOT=75, 
		COLLATE=76, CROSS=77, USING=78, INDEX=79, KEY=80, USE=81, IGNORE=82, PARTITION=83, 
		STRAIGHT_JOIN=84, NATURAL=85, OJ=86, NEWLINE=87, WS=88, USER_VAR=89;
	public static final int
		RULE_stat = 0, RULE_insertStat = 1, RULE_columnNames = 2, RULE_columnNamesSuffix = 3, 
		RULE_valueList = 4, RULE_valueListSuffix = 5, RULE_selectStat = 6, RULE_selectExprs = 7, 
		RULE_tables = 8, RULE_gbobExprs = 9, RULE_updateStat = 10, RULE_updateSingleTable = 11, 
		RULE_updateMultipleTable = 12, RULE_setExprs = 13, RULE_setExprSuffix = 14, 
		RULE_setExpr = 15, RULE_deleteStat = 16, RULE_tableNameAndAlias = 17, 
		RULE_tableNameAndAliases = 18, RULE_tableNameAndAliasSuffix = 19, RULE_whereCondition = 20, 
		RULE_whereCondSub = 21, RULE_whereCondOp = 22, RULE_expression = 23, RULE_exprRelational = 24, 
		RULE_exprBetweenAnd = 25, RULE_exprIsOrIsNotNull = 26, RULE_exprInSelect = 27, 
		RULE_exprInValues = 28, RULE_exprExists = 29, RULE_exprNot = 30, RULE_element = 31, 
		RULE_funCall = 32, RULE_paramList = 33, RULE_paramSuffix = 34;
	public static final String[] ruleNames = {
		"stat", "insertStat", "columnNames", "columnNamesSuffix", "valueList", 
		"valueListSuffix", "selectStat", "selectExprs", "tables", "gbobExprs", 
		"updateStat", "updateSingleTable", "updateMultipleTable", "setExprs", 
		"setExprSuffix", "setExpr", "deleteStat", "tableNameAndAlias", "tableNameAndAliases", 
		"tableNameAndAliasSuffix", "whereCondition", "whereCondSub", "whereCondOp", 
		"expression", "exprRelational", "exprBetweenAnd", "exprIsOrIsNotNull", 
		"exprInSelect", "exprInValues", "exprExists", "exprNot", "element", "funCall", 
		"paramList", "paramSuffix"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'!'", null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, "'all'", "'any'", 
		null, null, "'regexp'", "'+'", "'-'", "'~'", "'|'", "'&'", "'^'", "'binary'", 
		"'<<'", "'>>'", "'escape'", "'*'", "')'", "'('", "']'", "'['", "':'", 
		"'.*'", "'='", "'<'", "'>'", "'!='", "'<='", "'>='", "';'", "','", "'.'", 
		"'collate'", "'cross'", "'using'", "'index'", "'key'", "'use'", "'ignore'", 
		"'partition'", "'straight_join'", "'natural'", "'oj'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "SELECT", "PLACEHOLDER", "INSERT", "INTO", "VALUES", "DELETE", 
		"FROM", "WHERE", "LIMIT", "NULL", "IS", "NOT", "IN", "BETWEEN", "AND", 
		"EXISTS", "TRUE", "FALSE", "OR", "XOR", "DEFAULT", "UPDATE", "SET", "ORDER", 
		"GROUP", "BY", "FOR", "LIKE", "HAVING", "AS", "INNER", "OUTER", "JOIN", 
		"LEFT", "RIGHT", "ON", "DISTINCT", "OFFSET", "INT", "DECIMAL", "STRING", 
		"ID", "COLUMN_REL", "ALL", "ANY", "DIVIDE", "MOD", "REGEXP", "PLUS", "MINUS", 
		"NEGATION", "VERTBAR", "BITAND", "POWER_OP", "BINARY", "SHIFT_LEFT", "SHIFT_RIGHT", 
		"ESCAPE", "ASTERISK", "RPAREN", "LPAREN", "RBRACK", "LBRACK", "COLON", 
		"ALL_FIELDS", "EQ", "LTH", "GTH", "NOT_EQ", "LET", "GET", "SEMI", "COMMA", 
		"DOT", "COLLATE", "CROSS", "USING", "INDEX", "KEY", "USE", "IGNORE", "PARTITION", 
		"STRAIGHT_JOIN", "NATURAL", "OJ", "NEWLINE", "WS", "USER_VAR"
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
			setState(74);
			switch (_input.LA(1)) {
			case INSERT:
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				insertStat();
				}
				break;
			case UPDATE:
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
				updateStat();
				}
				break;
			case DELETE:
				enterOuterAlt(_localctx, 3);
				{
				setState(72);
				deleteStat();
				}
				break;
			case SELECT:
				enterOuterAlt(_localctx, 4);
				{
				setState(73);
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
			setState(76);
			match(INSERT);
			setState(78);
			_la = _input.LA(1);
			if (_la==INTO) {
				{
				setState(77);
				match(INTO);
				}
			}

			setState(80);
			((InsertStatContext)_localctx).tableName = match(ID);
			setState(81);
			match(LPAREN);
			setState(82);
			columnNames();
			setState(83);
			match(RPAREN);
			setState(84);
			match(VALUES);
			setState(85);
			match(LPAREN);
			setState(86);
			valueList();
			setState(87);
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
			setState(89);
			((ColumnNamesContext)_localctx).name = match(ID);
			setState(91);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(90);
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
			setState(93);
			match(COMMA);
			setState(94);
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
			setState(96);
			((ValueListContext)_localctx).name = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLACEHOLDER) | (1L << NULL) | (1L << STRING) | (1L << ID))) != 0)) ) {
				((ValueListContext)_localctx).name = (Token)_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(98);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(97);
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
			setState(100);
			match(COMMA);
			setState(101);
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
		public List<WhereConditionContext> whereCondition() {
			return getRuleContexts(WhereConditionContext.class);
		}
		public WhereConditionContext whereCondition(int i) {
			return getRuleContext(WhereConditionContext.class,i);
		}
		public TerminalNode GROUP() { return getToken(MySQLParser.GROUP, 0); }
		public List<TerminalNode> BY() { return getTokens(MySQLParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(MySQLParser.BY, i);
		}
		public List<GbobExprsContext> gbobExprs() {
			return getRuleContexts(GbobExprsContext.class);
		}
		public GbobExprsContext gbobExprs(int i) {
			return getRuleContext(GbobExprsContext.class,i);
		}
		public TerminalNode HAVING() { return getToken(MySQLParser.HAVING, 0); }
		public TerminalNode ORDER() { return getToken(MySQLParser.ORDER, 0); }
		public TerminalNode LIMIT() { return getToken(MySQLParser.LIMIT, 0); }
		public TerminalNode FOR() { return getToken(MySQLParser.FOR, 0); }
		public TerminalNode DISTINCT() { return getToken(MySQLParser.DISTINCT, 0); }
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
			setState(103);
			match(SELECT);
			setState(105);
			_la = _input.LA(1);
			if (_la==DISTINCT) {
				{
				setState(104);
				((SelectStatContext)_localctx).distinct = match(DISTINCT);
				}
			}

			setState(107);
			selectExprs();
			setState(108);
			match(FROM);
			setState(109);
			tables();
			setState(112);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(110);
				match(WHERE);
				setState(111);
				whereCondition();
				}
			}

			setState(117);
			_la = _input.LA(1);
			if (_la==GROUP) {
				{
				setState(114);
				match(GROUP);
				setState(115);
				match(BY);
				setState(116);
				gbobExprs();
				}
			}

			setState(121);
			_la = _input.LA(1);
			if (_la==HAVING) {
				{
				setState(119);
				match(HAVING);
				setState(120);
				whereCondition();
				}
			}

			setState(126);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(123);
				match(ORDER);
				setState(124);
				match(BY);
				setState(125);
				gbobExprs();
				}
			}

			setState(137);
			switch (_input.LA(1)) {
			case LIMIT:
				{
				setState(128);
				match(LIMIT);
				{
				setState(131);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(129);
					((SelectStatContext)_localctx).offset = match(INT);
					setState(130);
					match(COMMA);
					}
					break;
				}
				setState(133);
				((SelectStatContext)_localctx).rowCount = match(INT);
				}
				}
				break;
			case INT:
				{
				{
				setState(134);
				((SelectStatContext)_localctx).rowCount = match(INT);
				setState(135);
				match(OFFSET);
				setState(136);
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
			setState(141);
			_la = _input.LA(1);
			if (_la==FOR) {
				{
				setState(139);
				match(FOR);
				setState(140);
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

	public static class TablesContext extends ParserRuleContext {
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
		enterRule(_localctx, 16, RULE_tables);
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
		enterRule(_localctx, 18, RULE_gbobExprs);
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
		enterRule(_localctx, 20, RULE_updateStat);
		try {
			setState(151);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				updateSingleTable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(150);
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
		enterRule(_localctx, 22, RULE_updateSingleTable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(UPDATE);
			setState(154);
			tableNameAndAlias();
			setState(155);
			match(SET);
			setState(156);
			setExprs();
			setState(159);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(157);
				match(WHERE);
				setState(158);
				whereCondition();
				}
			}

			setState(163);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(161);
				match(LIMIT);
				setState(162);
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
		enterRule(_localctx, 24, RULE_updateMultipleTable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(UPDATE);
			setState(166);
			tableNameAndAliases();
			setState(167);
			match(SET);
			setState(168);
			setExprs();
			setState(171);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(169);
				match(WHERE);
				setState(170);
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
		enterRule(_localctx, 26, RULE_setExprs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			setExpr();
			setState(175);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(174);
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
		enterRule(_localctx, 28, RULE_setExprSuffix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(COMMA);
			setState(178);
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
		enterRule(_localctx, 30, RULE_setExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			((SetExprContext)_localctx).left = element();
			setState(181);
			match(EQ);
			setState(184);
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
				setState(182);
				((SetExprContext)_localctx).right = element();
				}
				break;
			case DEFAULT:
				{
				setState(183);
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
		enterRule(_localctx, 32, RULE_deleteStat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(DELETE);
			setState(187);
			match(FROM);
			setState(188);
			tableNameAndAlias();
			setState(191);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(189);
				match(WHERE);
				setState(190);
				whereCondition();
				}
			}

			setState(195);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(193);
				match(LIMIT);
				setState(194);
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
		enterRule(_localctx, 34, RULE_tableNameAndAlias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			((TableNameAndAliasContext)_localctx).name = match(ID);
			setState(199);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(198);
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
		enterRule(_localctx, 36, RULE_tableNameAndAliases);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			tableNameAndAlias();
			setState(203);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(202);
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
		enterRule(_localctx, 38, RULE_tableNameAndAliasSuffix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(COMMA);
			setState(206);
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
		enterRule(_localctx, 40, RULE_whereCondition);
		try {
			setState(210);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(208);
				whereCondSub();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(209);
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
		enterRule(_localctx, 42, RULE_whereCondSub);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(LPAREN);
			setState(213);
			whereCondition();
			setState(214);
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
		enterRule(_localctx, 44, RULE_whereCondOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			expression();
			setState(219);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << OR) | (1L << XOR))) != 0)) {
				{
				setState(217);
				((WhereCondOpContext)_localctx).expressionOperator = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << OR) | (1L << XOR))) != 0)) ) {
					((WhereCondOpContext)_localctx).expressionOperator = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(218);
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
		enterRule(_localctx, 46, RULE_expression);
		try {
			setState(227);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(221);
				exprRelational();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(222);
				exprBetweenAnd();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(223);
				exprIsOrIsNotNull();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(224);
				exprInSelect();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(225);
				exprInValues();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(226);
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
		enterRule(_localctx, 48, RULE_exprRelational);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			((ExprRelationalContext)_localctx).left = element();
			setState(230);
			((ExprRelationalContext)_localctx).relationalOp = _input.LT(1);
			_la = _input.LA(1);
			if ( !(((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (EQ - 67)) | (1L << (LTH - 67)) | (1L << (GTH - 67)) | (1L << (NOT_EQ - 67)) | (1L << (LET - 67)) | (1L << (GET - 67)))) != 0)) ) {
				((ExprRelationalContext)_localctx).relationalOp = (Token)_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(231);
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
		enterRule(_localctx, 50, RULE_exprBetweenAnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			((ExprBetweenAndContext)_localctx).el = element();
			setState(234);
			match(BETWEEN);
			setState(235);
			((ExprBetweenAndContext)_localctx).left = element();
			setState(236);
			match(AND);
			setState(237);
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
		enterRule(_localctx, 52, RULE_exprIsOrIsNotNull);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			element();
			setState(240);
			match(IS);
			setState(242);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(241);
				((ExprIsOrIsNotNullContext)_localctx).not = match(NOT);
				}
			}

			setState(244);
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
		enterRule(_localctx, 54, RULE_exprInSelect);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			element();
			setState(248);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(247);
				((ExprInSelectContext)_localctx).not = match(NOT);
				}
			}

			setState(250);
			match(IN);
			setState(251);
			match(LPAREN);
			setState(252);
			selectStat();
			setState(253);
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
		enterRule(_localctx, 56, RULE_exprInValues);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			element();
			setState(257);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(256);
				((ExprInValuesContext)_localctx).not = match(NOT);
				}
			}

			setState(259);
			match(IN);
			setState(260);
			match(LPAREN);
			setState(261);
			valueList();
			setState(262);
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
		enterRule(_localctx, 58, RULE_exprExists);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(264);
				((ExprExistsContext)_localctx).not = match(NOT);
				}
			}

			setState(267);
			match(EXISTS);
			setState(268);
			match(LPAREN);
			setState(269);
			selectStat();
			setState(270);
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
		enterRule(_localctx, 60, RULE_exprNot);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			_la = _input.LA(1);
			if ( !(_la==T__0 || _la==NOT) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(273);
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
		enterRule(_localctx, 62, RULE_element);
		int _la;
		try {
			setState(281);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(275);
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
				setState(276);
				funCall();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(277);
				match(LPAREN);
				setState(278);
				selectStat();
				setState(279);
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
		enterRule(_localctx, 64, RULE_funCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			((FunCallContext)_localctx).funName = match(ID);
			setState(284);
			match(LPAREN);
			setState(285);
			paramList();
			setState(286);
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
		enterRule(_localctx, 66, RULE_paramList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			((ParamListContext)_localctx).param = element();
			setState(290);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(289);
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
		enterRule(_localctx, 68, RULE_paramSuffix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			match(COMMA);
			setState(293);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3[\u012a\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\3\2\3\2\3\2\3\2\5\2M\n\2\3\3\3\3\5\3Q\n\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\5\4^\n\4\3\5\3\5\3\5\3\6\3\6"+
		"\5\6e\n\6\3\7\3\7\3\7\3\b\3\b\5\bl\n\b\3\b\3\b\3\b\3\b\3\b\5\bs\n\b\3"+
		"\b\3\b\3\b\5\bx\n\b\3\b\3\b\5\b|\n\b\3\b\3\b\3\b\5\b\u0081\n\b\3\b\3\b"+
		"\3\b\5\b\u0086\n\b\3\b\3\b\3\b\3\b\5\b\u008c\n\b\3\b\3\b\5\b\u0090\n\b"+
		"\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\5\f\u009a\n\f\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\5\r\u00a2\n\r\3\r\3\r\5\r\u00a6\n\r\3\16\3\16\3\16\3\16\3\16\3\16\5"+
		"\16\u00ae\n\16\3\17\3\17\5\17\u00b2\n\17\3\20\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\5\21\u00bb\n\21\3\22\3\22\3\22\3\22\3\22\5\22\u00c2\n\22\3\22\3"+
		"\22\5\22\u00c6\n\22\3\23\3\23\5\23\u00ca\n\23\3\24\3\24\5\24\u00ce\n\24"+
		"\3\25\3\25\3\25\3\26\3\26\5\26\u00d5\n\26\3\27\3\27\3\27\3\27\3\30\3\30"+
		"\3\30\5\30\u00de\n\30\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u00e6\n\31\3"+
		"\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\5\34\u00f5"+
		"\n\34\3\34\3\34\3\35\3\35\5\35\u00fb\n\35\3\35\3\35\3\35\3\35\3\35\3\36"+
		"\3\36\5\36\u0104\n\36\3\36\3\36\3\36\3\36\3\36\3\37\5\37\u010c\n\37\3"+
		"\37\3\37\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3!\3!\3!\5!\u011c\n!\3\"\3\""+
		"\3\"\3\"\3\"\3#\3#\5#\u0125\n#\3$\3$\3$\3$\2\2%\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDF\2\b\5\2\5\5\r\r,-\4\2\5\5"+
		"**\4\2\22\22\26\27\3\2EJ\4\2\3\3\17\17\6\2\5\5\24\25+.>>\u012d\2L\3\2"+
		"\2\2\4N\3\2\2\2\6[\3\2\2\2\b_\3\2\2\2\nb\3\2\2\2\ff\3\2\2\2\16i\3\2\2"+
		"\2\20\u0091\3\2\2\2\22\u0093\3\2\2\2\24\u0095\3\2\2\2\26\u0099\3\2\2\2"+
		"\30\u009b\3\2\2\2\32\u00a7\3\2\2\2\34\u00af\3\2\2\2\36\u00b3\3\2\2\2 "+
		"\u00b6\3\2\2\2\"\u00bc\3\2\2\2$\u00c7\3\2\2\2&\u00cb\3\2\2\2(\u00cf\3"+
		"\2\2\2*\u00d4\3\2\2\2,\u00d6\3\2\2\2.\u00da\3\2\2\2\60\u00e5\3\2\2\2\62"+
		"\u00e7\3\2\2\2\64\u00eb\3\2\2\2\66\u00f1\3\2\2\28\u00f8\3\2\2\2:\u0101"+
		"\3\2\2\2<\u010b\3\2\2\2>\u0112\3\2\2\2@\u011b\3\2\2\2B\u011d\3\2\2\2D"+
		"\u0122\3\2\2\2F\u0126\3\2\2\2HM\5\4\3\2IM\5\26\f\2JM\5\"\22\2KM\5\16\b"+
		"\2LH\3\2\2\2LI\3\2\2\2LJ\3\2\2\2LK\3\2\2\2M\3\3\2\2\2NP\7\6\2\2OQ\7\7"+
		"\2\2PO\3\2\2\2PQ\3\2\2\2QR\3\2\2\2RS\7-\2\2ST\7@\2\2TU\5\6\4\2UV\7?\2"+
		"\2VW\7\b\2\2WX\7@\2\2XY\5\n\6\2YZ\7?\2\2Z\5\3\2\2\2[]\7-\2\2\\^\5\b\5"+
		"\2]\\\3\2\2\2]^\3\2\2\2^\7\3\2\2\2_`\7L\2\2`a\5\6\4\2a\t\3\2\2\2bd\t\2"+
		"\2\2ce\5\f\7\2dc\3\2\2\2de\3\2\2\2e\13\3\2\2\2fg\7L\2\2gh\5\n\6\2h\r\3"+
		"\2\2\2ik\7\4\2\2jl\7(\2\2kj\3\2\2\2kl\3\2\2\2lm\3\2\2\2mn\5\20\t\2no\7"+
		"\n\2\2or\5\22\n\2pq\7\13\2\2qs\5*\26\2rp\3\2\2\2rs\3\2\2\2sw\3\2\2\2t"+
		"u\7\34\2\2uv\7\35\2\2vx\5\24\13\2wt\3\2\2\2wx\3\2\2\2x{\3\2\2\2yz\7 \2"+
		"\2z|\5*\26\2{y\3\2\2\2{|\3\2\2\2|\u0080\3\2\2\2}~\7\33\2\2~\177\7\35\2"+
		"\2\177\u0081\5\24\13\2\u0080}\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u008b"+
		"\3\2\2\2\u0082\u0085\7\f\2\2\u0083\u0084\7*\2\2\u0084\u0086\7L\2\2\u0085"+
		"\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u008c\7*"+
		"\2\2\u0088\u0089\7*\2\2\u0089\u008a\7)\2\2\u008a\u008c\7*\2\2\u008b\u0082"+
		"\3\2\2\2\u008b\u0088\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008f\3\2\2\2\u008d"+
		"\u008e\7\36\2\2\u008e\u0090\7\31\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3"+
		"\2\2\2\u0090\17\3\2\2\2\u0091\u0092\3\2\2\2\u0092\21\3\2\2\2\u0093\u0094"+
		"\3\2\2\2\u0094\23\3\2\2\2\u0095\u0096\3\2\2\2\u0096\25\3\2\2\2\u0097\u009a"+
		"\5\30\r\2\u0098\u009a\5\32\16\2\u0099\u0097\3\2\2\2\u0099\u0098\3\2\2"+
		"\2\u009a\27\3\2\2\2\u009b\u009c\7\31\2\2\u009c\u009d\5$\23\2\u009d\u009e"+
		"\7\32\2\2\u009e\u00a1\5\34\17\2\u009f\u00a0\7\13\2\2\u00a0\u00a2\5*\26"+
		"\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3\u00a4"+
		"\7\f\2\2\u00a4\u00a6\t\3\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6"+
		"\31\3\2\2\2\u00a7\u00a8\7\31\2\2\u00a8\u00a9\5&\24\2\u00a9\u00aa\7\32"+
		"\2\2\u00aa\u00ad\5\34\17\2\u00ab\u00ac\7\13\2\2\u00ac\u00ae\5*\26\2\u00ad"+
		"\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\33\3\2\2\2\u00af\u00b1\5 \21"+
		"\2\u00b0\u00b2\5\36\20\2\u00b1\u00b0\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2"+
		"\35\3\2\2\2\u00b3\u00b4\7L\2\2\u00b4\u00b5\5\34\17\2\u00b5\37\3\2\2\2"+
		"\u00b6\u00b7\5@!\2\u00b7\u00ba\7E\2\2\u00b8\u00bb\5@!\2\u00b9\u00bb\7"+
		"\30\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00b9\3\2\2\2\u00bb!\3\2\2\2\u00bc\u00bd"+
		"\7\t\2\2\u00bd\u00be\7\n\2\2\u00be\u00c1\5$\23\2\u00bf\u00c0\7\13\2\2"+
		"\u00c0\u00c2\5*\26\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c5"+
		"\3\2\2\2\u00c3\u00c4\7\f\2\2\u00c4\u00c6\t\3\2\2\u00c5\u00c3\3\2\2\2\u00c5"+
		"\u00c6\3\2\2\2\u00c6#\3\2\2\2\u00c7\u00c9\7-\2\2\u00c8\u00ca\7-\2\2\u00c9"+
		"\u00c8\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca%\3\2\2\2\u00cb\u00cd\5$\23\2"+
		"\u00cc\u00ce\5(\25\2\u00cd\u00cc\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\'\3"+
		"\2\2\2\u00cf\u00d0\7L\2\2\u00d0\u00d1\5&\24\2\u00d1)\3\2\2\2\u00d2\u00d5"+
		"\5,\27\2\u00d3\u00d5\5.\30\2\u00d4\u00d2\3\2\2\2\u00d4\u00d3\3\2\2\2\u00d5"+
		"+\3\2\2\2\u00d6\u00d7\7@\2\2\u00d7\u00d8\5*\26\2\u00d8\u00d9\7?\2\2\u00d9"+
		"-\3\2\2\2\u00da\u00dd\5\60\31\2\u00db\u00dc\t\4\2\2\u00dc\u00de\5*\26"+
		"\2\u00dd\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de/\3\2\2\2\u00df\u00e6"+
		"\5\62\32\2\u00e0\u00e6\5\64\33\2\u00e1\u00e6\5\66\34\2\u00e2\u00e6\58"+
		"\35\2\u00e3\u00e6\5:\36\2\u00e4\u00e6\5<\37\2\u00e5\u00df\3\2\2\2\u00e5"+
		"\u00e0\3\2\2\2\u00e5\u00e1\3\2\2\2\u00e5\u00e2\3\2\2\2\u00e5\u00e3\3\2"+
		"\2\2\u00e5\u00e4\3\2\2\2\u00e6\61\3\2\2\2\u00e7\u00e8\5@!\2\u00e8\u00e9"+
		"\t\5\2\2\u00e9\u00ea\5@!\2\u00ea\63\3\2\2\2\u00eb\u00ec\5@!\2\u00ec\u00ed"+
		"\7\21\2\2\u00ed\u00ee\5@!\2\u00ee\u00ef\7\22\2\2\u00ef\u00f0\5@!\2\u00f0"+
		"\65\3\2\2\2\u00f1\u00f2\5@!\2\u00f2\u00f4\7\16\2\2\u00f3\u00f5\7\17\2"+
		"\2\u00f4\u00f3\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f7"+
		"\7\r\2\2\u00f7\67\3\2\2\2\u00f8\u00fa\5@!\2\u00f9\u00fb\7\17\2\2\u00fa"+
		"\u00f9\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fd\7\20"+
		"\2\2\u00fd\u00fe\7@\2\2\u00fe\u00ff\5\16\b\2\u00ff\u0100\7?\2\2\u0100"+
		"9\3\2\2\2\u0101\u0103\5@!\2\u0102\u0104\7\17\2\2\u0103\u0102\3\2\2\2\u0103"+
		"\u0104\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0106\7\20\2\2\u0106\u0107\7"+
		"@\2\2\u0107\u0108\5\n\6\2\u0108\u0109\7?\2\2\u0109;\3\2\2\2\u010a\u010c"+
		"\7\17\2\2\u010b\u010a\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010d\3\2\2\2"+
		"\u010d\u010e\7\23\2\2\u010e\u010f\7@\2\2\u010f\u0110\5\16\b\2\u0110\u0111"+
		"\7?\2\2\u0111=\3\2\2\2\u0112\u0113\t\6\2\2\u0113\u0114\5\60\31\2\u0114"+
		"?\3\2\2\2\u0115\u011c\t\7\2\2\u0116\u011c\5B\"\2\u0117\u0118\7@\2\2\u0118"+
		"\u0119\5\16\b\2\u0119\u011a\7?\2\2\u011a\u011c\3\2\2\2\u011b\u0115\3\2"+
		"\2\2\u011b\u0116\3\2\2\2\u011b\u0117\3\2\2\2\u011cA\3\2\2\2\u011d\u011e"+
		"\7-\2\2\u011e\u011f\7@\2\2\u011f\u0120\5D#\2\u0120\u0121\7?\2\2\u0121"+
		"C\3\2\2\2\u0122\u0124\5@!\2\u0123\u0125\5F$\2\u0124\u0123\3\2\2\2\u0124"+
		"\u0125\3\2\2\2\u0125E\3\2\2\2\u0126\u0127\7L\2\2\u0127\u0128\5D#\2\u0128"+
		"G\3\2\2\2!LP]dkrw{\u0080\u0085\u008b\u008f\u0099\u00a1\u00a5\u00ad\u00b1"+
		"\u00ba\u00c1\u00c5\u00c9\u00cd\u00d4\u00dd\u00e5\u00f4\u00fa\u0103\u010b"+
		"\u011b\u0124";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}