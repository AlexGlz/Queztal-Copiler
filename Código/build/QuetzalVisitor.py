# Generated from Quetzal.g4 by ANTLR 4.7.2
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .QuetzalParser import QuetzalParser
else:
    from QuetzalParser import QuetzalParser

# This class defines a complete generic visitor for a parse tree produced by QuetzalParser.

class QuetzalVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by QuetzalParser#program.
    def visitProgram(self, ctx:QuetzalParser.ProgramContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by QuetzalParser#main.
    def visitMain(self, ctx:QuetzalParser.MainContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by QuetzalParser#variables.
    def visitVariables(self, ctx:QuetzalParser.VariablesContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by QuetzalParser#function.
    def visitFunction(self, ctx:QuetzalParser.FunctionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by QuetzalParser#block.
    def visitBlock(self, ctx:QuetzalParser.BlockContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by QuetzalParser#types.
    def visitTypes(self, ctx:QuetzalParser.TypesContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by QuetzalParser#constants.
    def visitConstants(self, ctx:QuetzalParser.ConstantsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by QuetzalParser#statute.
    def visitStatute(self, ctx:QuetzalParser.StatuteContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by QuetzalParser#assignation.
    def visitAssignation(self, ctx:QuetzalParser.AssignationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by QuetzalParser#condition.
    def visitCondition(self, ctx:QuetzalParser.ConditionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by QuetzalParser#prints.
    def visitPrints(self, ctx:QuetzalParser.PrintsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by QuetzalParser#var_cte.
    def visitVar_cte(self, ctx:QuetzalParser.Var_cteContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by QuetzalParser#expression.
    def visitExpression(self, ctx:QuetzalParser.ExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by QuetzalParser#exp.
    def visitExp(self, ctx:QuetzalParser.ExpContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by QuetzalParser#term.
    def visitTerm(self, ctx:QuetzalParser.TermContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by QuetzalParser#factor.
    def visitFactor(self, ctx:QuetzalParser.FactorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by QuetzalParser#logic_op.
    def visitLogic_op(self, ctx:QuetzalParser.Logic_opContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by QuetzalParser#read.
    def visitRead(self, ctx:QuetzalParser.ReadContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by QuetzalParser#returning.
    def visitReturning(self, ctx:QuetzalParser.ReturningContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by QuetzalParser#callfunc.
    def visitCallfunc(self, ctx:QuetzalParser.CallfuncContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by QuetzalParser#loop.
    def visitLoop(self, ctx:QuetzalParser.LoopContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by QuetzalParser#openimg.
    def visitOpenimg(self, ctx:QuetzalParser.OpenimgContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by QuetzalParser#saveimg.
    def visitSaveimg(self, ctx:QuetzalParser.SaveimgContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by QuetzalParser#color_replace.
    def visitColor_replace(self, ctx:QuetzalParser.Color_replaceContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by QuetzalParser#grayscale.
    def visitGrayscale(self, ctx:QuetzalParser.GrayscaleContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by QuetzalParser#color_filter.
    def visitColor_filter(self, ctx:QuetzalParser.Color_filterContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by QuetzalParser#edgeDetection.
    def visitEdgeDetection(self, ctx:QuetzalParser.EdgeDetectionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by QuetzalParser#scaleImg.
    def visitScaleImg(self, ctx:QuetzalParser.ScaleImgContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by QuetzalParser#getColorPalette.
    def visitGetColorPalette(self, ctx:QuetzalParser.GetColorPaletteContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by QuetzalParser#colorMatchImage.
    def visitColorMatchImage(self, ctx:QuetzalParser.ColorMatchImageContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by QuetzalParser#encodeSteganography.
    def visitEncodeSteganography(self, ctx:QuetzalParser.EncodeSteganographyContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by QuetzalParser#decodeSteganography.
    def visitDecodeSteganography(self, ctx:QuetzalParser.DecodeSteganographyContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by QuetzalParser#getImageHeight.
    def visitGetImageHeight(self, ctx:QuetzalParser.GetImageHeightContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by QuetzalParser#getImageWidth.
    def visitGetImageWidth(self, ctx:QuetzalParser.GetImageWidthContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by QuetzalParser#specfunct.
    def visitSpecfunct(self, ctx:QuetzalParser.SpecfunctContext):
        return self.visitChildren(ctx)



del QuetzalParser