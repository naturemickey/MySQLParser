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
		T__0=1, PLACEHOLDER=2, INSERT=3, INTO=4, VALUES=5, DELETE=6, FROM=7, WHERE=8, 
		LIMIT=9, NULL=10, IS=11, NOT=12, IN=13, BETWEEN=14, AND=15, EXISTS=16, 
		ID=17, INT=18, DECIMAL=19, STRING=20, TRUE=21, FALSE=22, COLUMN_REL=23, 
		OR=24, XOR=25, DEFAULT=26, UPDATE=27, SET=28, SELECT=29, LIKE=30, ALL=31, 
		ANY=32, DIVIDE=33, MOD=34, REGEXP=35, PLUS=36, MINUS=37, NEGATION=38, 
		VERTBAR=39, BITAND=40, POWER_OP=41, BINARY=42, SHIFT_LEFT=43, SHIFT_RIGHT=44, 
		ESCAPE=45, ASTERISK=46, RPAREN=47, LPAREN=48, RBRACK=49, LBRACK=50, COLON=51, 
		ALL_FIELDS=52, EQ=53, LTH=54, GTH=55, NOT_EQ=56, LET=57, GET=58, SEMI=59, 
		COMMA=60, DOT=61, COLLATE=62, INNER=63, OUTER=64, JOIN=65, CROSS=66, USING=67, 
		INDEX=68, KEY=69, ORDER=70, GROUP=71, BY=72, FOR=73, USE=74, IGNORE=75, 
		PARTITION=76, STRAIGHT_JOIN=77, NATURAL=78, LEFT=79, RIGHT=80, OJ=81, 
		ON=82, NEWLINE=83, WS=84, USER_VAR=85;
	public static final int
		RULE_stat = 0, RULE_insertStat = 1, RULE_columnNames = 2, RULE_columnNamesSuffix = 3, 
		RULE_valueList = 4, RULE_valueListSuffix = 5, RULE_selectStat = 6, RULE_updateStat = 7, 
		RULE_updateSingleTable = 8, RULE_updateMultipleTable = 9, RULE_setExprs = 10, 
		RULE_setExprSuffix = 11, RULE_setExpr = 12, RULE_deleteStat = 13, RULE_tableNameAndAlias = 14, 
		RULE_tableNameAndAliases = 15, RULE_tableNameAndAliasSuffix = 16, RULE_whereCondition = 17, 
		RULE_whereCondSub = 18, RULE_whereCondOp = 19, RULE_expression = 20, RULE_exprRelational = 21, 
		RULE_exprBetweenAnd = 22, RULE_exprIsOrIsNotNull = 23, RULE_exprInSelect = 24, 
		RULE_exprInValues = 25, RULE_exprExists = 26, RULE_exprNot = 27, RULE_element = 28;
	public static final String[] ruleNames = {
		"stat", "insertStat", "columnNames", "columnNamesSuffix", "valueList", 
		"valueListSuffix", "selectStat", "updateStat", "updateSingleTable", "updateMultipleTable", 
		"setExprs", "setExprSuffix", "setExpr", "deleteStat", "tableNameAndAlias", 
		"tableNameAndAliases", "tableNameAndAliasSuffix", "whereCondition", "whereCondSub", 
		"whereCondOp", "expression", "exprRelational", "exprBetweenAnd", "exprIsOrIsNotNull", 
		"exprInSelect", "exprInValues", "exprExists", "exprNot", "element"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'!'", null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, "'select'", "'like'", "'all'", "'any'", 
		null, null, "'regexp'", "'+'", "'-'", "'~'", "'|'", "'&'", "'^'", "'binary'", 
		"'<<'", "'>>'", "'escape'", "'*'", "')'", "'('", "']'", "'['", "':'", 
		"'.*'", "'='", "'<'", "'>'", "'!='", "'<='", "'>='", "';'", "','", "'.'", 
		"'collate'", "'inner'", "'outer'", "'join'", "'cross'", "'using'", "'index'", 
		"'key'", "'order'", "'group'", "'by'", "'for'", "'use'", "'ignore'", "'partition'", 
		"'straight_join'", "'natural'", "'left'", "'right'", "'oj'", "'on'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "PLACEHOLDER", "INSERT", "INTO", "VALUES", "DELETE", "FROM", 
		"WHERE", "LIMIT", "NULL", "IS", "NOT", "IN", "BETWEEN", "AND", "EXISTS", 
		"ID", "INT", "DECIMAL", "STRING", "TRUE", "FALSE", "COLUMN_REL", "OR", 
		"XOR", "DEFAULT", "UPDATE", "SET", "SELECT", "LIKE", "ALL", "ANY", "DIVIDE", 
		"MOD", "REGEXP", "PLUS", "MINUS", "NEGATION", "VERTBAR", "BITAND", "POWER_OP", 
		"BINARY", "SHIFT_LEFT", "SHIFT_RIGHT", "ESCAPE", "ASTERISK", "RPAREN", 
		"LPAREN", "RBRACK", "LBRACK", "COLON", "ALL_FIELDS", "EQ", "LTH", "GTH", 
		"NOT_EQ", "LET", "GET", "SEMI", "COMMA", "DOT", "COLLATE", "INNER", "OUTER", 
		"JOIN", "CROSS", "USING", "INDEX", "KEY", "ORDER", "GROUP", "BY", "FOR", 
		"USE", "IGNORE", "PARTITION", "STRAIGHT_JOIN", "NATURAL", "LEFT", "RIGHT", 
		"OJ", "ON", "NEWLINE", "WS", "USER_VAR"
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
			setState(62);
			switch (_input.LA(1)) {
			case INSERT:
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				insertStat();
				}
				break;
			case UPDATE:
				enterOuterAlt(_localctx, 2);
				{
				setState(59);
				updateStat();
				}
				break;
			case DELETE:
				enterOuterAlt(_localctx, 3);
				{
				setState(60);
				deleteStat();
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 4);
				{
				setState(61);
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
			setState(64);
			match(INSERT);
			setState(66);
			_la = _input.LA(1);
			if (_la==INTO) {
				{
				setState(65);
				match(INTO);
				}
			}

			setState(68);
			((InsertStatContext)_localctx).tableName = match(ID);
			setState(69);
			match(LPAREN);
			setState(70);
			columnNames();
			setState(71);
			match(RPAREN);
			setState(72);
			match(VALUES);
			setState(73);
			match(LPAREN);
			setState(74);
			valueList();
			setState(75);
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
			setState(77);
			((ColumnNamesContext)_localctx).name = match(ID);
			setState(79);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(78);
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
			setState(81);
			match(COMMA);
			setState(82);
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
			setState(84);
			((ValueListContext)_localctx).name = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLACEHOLDER) | (1L << NULL) | (1L << ID) | (1L << STRING))) != 0)) ) {
				((ValueListContext)_localctx).name = (Token)_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(86);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(85);
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
			setState(88);
			match(COMMA);
			setState(89);
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
		enterRule(_localctx, 14, RULE_updateStat);
		try {
			setState(95);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(93);
				updateSingleTable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(94);
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
		enterRule(_localctx, 16, RULE_updateSingleTable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(UPDATE);
			setState(98);
			tableNameAndAlias();
			setState(99);
			match(SET);
			setState(100);
			setExprs();
			setState(103);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(101);
				match(WHERE);
				setState(102);
				whereCondition();
				}
			}

			setState(107);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(105);
				match(LIMIT);
				setState(106);
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
		enterRule(_localctx, 18, RULE_updateMultipleTable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(UPDATE);
			setState(110);
			tableNameAndAliases();
			setState(111);
			match(SET);
			setState(112);
			setExprs();
			setState(115);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(113);
				match(WHERE);
				setState(114);
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
		enterRule(_localctx, 20, RULE_setExprs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			setExpr();
			setState(119);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(118);
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
		enterRule(_localctx, 22, RULE_setExprSuffix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(COMMA);
			setState(122);
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
		public Token dflt;
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
		enterRule(_localctx, 24, RULE_setExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			element();
			setState(125);
			match(EQ);
			setState(128);
			switch (_input.LA(1)) {
			case PLACEHOLDER:
			case ID:
			case DECIMAL:
			case STRING:
			case TRUE:
			case FALSE:
			case COLUMN_REL:
				{
				setState(126);
				element();
				}
				break;
			case DEFAULT:
				{
				setState(127);
				((SetExprContext)_localctx).dflt = match(DEFAULT);
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
		enterRule(_localctx, 26, RULE_deleteStat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(DELETE);
			setState(131);
			match(FROM);
			setState(132);
			tableNameAndAlias();
			setState(135);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(133);
				match(WHERE);
				setState(134);
				whereCondition();
				}
			}

			setState(139);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(137);
				match(LIMIT);
				setState(138);
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
		enterRule(_localctx, 28, RULE_tableNameAndAlias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			((TableNameAndAliasContext)_localctx).name = match(ID);
			setState(143);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(142);
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
		enterRule(_localctx, 30, RULE_tableNameAndAliases);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			tableNameAndAlias();
			setState(147);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(146);
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
		enterRule(_localctx, 32, RULE_tableNameAndAliasSuffix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(COMMA);
			setState(150);
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
		enterRule(_localctx, 34, RULE_whereCondition);
		try {
			setState(154);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(152);
				whereCondSub();
				}
				break;
			case PLACEHOLDER:
			case NOT:
			case EXISTS:
			case ID:
			case DECIMAL:
			case STRING:
			case TRUE:
			case FALSE:
			case COLUMN_REL:
				enterOuterAlt(_localctx, 2);
				{
				setState(153);
				whereCondOp();
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
		enterRule(_localctx, 36, RULE_whereCondSub);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(LPAREN);
			setState(157);
			whereCondition();
			setState(158);
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
		enterRule(_localctx, 38, RULE_whereCondOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			expression();
			setState(163);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << OR) | (1L << XOR))) != 0)) {
				{
				setState(161);
				((WhereCondOpContext)_localctx).expressionOperator = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << OR) | (1L << XOR))) != 0)) ) {
					((WhereCondOpContext)_localctx).expressionOperator = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(162);
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
		enterRule(_localctx, 40, RULE_expression);
		try {
			setState(171);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(165);
				exprRelational();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(166);
				exprBetweenAnd();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(167);
				exprIsOrIsNotNull();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(168);
				exprInSelect();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(169);
				exprInValues();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(170);
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
		enterRule(_localctx, 42, RULE_exprRelational);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			((ExprRelationalContext)_localctx).left = element();
			setState(174);
			((ExprRelationalContext)_localctx).relationalOp = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << LTH) | (1L << GTH) | (1L << NOT_EQ) | (1L << LET) | (1L << GET))) != 0)) ) {
				((ExprRelationalContext)_localctx).relationalOp = (Token)_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(175);
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
		enterRule(_localctx, 44, RULE_exprBetweenAnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			((ExprBetweenAndContext)_localctx).el = element();
			setState(178);
			match(BETWEEN);
			setState(179);
			((ExprBetweenAndContext)_localctx).left = element();
			setState(180);
			match(AND);
			setState(181);
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
		enterRule(_localctx, 46, RULE_exprIsOrIsNotNull);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			element();
			setState(184);
			match(IS);
			setState(186);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(185);
				((ExprIsOrIsNotNullContext)_localctx).not = match(NOT);
				}
			}

			setState(188);
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
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public TerminalNode IN() { return getToken(MySQLParser.IN, 0); }
		public SelectStatContext selectStat() {
			return getRuleContext(SelectStatContext.class,0);
		}
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
		enterRule(_localctx, 48, RULE_exprInSelect);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			element();
			setState(191);
			match(IN);
			setState(192);
			match(LPAREN);
			setState(193);
			selectStat();
			setState(194);
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
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public TerminalNode IN() { return getToken(MySQLParser.IN, 0); }
		public ValueListContext valueList() {
			return getRuleContext(ValueListContext.class,0);
		}
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
		enterRule(_localctx, 50, RULE_exprInValues);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			element();
			setState(197);
			match(IN);
			setState(198);
			match(LPAREN);
			setState(199);
			valueList();
			setState(200);
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
		enterRule(_localctx, 52, RULE_exprExists);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(202);
				((ExprExistsContext)_localctx).not = match(NOT);
				}
			}

			setState(205);
			match(EXISTS);
			setState(206);
			match(LPAREN);
			setState(207);
			selectStat();
			setState(208);
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
		enterRule(_localctx, 54, RULE_exprNot);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			_la = _input.LA(1);
			if ( !(_la==T__0 || _la==NOT) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(211);
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
		public TerminalNode PLACEHOLDER() { return getToken(MySQLParser.PLACEHOLDER, 0); }
		public TerminalNode COLUMN_REL() { return getToken(MySQLParser.COLUMN_REL, 0); }
		public TerminalNode DECIMAL() { return getToken(MySQLParser.DECIMAL, 0); }
		public TerminalNode STRING() { return getToken(MySQLParser.STRING, 0); }
		public TerminalNode ID() { return getToken(MySQLParser.ID, 0); }
		public TerminalNode TRUE() { return getToken(MySQLParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(MySQLParser.FALSE, 0); }
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
		enterRule(_localctx, 56, RULE_element);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLACEHOLDER) | (1L << ID) | (1L << DECIMAL) | (1L << STRING) | (1L << TRUE) | (1L << FALSE) | (1L << COLUMN_REL))) != 0)) ) {
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3W\u00da\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\2\3\2\5\2"+
		"A\n\2\3\3\3\3\5\3E\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\5\4"+
		"R\n\4\3\5\3\5\3\5\3\6\3\6\5\6Y\n\6\3\7\3\7\3\7\3\b\3\b\3\t\3\t\5\tb\n"+
		"\t\3\n\3\n\3\n\3\n\3\n\3\n\5\nj\n\n\3\n\3\n\5\nn\n\n\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\5\13v\n\13\3\f\3\f\5\fz\n\f\3\r\3\r\3\r\3\16\3\16\3\16\3"+
		"\16\5\16\u0083\n\16\3\17\3\17\3\17\3\17\3\17\5\17\u008a\n\17\3\17\3\17"+
		"\5\17\u008e\n\17\3\20\3\20\5\20\u0092\n\20\3\21\3\21\5\21\u0096\n\21\3"+
		"\22\3\22\3\22\3\23\3\23\5\23\u009d\n\23\3\24\3\24\3\24\3\24\3\25\3\25"+
		"\3\25\5\25\u00a6\n\25\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u00ae\n\26\3"+
		"\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\5\31\u00bd"+
		"\n\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\34\5\34\u00ce\n\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\36"+
		"\3\36\3\36\2\2\37\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62"+
		"\64\668:\2\b\6\2\4\4\f\f\23\23\26\26\4\2\4\4\24\24\4\2\21\21\32\33\3\2"+
		"\67<\4\2\3\3\16\16\5\2\4\4\23\23\25\31\u00d5\2@\3\2\2\2\4B\3\2\2\2\6O"+
		"\3\2\2\2\bS\3\2\2\2\nV\3\2\2\2\fZ\3\2\2\2\16]\3\2\2\2\20a\3\2\2\2\22c"+
		"\3\2\2\2\24o\3\2\2\2\26w\3\2\2\2\30{\3\2\2\2\32~\3\2\2\2\34\u0084\3\2"+
		"\2\2\36\u008f\3\2\2\2 \u0093\3\2\2\2\"\u0097\3\2\2\2$\u009c\3\2\2\2&\u009e"+
		"\3\2\2\2(\u00a2\3\2\2\2*\u00ad\3\2\2\2,\u00af\3\2\2\2.\u00b3\3\2\2\2\60"+
		"\u00b9\3\2\2\2\62\u00c0\3\2\2\2\64\u00c6\3\2\2\2\66\u00cd\3\2\2\28\u00d4"+
		"\3\2\2\2:\u00d7\3\2\2\2<A\5\4\3\2=A\5\20\t\2>A\5\34\17\2?A\5\16\b\2@<"+
		"\3\2\2\2@=\3\2\2\2@>\3\2\2\2@?\3\2\2\2A\3\3\2\2\2BD\7\5\2\2CE\7\6\2\2"+
		"DC\3\2\2\2DE\3\2\2\2EF\3\2\2\2FG\7\23\2\2GH\7\62\2\2HI\5\6\4\2IJ\7\61"+
		"\2\2JK\7\7\2\2KL\7\62\2\2LM\5\n\6\2MN\7\61\2\2N\5\3\2\2\2OQ\7\23\2\2P"+
		"R\5\b\5\2QP\3\2\2\2QR\3\2\2\2R\7\3\2\2\2ST\7>\2\2TU\5\6\4\2U\t\3\2\2\2"+
		"VX\t\2\2\2WY\5\f\7\2XW\3\2\2\2XY\3\2\2\2Y\13\3\2\2\2Z[\7>\2\2[\\\5\n\6"+
		"\2\\\r\3\2\2\2]^\3\2\2\2^\17\3\2\2\2_b\5\22\n\2`b\5\24\13\2a_\3\2\2\2"+
		"a`\3\2\2\2b\21\3\2\2\2cd\7\35\2\2de\5\36\20\2ef\7\36\2\2fi\5\26\f\2gh"+
		"\7\n\2\2hj\5$\23\2ig\3\2\2\2ij\3\2\2\2jm\3\2\2\2kl\7\13\2\2ln\t\3\2\2"+
		"mk\3\2\2\2mn\3\2\2\2n\23\3\2\2\2op\7\35\2\2pq\5 \21\2qr\7\36\2\2ru\5\26"+
		"\f\2st\7\n\2\2tv\5$\23\2us\3\2\2\2uv\3\2\2\2v\25\3\2\2\2wy\5\32\16\2x"+
		"z\5\30\r\2yx\3\2\2\2yz\3\2\2\2z\27\3\2\2\2{|\7>\2\2|}\5\26\f\2}\31\3\2"+
		"\2\2~\177\5:\36\2\177\u0082\7\67\2\2\u0080\u0083\5:\36\2\u0081\u0083\7"+
		"\34\2\2\u0082\u0080\3\2\2\2\u0082\u0081\3\2\2\2\u0083\33\3\2\2\2\u0084"+
		"\u0085\7\b\2\2\u0085\u0086\7\t\2\2\u0086\u0089\5\36\20\2\u0087\u0088\7"+
		"\n\2\2\u0088\u008a\5$\23\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a"+
		"\u008d\3\2\2\2\u008b\u008c\7\13\2\2\u008c\u008e\t\3\2\2\u008d\u008b\3"+
		"\2\2\2\u008d\u008e\3\2\2\2\u008e\35\3\2\2\2\u008f\u0091\7\23\2\2\u0090"+
		"\u0092\7\23\2\2\u0091\u0090\3\2\2\2\u0091\u0092\3\2\2\2\u0092\37\3\2\2"+
		"\2\u0093\u0095\5\36\20\2\u0094\u0096\5\"\22\2\u0095\u0094\3\2\2\2\u0095"+
		"\u0096\3\2\2\2\u0096!\3\2\2\2\u0097\u0098\7>\2\2\u0098\u0099\5 \21\2\u0099"+
		"#\3\2\2\2\u009a\u009d\5&\24\2\u009b\u009d\5(\25\2\u009c\u009a\3\2\2\2"+
		"\u009c\u009b\3\2\2\2\u009d%\3\2\2\2\u009e\u009f\7\62\2\2\u009f\u00a0\5"+
		"$\23\2\u00a0\u00a1\7\61\2\2\u00a1\'\3\2\2\2\u00a2\u00a5\5*\26\2\u00a3"+
		"\u00a4\t\4\2\2\u00a4\u00a6\5$\23\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2"+
		"\2\2\u00a6)\3\2\2\2\u00a7\u00ae\5,\27\2\u00a8\u00ae\5.\30\2\u00a9\u00ae"+
		"\5\60\31\2\u00aa\u00ae\5\62\32\2\u00ab\u00ae\5\64\33\2\u00ac\u00ae\5\66"+
		"\34\2\u00ad\u00a7\3\2\2\2\u00ad\u00a8\3\2\2\2\u00ad\u00a9\3\2\2\2\u00ad"+
		"\u00aa\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ac\3\2\2\2\u00ae+\3\2\2\2"+
		"\u00af\u00b0\5:\36\2\u00b0\u00b1\t\5\2\2\u00b1\u00b2\5:\36\2\u00b2-\3"+
		"\2\2\2\u00b3\u00b4\5:\36\2\u00b4\u00b5\7\20\2\2\u00b5\u00b6\5:\36\2\u00b6"+
		"\u00b7\7\21\2\2\u00b7\u00b8\5:\36\2\u00b8/\3\2\2\2\u00b9\u00ba\5:\36\2"+
		"\u00ba\u00bc\7\r\2\2\u00bb\u00bd\7\16\2\2\u00bc\u00bb\3\2\2\2\u00bc\u00bd"+
		"\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bf\7\f\2\2\u00bf\61\3\2\2\2\u00c0"+
		"\u00c1\5:\36\2\u00c1\u00c2\7\17\2\2\u00c2\u00c3\7\62\2\2\u00c3\u00c4\5"+
		"\16\b\2\u00c4\u00c5\7\61\2\2\u00c5\63\3\2\2\2\u00c6\u00c7\5:\36\2\u00c7"+
		"\u00c8\7\17\2\2\u00c8\u00c9\7\62\2\2\u00c9\u00ca\5\n\6\2\u00ca\u00cb\7"+
		"\61\2\2\u00cb\65\3\2\2\2\u00cc\u00ce\7\16\2\2\u00cd\u00cc\3\2\2\2\u00cd"+
		"\u00ce\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d0\7\22\2\2\u00d0\u00d1\7"+
		"\62\2\2\u00d1\u00d2\5\16\b\2\u00d2\u00d3\7\61\2\2\u00d3\67\3\2\2\2\u00d4"+
		"\u00d5\t\6\2\2\u00d5\u00d6\5*\26\2\u00d69\3\2\2\2\u00d7\u00d8\t\7\2\2"+
		"\u00d8;\3\2\2\2\25@DQXaimuy\u0082\u0089\u008d\u0091\u0095\u009c\u00a5"+
		"\u00ad\u00bc\u00cd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}