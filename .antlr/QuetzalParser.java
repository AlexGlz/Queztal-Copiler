// Generated from c:\Users\alexg\Desktop\Proyecto Final Web\Queztal-Copiler\Quetzal.g4 by ANTLR 4.7.1
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
		public VariablesContext variables() {
			return getRuleContext(VariablesContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_DEFINE) {
				{
				setState(70);
				variables();
				}
			}

			setState(74);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(73);
				function();
				}
				break;
			}
			setState(76);
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
			setState(78);
			match(TK_FUNC);
			setState(79);
			match(TK_MAIN);
			setState(80);
			match(SYM_PAREN_OPEN);
			setState(81);
			match(SYM_PAREN_CLOSE);
			setState(82);
			match(SYM_CURLY_BRACK_OPEN);
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_DEFINE) {
				{
				setState(83);
				variables();
				}
			}

			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_RETURN) | (1L << TK_IF) | (1L << TK_WHILE) | (1L << TK_PRINT) | (1L << TK_READ) | (1L << TK_OPENIMG) | (1L << TK_SAVEIMG) | (1L << TK_GRAYSCALE) | (1L << TK_COLOR_REPLACE) | (1L << TK_EDGE_DETECTION) | (1L << TK_SCALE_IMAGE) | (1L << TK_GET_COLOR_PALETTE) | (1L << TK_COLOR_MATCH_IMAGE) | (1L << TK_ENCODE_STEGANOGRAPHY) | (1L << TK_DECODE_STEGANOGRAPHY) | (1L << TK_GET_IMAGE_HEIGHT) | (1L << TK_GET_IMAGE_WIDTH))) != 0) || _la==TYPE_ID) {
				{
				{
				setState(86);
				statute();
				}
				}
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(92);
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
		public List<TerminalNode> TK_DEFINE() { return getTokens(QuetzalParser.TK_DEFINE); }
		public TerminalNode TK_DEFINE(int i) {
			return getToken(QuetzalParser.TK_DEFINE, i);
		}
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
		public List<TerminalNode> SYM_SEMI_COL() { return getTokens(QuetzalParser.SYM_SEMI_COL); }
		public TerminalNode SYM_SEMI_COL(int i) {
			return getToken(QuetzalParser.SYM_SEMI_COL, i);
		}
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
			setState(114); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(94);
				match(TK_DEFINE);
				setState(95);
				types();
				setState(96);
				match(TYPE_ID);
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SYM_ASSIGN) {
					{
					setState(97);
					match(SYM_ASSIGN);
					setState(98);
					expression();
					}
				}

				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SYM_COMMA) {
					{
					{
					setState(101);
					match(SYM_COMMA);
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

					}
					}
					setState(111);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(112);
				match(SYM_SEMI_COL);
				}
				}
				setState(116); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TK_DEFINE );
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
			setState(118);
			match(TK_FUNC);
			setState(121);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_BOOL:
			case TK_INT:
			case TK_FLOAT:
			case TK_COLOR:
				{
				setState(119);
				types();
				}
				break;
			case TK_VOID:
				{
				setState(120);
				match(TK_VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(123);
			match(TYPE_ID);
			setState(124);
			match(SYM_PAREN_OPEN);
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_BOOL) | (1L << TK_INT) | (1L << TK_FLOAT) | (1L << TK_COLOR))) != 0)) {
				{
				setState(125);
				types();
				setState(126);
				match(TYPE_ID);
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SYM_COMMA) {
					{
					{
					setState(127);
					match(SYM_COMMA);
					setState(128);
					types();
					setState(129);
					match(TYPE_ID);
					}
					}
					setState(135);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(138);
			match(SYM_PAREN_CLOSE);
			setState(139);
			match(SYM_CURLY_BRACK_OPEN);
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_DEFINE) {
				{
				setState(140);
				variables();
				}
			}

			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_RETURN) | (1L << TK_IF) | (1L << TK_WHILE) | (1L << TK_PRINT) | (1L << TK_READ) | (1L << TK_OPENIMG) | (1L << TK_SAVEIMG) | (1L << TK_GRAYSCALE) | (1L << TK_COLOR_REPLACE) | (1L << TK_EDGE_DETECTION) | (1L << TK_SCALE_IMAGE) | (1L << TK_GET_COLOR_PALETTE) | (1L << TK_COLOR_MATCH_IMAGE) | (1L << TK_ENCODE_STEGANOGRAPHY) | (1L << TK_DECODE_STEGANOGRAPHY) | (1L << TK_GET_IMAGE_HEIGHT) | (1L << TK_GET_IMAGE_WIDTH))) != 0) || _la==TYPE_ID) {
				{
				{
				setState(143);
				statute();
				}
				}
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(149);
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
			setState(151);
			match(SYM_CURLY_BRACK_OPEN);
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_DEFINE) {
				{
				setState(152);
				variables();
				}
			}

			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_RETURN) | (1L << TK_IF) | (1L << TK_WHILE) | (1L << TK_PRINT) | (1L << TK_READ) | (1L << TK_OPENIMG) | (1L << TK_SAVEIMG) | (1L << TK_GRAYSCALE) | (1L << TK_COLOR_REPLACE) | (1L << TK_EDGE_DETECTION) | (1L << TK_SCALE_IMAGE) | (1L << TK_GET_COLOR_PALETTE) | (1L << TK_COLOR_MATCH_IMAGE) | (1L << TK_ENCODE_STEGANOGRAPHY) | (1L << TK_DECODE_STEGANOGRAPHY) | (1L << TK_GET_IMAGE_HEIGHT) | (1L << TK_GET_IMAGE_WIDTH))) != 0) || _la==TYPE_ID) {
				{
				{
				setState(155);
				statute();
				}
				}
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(161);
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
			setState(163);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_BOOL) | (1L << TK_INT) | (1L << TK_FLOAT) | (1L << TK_COLOR))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SYM_SQUARE_BRACK_OPEN) {
				{
				{
				setState(164);
				match(SYM_SQUARE_BRACK_OPEN);
				setState(165);
				expression();
				setState(166);
				match(SYM_SQUARE_BRACK_CLOSE);
				}
				}
				setState(172);
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
			setState(173);
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
			setState(183);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(175);
				returning();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(176);
				condition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(177);
				loop();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(178);
				prints();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(179);
				read();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(180);
				callfunc();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(181);
				specfunct();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(182);
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
			setState(185);
			match(TYPE_ID);
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SYM_SQUARE_BRACK_OPEN) {
				{
				{
				setState(186);
				match(SYM_SQUARE_BRACK_OPEN);
				setState(187);
				expression();
				setState(188);
				match(SYM_SQUARE_BRACK_CLOSE);
				}
				}
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(195);
			match(SYM_ASSIGN);
			setState(200);
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
				setState(196);
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
				setState(197);
				expression();
				setState(198);
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
			setState(202);
			match(TK_IF);
			setState(203);
			match(SYM_PAREN_OPEN);
			setState(204);
			expression();
			setState(205);
			match(SYM_PAREN_CLOSE);
			setState(206);
			block();
			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_ELSE) {
				{
				setState(207);
				match(TK_ELSE);
				setState(208);
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
			setState(211);
			match(TK_PRINT);
			setState(212);
			match(SYM_PAREN_OPEN);
			setState(213);
			expression();
			setState(214);
			match(SYM_PAREN_CLOSE);
			setState(215);
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
			setState(240);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(217);
				constants();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(218);
				match(TYPE_ID);
				setState(225);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SYM_SQUARE_BRACK_OPEN) {
					{
					{
					setState(219);
					match(SYM_SQUARE_BRACK_OPEN);
					setState(220);
					expression();
					setState(221);
					match(SYM_SQUARE_BRACK_CLOSE);
					}
					}
					setState(227);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(228);
				match(TYPE_ID);
				setState(229);
				match(SYM_PAREN_OPEN);
				setState(230);
				expression();
				setState(235);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SYM_COMMA) {
					{
					{
					setState(231);
					match(SYM_COMMA);
					setState(232);
					expression();
					}
					}
					setState(237);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(238);
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
			setState(242);
			exp();
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SYM_EQUAL) | (1L << SYM_GRE_THAN) | (1L << SYM_LOW_THAN) | (1L << SYM_NOT_EQUAL) | (1L << SYM_GRE_EQ) | (1L << SYM_LOW_EQ))) != 0)) {
				{
				setState(243);
				logic_op();
				setState(244);
				exp();
				}
			}

			setState(257);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SYM_OR || _la==SYM_AND) {
				{
				{
				setState(248);
				_la = _input.LA(1);
				if ( !(_la==SYM_OR || _la==SYM_AND) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(249);
				exp();
				setState(253);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SYM_EQUAL) | (1L << SYM_GRE_THAN) | (1L << SYM_LOW_THAN) | (1L << SYM_NOT_EQUAL) | (1L << SYM_GRE_EQ) | (1L << SYM_LOW_EQ))) != 0)) {
					{
					setState(250);
					logic_op();
					setState(251);
					exp();
					}
				}

				}
				}
				setState(259);
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
			setState(260);
			term();
			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SYM_PLUS || _la==SYM_MINUS) {
				{
				{
				setState(261);
				_la = _input.LA(1);
				if ( !(_la==SYM_PLUS || _la==SYM_MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(262);
				term();
				}
				}
				setState(267);
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
			setState(268);
			factor();
			setState(273);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SYM_MULT || _la==SYM_DIV) {
				{
				{
				setState(269);
				_la = _input.LA(1);
				if ( !(_la==SYM_MULT || _la==SYM_DIV) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(270);
				factor();
				}
				}
				setState(275);
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
			setState(284);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SYM_PAREN_OPEN:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(276);
				match(SYM_PAREN_OPEN);
				setState(277);
				expression();
				setState(278);
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
				setState(281);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SYM_PLUS || _la==SYM_MINUS) {
					{
					setState(280);
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

				setState(283);
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
			setState(286);
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
			setState(288);
			match(TK_READ);
			setState(289);
			match(SYM_PAREN_OPEN);
			setState(290);
			match(TYPE_ID);
			setState(300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SYM_SQUARE_BRACK_OPEN) {
				{
				setState(291);
				match(SYM_SQUARE_BRACK_OPEN);
				setState(292);
				expression();
				setState(293);
				match(SYM_SQUARE_BRACK_CLOSE);
				setState(298);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SYM_SQUARE_BRACK_OPEN) {
					{
					setState(294);
					match(SYM_SQUARE_BRACK_OPEN);
					setState(295);
					expression();
					setState(296);
					match(SYM_SQUARE_BRACK_CLOSE);
					}
				}

				}
			}

			setState(302);
			match(SYM_PAREN_CLOSE);
			setState(303);
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
			setState(305);
			match(TK_RETURN);
			setState(307);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 54)) & ~0x3f) == 0 && ((1L << (_la - 54)) & ((1L << (SYM_PAREN_OPEN - 54)) | (1L << (SYM_PLUS - 54)) | (1L << (SYM_MINUS - 54)) | (1L << (TYPE_FLOAT - 54)) | (1L << (TYPE_INT - 54)) | (1L << (TYPE_ID - 54)) | (1L << (TYPE_COLOR - 54)) | (1L << (CTE_TAG - 54)) | (1L << (TYPE_BOOL - 54)))) != 0)) {
				{
				setState(306);
				expression();
				}
			}

			setState(309);
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
			setState(311);
			match(TYPE_ID);
			setState(312);
			match(SYM_PAREN_OPEN);
			setState(321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 54)) & ~0x3f) == 0 && ((1L << (_la - 54)) & ((1L << (SYM_PAREN_OPEN - 54)) | (1L << (SYM_PLUS - 54)) | (1L << (SYM_MINUS - 54)) | (1L << (TYPE_FLOAT - 54)) | (1L << (TYPE_INT - 54)) | (1L << (TYPE_ID - 54)) | (1L << (TYPE_COLOR - 54)) | (1L << (CTE_TAG - 54)) | (1L << (TYPE_BOOL - 54)))) != 0)) {
				{
				setState(313);
				expression();
				setState(318);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SYM_COMMA) {
					{
					{
					setState(314);
					match(SYM_COMMA);
					setState(315);
					expression();
					}
					}
					setState(320);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(323);
			match(SYM_PAREN_CLOSE);
			setState(324);
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
			setState(326);
			match(TK_WHILE);
			setState(327);
			match(SYM_PAREN_OPEN);
			setState(328);
			expression();
			setState(329);
			match(SYM_PAREN_CLOSE);
			setState(330);
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
			setState(332);
			match(TK_OPENIMG);
			setState(333);
			match(SYM_PAREN_OPEN);
			setState(334);
			match(CTE_TAG);
			setState(335);
			match(SYM_PAREN_CLOSE);
			setState(336);
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
			setState(338);
			match(TK_SAVEIMG);
			setState(339);
			match(SYM_PAREN_OPEN);
			setState(340);
			match(TYPE_ID);
			setState(341);
			match(SYM_COMMA);
			setState(342);
			match(CTE_TAG);
			setState(343);
			match(SYM_PAREN_CLOSE);
			setState(344);
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
			setState(346);
			match(TK_COLOR_REPLACE);
			setState(347);
			match(SYM_PAREN_OPEN);
			setState(348);
			match(TYPE_ID);
			setState(349);
			match(SYM_COMMA);
			setState(350);
			_la = _input.LA(1);
			if ( !(_la==TYPE_ID || _la==TYPE_COLOR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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
			match(SYM_PAREN_CLOSE);
			setState(354);
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
			setState(356);
			match(TK_GRAYSCALE);
			setState(357);
			match(SYM_PAREN_OPEN);
			setState(358);
			match(TYPE_ID);
			setState(359);
			match(SYM_PAREN_CLOSE);
			setState(360);
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
			setState(362);
			match(TK_COLOR_REPLACE);
			setState(363);
			match(SYM_PAREN_OPEN);
			setState(364);
			match(TYPE_ID);
			setState(365);
			match(SYM_COMMA);
			setState(366);
			_la = _input.LA(1);
			if ( !(_la==TYPE_ID || _la==TYPE_COLOR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(367);
			match(SYM_PAREN_CLOSE);
			setState(368);
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
			setState(370);
			match(TK_EDGE_DETECTION);
			setState(371);
			match(SYM_PAREN_OPEN);
			setState(372);
			match(TYPE_ID);
			setState(373);
			match(SYM_PAREN_CLOSE);
			setState(374);
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
			setState(376);
			match(TK_SCALE_IMAGE);
			setState(377);
			match(SYM_PAREN_OPEN);
			setState(378);
			match(TYPE_ID);
			setState(379);
			match(SYM_COMMA);
			setState(381);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SYM_PLUS || _la==SYM_MINUS) {
				{
				setState(380);
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

			setState(383);
			_la = _input.LA(1);
			if ( !(_la==TYPE_FLOAT || _la==TYPE_ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(384);
			match(SYM_COMMA);
			setState(386);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SYM_PLUS || _la==SYM_MINUS) {
				{
				setState(385);
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

			setState(388);
			_la = _input.LA(1);
			if ( !(_la==TYPE_FLOAT || _la==TYPE_ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(389);
			match(SYM_PAREN_CLOSE);
			setState(390);
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
			setState(392);
			match(TK_GET_COLOR_PALETTE);
			setState(393);
			match(SYM_PAREN_OPEN);
			setState(394);
			match(TYPE_ID);
			setState(395);
			match(SYM_COMMA);
			setState(396);
			_la = _input.LA(1);
			if ( !(_la==TYPE_FLOAT || _la==TYPE_ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(397);
			match(SYM_PAREN_CLOSE);
			setState(398);
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
			setState(400);
			match(TK_COLOR_MATCH_IMAGE);
			setState(401);
			match(SYM_PAREN_OPEN);
			setState(402);
			match(TYPE_ID);
			setState(403);
			match(SYM_COMMA);
			setState(404);
			match(TYPE_ID);
			setState(405);
			match(SYM_PAREN_CLOSE);
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
			setState(408);
			match(TK_ENCODE_STEGANOGRAPHY);
			setState(409);
			match(SYM_PAREN_OPEN);
			setState(410);
			match(TYPE_ID);
			setState(411);
			match(SYM_COMMA);
			setState(412);
			match(CTE_TAG);
			setState(413);
			match(SYM_PAREN_CLOSE);
			setState(414);
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
			setState(416);
			match(TK_DECODE_STEGANOGRAPHY);
			setState(417);
			match(SYM_PAREN_OPEN);
			setState(418);
			match(TYPE_ID);
			setState(419);
			match(SYM_PAREN_CLOSE);
			setState(420);
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
			setState(422);
			match(TK_GET_IMAGE_HEIGHT);
			setState(423);
			match(SYM_PAREN_OPEN);
			setState(424);
			match(CTE_TAG);
			setState(425);
			match(SYM_PAREN_CLOSE);
			setState(426);
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
			setState(428);
			match(TK_GET_IMAGE_WIDTH);
			setState(429);
			match(SYM_PAREN_OPEN);
			setState(430);
			match(CTE_TAG);
			setState(431);
			match(SYM_PAREN_CLOSE);
			setState(432);
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
			setState(447);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(434);
				openimg();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(435);
				saveimg();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(436);
				grayscale();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(437);
				color_replace();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(438);
				color_filter();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(439);
				edgeDetection();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(440);
				scaleImg();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(441);
				getColorPalette();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(442);
				colorMatchImage();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(443);
				encodeSteganography();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(444);
				decodeSteganography();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(445);
				getImageHeight();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(446);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3Q\u01c4\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\3\2\5\2J\n\2\3\2\5\2M\n\2\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\5\3W\n\3\3\3\7\3Z\n\3\f\3\16\3]\13\3\3\3\3\3\3\4\3\4\3\4"+
		"\3\4\3\4\5\4f\n\4\3\4\3\4\3\4\3\4\5\4l\n\4\7\4n\n\4\f\4\16\4q\13\4\3\4"+
		"\3\4\6\4u\n\4\r\4\16\4v\3\5\3\5\3\5\5\5|\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\7\5\u0086\n\5\f\5\16\5\u0089\13\5\5\5\u008b\n\5\3\5\3\5\3\5\5\5"+
		"\u0090\n\5\3\5\7\5\u0093\n\5\f\5\16\5\u0096\13\5\3\5\3\5\3\6\3\6\5\6\u009c"+
		"\n\6\3\6\7\6\u009f\n\6\f\6\16\6\u00a2\13\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7"+
		"\7\7\u00ab\n\7\f\7\16\7\u00ae\13\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\5\t\u00ba\n\t\3\n\3\n\3\n\3\n\3\n\7\n\u00c1\n\n\f\n\16\n\u00c4\13"+
		"\n\3\n\3\n\3\n\3\n\3\n\5\n\u00cb\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\5\13\u00d4\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00e2"+
		"\n\r\f\r\16\r\u00e5\13\r\3\r\3\r\3\r\3\r\3\r\7\r\u00ec\n\r\f\r\16\r\u00ef"+
		"\13\r\3\r\3\r\5\r\u00f3\n\r\3\16\3\16\3\16\3\16\5\16\u00f9\n\16\3\16\3"+
		"\16\3\16\3\16\3\16\5\16\u0100\n\16\7\16\u0102\n\16\f\16\16\16\u0105\13"+
		"\16\3\17\3\17\3\17\7\17\u010a\n\17\f\17\16\17\u010d\13\17\3\20\3\20\3"+
		"\20\7\20\u0112\n\20\f\20\16\20\u0115\13\20\3\21\3\21\3\21\3\21\3\21\5"+
		"\21\u011c\n\21\3\21\5\21\u011f\n\21\3\22\3\22\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\5\23\u012d\n\23\5\23\u012f\n\23\3\23\3\23\3"+
		"\23\3\24\3\24\5\24\u0136\n\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\7\25"+
		"\u013f\n\25\f\25\16\25\u0142\13\25\5\25\u0144\n\25\3\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\5\35\u0180"+
		"\n\35\3\35\3\35\3\35\5\35\u0185\n\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3"+
		" \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3"+
		"#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u01c2\n$\3$\2\2%"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDF\2"+
		"\n\3\2\33\36\4\2HIKM\3\2AB\3\2DE\3\2FG\3\2;@\3\2JK\4\2HHJJ\2\u01d8\2I"+
		"\3\2\2\2\4P\3\2\2\2\6t\3\2\2\2\bx\3\2\2\2\n\u0099\3\2\2\2\f\u00a5\3\2"+
		"\2\2\16\u00af\3\2\2\2\20\u00b9\3\2\2\2\22\u00bb\3\2\2\2\24\u00cc\3\2\2"+
		"\2\26\u00d5\3\2\2\2\30\u00f2\3\2\2\2\32\u00f4\3\2\2\2\34\u0106\3\2\2\2"+
		"\36\u010e\3\2\2\2 \u011e\3\2\2\2\"\u0120\3\2\2\2$\u0122\3\2\2\2&\u0133"+
		"\3\2\2\2(\u0139\3\2\2\2*\u0148\3\2\2\2,\u014e\3\2\2\2.\u0154\3\2\2\2\60"+
		"\u015c\3\2\2\2\62\u0166\3\2\2\2\64\u016c\3\2\2\2\66\u0174\3\2\2\28\u017a"+
		"\3\2\2\2:\u018a\3\2\2\2<\u0192\3\2\2\2>\u019a\3\2\2\2@\u01a2\3\2\2\2B"+
		"\u01a8\3\2\2\2D\u01ae\3\2\2\2F\u01c1\3\2\2\2HJ\5\6\4\2IH\3\2\2\2IJ\3\2"+
		"\2\2JL\3\2\2\2KM\5\b\5\2LK\3\2\2\2LM\3\2\2\2MN\3\2\2\2NO\5\4\3\2O\3\3"+
		"\2\2\2PQ\7\4\2\2QR\7\f\2\2RS\78\2\2ST\79\2\2TV\7\64\2\2UW\5\6\4\2VU\3"+
		"\2\2\2VW\3\2\2\2W[\3\2\2\2XZ\5\20\t\2YX\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\"+
		"\3\2\2\2\\^\3\2\2\2][\3\2\2\2^_\7\65\2\2_\5\3\2\2\2`a\7\5\2\2ab\5\f\7"+
		"\2be\7J\2\2cd\7:\2\2df\5\32\16\2ec\3\2\2\2ef\3\2\2\2fo\3\2\2\2gh\7\62"+
		"\2\2hk\7J\2\2ij\7:\2\2jl\5\32\16\2ki\3\2\2\2kl\3\2\2\2ln\3\2\2\2mg\3\2"+
		"\2\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2pr\3\2\2\2qo\3\2\2\2rs\7\60\2\2su\3"+
		"\2\2\2t`\3\2\2\2uv\3\2\2\2vt\3\2\2\2vw\3\2\2\2w\7\3\2\2\2x{\7\4\2\2y|"+
		"\5\f\7\2z|\7\r\2\2{y\3\2\2\2{z\3\2\2\2|}\3\2\2\2}~\7J\2\2~\u008a\78\2"+
		"\2\177\u0080\5\f\7\2\u0080\u0087\7J\2\2\u0081\u0082\7\62\2\2\u0082\u0083"+
		"\5\f\7\2\u0083\u0084\7J\2\2\u0084\u0086\3\2\2\2\u0085\u0081\3\2\2\2\u0086"+
		"\u0089\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u008b\3\2"+
		"\2\2\u0089\u0087\3\2\2\2\u008a\177\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008c"+
		"\3\2\2\2\u008c\u008d\79\2\2\u008d\u008f\7\64\2\2\u008e\u0090\5\6\4\2\u008f"+
		"\u008e\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0094\3\2\2\2\u0091\u0093\5\20"+
		"\t\2\u0092\u0091\3\2\2\2\u0093\u0096\3\2\2\2\u0094\u0092\3\2\2\2\u0094"+
		"\u0095\3\2\2\2\u0095\u0097\3\2\2\2\u0096\u0094\3\2\2\2\u0097\u0098\7\65"+
		"\2\2\u0098\t\3\2\2\2\u0099\u009b\7\64\2\2\u009a\u009c\5\6\4\2\u009b\u009a"+
		"\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u00a0\3\2\2\2\u009d\u009f\5\20\t\2"+
		"\u009e\u009d\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1"+
		"\3\2\2\2\u00a1\u00a3\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3\u00a4\7\65\2\2"+
		"\u00a4\13\3\2\2\2\u00a5\u00ac\t\2\2\2\u00a6\u00a7\7\66\2\2\u00a7\u00a8"+
		"\5\32\16\2\u00a8\u00a9\7\67\2\2\u00a9\u00ab\3\2\2\2\u00aa\u00a6\3\2\2"+
		"\2\u00ab\u00ae\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\r"+
		"\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af\u00b0\t\3\2\2\u00b0\17\3\2\2\2\u00b1"+
		"\u00ba\5&\24\2\u00b2\u00ba\5\24\13\2\u00b3\u00ba\5*\26\2\u00b4\u00ba\5"+
		"\26\f\2\u00b5\u00ba\5$\23\2\u00b6\u00ba\5(\25\2\u00b7\u00ba\5F$\2\u00b8"+
		"\u00ba\5\22\n\2\u00b9\u00b1\3\2\2\2\u00b9\u00b2\3\2\2\2\u00b9\u00b3\3"+
		"\2\2\2\u00b9\u00b4\3\2\2\2\u00b9\u00b5\3\2\2\2\u00b9\u00b6\3\2\2\2\u00b9"+
		"\u00b7\3\2\2\2\u00b9\u00b8\3\2\2\2\u00ba\21\3\2\2\2\u00bb\u00c2\7J\2\2"+
		"\u00bc\u00bd\7\66\2\2\u00bd\u00be\5\32\16\2\u00be\u00bf\7\67\2\2\u00bf"+
		"\u00c1\3\2\2\2\u00c0\u00bc\3\2\2\2\u00c1\u00c4\3\2\2\2\u00c2\u00c0\3\2"+
		"\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c5\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c5"+
		"\u00ca\7:\2\2\u00c6\u00cb\5F$\2\u00c7\u00c8\5\32\16\2\u00c8\u00c9\7\60"+
		"\2\2\u00c9\u00cb\3\2\2\2\u00ca\u00c6\3\2\2\2\u00ca\u00c7\3\2\2\2\u00cb"+
		"\23\3\2\2\2\u00cc\u00cd\7\7\2\2\u00cd\u00ce\78\2\2\u00ce\u00cf\5\32\16"+
		"\2\u00cf\u00d0\79\2\2\u00d0\u00d3\5\n\6\2\u00d1\u00d2\7\b\2\2\u00d2\u00d4"+
		"\5\n\6\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\25\3\2\2\2\u00d5"+
		"\u00d6\7\n\2\2\u00d6\u00d7\78\2\2\u00d7\u00d8\5\32\16\2\u00d8\u00d9\7"+
		"9\2\2\u00d9\u00da\7\60\2\2\u00da\27\3\2\2\2\u00db\u00f3\5\16\b\2\u00dc"+
		"\u00e3\7J\2\2\u00dd\u00de\7\66\2\2\u00de\u00df\5\32\16\2\u00df\u00e0\7"+
		"\67\2\2\u00e0\u00e2\3\2\2\2\u00e1\u00dd\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3"+
		"\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00f3\3\2\2\2\u00e5\u00e3\3\2"+
		"\2\2\u00e6\u00e7\7J\2\2\u00e7\u00e8\78\2\2\u00e8\u00ed\5\32\16\2\u00e9"+
		"\u00ea\7\62\2\2\u00ea\u00ec\5\32\16\2\u00eb\u00e9\3\2\2\2\u00ec\u00ef"+
		"\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00f0\3\2\2\2\u00ef"+
		"\u00ed\3\2\2\2\u00f0\u00f1\79\2\2\u00f1\u00f3\3\2\2\2\u00f2\u00db\3\2"+
		"\2\2\u00f2\u00dc\3\2\2\2\u00f2\u00e6\3\2\2\2\u00f3\31\3\2\2\2\u00f4\u00f8"+
		"\5\34\17\2\u00f5\u00f6\5\"\22\2\u00f6\u00f7\5\34\17\2\u00f7\u00f9\3\2"+
		"\2\2\u00f8\u00f5\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u0103\3\2\2\2\u00fa"+
		"\u00fb\t\4\2\2\u00fb\u00ff\5\34\17\2\u00fc\u00fd\5\"\22\2\u00fd\u00fe"+
		"\5\34\17\2\u00fe\u0100\3\2\2\2\u00ff\u00fc\3\2\2\2\u00ff\u0100\3\2\2\2"+
		"\u0100\u0102\3\2\2\2\u0101\u00fa\3\2\2\2\u0102\u0105\3\2\2\2\u0103\u0101"+
		"\3\2\2\2\u0103\u0104\3\2\2\2\u0104\33\3\2\2\2\u0105\u0103\3\2\2\2\u0106"+
		"\u010b\5\36\20\2\u0107\u0108\t\5\2\2\u0108\u010a\5\36\20\2\u0109\u0107"+
		"\3\2\2\2\u010a\u010d\3\2\2\2\u010b\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c"+
		"\35\3\2\2\2\u010d\u010b\3\2\2\2\u010e\u0113\5 \21\2\u010f\u0110\t\6\2"+
		"\2\u0110\u0112\5 \21\2\u0111\u010f\3\2\2\2\u0112\u0115\3\2\2\2\u0113\u0111"+
		"\3\2\2\2\u0113\u0114\3\2\2\2\u0114\37\3\2\2\2\u0115\u0113\3\2\2\2\u0116"+
		"\u0117\78\2\2\u0117\u0118\5\32\16\2\u0118\u0119\79\2\2\u0119\u011f\3\2"+
		"\2\2\u011a\u011c\t\5\2\2\u011b\u011a\3\2\2\2\u011b\u011c\3\2\2\2\u011c"+
		"\u011d\3\2\2\2\u011d\u011f\5\30\r\2\u011e\u0116\3\2\2\2\u011e\u011b\3"+
		"\2\2\2\u011f!\3\2\2\2\u0120\u0121\t\7\2\2\u0121#\3\2\2\2\u0122\u0123\7"+
		"\13\2\2\u0123\u0124\78\2\2\u0124\u012e\7J\2\2\u0125\u0126\7\66\2\2\u0126"+
		"\u0127\5\32\16\2\u0127\u012c\7\67\2\2\u0128\u0129\7\66\2\2\u0129\u012a"+
		"\5\32\16\2\u012a\u012b\7\67\2\2\u012b\u012d\3\2\2\2\u012c\u0128\3\2\2"+
		"\2\u012c\u012d\3\2\2\2\u012d\u012f\3\2\2\2\u012e\u0125\3\2\2\2\u012e\u012f"+
		"\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0131\79\2\2\u0131\u0132\7\60\2\2\u0132"+
		"%\3\2\2\2\u0133\u0135\7\6\2\2\u0134\u0136\5\32\16\2\u0135\u0134\3\2\2"+
		"\2\u0135\u0136\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0138\7\60\2\2\u0138"+
		"\'\3\2\2\2\u0139\u013a\7J\2\2\u013a\u0143\78\2\2\u013b\u0140\5\32\16\2"+
		"\u013c\u013d\7\62\2\2\u013d\u013f\5\32\16\2\u013e\u013c\3\2\2\2\u013f"+
		"\u0142\3\2\2\2\u0140\u013e\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u0144\3\2"+
		"\2\2\u0142\u0140\3\2\2\2\u0143\u013b\3\2\2\2\u0143\u0144\3\2\2\2\u0144"+
		"\u0145\3\2\2\2\u0145\u0146\79\2\2\u0146\u0147\7\60\2\2\u0147)\3\2\2\2"+
		"\u0148\u0149\7\t\2\2\u0149\u014a\78\2\2\u014a\u014b\5\32\16\2\u014b\u014c"+
		"\79\2\2\u014c\u014d\5\n\6\2\u014d+\3\2\2\2\u014e\u014f\7\16\2\2\u014f"+
		"\u0150\78\2\2\u0150\u0151\7L\2\2\u0151\u0152\79\2\2\u0152\u0153\7\60\2"+
		"\2\u0153-\3\2\2\2\u0154\u0155\7\17\2\2\u0155\u0156\78\2\2\u0156\u0157"+
		"\7J\2\2\u0157\u0158\7\62\2\2\u0158\u0159\7L\2\2\u0159\u015a\79\2\2\u015a"+
		"\u015b\7\60\2\2\u015b/\3\2\2\2\u015c\u015d\7\21\2\2\u015d\u015e\78\2\2"+
		"\u015e\u015f\7J\2\2\u015f\u0160\7\62\2\2\u0160\u0161\t\b\2\2\u0161\u0162"+
		"\7\62\2\2\u0162\u0163\t\b\2\2\u0163\u0164\79\2\2\u0164\u0165\7\60\2\2"+
		"\u0165\61\3\2\2\2\u0166\u0167\7\20\2\2\u0167\u0168\78\2\2\u0168\u0169"+
		"\7J\2\2\u0169\u016a\79\2\2\u016a\u016b\7\60\2\2\u016b\63\3\2\2\2\u016c"+
		"\u016d\7\21\2\2\u016d\u016e\78\2\2\u016e\u016f\7J\2\2\u016f\u0170\7\62"+
		"\2\2\u0170\u0171\t\b\2\2\u0171\u0172\79\2\2\u0172\u0173\7\60\2\2\u0173"+
		"\65\3\2\2\2\u0174\u0175\7\23\2\2\u0175\u0176\78\2\2\u0176\u0177\7J\2\2"+
		"\u0177\u0178\79\2\2\u0178\u0179\7\60\2\2\u0179\67\3\2\2\2\u017a\u017b"+
		"\7\24\2\2\u017b\u017c\78\2\2\u017c\u017d\7J\2\2\u017d\u017f\7\62\2\2\u017e"+
		"\u0180\t\5\2\2\u017f\u017e\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u0181\3\2"+
		"\2\2\u0181\u0182\t\t\2\2\u0182\u0184\7\62\2\2\u0183\u0185\t\5\2\2\u0184"+
		"\u0183\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u0186\3\2\2\2\u0186\u0187\t\t"+
		"\2\2\u0187\u0188\79\2\2\u0188\u0189\7\60\2\2\u01899\3\2\2\2\u018a\u018b"+
		"\7\25\2\2\u018b\u018c\78\2\2\u018c\u018d\7J\2\2\u018d\u018e\7\62\2\2\u018e"+
		"\u018f\t\t\2\2\u018f\u0190\79\2\2\u0190\u0191\7\60\2\2\u0191;\3\2\2\2"+
		"\u0192\u0193\7\26\2\2\u0193\u0194\78\2\2\u0194\u0195\7J\2\2\u0195\u0196"+
		"\7\62\2\2\u0196\u0197\7J\2\2\u0197\u0198\79\2\2\u0198\u0199\7\60\2\2\u0199"+
		"=\3\2\2\2\u019a\u019b\7\27\2\2\u019b\u019c\78\2\2\u019c\u019d\7J\2\2\u019d"+
		"\u019e\7\62\2\2\u019e\u019f\7L\2\2\u019f\u01a0\79\2\2\u01a0\u01a1\7\60"+
		"\2\2\u01a1?\3\2\2\2\u01a2\u01a3\7\30\2\2\u01a3\u01a4\78\2\2\u01a4\u01a5"+
		"\7J\2\2\u01a5\u01a6\79\2\2\u01a6\u01a7\7\60\2\2\u01a7A\3\2\2\2\u01a8\u01a9"+
		"\7\31\2\2\u01a9\u01aa\78\2\2\u01aa\u01ab\7L\2\2\u01ab\u01ac\79\2\2\u01ac"+
		"\u01ad\7\60\2\2\u01adC\3\2\2\2\u01ae\u01af\7\32\2\2\u01af\u01b0\78\2\2"+
		"\u01b0\u01b1\7L\2\2\u01b1\u01b2\79\2\2\u01b2\u01b3\7\60\2\2\u01b3E\3\2"+
		"\2\2\u01b4\u01c2\5,\27\2\u01b5\u01c2\5.\30\2\u01b6\u01c2\5\62\32\2\u01b7"+
		"\u01c2\5\60\31\2\u01b8\u01c2\5\64\33\2\u01b9\u01c2\5\66\34\2\u01ba\u01c2"+
		"\58\35\2\u01bb\u01c2\5:\36\2\u01bc\u01c2\5<\37\2\u01bd\u01c2\5> \2\u01be"+
		"\u01c2\5@!\2\u01bf\u01c2\5B\"\2\u01c0\u01c2\5D#\2\u01c1\u01b4\3\2\2\2"+
		"\u01c1\u01b5\3\2\2\2\u01c1\u01b6\3\2\2\2\u01c1\u01b7\3\2\2\2\u01c1\u01b8"+
		"\3\2\2\2\u01c1\u01b9\3\2\2\2\u01c1\u01ba\3\2\2\2\u01c1\u01bb\3\2\2\2\u01c1"+
		"\u01bc\3\2\2\2\u01c1\u01bd\3\2\2\2\u01c1\u01be\3\2\2\2\u01c1\u01bf\3\2"+
		"\2\2\u01c1\u01c0\3\2\2\2\u01c2G\3\2\2\2(ILV[ekov{\u0087\u008a\u008f\u0094"+
		"\u009b\u00a0\u00ac\u00b9\u00c2\u00ca\u00d3\u00e3\u00ed\u00f2\u00f8\u00ff"+
		"\u0103\u010b\u0113\u011b\u011e\u012c\u012e\u0135\u0140\u0143\u017f\u0184"+
		"\u01c1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}