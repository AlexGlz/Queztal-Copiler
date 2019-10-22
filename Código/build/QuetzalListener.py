# Generated from Quetzal.g4 by ANTLR 4.7.2
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .QuetzalParser import QuetzalParser
else:
    from QuetzalParser import QuetzalParser

from build.intermediateCode import *


# This class defines a complete listener for a parse tree produced by QuetzalParser.
class QuetzalListener(ParseTreeListener):

    # Enter a parse tree produced by QuetzalParser#program.
    def enterProgram(self, ctx:QuetzalParser.ProgramContext):
        pass

    # Exit a parse tree produced by QuetzalParser#program.
    def exitProgram(self, ctx:QuetzalParser.ProgramContext):
        pass


    # Enter a parse tree produced by QuetzalParser#main.
    def enterMain(self, ctx:QuetzalParser.MainContext):
        pass

    # Exit a parse tree produced by QuetzalParser#main.
    def exitMain(self, ctx:QuetzalParser.MainContext):
        pass


    # Enter a parse tree produced by QuetzalParser#variables.
    def enterVariables(self, ctx:QuetzalParser.VariablesContext):
        pass

    # Exit a parse tree produced by QuetzalParser#variables.
    def exitVariables(self, ctx:QuetzalParser.VariablesContext):
        pass


    # Enter a parse tree produced by QuetzalParser#function.
    def enterFunction(self, ctx:QuetzalParser.FunctionContext):
        pass

    # Exit a parse tree produced by QuetzalParser#function.
    def exitFunction(self, ctx:QuetzalParser.FunctionContext):
        pass


    # Enter a parse tree produced by QuetzalParser#block.
    def enterBlock(self, ctx:QuetzalParser.BlockContext):
        pass

    # Exit a parse tree produced by QuetzalParser#block.
    def exitBlock(self, ctx:QuetzalParser.BlockContext):
        pass


    # Enter a parse tree produced by QuetzalParser#types.
    def enterTypes(self, ctx:QuetzalParser.TypesContext):
        pass

    # Exit a parse tree produced by QuetzalParser#types.
    def exitTypes(self, ctx:QuetzalParser.TypesContext):
        pass


    # Enter a parse tree produced by QuetzalParser#constants.
    def enterConstants(self, ctx:QuetzalParser.ConstantsContext):
        pass

    # Exit a parse tree produced by QuetzalParser#constants.
    def exitConstants(self, ctx:QuetzalParser.ConstantsContext):
        pass


    # Enter a parse tree produced by QuetzalParser#prints.
    def enterPrints(self, ctx:QuetzalParser.PrintsContext):
        pass

    # Exit a parse tree produced by QuetzalParser#prints.
    def exitPrints(self, ctx:QuetzalParser.PrintsContext):
        pass


    # Enter a parse tree produced by QuetzalParser#read.
    def enterRead(self, ctx:QuetzalParser.ReadContext):
        pass

    # Exit a parse tree produced by QuetzalParser#read.
    def exitRead(self, ctx:QuetzalParser.ReadContext):
        pass


    # Enter a parse tree produced by QuetzalParser#statute.
    def enterStatute(self, ctx:QuetzalParser.StatuteContext):
        pass

    # Exit a parse tree produced by QuetzalParser#statute.
    def exitStatute(self, ctx:QuetzalParser.StatuteContext):
        pass


    # Enter a parse tree produced by QuetzalParser#assignation.
    def enterAssignation(self, ctx:QuetzalParser.AssignationContext):
        pass

    # Exit a parse tree produced by QuetzalParser#assignation.
    def exitAssignation(self, ctx:QuetzalParser.AssignationContext):
        pass


    # Enter a parse tree produced by QuetzalParser#condition.
    def enterCondition(self, ctx:QuetzalParser.ConditionContext):
        pass

    # Exit a parse tree produced by QuetzalParser#condition.
    def exitCondition(self, ctx:QuetzalParser.ConditionContext):
        pass


    # Enter a parse tree produced by QuetzalParser#var_cte.
    def enterVar_cte(self, ctx:QuetzalParser.Var_cteContext):
        pass

    # Exit a parse tree produced by QuetzalParser#var_cte.
    def exitVar_cte(self, ctx:QuetzalParser.Var_cteContext):
        pass


    # Enter a parse tree produced by QuetzalParser#expression.
    def enterExpression(self, ctx:QuetzalParser.ExpressionContext):
        pass

    # Exit a parse tree produced by QuetzalParser#expression.
    def exitExpression(self, ctx:QuetzalParser.ExpressionContext):
        pass


    # Enter a parse tree produced by QuetzalParser#expLogic.
    def enterExpLogic(self, ctx:QuetzalParser.ExpLogicContext):
        pass

    # Exit a parse tree produced by QuetzalParser#expLogic.
    def exitExpLogic(self, ctx:QuetzalParser.ExpLogicContext):
        pass


    # Enter a parse tree produced by QuetzalParser#exp.
    def enterExp(self, ctx:QuetzalParser.ExpContext):
        pass

    # Exit a parse tree produced by QuetzalParser#exp.
    def exitExp(self, ctx:QuetzalParser.ExpContext):
        pass


    # Enter a parse tree produced by QuetzalParser#term.
    def enterTerm(self, ctx:QuetzalParser.TermContext):
        pass

    # Exit a parse tree produced by QuetzalParser#term.
    def exitTerm(self, ctx:QuetzalParser.TermContext):
        pass


    # Enter a parse tree produced by QuetzalParser#factor.
    def enterFactor(self, ctx:QuetzalParser.FactorContext):
        pass

    # Exit a parse tree produced by QuetzalParser#factor.
    def exitFactor(self, ctx:QuetzalParser.FactorContext):
        pass


    # Enter a parse tree produced by QuetzalParser#logic_op.
    def enterLogic_op(self, ctx:QuetzalParser.Logic_opContext):
        pass

    # Exit a parse tree produced by QuetzalParser#logic_op.
    def exitLogic_op(self, ctx:QuetzalParser.Logic_opContext):
        pass


    # Enter a parse tree produced by QuetzalParser#returning.
    def enterReturning(self, ctx:QuetzalParser.ReturningContext):
        pass

    # Exit a parse tree produced by QuetzalParser#returning.
    def exitReturning(self, ctx:QuetzalParser.ReturningContext):
        pass


    # Enter a parse tree produced by QuetzalParser#callfunc.
    def enterCallfunc(self, ctx:QuetzalParser.CallfuncContext):
        pass

    # Exit a parse tree produced by QuetzalParser#callfunc.
    def exitCallfunc(self, ctx:QuetzalParser.CallfuncContext):
        pass


    # Enter a parse tree produced by QuetzalParser#loop.
    def enterLoop(self, ctx:QuetzalParser.LoopContext):
        pass

    # Exit a parse tree produced by QuetzalParser#loop.
    def exitLoop(self, ctx:QuetzalParser.LoopContext):
        pass


    # Enter a parse tree produced by QuetzalParser#openimg.
    def enterOpenimg(self, ctx:QuetzalParser.OpenimgContext):
        pass

    # Exit a parse tree produced by QuetzalParser#openimg.
    def exitOpenimg(self, ctx:QuetzalParser.OpenimgContext):
        pass


    # Enter a parse tree produced by QuetzalParser#saveimg.
    def enterSaveimg(self, ctx:QuetzalParser.SaveimgContext):
        pass

    # Exit a parse tree produced by QuetzalParser#saveimg.
    def exitSaveimg(self, ctx:QuetzalParser.SaveimgContext):
        pass


    # Enter a parse tree produced by QuetzalParser#color_replace.
    def enterColor_replace(self, ctx:QuetzalParser.Color_replaceContext):
        pass

    # Exit a parse tree produced by QuetzalParser#color_replace.
    def exitColor_replace(self, ctx:QuetzalParser.Color_replaceContext):
        pass


    # Enter a parse tree produced by QuetzalParser#grayscale.
    def enterGrayscale(self, ctx:QuetzalParser.GrayscaleContext):
        pass

    # Exit a parse tree produced by QuetzalParser#grayscale.
    def exitGrayscale(self, ctx:QuetzalParser.GrayscaleContext):
        pass


    # Enter a parse tree produced by QuetzalParser#color_filter.
    def enterColor_filter(self, ctx:QuetzalParser.Color_filterContext):
        pass

    # Exit a parse tree produced by QuetzalParser#color_filter.
    def exitColor_filter(self, ctx:QuetzalParser.Color_filterContext):
        pass


    # Enter a parse tree produced by QuetzalParser#edgeDetection.
    def enterEdgeDetection(self, ctx:QuetzalParser.EdgeDetectionContext):
        pass

    # Exit a parse tree produced by QuetzalParser#edgeDetection.
    def exitEdgeDetection(self, ctx:QuetzalParser.EdgeDetectionContext):
        pass


    # Enter a parse tree produced by QuetzalParser#scaleImg.
    def enterScaleImg(self, ctx:QuetzalParser.ScaleImgContext):
        pass

    # Exit a parse tree produced by QuetzalParser#scaleImg.
    def exitScaleImg(self, ctx:QuetzalParser.ScaleImgContext):
        pass


    # Enter a parse tree produced by QuetzalParser#getColorPalette.
    def enterGetColorPalette(self, ctx:QuetzalParser.GetColorPaletteContext):
        pass

    # Exit a parse tree produced by QuetzalParser#getColorPalette.
    def exitGetColorPalette(self, ctx:QuetzalParser.GetColorPaletteContext):
        pass


    # Enter a parse tree produced by QuetzalParser#colorMatchImage.
    def enterColorMatchImage(self, ctx:QuetzalParser.ColorMatchImageContext):
        pass

    # Exit a parse tree produced by QuetzalParser#colorMatchImage.
    def exitColorMatchImage(self, ctx:QuetzalParser.ColorMatchImageContext):
        pass


    # Enter a parse tree produced by QuetzalParser#encodeSteganography.
    def enterEncodeSteganography(self, ctx:QuetzalParser.EncodeSteganographyContext):
        pass

    # Exit a parse tree produced by QuetzalParser#encodeSteganography.
    def exitEncodeSteganography(self, ctx:QuetzalParser.EncodeSteganographyContext):
        pass


    # Enter a parse tree produced by QuetzalParser#decodeSteganography.
    def enterDecodeSteganography(self, ctx:QuetzalParser.DecodeSteganographyContext):
        pass

    # Exit a parse tree produced by QuetzalParser#decodeSteganography.
    def exitDecodeSteganography(self, ctx:QuetzalParser.DecodeSteganographyContext):
        pass


    # Enter a parse tree produced by QuetzalParser#getImageHeight.
    def enterGetImageHeight(self, ctx:QuetzalParser.GetImageHeightContext):
        pass

    # Exit a parse tree produced by QuetzalParser#getImageHeight.
    def exitGetImageHeight(self, ctx:QuetzalParser.GetImageHeightContext):
        pass


    # Enter a parse tree produced by QuetzalParser#getImageWidth.
    def enterGetImageWidth(self, ctx:QuetzalParser.GetImageWidthContext):
        pass

    # Exit a parse tree produced by QuetzalParser#getImageWidth.
    def exitGetImageWidth(self, ctx:QuetzalParser.GetImageWidthContext):
        pass


    # Enter a parse tree produced by QuetzalParser#specfunct.
    def enterSpecfunct(self, ctx:QuetzalParser.SpecfunctContext):
        pass

    # Exit a parse tree produced by QuetzalParser#specfunct.
    def exitSpecfunct(self, ctx:QuetzalParser.SpecfunctContext):
        pass


