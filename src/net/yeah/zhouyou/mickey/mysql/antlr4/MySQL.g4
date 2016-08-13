grammar MySQL;

@header{package net.yeah.zhouyou.mickey.mysql.antlr4;}

stat
	: insertStat
	| updateStat
	| deleteStat
	| selectStat
	;

insertStat
	: INSERT INTO? tableName=ID '(' columnNames ')' VALUES '(' valueList ')'
	;

columnNames
	: name=ID columnNamesSuffix?
	;

columnNamesSuffix
	: ',' columnNames
	;

valueList
	: name=(PLACEHOLDER | ID | STRING | NULL) valueListSuffix?
	;

valueListSuffix
	: ',' valueList
	;

selectStat
	:
	;

updateStat
	:
	;

deleteStat
	: DELETE FROM tableNameAndAlias (WHERE whereCondition)? (LIMIT rowCount=(INT|PLACEHOLDER))?
	;

tableNameAndAlias
	: name=ID (alias=ID)?
	;

whereCondition
	: expression
	;

expression
	: exprSubExpr
	| exprOpExpr
	| exprRelational
	| exprBetweenAnd
	| exprIsOrIsNotNull
	| exprInSelect
	| exprInValues
	| exprExists
	;

exprSubExpr       : '(' expression ')'
exprOpExpr        : expression expressionOperator=(AND | XOR | OR | NOT) expression
exprRelational    : element relationalOp=(EQ | LTH | GTH | NOT_EQ | LET | GET) element ;
exprBetweenAnd    : element BETWEEN element AND element ;
exprIsOrIsNotNull : element IS (not=NOT)? NULL ;
exprInSelect      : element IN '(' selectStat ')' ;
exprInValues      : element IN '(' valueList ')' ;
exprExists        : (not=NOT)? EXISTS '(' selectStat ')';

element
	: palceHolder = PLACEHOLDER
	| columnRel   = CULUMN_REL
	| numVal      = DECIMAL
	| strVal      = STRING
	| boolVal     = (TRUE | FALSE)
	;


// ******* Lexer *******

PLACEHOLDER : '?' | (':' [a-zA-Z0-9_]+) ;
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
ID          : ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) [a-zA-Z0-9_]*;
INT         : '0' .. '9'+ ;
DECIMAL     : ('+' | '-')? ((INT)|('.' INT)|(INT '.' INT)) ([Ee]('+' | '-')? INT)? ;
STRING      : ['] ((~[`]) ([']['])?)* ['] ;
TRUE        : [Tt][Rr][Uu][Ee] ;
FALSE       : [Ff][Aa][Ll][Ss] ;
CULUMN_REL  : (ID '.')? ID ;
OR          : ([Oo][Rr]) | '||' ;
XOR         : [Xx][Oo][Rr] ;

SELECT      : 'select' ;
LIKE        : 'like' ;
ALL         : 'all' ;
ANY         : 'any' ;
DIVIDE      : 'div' | '/' ;
MOD         : 'mod' | '%' ;
REGEXP      : 'regexp' ;
PLUS        : '+' ;
MINUS       : '-' ;
NEGATION    : '~' ;
VERTBAR     : '|' ;
BITAND      : '&' ;
POWER_OP    : '^' ;
BINARY      : 'binary' ;
SHIFT_LEFT  : '<<' ;
SHIFT_RIGHT : '>>' ;
ESCAPE      : 'escape' ;
ASTERISK    : '*' ;
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
INNER       : 'inner' ;
OUTER       : 'outer' ;
JOIN        : 'join' ;
CROSS       : 'cross' ;
USING       : 'using' ;
INDEX       : 'index' ;
KEY         : 'key' ;
ORDER       : 'order' ;
GROUP       : 'group' ;
BY          : 'by' ;
FOR         : 'for' ;
USE         : 'use' ;
IGNORE      : 'ignore' ;
PARTITION   : 'partition' ;
STRAIGHT_JOIN : 'straight_join' ;
NATURAL     : 'natural' ;
LEFT        : 'left' ;
RIGHT       : 'right' ;
OJ          : 'oj' ;
ON          : 'on' ;
NEWLINE     : '\r'? '\n' -> skip ;
WS          : ( ' ' | '\t' | '\n' | '\r' )+ -> skip ;
USER_VAR    : '@' ( USER_VAR_SUBFIX1 | USER_VAR_SUBFIX2 | USER_VAR_SUBFIX3 | USER_VAR_SUBFIX4 ) ;
fragment USER_VAR_SUBFIX1 : ( '`' ( ~ '`' )+ '`' ) ;
fragment USER_VAR_SUBFIX2 : ( '\'' ( ~ '\'' )+ '\'' ) ;
fragment USER_VAR_SUBFIX3 : ( '\"' ( ~ '\"' )+ '\"' ) ;
fragment USER_VAR_SUBFIX4 : ( 'A' .. 'Z' | 'a' .. 'z' | '_' | '$' | '0' .. '9' | DOT )+ ;
