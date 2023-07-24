##################################
# Cristopher Barrios
# COMPILADORES 
##################################
# visitor.py
##################################
import backend.sistema_de_tipos as tables
from YAPL.YAPLVisitor import YAPLVisitor
from YAPL.YAPLParser import YAPLParser


class MyYAPLVisitor(YAPLVisitor):
    def __init__(self):
        self.ERRORS = []

    def visitAssignment(self, ctx):
        return self.visitChildren(ctx)


    def visitId(self, ctx):
        return "ID"


    def visitInt(self, ctx):
        return "INT"


    def visitStr(self, ctx):
        if (len(ctx.getText()) > 17):
            new_error = tables.Error("Longitud de string excedida", ctx.start.line, ctx.start.column,ctx.getText())
            self.ERRORS.append(new_error)

        return "STRING"


    def visitFalse(self, ctx):
        return "FALSE"
    

    def visitTrue(self, ctx):
        return "TRUE"
    

    def visitAdd(self, ctx):
        l = self.visit(ctx.expr(0))
        r = self.visit(ctx.expr(1))

        if (l != "INT" or r != "INT"):
            if l != "ID" and r != "ID":
                new_error = tables.Error("No corresponden los tipos de la suma", ctx.start.line, ctx.start.column,ctx.getText())
                self.ERRORS.append(new_error)

        return self.visitChildren(ctx)
    

    def visitStar(self, ctx):
        l = self.visit(ctx.expr(0))
        r = self.visit(ctx.expr(1))

        if (l != "INT" or r != "INT"):
            if l != "ID" and r != "ID":
                new_error = tables.Error("No corresponden los tipos de la multiplicacion", ctx.start.line, ctx.start.column,ctx.getText())
                self.ERRORS.append(new_error)   

        return self.visitChildren(ctx)
    
    
    def visitMinus(self, ctx):
        l = self.visit(ctx.expr(0))
        r = self.visit(ctx.expr(1))

        if (l != "INT" or r != "INT"):
            if l != "ID" and r != "ID":
                new_error = tables.Error("No corresponden los tipos de la resta", ctx.start.line, ctx.start.column,ctx.getText())
                self.ERRORS.append(new_error)   

        return self.visitChildren(ctx)
    

    def visitvDivision(self, ctx):
        l = self.visit(ctx.expr(0))
        r = self.visit(ctx.expr(1))

        if (l != "INT" or r != "INT"):
            if l != "ID" and r != "ID":
                new_error = tables.Error("No corresponden los tipos de la division", ctx.start.line, ctx.start.column,ctx.getText())
                self.ERRORS.append(new_error) 

        return self.visitChildren(ctx)


    def visitEqual(self, ctx):
        l = self.visit(ctx.expr(0))
        r = self.visit(ctx.expr(1))

        if (l != r):
            if l != "ID" and r != "ID":
                new_error = tables.Error("No corresponden los tipos de la comparacion <", ctx.start.line, ctx.start.column,ctx.getText())
                self.ERRORS.append(new_error) 

        return self.visitChildren(ctx)
    

    def visitLessEqual(self, ctx):
        l = self.visit(ctx.expr(0))
        r = self.visit(ctx.expr(1))

        if (l != r):
            if l != "ID" and r != "ID":
                new_error = tables.Error("No corresponden los tipos de la comparacion <=", ctx.start.line, ctx.start.column,ctx.getText())
                self.ERRORS.append(new_error) 

        return self.visitChildren(ctx)
    

    def visitLessThan(self, ctx):
        l = self.visit(ctx.expr(0))
        r = self.visit(ctx.expr(1))
        if (l != r):
            if l != "ID" and r != "ID":
                new_error = tables.Error("No corresponden los tipos de la comparacion =", ctx.start.line, ctx.start.column,ctx.getText())
                self.ERRORS.append(new_error) 

        return self.visitChildren(ctx)


