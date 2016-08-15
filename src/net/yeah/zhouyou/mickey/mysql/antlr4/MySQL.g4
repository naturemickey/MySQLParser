grammar MySQL;

@header{package net.yeah.zhouyou.mickey.mysql.antlr4;}

// ****** Parser ******

stat
	: insertStat
	| updateStat
	| deleteStat
	| selectStat
	;

insertStat
	: INSERT INTO? tableName=ID ('(' columnNames ')')? ((VALUES '(' valueList ')') | selectStat)
	;

columnNames       : name=ID columnNamesSuffix? ;
columnNamesSuffix : ',' columnNames ;

valueList       : name=(PLACEHOLDER | ID | STRING | NULL) valueListSuffix? ;
valueListSuffix : ',' valueList ;

selectStat
	: SELECT (distinct=DISTINCT)? selectExprs 
	   (FROM tables)?
	  (WHERE where=whereCondition)?
	  (GROUP BY groupByExprs=gbobExprs)?
	 (HAVING having=whereCondition)?
	  (ORDER BY orderByExprs=gbobExprs)?
	  (LIMIT ((offset=INT ',')? rowCount=INT) | (rowCount=INT OFFSET offset=INT))?
	    (FOR lock=UPDATE)?
	;

selectExprs       : element (AS? alias=ID)? selectExprsSuffix? ;
selectExprsSuffix : ',' selectExprs ;

tables      : tableRel tableSuffix? ;
tableSuffix : ',' tables ;

tableRel
	: tableFactor
	| tableJoin
	;

tableFactor
	: tableNameAndAlias
	| tableSubQuery
	| tableRecu
	;

tableSubQuery : '(' selectStat ')' AS? alias=ID ;
tableRecu     : '(' tableRel ')' ;

tableJoin       : tableNameAndAlias tableJoinSuffix ;
tableJoinSuffix : tableJoinMod JOIN tableNameAndAlias joinCondition tableJoinSuffix? ;
tableJoinMod    : INNER | CROSS | LEFT OUTER? | RIGHT OUTER? ;
joinCondition   : ON whereCondition | USING '(' columnNames ')' ;

gbobExprs      : element sc=(ASC | DESC)? gbobExprSuffix? ;
gbobExprSuffix : ',' gbobExprs ;

updateStat
	: updateSingleTable
	| updateMultipleTable
	;

updateSingleTable   : UPDATE tableNameAndAlias   SET setExprs (WHERE whereCondition)? (LIMIT rowCount=(INT|PLACEHOLDER))? ;
updateMultipleTable	: UPDATE tableNameAndAliases SET setExprs (WHERE whereCondition)? ;

setExprs      : setExpr setExprSuffix? ;
setExprSuffix : ',' setExprs ;
setExpr       : left=element '=' (right=element | rightDefault=DEFAULT) ;

deleteStat
	: DELETE FROM tableNameAndAlias (WHERE whereCondition)? (LIMIT rowCount=(INT|PLACEHOLDER))?
	;

tableNameAndAlias       : name=ID (AS? alias=ID)? ;
tableNameAndAliases     : tableNameAndAlias tableNameAndAliasSuffix? ;
tableNameAndAliasSuffix : ',' tableNameAndAliases ;

whereCondition
	: whereCondSub
	| whereCondOp
	;

whereCondSub : '(' wc1=whereCondition ')' (expressionOperator=(AND | XOR | OR) wc2=whereCondition)?;
whereCondOp  : expression (expressionOperator=(AND | XOR | OR) whereCondition)? ;

expression
	: exprRelational
	| exprBetweenAnd
	| exprIsOrIsNotNull
	| exprInSelect
	| exprInValues
	| exprExists
	;

// 忘了写like和not like
exprRelational    : left=element relationalOp=(EQ | LTH | GTH | NOT_EQ | LET | GET) right=element ;
exprBetweenAnd    : el=element (not=NOT)? BETWEEN left=element AND right=element ;
exprIsOrIsNotNull : element IS (not=NOT)? NULL ;
exprInSelect      : element (not=NOT)? IN '(' selectStat ')' ;
exprInValues      : element (not=NOT)? IN '(' valueList ')' ;
exprExists        : (not=NOT)? EXISTS '(' selectStat ')';
exprNot           : (NOT | '!') expression ;

element
	: elementText
	| funCall
	| elementSubQuery
	| elementDate
	| elementOpEle
	;

elementText        : ('*' | PLACEHOLDER | COLUMN_REL | DECIMAL | STRING | ID | TRUE | FALSE | INT | DECIMAL | NULL) ;
elementSubQuery    : '(' selectStat ')' ;
elementDate        : DATE STRING ;
elementOpEle       : elementText elementOpEleSuffix? ;
elementOpEleSuffix : op=('|' | '&' | '<<' | '>>' | '+' | '-' | '*' | DIV | MOD | '^')? elementOpEle ;
// 上面这一行中的op为可选的原因是加号和减号会被合并后面的数字中，这并不是我希望的，但贪婪匹配会有这样的效果，所以这里需要在visitor中做特殊处理。

funCall     : funName=ID '(' paramList? ')' ;
paramList   : param=element paramSuffix? ;
paramSuffix : ',' paramList ;

// ******* Lexer *******

PLACEHOLDER : '?' | (':' [a-zA-Z0-9_]+) ;
SELECT      : [Ss][Ee][Ll][Ee][Cc][Tt] ;
INSERT      : [Ii][Nn][Ss][Ee][Rr][Tt];
INTO        : [Ii][Nn][Tt][Oo] ;
VALUES      : [Vv][Aa][Ll][Uu][Ee][Ss]? ;
DELETE      : [Dd][Ee][Ll][Ee][Tt][Ee] ;
FROM        : [Ff][Rr][Oo][Mm] ;
WHERE       : [Ww][Hh][Ee][Rr][Ee] ;
LIMIT       : [Ll][Ii][Mm][Ii][Tt] ;
NULL        : [Nn][Uu][Ll][Ll] ;
IS          : [Ii][Ss] ;
NOT         : [Nn][Oo][Tt] ;
IN          : [Ii][Nn] ;
BETWEEN     : [Bb][Ee][Tt][Ww][Ee][Ee][Nn] ;
AND         : [Aa][Nn][Dd] | '&&' ;
EXISTS      : [Ee][Xx][Ii][Ss][Tt][Ss] ;
TRUE        : [Tt][Rr][Uu][Ee] ;
FALSE       : [Ff][Aa][Ll][Ss] ;
OR          : ([Oo][Rr]) | '||' ;
XOR         : [Xx][Oo][Rr] ;
DEFAULT     : [Dd][Ee][Ff][Aa][Uu][Ll][Tt] ;
UPDATE      : [Uu][Pp][Dd][Aa][Tt][Ee] ;
SET         : [Ss][Ee][Tt] ;
ORDER       : [Oo][Rr][Dd][Ee][Rr] ;
GROUP       : [Gg][Rr][Oo][Uu][Pp] ;
BY          : [Bb][Yy] ;
FOR         : [Ff][Oo][Rr] ;
LIKE        : [Ll][Ii][Kk][Ee] ;
HAVING      : [Hh][Aa][Vv][Ii][Nn][Gg] ;
AS          : [Aa][Ss] ;
INNER       : [Ii][Nn][Nn][Ee][Rr] ;
OUTER       : [Oo][Uu][Tt][Ee][Rr] ;
JOIN        : [Jj][Oo][Ii][Nn] ;
LEFT        : [Ll][Ee][Ff][Tt] ;
RIGHT       : [Rr][Ii][Gg][Hh][Tt] ;
ON          : [Oo][Nn] ;
DISTINCT    : [Dd][Ii][Ss][Tt][Ii][Nn][Cc][Tt] ;
OFFSET      : [Oo][Ff][Ff][Ss][Ee][Tt] ;
ASC         : [Aa][Ss][Cc] ;
DESC        : [Dd][Ee][Ss][Cc] ;
CROSS       : [Cc][Rr][Oo][Ss][Ss] ;
USING       : [Uu][Ss][Ii][Nn][Gg] ;
DATE        : [Dd][Aa][Tt][Ee] ;
DIV         : [Dd][Ii][Vv] | '/' ;
MOD         : [Mm][Oo][Dd] | '%' ;
PLUS        : '+' ;
MINUS       : '-' ;
VERTBAR     : '|' ;
BITAND      : '&' ;
SHIFT_LEFT  : '<<' ;
SHIFT_RIGHT : '>>' ;
ASTERISK    : '*' ;
POWER_OP    : '^' ;

INT         : '0' .. '9'+ ;
DECIMAL     : ('+' | '-')? ((INT)|('.' INT)|(INT '.' INT)) ([Ee]('+' | '-')? INT)? ;
STRING      : (['] ((~[']) ([']['])?)* [']) | (["] ((~["]) (["]["])?)* ["]) ;

ID          : ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) [a-zA-Z0-9_]*;
COLUMN_REL  : ID '.' (ID | '*') ;

ALL         : 'all' ;
ANY         : 'any' ;
REGEXP      : 'regexp' ;
NEGATION    : '~' ;
BINARY      : 'binary' ;
ESCAPE      : 'escape' ;
RPAREN      : ')' ;
LPAREN      : '(' ;
RBRACK      : ']' ;
LBRACK      : '[' ;
COLON       : ':' ;
ALL_FIELDS  : '.*' ;
EQ          : '=' ;
LTH         : '<' ;
GTH         : '>' ;
NOT_EQ      : '!=' ;
LET         : '<=' ;
GET         : '>=' ;
SEMI        : ';' ;
COMMA       : ',';
DOT         : '.' ;
COLLATE     : 'collate' ;
INDEX       : 'index' ;
KEY         : 'key' ;
USE         : 'use' ;
IGNORE      : 'ignore' ;
PARTITION   : 'partition' ;
STRAIGHT_JOIN : 'straight_join' ;
NATURAL     : 'natural' ;
OJ          : 'oj' ;
NEWLINE     : '\r'? '\n' -> skip ;
WS          : ( ' ' | '\t' | '\n' | '\r' )+ -> skip ;
USER_VAR    : '@' ( USER_VAR_SUBFIX1 | USER_VAR_SUBFIX2 | USER_VAR_SUBFIX3 | USER_VAR_SUBFIX4 ) ;
fragment USER_VAR_SUBFIX1 : ( '`' ( ~ '`' )+ '`' ) ;
fragment USER_VAR_SUBFIX2 : ( '\'' ( ~ '\'' )+ '\'' ) ;
fragment USER_VAR_SUBFIX3 : ( '\"' ( ~ '\"' )+ '\"' ) ;
fragment USER_VAR_SUBFIX4 : ( 'A' .. 'Z' | 'a' .. 'z' | '_' | '$' | '0' .. '9' | DOT )+ ;
