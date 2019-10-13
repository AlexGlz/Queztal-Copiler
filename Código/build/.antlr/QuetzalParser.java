// Generated from c:\Users\alexg\Desktop\Proyecto Final Web\Queztal-Copiler\Código\build\Quetzal.g4 by ANTLR 4.7.1
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
		RULE_block = 4, RULE_types = 5, RULE_constants = 6, RULE_statute = 7, 
		RULE_assignation = 8, RULE_condition = 9, RULE_prints = 10, RULE_var_cte = 11, 
		RULE_expression = 12, RULE_exp = 13, RULE_term = 14, RULE_factor = 15, 
		RULE_logic_op = 16, RULE_read = 17, RULE_returning = 18, RULE_callfunc = 19, 
		RULE_loop = 20, RULE_openimg = 21, RULE_saveimg = 22, RULE_color_replace = 23, 
		RULE_grayscale = 24, RULE_color_filter = 25, RULE_edgeDetection = 26, 
		RULE_scaleImg = 27, RULE_getColorPalette = 28, RULE_colorMatchImage = 29, 
		RULE_encodeSteganography = 30, RULE_decodeSteganography = 31, RULE_getImageHeight = 32, 
		RULE_getImageWidth = 33, RULE_specfunct = 34;
	public static final String[] ruleNames = {
		"program", "main", "variables", "function", "block", "types", "constants", 
		"statute", "assignation", "condition", "prints", "var_cte", "expression", 
		"exp", "term", "factor", "logic_op", "read", "returning", "callfunc", 
		"loop", "openimg", "saveimg", "color_replace", "grayscale", "color_filter", 
		"edgeDetection", "scaleImg", "getColorPalette", "colorMatchImage", "encodeSteganography", 
		"decodeSteganography", "getImageHeight", "getImageWidth", "specfunct"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'program'", "'func'", "'define'", "'return'", "'if'", "'else'", 
		"'while'", "'prints'", "'read'", "'main'", "'void'", "'openImg'", "'saveImg'", 
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
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_DEFINE) {
				{
				{
				setState(70);
				variables();
				}
				}
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(79);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(76);
					function();
					}
					} 
				}
				setState(81);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(82);
			main();
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
		public VariablesContext variables() {
			return getRuleContext(VariablesContext.class,0);
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
			setState(84);
			match(TK_FUNC);
			setState(85);
			match(TK_MAIN);
			setState(86);
			match(SYM_PAREN_OPEN);
			setState(87);
			match(SYM_PAREN_CLOSE);
			setState(88);
			match(SYM_CURLY_BRACK_OPEN);
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_DEFINE) {
				{
				setState(89);
				variables();
				}
			}

			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_RETURN) | (1L << TK_IF) | (1L << TK_WHILE) | (1L << TK_PRINT) | (1L << TK_READ) | (1L << TK_OPENIMG) | (1L << TK_SAVEIMG) | (1L << TK_GRAYSCALE) | (1L << TK_COLOR_REPLACE) | (1L << TK_EDGE_DETECTION) | (1L << TK_SCALE_IMAGE) | (1L << TK_GET_COLOR_PALETTE) | (1L << TK_COLOR_MATCH_IMAGE) | (1L << TK_ENCODE_STEGANOGRAPHY) | (1L << TK_DECODE_STEGANOGRAPHY) | (1L << TK_GET_IMAGE_HEIGHT) | (1L << TK_GET_IMAGE_WIDTH))) != 0) || _la==TYPE_ID) {
				{
				{
				setState(92);
				statute();
				}
				}
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(98);
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

	public static class VariablesContext extends ParserRuleContext {
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
			setState(100);
			match(TK_DEFINE);
			setState(101);
			types();
			setState(102);
			match(TYPE_ID);
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SYM_ASSIGN) {
				{
				setState(103);
				match(SYM_ASSIGN);
				setState(104);
				expression();
				}
			}

			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SYM_COMMA) {
				{
				{
				setState(107);
				match(SYM_COMMA);
				setState(108);
				match(TYPE_ID);
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SYM_ASSIGN) {
					{
					setState(109);
					match(SYM_ASSIGN);
					setState(110);
					expression();
					}
				}

				}
				}
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(118);
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
		public TerminalNode TK_FUNC() { return getToken(QuetzalParser.TK_FUNC, 0); }
		public List<TerminalNode> TYPE_ID() { return getTokens(QuetzalParser.TYPE_ID); }
		public TerminalNode TYPE_ID(int i) {
			return getToken(QuetzalParser.TYPE_ID, i);
		}
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
			setState(120);
			match(TK_FUNC);
			setState(123);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_BOOL:
			case TK_INT:
			case TK_FLOAT:
			case TK_COLOR:
				{
				setState(121);
				types();
				}
				break;
			case TK_VOID:
				{
				setState(122);
				match(TK_VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(125);
			match(TYPE_ID);
			setState(126);
			match(SYM_PAREN_OPEN);
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_BOOL) | (1L << TK_INT) | (1L << TK_FLOAT) | (1L << TK_COLOR))) != 0)) {
				{
				setState(127);
				types();
				setState(128);
				match(TYPE_ID);
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SYM_COMMA) {
					{
					{
					setState(129);
					match(SYM_COMMA);
					setState(130);
					types();
					setState(131);
					match(TYPE_ID);
					}
					}
					setState(137);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(140);
			match(SYM_PAREN_CLOSE);
			setState(141);
			match(SYM_CURLY_BRACK_OPEN);
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_DEFINE) {
				{
				setState(142);
				variables();
				}
			}

			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_RETURN) | (1L << TK_IF) | (1L << TK_WHILE) | (1L << TK_PRINT) | (1L << TK_READ) | (1L << TK_OPENIMG) | (1L << TK_SAVEIMG) | (1L << TK_GRAYSCALE) | (1L << TK_COLOR_REPLACE) | (1L << TK_EDGE_DETECTION) | (1L << TK_SCALE_IMAGE) | (1L << TK_GET_COLOR_PALETTE) | (1L << TK_COLOR_MATCH_IMAGE) | (1L << TK_ENCODE_STEGANOGRAPHY) | (1L << TK_DECODE_STEGANOGRAPHY) | (1L << TK_GET_IMAGE_HEIGHT) | (1L << TK_GET_IMAGE_WIDTH))) != 0) || _la==TYPE_ID) {
				{
				{
				setState(145);
				statute();
				}
				}
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(151);
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
			setState(153);
			match(SYM_CURLY_BRACK_OPEN);
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_DEFINE) {
				{
				setState(154);
				variables();
				}
			}

			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_RETURN) | (1L << TK_IF) | (1L << TK_WHILE) | (1L << TK_PRINT) | (1L << TK_READ) | (1L << TK_OPENIMG) | (1L << TK_SAVEIMG) | (1L << TK_GRAYSCALE) | (1L << TK_COLOR_REPLACE) | (1L << TK_EDGE_DETECTION) | (1L << TK_SCALE_IMAGE) | (1L << TK_GET_COLOR_PALETTE) | (1L << TK_COLOR_MATCH_IMAGE) | (1L << TK_ENCODE_STEGANOGRAPHY) | (1L << TK_DECODE_STEGANOGRAPHY) | (1L << TK_GET_IMAGE_HEIGHT) | (1L << TK_GET_IMAGE_WIDTH))) != 0) || _la==TYPE_ID) {
				{
				{
				setState(157);
				statute();
				}
				}
				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(163);
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
			setState(165);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_BOOL) | (1L << TK_INT) | (1L << TK_FLOAT) | (1L << TK_COLOR))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SYM_SQUARE_BRACK_OPEN) {
				{
				{
				setState(166);
				match(SYM_SQUARE_BRACK_OPEN);
				setState(167);
				expression();
				setState(168);
				match(SYM_SQUARE_BRACK_CLOSE);
				}
				}
				setState(174);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			_la = _input.LA(1);
			if ( !(((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (TYPE_FLOAT - 70)) | (1L << (TYPE_INT - 70)) | (1L << (TYPE_COLOR - 70)) | (1L << (CTE_TAG - 70)) | (1L << (TYPE_BOOL - 70)))) != 0)) ) {
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
		enterRule(_localctx, 14, RULE_statute);
		try {
			setState(185);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(177);
				returning();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(178);
				condition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(179);
				loop();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(180);
				prints();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(181);
				read();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(182);
				callfunc();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(183);
				specfunct();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(184);
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
		enterRule(_localctx, 16, RULE_assignation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(TYPE_ID);
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SYM_SQUARE_BRACK_OPEN) {
				{
				{
				setState(188);
				match(SYM_SQUARE_BRACK_OPEN);
				setState(189);
				expression();
				setState(190);
				match(SYM_SQUARE_BRACK_CLOSE);
				}
				}
				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(197);
			match(SYM_ASSIGN);
			setState(202);
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
				setState(198);
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
				setState(199);
				expression();
				setState(200);
				match(SYM_SEMI_COL);
				}
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
		enterRule(_localctx, 18, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(TK_IF);
			setState(205);
			match(SYM_PAREN_OPEN);
			setState(206);
			expression();
			setState(207);
			match(SYM_PAREN_CLOSE);
			setState(208);
			block();
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_ELSE) {
				{
				setState(209);
				match(TK_ELSE);
				setState(210);
				block();
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

	public static class PrintsContext extends ParserRuleContext {
		public TerminalNode TK_PRINT() { return getToken(QuetzalParser.TK_PRINT, 0); }
		public TerminalNode SYM_PAREN_OPEN() { return getToken(QuetzalParser.SYM_PAREN_OPEN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SYM_PAREN_CLOSE() { return getToken(QuetzalParser.SYM_PAREN_CLOSE, 0); }
		public TerminalNode SYM_SEMI_COL() { return getToken(QuetzalParser.SYM_SEMI_COL, 0); }
		public PrintsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prints; }
	}

	public final PrintsContext prints() throws RecognitionException {
		PrintsContext _localctx = new PrintsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_prints);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(TK_PRINT);
			setState(214);
			match(SYM_PAREN_OPEN);
			setState(215);
			expression();
			setState(216);
			match(SYM_PAREN_CLOSE);
			setState(217);
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
		enterRule(_localctx, 22, RULE_var_cte);
		int _la;
		try {
			setState(242);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(219);
				constants();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(220);
				match(TYPE_ID);
				setState(227);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SYM_SQUARE_BRACK_OPEN) {
					{
					{
					setState(221);
					match(SYM_SQUARE_BRACK_OPEN);
					setState(222);
					expression();
					setState(223);
					match(SYM_SQUARE_BRACK_CLOSE);
					}
					}
					setState(229);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(230);
				match(TYPE_ID);
				setState(231);
				match(SYM_PAREN_OPEN);
				setState(232);
				expression();
				setState(237);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SYM_COMMA) {
					{
					{
					setState(233);
					match(SYM_COMMA);
					setState(234);
					expression();
					}
					}
					setState(239);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(240);
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
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public List<Logic_opContext> logic_op() {
			return getRuleContexts(Logic_opContext.class);
		}
		public Logic_opContext logic_op(int i) {
			return getRuleContext(Logic_opContext.class,i);
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
		enterRule(_localctx, 24, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			exp();
			setState(248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SYM_EQUAL) | (1L << SYM_GRE_THAN) | (1L << SYM_LOW_THAN) | (1L << SYM_NOT_EQUAL) | (1L << SYM_GRE_EQ) | (1L << SYM_LOW_EQ))) != 0)) {
				{
				setState(245);
				logic_op();
				setState(246);
				exp();
				}
			}

			setState(259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SYM_OR || _la==SYM_AND) {
				{
				{
				setState(250);
				_la = _input.LA(1);
				if ( !(_la==SYM_OR || _la==SYM_AND) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(251);
				exp();
				setState(255);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SYM_EQUAL) | (1L << SYM_GRE_THAN) | (1L << SYM_LOW_THAN) | (1L << SYM_NOT_EQUAL) | (1L << SYM_GRE_EQ) | (1L << SYM_LOW_EQ))) != 0)) {
					{
					setState(252);
					logic_op();
					setState(253);
					exp();
					}
				}

				}
				}
				setState(261);
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
		enterRule(_localctx, 26, RULE_exp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			term();
			setState(267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SYM_PLUS || _la==SYM_MINUS) {
				{
				{
				setState(263);
				_la = _input.LA(1);
				if ( !(_la==SYM_PLUS || _la==SYM_MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(264);
				term();
				}
				}
				setState(269);
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
		enterRule(_localctx, 28, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			factor();
			setState(275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SYM_MULT || _la==SYM_DIV) {
				{
				{
				setState(271);
				_la = _input.LA(1);
				if ( !(_la==SYM_MULT || _la==SYM_DIV) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(272);
				factor();
				}
				}
				setState(277);
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
		enterRule(_localctx, 30, RULE_factor);
		int _la;
		try {
			setState(286);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SYM_PAREN_OPEN:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(278);
				match(SYM_PAREN_OPEN);
				setState(279);
				expression();
				setState(280);
				match(SYM_PAREN_CLOSE);
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
				setState(283);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SYM_PLUS || _la==SYM_MINUS) {
					{
					setState(282);
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

				setState(285);
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
		enterRule(_localctx, 32, RULE_logic_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
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

	public static class ReadContext extends ParserRuleContext {
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
		enterRule(_localctx, 34, RULE_read);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			match(TK_READ);
			setState(291);
			match(SYM_PAREN_OPEN);
			setState(292);
			match(TYPE_ID);
			setState(302);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SYM_SQUARE_BRACK_OPEN) {
				{
				setState(293);
				match(SYM_SQUARE_BRACK_OPEN);
				setState(294);
				expression();
				setState(295);
				match(SYM_SQUARE_BRACK_CLOSE);
				setState(300);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SYM_SQUARE_BRACK_OPEN) {
					{
					setState(296);
					match(SYM_SQUARE_BRACK_OPEN);
					setState(297);
					expression();
					setState(298);
					match(SYM_SQUARE_BRACK_CLOSE);
					}
				}

				}
			}

			setState(304);
			match(SYM_PAREN_CLOSE);
			setState(305);
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
		enterRule(_localctx, 36, RULE_returning);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			match(TK_RETURN);
			setState(309);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 54)) & ~0x3f) == 0 && ((1L << (_la - 54)) & ((1L << (SYM_PAREN_OPEN - 54)) | (1L << (SYM_PLUS - 54)) | (1L << (SYM_MINUS - 54)) | (1L << (TYPE_FLOAT - 54)) | (1L << (TYPE_INT - 54)) | (1L << (TYPE_ID - 54)) | (1L << (TYPE_COLOR - 54)) | (1L << (CTE_TAG - 54)) | (1L << (TYPE_BOOL - 54)))) != 0)) {
				{
				setState(308);
				expression();
				}
			}

			setState(311);
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
		enterRule(_localctx, 38, RULE_callfunc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			match(TYPE_ID);
			setState(314);
			match(SYM_PAREN_OPEN);
			setState(323);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 54)) & ~0x3f) == 0 && ((1L << (_la - 54)) & ((1L << (SYM_PAREN_OPEN - 54)) | (1L << (SYM_PLUS - 54)) | (1L << (SYM_MINUS - 54)) | (1L << (TYPE_FLOAT - 54)) | (1L << (TYPE_INT - 54)) | (1L << (TYPE_ID - 54)) | (1L << (TYPE_COLOR - 54)) | (1L << (CTE_TAG - 54)) | (1L << (TYPE_BOOL - 54)))) != 0)) {
				{
				setState(315);
				expression();
				setState(320);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SYM_COMMA) {
					{
					{
					setState(316);
					match(SYM_COMMA);
					setState(317);
					expression();
					}
					}
					setState(322);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(325);
			match(SYM_PAREN_CLOSE);
			setState(326);
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
		enterRule(_localctx, 40, RULE_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			match(TK_WHILE);
			setState(329);
			match(SYM_PAREN_OPEN);
			setState(330);
			expression();
			setState(331);
			match(SYM_PAREN_CLOSE);
			setState(332);
			block();
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
		enterRule(_localctx, 42, RULE_openimg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			match(TK_OPENIMG);
			setState(335);
			match(SYM_PAREN_OPEN);
			setState(336);
			match(CTE_TAG);
			setState(337);
			match(SYM_PAREN_CLOSE);
			setState(338);
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
		enterRule(_localctx, 44, RULE_saveimg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			match(TK_SAVEIMG);
			setState(341);
			match(SYM_PAREN_OPEN);
			setState(342);
			match(TYPE_ID);
			setState(343);
			match(SYM_COMMA);
			setState(344);
			match(CTE_TAG);
			setState(345);
			match(SYM_PAREN_CLOSE);
			setState(346);
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
		enterRule(_localctx, 46, RULE_color_replace);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			match(TK_COLOR_REPLACE);
			setState(349);
			match(SYM_PAREN_OPEN);
			setState(350);
			match(TYPE_ID);
			setState(351);
			match(SYM_COMMA);
			setState(352);
			_la = _input.LA(1);
			if ( !(_la==TYPE_ID || _la==TYPE_COLOR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(353);
			match(SYM_COMMA);
			setState(354);
			_la = _input.LA(1);
			if ( !(_la==TYPE_ID || _la==TYPE_COLOR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(355);
			match(SYM_PAREN_CLOSE);
			setState(356);
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
		enterRule(_localctx, 48, RULE_grayscale);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			match(TK_GRAYSCALE);
			setState(359);
			match(SYM_PAREN_OPEN);
			setState(360);
			match(TYPE_ID);
			setState(361);
			match(SYM_PAREN_CLOSE);
			setState(362);
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
		enterRule(_localctx, 50, RULE_color_filter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			match(TK_COLOR_REPLACE);
			setState(365);
			match(SYM_PAREN_OPEN);
			setState(366);
			match(TYPE_ID);
			setState(367);
			match(SYM_COMMA);
			setState(368);
			_la = _input.LA(1);
			if ( !(_la==TYPE_ID || _la==TYPE_COLOR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(369);
			match(SYM_PAREN_CLOSE);
			setState(370);
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
		enterRule(_localctx, 52, RULE_edgeDetection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			match(TK_EDGE_DETECTION);
			setState(373);
			match(SYM_PAREN_OPEN);
			setState(374);
			match(TYPE_ID);
			setState(375);
			match(SYM_PAREN_CLOSE);
			setState(376);
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
		enterRule(_localctx, 54, RULE_scaleImg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			match(TK_SCALE_IMAGE);
			setState(379);
			match(SYM_PAREN_OPEN);
			setState(380);
			match(TYPE_ID);
			setState(381);
			match(SYM_COMMA);
			setState(383);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SYM_PLUS || _la==SYM_MINUS) {
				{
				setState(382);
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

			setState(385);
			_la = _input.LA(1);
			if ( !(_la==TYPE_FLOAT || _la==TYPE_ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(386);
			match(SYM_COMMA);
			setState(388);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SYM_PLUS || _la==SYM_MINUS) {
				{
				setState(387);
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

			setState(390);
			_la = _input.LA(1);
			if ( !(_la==TYPE_FLOAT || _la==TYPE_ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(391);
			match(SYM_PAREN_CLOSE);
			setState(392);
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
		enterRule(_localctx, 56, RULE_getColorPalette);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			match(TK_GET_COLOR_PALETTE);
			setState(395);
			match(SYM_PAREN_OPEN);
			setState(396);
			match(TYPE_ID);
			setState(397);
			match(SYM_COMMA);
			setState(398);
			_la = _input.LA(1);
			if ( !(_la==TYPE_FLOAT || _la==TYPE_ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(399);
			match(SYM_PAREN_CLOSE);
			setState(400);
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
		enterRule(_localctx, 58, RULE_colorMatchImage);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402);
			match(TK_COLOR_MATCH_IMAGE);
			setState(403);
			match(SYM_PAREN_OPEN);
			setState(404);
			match(TYPE_ID);
			setState(405);
			match(SYM_COMMA);
			setState(406);
			match(TYPE_ID);
			setState(407);
			match(SYM_PAREN_CLOSE);
			setState(408);
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
		enterRule(_localctx, 60, RULE_encodeSteganography);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
			match(TK_ENCODE_STEGANOGRAPHY);
			setState(411);
			match(SYM_PAREN_OPEN);
			setState(412);
			match(TYPE_ID);
			setState(413);
			match(SYM_COMMA);
			setState(414);
			match(CTE_TAG);
			setState(415);
			match(SYM_PAREN_CLOSE);
			setState(416);
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
		enterRule(_localctx, 62, RULE_decodeSteganography);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(418);
			match(TK_DECODE_STEGANOGRAPHY);
			setState(419);
			match(SYM_PAREN_OPEN);
			setState(420);
			match(TYPE_ID);
			setState(421);
			match(SYM_PAREN_CLOSE);
			setState(422);
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
		enterRule(_localctx, 64, RULE_getImageHeight);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
			match(TK_GET_IMAGE_HEIGHT);
			setState(425);
			match(SYM_PAREN_OPEN);
			setState(426);
			match(CTE_TAG);
			setState(427);
			match(SYM_PAREN_CLOSE);
			setState(428);
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
		enterRule(_localctx, 66, RULE_getImageWidth);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(430);
			match(TK_GET_IMAGE_WIDTH);
			setState(431);
			match(SYM_PAREN_OPEN);
			setState(432);
			match(CTE_TAG);
			setState(433);
			match(SYM_PAREN_CLOSE);
			setState(434);
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
		enterRule(_localctx, 68, RULE_specfunct);
		try {
			setState(449);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(436);
				openimg();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(437);
				saveimg();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(438);
				grayscale();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(439);
				color_replace();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(440);
				color_filter();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(441);
				edgeDetection();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(442);
				scaleImg();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(443);
				getColorPalette();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(444);
				colorMatchImage();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(445);
				encodeSteganography();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(446);
				decodeSteganography();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(447);
				getImageHeight();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(448);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3Q\u01c6\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\3\2\7\2J\n\2\f\2\16\2M\13\2\3\2\7\2P\n\2\f\2\16"+
		"\2S\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3]\n\3\3\3\7\3`\n\3\f\3\16"+
		"\3c\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\5\4l\n\4\3\4\3\4\3\4\3\4\5\4r\n\4"+
		"\7\4t\n\4\f\4\16\4w\13\4\3\4\3\4\3\5\3\5\3\5\5\5~\n\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\7\5\u0088\n\5\f\5\16\5\u008b\13\5\5\5\u008d\n\5\3\5\3"+
		"\5\3\5\5\5\u0092\n\5\3\5\7\5\u0095\n\5\f\5\16\5\u0098\13\5\3\5\3\5\3\6"+
		"\3\6\5\6\u009e\n\6\3\6\7\6\u00a1\n\6\f\6\16\6\u00a4\13\6\3\6\3\6\3\7\3"+
		"\7\3\7\3\7\3\7\7\7\u00ad\n\7\f\7\16\7\u00b0\13\7\3\b\3\b\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\5\t\u00bc\n\t\3\n\3\n\3\n\3\n\3\n\7\n\u00c3\n\n\f\n"+
		"\16\n\u00c6\13\n\3\n\3\n\3\n\3\n\3\n\5\n\u00cd\n\n\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\5\13\u00d6\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\7\r\u00e4\n\r\f\r\16\r\u00e7\13\r\3\r\3\r\3\r\3\r\3\r\7\r\u00ee"+
		"\n\r\f\r\16\r\u00f1\13\r\3\r\3\r\5\r\u00f5\n\r\3\16\3\16\3\16\3\16\5\16"+
		"\u00fb\n\16\3\16\3\16\3\16\3\16\3\16\5\16\u0102\n\16\7\16\u0104\n\16\f"+
		"\16\16\16\u0107\13\16\3\17\3\17\3\17\7\17\u010c\n\17\f\17\16\17\u010f"+
		"\13\17\3\20\3\20\3\20\7\20\u0114\n\20\f\20\16\20\u0117\13\20\3\21\3\21"+
		"\3\21\3\21\3\21\5\21\u011e\n\21\3\21\5\21\u0121\n\21\3\22\3\22\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u012f\n\23\5\23\u0131"+
		"\n\23\3\23\3\23\3\23\3\24\3\24\5\24\u0138\n\24\3\24\3\24\3\25\3\25\3\25"+
		"\3\25\3\25\7\25\u0141\n\25\f\25\16\25\u0144\13\25\5\25\u0146\n\25\3\25"+
		"\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35"+
		"\3\35\5\35\u0182\n\35\3\35\3\35\3\35\5\35\u0187\n\35\3\35\3\35\3\35\3"+
		"\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3"+
		"\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3"+
		"\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\5"+
		"$\u01c4\n$\3$\2\2%\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60"+
		"\62\64\668:<>@BDF\2\n\3\2\33\36\4\2HIKM\3\2AB\3\2DE\3\2FG\3\2;@\3\2JK"+
		"\4\2HHJJ\2\u01d9\2K\3\2\2\2\4V\3\2\2\2\6f\3\2\2\2\bz\3\2\2\2\n\u009b\3"+
		"\2\2\2\f\u00a7\3\2\2\2\16\u00b1\3\2\2\2\20\u00bb\3\2\2\2\22\u00bd\3\2"+
		"\2\2\24\u00ce\3\2\2\2\26\u00d7\3\2\2\2\30\u00f4\3\2\2\2\32\u00f6\3\2\2"+
		"\2\34\u0108\3\2\2\2\36\u0110\3\2\2\2 \u0120\3\2\2\2\"\u0122\3\2\2\2$\u0124"+
		"\3\2\2\2&\u0135\3\2\2\2(\u013b\3\2\2\2*\u014a\3\2\2\2,\u0150\3\2\2\2."+
		"\u0156\3\2\2\2\60\u015e\3\2\2\2\62\u0168\3\2\2\2\64\u016e\3\2\2\2\66\u0176"+
		"\3\2\2\28\u017c\3\2\2\2:\u018c\3\2\2\2<\u0194\3\2\2\2>\u019c\3\2\2\2@"+
		"\u01a4\3\2\2\2B\u01aa\3\2\2\2D\u01b0\3\2\2\2F\u01c3\3\2\2\2HJ\5\6\4\2"+
		"IH\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2LQ\3\2\2\2MK\3\2\2\2NP\5\b\5\2"+
		"ON\3\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2RT\3\2\2\2SQ\3\2\2\2TU\5\4\3\2"+
		"U\3\3\2\2\2VW\7\4\2\2WX\7\f\2\2XY\78\2\2YZ\79\2\2Z\\\7\64\2\2[]\5\6\4"+
		"\2\\[\3\2\2\2\\]\3\2\2\2]a\3\2\2\2^`\5\20\t\2_^\3\2\2\2`c\3\2\2\2a_\3"+
		"\2\2\2ab\3\2\2\2bd\3\2\2\2ca\3\2\2\2de\7\65\2\2e\5\3\2\2\2fg\7\5\2\2g"+
		"h\5\f\7\2hk\7J\2\2ij\7:\2\2jl\5\32\16\2ki\3\2\2\2kl\3\2\2\2lu\3\2\2\2"+
		"mn\7\62\2\2nq\7J\2\2op\7:\2\2pr\5\32\16\2qo\3\2\2\2qr\3\2\2\2rt\3\2\2"+
		"\2sm\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3\2\2\2vx\3\2\2\2wu\3\2\2\2xy\7\60"+
		"\2\2y\7\3\2\2\2z}\7\4\2\2{~\5\f\7\2|~\7\r\2\2}{\3\2\2\2}|\3\2\2\2~\177"+
		"\3\2\2\2\177\u0080\7J\2\2\u0080\u008c\78\2\2\u0081\u0082\5\f\7\2\u0082"+
		"\u0089\7J\2\2\u0083\u0084\7\62\2\2\u0084\u0085\5\f\7\2\u0085\u0086\7J"+
		"\2\2\u0086\u0088\3\2\2\2\u0087\u0083\3\2\2\2\u0088\u008b\3\2\2\2\u0089"+
		"\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008d\3\2\2\2\u008b\u0089\3\2"+
		"\2\2\u008c\u0081\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008e\3\2\2\2\u008e"+
		"\u008f\79\2\2\u008f\u0091\7\64\2\2\u0090\u0092\5\6\4\2\u0091\u0090\3\2"+
		"\2\2\u0091\u0092\3\2\2\2\u0092\u0096\3\2\2\2\u0093\u0095\5\20\t\2\u0094"+
		"\u0093\3\2\2\2\u0095\u0098\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2"+
		"\2\2\u0097\u0099\3\2\2\2\u0098\u0096\3\2\2\2\u0099\u009a\7\65\2\2\u009a"+
		"\t\3\2\2\2\u009b\u009d\7\64\2\2\u009c\u009e\5\6\4\2\u009d\u009c\3\2\2"+
		"\2\u009d\u009e\3\2\2\2\u009e\u00a2\3\2\2\2\u009f\u00a1\5\20\t\2\u00a0"+
		"\u009f\3\2\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2"+
		"\2\2\u00a3\u00a5\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5\u00a6\7\65\2\2\u00a6"+
		"\13\3\2\2\2\u00a7\u00ae\t\2\2\2\u00a8\u00a9\7\66\2\2\u00a9\u00aa\5\32"+
		"\16\2\u00aa\u00ab\7\67\2\2\u00ab\u00ad\3\2\2\2\u00ac\u00a8\3\2\2\2\u00ad"+
		"\u00b0\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\r\3\2\2\2"+
		"\u00b0\u00ae\3\2\2\2\u00b1\u00b2\t\3\2\2\u00b2\17\3\2\2\2\u00b3\u00bc"+
		"\5&\24\2\u00b4\u00bc\5\24\13\2\u00b5\u00bc\5*\26\2\u00b6\u00bc\5\26\f"+
		"\2\u00b7\u00bc\5$\23\2\u00b8\u00bc\5(\25\2\u00b9\u00bc\5F$\2\u00ba\u00bc"+
		"\5\22\n\2\u00bb\u00b3\3\2\2\2\u00bb\u00b4\3\2\2\2\u00bb\u00b5\3\2\2\2"+
		"\u00bb\u00b6\3\2\2\2\u00bb\u00b7\3\2\2\2\u00bb\u00b8\3\2\2\2\u00bb\u00b9"+
		"\3\2\2\2\u00bb\u00ba\3\2\2\2\u00bc\21\3\2\2\2\u00bd\u00c4\7J\2\2\u00be"+
		"\u00bf\7\66\2\2\u00bf\u00c0\5\32\16\2\u00c0\u00c1\7\67\2\2\u00c1\u00c3"+
		"\3\2\2\2\u00c2\u00be\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4"+
		"\u00c5\3\2\2\2\u00c5\u00c7\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c7\u00cc\7:"+
		"\2\2\u00c8\u00cd\5F$\2\u00c9\u00ca\5\32\16\2\u00ca\u00cb\7\60\2\2\u00cb"+
		"\u00cd\3\2\2\2\u00cc\u00c8\3\2\2\2\u00cc\u00c9\3\2\2\2\u00cd\23\3\2\2"+
		"\2\u00ce\u00cf\7\7\2\2\u00cf\u00d0\78\2\2\u00d0\u00d1\5\32\16\2\u00d1"+
		"\u00d2\79\2\2\u00d2\u00d5\5\n\6\2\u00d3\u00d4\7\b\2\2\u00d4\u00d6\5\n"+
		"\6\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\25\3\2\2\2\u00d7\u00d8"+
		"\7\n\2\2\u00d8\u00d9\78\2\2\u00d9\u00da\5\32\16\2\u00da\u00db\79\2\2\u00db"+
		"\u00dc\7\60\2\2\u00dc\27\3\2\2\2\u00dd\u00f5\5\16\b\2\u00de\u00e5\7J\2"+
		"\2\u00df\u00e0\7\66\2\2\u00e0\u00e1\5\32\16\2\u00e1\u00e2\7\67\2\2\u00e2"+
		"\u00e4\3\2\2\2\u00e3\u00df\3\2\2\2\u00e4\u00e7\3\2\2\2\u00e5\u00e3\3\2"+
		"\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00f5\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e8"+
		"\u00e9\7J\2\2\u00e9\u00ea\78\2\2\u00ea\u00ef\5\32\16\2\u00eb\u00ec\7\62"+
		"\2\2\u00ec\u00ee\5\32\16\2\u00ed\u00eb\3\2\2\2\u00ee\u00f1\3\2\2\2\u00ef"+
		"\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f2\3\2\2\2\u00f1\u00ef\3\2"+
		"\2\2\u00f2\u00f3\79\2\2\u00f3\u00f5\3\2\2\2\u00f4\u00dd\3\2\2\2\u00f4"+
		"\u00de\3\2\2\2\u00f4\u00e8\3\2\2\2\u00f5\31\3\2\2\2\u00f6\u00fa\5\34\17"+
		"\2\u00f7\u00f8\5\"\22\2\u00f8\u00f9\5\34\17\2\u00f9\u00fb\3\2\2\2\u00fa"+
		"\u00f7\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u0105\3\2\2\2\u00fc\u00fd\t\4"+
		"\2\2\u00fd\u0101\5\34\17\2\u00fe\u00ff\5\"\22\2\u00ff\u0100\5\34\17\2"+
		"\u0100\u0102\3\2\2\2\u0101\u00fe\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0104"+
		"\3\2\2\2\u0103\u00fc\3\2\2\2\u0104\u0107\3\2\2\2\u0105\u0103\3\2\2\2\u0105"+
		"\u0106\3\2\2\2\u0106\33\3\2\2\2\u0107\u0105\3\2\2\2\u0108\u010d\5\36\20"+
		"\2\u0109\u010a\t\5\2\2\u010a\u010c\5\36\20\2\u010b\u0109\3\2\2\2\u010c"+
		"\u010f\3\2\2\2\u010d\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e\35\3\2\2"+
		"\2\u010f\u010d\3\2\2\2\u0110\u0115\5 \21\2\u0111\u0112\t\6\2\2\u0112\u0114"+
		"\5 \21\2\u0113\u0111\3\2\2\2\u0114\u0117\3\2\2\2\u0115\u0113\3\2\2\2\u0115"+
		"\u0116\3\2\2\2\u0116\37\3\2\2\2\u0117\u0115\3\2\2\2\u0118\u0119\78\2\2"+
		"\u0119\u011a\5\32\16\2\u011a\u011b\79\2\2\u011b\u0121\3\2\2\2\u011c\u011e"+
		"\t\5\2\2\u011d\u011c\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u011f\3\2\2\2\u011f"+
		"\u0121\5\30\r\2\u0120\u0118\3\2\2\2\u0120\u011d\3\2\2\2\u0121!\3\2\2\2"+
		"\u0122\u0123\t\7\2\2\u0123#\3\2\2\2\u0124\u0125\7\13\2\2\u0125\u0126\7"+
		"8\2\2\u0126\u0130\7J\2\2\u0127\u0128\7\66\2\2\u0128\u0129\5\32\16\2\u0129"+
		"\u012e\7\67\2\2\u012a\u012b\7\66\2\2\u012b\u012c\5\32\16\2\u012c\u012d"+
		"\7\67\2\2\u012d\u012f\3\2\2\2\u012e\u012a\3\2\2\2\u012e\u012f\3\2\2\2"+
		"\u012f\u0131\3\2\2\2\u0130\u0127\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u0132"+
		"\3\2\2\2\u0132\u0133\79\2\2\u0133\u0134\7\60\2\2\u0134%\3\2\2\2\u0135"+
		"\u0137\7\6\2\2\u0136\u0138\5\32\16\2\u0137\u0136\3\2\2\2\u0137\u0138\3"+
		"\2\2\2\u0138\u0139\3\2\2\2\u0139\u013a\7\60\2\2\u013a\'\3\2\2\2\u013b"+
		"\u013c\7J\2\2\u013c\u0145\78\2\2\u013d\u0142\5\32\16\2\u013e\u013f\7\62"+
		"\2\2\u013f\u0141\5\32\16\2\u0140\u013e\3\2\2\2\u0141\u0144\3\2\2\2\u0142"+
		"\u0140\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0146\3\2\2\2\u0144\u0142\3\2"+
		"\2\2\u0145\u013d\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0147\3\2\2\2\u0147"+
		"\u0148\79\2\2\u0148\u0149\7\60\2\2\u0149)\3\2\2\2\u014a\u014b\7\t\2\2"+
		"\u014b\u014c\78\2\2\u014c\u014d\5\32\16\2\u014d\u014e\79\2\2\u014e\u014f"+
		"\5\n\6\2\u014f+\3\2\2\2\u0150\u0151\7\16\2\2\u0151\u0152\78\2\2\u0152"+
		"\u0153\7L\2\2\u0153\u0154\79\2\2\u0154\u0155\7\60\2\2\u0155-\3\2\2\2\u0156"+
		"\u0157\7\17\2\2\u0157\u0158\78\2\2\u0158\u0159\7J\2\2\u0159\u015a\7\62"+
		"\2\2\u015a\u015b\7L\2\2\u015b\u015c\79\2\2\u015c\u015d\7\60\2\2\u015d"+
		"/\3\2\2\2\u015e\u015f\7\21\2\2\u015f\u0160\78\2\2\u0160\u0161\7J\2\2\u0161"+
		"\u0162\7\62\2\2\u0162\u0163\t\b\2\2\u0163\u0164\7\62\2\2\u0164\u0165\t"+
		"\b\2\2\u0165\u0166\79\2\2\u0166\u0167\7\60\2\2\u0167\61\3\2\2\2\u0168"+
		"\u0169\7\20\2\2\u0169\u016a\78\2\2\u016a\u016b\7J\2\2\u016b\u016c\79\2"+
		"\2\u016c\u016d\7\60\2\2\u016d\63\3\2\2\2\u016e\u016f\7\21\2\2\u016f\u0170"+
		"\78\2\2\u0170\u0171\7J\2\2\u0171\u0172\7\62\2\2\u0172\u0173\t\b\2\2\u0173"+
		"\u0174\79\2\2\u0174\u0175\7\60\2\2\u0175\65\3\2\2\2\u0176\u0177\7\23\2"+
		"\2\u0177\u0178\78\2\2\u0178\u0179\7J\2\2\u0179\u017a\79\2\2\u017a\u017b"+
		"\7\60\2\2\u017b\67\3\2\2\2\u017c\u017d\7\24\2\2\u017d\u017e\78\2\2\u017e"+
		"\u017f\7J\2\2\u017f\u0181\7\62\2\2\u0180\u0182\t\5\2\2\u0181\u0180\3\2"+
		"\2\2\u0181\u0182\3\2\2\2\u0182\u0183\3\2\2\2\u0183\u0184\t\t\2\2\u0184"+
		"\u0186\7\62\2\2\u0185\u0187\t\5\2\2\u0186\u0185\3\2\2\2\u0186\u0187\3"+
		"\2\2\2\u0187\u0188\3\2\2\2\u0188\u0189\t\t\2\2\u0189\u018a\79\2\2\u018a"+
		"\u018b\7\60\2\2\u018b9\3\2\2\2\u018c\u018d\7\25\2\2\u018d\u018e\78\2\2"+
		"\u018e\u018f\7J\2\2\u018f\u0190\7\62\2\2\u0190\u0191\t\t\2\2\u0191\u0192"+
		"\79\2\2\u0192\u0193\7\60\2\2\u0193;\3\2\2\2\u0194\u0195\7\26\2\2\u0195"+
		"\u0196\78\2\2\u0196\u0197\7J\2\2\u0197\u0198\7\62\2\2\u0198\u0199\7J\2"+
		"\2\u0199\u019a\79\2\2\u019a\u019b\7\60\2\2\u019b=\3\2\2\2\u019c\u019d"+
		"\7\27\2\2\u019d\u019e\78\2\2\u019e\u019f\7J\2\2\u019f\u01a0\7\62\2\2\u01a0"+
		"\u01a1\7L\2\2\u01a1\u01a2\79\2\2\u01a2\u01a3\7\60\2\2\u01a3?\3\2\2\2\u01a4"+
		"\u01a5\7\30\2\2\u01a5\u01a6\78\2\2\u01a6\u01a7\7J\2\2\u01a7\u01a8\79\2"+
		"\2\u01a8\u01a9\7\60\2\2\u01a9A\3\2\2\2\u01aa\u01ab\7\31\2\2\u01ab\u01ac"+
		"\78\2\2\u01ac\u01ad\7L\2\2\u01ad\u01ae\79\2\2\u01ae\u01af\7\60\2\2\u01af"+
		"C\3\2\2\2\u01b0\u01b1\7\32\2\2\u01b1\u01b2\78\2\2\u01b2\u01b3\7L\2\2\u01b3"+
		"\u01b4\79\2\2\u01b4\u01b5\7\60\2\2\u01b5E\3\2\2\2\u01b6\u01c4\5,\27\2"+
		"\u01b7\u01c4\5.\30\2\u01b8\u01c4\5\62\32\2\u01b9\u01c4\5\60\31\2\u01ba"+
		"\u01c4\5\64\33\2\u01bb\u01c4\5\66\34\2\u01bc\u01c4\58\35\2\u01bd\u01c4"+
		"\5:\36\2\u01be\u01c4\5<\37\2\u01bf\u01c4\5> \2\u01c0\u01c4\5@!\2\u01c1"+
		"\u01c4\5B\"\2\u01c2\u01c4\5D#\2\u01c3\u01b6\3\2\2\2\u01c3\u01b7\3\2\2"+
		"\2\u01c3\u01b8\3\2\2\2\u01c3\u01b9\3\2\2\2\u01c3\u01ba\3\2\2\2\u01c3\u01bb"+
		"\3\2\2\2\u01c3\u01bc\3\2\2\2\u01c3\u01bd\3\2\2\2\u01c3\u01be\3\2\2\2\u01c3"+
		"\u01bf\3\2\2\2\u01c3\u01c0\3\2\2\2\u01c3\u01c1\3\2\2\2\u01c3\u01c2\3\2"+
		"\2\2\u01c4G\3\2\2\2\'KQ\\akqu}\u0089\u008c\u0091\u0096\u009d\u00a2\u00ae"+
		"\u00bb\u00c4\u00cc\u00d5\u00e5\u00ef\u00f4\u00fa\u0101\u0105\u010d\u0115"+
		"\u011d\u0120\u012e\u0130\u0137\u0142\u0145\u0181\u0186\u01c3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}