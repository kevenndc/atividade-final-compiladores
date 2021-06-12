// Generated from LabeledExpr.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LabeledExprParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MUL=1, DIV=2, ADD=3, SUB=4, EQ=5, GREAT=6, LESS=7, IF=8, ELSE=9, PRINT=10, 
		WHILE=11, FOR=12, INT=13, FLOAT=14, CONST=15, STRING=16, ACHAVE=17, FCHAVE=18, 
		APAREN=19, FPAREN=20, VIG=21, PTVIG=22, ID=23, INTVAL=24, FLOATVAL=25, 
		STRINGVAL=26, NEWLINE=27, COMMENT=28, WS=29;
	public static final int
		RULE_prog = 0, RULE_multi_var_init = 1, RULE_stat = 2, RULE_else_stat = 3, 
		RULE_expr = 4, RULE_val = 5, RULE_str_val = 6, RULE_str_concat = 7, RULE_cond = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "multi_var_init", "stat", "else_stat", "expr", "val", "str_val", 
			"str_concat", "cond"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'*'", "'/'", "'+'", "'-'", "'='", "'>'", "'<'", "'if'", "'else'", 
			"'println'", "'while'", "'for'", "'int'", "'float'", "'const'", "'string'", 
			"'{'", "'}'", "'('", "')'", "','", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "MUL", "DIV", "ADD", "SUB", "EQ", "GREAT", "LESS", "IF", "ELSE", 
			"PRINT", "WHILE", "FOR", "INT", "FLOAT", "CONST", "STRING", "ACHAVE", 
			"FCHAVE", "APAREN", "FPAREN", "VIG", "PTVIG", "ID", "INTVAL", "FLOATVAL", 
			"STRINGVAL", "NEWLINE", "COMMENT", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "LabeledExpr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LabeledExprParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(18);
				stat();
				}
				}
				setState(21); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << PRINT) | (1L << WHILE) | (1L << FOR) | (1L << INT) | (1L << FLOAT) | (1L << CONST) | (1L << STRING) | (1L << ID) | (1L << NEWLINE))) != 0) );
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

	public static class Multi_var_initContext extends ParserRuleContext {
		public Multi_var_initContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multi_var_init; }
	 
		public Multi_var_initContext() { }
		public void copyFrom(Multi_var_initContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MultiVariablesInitContext extends Multi_var_initContext {
		public TerminalNode VIG() { return getToken(LabeledExprParser.VIG, 0); }
		public TerminalNode ID() { return getToken(LabeledExprParser.ID, 0); }
		public MultiVariablesInitContext(Multi_var_initContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitMultiVariablesInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Multi_var_initContext multi_var_init() throws RecognitionException {
		Multi_var_initContext _localctx = new Multi_var_initContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_multi_var_init);
		try {
			_localctx = new MultiVariablesInitContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			match(VIG);
			setState(24);
			match(ID);
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

	public static class StatContext extends ParserRuleContext {
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
	 
		public StatContext() { }
		public void copyFrom(StatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WhileStatementContext extends StatContext {
		public TerminalNode WHILE() { return getToken(LabeledExprParser.WHILE, 0); }
		public TerminalNode APAREN() { return getToken(LabeledExprParser.APAREN, 0); }
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public TerminalNode FPAREN() { return getToken(LabeledExprParser.FPAREN, 0); }
		public TerminalNode ACHAVE() { return getToken(LabeledExprParser.ACHAVE, 0); }
		public TerminalNode FCHAVE() { return getToken(LabeledExprParser.FCHAVE, 0); }
		public TerminalNode NEWLINE() { return getToken(LabeledExprParser.NEWLINE, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public WhileStatementContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InitExprConstContext extends StatContext {
		public Token type;
		public TerminalNode CONST() { return getToken(LabeledExprParser.CONST, 0); }
		public TerminalNode ID() { return getToken(LabeledExprParser.ID, 0); }
		public TerminalNode EQ() { return getToken(LabeledExprParser.EQ, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(LabeledExprParser.NEWLINE, 0); }
		public TerminalNode INT() { return getToken(LabeledExprParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(LabeledExprParser.FLOAT, 0); }
		public TerminalNode STRING() { return getToken(LabeledExprParser.STRING, 0); }
		public InitExprConstContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitInitExprConst(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BlankContext extends StatContext {
		public TerminalNode NEWLINE() { return getToken(LabeledExprParser.NEWLINE, 0); }
		public BlankContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitBlank(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintStringConcatContext extends StatContext {
		public TerminalNode PRINT() { return getToken(LabeledExprParser.PRINT, 0); }
		public TerminalNode APAREN() { return getToken(LabeledExprParser.APAREN, 0); }
		public Str_concatContext str_concat() {
			return getRuleContext(Str_concatContext.class,0);
		}
		public TerminalNode FPAREN() { return getToken(LabeledExprParser.FPAREN, 0); }
		public TerminalNode NEWLINE() { return getToken(LabeledExprParser.NEWLINE, 0); }
		public PrintStringConcatContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitPrintStringConcat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InitStrConstContext extends StatContext {
		public Token type;
		public TerminalNode CONST() { return getToken(LabeledExprParser.CONST, 0); }
		public TerminalNode ID() { return getToken(LabeledExprParser.ID, 0); }
		public TerminalNode EQ() { return getToken(LabeledExprParser.EQ, 0); }
		public Str_valContext str_val() {
			return getRuleContext(Str_valContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(LabeledExprParser.NEWLINE, 0); }
		public TerminalNode INT() { return getToken(LabeledExprParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(LabeledExprParser.FLOAT, 0); }
		public TerminalNode STRING() { return getToken(LabeledExprParser.STRING, 0); }
		public InitStrConstContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitInitStrConst(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfElseStatementContext extends StatContext {
		public TerminalNode IF() { return getToken(LabeledExprParser.IF, 0); }
		public TerminalNode APAREN() { return getToken(LabeledExprParser.APAREN, 0); }
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public TerminalNode FPAREN() { return getToken(LabeledExprParser.FPAREN, 0); }
		public TerminalNode ACHAVE() { return getToken(LabeledExprParser.ACHAVE, 0); }
		public TerminalNode FCHAVE() { return getToken(LabeledExprParser.FCHAVE, 0); }
		public Else_statContext else_stat() {
			return getRuleContext(Else_statContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(LabeledExprParser.NEWLINE, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public IfElseStatementContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitIfElseStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InitVariablesContext extends StatContext {
		public Token type;
		public TerminalNode ID() { return getToken(LabeledExprParser.ID, 0); }
		public TerminalNode PTVIG() { return getToken(LabeledExprParser.PTVIG, 0); }
		public TerminalNode NEWLINE() { return getToken(LabeledExprParser.NEWLINE, 0); }
		public TerminalNode INT() { return getToken(LabeledExprParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(LabeledExprParser.FLOAT, 0); }
		public TerminalNode STRING() { return getToken(LabeledExprParser.STRING, 0); }
		public List<Multi_var_initContext> multi_var_init() {
			return getRuleContexts(Multi_var_initContext.class);
		}
		public Multi_var_initContext multi_var_init(int i) {
			return getRuleContext(Multi_var_initContext.class,i);
		}
		public InitVariablesContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitInitVariables(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForStatementContext extends StatContext {
		public TerminalNode FOR() { return getToken(LabeledExprParser.FOR, 0); }
		public TerminalNode APAREN() { return getToken(LabeledExprParser.APAREN, 0); }
		public TerminalNode ID() { return getToken(LabeledExprParser.ID, 0); }
		public TerminalNode EQ() { return getToken(LabeledExprParser.EQ, 0); }
		public TerminalNode INTVAL() { return getToken(LabeledExprParser.INTVAL, 0); }
		public TerminalNode PTVIG() { return getToken(LabeledExprParser.PTVIG, 0); }
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public TerminalNode FPAREN() { return getToken(LabeledExprParser.FPAREN, 0); }
		public TerminalNode ACHAVE() { return getToken(LabeledExprParser.ACHAVE, 0); }
		public TerminalNode FCHAVE() { return getToken(LabeledExprParser.FCHAVE, 0); }
		public TerminalNode NEWLINE() { return getToken(LabeledExprParser.NEWLINE, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public ForStatementContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfStatementContext extends StatContext {
		public TerminalNode IF() { return getToken(LabeledExprParser.IF, 0); }
		public TerminalNode APAREN() { return getToken(LabeledExprParser.APAREN, 0); }
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public TerminalNode FPAREN() { return getToken(LabeledExprParser.FPAREN, 0); }
		public TerminalNode ACHAVE() { return getToken(LabeledExprParser.ACHAVE, 0); }
		public TerminalNode FCHAVE() { return getToken(LabeledExprParser.FCHAVE, 0); }
		public TerminalNode NEWLINE() { return getToken(LabeledExprParser.NEWLINE, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public IfStatementContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignExprContext extends StatContext {
		public TerminalNode ID() { return getToken(LabeledExprParser.ID, 0); }
		public TerminalNode EQ() { return getToken(LabeledExprParser.EQ, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(LabeledExprParser.NEWLINE, 0); }
		public AssignExprContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitAssignExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintExprContext extends StatContext {
		public TerminalNode PRINT() { return getToken(LabeledExprParser.PRINT, 0); }
		public TerminalNode APAREN() { return getToken(LabeledExprParser.APAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode FPAREN() { return getToken(LabeledExprParser.FPAREN, 0); }
		public TerminalNode NEWLINE() { return getToken(LabeledExprParser.NEWLINE, 0); }
		public PrintExprContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitPrintExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignStrContext extends StatContext {
		public TerminalNode ID() { return getToken(LabeledExprParser.ID, 0); }
		public TerminalNode EQ() { return getToken(LabeledExprParser.EQ, 0); }
		public Str_valContext str_val() {
			return getRuleContext(Str_valContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(LabeledExprParser.NEWLINE, 0); }
		public AssignStrContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitAssignStr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_stat);
		int _la;
		try {
			setState(130);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new InitVariablesContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(26);
				((InitVariablesContext)_localctx).type = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << STRING))) != 0)) ) {
					((InitVariablesContext)_localctx).type = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(27);
				match(ID);
				setState(31);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VIG) {
					{
					{
					setState(28);
					multi_var_init();
					}
					}
					setState(33);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(34);
				match(PTVIG);
				setState(35);
				match(NEWLINE);
				}
				break;
			case 2:
				_localctx = new InitExprConstContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(36);
				match(CONST);
				setState(37);
				((InitExprConstContext)_localctx).type = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << STRING))) != 0)) ) {
					((InitExprConstContext)_localctx).type = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(38);
				match(ID);
				setState(39);
				match(EQ);
				setState(40);
				expr(0);
				setState(41);
				match(NEWLINE);
				}
				break;
			case 3:
				_localctx = new InitStrConstContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(43);
				match(CONST);
				setState(44);
				((InitStrConstContext)_localctx).type = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << STRING))) != 0)) ) {
					((InitStrConstContext)_localctx).type = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(45);
				match(ID);
				setState(46);
				match(EQ);
				setState(47);
				str_val();
				setState(48);
				match(NEWLINE);
				}
				break;
			case 4:
				_localctx = new PrintExprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(50);
				match(PRINT);
				setState(51);
				match(APAREN);
				setState(52);
				expr(0);
				setState(53);
				match(FPAREN);
				setState(54);
				match(NEWLINE);
				}
				break;
			case 5:
				_localctx = new PrintStringConcatContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(56);
				match(PRINT);
				setState(57);
				match(APAREN);
				setState(58);
				str_concat(0);
				setState(59);
				match(FPAREN);
				setState(60);
				match(NEWLINE);
				}
				break;
			case 6:
				_localctx = new AssignStrContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(62);
				match(ID);
				setState(63);
				match(EQ);
				setState(64);
				str_val();
				setState(65);
				match(NEWLINE);
				}
				break;
			case 7:
				_localctx = new AssignExprContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(67);
				match(ID);
				setState(68);
				match(EQ);
				setState(69);
				expr(0);
				setState(70);
				match(NEWLINE);
				}
				break;
			case 8:
				_localctx = new BlankContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(72);
				match(NEWLINE);
				}
				break;
			case 9:
				_localctx = new IfStatementContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(73);
				match(IF);
				setState(74);
				match(APAREN);
				setState(75);
				cond();
				setState(76);
				match(FPAREN);
				setState(77);
				match(ACHAVE);
				setState(79); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(78);
					stat();
					}
					}
					setState(81); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << PRINT) | (1L << WHILE) | (1L << FOR) | (1L << INT) | (1L << FLOAT) | (1L << CONST) | (1L << STRING) | (1L << ID) | (1L << NEWLINE))) != 0) );
				setState(83);
				match(FCHAVE);
				setState(84);
				match(NEWLINE);
				}
				break;
			case 10:
				_localctx = new IfElseStatementContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(86);
				match(IF);
				setState(87);
				match(APAREN);
				setState(88);
				cond();
				setState(89);
				match(FPAREN);
				setState(90);
				match(ACHAVE);
				setState(92); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(91);
					stat();
					}
					}
					setState(94); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << PRINT) | (1L << WHILE) | (1L << FOR) | (1L << INT) | (1L << FLOAT) | (1L << CONST) | (1L << STRING) | (1L << ID) | (1L << NEWLINE))) != 0) );
				setState(96);
				match(FCHAVE);
				setState(97);
				else_stat();
				setState(98);
				match(NEWLINE);
				}
				break;
			case 11:
				_localctx = new WhileStatementContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(100);
				match(WHILE);
				setState(101);
				match(APAREN);
				setState(102);
				cond();
				setState(103);
				match(FPAREN);
				setState(104);
				match(ACHAVE);
				setState(106); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(105);
					stat();
					}
					}
					setState(108); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << PRINT) | (1L << WHILE) | (1L << FOR) | (1L << INT) | (1L << FLOAT) | (1L << CONST) | (1L << STRING) | (1L << ID) | (1L << NEWLINE))) != 0) );
				setState(110);
				match(FCHAVE);
				setState(111);
				match(NEWLINE);
				}
				break;
			case 12:
				_localctx = new ForStatementContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(113);
				match(FOR);
				setState(114);
				match(APAREN);
				setState(115);
				match(ID);
				setState(116);
				match(EQ);
				setState(117);
				match(INTVAL);
				setState(118);
				match(PTVIG);
				setState(119);
				cond();
				setState(120);
				match(FPAREN);
				setState(121);
				match(ACHAVE);
				setState(123); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(122);
					stat();
					}
					}
					setState(125); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << PRINT) | (1L << WHILE) | (1L << FOR) | (1L << INT) | (1L << FLOAT) | (1L << CONST) | (1L << STRING) | (1L << ID) | (1L << NEWLINE))) != 0) );
				setState(127);
				match(FCHAVE);
				setState(128);
				match(NEWLINE);
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

	public static class Else_statContext extends ParserRuleContext {
		public Else_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_stat; }
	 
		public Else_statContext() { }
		public void copyFrom(Else_statContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ElseStatContext extends Else_statContext {
		public TerminalNode ELSE() { return getToken(LabeledExprParser.ELSE, 0); }
		public TerminalNode ACHAVE() { return getToken(LabeledExprParser.ACHAVE, 0); }
		public TerminalNode FCHAVE() { return getToken(LabeledExprParser.FCHAVE, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public ElseStatContext(Else_statContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitElseStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_statContext else_stat() throws RecognitionException {
		Else_statContext _localctx = new Else_statContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_else_stat);
		int _la;
		try {
			_localctx = new ElseStatContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(ELSE);
			setState(133);
			match(ACHAVE);
			setState(135); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(134);
				stat();
				}
				}
				setState(137); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << PRINT) | (1L << WHILE) | (1L << FOR) | (1L << INT) | (1L << FLOAT) | (1L << CONST) | (1L << STRING) | (1L << ID) | (1L << NEWLINE))) != 0) );
			setState(139);
			match(FCHAVE);
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParensContext extends ExprContext {
		public TerminalNode APAREN() { return getToken(LabeledExprParser.APAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode FPAREN() { return getToken(LabeledExprParser.FPAREN, 0); }
		public ParensContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitParens(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EvalContext extends ExprContext {
		public ValContext val() {
			return getRuleContext(ValContext.class,0);
		}
		public EvalContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitEval(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulDivContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MUL() { return getToken(LabeledExprParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(LabeledExprParser.DIV, 0); }
		public MulDivContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitMulDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddSubContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ADD() { return getToken(LabeledExprParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(LabeledExprParser.SUB, 0); }
		public AddSubContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitAddSub(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
			case INTVAL:
			case FLOATVAL:
				{
				_localctx = new EvalContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(142);
				val();
				}
				break;
			case APAREN:
				{
				_localctx = new ParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(143);
				match(APAREN);
				setState(144);
				expr(0);
				setState(145);
				match(FPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(157);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(155);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(149);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(150);
						((MulDivContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
							((MulDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(151);
						expr(5);
						}
						break;
					case 2:
						{
						_localctx = new AddSubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(152);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(153);
						((AddSubContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((AddSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(154);
						expr(4);
						}
						break;
					}
					} 
				}
				setState(159);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ValContext extends ParserRuleContext {
		public ValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_val; }
	 
		public ValContext() { }
		public void copyFrom(ValContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IdContext extends ValContext {
		public TerminalNode ID() { return getToken(LabeledExprParser.ID, 0); }
		public IdContext(ValContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntegerContext extends ValContext {
		public TerminalNode INTVAL() { return getToken(LabeledExprParser.INTVAL, 0); }
		public IntegerContext(ValContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitInteger(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FloatContext extends ValContext {
		public TerminalNode FLOATVAL() { return getToken(LabeledExprParser.FLOATVAL, 0); }
		public FloatContext(ValContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitFloat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValContext val() throws RecognitionException {
		ValContext _localctx = new ValContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_val);
		try {
			setState(163);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new IdContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(160);
				match(ID);
				}
				break;
			case INTVAL:
				_localctx = new IntegerContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(161);
				match(INTVAL);
				}
				break;
			case FLOATVAL:
				_localctx = new FloatContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(162);
				match(FLOATVAL);
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

	public static class Str_valContext extends ParserRuleContext {
		public Str_valContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_str_val; }
	 
		public Str_valContext() { }
		public void copyFrom(Str_valContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StringContext extends Str_valContext {
		public TerminalNode STRINGVAL() { return getToken(LabeledExprParser.STRINGVAL, 0); }
		public StringContext(Str_valContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Str_valContext str_val() throws RecognitionException {
		Str_valContext _localctx = new Str_valContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_str_val);
		try {
			_localctx = new StringContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(STRINGVAL);
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

	public static class Str_concatContext extends ParserRuleContext {
		public Str_concatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_str_concat; }
	 
		public Str_concatContext() { }
		public void copyFrom(Str_concatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ConcatStringContext extends Str_concatContext {
		public List<Str_concatContext> str_concat() {
			return getRuleContexts(Str_concatContext.class);
		}
		public Str_concatContext str_concat(int i) {
			return getRuleContext(Str_concatContext.class,i);
		}
		public TerminalNode ADD() { return getToken(LabeledExprParser.ADD, 0); }
		public ConcatStringContext(Str_concatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitConcatString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EvalConcatContext extends Str_concatContext {
		public ValContext val() {
			return getRuleContext(ValContext.class,0);
		}
		public EvalConcatContext(Str_concatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitEvalConcat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringValConcatContext extends Str_concatContext {
		public Str_valContext str_val() {
			return getRuleContext(Str_valContext.class,0);
		}
		public StringValConcatContext(Str_concatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitStringValConcat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Str_concatContext str_concat() throws RecognitionException {
		return str_concat(0);
	}

	private Str_concatContext str_concat(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Str_concatContext _localctx = new Str_concatContext(_ctx, _parentState);
		Str_concatContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_str_concat, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRINGVAL:
				{
				_localctx = new StringValConcatContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(168);
				str_val();
				}
				break;
			case ID:
			case INTVAL:
			case FLOATVAL:
				{
				_localctx = new EvalConcatContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(169);
				val();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(177);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConcatStringContext(new Str_concatContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_str_concat);
					setState(172);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(173);
					match(ADD);
					setState(174);
					str_concat(4);
					}
					} 
				}
				setState(179);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class CondContext extends ParserRuleContext {
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
	 
		public CondContext() { }
		public void copyFrom(CondContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EvalGreatContext extends CondContext {
		public List<ValContext> val() {
			return getRuleContexts(ValContext.class);
		}
		public ValContext val(int i) {
			return getRuleContext(ValContext.class,i);
		}
		public TerminalNode GREAT() { return getToken(LabeledExprParser.GREAT, 0); }
		public EvalGreatContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitEvalGreat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EvalLessContext extends CondContext {
		public List<ValContext> val() {
			return getRuleContexts(ValContext.class);
		}
		public ValContext val(int i) {
			return getRuleContext(ValContext.class,i);
		}
		public TerminalNode LESS() { return getToken(LabeledExprParser.LESS, 0); }
		public EvalLessContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitEvalLess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondContext cond() throws RecognitionException {
		CondContext _localctx = new CondContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_cond);
		try {
			setState(188);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new EvalGreatContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(180);
				val();
				setState(181);
				match(GREAT);
				setState(182);
				val();
				}
				break;
			case 2:
				_localctx = new EvalLessContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(184);
				val();
				setState(185);
				match(LESS);
				setState(186);
				val();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 7:
			return str_concat_sempred((Str_concatContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean str_concat_sempred(Str_concatContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\37\u00c1\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\6"+
		"\2\26\n\2\r\2\16\2\27\3\3\3\3\3\3\3\4\3\4\3\4\7\4 \n\4\f\4\16\4#\13\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\6\4R\n\4\r\4\16\4S\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\6\4_\n\4\r\4\16\4`\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\6\4m\n\4\r\4\16\4n\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\6\4~\n\4\r\4\16\4\177\3\4\3\4\3\4\5\4\u0085\n\4\3\5"+
		"\3\5\3\5\6\5\u008a\n\5\r\5\16\5\u008b\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\5\6\u0096\n\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u009e\n\6\f\6\16\6\u00a1\13"+
		"\6\3\7\3\7\3\7\5\7\u00a6\n\7\3\b\3\b\3\t\3\t\3\t\5\t\u00ad\n\t\3\t\3\t"+
		"\3\t\7\t\u00b2\n\t\f\t\16\t\u00b5\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\5\n\u00bf\n\n\3\n\2\4\n\20\13\2\4\6\b\n\f\16\20\22\2\5\4\2\17\20\22\22"+
		"\3\2\3\4\3\2\5\6\2\u00d1\2\25\3\2\2\2\4\31\3\2\2\2\6\u0084\3\2\2\2\b\u0086"+
		"\3\2\2\2\n\u0095\3\2\2\2\f\u00a5\3\2\2\2\16\u00a7\3\2\2\2\20\u00ac\3\2"+
		"\2\2\22\u00be\3\2\2\2\24\26\5\6\4\2\25\24\3\2\2\2\26\27\3\2\2\2\27\25"+
		"\3\2\2\2\27\30\3\2\2\2\30\3\3\2\2\2\31\32\7\27\2\2\32\33\7\31\2\2\33\5"+
		"\3\2\2\2\34\35\t\2\2\2\35!\7\31\2\2\36 \5\4\3\2\37\36\3\2\2\2 #\3\2\2"+
		"\2!\37\3\2\2\2!\"\3\2\2\2\"$\3\2\2\2#!\3\2\2\2$%\7\30\2\2%\u0085\7\35"+
		"\2\2&\'\7\21\2\2\'(\t\2\2\2()\7\31\2\2)*\7\7\2\2*+\5\n\6\2+,\7\35\2\2"+
		",\u0085\3\2\2\2-.\7\21\2\2./\t\2\2\2/\60\7\31\2\2\60\61\7\7\2\2\61\62"+
		"\5\16\b\2\62\63\7\35\2\2\63\u0085\3\2\2\2\64\65\7\f\2\2\65\66\7\25\2\2"+
		"\66\67\5\n\6\2\678\7\26\2\289\7\35\2\29\u0085\3\2\2\2:;\7\f\2\2;<\7\25"+
		"\2\2<=\5\20\t\2=>\7\26\2\2>?\7\35\2\2?\u0085\3\2\2\2@A\7\31\2\2AB\7\7"+
		"\2\2BC\5\16\b\2CD\7\35\2\2D\u0085\3\2\2\2EF\7\31\2\2FG\7\7\2\2GH\5\n\6"+
		"\2HI\7\35\2\2I\u0085\3\2\2\2J\u0085\7\35\2\2KL\7\n\2\2LM\7\25\2\2MN\5"+
		"\22\n\2NO\7\26\2\2OQ\7\23\2\2PR\5\6\4\2QP\3\2\2\2RS\3\2\2\2SQ\3\2\2\2"+
		"ST\3\2\2\2TU\3\2\2\2UV\7\24\2\2VW\7\35\2\2W\u0085\3\2\2\2XY\7\n\2\2YZ"+
		"\7\25\2\2Z[\5\22\n\2[\\\7\26\2\2\\^\7\23\2\2]_\5\6\4\2^]\3\2\2\2_`\3\2"+
		"\2\2`^\3\2\2\2`a\3\2\2\2ab\3\2\2\2bc\7\24\2\2cd\5\b\5\2de\7\35\2\2e\u0085"+
		"\3\2\2\2fg\7\r\2\2gh\7\25\2\2hi\5\22\n\2ij\7\26\2\2jl\7\23\2\2km\5\6\4"+
		"\2lk\3\2\2\2mn\3\2\2\2nl\3\2\2\2no\3\2\2\2op\3\2\2\2pq\7\24\2\2qr\7\35"+
		"\2\2r\u0085\3\2\2\2st\7\16\2\2tu\7\25\2\2uv\7\31\2\2vw\7\7\2\2wx\7\32"+
		"\2\2xy\7\30\2\2yz\5\22\n\2z{\7\26\2\2{}\7\23\2\2|~\5\6\4\2}|\3\2\2\2~"+
		"\177\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\u0081\3\2\2\2\u0081"+
		"\u0082\7\24\2\2\u0082\u0083\7\35\2\2\u0083\u0085\3\2\2\2\u0084\34\3\2"+
		"\2\2\u0084&\3\2\2\2\u0084-\3\2\2\2\u0084\64\3\2\2\2\u0084:\3\2\2\2\u0084"+
		"@\3\2\2\2\u0084E\3\2\2\2\u0084J\3\2\2\2\u0084K\3\2\2\2\u0084X\3\2\2\2"+
		"\u0084f\3\2\2\2\u0084s\3\2\2\2\u0085\7\3\2\2\2\u0086\u0087\7\13\2\2\u0087"+
		"\u0089\7\23\2\2\u0088\u008a\5\6\4\2\u0089\u0088\3\2\2\2\u008a\u008b\3"+
		"\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008d\3\2\2\2\u008d"+
		"\u008e\7\24\2\2\u008e\t\3\2\2\2\u008f\u0090\b\6\1\2\u0090\u0096\5\f\7"+
		"\2\u0091\u0092\7\25\2\2\u0092\u0093\5\n\6\2\u0093\u0094\7\26\2\2\u0094"+
		"\u0096\3\2\2\2\u0095\u008f\3\2\2\2\u0095\u0091\3\2\2\2\u0096\u009f\3\2"+
		"\2\2\u0097\u0098\f\6\2\2\u0098\u0099\t\3\2\2\u0099\u009e\5\n\6\7\u009a"+
		"\u009b\f\5\2\2\u009b\u009c\t\4\2\2\u009c\u009e\5\n\6\6\u009d\u0097\3\2"+
		"\2\2\u009d\u009a\3\2\2\2\u009e\u00a1\3\2\2\2\u009f\u009d\3\2\2\2\u009f"+
		"\u00a0\3\2\2\2\u00a0\13\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2\u00a6\7\31\2"+
		"\2\u00a3\u00a6\7\32\2\2\u00a4\u00a6\7\33\2\2\u00a5\u00a2\3\2\2\2\u00a5"+
		"\u00a3\3\2\2\2\u00a5\u00a4\3\2\2\2\u00a6\r\3\2\2\2\u00a7\u00a8\7\34\2"+
		"\2\u00a8\17\3\2\2\2\u00a9\u00aa\b\t\1\2\u00aa\u00ad\5\16\b\2\u00ab\u00ad"+
		"\5\f\7\2\u00ac\u00a9\3\2\2\2\u00ac\u00ab\3\2\2\2\u00ad\u00b3\3\2\2\2\u00ae"+
		"\u00af\f\5\2\2\u00af\u00b0\7\5\2\2\u00b0\u00b2\5\20\t\6\u00b1\u00ae\3"+
		"\2\2\2\u00b2\u00b5\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4"+
		"\21\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b6\u00b7\5\f\7\2\u00b7\u00b8\7\b\2"+
		"\2\u00b8\u00b9\5\f\7\2\u00b9\u00bf\3\2\2\2\u00ba\u00bb\5\f\7\2\u00bb\u00bc"+
		"\7\t\2\2\u00bc\u00bd\5\f\7\2\u00bd\u00bf\3\2\2\2\u00be\u00b6\3\2\2\2\u00be"+
		"\u00ba\3\2\2\2\u00bf\23\3\2\2\2\21\27!S`n\177\u0084\u008b\u0095\u009d"+
		"\u009f\u00a5\u00ac\u00b3\u00be";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}