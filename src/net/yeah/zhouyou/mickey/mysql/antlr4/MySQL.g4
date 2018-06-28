grammar MySQL;

@header{package net.yeah.zhouyou.mickey.mysql.antlr4;}

// ****** Parser ******

stat
	: insertStat
	| updateStat
	| deleteStat
	| selectStat
	| transcationStat
	;

transcationStat
	: commit
	| rollback
	;

commit   : COMMIT ;
rollback : ROLLBACK ;

insertStat
	: INSERT INTO? tableName=ID ('(' columnNames ')')? ((VALUES '(' valueList ')') | selectStat)
	;

columnNames : (ID ',')* ID ;
valueList   : (element ',')* element ;

selectStat
	: ('(' selectInner ')' | selectInner) selectUnionSuffix?
	;
selectInner
	: selectPrefix selectSuffix
	;
selectPrefix
	: SELECT (distinct=DISTINCT)? selectExprs 
	   (FROM tables)?
	  (WHERE where=whereCondition)?
	  (GROUP BY groupByExprs=gbobExprs)?
	 (HAVING having=whereCondition)?
	;
selectSuffix
	: (ORDER BY orderByExprs=gbobExprs)?
	  (LIMIT (((offset=(INT | PLACEHOLDER) ',')? rowCount=(INT | PLACEHOLDER)) | (rowCount=(INT | PLACEHOLDER) OFFSET offset=(INT | PLACEHOLDER))))?
	   ((FOR lock=UPDATE) | (lock=LOCK IN SHARE MODE))?
	;
selectUnionSuffix
	: UNION method=(ALL | DISTINCT)? ('(' selectStat ')' | selectStat) selectSuffix
	;

selectExprs : element (AS? alias=ID)? (',' selectExprs)? ;
tables      : tableRel (',' tableRel)* ;

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
tableJoinSuffix : tableJoinMod JOIN (tableNameAndAliases | '(' tableNameAndAliases ')' | tableRecu) joinCondition? tableJoinSuffix? ;
tableJoinMod    : INNER | CROSS | LEFT OUTER? | RIGHT OUTER? ;
joinCondition   : ON whereCondition | USING '(' columnNames ')' ;

gbobExprs : element sc=(ASC | DESC)? (',' gbobExprs)? ;

updateStat
	: updateSingleTable
	| updateMultipleTable
	;

updateSingleTable   : UPDATE tableNameAndAlias   SET setExprs (WHERE whereCondition)? (LIMIT rowCount=(INT|PLACEHOLDER))? ;
updateMultipleTable	: UPDATE tableNameAndAliases SET setExprs (WHERE whereCondition)? ;

setExprs      : setExpr (',' setExpr)* ;
setExpr       : left=element '=' (right=element | rightDefault=DEFAULT) ;

deleteStat
	: DELETE FROM tableNameAndAlias (WHERE whereCondition)? (LIMIT rowCount=(INT|PLACEHOLDER))?
	;

tableNameAndAlias   : name=ID (AS? alias=ID)? ;
tableNameAndAliases : tableNameAndAlias (',' tableNameAndAlias)* ;

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
	| exprNot
	| exprLike
	;

exprRelational    : left=element relationalOp=(EQ | LTH | GTH | NOT_EQ | LET | GET) right=element ;
exprBetweenAnd    : el=element (not=NOT)? BETWEEN left=element AND right=element ;
exprIsOrIsNotNull : element IS (not=NOT)? what=(NULL | TRUE | FALSE | UNKNOWN) ; // 这里比较粗爆
exprInSelect      : element (not=NOT)? IN '(' selectStat ')' ;
exprInValues      : element (not=NOT)? IN '(' valueList ')' ;
exprExists        : (not=NOT)? EXISTS '(' selectStat ')';
exprNot           : (NOT | '!') expression ;
exprLike          : left=element (not=NOT)? LIKE right=element ;

element
	: elementOpFactory
	| elementListFactor
	| elementOpEle
	;
elementOpFactory
	: elementText
	| elementTextParam
	| elementDate
	| funCall
	| elementSubQuery
	| elementCase
	| elementWapperBkt
	| elementWithPrefix
	| elementRow
	;

elementText        : ('*' | PLACEHOLDER | COLUMN_REL | ID | NULL | UNKNOWN) ;
elementTextParam   : DECIMAL | STRING | INT | DECIMAL | TRUE | FALSE ;
elementDate        : dt=(DATE | TIME | TIMESTAMP) STRING ;
elementSubQuery    : sqWith=(ANY | SOME | ALL)? '(' selectStat ')' ;
elementWapperBkt   : '(' element ')' ;
elementListFactor  : '(' elementList ')' ;
elementList        : element (',' element)* ;
elementOpEle       : elementOpFactory elementOpEleSuffix? ;
elementOpEleSuffix : op=('|' | '&' | '<<' | '>>' | '+' | '-' | '*' | DIV | MOD | '^' | AS)? elementOpEle ;
// 上面这一行中的op为可选的原因是加号和减号会被合并后面的数字中，这并不是我希望的，但贪婪匹配会有这样的效果，所以这里需要在visitor中做特殊处理。
elementCase        : CASE (value=element)? caseWhenPart (ELSE elseEl=element)? END ;
caseWhenPart       : WHEN (whenEl=element | whenRe=exprRelational) THEN then=element (suffix=caseWhenPart)?;
elementWithPrefix  : prefix=BINARY elementOpFactory ;
elementRow         : ROW '(' paramList ')' ;

funCall     : funName=ID '(' paramList? ')' ;
paramList   : (element | exprRelational) (',' paramList)? ;

// ******* Lexer *******

PLACEHOLDER : '?' | (':' [a-zA-Z0-9_]+) ;
SELECT      : [Ss][Ee][Ll][Ee][Cc][Tt] ;
INSERT      : [Ii][Nn][Ss][Ee][Rr][Tt];
INTO        : [Ii][Nn][Tt][Oo] ;
VALUES      : [Vv][Aa][Ll][Uu][Ee][Ss] ;
DELETE      : [Dd][Ee][Ll][Ee][Tt][Ee] ;
FROM        : [Ff][Rr][Oo][Mm] ;
WHERE       : [Ww][Hh][Ee][Rr][Ee] ;
LIMIT       : [Ll][Ii][Mm][Ii][Tt] ;
NULL        : [Nn][Uu][Ll][Ll] ;
IS          : [Ii][Ss] ;
IN          : [Ii][Nn] ;
BETWEEN     : [Bb][Ee][Tt][Ww][Ee][Ee][Nn] ;
EXISTS      : [Ee][Xx][Ii][Ss][Tt][Ss] ;
TRUE        : [Tt][Rr][Uu][Ee] ;
FALSE       : [Ff][Aa][Ll][Ss] ;
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
TIME        : [Tt][Ii][Mm][Ee] ;
TIMESTAMP   : [Tt][Ii][Mm][Ee][Ss][Tt][Aa][Mm][Pp] ;
ALL         : [Aa][Ll][Ll] ;
ANY         : [Aa][Nn][Yy] ;
SOME        : [Ss][Oo][Mm][Ee] ;
UNION       : [Uu][Nn][Ii][Oo][Nn] ;
UNKNOWN     : [Uu][Nn][Kk][Nn][Oo][Ww][Nn] ;
LOCK        : [Ll][Oo][Cc][Kk] ;
SHARE       : [Ss][Hh][Aa][Rr][Ee] ;
MODE        : [Mm][Oo][Dd][Ee] ;
COMMIT      : [Cc][Oo][Mm][Mm][Ii][Tt] ;
ROLLBACK    : [Rr][Oo][Ll][Ll][Bb][Aa][Cc][Kk] ;
CASE        : [Cc][Aa][Ss][Ee] ;
WHEN        : [Ww][Hh][Ee][Nn] ;
THEN        : [Tt][Hh][Ee][Nn] ;
ELSE        : [Ee][Ll][Ss][Ee] ;
END         : [Ee][Nn][Dd] ;
ROW         : [Rr][Oo][Ww] ;
BINARY      : [Bb][Ii][Nn][Aa][Rr][Yy] ;

AND         : [Aa][Nn][Dd] | '&&' ;
OR          : [Oo][Rr]     | '||' ;
NOT         : [Nn][Oo][Tt] | '!'  ;
DIV         : [Dd][Ii][Vv] | '/'  ;
MOD         : [Mm][Oo][Dd] | '%'  ;
PLUS        : '+'  ;
MINUS       : '-'  ;
VERTBAR     : '|'  ;
BITAND      : '&'  ;
SHIFT_LEFT  : '<<' ;
SHIFT_RIGHT : '>>' ;
ASTERISK    : '*'  ;
POWER_OP    : '^'  ;

INT         : [0-9]+ | [Xx] '\'' [0-9a-fA-F]+ '\'' | '0' [Xx] [0-9a-fA-F]+ | [Bb] '\'' [01]+ '\'' | '0' [Bb] [01]+;
DECIMAL     : ('+' | '-')? ((INT)|('.' INT)|(INT '.' INT)) ([Ee]('+' | '-')? INT)? ;
STRING      : (['] ((~[']) ([']['])?)* [']) | (["] ((~["]) (["]["])?)* ["]) ;

ID          : ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) [a-zA-Z0-9_]*;
COLUMN_REL  : ID '.' (ID | '*') ;

REGEXP      : 'regexp' ;
NEGATION    : '~' ;
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
COMMENT1    : ('--' | '#') ( ~ '\n' )* ('\n' | EOF) -> skip ;
COMMENT2    : '/*' (('*' ~ '/') | ( ~ '*'))* '*/' -> skip ;
USER_VAR    : '@' ( USER_VAR_SUBFIX1 | USER_VAR_SUBFIX2 | USER_VAR_SUBFIX3 | USER_VAR_SUBFIX4 ) ;
fragment USER_VAR_SUBFIX1 : ( '`' ( ~ '`' )+ '`' ) ;
fragment USER_VAR_SUBFIX2 : ( '\'' ( ~ '\'' )+ '\'' ) ;
fragment USER_VAR_SUBFIX3 : ( '\"' ( ~ '\"' )+ '\"' ) ;
fragment USER_VAR_SUBFIX4 : ( 'A' .. 'Z' | 'a' .. 'z' | '_' | '$' | '0' .. '9' | DOT )+ ;
