grammar Quetzal;
 
/* Parser Rules */
program: variables* function* main;
main: TK_FUNC TK_MAIN SYM_PAREN_OPEN SYM_PAREN_CLOSE SYM_CURLY_BRACK_OPEN variables? statute* SYM_CURLY_BRACK_CLOSE;
variables: TK_DEFINE types TYPE_ID (SYM_ASSIGN expression)? (SYM_COMMA TYPE_ID (SYM_ASSIGN expression)?)* SYM_SEMI_COL;
function: TK_FUNC (types | TK_VOID) TYPE_ID SYM_PAREN_OPEN (types TYPE_ID (SYM_COMMA types TYPE_ID)*)? SYM_PAREN_CLOSE SYM_CURLY_BRACK_OPEN variables? statute* SYM_CURLY_BRACK_CLOSE;
block: SYM_CURLY_BRACK_OPEN variables? statute* SYM_CURLY_BRACK_CLOSE;
types: (TK_INT | TK_FLOAT | TK_COLOR | TK_BOOL) (SYM_SQUARE_BRACK_OPEN expression SYM_SQUARE_BRACK_CLOSE)*;
constants:(TYPE_INT | TYPE_FLOAT | CTE_TAG | TYPE_BOOL | TYPE_COLOR);
statute: returning|condition|loop|prints|read|callfunc|specfunct|assignation;
assignation: TYPE_ID (SYM_SQUARE_BRACK_OPEN expression SYM_SQUARE_BRACK_CLOSE)* SYM_ASSIGN (specfunct|(expression SYM_SEMI_COL));
condition: TK_IF SYM_PAREN_OPEN expression SYM_PAREN_CLOSE block (TK_ELSE block)?;
prints: TK_PRINT SYM_PAREN_OPEN expression SYM_PAREN_CLOSE SYM_SEMI_COL;
var_cte: constants
   | TYPE_ID (SYM_SQUARE_BRACK_OPEN expression SYM_SQUARE_BRACK_CLOSE)*
   | TYPE_ID SYM_PAREN_OPEN expression (SYM_COMMA expression)* SYM_PAREN_CLOSE;
expression: exp (logic_op exp)? ((SYM_OR | SYM_AND) exp (logic_op exp)?)*;
exp:  term  ((SYM_PLUS | SYM_MINUS) term)*;
term:  factor (( SYM_MULT |  SYM_DIV ) factor)*;
factor:  (SYM_PAREN_OPEN expression SYM_PAREN_CLOSE ) | ( (SYM_PLUS|SYM_MINUS)? var_cte );
logic_op: SYM_EQUAL | SYM_GRE_THAN | SYM_LOW_THAN | SYM_NOT_EQUAL | SYM_GRE_EQ | SYM_LOW_EQ;
 
read: TK_READ SYM_PAREN_OPEN TYPE_ID (SYM_SQUARE_BRACK_OPEN expression SYM_SQUARE_BRACK_CLOSE(SYM_SQUARE_BRACK_OPEN expression SYM_SQUARE_BRACK_CLOSE)?)? SYM_PAREN_CLOSE SYM_SEMI_COL;
 
returning: TK_RETURN expression? SYM_SEMI_COL;
callfunc: TYPE_ID SYM_PAREN_OPEN (expression (SYM_COMMA expression)*)? SYM_PAREN_CLOSE SYM_SEMI_COL;
 
loop: TK_WHILE SYM_PAREN_OPEN expression SYM_PAREN_CLOSE block;
 
//SPECIAL FUNCTIONS
openimg: TK_OPENIMG SYM_PAREN_OPEN CTE_TAG SYM_PAREN_CLOSE SYM_SEMI_COL;
saveimg: TK_SAVEIMG SYM_PAREN_OPEN TYPE_ID SYM_COMMA CTE_TAG SYM_PAREN_CLOSE SYM_SEMI_COL;
color_replace: TK_COLOR_REPLACE SYM_PAREN_OPEN TYPE_ID SYM_COMMA (TYPE_COLOR | TYPE_ID) SYM_COMMA (TYPE_COLOR | TYPE_ID) SYM_PAREN_CLOSE SYM_SEMI_COL;
grayscale: TK_GRAYSCALE SYM_PAREN_OPEN TYPE_ID SYM_PAREN_CLOSE SYM_SEMI_COL;
color_filter: TK_COLOR_REPLACE SYM_PAREN_OPEN TYPE_ID SYM_COMMA (TYPE_COLOR | TYPE_ID) SYM_PAREN_CLOSE SYM_SEMI_COL;
edgeDetection: TK_EDGE_DETECTION SYM_PAREN_OPEN TYPE_ID SYM_PAREN_CLOSE SYM_SEMI_COL;
scaleImg: TK_SCALE_IMAGE SYM_PAREN_OPEN TYPE_ID SYM_COMMA (SYM_PLUS|SYM_MINUS)?(TYPE_FLOAT | TYPE_ID) SYM_COMMA (SYM_PLUS|SYM_MINUS)?(TYPE_FLOAT | TYPE_ID) SYM_PAREN_CLOSE SYM_SEMI_COL;
getColorPalette: TK_GET_COLOR_PALETTE SYM_PAREN_OPEN TYPE_ID SYM_COMMA (TYPE_FLOAT | TYPE_ID) SYM_PAREN_CLOSE SYM_SEMI_COL; 
colorMatchImage: TK_COLOR_MATCH_IMAGE SYM_PAREN_OPEN TYPE_ID SYM_COMMA TYPE_ID SYM_PAREN_CLOSE SYM_SEMI_COL;
encodeSteganography: TK_ENCODE_STEGANOGRAPHY SYM_PAREN_OPEN TYPE_ID SYM_COMMA CTE_TAG SYM_PAREN_CLOSE SYM_SEMI_COL;
decodeSteganography: TK_DECODE_STEGANOGRAPHY SYM_PAREN_OPEN TYPE_ID SYM_PAREN_CLOSE SYM_SEMI_COL;
getImageHeight: TK_GET_IMAGE_HEIGHT SYM_PAREN_OPEN CTE_TAG SYM_PAREN_CLOSE SYM_SEMI_COL;
getImageWidth: TK_GET_IMAGE_WIDTH SYM_PAREN_OPEN CTE_TAG SYM_PAREN_CLOSE SYM_SEMI_COL;
 
specfunct:openimg | saveimg | grayscale | color_replace | color_filter | edgeDetection | scaleImg | getColorPalette | colorMatchImage | encodeSteganography | decodeSteganography | getImageHeight |  getImageWidth;
 
 
 /* Lexer Rules */
 
/* TOKENS */
TK_PROGRAM: 'program';
TK_FUNC: 'func';
TK_DEFINE: 'define';
TK_RETURN: 'return';
TK_IF: 'if';
TK_ELSE: 'else';    
TK_WHILE: 'while';
TK_PRINT: 'prints';
TK_READ: 'read';
fragment TK_TRUE: 'True';
fragment TK_FALSE: 'False';
TK_MAIN: 'main';
TK_VOID: 'void';
 
//Special Functions
TK_OPENIMG: 'openImg';
TK_SAVEIMG: 'saveImg';
TK_GRAYSCALE: 'grayscale';
TK_COLOR_REPLACE: 'color_replace';
TK_COLOR_FILTER: 'color_filter';
TK_EDGE_DETECTION: 'edgeDetection';
TK_SCALE_IMAGE: 'scaleImg';
TK_GET_COLOR_PALETTE: 'getColorPalette';
TK_COLOR_MATCH_IMAGE: 'colorMatchImage';
TK_ENCODE_STEGANOGRAPHY: 'encodeSteganography';
TK_DECODE_STEGANOGRAPHY: 'decodeSteganography';
TK_GET_IMAGE_HEIGHT: 'getImageHeight';
TK_GET_IMAGE_WIDTH: 'getImageWidth';
 
//Types Tokens
TK_BOOL: 'bool';
TK_INT: 'int';
TK_FLOAT: 'float';
TK_COLOR: 'color';
 
//Reserved Color Names
CTE_COLOR: TK_WHITE | TK_RED | TK_LIME | TK_BLUE | TK_SILVER | TK_MAROON | TK_GREEN | TK_NAVY | TK_GRAY | TK_YELLOW | TK_AQUA | TK_FUCHSIA | TK_BLACK | TK_OLIVE | TK_TEAL | TK_PURPLE;
TK_WHITE: 'White'; //FFFFFF
TK_RED: 'Red'; //FF0000
TK_LIME: 'Lime'; //00FF00
TK_BLUE: 'Blue'; //0000FF
TK_SILVER: 'Silver'; //C0C0C0
TK_MAROON: 'Maroon'; //800000
TK_GREEN: 'Green'; //008000
TK_NAVY: 'Navy'; //000080
TK_GRAY: 'Gray'; //808080
TK_YELLOW: 'Yellow'; //FFFF00
TK_AQUA: 'Aqua'; //00FFFF
TK_FUCHSIA: 'Fuchsia'; //FF00FF
TK_BLACK: 'Black'; //000000
TK_OLIVE: 'Olive'; //808000
TK_TEAL: 'Teal'; //008080
TK_PURPLE: 'Purple'; //800080
 
/* SYMBOL */
SYM_SEMI_COL : ';';
SYM_DOUB_COL : ':';
SYM_COMMA : ',';
SYM_UNDER_SCORE: '_';
SYM_CURLY_BRACK_OPEN: '{';
SYM_CURLY_BRACK_CLOSE: '}';
SYM_SQUARE_BRACK_OPEN: '[';
SYM_SQUARE_BRACK_CLOSE: ']';
SYM_PAREN_OPEN: '(';
SYM_PAREN_CLOSE: ')';
SYM_ASSIGN : '=';
SYM_EQUAL : '==';
SYM_GRE_THAN : '>';
SYM_LOW_THAN : '<';
SYM_NOT_EQUAL : '!=';
SYM_GRE_EQ: '>=';
SYM_LOW_EQ: '<=';
SYM_OR: '||';
SYM_AND: '&&';
SYM_QUOT : '"';
SYM_PLUS: '+';
SYM_MINUS: '-';
SYM_MULT: '*';
SYM_DIV: '/';
 
 
/* TYPES */
TYPE_FLOAT : FRAG_DIGIT+ ('.' FRAG_DIGIT+)?;
TYPE_INT : FRAG_DIGIT+;
TYPE_ID : FRAG_LOWER_CASE FRAG_FOLLOW*;
TYPE_COLOR : CTE_COLOR | FRAG_HEX_COLOR;
CTE_TAG: '"' (FRAG_FOLLOW|' ')* '"';
TYPE_BOOL: TK_TRUE | TK_FALSE;
 
/* FRAGMENTS */
fragment FRAG_LETTER: FRAG_UPPER_CASE | FRAG_LOWER_CASE;
fragment FRAG_FOLLOW: FRAG_LETTER|FRAG_DIGIT|SYM_UNDER_SCORE|'/'|':'|'.'|'\\';
fragment FRAG_DIGIT : [0-9];
fragment FRAG_UPPER_CASE: [A-Z];
fragment FRAG_LOWER_CASE: [a-z];
fragment FRAG_HEX_VAL: ('A'|'B'|'C'|'D'|'E'|'F') | ('a'|'b'|'c'|'d'|'e'|'f') | FRAG_DIGIT;
fragment FRAG_HEX_COLOR: '#' FRAG_HEX_VAL FRAG_HEX_VAL FRAG_HEX_VAL FRAG_HEX_VAL FRAG_HEX_VAL FRAG_HEX_VAL;
/* NEW LINES AND WHITESPACE    
    Telling the parser to skip new lines and white spaces (works in windows and linux)*/
NEWLINE : '\r'? '\n' -> skip;
WS: (' ' | '\t')+ -> skip;
 
/* COMMENTS */     
BLOCK_COMMENT : SYM_DIV SYM_MULT .*? SYM_MULT SYM_DIV -> channel(HIDDEN); /* ALLOW FOR BLOCK COMMENTS WITH THE FORMAT OF '/* this is a block comment */
LINE_COMMENT : SYM_DIV  SYM_DIV  ~[\r\n]* -> channel(HIDDEN); /* ALLOW FOR LINE COMMENTS WITH THE FORMAT OF //this is a line comment */
