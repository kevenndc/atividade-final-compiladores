// Generated from /home/kevenn/academico/compiladores/unidade-2/exemplo-1/LabeledExpr.g4 by ANTLR 4.8
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
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MUL=1, DIV=2, ADD=3, SUB=4, EQ=5, GREAT=6, LESS=7, IF=8, ELSE=9, PRINT=10, 
		WHILE=11, FOR=12, INT=13, FLOAT=14, CONST=15, STRING=16, ACHAVE=17, FCHAVE=18, 
		APAREN=19, FPAREN=20, VIG=21, PTVIG=22, ID=23, INTVAL=24, FLOATVAL=25, 
		STRINGVAL=26, NEWLINE=27, WS=28;
	public static final int
		RULE_prog = 0, RULE_multi_var_init = 1, RULE_stat = 2, RULE_else_stat = 3, 
		RULE_expr = 4, RULE_val = 5, RULE_str_val = 6, RULE_cond = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "multi_var_init", "stat", "else_stat", "expr", "val", "str_val", 
			"cond"
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
			"STRINGVAL", "NEWLINE", "WS"
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
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(17); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(16);
				stat();
				}
				}
				setState(19); 
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
	}

	public final Multi_var_initContext multi_var_init() throws RecognitionException {
		Multi_var_initContext _localctx = new Multi_var_initContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_multi_var_init);
		try {
			_localctx = new MultiVariablesInitContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			match(VIG);
			setState(22);
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
	public static class PrintStringValContext extends StatContext {
		public TerminalNode PRINT() { return getToken(LabeledExprParser.PRINT, 0); }
		public TerminalNode APAREN() { return getToken(LabeledExprParser.APAREN, 0); }
		public Str_valContext str_val() {
			return getRuleContext(Str_valContext.class,0);
		}
		public TerminalNode FPAREN() { return getToken(LabeledExprParser.FPAREN, 0); }
		public TerminalNode NEWLINE() { return getToken(LabeledExprParser.NEWLINE, 0); }
		public PrintStringValContext(StatContext ctx) { copyFrom(ctx); }
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
	}
	public static class InitConstantsContext extends StatContext {
		public Token type;
		public TerminalNode CONST() { return getToken(LabeledExprParser.CONST, 0); }
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
		public InitConstantsContext(StatContext ctx) { copyFrom(ctx); }
	}
	public static class BlankContext extends StatContext {
		public TerminalNode NEWLINE() { return getToken(LabeledExprParser.NEWLINE, 0); }
		public BlankContext(StatContext ctx) { copyFrom(ctx); }
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
	}
	public static class AssignExprContext extends StatContext {
		public TerminalNode ID() { return getToken(LabeledExprParser.ID, 0); }
		public TerminalNode EQ() { return getToken(LabeledExprParser.EQ, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(LabeledExprParser.NEWLINE, 0); }
		public AssignExprContext(StatContext ctx) { copyFrom(ctx); }
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
	}
	public static class AssignStrContext extends StatContext {
		public TerminalNode ID() { return getToken(LabeledExprParser.ID, 0); }
		public TerminalNode EQ() { return getToken(LabeledExprParser.EQ, 0); }
		public Str_valContext str_val() {
			return getRuleContext(Str_valContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(LabeledExprParser.NEWLINE, 0); }
		public AssignStrContext(StatContext ctx) { copyFrom(ctx); }
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_stat);
		int _la;
		try {
			setState(125);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new InitVariablesContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(24);
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
				setState(25);
				match(ID);
				setState(29);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VIG) {
					{
					{
					setState(26);
					multi_var_init();
					}
					}
					setState(31);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(32);
				match(PTVIG);
				setState(33);
				match(NEWLINE);
				}
				break;
			case 2:
				_localctx = new InitConstantsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(34);
				match(CONST);
				setState(35);
				((InitConstantsContext)_localctx).type = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLOAT) | (1L << STRING))) != 0)) ) {
					((InitConstantsContext)_localctx).type = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(36);
				match(ID);
				setState(40);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VIG) {
					{
					{
					setState(37);
					multi_var_init();
					}
					}
					setState(42);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(43);
				match(PTVIG);
				setState(44);
				match(NEWLINE);
				}
				break;
			case 3:
				_localctx = new PrintExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(45);
				match(PRINT);
				setState(46);
				match(APAREN);
				setState(47);
				expr(0);
				setState(48);
				match(FPAREN);
				setState(49);
				match(NEWLINE);
				}
				break;
			case 4:
				_localctx = new PrintStringValContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(51);
				match(PRINT);
				setState(52);
				match(APAREN);
				setState(53);
				str_val(0);
				setState(54);
				match(FPAREN);
				setState(55);
				match(NEWLINE);
				}
				break;
			case 5:
				_localctx = new AssignStrContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(57);
				match(ID);
				setState(58);
				match(EQ);
				setState(59);
				str_val(0);
				setState(60);
				match(NEWLINE);
				}
				break;
			case 6:
				_localctx = new AssignExprContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(62);
				match(ID);
				setState(63);
				match(EQ);
				setState(64);
				expr(0);
				setState(65);
				match(NEWLINE);
				}
				break;
			case 7:
				_localctx = new BlankContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(67);
				match(NEWLINE);
				}
				break;
			case 8:
				_localctx = new IfStatementContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(68);
				match(IF);
				setState(69);
				match(APAREN);
				setState(70);
				cond();
				setState(71);
				match(FPAREN);
				setState(72);
				match(ACHAVE);
				setState(74); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(73);
					stat();
					}
					}
					setState(76); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << PRINT) | (1L << WHILE) | (1L << FOR) | (1L << INT) | (1L << FLOAT) | (1L << CONST) | (1L << STRING) | (1L << ID) | (1L << NEWLINE))) != 0) );
				setState(78);
				match(FCHAVE);
				setState(79);
				match(NEWLINE);
				}
				break;
			case 9:
				_localctx = new IfElseStatementContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(81);
				match(IF);
				setState(82);
				match(APAREN);
				setState(83);
				cond();
				setState(84);
				match(FPAREN);
				setState(85);
				match(ACHAVE);
				setState(87); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(86);
					stat();
					}
					}
					setState(89); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << PRINT) | (1L << WHILE) | (1L << FOR) | (1L << INT) | (1L << FLOAT) | (1L << CONST) | (1L << STRING) | (1L << ID) | (1L << NEWLINE))) != 0) );
				setState(91);
				match(FCHAVE);
				setState(92);
				else_stat();
				setState(93);
				match(NEWLINE);
				}
				break;
			case 10:
				_localctx = new WhileStatementContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(95);
				match(WHILE);
				setState(96);
				match(APAREN);
				setState(97);
				cond();
				setState(98);
				match(FPAREN);
				setState(99);
				match(ACHAVE);
				setState(101); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(100);
					stat();
					}
					}
					setState(103); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << PRINT) | (1L << WHILE) | (1L << FOR) | (1L << INT) | (1L << FLOAT) | (1L << CONST) | (1L << STRING) | (1L << ID) | (1L << NEWLINE))) != 0) );
				setState(105);
				match(FCHAVE);
				setState(106);
				match(NEWLINE);
				}
				break;
			case 11:
				_localctx = new ForStatementContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(108);
				match(FOR);
				setState(109);
				match(APAREN);
				setState(110);
				match(ID);
				setState(111);
				match(EQ);
				setState(112);
				match(INTVAL);
				setState(113);
				match(PTVIG);
				setState(114);
				cond();
				setState(115);
				match(FPAREN);
				setState(116);
				match(ACHAVE);
				setState(118); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(117);
					stat();
					}
					}
					setState(120); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << PRINT) | (1L << WHILE) | (1L << FOR) | (1L << INT) | (1L << FLOAT) | (1L << CONST) | (1L << STRING) | (1L << ID) | (1L << NEWLINE))) != 0) );
				setState(122);
				match(FCHAVE);
				setState(123);
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
	}

	public final Else_statContext else_stat() throws RecognitionException {
		Else_statContext _localctx = new Else_statContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_else_stat);
		int _la;
		try {
			_localctx = new ElseStatContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(ELSE);
			setState(128);
			match(ACHAVE);
			setState(130); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(129);
				stat();
				}
				}
				setState(132); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << PRINT) | (1L << WHILE) | (1L << FOR) | (1L << INT) | (1L << FLOAT) | (1L << CONST) | (1L << STRING) | (1L << ID) | (1L << NEWLINE))) != 0) );
			setState(134);
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
	}
	public static class EvalContext extends ExprContext {
		public ValContext val() {
			return getRuleContext(ValContext.class,0);
		}
		public EvalContext(ExprContext ctx) { copyFrom(ctx); }
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
			setState(142);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
			case INTVAL:
			case FLOATVAL:
				{
				_localctx = new EvalContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(137);
				val();
				}
				break;
			case APAREN:
				{
				_localctx = new ParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(138);
				match(APAREN);
				setState(139);
				expr(0);
				setState(140);
				match(FPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(152);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(150);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(144);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(145);
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
						setState(146);
						expr(5);
						}
						break;
					case 2:
						{
						_localctx = new AddSubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(147);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(148);
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
						setState(149);
						expr(4);
						}
						break;
					}
					} 
				}
				setState(154);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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
	}
	public static class IntegerContext extends ValContext {
		public TerminalNode INTVAL() { return getToken(LabeledExprParser.INTVAL, 0); }
		public IntegerContext(ValContext ctx) { copyFrom(ctx); }
	}
	public static class FloatContext extends ValContext {
		public TerminalNode FLOATVAL() { return getToken(LabeledExprParser.FLOATVAL, 0); }
		public FloatContext(ValContext ctx) { copyFrom(ctx); }
	}

	public final ValContext val() throws RecognitionException {
		ValContext _localctx = new ValContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_val);
		try {
			setState(158);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new IdContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				match(ID);
				}
				break;
			case INTVAL:
				_localctx = new IntegerContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(156);
				match(INTVAL);
				}
				break;
			case FLOATVAL:
				_localctx = new FloatContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(157);
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
	}
	public static class ConcatStringContext extends Str_valContext {
		public List<Str_valContext> str_val() {
			return getRuleContexts(Str_valContext.class);
		}
		public Str_valContext str_val(int i) {
			return getRuleContext(Str_valContext.class,i);
		}
		public TerminalNode ADD() { return getToken(LabeledExprParser.ADD, 0); }
		public ConcatStringContext(Str_valContext ctx) { copyFrom(ctx); }
	}
	public static class EvalToStringContext extends Str_valContext {
		public ValContext val() {
			return getRuleContext(ValContext.class,0);
		}
		public EvalToStringContext(Str_valContext ctx) { copyFrom(ctx); }
	}

	public final Str_valContext str_val() throws RecognitionException {
		return str_val(0);
	}

	private Str_valContext str_val(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Str_valContext _localctx = new Str_valContext(_ctx, _parentState);
		Str_valContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_str_val, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRINGVAL:
				{
				_localctx = new StringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(161);
				match(STRINGVAL);
				}
				break;
			case ID:
			case INTVAL:
			case FLOATVAL:
				{
				_localctx = new EvalToStringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(162);
				val();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(170);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConcatStringContext(new Str_valContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_str_val);
					setState(165);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(166);
					match(ADD);
					setState(167);
					str_val(3);
					}
					} 
				}
				setState(172);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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
	}

	public final CondContext cond() throws RecognitionException {
		CondContext _localctx = new CondContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_cond);
		try {
			setState(181);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				_localctx = new EvalGreatContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				val();
				setState(174);
				match(GREAT);
				setState(175);
				val();
				}
				break;
			case 2:
				_localctx = new EvalLessContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(177);
				val();
				setState(178);
				match(LESS);
				setState(179);
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
		case 6:
			return str_val_sempred((Str_valContext)_localctx, predIndex);
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
	private boolean str_val_sempred(Str_valContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\36\u00ba\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\6\2\24\n"+
		"\2\r\2\16\2\25\3\3\3\3\3\3\3\4\3\4\3\4\7\4\36\n\4\f\4\16\4!\13\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\7\4)\n\4\f\4\16\4,\13\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\6\4M\n\4\r\4\16\4N\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\6\4Z\n\4\r\4\16\4[\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\6\4h\n\4\r\4\16\4i\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\6\4y\n\4\r\4\16\4z\3\4\3\4\3\4\5\4\u0080\n\4\3\5\3\5\3\5\6\5\u0085"+
		"\n\5\r\5\16\5\u0086\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0091\n\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\7\6\u0099\n\6\f\6\16\6\u009c\13\6\3\7\3\7\3\7\5\7"+
		"\u00a1\n\7\3\b\3\b\3\b\5\b\u00a6\n\b\3\b\3\b\3\b\7\b\u00ab\n\b\f\b\16"+
		"\b\u00ae\13\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00b8\n\t\3\t\2\4\n"+
		"\16\n\2\4\6\b\n\f\16\20\2\5\4\2\17\20\22\22\3\2\3\4\3\2\5\6\2\u00cb\2"+
		"\23\3\2\2\2\4\27\3\2\2\2\6\177\3\2\2\2\b\u0081\3\2\2\2\n\u0090\3\2\2\2"+
		"\f\u00a0\3\2\2\2\16\u00a5\3\2\2\2\20\u00b7\3\2\2\2\22\24\5\6\4\2\23\22"+
		"\3\2\2\2\24\25\3\2\2\2\25\23\3\2\2\2\25\26\3\2\2\2\26\3\3\2\2\2\27\30"+
		"\7\27\2\2\30\31\7\31\2\2\31\5\3\2\2\2\32\33\t\2\2\2\33\37\7\31\2\2\34"+
		"\36\5\4\3\2\35\34\3\2\2\2\36!\3\2\2\2\37\35\3\2\2\2\37 \3\2\2\2 \"\3\2"+
		"\2\2!\37\3\2\2\2\"#\7\30\2\2#\u0080\7\35\2\2$%\7\21\2\2%&\t\2\2\2&*\7"+
		"\31\2\2\')\5\4\3\2(\'\3\2\2\2),\3\2\2\2*(\3\2\2\2*+\3\2\2\2+-\3\2\2\2"+
		",*\3\2\2\2-.\7\30\2\2.\u0080\7\35\2\2/\60\7\f\2\2\60\61\7\25\2\2\61\62"+
		"\5\n\6\2\62\63\7\26\2\2\63\64\7\35\2\2\64\u0080\3\2\2\2\65\66\7\f\2\2"+
		"\66\67\7\25\2\2\678\5\16\b\289\7\26\2\29:\7\35\2\2:\u0080\3\2\2\2;<\7"+
		"\31\2\2<=\7\7\2\2=>\5\16\b\2>?\7\35\2\2?\u0080\3\2\2\2@A\7\31\2\2AB\7"+
		"\7\2\2BC\5\n\6\2CD\7\35\2\2D\u0080\3\2\2\2E\u0080\7\35\2\2FG\7\n\2\2G"+
		"H\7\25\2\2HI\5\20\t\2IJ\7\26\2\2JL\7\23\2\2KM\5\6\4\2LK\3\2\2\2MN\3\2"+
		"\2\2NL\3\2\2\2NO\3\2\2\2OP\3\2\2\2PQ\7\24\2\2QR\7\35\2\2R\u0080\3\2\2"+
		"\2ST\7\n\2\2TU\7\25\2\2UV\5\20\t\2VW\7\26\2\2WY\7\23\2\2XZ\5\6\4\2YX\3"+
		"\2\2\2Z[\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\]\3\2\2\2]^\7\24\2\2^_\5\b\5\2"+
		"_`\7\35\2\2`\u0080\3\2\2\2ab\7\r\2\2bc\7\25\2\2cd\5\20\t\2de\7\26\2\2"+
		"eg\7\23\2\2fh\5\6\4\2gf\3\2\2\2hi\3\2\2\2ig\3\2\2\2ij\3\2\2\2jk\3\2\2"+
		"\2kl\7\24\2\2lm\7\35\2\2m\u0080\3\2\2\2no\7\16\2\2op\7\25\2\2pq\7\31\2"+
		"\2qr\7\7\2\2rs\7\32\2\2st\7\30\2\2tu\5\20\t\2uv\7\26\2\2vx\7\23\2\2wy"+
		"\5\6\4\2xw\3\2\2\2yz\3\2\2\2zx\3\2\2\2z{\3\2\2\2{|\3\2\2\2|}\7\24\2\2"+
		"}~\7\35\2\2~\u0080\3\2\2\2\177\32\3\2\2\2\177$\3\2\2\2\177/\3\2\2\2\177"+
		"\65\3\2\2\2\177;\3\2\2\2\177@\3\2\2\2\177E\3\2\2\2\177F\3\2\2\2\177S\3"+
		"\2\2\2\177a\3\2\2\2\177n\3\2\2\2\u0080\7\3\2\2\2\u0081\u0082\7\13\2\2"+
		"\u0082\u0084\7\23\2\2\u0083\u0085\5\6\4\2\u0084\u0083\3\2\2\2\u0085\u0086"+
		"\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0088\3\2\2\2\u0088"+
		"\u0089\7\24\2\2\u0089\t\3\2\2\2\u008a\u008b\b\6\1\2\u008b\u0091\5\f\7"+
		"\2\u008c\u008d\7\25\2\2\u008d\u008e\5\n\6\2\u008e\u008f\7\26\2\2\u008f"+
		"\u0091\3\2\2\2\u0090\u008a\3\2\2\2\u0090\u008c\3\2\2\2\u0091\u009a\3\2"+
		"\2\2\u0092\u0093\f\6\2\2\u0093\u0094\t\3\2\2\u0094\u0099\5\n\6\7\u0095"+
		"\u0096\f\5\2\2\u0096\u0097\t\4\2\2\u0097\u0099\5\n\6\6\u0098\u0092\3\2"+
		"\2\2\u0098\u0095\3\2\2\2\u0099\u009c\3\2\2\2\u009a\u0098\3\2\2\2\u009a"+
		"\u009b\3\2\2\2\u009b\13\3\2\2\2\u009c\u009a\3\2\2\2\u009d\u00a1\7\31\2"+
		"\2\u009e\u00a1\7\32\2\2\u009f\u00a1\7\33\2\2\u00a0\u009d\3\2\2\2\u00a0"+
		"\u009e\3\2\2\2\u00a0\u009f\3\2\2\2\u00a1\r\3\2\2\2\u00a2\u00a3\b\b\1\2"+
		"\u00a3\u00a6\7\34\2\2\u00a4\u00a6\5\f\7\2\u00a5\u00a2\3\2\2\2\u00a5\u00a4"+
		"\3\2\2\2\u00a6\u00ac\3\2\2\2\u00a7\u00a8\f\4\2\2\u00a8\u00a9\7\5\2\2\u00a9"+
		"\u00ab\5\16\b\5\u00aa\u00a7\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac\u00aa\3"+
		"\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\17\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af"+
		"\u00b0\5\f\7\2\u00b0\u00b1\7\b\2\2\u00b1\u00b2\5\f\7\2\u00b2\u00b8\3\2"+
		"\2\2\u00b3\u00b4\5\f\7\2\u00b4\u00b5\7\t\2\2\u00b5\u00b6\5\f\7\2\u00b6"+
		"\u00b8\3\2\2\2\u00b7\u00af\3\2\2\2\u00b7\u00b3\3\2\2\2\u00b8\21\3\2\2"+
		"\2\22\25\37*N[iz\177\u0086\u0090\u0098\u009a\u00a0\u00a5\u00ac\u00b7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}