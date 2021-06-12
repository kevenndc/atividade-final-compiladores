grammar LabeledExpr;
import CommonLexerRules;

prog
    : stat+;

multi_var_init
    : VIG ID # multiVariablesInit
    ;

stat
    : type=(INT | FLOAT | STRING) ID multi_var_init* PTVIG NEWLINE  # initVariables
    | CONST type=(INT | FLOAT | STRING) ID multi_var_init* PTVIG NEWLINE  # initConstants
    | PRINT APAREN expr FPAREN NEWLINE # printExpr
    | PRINT APAREN str_val FPAREN NEWLINE # printStringVal
    | ID EQ str_val NEWLINE # assignStr
    | ID EQ expr NEWLINE # assignExpr
    | NEWLINE # blank
    | IF APAREN cond FPAREN ACHAVE stat+ FCHAVE NEWLINE # ifStatement
    | IF APAREN cond FPAREN ACHAVE stat+ FCHAVE else_stat NEWLINE # ifElseStatement
    | WHILE APAREN cond FPAREN ACHAVE stat+ FCHAVE NEWLINE # whileStatement
    | FOR APAREN ID EQ INTVAL PTVIG cond FPAREN ACHAVE stat+ FCHAVE NEWLINE # forStatement
    ;

else_stat
    : ELSE ACHAVE stat+ FCHAVE # elseStat
    ; 

expr
    : expr op=(MUL | DIV) expr # MulDiv
    | expr op=(ADD | SUB) expr # AddSub
    | val # eval
    | APAREN expr FPAREN # parens
    ;

val
    : ID # id
    | INTVAL # integer
    | FLOATVAL # float
    ;

str_val
    : STRINGVAL # string
    | str_val ADD str_val # concatString
    | val # evalToString
    ;

cond
    : val GREAT val # evalGreat
    | val LESS val # evalLess
    ;   