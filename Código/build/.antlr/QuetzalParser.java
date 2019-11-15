// Generated from c:\Users\alexg\Desktop\Proyecto Final Web\Queztal-Copiler\Código\build\Quetzal.g4 by ANTLR 4.7.1

from build.intermediateCode import *

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class QuetzalParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TK_PROGRAM=1, TK_FUNC=2, TK_DEFINE=3, TK_RETURN=4, TK_IF=5, TK_ELSE=6, 
		TK_WHILE=7, TK_PRINT=8, TK_READ=9, TK_MAIN=10, TK_VOID=11, TK_OPENIMG=12, 
		TK_SAVEIMG=13, TK_GRAYSCALE=14, TK_COLOR_REPLACE=15, TK_COLOR_FILTER=16, 
		TK_EDGE_DETECTION=17, TK_SCALE_IMAGE=18, TK_GET_COLOR_PALETTE=19, TK_COLOR_MATCH_IMAGE=20, 
		TK_ENCODE_STEGANOGRAPHY=21, TK_DECODE_STEGANOGRAPHY=22, TK_GET_IMAGE_HEIGHT=23, 
		TK_GET_IMAGE_WIDTH=24, TK_BOOL=25, TK_INT=26, TK_FLOAT=27, TK_COLOR=28, 
		CTE_COLOR=29, TK_WHITE=30, TK_RED=31, TK_LIME=32, TK_BLUE=33, TK_SILVER=34, 
		TK_MAROON=35, TK_GREEN=36, TK_NAVY=37, TK_GRAY=38, TK_YELLOW=39, TK_AQUA=40, 
		TK_FUCHSIA=41, TK_BLACK=42, TK_OLIVE=43, TK_TEAL=44, TK_PURPLE=45, SYM_SEMI_COL=46, 
		SYM_DOUB_COL=47, SYM_COMMA=48, SYM_UNDER_SCORE=49, SYM_CURLY_BRACK_OPEN=50, 
		SYM_CURLY_BRACK_CLOSE=51, SYM_SQUARE_BRACK_OPEN=52, SYM_SQUARE_BRACK_CLOSE=53, 
		SYM_PAREN_OPEN=54, SYM_PAREN_CLOSE=55, SYM_ASSIGN=56, SYM_EQUAL=57, SYM_GRE_THAN=58, 
		SYM_LOW_THAN=59, SYM_NOT_EQUAL=60, SYM_GRE_EQ=61, SYM_LOW_EQ=62, SYM_OR=63, 
		SYM_AND=64, SYM_QUOT=65, SYM_PLUS=66, SYM_MINUS=67, SYM_MULT=68, SYM_DIV=69, 
		TYPE_FLOAT=70, TYPE_INT=71, TYPE_ID=72, TYPE_COLOR=73, CTE_TAG=74, TYPE_BOOL=75, 
		NEWLINE=76, WS=77, BLOCK_COMMENT=78, LINE_COMMENT=79;
	public static final int
		RULE_program = 0, RULE_main = 1, RULE_variables = 2, RULE_function = 3, 
		RULE_block = 4, RULE_types = 5, RULE_constants = 6, RULE_prints = 7, RULE_read = 8, 
		RULE_statute = 9, RULE_assignation = 10, RULE_condition = 11, RULE_var_cte = 12, 
		RULE_expression = 13, RULE_expLogic = 14, RULE_exp = 15, RULE_term = 16, 
		RULE_factor = 17, RULE_logic_op = 18, RULE_returning = 19, RULE_callfunc = 20, 
		RULE_loop = 21, RULE_openimg = 22, RULE_saveimg = 23, RULE_color_replace = 24, 
		RULE_grayscale = 25, RULE_color_filter = 26, RULE_edgeDetection = 27, 
		RULE_scaleImg = 28, RULE_getColorPalette = 29, RULE_colorMatchImage = 30, 
		RULE_encodeSteganography = 31, RULE_decodeSteganography = 32, RULE_getImageHeight = 33, 
		RULE_getImageWidth = 34, RULE_specfunct = 35;
	public static final String[] ruleNames = {
		"program", "main", "variables", "function", "block", "types", "constants", 
		"prints", "read", "statute", "assignation", "condition", "var_cte", "expression", 
		"expLogic", "exp", "term", "factor", "logic_op", "returning", "callfunc", 
		"loop", "openimg", "saveimg", "color_replace", "grayscale", "color_filter", 
		"edgeDetection", "scaleImg", "getColorPalette", "colorMatchImage", "encodeSteganography", 
		"decodeSteganography", "getImageHeight", "getImageWidth", "specfunct"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'program'", "'func'", "'define'", "'return'", "'if'", "'else'", 
		"'while'", "'print'", "'read'", "'main'", "'void'", "'openImg'", "'saveImg'", 
		"'grayscale'", "'color_replace'", "'color_filter'", "'edgeDetection'", 
		"'scaleImg'", "'getColorPalette'", "'colorMatchImage'", "'encodeSteganography'", 
		"'decodeSteganography'", "'getImageHeight'", "'getImageWidth'", "'bool'", 
		"'int'", "'float'", "'color'", null, "'White'", "'Red'", "'Lime'", "'Blue'", 
		"'Silver'", "'Maroon'", "'Green'", "'Navy'", "'Gray'", "'Yellow'", "'Aqua'", 
		"'Fuchsia'", "'Black'", "'Olive'", "'Teal'", "'Purple'", "';'", "':'", 
		"','", "'_'", "'{'", "'}'", "'['", "']'", "'('", "')'", "'='", "'=='", 
		"'>'", "'<'", "'!='", "'>='", "'<='", "'||'", "'&&'", "'\"'", "'+'", "'-'", 
		"'*'", "'/'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "TK_PROGRAM", "TK_FUNC", "TK_DEFINE", "TK_RETURN", "TK_IF", "TK_ELSE", 
		"TK_WHILE", "TK_PRINT", "TK_READ", "TK_MAIN", "TK_VOID", "TK_OPENIMG", 
		"TK_SAVEIMG", "TK_GRAYSCALE", "TK_COLOR_REPLACE", "TK_COLOR_FILTER", "TK_EDGE_DETECTION", 
		"TK_SCALE_IMAGE", "TK_GET_COLOR_PALETTE", "TK_COLOR_MATCH_IMAGE", "TK_ENCODE_STEGANOGRAPHY", 
		"TK_DECODE_STEGANOGRAPHY", "TK_GET_IMAGE_HEIGHT", "TK_GET_IMAGE_WIDTH", 
		"TK_BOOL", "TK_INT", "TK_FLOAT", "TK_COLOR", "CTE_COLOR", "TK_WHITE", 
		"TK_RED", "TK_LIME", "TK_BLUE", "TK_SILVER", "TK_MAROON", "TK_GREEN", 
		"TK_NAVY", "TK_GRAY", "TK_YELLOW", "TK_AQUA", "TK_FUCHSIA", "TK_BLACK", 
		"TK_OLIVE", "TK_TEAL", "TK_PURPLE", "SYM_SEMI_COL", "SYM_DOUB_COL", "SYM_COMMA", 
		"SYM_UNDER_SCORE", "SYM_CURLY_BRACK_OPEN", "SYM_CURLY_BRACK_CLOSE", "SYM_SQUARE_BRACK_OPEN", 
		"SYM_SQUARE_BRACK_CLOSE", "SYM_PAREN_OPEN", "SYM_PAREN_CLOSE", "SYM_ASSIGN", 
		"SYM_EQUAL", "SYM_GRE_THAN", "SYM_LOW_THAN", "SYM_NOT_EQUAL", "SYM_GRE_EQ", 
		"SYM_LOW_EQ", "SYM_OR", "SYM_AND", "SYM_QUOT", "SYM_PLUS", "SYM_MINUS", 
		"SYM_MULT", "SYM_DIV", "TYPE_FLOAT", "TYPE_INT", "TYPE_ID", "TYPE_COLOR", 
		"CTE_TAG", "TYPE_BOOL", "NEWLINE", "WS", "BLOCK_COMMENT", "LINE_COMMENT"
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
	public String getGrammarFileName() { return "Quetzal.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public QuetzalParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public List<VariablesContext> variables() {
			return getRuleContexts(VariablesContext.class);
		}
		public VariablesContext variables(int i) {
			return getRuleContext(VariablesContext.class,i);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			stack.initProgram()
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_DEFINE) {
				{
				{
				setState(73);
				variables();
				}
				}
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(82);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(79);
					function();
					}
					} 
				}
				setState(84);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(85);
			main();
			stack.printQuads()
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

	public static class MainContext extends ParserRuleContext {
		public TerminalNode TK_FUNC() { return getToken(QuetzalParser.TK_FUNC, 0); }
		public TerminalNode TK_MAIN() { return getToken(QuetzalParser.TK_MAIN, 0); }
		public TerminalNode SYM_PAREN_OPEN() { return getToken(QuetzalParser.SYM_PAREN_OPEN, 0); }
		public TerminalNode SYM_PAREN_CLOSE() { return getToken(QuetzalParser.SYM_PAREN_CLOSE, 0); }
		public TerminalNode SYM_CURLY_BRACK_OPEN() { return getToken(QuetzalParser.SYM_CURLY_BRACK_OPEN, 0); }
		public TerminalNode SYM_CURLY_BRACK_CLOSE() { return getToken(QuetzalParser.SYM_CURLY_BRACK_CLOSE, 0); }
		public List<VariablesContext> variables() {
			return getRuleContexts(VariablesContext.class);
		}
		public VariablesContext variables(int i) {
			return getRuleContext(VariablesContext.class,i);
		}
		public List<StatuteContext> statute() {
			return getRuleContexts(StatuteContext.class);
		}
		public StatuteContext statute(int i) {
			return getRuleContext(StatuteContext.class,i);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_main);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			stack.fill(stack.Saltos.pop(),stack.QuadCounter)
			setState(89);
			match(TK_FUNC);
			namesTable.addFunction("main","void",stack.QuadCounter)
			setState(91);
			match(TK_MAIN);
			stack.enterFunc()
			setState(93);
			match(SYM_PAREN_OPEN);
			setState(94);
			match(SYM_PAREN_CLOSE);
			setState(95);
			match(SYM_CURLY_BRACK_OPEN);
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_DEFINE) {
				{
				{
				setState(96);
				variables();
				}
				}
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_RETURN) | (1L << TK_IF) | (1L << TK_WHILE) | (1L << TK_PRINT) | (1L << TK_READ) | (1L << TK_OPENIMG) | (1L << TK_SAVEIMG) | (1L << TK_GRAYSCALE) | (1L << TK_COLOR_REPLACE) | (1L << TK_EDGE_DETECTION) | (1L << TK_SCALE_IMAGE) | (1L << TK_GET_COLOR_PALETTE) | (1L << TK_COLOR_MATCH_IMAGE) | (1L << TK_ENCODE_STEGANOGRAPHY) | (1L << TK_DECODE_STEGANOGRAPHY) | (1L << TK_GET_IMAGE_HEIGHT) | (1L << TK_GET_IMAGE_WIDTH))) != 0) || _la==TYPE_ID) {
				{
				{
				setState(102);
				statute();
				}
				}
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(108);
			match(SYM_CURLY_BRACK_CLOSE);
			stack.exitMain()
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

	public static class VariablesContext extends ParserRuleContext {
		public TypesContext types;
		public Token TYPE_ID;
		public TerminalNode TK_DEFINE() { return getToken(QuetzalParser.TK_DEFINE, 0); }
		public TypesContext types() {
			return getRuleContext(TypesContext.class,0);
		}
		public List<TerminalNode> TYPE_ID() { return getTokens(QuetzalParser.TYPE_ID); }
		public TerminalNode TYPE_ID(int i) {
			return getToken(QuetzalParser.TYPE_ID, i);
		}
		public TerminalNode SYM_SEMI_COL() { return getToken(QuetzalParser.SYM_SEMI_COL, 0); }
		public List<TerminalNode> SYM_ASSIGN() { return getTokens(QuetzalParser.SYM_ASSIGN); }
		public TerminalNode SYM_ASSIGN(int i) {
			return getToken(QuetzalParser.SYM_ASSIGN, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> SYM_COMMA() { return getTokens(QuetzalParser.SYM_COMMA); }
		public TerminalNode SYM_COMMA(int i) {
			return getToken(QuetzalParser.SYM_COMMA, i);
		}
		public VariablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variables; }
	}

	public final VariablesContext variables() throws RecognitionException {
		VariablesContext _localctx = new VariablesContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_variables);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(TK_DEFINE);
			setState(112);
			((VariablesContext)_localctx).types = types();
			setState(113);
			((VariablesContext)_localctx).TYPE_ID = match(TYPE_ID);
			namesTable.addVar((((VariablesContext)_localctx).TYPE_ID!=null?((VariablesContext)_localctx).TYPE_ID.getText():null),(((VariablesContext)_localctx).types!=null?_input.getText(((VariablesContext)_localctx).types.start,((VariablesContext)_localctx).types.stop):null))
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SYM_ASSIGN) {
				{
				stack.addOperand((((VariablesContext)_localctx).TYPE_ID!=null?((VariablesContext)_localctx).TYPE_ID.getText():null))
				setState(116);
				match(SYM_ASSIGN);
				stack.addOp('=')
				setState(118);
				expression();
				stack.exitAssign()
				}
			}

			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SYM_COMMA) {
				{
				{
				setState(123);
				match(SYM_COMMA);
				setState(124);
				((VariablesContext)_localctx).TYPE_ID = match(TYPE_ID);
				namesTable.addVar((((VariablesContext)_localctx).TYPE_ID!=null?((VariablesContext)_localctx).TYPE_ID.getText():null),(((VariablesContext)_localctx).types!=null?_input.getText(((VariablesContext)_localctx).types.start,((VariablesContext)_localctx).types.stop):null))
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SYM_ASSIGN) {
					{
					stack.addOperand((((VariablesContext)_localctx).TYPE_ID!=null?((VariablesContext)_localctx).TYPE_ID.getText():null))
					setState(127);
					match(SYM_ASSIGN);
					stack.addOp('=')
					setState(129);
					expression();
					stack.exitAssign()
					}
				}

				}
				}
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(139);
			match(SYM_SEMI_COL);
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

	public static class FunctionContext extends ParserRuleContext {
		public TypesContext types;
		public Token TYPE_ID;
		public Token TK_VOID;
		public TerminalNode TK_FUNC() { return getToken(QuetzalParser.TK_FUNC, 0); }
		public TerminalNode SYM_PAREN_OPEN() { return getToken(QuetzalParser.SYM_PAREN_OPEN, 0); }
		public TerminalNode SYM_PAREN_CLOSE() { return getToken(QuetzalParser.SYM_PAREN_CLOSE, 0); }
		public TerminalNode SYM_CURLY_BRACK_OPEN() { return getToken(QuetzalParser.SYM_CURLY_BRACK_OPEN, 0); }
		public TerminalNode SYM_CURLY_BRACK_CLOSE() { return getToken(QuetzalParser.SYM_CURLY_BRACK_CLOSE, 0); }
		public List<TypesContext> types() {
			return getRuleContexts(TypesContext.class);
		}
		public TypesContext types(int i) {
			return getRuleContext(TypesContext.class,i);
		}
		public List<TerminalNode> TYPE_ID() { return getTokens(QuetzalParser.TYPE_ID); }
		public TerminalNode TYPE_ID(int i) {
			return getToken(QuetzalParser.TYPE_ID, i);
		}
		public TerminalNode TK_VOID() { return getToken(QuetzalParser.TK_VOID, 0); }
		public VariablesContext variables() {
			return getRuleContext(VariablesContext.class,0);
		}
		public List<StatuteContext> statute() {
			return getRuleContexts(StatuteContext.class);
		}
		public StatuteContext statute(int i) {
			return getRuleContext(StatuteContext.class,i);
		}
		public List<TerminalNode> SYM_COMMA() { return getTokens(QuetzalParser.SYM_COMMA); }
		public TerminalNode SYM_COMMA(int i) {
			return getToken(QuetzalParser.SYM_COMMA, i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(TK_FUNC);
			stack.enterFunc()
			setState(150);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_BOOL:
			case TK_INT:
			case TK_FLOAT:
			case TK_COLOR:
				{
				setState(143);
				((FunctionContext)_localctx).types = types();
				setState(144);
				((FunctionContext)_localctx).TYPE_ID = match(TYPE_ID);
				namesTable.addFunction((((FunctionContext)_localctx).TYPE_ID!=null?((FunctionContext)_localctx).TYPE_ID.getText():null),(((FunctionContext)_localctx).types!=null?_input.getText(((FunctionContext)_localctx).types.start,((FunctionContext)_localctx).types.stop):null),stack.QuadCounter)
				}
				break;
			case TK_VOID:
				{
				setState(147);
				((FunctionContext)_localctx).TK_VOID = match(TK_VOID);
				setState(148);
				((FunctionContext)_localctx).TYPE_ID = match(TYPE_ID);
				namesTable.addFunction((((FunctionContext)_localctx).TYPE_ID!=null?((FunctionContext)_localctx).TYPE_ID.getText():null),(((FunctionContext)_localctx).TK_VOID!=null?((FunctionContext)_localctx).TK_VOID.getText():null),stack.QuadCounter)
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(152);
			match(SYM_PAREN_OPEN);
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_BOOL) | (1L << TK_INT) | (1L << TK_FLOAT) | (1L << TK_COLOR))) != 0)) {
				{
				setState(153);
				((FunctionContext)_localctx).types = types();
				setState(154);
				((FunctionContext)_localctx).TYPE_ID = match(TYPE_ID);
				namesTable.addParameter((((FunctionContext)_localctx).TYPE_ID!=null?((FunctionContext)_localctx).TYPE_ID.getText():null),(((FunctionContext)_localctx).types!=null?_input.getText(((FunctionContext)_localctx).types.start,((FunctionContext)_localctx).types.stop):null))
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SYM_COMMA) {
					{
					{
					setState(156);
					match(SYM_COMMA);
					setState(157);
					((FunctionContext)_localctx).types = types();
					setState(158);
					((FunctionContext)_localctx).TYPE_ID = match(TYPE_ID);
					namesTable.addParameter((((FunctionContext)_localctx).TYPE_ID!=null?((FunctionContext)_localctx).TYPE_ID.getText():null),(((FunctionContext)_localctx).types!=null?_input.getText(((FunctionContext)_localctx).types.start,((FunctionContext)_localctx).types.stop):null))
					}
					}
					setState(165);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(168);
			match(SYM_PAREN_CLOSE);
			namesTable.exitParams()
			setState(170);
			match(SYM_CURLY_BRACK_OPEN);
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_DEFINE) {
				{
				setState(171);
				variables();
				}
			}

			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_RETURN) | (1L << TK_IF) | (1L << TK_WHILE) | (1L << TK_PRINT) | (1L << TK_READ) | (1L << TK_OPENIMG) | (1L << TK_SAVEIMG) | (1L << TK_GRAYSCALE) | (1L << TK_COLOR_REPLACE) | (1L << TK_EDGE_DETECTION) | (1L << TK_SCALE_IMAGE) | (1L << TK_GET_COLOR_PALETTE) | (1L << TK_COLOR_MATCH_IMAGE) | (1L << TK_ENCODE_STEGANOGRAPHY) | (1L << TK_DECODE_STEGANOGRAPHY) | (1L << TK_GET_IMAGE_HEIGHT) | (1L << TK_GET_IMAGE_WIDTH))) != 0) || _la==TYPE_ID) {
				{
				{
				setState(174);
				statute();
				}
				}
				setState(179);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(180);
			match(SYM_CURLY_BRACK_CLOSE);
			stack.exitFunc()
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode SYM_CURLY_BRACK_OPEN() { return getToken(QuetzalParser.SYM_CURLY_BRACK_OPEN, 0); }
		public TerminalNode SYM_CURLY_BRACK_CLOSE() { return getToken(QuetzalParser.SYM_CURLY_BRACK_CLOSE, 0); }
		public VariablesContext variables() {
			return getRuleContext(VariablesContext.class,0);
		}
		public List<StatuteContext> statute() {
			return getRuleContexts(StatuteContext.class);
		}
		public StatuteContext statute(int i) {
			return getRuleContext(StatuteContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(SYM_CURLY_BRACK_OPEN);
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_DEFINE) {
				{
				setState(184);
				variables();
				}
			}

			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_RETURN) | (1L << TK_IF) | (1L << TK_WHILE) | (1L << TK_PRINT) | (1L << TK_READ) | (1L << TK_OPENIMG) | (1L << TK_SAVEIMG) | (1L << TK_GRAYSCALE) | (1L << TK_COLOR_REPLACE) | (1L << TK_EDGE_DETECTION) | (1L << TK_SCALE_IMAGE) | (1L << TK_GET_COLOR_PALETTE) | (1L << TK_COLOR_MATCH_IMAGE) | (1L << TK_ENCODE_STEGANOGRAPHY) | (1L << TK_DECODE_STEGANOGRAPHY) | (1L << TK_GET_IMAGE_HEIGHT) | (1L << TK_GET_IMAGE_WIDTH))) != 0) || _la==TYPE_ID) {
				{
				{
				setState(187);
				statute();
				}
				}
				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(193);
			match(SYM_CURLY_BRACK_CLOSE);
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

	public static class TypesContext extends ParserRuleContext {
		public TerminalNode TK_INT() { return getToken(QuetzalParser.TK_INT, 0); }
		public TerminalNode TK_FLOAT() { return getToken(QuetzalParser.TK_FLOAT, 0); }
		public TerminalNode TK_COLOR() { return getToken(QuetzalParser.TK_COLOR, 0); }
		public TerminalNode TK_BOOL() { return getToken(QuetzalParser.TK_BOOL, 0); }
		public List<TerminalNode> SYM_SQUARE_BRACK_OPEN() { return getTokens(QuetzalParser.SYM_SQUARE_BRACK_OPEN); }
		public TerminalNode SYM_SQUARE_BRACK_OPEN(int i) {
			return getToken(QuetzalParser.SYM_SQUARE_BRACK_OPEN, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> SYM_SQUARE_BRACK_CLOSE() { return getTokens(QuetzalParser.SYM_SQUARE_BRACK_CLOSE); }
		public TerminalNode SYM_SQUARE_BRACK_CLOSE(int i) {
			return getToken(QuetzalParser.SYM_SQUARE_BRACK_CLOSE, i);
		}
		public TypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_types; }
	}

	public final TypesContext types() throws RecognitionException {
		TypesContext _localctx = new TypesContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_types);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_BOOL) | (1L << TK_INT) | (1L << TK_FLOAT) | (1L << TK_COLOR))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SYM_SQUARE_BRACK_OPEN) {
				{
				{
				setState(196);
				match(SYM_SQUARE_BRACK_OPEN);
				setState(197);
				expression();
				setState(198);
				match(SYM_SQUARE_BRACK_CLOSE);
				}
				}
				setState(204);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ConstantsContext extends ParserRuleContext {
		public TerminalNode TYPE_INT() { return getToken(QuetzalParser.TYPE_INT, 0); }
		public TerminalNode TYPE_FLOAT() { return getToken(QuetzalParser.TYPE_FLOAT, 0); }
		public TerminalNode CTE_TAG() { return getToken(QuetzalParser.CTE_TAG, 0); }
		public TerminalNode TYPE_BOOL() { return getToken(QuetzalParser.TYPE_BOOL, 0); }
		public TerminalNode TYPE_COLOR() { return getToken(QuetzalParser.TYPE_COLOR, 0); }
		public ConstantsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constants; }
	}

	public final ConstantsContext constants() throws RecognitionException {
		ConstantsContext _localctx = new ConstantsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_constants);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPE_INT:
				{
				setState(205);
				match(TYPE_INT);
				stack.addType("int")
				}
				break;
			case TYPE_FLOAT:
				{
				setState(207);
				match(TYPE_FLOAT);
				stack.addType("float")
				}
				break;
			case CTE_TAG:
				{
				setState(209);
				match(CTE_TAG);
				stack.addType("tag")
				}
				break;
			case TYPE_BOOL:
				{
				setState(211);
				match(TYPE_BOOL);
				stack.addType("bool")
				}
				break;
			case TYPE_COLOR:
				{
				setState(213);
				match(TYPE_COLOR);
				stack.addType("color")
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

	public static class PrintsContext extends ParserRuleContext {
		public TerminalNode TK_PRINT() { return getToken(QuetzalParser.TK_PRINT, 0); }
		public TerminalNode SYM_PAREN_OPEN() { return getToken(QuetzalParser.SYM_PAREN_OPEN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode SYM_PAREN_CLOSE() { return getToken(QuetzalParser.SYM_PAREN_CLOSE, 0); }
		public TerminalNode SYM_SEMI_COL() { return getToken(QuetzalParser.SYM_SEMI_COL, 0); }
		public List<TerminalNode> SYM_COMMA() { return getTokens(QuetzalParser.SYM_COMMA); }
		public TerminalNode SYM_COMMA(int i) {
			return getToken(QuetzalParser.SYM_COMMA, i);
		}
		public PrintsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prints; }
	}

	public final PrintsContext prints() throws RecognitionException {
		PrintsContext _localctx = new PrintsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_prints);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(TK_PRINT);
			setState(218);
			match(SYM_PAREN_OPEN);
			stack.addOp('(')
			setState(220);
			expression();
			stack.generatePrint()
			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SYM_COMMA) {
				{
				{
				setState(222);
				match(SYM_COMMA);
				setState(223);
				expression();
				stack.generatePrint()
				}
				}
				setState(230);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(231);
			match(SYM_PAREN_CLOSE);
			stack.removeP()
			setState(233);
			match(SYM_SEMI_COL);
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

	public static class ReadContext extends ParserRuleContext {
		public Token TYPE_ID;
		public TerminalNode TK_READ() { return getToken(QuetzalParser.TK_READ, 0); }
		public TerminalNode SYM_PAREN_OPEN() { return getToken(QuetzalParser.SYM_PAREN_OPEN, 0); }
		public TerminalNode TYPE_ID() { return getToken(QuetzalParser.TYPE_ID, 0); }
		public TerminalNode SYM_PAREN_CLOSE() { return getToken(QuetzalParser.SYM_PAREN_CLOSE, 0); }
		public TerminalNode SYM_SEMI_COL() { return getToken(QuetzalParser.SYM_SEMI_COL, 0); }
		public List<TerminalNode> SYM_SQUARE_BRACK_OPEN() { return getTokens(QuetzalParser.SYM_SQUARE_BRACK_OPEN); }
		public TerminalNode SYM_SQUARE_BRACK_OPEN(int i) {
			return getToken(QuetzalParser.SYM_SQUARE_BRACK_OPEN, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> SYM_SQUARE_BRACK_CLOSE() { return getTokens(QuetzalParser.SYM_SQUARE_BRACK_CLOSE); }
		public TerminalNode SYM_SQUARE_BRACK_CLOSE(int i) {
			return getToken(QuetzalParser.SYM_SQUARE_BRACK_CLOSE, i);
		}
		public ReadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read; }
	}

	public final ReadContext read() throws RecognitionException {
		ReadContext _localctx = new ReadContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_read);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			match(TK_READ);
			setState(236);
			match(SYM_PAREN_OPEN);
			setState(237);
			((ReadContext)_localctx).TYPE_ID = match(TYPE_ID);
			stack.addOperand((((ReadContext)_localctx).TYPE_ID!=null?((ReadContext)_localctx).TYPE_ID.getText():null))
			setState(251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SYM_SQUARE_BRACK_OPEN) {
				{
				setState(239);
				match(SYM_SQUARE_BRACK_OPEN);
				setState(240);
				expression();
				setState(241);
				match(SYM_SQUARE_BRACK_CLOSE);
				setState(248);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SYM_SQUARE_BRACK_OPEN) {
					{
					{
					setState(242);
					match(SYM_SQUARE_BRACK_OPEN);
					setState(243);
					expression();
					setState(244);
					match(SYM_SQUARE_BRACK_CLOSE);
					}
					}
					setState(250);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(253);
			match(SYM_PAREN_CLOSE);
			stack.generateRead()
			setState(255);
			match(SYM_SEMI_COL);
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

	public static class StatuteContext extends ParserRuleContext {
		public ReturningContext returning() {
			return getRuleContext(ReturningContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public PrintsContext prints() {
			return getRuleContext(PrintsContext.class,0);
		}
		public ReadContext read() {
			return getRuleContext(ReadContext.class,0);
		}
		public CallfuncContext callfunc() {
			return getRuleContext(CallfuncContext.class,0);
		}
		public SpecfunctContext specfunct() {
			return getRuleContext(SpecfunctContext.class,0);
		}
		public AssignationContext assignation() {
			return getRuleContext(AssignationContext.class,0);
		}
		public StatuteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statute; }
	}

	public final StatuteContext statute() throws RecognitionException {
		StatuteContext _localctx = new StatuteContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_statute);
		try {
			setState(265);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(257);
				returning();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(258);
				condition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(259);
				loop();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(260);
				prints();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(261);
				read();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(262);
				callfunc();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(263);
				specfunct();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(264);
				assignation();
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

	public static class AssignationContext extends ParserRuleContext {
		public TerminalNode TYPE_ID() { return getToken(QuetzalParser.TYPE_ID, 0); }
		public TerminalNode SYM_ASSIGN() { return getToken(QuetzalParser.SYM_ASSIGN, 0); }
		public SpecfunctContext specfunct() {
			return getRuleContext(SpecfunctContext.class,0);
		}
		public List<TerminalNode> SYM_SQUARE_BRACK_OPEN() { return getTokens(QuetzalParser.SYM_SQUARE_BRACK_OPEN); }
		public TerminalNode SYM_SQUARE_BRACK_OPEN(int i) {
			return getToken(QuetzalParser.SYM_SQUARE_BRACK_OPEN, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> SYM_SQUARE_BRACK_CLOSE() { return getTokens(QuetzalParser.SYM_SQUARE_BRACK_CLOSE); }
		public TerminalNode SYM_SQUARE_BRACK_CLOSE(int i) {
			return getToken(QuetzalParser.SYM_SQUARE_BRACK_CLOSE, i);
		}
		public TerminalNode SYM_SEMI_COL() { return getToken(QuetzalParser.SYM_SEMI_COL, 0); }
		public AssignationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignation; }
	}

	public final AssignationContext assignation() throws RecognitionException {
		AssignationContext _localctx = new AssignationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_assignation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(TYPE_ID);
			stack.addOperand(_input.getText(_localctx.start, _input.LT(-1)))
			setState(275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SYM_SQUARE_BRACK_OPEN) {
				{
				{
				setState(269);
				match(SYM_SQUARE_BRACK_OPEN);
				setState(270);
				expression();
				setState(271);
				match(SYM_SQUARE_BRACK_CLOSE);
				}
				}
				setState(277);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(278);
			match(SYM_ASSIGN);
			stack.addOp('=')
			setState(284);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_OPENIMG:
			case TK_SAVEIMG:
			case TK_GRAYSCALE:
			case TK_COLOR_REPLACE:
			case TK_EDGE_DETECTION:
			case TK_SCALE_IMAGE:
			case TK_GET_COLOR_PALETTE:
			case TK_COLOR_MATCH_IMAGE:
			case TK_ENCODE_STEGANOGRAPHY:
			case TK_DECODE_STEGANOGRAPHY:
			case TK_GET_IMAGE_HEIGHT:
			case TK_GET_IMAGE_WIDTH:
				{
				setState(280);
				specfunct();
				}
				break;
			case SYM_PAREN_OPEN:
			case SYM_PLUS:
			case SYM_MINUS:
			case TYPE_FLOAT:
			case TYPE_INT:
			case TYPE_ID:
			case TYPE_COLOR:
			case CTE_TAG:
			case TYPE_BOOL:
				{
				{
				setState(281);
				expression();
				setState(282);
				match(SYM_SEMI_COL);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			stack.exitAssign()
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

	public static class ConditionContext extends ParserRuleContext {
		public TerminalNode TK_IF() { return getToken(QuetzalParser.TK_IF, 0); }
		public TerminalNode SYM_PAREN_OPEN() { return getToken(QuetzalParser.SYM_PAREN_OPEN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SYM_PAREN_CLOSE() { return getToken(QuetzalParser.SYM_PAREN_CLOSE, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode TK_ELSE() { return getToken(QuetzalParser.TK_ELSE, 0); }
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			match(TK_IF);
			setState(289);
			match(SYM_PAREN_OPEN);
			stack.addOp('(')
			setState(291);
			expression();
			setState(292);
			match(SYM_PAREN_CLOSE);
			stack.removeP()
			stack.enterCondition()
			setState(294);
			block();
			setState(298);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_ELSE) {
				{
				setState(295);
				match(TK_ELSE);
				stack.enterElse()
				setState(297);
				block();
				}
			}

			stack.exitCondition()
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

	public static class Var_cteContext extends ParserRuleContext {
		public ConstantsContext constants() {
			return getRuleContext(ConstantsContext.class,0);
		}
		public TerminalNode TYPE_ID() { return getToken(QuetzalParser.TYPE_ID, 0); }
		public List<TerminalNode> SYM_SQUARE_BRACK_OPEN() { return getTokens(QuetzalParser.SYM_SQUARE_BRACK_OPEN); }
		public TerminalNode SYM_SQUARE_BRACK_OPEN(int i) {
			return getToken(QuetzalParser.SYM_SQUARE_BRACK_OPEN, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> SYM_SQUARE_BRACK_CLOSE() { return getTokens(QuetzalParser.SYM_SQUARE_BRACK_CLOSE); }
		public TerminalNode SYM_SQUARE_BRACK_CLOSE(int i) {
			return getToken(QuetzalParser.SYM_SQUARE_BRACK_CLOSE, i);
		}
		public TerminalNode SYM_PAREN_OPEN() { return getToken(QuetzalParser.SYM_PAREN_OPEN, 0); }
		public TerminalNode SYM_PAREN_CLOSE() { return getToken(QuetzalParser.SYM_PAREN_CLOSE, 0); }
		public List<TerminalNode> SYM_COMMA() { return getTokens(QuetzalParser.SYM_COMMA); }
		public TerminalNode SYM_COMMA(int i) {
			return getToken(QuetzalParser.SYM_COMMA, i);
		}
		public Var_cteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_cte; }
	}

	public final Var_cteContext var_cte() throws RecognitionException {
		Var_cteContext _localctx = new Var_cteContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_var_cte);
		int _la;
		try {
			setState(329);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(302);
				constants();
				stack.addConstant(_input.getText(_localctx.start, _input.LT(-1)))
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(305);
				match(TYPE_ID);
				stack.addOperand(_input.getText(_localctx.start, _input.LT(-1)))
				setState(313);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SYM_SQUARE_BRACK_OPEN) {
					{
					{
					setState(307);
					match(SYM_SQUARE_BRACK_OPEN);
					setState(308);
					expression();
					setState(309);
					match(SYM_SQUARE_BRACK_CLOSE);
					}
					}
					setState(315);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(316);
				match(TYPE_ID);
				setState(317);
				match(SYM_PAREN_OPEN);
				stack.addOp('(')
				setState(319);
				expression();
				setState(324);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SYM_COMMA) {
					{
					{
					setState(320);
					match(SYM_COMMA);
					setState(321);
					expression();
					}
					}
					setState(326);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(327);
				match(SYM_PAREN_CLOSE);
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

	public static class ExpressionContext extends ParserRuleContext {
		public List<ExpLogicContext> expLogic() {
			return getRuleContexts(ExpLogicContext.class);
		}
		public ExpLogicContext expLogic(int i) {
			return getRuleContext(ExpLogicContext.class,i);
		}
		public List<TerminalNode> SYM_OR() { return getTokens(QuetzalParser.SYM_OR); }
		public TerminalNode SYM_OR(int i) {
			return getToken(QuetzalParser.SYM_OR, i);
		}
		public List<TerminalNode> SYM_AND() { return getTokens(QuetzalParser.SYM_AND); }
		public TerminalNode SYM_AND(int i) {
			return getToken(QuetzalParser.SYM_AND, i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			expLogic();
			stack.exitExpLogic()
			setState(344);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SYM_OR || _la==SYM_AND) {
				{
				{
				setState(337);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SYM_OR:
					{
					setState(333);
					match(SYM_OR);
					stack.addOp('||')
					}
					break;
				case SYM_AND:
					{
					setState(335);
					match(SYM_AND);
					stack.addOp('&&')
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(339);
				expLogic();
				stack.exitExpLogic()
				}
				}
				setState(346);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ExpLogicContext extends ParserRuleContext {
		public Logic_opContext logic_op;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public Logic_opContext logic_op() {
			return getRuleContext(Logic_opContext.class,0);
		}
		public ExpLogicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expLogic; }
	}

	public final ExpLogicContext expLogic() throws RecognitionException {
		ExpLogicContext _localctx = new ExpLogicContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_expLogic);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			exp();
			stack.exitExp()
			setState(354);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SYM_EQUAL) | (1L << SYM_GRE_THAN) | (1L << SYM_LOW_THAN) | (1L << SYM_NOT_EQUAL) | (1L << SYM_GRE_EQ) | (1L << SYM_LOW_EQ))) != 0)) {
				{
				setState(349);
				((ExpLogicContext)_localctx).logic_op = logic_op();
				stack.addOp((((ExpLogicContext)_localctx).logic_op!=null?_input.getText(((ExpLogicContext)_localctx).logic_op.start,((ExpLogicContext)_localctx).logic_op.stop):null))
				setState(351);
				exp();
				stack.exitExp()
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

	public static class ExpContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> SYM_PLUS() { return getTokens(QuetzalParser.SYM_PLUS); }
		public TerminalNode SYM_PLUS(int i) {
			return getToken(QuetzalParser.SYM_PLUS, i);
		}
		public List<TerminalNode> SYM_MINUS() { return getTokens(QuetzalParser.SYM_MINUS); }
		public TerminalNode SYM_MINUS(int i) {
			return getToken(QuetzalParser.SYM_MINUS, i);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_exp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			term();
			stack.exitTerm()
			setState(369);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SYM_PLUS || _la==SYM_MINUS) {
				{
				{
				setState(362);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SYM_PLUS:
					{
					setState(358);
					match(SYM_PLUS);
					stack.addOp('+')
					}
					break;
				case SYM_MINUS:
					{
					setState(360);
					match(SYM_MINUS);
					stack.addOp('-')
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(364);
				term();
				stack.exitTerm()
				}
				}
				setState(371);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class TermContext extends ParserRuleContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<TerminalNode> SYM_MULT() { return getTokens(QuetzalParser.SYM_MULT); }
		public TerminalNode SYM_MULT(int i) {
			return getToken(QuetzalParser.SYM_MULT, i);
		}
		public List<TerminalNode> SYM_DIV() { return getTokens(QuetzalParser.SYM_DIV); }
		public TerminalNode SYM_DIV(int i) {
			return getToken(QuetzalParser.SYM_DIV, i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			factor();
			stack.exitFactor()
			setState(385);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SYM_MULT || _la==SYM_DIV) {
				{
				{
				setState(378);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SYM_MULT:
					{
					setState(374);
					match(SYM_MULT);
					stack.addOp('*')
					}
					break;
				case SYM_DIV:
					{
					setState(376);
					match(SYM_DIV);
					stack.addOp('/')
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(380);
				factor();
				stack.exitFactor()
				}
				}
				setState(387);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class FactorContext extends ParserRuleContext {
		public TerminalNode SYM_PAREN_OPEN() { return getToken(QuetzalParser.SYM_PAREN_OPEN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SYM_PAREN_CLOSE() { return getToken(QuetzalParser.SYM_PAREN_CLOSE, 0); }
		public Var_cteContext var_cte() {
			return getRuleContext(Var_cteContext.class,0);
		}
		public TerminalNode SYM_PLUS() { return getToken(QuetzalParser.SYM_PLUS, 0); }
		public TerminalNode SYM_MINUS() { return getToken(QuetzalParser.SYM_MINUS, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_factor);
		int _la;
		try {
			setState(398);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SYM_PAREN_OPEN:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(388);
				match(SYM_PAREN_OPEN);
				stack.addOp('(')
				setState(390);
				expression();
				setState(391);
				match(SYM_PAREN_CLOSE);
				stack.removeP()
				}
				}
				break;
			case SYM_PLUS:
			case SYM_MINUS:
			case TYPE_FLOAT:
			case TYPE_INT:
			case TYPE_ID:
			case TYPE_COLOR:
			case CTE_TAG:
			case TYPE_BOOL:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(395);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SYM_PLUS || _la==SYM_MINUS) {
					{
					setState(394);
					_la = _input.LA(1);
					if ( !(_la==SYM_PLUS || _la==SYM_MINUS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(397);
				var_cte();
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

	public static class Logic_opContext extends ParserRuleContext {
		public TerminalNode SYM_EQUAL() { return getToken(QuetzalParser.SYM_EQUAL, 0); }
		public TerminalNode SYM_GRE_THAN() { return getToken(QuetzalParser.SYM_GRE_THAN, 0); }
		public TerminalNode SYM_LOW_THAN() { return getToken(QuetzalParser.SYM_LOW_THAN, 0); }
		public TerminalNode SYM_NOT_EQUAL() { return getToken(QuetzalParser.SYM_NOT_EQUAL, 0); }
		public TerminalNode SYM_GRE_EQ() { return getToken(QuetzalParser.SYM_GRE_EQ, 0); }
		public TerminalNode SYM_LOW_EQ() { return getToken(QuetzalParser.SYM_LOW_EQ, 0); }
		public Logic_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logic_op; }
	}

	public final Logic_opContext logic_op() throws RecognitionException {
		Logic_opContext _localctx = new Logic_opContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_logic_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SYM_EQUAL) | (1L << SYM_GRE_THAN) | (1L << SYM_LOW_THAN) | (1L << SYM_NOT_EQUAL) | (1L << SYM_GRE_EQ) | (1L << SYM_LOW_EQ))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public static class ReturningContext extends ParserRuleContext {
		public TerminalNode TK_RETURN() { return getToken(QuetzalParser.TK_RETURN, 0); }
		public TerminalNode SYM_SEMI_COL() { return getToken(QuetzalParser.SYM_SEMI_COL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturningContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returning; }
	}

	public final ReturningContext returning() throws RecognitionException {
		ReturningContext _localctx = new ReturningContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_returning);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402);
			match(TK_RETURN);
			setState(404);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 54)) & ~0x3f) == 0 && ((1L << (_la - 54)) & ((1L << (SYM_PAREN_OPEN - 54)) | (1L << (SYM_PLUS - 54)) | (1L << (SYM_MINUS - 54)) | (1L << (TYPE_FLOAT - 54)) | (1L << (TYPE_INT - 54)) | (1L << (TYPE_ID - 54)) | (1L << (TYPE_COLOR - 54)) | (1L << (CTE_TAG - 54)) | (1L << (TYPE_BOOL - 54)))) != 0)) {
				{
				setState(403);
				expression();
				}
			}

			setState(406);
			match(SYM_SEMI_COL);
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

	public static class CallfuncContext extends ParserRuleContext {
		public Token TYPE_ID;
		public TerminalNode TYPE_ID() { return getToken(QuetzalParser.TYPE_ID, 0); }
		public TerminalNode SYM_PAREN_OPEN() { return getToken(QuetzalParser.SYM_PAREN_OPEN, 0); }
		public TerminalNode SYM_PAREN_CLOSE() { return getToken(QuetzalParser.SYM_PAREN_CLOSE, 0); }
		public TerminalNode SYM_SEMI_COL() { return getToken(QuetzalParser.SYM_SEMI_COL, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> SYM_COMMA() { return getTokens(QuetzalParser.SYM_COMMA); }
		public TerminalNode SYM_COMMA(int i) {
			return getToken(QuetzalParser.SYM_COMMA, i);
		}
		public CallfuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callfunc; }
	}

	public final CallfuncContext callfunc() throws RecognitionException {
		CallfuncContext _localctx = new CallfuncContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_callfunc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			((CallfuncContext)_localctx).TYPE_ID = match(TYPE_ID);
			stack.enterCallFunc((((CallfuncContext)_localctx).TYPE_ID!=null?((CallfuncContext)_localctx).TYPE_ID.getText():null))
			setState(410);
			match(SYM_PAREN_OPEN);
			setState(422);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 54)) & ~0x3f) == 0 && ((1L << (_la - 54)) & ((1L << (SYM_PAREN_OPEN - 54)) | (1L << (SYM_PLUS - 54)) | (1L << (SYM_MINUS - 54)) | (1L << (TYPE_FLOAT - 54)) | (1L << (TYPE_INT - 54)) | (1L << (TYPE_ID - 54)) | (1L << (TYPE_COLOR - 54)) | (1L << (CTE_TAG - 54)) | (1L << (TYPE_BOOL - 54)))) != 0)) {
				{
				setState(411);
				expression();
				stack.getParam((((CallfuncContext)_localctx).TYPE_ID!=null?((CallfuncContext)_localctx).TYPE_ID.getText():null))
				setState(419);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SYM_COMMA) {
					{
					{
					setState(413);
					match(SYM_COMMA);
					setState(414);
					expression();
					stack.getParam((((CallfuncContext)_localctx).TYPE_ID!=null?((CallfuncContext)_localctx).TYPE_ID.getText():null))
					}
					}
					setState(421);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(424);
			match(SYM_PAREN_CLOSE);
			stack.exitParams((((CallfuncContext)_localctx).TYPE_ID!=null?((CallfuncContext)_localctx).TYPE_ID.getText():null))
			setState(426);
			match(SYM_SEMI_COL);
			stack.exitCallFunc((((CallfuncContext)_localctx).TYPE_ID!=null?((CallfuncContext)_localctx).TYPE_ID.getText():null))
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

	public static class LoopContext extends ParserRuleContext {
		public TerminalNode TK_WHILE() { return getToken(QuetzalParser.TK_WHILE, 0); }
		public TerminalNode SYM_PAREN_OPEN() { return getToken(QuetzalParser.SYM_PAREN_OPEN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SYM_PAREN_CLOSE() { return getToken(QuetzalParser.SYM_PAREN_CLOSE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			match(TK_WHILE);
			setState(430);
			match(SYM_PAREN_OPEN);
			setState(431);
			expression();
			stack.enterCicle()
			setState(433);
			match(SYM_PAREN_CLOSE);
			setState(434);
			block();
			stack.exitCicle()
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

	public static class OpenimgContext extends ParserRuleContext {
		public TerminalNode TK_OPENIMG() { return getToken(QuetzalParser.TK_OPENIMG, 0); }
		public TerminalNode SYM_PAREN_OPEN() { return getToken(QuetzalParser.SYM_PAREN_OPEN, 0); }
		public TerminalNode CTE_TAG() { return getToken(QuetzalParser.CTE_TAG, 0); }
		public TerminalNode SYM_PAREN_CLOSE() { return getToken(QuetzalParser.SYM_PAREN_CLOSE, 0); }
		public TerminalNode SYM_SEMI_COL() { return getToken(QuetzalParser.SYM_SEMI_COL, 0); }
		public OpenimgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_openimg; }
	}

	public final OpenimgContext openimg() throws RecognitionException {
		OpenimgContext _localctx = new OpenimgContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_openimg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			match(TK_OPENIMG);
			setState(438);
			match(SYM_PAREN_OPEN);
			setState(439);
			match(CTE_TAG);
			setState(440);
			match(SYM_PAREN_CLOSE);
			setState(441);
			match(SYM_SEMI_COL);
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

	public static class SaveimgContext extends ParserRuleContext {
		public TerminalNode TK_SAVEIMG() { return getToken(QuetzalParser.TK_SAVEIMG, 0); }
		public TerminalNode SYM_PAREN_OPEN() { return getToken(QuetzalParser.SYM_PAREN_OPEN, 0); }
		public TerminalNode TYPE_ID() { return getToken(QuetzalParser.TYPE_ID, 0); }
		public TerminalNode SYM_COMMA() { return getToken(QuetzalParser.SYM_COMMA, 0); }
		public TerminalNode CTE_TAG() { return getToken(QuetzalParser.CTE_TAG, 0); }
		public TerminalNode SYM_PAREN_CLOSE() { return getToken(QuetzalParser.SYM_PAREN_CLOSE, 0); }
		public TerminalNode SYM_SEMI_COL() { return getToken(QuetzalParser.SYM_SEMI_COL, 0); }
		public SaveimgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_saveimg; }
	}

	public final SaveimgContext saveimg() throws RecognitionException {
		SaveimgContext _localctx = new SaveimgContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_saveimg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(443);
			match(TK_SAVEIMG);
			setState(444);
			match(SYM_PAREN_OPEN);
			setState(445);
			match(TYPE_ID);
			setState(446);
			match(SYM_COMMA);
			setState(447);
			match(CTE_TAG);
			setState(448);
			match(SYM_PAREN_CLOSE);
			setState(449);
			match(SYM_SEMI_COL);
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

	public static class Color_replaceContext extends ParserRuleContext {
		public TerminalNode TK_COLOR_REPLACE() { return getToken(QuetzalParser.TK_COLOR_REPLACE, 0); }
		public TerminalNode SYM_PAREN_OPEN() { return getToken(QuetzalParser.SYM_PAREN_OPEN, 0); }
		public List<TerminalNode> TYPE_ID() { return getTokens(QuetzalParser.TYPE_ID); }
		public TerminalNode TYPE_ID(int i) {
			return getToken(QuetzalParser.TYPE_ID, i);
		}
		public List<TerminalNode> SYM_COMMA() { return getTokens(QuetzalParser.SYM_COMMA); }
		public TerminalNode SYM_COMMA(int i) {
			return getToken(QuetzalParser.SYM_COMMA, i);
		}
		public TerminalNode SYM_PAREN_CLOSE() { return getToken(QuetzalParser.SYM_PAREN_CLOSE, 0); }
		public TerminalNode SYM_SEMI_COL() { return getToken(QuetzalParser.SYM_SEMI_COL, 0); }
		public List<TerminalNode> TYPE_COLOR() { return getTokens(QuetzalParser.TYPE_COLOR); }
		public TerminalNode TYPE_COLOR(int i) {
			return getToken(QuetzalParser.TYPE_COLOR, i);
		}
		public Color_replaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_color_replace; }
	}

	public final Color_replaceContext color_replace() throws RecognitionException {
		Color_replaceContext _localctx = new Color_replaceContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_color_replace);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
			match(TK_COLOR_REPLACE);
			setState(452);
			match(SYM_PAREN_OPEN);
			setState(453);
			match(TYPE_ID);
			setState(454);
			match(SYM_COMMA);
			setState(455);
			_la = _input.LA(1);
			if ( !(_la==TYPE_ID || _la==TYPE_COLOR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(456);
			match(SYM_COMMA);
			setState(457);
			_la = _input.LA(1);
			if ( !(_la==TYPE_ID || _la==TYPE_COLOR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(458);
			match(SYM_PAREN_CLOSE);
			setState(459);
			match(SYM_SEMI_COL);
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

	public static class GrayscaleContext extends ParserRuleContext {
		public TerminalNode TK_GRAYSCALE() { return getToken(QuetzalParser.TK_GRAYSCALE, 0); }
		public TerminalNode SYM_PAREN_OPEN() { return getToken(QuetzalParser.SYM_PAREN_OPEN, 0); }
		public TerminalNode TYPE_ID() { return getToken(QuetzalParser.TYPE_ID, 0); }
		public TerminalNode SYM_PAREN_CLOSE() { return getToken(QuetzalParser.SYM_PAREN_CLOSE, 0); }
		public TerminalNode SYM_SEMI_COL() { return getToken(QuetzalParser.SYM_SEMI_COL, 0); }
		public GrayscaleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grayscale; }
	}

	public final GrayscaleContext grayscale() throws RecognitionException {
		GrayscaleContext _localctx = new GrayscaleContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_grayscale);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
			match(TK_GRAYSCALE);
			setState(462);
			match(SYM_PAREN_OPEN);
			setState(463);
			match(TYPE_ID);
			setState(464);
			match(SYM_PAREN_CLOSE);
			setState(465);
			match(SYM_SEMI_COL);
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

	public static class Color_filterContext extends ParserRuleContext {
		public TerminalNode TK_COLOR_REPLACE() { return getToken(QuetzalParser.TK_COLOR_REPLACE, 0); }
		public TerminalNode SYM_PAREN_OPEN() { return getToken(QuetzalParser.SYM_PAREN_OPEN, 0); }
		public List<TerminalNode> TYPE_ID() { return getTokens(QuetzalParser.TYPE_ID); }
		public TerminalNode TYPE_ID(int i) {
			return getToken(QuetzalParser.TYPE_ID, i);
		}
		public TerminalNode SYM_COMMA() { return getToken(QuetzalParser.SYM_COMMA, 0); }
		public TerminalNode SYM_PAREN_CLOSE() { return getToken(QuetzalParser.SYM_PAREN_CLOSE, 0); }
		public TerminalNode SYM_SEMI_COL() { return getToken(QuetzalParser.SYM_SEMI_COL, 0); }
		public TerminalNode TYPE_COLOR() { return getToken(QuetzalParser.TYPE_COLOR, 0); }
		public Color_filterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_color_filter; }
	}

	public final Color_filterContext color_filter() throws RecognitionException {
		Color_filterContext _localctx = new Color_filterContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_color_filter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
			match(TK_COLOR_REPLACE);
			setState(468);
			match(SYM_PAREN_OPEN);
			setState(469);
			match(TYPE_ID);
			setState(470);
			match(SYM_COMMA);
			setState(471);
			_la = _input.LA(1);
			if ( !(_la==TYPE_ID || _la==TYPE_COLOR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(472);
			match(SYM_PAREN_CLOSE);
			setState(473);
			match(SYM_SEMI_COL);
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

	public static class EdgeDetectionContext extends ParserRuleContext {
		public TerminalNode TK_EDGE_DETECTION() { return getToken(QuetzalParser.TK_EDGE_DETECTION, 0); }
		public TerminalNode SYM_PAREN_OPEN() { return getToken(QuetzalParser.SYM_PAREN_OPEN, 0); }
		public TerminalNode TYPE_ID() { return getToken(QuetzalParser.TYPE_ID, 0); }
		public TerminalNode SYM_PAREN_CLOSE() { return getToken(QuetzalParser.SYM_PAREN_CLOSE, 0); }
		public TerminalNode SYM_SEMI_COL() { return getToken(QuetzalParser.SYM_SEMI_COL, 0); }
		public EdgeDetectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_edgeDetection; }
	}

	public final EdgeDetectionContext edgeDetection() throws RecognitionException {
		EdgeDetectionContext _localctx = new EdgeDetectionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_edgeDetection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(475);
			match(TK_EDGE_DETECTION);
			setState(476);
			match(SYM_PAREN_OPEN);
			setState(477);
			match(TYPE_ID);
			setState(478);
			match(SYM_PAREN_CLOSE);
			setState(479);
			match(SYM_SEMI_COL);
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

	public static class ScaleImgContext extends ParserRuleContext {
		public TerminalNode TK_SCALE_IMAGE() { return getToken(QuetzalParser.TK_SCALE_IMAGE, 0); }
		public TerminalNode SYM_PAREN_OPEN() { return getToken(QuetzalParser.SYM_PAREN_OPEN, 0); }
		public List<TerminalNode> TYPE_ID() { return getTokens(QuetzalParser.TYPE_ID); }
		public TerminalNode TYPE_ID(int i) {
			return getToken(QuetzalParser.TYPE_ID, i);
		}
		public List<TerminalNode> SYM_COMMA() { return getTokens(QuetzalParser.SYM_COMMA); }
		public TerminalNode SYM_COMMA(int i) {
			return getToken(QuetzalParser.SYM_COMMA, i);
		}
		public TerminalNode SYM_PAREN_CLOSE() { return getToken(QuetzalParser.SYM_PAREN_CLOSE, 0); }
		public TerminalNode SYM_SEMI_COL() { return getToken(QuetzalParser.SYM_SEMI_COL, 0); }
		public List<TerminalNode> TYPE_FLOAT() { return getTokens(QuetzalParser.TYPE_FLOAT); }
		public TerminalNode TYPE_FLOAT(int i) {
			return getToken(QuetzalParser.TYPE_FLOAT, i);
		}
		public List<TerminalNode> SYM_PLUS() { return getTokens(QuetzalParser.SYM_PLUS); }
		public TerminalNode SYM_PLUS(int i) {
			return getToken(QuetzalParser.SYM_PLUS, i);
		}
		public List<TerminalNode> SYM_MINUS() { return getTokens(QuetzalParser.SYM_MINUS); }
		public TerminalNode SYM_MINUS(int i) {
			return getToken(QuetzalParser.SYM_MINUS, i);
		}
		public ScaleImgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scaleImg; }
	}

	public final ScaleImgContext scaleImg() throws RecognitionException {
		ScaleImgContext _localctx = new ScaleImgContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_scaleImg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(481);
			match(TK_SCALE_IMAGE);
			setState(482);
			match(SYM_PAREN_OPEN);
			setState(483);
			match(TYPE_ID);
			setState(484);
			match(SYM_COMMA);
			setState(486);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SYM_PLUS || _la==SYM_MINUS) {
				{
				setState(485);
				_la = _input.LA(1);
				if ( !(_la==SYM_PLUS || _la==SYM_MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(488);
			_la = _input.LA(1);
			if ( !(_la==TYPE_FLOAT || _la==TYPE_ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(489);
			match(SYM_COMMA);
			setState(491);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SYM_PLUS || _la==SYM_MINUS) {
				{
				setState(490);
				_la = _input.LA(1);
				if ( !(_la==SYM_PLUS || _la==SYM_MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(493);
			_la = _input.LA(1);
			if ( !(_la==TYPE_FLOAT || _la==TYPE_ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(494);
			match(SYM_PAREN_CLOSE);
			setState(495);
			match(SYM_SEMI_COL);
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

	public static class GetColorPaletteContext extends ParserRuleContext {
		public TerminalNode TK_GET_COLOR_PALETTE() { return getToken(QuetzalParser.TK_GET_COLOR_PALETTE, 0); }
		public TerminalNode SYM_PAREN_OPEN() { return getToken(QuetzalParser.SYM_PAREN_OPEN, 0); }
		public List<TerminalNode> TYPE_ID() { return getTokens(QuetzalParser.TYPE_ID); }
		public TerminalNode TYPE_ID(int i) {
			return getToken(QuetzalParser.TYPE_ID, i);
		}
		public TerminalNode SYM_COMMA() { return getToken(QuetzalParser.SYM_COMMA, 0); }
		public TerminalNode SYM_PAREN_CLOSE() { return getToken(QuetzalParser.SYM_PAREN_CLOSE, 0); }
		public TerminalNode SYM_SEMI_COL() { return getToken(QuetzalParser.SYM_SEMI_COL, 0); }
		public TerminalNode TYPE_FLOAT() { return getToken(QuetzalParser.TYPE_FLOAT, 0); }
		public GetColorPaletteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getColorPalette; }
	}

	public final GetColorPaletteContext getColorPalette() throws RecognitionException {
		GetColorPaletteContext _localctx = new GetColorPaletteContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_getColorPalette);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(497);
			match(TK_GET_COLOR_PALETTE);
			setState(498);
			match(SYM_PAREN_OPEN);
			setState(499);
			match(TYPE_ID);
			setState(500);
			match(SYM_COMMA);
			setState(501);
			_la = _input.LA(1);
			if ( !(_la==TYPE_FLOAT || _la==TYPE_ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(502);
			match(SYM_PAREN_CLOSE);
			setState(503);
			match(SYM_SEMI_COL);
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

	public static class ColorMatchImageContext extends ParserRuleContext {
		public TerminalNode TK_COLOR_MATCH_IMAGE() { return getToken(QuetzalParser.TK_COLOR_MATCH_IMAGE, 0); }
		public TerminalNode SYM_PAREN_OPEN() { return getToken(QuetzalParser.SYM_PAREN_OPEN, 0); }
		public List<TerminalNode> TYPE_ID() { return getTokens(QuetzalParser.TYPE_ID); }
		public TerminalNode TYPE_ID(int i) {
			return getToken(QuetzalParser.TYPE_ID, i);
		}
		public TerminalNode SYM_COMMA() { return getToken(QuetzalParser.SYM_COMMA, 0); }
		public TerminalNode SYM_PAREN_CLOSE() { return getToken(QuetzalParser.SYM_PAREN_CLOSE, 0); }
		public TerminalNode SYM_SEMI_COL() { return getToken(QuetzalParser.SYM_SEMI_COL, 0); }
		public ColorMatchImageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colorMatchImage; }
	}

	public final ColorMatchImageContext colorMatchImage() throws RecognitionException {
		ColorMatchImageContext _localctx = new ColorMatchImageContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_colorMatchImage);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(505);
			match(TK_COLOR_MATCH_IMAGE);
			setState(506);
			match(SYM_PAREN_OPEN);
			setState(507);
			match(TYPE_ID);
			setState(508);
			match(SYM_COMMA);
			setState(509);
			match(TYPE_ID);
			setState(510);
			match(SYM_PAREN_CLOSE);
			setState(511);
			match(SYM_SEMI_COL);
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

	public static class EncodeSteganographyContext extends ParserRuleContext {
		public TerminalNode TK_ENCODE_STEGANOGRAPHY() { return getToken(QuetzalParser.TK_ENCODE_STEGANOGRAPHY, 0); }
		public TerminalNode SYM_PAREN_OPEN() { return getToken(QuetzalParser.SYM_PAREN_OPEN, 0); }
		public TerminalNode TYPE_ID() { return getToken(QuetzalParser.TYPE_ID, 0); }
		public TerminalNode SYM_COMMA() { return getToken(QuetzalParser.SYM_COMMA, 0); }
		public TerminalNode CTE_TAG() { return getToken(QuetzalParser.CTE_TAG, 0); }
		public TerminalNode SYM_PAREN_CLOSE() { return getToken(QuetzalParser.SYM_PAREN_CLOSE, 0); }
		public TerminalNode SYM_SEMI_COL() { return getToken(QuetzalParser.SYM_SEMI_COL, 0); }
		public EncodeSteganographyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_encodeSteganography; }
	}

	public final EncodeSteganographyContext encodeSteganography() throws RecognitionException {
		EncodeSteganographyContext _localctx = new EncodeSteganographyContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_encodeSteganography);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(513);
			match(TK_ENCODE_STEGANOGRAPHY);
			setState(514);
			match(SYM_PAREN_OPEN);
			setState(515);
			match(TYPE_ID);
			setState(516);
			match(SYM_COMMA);
			setState(517);
			match(CTE_TAG);
			setState(518);
			match(SYM_PAREN_CLOSE);
			setState(519);
			match(SYM_SEMI_COL);
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

	public static class DecodeSteganographyContext extends ParserRuleContext {
		public TerminalNode TK_DECODE_STEGANOGRAPHY() { return getToken(QuetzalParser.TK_DECODE_STEGANOGRAPHY, 0); }
		public TerminalNode SYM_PAREN_OPEN() { return getToken(QuetzalParser.SYM_PAREN_OPEN, 0); }
		public TerminalNode TYPE_ID() { return getToken(QuetzalParser.TYPE_ID, 0); }
		public TerminalNode SYM_PAREN_CLOSE() { return getToken(QuetzalParser.SYM_PAREN_CLOSE, 0); }
		public TerminalNode SYM_SEMI_COL() { return getToken(QuetzalParser.SYM_SEMI_COL, 0); }
		public DecodeSteganographyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decodeSteganography; }
	}

	public final DecodeSteganographyContext decodeSteganography() throws RecognitionException {
		DecodeSteganographyContext _localctx = new DecodeSteganographyContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_decodeSteganography);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(521);
			match(TK_DECODE_STEGANOGRAPHY);
			setState(522);
			match(SYM_PAREN_OPEN);
			setState(523);
			match(TYPE_ID);
			setState(524);
			match(SYM_PAREN_CLOSE);
			setState(525);
			match(SYM_SEMI_COL);
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

	public static class GetImageHeightContext extends ParserRuleContext {
		public TerminalNode TK_GET_IMAGE_HEIGHT() { return getToken(QuetzalParser.TK_GET_IMAGE_HEIGHT, 0); }
		public TerminalNode SYM_PAREN_OPEN() { return getToken(QuetzalParser.SYM_PAREN_OPEN, 0); }
		public TerminalNode CTE_TAG() { return getToken(QuetzalParser.CTE_TAG, 0); }
		public TerminalNode SYM_PAREN_CLOSE() { return getToken(QuetzalParser.SYM_PAREN_CLOSE, 0); }
		public TerminalNode SYM_SEMI_COL() { return getToken(QuetzalParser.SYM_SEMI_COL, 0); }
		public GetImageHeightContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getImageHeight; }
	}

	public final GetImageHeightContext getImageHeight() throws RecognitionException {
		GetImageHeightContext _localctx = new GetImageHeightContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_getImageHeight);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(527);
			match(TK_GET_IMAGE_HEIGHT);
			setState(528);
			match(SYM_PAREN_OPEN);
			setState(529);
			match(CTE_TAG);
			setState(530);
			match(SYM_PAREN_CLOSE);
			setState(531);
			match(SYM_SEMI_COL);
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

	public static class GetImageWidthContext extends ParserRuleContext {
		public TerminalNode TK_GET_IMAGE_WIDTH() { return getToken(QuetzalParser.TK_GET_IMAGE_WIDTH, 0); }
		public TerminalNode SYM_PAREN_OPEN() { return getToken(QuetzalParser.SYM_PAREN_OPEN, 0); }
		public TerminalNode CTE_TAG() { return getToken(QuetzalParser.CTE_TAG, 0); }
		public TerminalNode SYM_PAREN_CLOSE() { return getToken(QuetzalParser.SYM_PAREN_CLOSE, 0); }
		public TerminalNode SYM_SEMI_COL() { return getToken(QuetzalParser.SYM_SEMI_COL, 0); }
		public GetImageWidthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getImageWidth; }
	}

	public final GetImageWidthContext getImageWidth() throws RecognitionException {
		GetImageWidthContext _localctx = new GetImageWidthContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_getImageWidth);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(533);
			match(TK_GET_IMAGE_WIDTH);
			setState(534);
			match(SYM_PAREN_OPEN);
			setState(535);
			match(CTE_TAG);
			setState(536);
			match(SYM_PAREN_CLOSE);
			setState(537);
			match(SYM_SEMI_COL);
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

	public static class SpecfunctContext extends ParserRuleContext {
		public OpenimgContext openimg() {
			return getRuleContext(OpenimgContext.class,0);
		}
		public SaveimgContext saveimg() {
			return getRuleContext(SaveimgContext.class,0);
		}
		public GrayscaleContext grayscale() {
			return getRuleContext(GrayscaleContext.class,0);
		}
		public Color_replaceContext color_replace() {
			return getRuleContext(Color_replaceContext.class,0);
		}
		public Color_filterContext color_filter() {
			return getRuleContext(Color_filterContext.class,0);
		}
		public EdgeDetectionContext edgeDetection() {
			return getRuleContext(EdgeDetectionContext.class,0);
		}
		public ScaleImgContext scaleImg() {
			return getRuleContext(ScaleImgContext.class,0);
		}
		public GetColorPaletteContext getColorPalette() {
			return getRuleContext(GetColorPaletteContext.class,0);
		}
		public ColorMatchImageContext colorMatchImage() {
			return getRuleContext(ColorMatchImageContext.class,0);
		}
		public EncodeSteganographyContext encodeSteganography() {
			return getRuleContext(EncodeSteganographyContext.class,0);
		}
		public DecodeSteganographyContext decodeSteganography() {
			return getRuleContext(DecodeSteganographyContext.class,0);
		}
		public GetImageHeightContext getImageHeight() {
			return getRuleContext(GetImageHeightContext.class,0);
		}
		public GetImageWidthContext getImageWidth() {
			return getRuleContext(GetImageWidthContext.class,0);
		}
		public SpecfunctContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specfunct; }
	}

	public final SpecfunctContext specfunct() throws RecognitionException {
		SpecfunctContext _localctx = new SpecfunctContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_specfunct);
		try {
			setState(552);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(539);
				openimg();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(540);
				saveimg();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(541);
				grayscale();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(542);
				color_replace();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(543);
				color_filter();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(544);
				edgeDetection();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(545);
				scaleImg();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(546);
				getColorPalette();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(547);
				colorMatchImage();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(548);
				encodeSteganography();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(549);
				decodeSteganography();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(550);
				getImageHeight();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(551);
				getImageWidth();
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3Q\u022d\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\3\2\7\2M\n\2\f\2\16\2P\13\2\3\2\7\2"+
		"S\n\2\f\2\16\2V\13\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7"+
		"\3d\n\3\f\3\16\3g\13\3\3\3\7\3j\n\3\f\3\16\3m\13\3\3\3\3\3\3\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4|\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\5\4\u0087\n\4\7\4\u0089\n\4\f\4\16\4\u008c\13\4\3\4\3\4\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0099\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\7\5\u00a4\n\5\f\5\16\5\u00a7\13\5\5\5\u00a9\n\5\3\5\3\5\3\5"+
		"\3\5\5\5\u00af\n\5\3\5\7\5\u00b2\n\5\f\5\16\5\u00b5\13\5\3\5\3\5\3\5\3"+
		"\6\3\6\5\6\u00bc\n\6\3\6\7\6\u00bf\n\6\f\6\16\6\u00c2\13\6\3\6\3\6\3\7"+
		"\3\7\3\7\3\7\3\7\7\7\u00cb\n\7\f\7\16\7\u00ce\13\7\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\5\b\u00da\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\7\t\u00e5\n\t\f\t\16\t\u00e8\13\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00f9\n\n\f\n\16\n\u00fc\13\n\5\n\u00fe\n"+
		"\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u010c"+
		"\n\13\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u0114\n\f\f\f\16\f\u0117\13\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\5\f\u011f\n\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\5\r\u012d\n\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\7\16\u013a\n\16\f\16\16\16\u013d\13\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\7\16\u0145\n\16\f\16\16\16\u0148\13\16\3\16\3\16\5\16\u014c\n"+
		"\16\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0154\n\17\3\17\3\17\3\17\7\17"+
		"\u0159\n\17\f\17\16\17\u015c\13\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\5\20\u0165\n\20\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u016d\n\21\3\21\3"+
		"\21\3\21\7\21\u0172\n\21\f\21\16\21\u0175\13\21\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\5\22\u017d\n\22\3\22\3\22\3\22\7\22\u0182\n\22\f\22\16\22\u0185"+
		"\13\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u018e\n\23\3\23\5\23\u0191"+
		"\n\23\3\24\3\24\3\25\3\25\5\25\u0197\n\25\3\25\3\25\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\7\26\u01a4\n\26\f\26\16\26\u01a7\13\26\5\26"+
		"\u01a9\n\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\5\36\u01e9\n\36\3\36\3\36\3\36"+
		"\5\36\u01ee\n\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\""+
		"\3\"\3\"\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3"+
		"%\3%\3%\3%\3%\5%\u022b\n%\3%\2\2&\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\64\668:<>@BDFH\2\7\3\2\33\36\3\2DE\3\2;@\3\2JK\4\2"+
		"HHJJ\2\u0246\2J\3\2\2\2\4Z\3\2\2\2\6q\3\2\2\2\b\u008f\3\2\2\2\n\u00b9"+
		"\3\2\2\2\f\u00c5\3\2\2\2\16\u00d9\3\2\2\2\20\u00db\3\2\2\2\22\u00ed\3"+
		"\2\2\2\24\u010b\3\2\2\2\26\u010d\3\2\2\2\30\u0122\3\2\2\2\32\u014b\3\2"+
		"\2\2\34\u014d\3\2\2\2\36\u015d\3\2\2\2 \u0166\3\2\2\2\"\u0176\3\2\2\2"+
		"$\u0190\3\2\2\2&\u0192\3\2\2\2(\u0194\3\2\2\2*\u019a\3\2\2\2,\u01af\3"+
		"\2\2\2.\u01b7\3\2\2\2\60\u01bd\3\2\2\2\62\u01c5\3\2\2\2\64\u01cf\3\2\2"+
		"\2\66\u01d5\3\2\2\28\u01dd\3\2\2\2:\u01e3\3\2\2\2<\u01f3\3\2\2\2>\u01fb"+
		"\3\2\2\2@\u0203\3\2\2\2B\u020b\3\2\2\2D\u0211\3\2\2\2F\u0217\3\2\2\2H"+
		"\u022a\3\2\2\2JN\b\2\1\2KM\5\6\4\2LK\3\2\2\2MP\3\2\2\2NL\3\2\2\2NO\3\2"+
		"\2\2OT\3\2\2\2PN\3\2\2\2QS\5\b\5\2RQ\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2"+
		"\2\2UW\3\2\2\2VT\3\2\2\2WX\5\4\3\2XY\b\2\1\2Y\3\3\2\2\2Z[\b\3\1\2[\\\7"+
		"\4\2\2\\]\b\3\1\2]^\7\f\2\2^_\b\3\1\2_`\78\2\2`a\79\2\2ae\7\64\2\2bd\5"+
		"\6\4\2cb\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2fk\3\2\2\2ge\3\2\2\2hj\5"+
		"\24\13\2ih\3\2\2\2jm\3\2\2\2ki\3\2\2\2kl\3\2\2\2ln\3\2\2\2mk\3\2\2\2n"+
		"o\7\65\2\2op\b\3\1\2p\5\3\2\2\2qr\7\5\2\2rs\5\f\7\2st\7J\2\2t{\b\4\1\2"+
		"uv\b\4\1\2vw\7:\2\2wx\b\4\1\2xy\5\34\17\2yz\b\4\1\2z|\3\2\2\2{u\3\2\2"+
		"\2{|\3\2\2\2|\u008a\3\2\2\2}~\7\62\2\2~\177\7J\2\2\177\u0086\b\4\1\2\u0080"+
		"\u0081\b\4\1\2\u0081\u0082\7:\2\2\u0082\u0083\b\4\1\2\u0083\u0084\5\34"+
		"\17\2\u0084\u0085\b\4\1\2\u0085\u0087\3\2\2\2\u0086\u0080\3\2\2\2\u0086"+
		"\u0087\3\2\2\2\u0087\u0089\3\2\2\2\u0088}\3\2\2\2\u0089\u008c\3\2\2\2"+
		"\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008d\3\2\2\2\u008c\u008a"+
		"\3\2\2\2\u008d\u008e\7\60\2\2\u008e\7\3\2\2\2\u008f\u0090\7\4\2\2\u0090"+
		"\u0098\b\5\1\2\u0091\u0092\5\f\7\2\u0092\u0093\7J\2\2\u0093\u0094\b\5"+
		"\1\2\u0094\u0099\3\2\2\2\u0095\u0096\7\r\2\2\u0096\u0097\7J\2\2\u0097"+
		"\u0099\b\5\1\2\u0098\u0091\3\2\2\2\u0098\u0095\3\2\2\2\u0099\u009a\3\2"+
		"\2\2\u009a\u00a8\78\2\2\u009b\u009c\5\f\7\2\u009c\u009d\7J\2\2\u009d\u00a5"+
		"\b\5\1\2\u009e\u009f\7\62\2\2\u009f\u00a0\5\f\7\2\u00a0\u00a1\7J\2\2\u00a1"+
		"\u00a2\b\5\1\2\u00a2\u00a4\3\2\2\2\u00a3\u009e\3\2\2\2\u00a4\u00a7\3\2"+
		"\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a9\3\2\2\2\u00a7"+
		"\u00a5\3\2\2\2\u00a8\u009b\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00aa\3\2"+
		"\2\2\u00aa\u00ab\79\2\2\u00ab\u00ac\b\5\1\2\u00ac\u00ae\7\64\2\2\u00ad"+
		"\u00af\5\6\4\2\u00ae\u00ad\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b3\3\2"+
		"\2\2\u00b0\u00b2\5\24\13\2\u00b1\u00b0\3\2\2\2\u00b2\u00b5\3\2\2\2\u00b3"+
		"\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b6\3\2\2\2\u00b5\u00b3\3\2"+
		"\2\2\u00b6\u00b7\7\65\2\2\u00b7\u00b8\b\5\1\2\u00b8\t\3\2\2\2\u00b9\u00bb"+
		"\7\64\2\2\u00ba\u00bc\5\6\4\2\u00bb\u00ba\3\2\2\2\u00bb\u00bc\3\2\2\2"+
		"\u00bc\u00c0\3\2\2\2\u00bd\u00bf\5\24\13\2\u00be\u00bd\3\2\2\2\u00bf\u00c2"+
		"\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c3\3\2\2\2\u00c2"+
		"\u00c0\3\2\2\2\u00c3\u00c4\7\65\2\2\u00c4\13\3\2\2\2\u00c5\u00cc\t\2\2"+
		"\2\u00c6\u00c7\7\66\2\2\u00c7\u00c8\5\34\17\2\u00c8\u00c9\7\67\2\2\u00c9"+
		"\u00cb\3\2\2\2\u00ca\u00c6\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc\u00ca\3\2"+
		"\2\2\u00cc\u00cd\3\2\2\2\u00cd\r\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf\u00d0"+
		"\7I\2\2\u00d0\u00da\b\b\1\2\u00d1\u00d2\7H\2\2\u00d2\u00da\b\b\1\2\u00d3"+
		"\u00d4\7L\2\2\u00d4\u00da\b\b\1\2\u00d5\u00d6\7M\2\2\u00d6\u00da\b\b\1"+
		"\2\u00d7\u00d8\7K\2\2\u00d8\u00da\b\b\1\2\u00d9\u00cf\3\2\2\2\u00d9\u00d1"+
		"\3\2\2\2\u00d9\u00d3\3\2\2\2\u00d9\u00d5\3\2\2\2\u00d9\u00d7\3\2\2\2\u00da"+
		"\17\3\2\2\2\u00db\u00dc\7\n\2\2\u00dc\u00dd\78\2\2\u00dd\u00de\b\t\1\2"+
		"\u00de\u00df\5\34\17\2\u00df\u00e6\b\t\1\2\u00e0\u00e1\7\62\2\2\u00e1"+
		"\u00e2\5\34\17\2\u00e2\u00e3\b\t\1\2\u00e3\u00e5\3\2\2\2\u00e4\u00e0\3"+
		"\2\2\2\u00e5\u00e8\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7"+
		"\u00e9\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e9\u00ea\79\2\2\u00ea\u00eb\b\t"+
		"\1\2\u00eb\u00ec\7\60\2\2\u00ec\21\3\2\2\2\u00ed\u00ee\7\13\2\2\u00ee"+
		"\u00ef\78\2\2\u00ef\u00f0\7J\2\2\u00f0\u00fd\b\n\1\2\u00f1\u00f2\7\66"+
		"\2\2\u00f2\u00f3\5\34\17\2\u00f3\u00fa\7\67\2\2\u00f4\u00f5\7\66\2\2\u00f5"+
		"\u00f6\5\34\17\2\u00f6\u00f7\7\67\2\2\u00f7\u00f9\3\2\2\2\u00f8\u00f4"+
		"\3\2\2\2\u00f9\u00fc\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb"+
		"\u00fe\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fd\u00f1\3\2\2\2\u00fd\u00fe\3\2"+
		"\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0100\79\2\2\u0100\u0101\b\n\1\2\u0101"+
		"\u0102\7\60\2\2\u0102\23\3\2\2\2\u0103\u010c\5(\25\2\u0104\u010c\5\30"+
		"\r\2\u0105\u010c\5,\27\2\u0106\u010c\5\20\t\2\u0107\u010c\5\22\n\2\u0108"+
		"\u010c\5*\26\2\u0109\u010c\5H%\2\u010a\u010c\5\26\f\2\u010b\u0103\3\2"+
		"\2\2\u010b\u0104\3\2\2\2\u010b\u0105\3\2\2\2\u010b\u0106\3\2\2\2\u010b"+
		"\u0107\3\2\2\2\u010b\u0108\3\2\2\2\u010b\u0109\3\2\2\2\u010b\u010a\3\2"+
		"\2\2\u010c\25\3\2\2\2\u010d\u010e\7J\2\2\u010e\u0115\b\f\1\2\u010f\u0110"+
		"\7\66\2\2\u0110\u0111\5\34\17\2\u0111\u0112\7\67\2\2\u0112\u0114\3\2\2"+
		"\2\u0113\u010f\3\2\2\2\u0114\u0117\3\2\2\2\u0115\u0113\3\2\2\2\u0115\u0116"+
		"\3\2\2\2\u0116\u0118\3\2\2\2\u0117\u0115\3\2\2\2\u0118\u0119\7:\2\2\u0119"+
		"\u011e\b\f\1\2\u011a\u011f\5H%\2\u011b\u011c\5\34\17\2\u011c\u011d\7\60"+
		"\2\2\u011d\u011f\3\2\2\2\u011e\u011a\3\2\2\2\u011e\u011b\3\2\2\2\u011f"+
		"\u0120\3\2\2\2\u0120\u0121\b\f\1\2\u0121\27\3\2\2\2\u0122\u0123\7\7\2"+
		"\2\u0123\u0124\78\2\2\u0124\u0125\b\r\1\2\u0125\u0126\5\34\17\2\u0126"+
		"\u0127\79\2\2\u0127\u0128\b\r\1\2\u0128\u012c\5\n\6\2\u0129\u012a\7\b"+
		"\2\2\u012a\u012b\b\r\1\2\u012b\u012d\5\n\6\2\u012c\u0129\3\2\2\2\u012c"+
		"\u012d\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u012f\b\r\1\2\u012f\31\3\2\2"+
		"\2\u0130\u0131\5\16\b\2\u0131\u0132\b\16\1\2\u0132\u014c\3\2\2\2\u0133"+
		"\u0134\7J\2\2\u0134\u013b\b\16\1\2\u0135\u0136\7\66\2\2\u0136\u0137\5"+
		"\34\17\2\u0137\u0138\7\67\2\2\u0138\u013a\3\2\2\2\u0139\u0135\3\2\2\2"+
		"\u013a\u013d\3\2\2\2\u013b\u0139\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u014c"+
		"\3\2\2\2\u013d\u013b\3\2\2\2\u013e\u013f\7J\2\2\u013f\u0140\78\2\2\u0140"+
		"\u0141\b\16\1\2\u0141\u0146\5\34\17\2\u0142\u0143\7\62\2\2\u0143\u0145"+
		"\5\34\17\2\u0144\u0142\3\2\2\2\u0145\u0148\3\2\2\2\u0146\u0144\3\2\2\2"+
		"\u0146\u0147\3\2\2\2\u0147\u0149\3\2\2\2\u0148\u0146\3\2\2\2\u0149\u014a"+
		"\79\2\2\u014a\u014c\3\2\2\2\u014b\u0130\3\2\2\2\u014b\u0133\3\2\2\2\u014b"+
		"\u013e\3\2\2\2\u014c\33\3\2\2\2\u014d\u014e\5\36\20\2\u014e\u015a\b\17"+
		"\1\2\u014f\u0150\7A\2\2\u0150\u0154\b\17\1\2\u0151\u0152\7B\2\2\u0152"+
		"\u0154\b\17\1\2\u0153\u014f\3\2\2\2\u0153\u0151\3\2\2\2\u0154\u0155\3"+
		"\2\2\2\u0155\u0156\5\36\20\2\u0156\u0157\b\17\1\2\u0157\u0159\3\2\2\2"+
		"\u0158\u0153\3\2\2\2\u0159\u015c\3\2\2\2\u015a\u0158\3\2\2\2\u015a\u015b"+
		"\3\2\2\2\u015b\35\3\2\2\2\u015c\u015a\3\2\2\2\u015d\u015e\5 \21\2\u015e"+
		"\u0164\b\20\1\2\u015f\u0160\5&\24\2\u0160\u0161\b\20\1\2\u0161\u0162\5"+
		" \21\2\u0162\u0163\b\20\1\2\u0163\u0165\3\2\2\2\u0164\u015f\3\2\2\2\u0164"+
		"\u0165\3\2\2\2\u0165\37\3\2\2\2\u0166\u0167\5\"\22\2\u0167\u0173\b\21"+
		"\1\2\u0168\u0169\7D\2\2\u0169\u016d\b\21\1\2\u016a\u016b\7E\2\2\u016b"+
		"\u016d\b\21\1\2\u016c\u0168\3\2\2\2\u016c\u016a\3\2\2\2\u016d\u016e\3"+
		"\2\2\2\u016e\u016f\5\"\22\2\u016f\u0170\b\21\1\2\u0170\u0172\3\2\2\2\u0171"+
		"\u016c\3\2\2\2\u0172\u0175\3\2\2\2\u0173\u0171\3\2\2\2\u0173\u0174\3\2"+
		"\2\2\u0174!\3\2\2\2\u0175\u0173\3\2\2\2\u0176\u0177\5$\23\2\u0177\u0183"+
		"\b\22\1\2\u0178\u0179\7F\2\2\u0179\u017d\b\22\1\2\u017a\u017b\7G\2\2\u017b"+
		"\u017d\b\22\1\2\u017c\u0178\3\2\2\2\u017c\u017a\3\2\2\2\u017d\u017e\3"+
		"\2\2\2\u017e\u017f\5$\23\2\u017f\u0180\b\22\1\2\u0180\u0182\3\2\2\2\u0181"+
		"\u017c\3\2\2\2\u0182\u0185\3\2\2\2\u0183\u0181\3\2\2\2\u0183\u0184\3\2"+
		"\2\2\u0184#\3\2\2\2\u0185\u0183\3\2\2\2\u0186\u0187\78\2\2\u0187\u0188"+
		"\b\23\1\2\u0188\u0189\5\34\17\2\u0189\u018a\79\2\2\u018a\u018b\b\23\1"+
		"\2\u018b\u0191\3\2\2\2\u018c\u018e\t\3\2\2\u018d\u018c\3\2\2\2\u018d\u018e"+
		"\3\2\2\2\u018e\u018f\3\2\2\2\u018f\u0191\5\32\16\2\u0190\u0186\3\2\2\2"+
		"\u0190\u018d\3\2\2\2\u0191%\3\2\2\2\u0192\u0193\t\4\2\2\u0193\'\3\2\2"+
		"\2\u0194\u0196\7\6\2\2\u0195\u0197\5\34\17\2\u0196\u0195\3\2\2\2\u0196"+
		"\u0197\3\2\2\2\u0197\u0198\3\2\2\2\u0198\u0199\7\60\2\2\u0199)\3\2\2\2"+
		"\u019a\u019b\7J\2\2\u019b\u019c\b\26\1\2\u019c\u01a8\78\2\2\u019d\u019e"+
		"\5\34\17\2\u019e\u01a5\b\26\1\2\u019f\u01a0\7\62\2\2\u01a0\u01a1\5\34"+
		"\17\2\u01a1\u01a2\b\26\1\2\u01a2\u01a4\3\2\2\2\u01a3\u019f\3\2\2\2\u01a4"+
		"\u01a7\3\2\2\2\u01a5\u01a3\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6\u01a9\3\2"+
		"\2\2\u01a7\u01a5\3\2\2\2\u01a8\u019d\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9"+
		"\u01aa\3\2\2\2\u01aa\u01ab\79\2\2\u01ab\u01ac\b\26\1\2\u01ac\u01ad\7\60"+
		"\2\2\u01ad\u01ae\b\26\1\2\u01ae+\3\2\2\2\u01af\u01b0\7\t\2\2\u01b0\u01b1"+
		"\78\2\2\u01b1\u01b2\5\34\17\2\u01b2\u01b3\b\27\1\2\u01b3\u01b4\79\2\2"+
		"\u01b4\u01b5\5\n\6\2\u01b5\u01b6\b\27\1\2\u01b6-\3\2\2\2\u01b7\u01b8\7"+
		"\16\2\2\u01b8\u01b9\78\2\2\u01b9\u01ba\7L\2\2\u01ba\u01bb\79\2\2\u01bb"+
		"\u01bc\7\60\2\2\u01bc/\3\2\2\2\u01bd\u01be\7\17\2\2\u01be\u01bf\78\2\2"+
		"\u01bf\u01c0\7J\2\2\u01c0\u01c1\7\62\2\2\u01c1\u01c2\7L\2\2\u01c2\u01c3"+
		"\79\2\2\u01c3\u01c4\7\60\2\2\u01c4\61\3\2\2\2\u01c5\u01c6\7\21\2\2\u01c6"+
		"\u01c7\78\2\2\u01c7\u01c8\7J\2\2\u01c8\u01c9\7\62\2\2\u01c9\u01ca\t\5"+
		"\2\2\u01ca\u01cb\7\62\2\2\u01cb\u01cc\t\5\2\2\u01cc\u01cd\79\2\2\u01cd"+
		"\u01ce\7\60\2\2\u01ce\63\3\2\2\2\u01cf\u01d0\7\20\2\2\u01d0\u01d1\78\2"+
		"\2\u01d1\u01d2\7J\2\2\u01d2\u01d3\79\2\2\u01d3\u01d4\7\60\2\2\u01d4\65"+
		"\3\2\2\2\u01d5\u01d6\7\21\2\2\u01d6\u01d7\78\2\2\u01d7\u01d8\7J\2\2\u01d8"+
		"\u01d9\7\62\2\2\u01d9\u01da\t\5\2\2\u01da\u01db\79\2\2\u01db\u01dc\7\60"+
		"\2\2\u01dc\67\3\2\2\2\u01dd\u01de\7\23\2\2\u01de\u01df\78\2\2\u01df\u01e0"+
		"\7J\2\2\u01e0\u01e1\79\2\2\u01e1\u01e2\7\60\2\2\u01e29\3\2\2\2\u01e3\u01e4"+
		"\7\24\2\2\u01e4\u01e5\78\2\2\u01e5\u01e6\7J\2\2\u01e6\u01e8\7\62\2\2\u01e7"+
		"\u01e9\t\3\2\2\u01e8\u01e7\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9\u01ea\3\2"+
		"\2\2\u01ea\u01eb\t\6\2\2\u01eb\u01ed\7\62\2\2\u01ec\u01ee\t\3\2\2\u01ed"+
		"\u01ec\3\2\2\2\u01ed\u01ee\3\2\2\2\u01ee\u01ef\3\2\2\2\u01ef\u01f0\t\6"+
		"\2\2\u01f0\u01f1\79\2\2\u01f1\u01f2\7\60\2\2\u01f2;\3\2\2\2\u01f3\u01f4"+
		"\7\25\2\2\u01f4\u01f5\78\2\2\u01f5\u01f6\7J\2\2\u01f6\u01f7\7\62\2\2\u01f7"+
		"\u01f8\t\6\2\2\u01f8\u01f9\79\2\2\u01f9\u01fa\7\60\2\2\u01fa=\3\2\2\2"+
		"\u01fb\u01fc\7\26\2\2\u01fc\u01fd\78\2\2\u01fd\u01fe\7J\2\2\u01fe\u01ff"+
		"\7\62\2\2\u01ff\u0200\7J\2\2\u0200\u0201\79\2\2\u0201\u0202\7\60\2\2\u0202"+
		"?\3\2\2\2\u0203\u0204\7\27\2\2\u0204\u0205\78\2\2\u0205\u0206\7J\2\2\u0206"+
		"\u0207\7\62\2\2\u0207\u0208\7L\2\2\u0208\u0209\79\2\2\u0209\u020a\7\60"+
		"\2\2\u020aA\3\2\2\2\u020b\u020c\7\30\2\2\u020c\u020d\78\2\2\u020d\u020e"+
		"\7J\2\2\u020e\u020f\79\2\2\u020f\u0210\7\60\2\2\u0210C\3\2\2\2\u0211\u0212"+
		"\7\31\2\2\u0212\u0213\78\2\2\u0213\u0214\7L\2\2\u0214\u0215\79\2\2\u0215"+
		"\u0216\7\60\2\2\u0216E\3\2\2\2\u0217\u0218\7\32\2\2\u0218\u0219\78\2\2"+
		"\u0219\u021a\7L\2\2\u021a\u021b\79\2\2\u021b\u021c\7\60\2\2\u021cG\3\2"+
		"\2\2\u021d\u022b\5.\30\2\u021e\u022b\5\60\31\2\u021f\u022b\5\64\33\2\u0220"+
		"\u022b\5\62\32\2\u0221\u022b\5\66\34\2\u0222\u022b\58\35\2\u0223\u022b"+
		"\5:\36\2\u0224\u022b\5<\37\2\u0225\u022b\5> \2\u0226\u022b\5@!\2\u0227"+
		"\u022b\5B\"\2\u0228\u022b\5D#\2\u0229\u022b\5F$\2\u022a\u021d\3\2\2\2"+
		"\u022a\u021e\3\2\2\2\u022a\u021f\3\2\2\2\u022a\u0220\3\2\2\2\u022a\u0221"+
		"\3\2\2\2\u022a\u0222\3\2\2\2\u022a\u0223\3\2\2\2\u022a\u0224\3\2\2\2\u022a"+
		"\u0225\3\2\2\2\u022a\u0226\3\2\2\2\u022a\u0227\3\2\2\2\u022a\u0228\3\2"+
		"\2\2\u022a\u0229\3\2\2\2\u022bI\3\2\2\2+NTek{\u0086\u008a\u0098\u00a5"+
		"\u00a8\u00ae\u00b3\u00bb\u00c0\u00cc\u00d9\u00e6\u00fa\u00fd\u010b\u0115"+
		"\u011e\u012c\u013b\u0146\u014b\u0153\u015a\u0164\u016c\u0173\u017c\u0183"+
		"\u018d\u0190\u0196\u01a5\u01a8\u01e8\u01ed\u022a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}