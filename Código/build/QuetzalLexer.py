# Generated from Quetzal.g4 by ANTLR 4.7.2
from antlr4 import *
from io import StringIO
from typing.io import TextIO
import sys


from build.intermediateCode import *




def serializedATN():
    with StringIO() as buf:
        buf.write("\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2Q")
        buf.write("\u02d0\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7")
        buf.write("\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r")
        buf.write("\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22\4\23")
        buf.write("\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30")
        buf.write("\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36")
        buf.write("\t\36\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%")
        buf.write("\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4,\t,\4-\t-\4.")
        buf.write("\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64")
        buf.write("\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:")
        buf.write("\4;\t;\4<\t<\4=\t=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\t")
        buf.write("C\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I\tI\4J\tJ\4K\tK\4L\t")
        buf.write("L\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT\4U\t")
        buf.write("U\4V\tV\4W\tW\4X\tX\4Y\tY\3\2\3\2\3\2\3\2\3\2\3\2\3\2")
        buf.write("\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3")
        buf.write("\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7")
        buf.write("\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3")
        buf.write("\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3")
        buf.write("\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16")
        buf.write("\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20")
        buf.write("\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21")
        buf.write("\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22")
        buf.write("\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23")
        buf.write("\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24")
        buf.write("\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24")
        buf.write("\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26")
        buf.write("\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26")
        buf.write("\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27")
        buf.write("\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30")
        buf.write("\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30")
        buf.write("\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31")
        buf.write("\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31")
        buf.write("\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32")
        buf.write("\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33")
        buf.write("\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33")
        buf.write("\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36")
        buf.write("\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3 ")
        buf.write("\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u01d1")
        buf.write("\n \3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3")
        buf.write("$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3")
        buf.write("&\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3)\3)\3)\3)\3")
        buf.write(")\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3")
        buf.write(",\3,\3,\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3/\3/\3/\3")
        buf.write("/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\62")
        buf.write("\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67")
        buf.write("\38\38\39\39\3:\3:\3;\3;\3<\3<\3<\3=\3=\3>\3>\3?\3?\3")
        buf.write("?\3@\3@\3@\3A\3A\3A\3B\3B\3B\3C\3C\3C\3D\3D\3E\3E\3F\3")
        buf.write("F\3G\3G\3H\3H\3I\6I\u0268\nI\rI\16I\u0269\3I\3I\6I\u026e")
        buf.write("\nI\rI\16I\u026f\3J\6J\u0273\nJ\rJ\16J\u0274\3K\3K\7K")
        buf.write("\u0279\nK\fK\16K\u027c\13K\3L\3L\5L\u0280\nL\3M\3M\3M")
        buf.write("\7M\u0285\nM\fM\16M\u0288\13M\3M\3M\3N\3N\5N\u028e\nN")
        buf.write("\3O\3O\5O\u0292\nO\3P\3P\3P\3P\5P\u0298\nP\3Q\3Q\3R\3")
        buf.write("R\3S\3S\3T\3T\5T\u02a2\nT\3U\3U\3U\3U\3U\3U\3U\3U\3V\5")
        buf.write("V\u02ad\nV\3V\3V\3V\3V\3W\6W\u02b4\nW\rW\16W\u02b5\3W")
        buf.write("\3W\3X\3X\3X\7X\u02bd\nX\fX\16X\u02c0\13X\3X\3X\3X\3X")
        buf.write("\3X\3Y\3Y\3Y\7Y\u02ca\nY\fY\16Y\u02cd\13Y\3Y\3Y\3\u02be")
        buf.write("\2Z\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\2\27\2")
        buf.write("\31\f\33\r\35\16\37\17!\20#\21%\22\'\23)\24+\25-\26/\27")
        buf.write("\61\30\63\31\65\32\67\339\34;\35=\36?\37A C!E\"G#I$K%")
        buf.write("M&O\'Q(S)U*W+Y,[-]._/a\60c\61e\62g\63i\64k\65m\66o\67")
        buf.write("q8s9u:w;y<{=}>\177?\u0081@\u0083A\u0085B\u0087C\u0089")
        buf.write("D\u008bE\u008dF\u008fG\u0091H\u0093I\u0095J\u0097K\u0099")
        buf.write("L\u009bM\u009d\2\u009f\2\u00a1\2\u00a3\2\u00a5\2\u00a7")
        buf.write("\2\u00a9\2\u00abN\u00adO\u00afP\u00b1Q\3\2\n\4\2\"\"\61")
        buf.write("\61\5\2\60\60<<^^\3\2\62;\3\2C\\\3\2c|\4\2CHch\4\2\13")
        buf.write("\13\"\"\4\2\f\f\17\17\2\u02e6\2\3\3\2\2\2\2\5\3\2\2\2")
        buf.write("\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17")
        buf.write("\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\31\3\2\2\2\2\33\3")
        buf.write("\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2")
        buf.write("\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2")
        buf.write("\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2")
        buf.write("\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2")
        buf.write("\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2")
        buf.write("\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3")
        buf.write("\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]")
        buf.write("\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2")
        buf.write("g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2")
        buf.write("\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2")
        buf.write("\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2")
        buf.write("\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089")
        buf.write("\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2")
        buf.write("\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097")
        buf.write("\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u00ab\3\2\2")
        buf.write("\2\2\u00ad\3\2\2\2\2\u00af\3\2\2\2\2\u00b1\3\2\2\2\3\u00b3")
        buf.write("\3\2\2\2\5\u00bb\3\2\2\2\7\u00c0\3\2\2\2\t\u00c7\3\2\2")
        buf.write("\2\13\u00ce\3\2\2\2\r\u00d1\3\2\2\2\17\u00d6\3\2\2\2\21")
        buf.write("\u00dc\3\2\2\2\23\u00e2\3\2\2\2\25\u00e7\3\2\2\2\27\u00ec")
        buf.write("\3\2\2\2\31\u00f2\3\2\2\2\33\u00f7\3\2\2\2\35\u00fc\3")
        buf.write("\2\2\2\37\u0104\3\2\2\2!\u010c\3\2\2\2#\u0116\3\2\2\2")
        buf.write("%\u0123\3\2\2\2\'\u012f\3\2\2\2)\u013d\3\2\2\2+\u0146")
        buf.write("\3\2\2\2-\u0156\3\2\2\2/\u0166\3\2\2\2\61\u017a\3\2\2")
        buf.write("\2\63\u018e\3\2\2\2\65\u019d\3\2\2\2\67\u01ab\3\2\2\2")
        buf.write("9\u01b0\3\2\2\2;\u01b4\3\2\2\2=\u01ba\3\2\2\2?\u01d0\3")
        buf.write("\2\2\2A\u01d2\3\2\2\2C\u01d8\3\2\2\2E\u01dc\3\2\2\2G\u01e1")
        buf.write("\3\2\2\2I\u01e6\3\2\2\2K\u01ed\3\2\2\2M\u01f4\3\2\2\2")
        buf.write("O\u01fa\3\2\2\2Q\u01ff\3\2\2\2S\u0204\3\2\2\2U\u020b\3")
        buf.write("\2\2\2W\u0210\3\2\2\2Y\u0218\3\2\2\2[\u021e\3\2\2\2]\u0224")
        buf.write("\3\2\2\2_\u0229\3\2\2\2a\u0230\3\2\2\2c\u0232\3\2\2\2")
        buf.write("e\u0234\3\2\2\2g\u0236\3\2\2\2i\u0238\3\2\2\2k\u023a\3")
        buf.write("\2\2\2m\u023c\3\2\2\2o\u023e\3\2\2\2q\u0240\3\2\2\2s\u0242")
        buf.write("\3\2\2\2u\u0244\3\2\2\2w\u0246\3\2\2\2y\u0249\3\2\2\2")
        buf.write("{\u024b\3\2\2\2}\u024d\3\2\2\2\177\u0250\3\2\2\2\u0081")
        buf.write("\u0253\3\2\2\2\u0083\u0256\3\2\2\2\u0085\u0259\3\2\2\2")
        buf.write("\u0087\u025c\3\2\2\2\u0089\u025e\3\2\2\2\u008b\u0260\3")
        buf.write("\2\2\2\u008d\u0262\3\2\2\2\u008f\u0264\3\2\2\2\u0091\u0267")
        buf.write("\3\2\2\2\u0093\u0272\3\2\2\2\u0095\u0276\3\2\2\2\u0097")
        buf.write("\u027f\3\2\2\2\u0099\u0281\3\2\2\2\u009b\u028d\3\2\2\2")
        buf.write("\u009d\u0291\3\2\2\2\u009f\u0297\3\2\2\2\u00a1\u0299\3")
        buf.write("\2\2\2\u00a3\u029b\3\2\2\2\u00a5\u029d\3\2\2\2\u00a7\u02a1")
        buf.write("\3\2\2\2\u00a9\u02a3\3\2\2\2\u00ab\u02ac\3\2\2\2\u00ad")
        buf.write("\u02b3\3\2\2\2\u00af\u02b9\3\2\2\2\u00b1\u02c6\3\2\2\2")
        buf.write("\u00b3\u00b4\7r\2\2\u00b4\u00b5\7t\2\2\u00b5\u00b6\7q")
        buf.write("\2\2\u00b6\u00b7\7i\2\2\u00b7\u00b8\7t\2\2\u00b8\u00b9")
        buf.write("\7c\2\2\u00b9\u00ba\7o\2\2\u00ba\4\3\2\2\2\u00bb\u00bc")
        buf.write("\7h\2\2\u00bc\u00bd\7w\2\2\u00bd\u00be\7p\2\2\u00be\u00bf")
        buf.write("\7e\2\2\u00bf\6\3\2\2\2\u00c0\u00c1\7f\2\2\u00c1\u00c2")
        buf.write("\7g\2\2\u00c2\u00c3\7h\2\2\u00c3\u00c4\7k\2\2\u00c4\u00c5")
        buf.write("\7p\2\2\u00c5\u00c6\7g\2\2\u00c6\b\3\2\2\2\u00c7\u00c8")
        buf.write("\7t\2\2\u00c8\u00c9\7g\2\2\u00c9\u00ca\7v\2\2\u00ca\u00cb")
        buf.write("\7w\2\2\u00cb\u00cc\7t\2\2\u00cc\u00cd\7p\2\2\u00cd\n")
        buf.write("\3\2\2\2\u00ce\u00cf\7k\2\2\u00cf\u00d0\7h\2\2\u00d0\f")
        buf.write("\3\2\2\2\u00d1\u00d2\7g\2\2\u00d2\u00d3\7n\2\2\u00d3\u00d4")
        buf.write("\7u\2\2\u00d4\u00d5\7g\2\2\u00d5\16\3\2\2\2\u00d6\u00d7")
        buf.write("\7y\2\2\u00d7\u00d8\7j\2\2\u00d8\u00d9\7k\2\2\u00d9\u00da")
        buf.write("\7n\2\2\u00da\u00db\7g\2\2\u00db\20\3\2\2\2\u00dc\u00dd")
        buf.write("\7r\2\2\u00dd\u00de\7t\2\2\u00de\u00df\7k\2\2\u00df\u00e0")
        buf.write("\7p\2\2\u00e0\u00e1\7v\2\2\u00e1\22\3\2\2\2\u00e2\u00e3")
        buf.write("\7t\2\2\u00e3\u00e4\7g\2\2\u00e4\u00e5\7c\2\2\u00e5\u00e6")
        buf.write("\7f\2\2\u00e6\24\3\2\2\2\u00e7\u00e8\7V\2\2\u00e8\u00e9")
        buf.write("\7t\2\2\u00e9\u00ea\7w\2\2\u00ea\u00eb\7g\2\2\u00eb\26")
        buf.write("\3\2\2\2\u00ec\u00ed\7H\2\2\u00ed\u00ee\7c\2\2\u00ee\u00ef")
        buf.write("\7n\2\2\u00ef\u00f0\7u\2\2\u00f0\u00f1\7g\2\2\u00f1\30")
        buf.write("\3\2\2\2\u00f2\u00f3\7o\2\2\u00f3\u00f4\7c\2\2\u00f4\u00f5")
        buf.write("\7k\2\2\u00f5\u00f6\7p\2\2\u00f6\32\3\2\2\2\u00f7\u00f8")
        buf.write("\7x\2\2\u00f8\u00f9\7q\2\2\u00f9\u00fa\7k\2\2\u00fa\u00fb")
        buf.write("\7f\2\2\u00fb\34\3\2\2\2\u00fc\u00fd\7q\2\2\u00fd\u00fe")
        buf.write("\7r\2\2\u00fe\u00ff\7g\2\2\u00ff\u0100\7p\2\2\u0100\u0101")
        buf.write("\7K\2\2\u0101\u0102\7o\2\2\u0102\u0103\7i\2\2\u0103\36")
        buf.write("\3\2\2\2\u0104\u0105\7u\2\2\u0105\u0106\7c\2\2\u0106\u0107")
        buf.write("\7x\2\2\u0107\u0108\7g\2\2\u0108\u0109\7K\2\2\u0109\u010a")
        buf.write("\7o\2\2\u010a\u010b\7i\2\2\u010b \3\2\2\2\u010c\u010d")
        buf.write("\7i\2\2\u010d\u010e\7t\2\2\u010e\u010f\7c\2\2\u010f\u0110")
        buf.write("\7{\2\2\u0110\u0111\7u\2\2\u0111\u0112\7e\2\2\u0112\u0113")
        buf.write("\7c\2\2\u0113\u0114\7n\2\2\u0114\u0115\7g\2\2\u0115\"")
        buf.write("\3\2\2\2\u0116\u0117\7e\2\2\u0117\u0118\7q\2\2\u0118\u0119")
        buf.write("\7n\2\2\u0119\u011a\7q\2\2\u011a\u011b\7t\2\2\u011b\u011c")
        buf.write("\7T\2\2\u011c\u011d\7g\2\2\u011d\u011e\7r\2\2\u011e\u011f")
        buf.write("\7n\2\2\u011f\u0120\7c\2\2\u0120\u0121\7e\2\2\u0121\u0122")
        buf.write("\7g\2\2\u0122$\3\2\2\2\u0123\u0124\7e\2\2\u0124\u0125")
        buf.write("\7q\2\2\u0125\u0126\7n\2\2\u0126\u0127\7q\2\2\u0127\u0128")
        buf.write("\7t\2\2\u0128\u0129\7H\2\2\u0129\u012a\7k\2\2\u012a\u012b")
        buf.write("\7n\2\2\u012b\u012c\7v\2\2\u012c\u012d\7g\2\2\u012d\u012e")
        buf.write("\7t\2\2\u012e&\3\2\2\2\u012f\u0130\7g\2\2\u0130\u0131")
        buf.write("\7f\2\2\u0131\u0132\7i\2\2\u0132\u0133\7g\2\2\u0133\u0134")
        buf.write("\7F\2\2\u0134\u0135\7g\2\2\u0135\u0136\7v\2\2\u0136\u0137")
        buf.write("\7g\2\2\u0137\u0138\7e\2\2\u0138\u0139\7v\2\2\u0139\u013a")
        buf.write("\7k\2\2\u013a\u013b\7q\2\2\u013b\u013c\7p\2\2\u013c(\3")
        buf.write("\2\2\2\u013d\u013e\7u\2\2\u013e\u013f\7e\2\2\u013f\u0140")
        buf.write("\7c\2\2\u0140\u0141\7n\2\2\u0141\u0142\7g\2\2\u0142\u0143")
        buf.write("\7K\2\2\u0143\u0144\7o\2\2\u0144\u0145\7i\2\2\u0145*\3")
        buf.write("\2\2\2\u0146\u0147\7i\2\2\u0147\u0148\7g\2\2\u0148\u0149")
        buf.write("\7v\2\2\u0149\u014a\7E\2\2\u014a\u014b\7q\2\2\u014b\u014c")
        buf.write("\7n\2\2\u014c\u014d\7q\2\2\u014d\u014e\7t\2\2\u014e\u014f")
        buf.write("\7R\2\2\u014f\u0150\7c\2\2\u0150\u0151\7n\2\2\u0151\u0152")
        buf.write("\7g\2\2\u0152\u0153\7v\2\2\u0153\u0154\7v\2\2\u0154\u0155")
        buf.write("\7g\2\2\u0155,\3\2\2\2\u0156\u0157\7e\2\2\u0157\u0158")
        buf.write("\7q\2\2\u0158\u0159\7n\2\2\u0159\u015a\7q\2\2\u015a\u015b")
        buf.write("\7t\2\2\u015b\u015c\7O\2\2\u015c\u015d\7c\2\2\u015d\u015e")
        buf.write("\7v\2\2\u015e\u015f\7e\2\2\u015f\u0160\7j\2\2\u0160\u0161")
        buf.write("\7K\2\2\u0161\u0162\7o\2\2\u0162\u0163\7c\2\2\u0163\u0164")
        buf.write("\7i\2\2\u0164\u0165\7g\2\2\u0165.\3\2\2\2\u0166\u0167")
        buf.write("\7g\2\2\u0167\u0168\7p\2\2\u0168\u0169\7e\2\2\u0169\u016a")
        buf.write("\7q\2\2\u016a\u016b\7f\2\2\u016b\u016c\7g\2\2\u016c\u016d")
        buf.write("\7U\2\2\u016d\u016e\7v\2\2\u016e\u016f\7g\2\2\u016f\u0170")
        buf.write("\7i\2\2\u0170\u0171\7c\2\2\u0171\u0172\7p\2\2\u0172\u0173")
        buf.write("\7q\2\2\u0173\u0174\7i\2\2\u0174\u0175\7t\2\2\u0175\u0176")
        buf.write("\7c\2\2\u0176\u0177\7r\2\2\u0177\u0178\7j\2\2\u0178\u0179")
        buf.write("\7{\2\2\u0179\60\3\2\2\2\u017a\u017b\7f\2\2\u017b\u017c")
        buf.write("\7g\2\2\u017c\u017d\7e\2\2\u017d\u017e\7q\2\2\u017e\u017f")
        buf.write("\7f\2\2\u017f\u0180\7g\2\2\u0180\u0181\7U\2\2\u0181\u0182")
        buf.write("\7v\2\2\u0182\u0183\7g\2\2\u0183\u0184\7i\2\2\u0184\u0185")
        buf.write("\7c\2\2\u0185\u0186\7p\2\2\u0186\u0187\7q\2\2\u0187\u0188")
        buf.write("\7i\2\2\u0188\u0189\7t\2\2\u0189\u018a\7c\2\2\u018a\u018b")
        buf.write("\7r\2\2\u018b\u018c\7j\2\2\u018c\u018d\7{\2\2\u018d\62")
        buf.write("\3\2\2\2\u018e\u018f\7i\2\2\u018f\u0190\7g\2\2\u0190\u0191")
        buf.write("\7v\2\2\u0191\u0192\7K\2\2\u0192\u0193\7o\2\2\u0193\u0194")
        buf.write("\7c\2\2\u0194\u0195\7i\2\2\u0195\u0196\7g\2\2\u0196\u0197")
        buf.write("\7J\2\2\u0197\u0198\7g\2\2\u0198\u0199\7k\2\2\u0199\u019a")
        buf.write("\7i\2\2\u019a\u019b\7j\2\2\u019b\u019c\7v\2\2\u019c\64")
        buf.write("\3\2\2\2\u019d\u019e\7i\2\2\u019e\u019f\7g\2\2\u019f\u01a0")
        buf.write("\7v\2\2\u01a0\u01a1\7K\2\2\u01a1\u01a2\7o\2\2\u01a2\u01a3")
        buf.write("\7c\2\2\u01a3\u01a4\7i\2\2\u01a4\u01a5\7g\2\2\u01a5\u01a6")
        buf.write("\7Y\2\2\u01a6\u01a7\7k\2\2\u01a7\u01a8\7f\2\2\u01a8\u01a9")
        buf.write("\7v\2\2\u01a9\u01aa\7j\2\2\u01aa\66\3\2\2\2\u01ab\u01ac")
        buf.write("\7d\2\2\u01ac\u01ad\7q\2\2\u01ad\u01ae\7q\2\2\u01ae\u01af")
        buf.write("\7n\2\2\u01af8\3\2\2\2\u01b0\u01b1\7k\2\2\u01b1\u01b2")
        buf.write("\7p\2\2\u01b2\u01b3\7v\2\2\u01b3:\3\2\2\2\u01b4\u01b5")
        buf.write("\7h\2\2\u01b5\u01b6\7n\2\2\u01b6\u01b7\7q\2\2\u01b7\u01b8")
        buf.write("\7c\2\2\u01b8\u01b9\7v\2\2\u01b9<\3\2\2\2\u01ba\u01bb")
        buf.write("\7e\2\2\u01bb\u01bc\7q\2\2\u01bc\u01bd\7n\2\2\u01bd\u01be")
        buf.write("\7q\2\2\u01be\u01bf\7t\2\2\u01bf>\3\2\2\2\u01c0\u01d1")
        buf.write("\5A!\2\u01c1\u01d1\5C\"\2\u01c2\u01d1\5E#\2\u01c3\u01d1")
        buf.write("\5G$\2\u01c4\u01d1\5I%\2\u01c5\u01d1\5K&\2\u01c6\u01d1")
        buf.write("\5M\'\2\u01c7\u01d1\5O(\2\u01c8\u01d1\5Q)\2\u01c9\u01d1")
        buf.write("\5S*\2\u01ca\u01d1\5U+\2\u01cb\u01d1\5W,\2\u01cc\u01d1")
        buf.write("\5Y-\2\u01cd\u01d1\5[.\2\u01ce\u01d1\5]/\2\u01cf\u01d1")
        buf.write("\5_\60\2\u01d0\u01c0\3\2\2\2\u01d0\u01c1\3\2\2\2\u01d0")
        buf.write("\u01c2\3\2\2\2\u01d0\u01c3\3\2\2\2\u01d0\u01c4\3\2\2\2")
        buf.write("\u01d0\u01c5\3\2\2\2\u01d0\u01c6\3\2\2\2\u01d0\u01c7\3")
        buf.write("\2\2\2\u01d0\u01c8\3\2\2\2\u01d0\u01c9\3\2\2\2\u01d0\u01ca")
        buf.write("\3\2\2\2\u01d0\u01cb\3\2\2\2\u01d0\u01cc\3\2\2\2\u01d0")
        buf.write("\u01cd\3\2\2\2\u01d0\u01ce\3\2\2\2\u01d0\u01cf\3\2\2\2")
        buf.write("\u01d1@\3\2\2\2\u01d2\u01d3\7Y\2\2\u01d3\u01d4\7j\2\2")
        buf.write("\u01d4\u01d5\7k\2\2\u01d5\u01d6\7v\2\2\u01d6\u01d7\7g")
        buf.write("\2\2\u01d7B\3\2\2\2\u01d8\u01d9\7T\2\2\u01d9\u01da\7g")
        buf.write("\2\2\u01da\u01db\7f\2\2\u01dbD\3\2\2\2\u01dc\u01dd\7N")
        buf.write("\2\2\u01dd\u01de\7k\2\2\u01de\u01df\7o\2\2\u01df\u01e0")
        buf.write("\7g\2\2\u01e0F\3\2\2\2\u01e1\u01e2\7D\2\2\u01e2\u01e3")
        buf.write("\7n\2\2\u01e3\u01e4\7w\2\2\u01e4\u01e5\7g\2\2\u01e5H\3")
        buf.write("\2\2\2\u01e6\u01e7\7U\2\2\u01e7\u01e8\7k\2\2\u01e8\u01e9")
        buf.write("\7n\2\2\u01e9\u01ea\7x\2\2\u01ea\u01eb\7g\2\2\u01eb\u01ec")
        buf.write("\7t\2\2\u01ecJ\3\2\2\2\u01ed\u01ee\7O\2\2\u01ee\u01ef")
        buf.write("\7c\2\2\u01ef\u01f0\7t\2\2\u01f0\u01f1\7q\2\2\u01f1\u01f2")
        buf.write("\7q\2\2\u01f2\u01f3\7p\2\2\u01f3L\3\2\2\2\u01f4\u01f5")
        buf.write("\7I\2\2\u01f5\u01f6\7t\2\2\u01f6\u01f7\7g\2\2\u01f7\u01f8")
        buf.write("\7g\2\2\u01f8\u01f9\7p\2\2\u01f9N\3\2\2\2\u01fa\u01fb")
        buf.write("\7P\2\2\u01fb\u01fc\7c\2\2\u01fc\u01fd\7x\2\2\u01fd\u01fe")
        buf.write("\7{\2\2\u01feP\3\2\2\2\u01ff\u0200\7I\2\2\u0200\u0201")
        buf.write("\7t\2\2\u0201\u0202\7c\2\2\u0202\u0203\7{\2\2\u0203R\3")
        buf.write("\2\2\2\u0204\u0205\7[\2\2\u0205\u0206\7g\2\2\u0206\u0207")
        buf.write("\7n\2\2\u0207\u0208\7n\2\2\u0208\u0209\7q\2\2\u0209\u020a")
        buf.write("\7y\2\2\u020aT\3\2\2\2\u020b\u020c\7C\2\2\u020c\u020d")
        buf.write("\7s\2\2\u020d\u020e\7w\2\2\u020e\u020f\7c\2\2\u020fV\3")
        buf.write("\2\2\2\u0210\u0211\7H\2\2\u0211\u0212\7w\2\2\u0212\u0213")
        buf.write("\7e\2\2\u0213\u0214\7j\2\2\u0214\u0215\7u\2\2\u0215\u0216")
        buf.write("\7k\2\2\u0216\u0217\7c\2\2\u0217X\3\2\2\2\u0218\u0219")
        buf.write("\7D\2\2\u0219\u021a\7n\2\2\u021a\u021b\7c\2\2\u021b\u021c")
        buf.write("\7e\2\2\u021c\u021d\7m\2\2\u021dZ\3\2\2\2\u021e\u021f")
        buf.write("\7Q\2\2\u021f\u0220\7n\2\2\u0220\u0221\7k\2\2\u0221\u0222")
        buf.write("\7x\2\2\u0222\u0223\7g\2\2\u0223\\\3\2\2\2\u0224\u0225")
        buf.write("\7V\2\2\u0225\u0226\7g\2\2\u0226\u0227\7c\2\2\u0227\u0228")
        buf.write("\7n\2\2\u0228^\3\2\2\2\u0229\u022a\7R\2\2\u022a\u022b")
        buf.write("\7w\2\2\u022b\u022c\7t\2\2\u022c\u022d\7r\2\2\u022d\u022e")
        buf.write("\7n\2\2\u022e\u022f\7g\2\2\u022f`\3\2\2\2\u0230\u0231")
        buf.write("\7=\2\2\u0231b\3\2\2\2\u0232\u0233\7<\2\2\u0233d\3\2\2")
        buf.write("\2\u0234\u0235\7.\2\2\u0235f\3\2\2\2\u0236\u0237\7a\2")
        buf.write("\2\u0237h\3\2\2\2\u0238\u0239\7}\2\2\u0239j\3\2\2\2\u023a")
        buf.write("\u023b\7\177\2\2\u023bl\3\2\2\2\u023c\u023d\7]\2\2\u023d")
        buf.write("n\3\2\2\2\u023e\u023f\7_\2\2\u023fp\3\2\2\2\u0240\u0241")
        buf.write("\7*\2\2\u0241r\3\2\2\2\u0242\u0243\7+\2\2\u0243t\3\2\2")
        buf.write("\2\u0244\u0245\7?\2\2\u0245v\3\2\2\2\u0246\u0247\7?\2")
        buf.write("\2\u0247\u0248\7?\2\2\u0248x\3\2\2\2\u0249\u024a\7@\2")
        buf.write("\2\u024az\3\2\2\2\u024b\u024c\7>\2\2\u024c|\3\2\2\2\u024d")
        buf.write("\u024e\7#\2\2\u024e\u024f\7?\2\2\u024f~\3\2\2\2\u0250")
        buf.write("\u0251\7@\2\2\u0251\u0252\7?\2\2\u0252\u0080\3\2\2\2\u0253")
        buf.write("\u0254\7>\2\2\u0254\u0255\7?\2\2\u0255\u0082\3\2\2\2\u0256")
        buf.write("\u0257\7~\2\2\u0257\u0258\7~\2\2\u0258\u0084\3\2\2\2\u0259")
        buf.write("\u025a\7(\2\2\u025a\u025b\7(\2\2\u025b\u0086\3\2\2\2\u025c")
        buf.write("\u025d\7$\2\2\u025d\u0088\3\2\2\2\u025e\u025f\7-\2\2\u025f")
        buf.write("\u008a\3\2\2\2\u0260\u0261\7/\2\2\u0261\u008c\3\2\2\2")
        buf.write("\u0262\u0263\7,\2\2\u0263\u008e\3\2\2\2\u0264\u0265\7")
        buf.write("\61\2\2\u0265\u0090\3\2\2\2\u0266\u0268\5\u00a1Q\2\u0267")
        buf.write("\u0266\3\2\2\2\u0268\u0269\3\2\2\2\u0269\u0267\3\2\2\2")
        buf.write("\u0269\u026a\3\2\2\2\u026a\u026b\3\2\2\2\u026b\u026d\7")
        buf.write("\60\2\2\u026c\u026e\5\u00a1Q\2\u026d\u026c\3\2\2\2\u026e")
        buf.write("\u026f\3\2\2\2\u026f\u026d\3\2\2\2\u026f\u0270\3\2\2\2")
        buf.write("\u0270\u0092\3\2\2\2\u0271\u0273\5\u00a1Q\2\u0272\u0271")
        buf.write("\3\2\2\2\u0273\u0274\3\2\2\2\u0274\u0272\3\2\2\2\u0274")
        buf.write("\u0275\3\2\2\2\u0275\u0094\3\2\2\2\u0276\u027a\5\u00a5")
        buf.write("S\2\u0277\u0279\5\u009fP\2\u0278\u0277\3\2\2\2\u0279\u027c")
        buf.write("\3\2\2\2\u027a\u0278\3\2\2\2\u027a\u027b\3\2\2\2\u027b")
        buf.write("\u0096\3\2\2\2\u027c\u027a\3\2\2\2\u027d\u0280\5? \2\u027e")
        buf.write("\u0280\5\u00a9U\2\u027f\u027d\3\2\2\2\u027f\u027e\3\2")
        buf.write("\2\2\u0280\u0098\3\2\2\2\u0281\u0286\7$\2\2\u0282\u0285")
        buf.write("\5\u009fP\2\u0283\u0285\t\2\2\2\u0284\u0282\3\2\2\2\u0284")
        buf.write("\u0283\3\2\2\2\u0285\u0288\3\2\2\2\u0286\u0284\3\2\2\2")
        buf.write("\u0286\u0287\3\2\2\2\u0287\u0289\3\2\2\2\u0288\u0286\3")
        buf.write("\2\2\2\u0289\u028a\7$\2\2\u028a\u009a\3\2\2\2\u028b\u028e")
        buf.write("\5\25\13\2\u028c\u028e\5\27\f\2\u028d\u028b\3\2\2\2\u028d")
        buf.write("\u028c\3\2\2\2\u028e\u009c\3\2\2\2\u028f\u0292\5\u00a3")
        buf.write("R\2\u0290\u0292\5\u00a5S\2\u0291\u028f\3\2\2\2\u0291\u0290")
        buf.write("\3\2\2\2\u0292\u009e\3\2\2\2\u0293\u0298\5\u009dO\2\u0294")
        buf.write("\u0298\5\u00a1Q\2\u0295\u0298\5g\64\2\u0296\u0298\t\3")
        buf.write("\2\2\u0297\u0293\3\2\2\2\u0297\u0294\3\2\2\2\u0297\u0295")
        buf.write("\3\2\2\2\u0297\u0296\3\2\2\2\u0298\u00a0\3\2\2\2\u0299")
        buf.write("\u029a\t\4\2\2\u029a\u00a2\3\2\2\2\u029b\u029c\t\5\2\2")
        buf.write("\u029c\u00a4\3\2\2\2\u029d\u029e\t\6\2\2\u029e\u00a6\3")
        buf.write("\2\2\2\u029f\u02a2\t\7\2\2\u02a0\u02a2\5\u00a1Q\2\u02a1")
        buf.write("\u029f\3\2\2\2\u02a1\u02a0\3\2\2\2\u02a2\u00a8\3\2\2\2")
        buf.write("\u02a3\u02a4\7%\2\2\u02a4\u02a5\5\u00a7T\2\u02a5\u02a6")
        buf.write("\5\u00a7T\2\u02a6\u02a7\5\u00a7T\2\u02a7\u02a8\5\u00a7")
        buf.write("T\2\u02a8\u02a9\5\u00a7T\2\u02a9\u02aa\5\u00a7T\2\u02aa")
        buf.write("\u00aa\3\2\2\2\u02ab\u02ad\7\17\2\2\u02ac\u02ab\3\2\2")
        buf.write("\2\u02ac\u02ad\3\2\2\2\u02ad\u02ae\3\2\2\2\u02ae\u02af")
        buf.write("\7\f\2\2\u02af\u02b0\3\2\2\2\u02b0\u02b1\bV\2\2\u02b1")
        buf.write("\u00ac\3\2\2\2\u02b2\u02b4\t\b\2\2\u02b3\u02b2\3\2\2\2")
        buf.write("\u02b4\u02b5\3\2\2\2\u02b5\u02b3\3\2\2\2\u02b5\u02b6\3")
        buf.write("\2\2\2\u02b6\u02b7\3\2\2\2\u02b7\u02b8\bW\2\2\u02b8\u00ae")
        buf.write("\3\2\2\2\u02b9\u02ba\5\u008fH\2\u02ba\u02be\5\u008dG\2")
        buf.write("\u02bb\u02bd\13\2\2\2\u02bc\u02bb\3\2\2\2\u02bd\u02c0")
        buf.write("\3\2\2\2\u02be\u02bf\3\2\2\2\u02be\u02bc\3\2\2\2\u02bf")
        buf.write("\u02c1\3\2\2\2\u02c0\u02be\3\2\2\2\u02c1\u02c2\5\u008d")
        buf.write("G\2\u02c2\u02c3\5\u008fH\2\u02c3\u02c4\3\2\2\2\u02c4\u02c5")
        buf.write("\bX\3\2\u02c5\u00b0\3\2\2\2\u02c6\u02c7\5\u008fH\2\u02c7")
        buf.write("\u02cb\5\u008fH\2\u02c8\u02ca\n\t\2\2\u02c9\u02c8\3\2")
        buf.write("\2\2\u02ca\u02cd\3\2\2\2\u02cb\u02c9\3\2\2\2\u02cb\u02cc")
        buf.write("\3\2\2\2\u02cc\u02ce\3\2\2\2\u02cd\u02cb\3\2\2\2\u02ce")
        buf.write("\u02cf\bY\3\2\u02cf\u00b2\3\2\2\2\23\2\u01d0\u0269\u026f")
        buf.write("\u0274\u027a\u027f\u0284\u0286\u028d\u0291\u0297\u02a1")
        buf.write("\u02ac\u02b5\u02be\u02cb\4\b\2\2\2\3\2")
        return buf.getvalue()


class QuetzalLexer(Lexer):

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    TK_PROGRAM = 1
    TK_FUNC = 2
    TK_DEFINE = 3
    TK_RETURN = 4
    TK_IF = 5
    TK_ELSE = 6
    TK_WHILE = 7
    TK_PRINT = 8
    TK_READ = 9
    TK_MAIN = 10
    TK_VOID = 11
    TK_OPENIMG = 12
    TK_SAVEIMG = 13
    TK_GRAYSCALE = 14
    TK_COLOR_REPLACE = 15
    TK_COLOR_FILTER = 16
    TK_EDGE_DETECTION = 17
    TK_SCALE_IMAGE = 18
    TK_GET_COLOR_PALETTE = 19
    TK_COLOR_MATCH_IMAGE = 20
    TK_ENCODE_STEGANOGRAPHY = 21
    TK_DECODE_STEGANOGRAPHY = 22
    TK_GET_IMAGE_HEIGHT = 23
    TK_GET_IMAGE_WIDTH = 24
    TK_BOOL = 25
    TK_INT = 26
    TK_FLOAT = 27
    TK_COLOR = 28
    CTE_COLOR = 29
    TK_WHITE = 30
    TK_RED = 31
    TK_LIME = 32
    TK_BLUE = 33
    TK_SILVER = 34
    TK_MAROON = 35
    TK_GREEN = 36
    TK_NAVY = 37
    TK_GRAY = 38
    TK_YELLOW = 39
    TK_AQUA = 40
    TK_FUCHSIA = 41
    TK_BLACK = 42
    TK_OLIVE = 43
    TK_TEAL = 44
    TK_PURPLE = 45
    SYM_SEMI_COL = 46
    SYM_DOUB_COL = 47
    SYM_COMMA = 48
    SYM_UNDER_SCORE = 49
    SYM_CURLY_BRACK_OPEN = 50
    SYM_CURLY_BRACK_CLOSE = 51
    SYM_SQUARE_BRACK_OPEN = 52
    SYM_SQUARE_BRACK_CLOSE = 53
    SYM_PAREN_OPEN = 54
    SYM_PAREN_CLOSE = 55
    SYM_ASSIGN = 56
    SYM_EQUAL = 57
    SYM_GRE_THAN = 58
    SYM_LOW_THAN = 59
    SYM_NOT_EQUAL = 60
    SYM_GRE_EQ = 61
    SYM_LOW_EQ = 62
    SYM_OR = 63
    SYM_AND = 64
    SYM_QUOT = 65
    SYM_PLUS = 66
    SYM_MINUS = 67
    SYM_MULT = 68
    SYM_DIV = 69
    TYPE_FLOAT = 70
    TYPE_INT = 71
    TYPE_ID = 72
    TYPE_COLOR = 73
    CTE_TAG = 74
    TYPE_BOOL = 75
    NEWLINE = 76
    WS = 77
    BLOCK_COMMENT = 78
    LINE_COMMENT = 79

    channelNames = [ u"DEFAULT_TOKEN_CHANNEL", u"HIDDEN" ]

    modeNames = [ "DEFAULT_MODE" ]

    literalNames = [ "<INVALID>",
            "'program'", "'func'", "'define'", "'return'", "'if'", "'else'", 
            "'while'", "'print'", "'read'", "'main'", "'void'", "'openImg'", 
            "'saveImg'", "'grayscale'", "'colorReplace'", "'colorFilter'", 
            "'edgeDetection'", "'scaleImg'", "'getColorPalette'", "'colorMatchImage'", 
            "'encodeSteganography'", "'decodeSteganography'", "'getImageHeight'", 
            "'getImageWidth'", "'bool'", "'int'", "'float'", "'color'", 
            "'White'", "'Red'", "'Lime'", "'Blue'", "'Silver'", "'Maroon'", 
            "'Green'", "'Navy'", "'Gray'", "'Yellow'", "'Aqua'", "'Fuchsia'", 
            "'Black'", "'Olive'", "'Teal'", "'Purple'", "';'", "':'", "','", 
            "'_'", "'{'", "'}'", "'['", "']'", "'('", "')'", "'='", "'=='", 
            "'>'", "'<'", "'!='", "'>='", "'<='", "'||'", "'&&'", "'\"'", 
            "'+'", "'-'", "'*'", "'/'" ]

    symbolicNames = [ "<INVALID>",
            "TK_PROGRAM", "TK_FUNC", "TK_DEFINE", "TK_RETURN", "TK_IF", 
            "TK_ELSE", "TK_WHILE", "TK_PRINT", "TK_READ", "TK_MAIN", "TK_VOID", 
            "TK_OPENIMG", "TK_SAVEIMG", "TK_GRAYSCALE", "TK_COLOR_REPLACE", 
            "TK_COLOR_FILTER", "TK_EDGE_DETECTION", "TK_SCALE_IMAGE", "TK_GET_COLOR_PALETTE", 
            "TK_COLOR_MATCH_IMAGE", "TK_ENCODE_STEGANOGRAPHY", "TK_DECODE_STEGANOGRAPHY", 
            "TK_GET_IMAGE_HEIGHT", "TK_GET_IMAGE_WIDTH", "TK_BOOL", "TK_INT", 
            "TK_FLOAT", "TK_COLOR", "CTE_COLOR", "TK_WHITE", "TK_RED", "TK_LIME", 
            "TK_BLUE", "TK_SILVER", "TK_MAROON", "TK_GREEN", "TK_NAVY", 
            "TK_GRAY", "TK_YELLOW", "TK_AQUA", "TK_FUCHSIA", "TK_BLACK", 
            "TK_OLIVE", "TK_TEAL", "TK_PURPLE", "SYM_SEMI_COL", "SYM_DOUB_COL", 
            "SYM_COMMA", "SYM_UNDER_SCORE", "SYM_CURLY_BRACK_OPEN", "SYM_CURLY_BRACK_CLOSE", 
            "SYM_SQUARE_BRACK_OPEN", "SYM_SQUARE_BRACK_CLOSE", "SYM_PAREN_OPEN", 
            "SYM_PAREN_CLOSE", "SYM_ASSIGN", "SYM_EQUAL", "SYM_GRE_THAN", 
            "SYM_LOW_THAN", "SYM_NOT_EQUAL", "SYM_GRE_EQ", "SYM_LOW_EQ", 
            "SYM_OR", "SYM_AND", "SYM_QUOT", "SYM_PLUS", "SYM_MINUS", "SYM_MULT", 
            "SYM_DIV", "TYPE_FLOAT", "TYPE_INT", "TYPE_ID", "TYPE_COLOR", 
            "CTE_TAG", "TYPE_BOOL", "NEWLINE", "WS", "BLOCK_COMMENT", "LINE_COMMENT" ]

    ruleNames = [ "TK_PROGRAM", "TK_FUNC", "TK_DEFINE", "TK_RETURN", "TK_IF", 
                  "TK_ELSE", "TK_WHILE", "TK_PRINT", "TK_READ", "TK_TRUE", 
                  "TK_FALSE", "TK_MAIN", "TK_VOID", "TK_OPENIMG", "TK_SAVEIMG", 
                  "TK_GRAYSCALE", "TK_COLOR_REPLACE", "TK_COLOR_FILTER", 
                  "TK_EDGE_DETECTION", "TK_SCALE_IMAGE", "TK_GET_COLOR_PALETTE", 
                  "TK_COLOR_MATCH_IMAGE", "TK_ENCODE_STEGANOGRAPHY", "TK_DECODE_STEGANOGRAPHY", 
                  "TK_GET_IMAGE_HEIGHT", "TK_GET_IMAGE_WIDTH", "TK_BOOL", 
                  "TK_INT", "TK_FLOAT", "TK_COLOR", "CTE_COLOR", "TK_WHITE", 
                  "TK_RED", "TK_LIME", "TK_BLUE", "TK_SILVER", "TK_MAROON", 
                  "TK_GREEN", "TK_NAVY", "TK_GRAY", "TK_YELLOW", "TK_AQUA", 
                  "TK_FUCHSIA", "TK_BLACK", "TK_OLIVE", "TK_TEAL", "TK_PURPLE", 
                  "SYM_SEMI_COL", "SYM_DOUB_COL", "SYM_COMMA", "SYM_UNDER_SCORE", 
                  "SYM_CURLY_BRACK_OPEN", "SYM_CURLY_BRACK_CLOSE", "SYM_SQUARE_BRACK_OPEN", 
                  "SYM_SQUARE_BRACK_CLOSE", "SYM_PAREN_OPEN", "SYM_PAREN_CLOSE", 
                  "SYM_ASSIGN", "SYM_EQUAL", "SYM_GRE_THAN", "SYM_LOW_THAN", 
                  "SYM_NOT_EQUAL", "SYM_GRE_EQ", "SYM_LOW_EQ", "SYM_OR", 
                  "SYM_AND", "SYM_QUOT", "SYM_PLUS", "SYM_MINUS", "SYM_MULT", 
                  "SYM_DIV", "TYPE_FLOAT", "TYPE_INT", "TYPE_ID", "TYPE_COLOR", 
                  "CTE_TAG", "TYPE_BOOL", "FRAG_LETTER", "FRAG_FOLLOW", 
                  "FRAG_DIGIT", "FRAG_UPPER_CASE", "FRAG_LOWER_CASE", "FRAG_HEX_VAL", 
                  "FRAG_HEX_COLOR", "NEWLINE", "WS", "BLOCK_COMMENT", "LINE_COMMENT" ]

    grammarFileName = "Quetzal.g4"

    def __init__(self, input=None, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.7.2")
        self._interp = LexerATNSimulator(self, self.atn, self.decisionsToDFA, PredictionContextCache())
        self._actions = None
        self._predicates = None


