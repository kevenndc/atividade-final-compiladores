import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.management.RuntimeErrorException;


public class EvalVisitor extends LabeledExprBaseVisitor<Value> {
    Map<String, Value> memory = new HashMap<String, Value>();
    Map<String, String> typeMap = new HashMap<String, String>();
    Map<String, Boolean> constants = new HashMap<String, Boolean>();

    @Override
    public Value visitInitVariables(LabeledExprParser.InitVariablesContext ctx) {
        String id = ctx.ID().getText();
        String type = ctx.type.getText();

        if (memory.containsKey(id)) {
            throw new RuntimeException("A variável " + id + " já foi declarada");
        }

        memory.put(id, null);
        typeMap.put(id, type);

        for (LabeledExprParser.Multi_var_initContext var : ctx.multi_var_init()) {
            id = visit(var).asString();

            if (memory.containsKey(id)) {
                throw new RuntimeException("A variável " + id + " já foi declarada");
            }

            memory.put(id, null);
            typeMap.put(id, type);
        }

        return Value.VOID;
    }

    @Override
    public Value visitInitExprConst(LabeledExprParser.InitExprConstContext ctx) {
        String id = ctx.ID().getText();
        String type = ctx.type.getText();
        Value value = visit(ctx.expr());

        if (memory.containsKey(id)) {
            throw new RuntimeException("A variável " + id + " já foi declarada");
        }

        memory.put(id, value);
        typeMap.put(id, type);
        constants.put(id, true);

        return Value.VOID;
    }

    @Override
    public Value visitInitStrConst(LabeledExprParser.InitStrConstContext ctx) {
        String id = ctx.ID().getText();
        String type = ctx.type.getText();
        Value value = visit(ctx.str_val());

        if (memory.containsKey(id)) {
            throw new RuntimeException("A variável " + id + " já foi declarada");
        }

        memory.put(id, value);
        typeMap.put(id, type);
        constants.put(id, true);

        return Value.VOID;
    }

    @Override
    public Value visitMultiVariablesInit(LabeledExprParser.MultiVariablesInitContext ctx) {
        String id = ctx.ID().getText();
        return new Value(id);
    }

    /** ID '=' expr NEWLINE */
    @Override
    public Value visitAssignExpr(LabeledExprParser.AssignExprContext ctx) {
        String id = ctx.ID().getText();

        if (! memory.containsKey(id)) {
            throw new RuntimeException("A variável '" + id + "' não foi inicializada.");
        }

        if (constants.containsKey(id) && memory.get(id) != null) {
            throw new RuntimeException("A variável " + id + " não pose ser redeclarada pis ela é uma CONSTANTE.");
        }

        Value value = visit(ctx.expr());

        if (! value.getType().equals(typeMap.get(id))) {
            throw new RuntimeException("A variável " + id + " é do tipo " + typeMap.get(id) + " porém um valor do tipo " + value.getType() + " foi passado.");
        }

        return memory.put(id, value);

    }

    @Override
    public Value visitAssignStr(LabeledExprParser.AssignStrContext ctx) {
        String id = ctx.ID().getText();

        if (! memory.containsKey(id)) {
            throw new RuntimeException("A variável '" + id + "' não foi inicializada.");
        }

        if (constants.containsKey(id) && memory.get(id) != null) {
            throw new RuntimeException("A variável " + id + " não pose ser redeclarada pois ela é uma CONSTANTE.");
        }

        Value value = visit(ctx.str_val());


        if (! value.getType().equals(typeMap.get(id))) {
            throw new RuntimeException("A variável " + id + " é do tipo " + typeMap.get(id) + " porém um valor do tipo " + value.getType() + " foi passado.");
        }

        return memory.put(id, value);

    }

    @Override
    public Value visitPrintExpr(LabeledExprParser.PrintExprContext ctx) {
        Value value = visit(ctx.expr());

        if (value.isString()) {
            System.out.println("\"" + String.valueOf(value) + "\"");
            return Value.VOID;
        }

        System.out.println(String.valueOf(value));

        return Value.VOID;

    }

    @Override
    public Value visitPrintStringConcat(LabeledExprParser.PrintStringConcatContext ctx) {
        Value value = visit(ctx.str_concat());

        System.out.println("\"" + String.valueOf(value) + "\"");

        return Value.VOID;

    }

    /** INT */
    @Override
    public Value visitInteger(LabeledExprParser.IntegerContext ctx) {
        return new Value(Integer.valueOf(ctx.getText()));
    }

    /** Float */
    @Override
    public Value visitFloat(LabeledExprParser.FloatContext ctx) {
        return new Value(Float.valueOf(ctx.getText()));
    }

    /** String */
    @Override
    public Value visitString(LabeledExprParser.StringContext ctx) {
        String str = ctx.STRINGVAL().getText();

        str = str.substring(1, str.length() - 1).replace("\"\"", "\"");
        return new Value(str);
    }

    /** ID */
    @Override
    public Value visitId(LabeledExprParser.IdContext ctx) {
        String id = ctx.getText();
        Value value = memory.get(id);

        if(value == null) {
            throw new RuntimeException("A variável '" + id + "' não foi inicializada.");
        }
        
        return value;
    }


    /** expr op=('*'|'/') expr */
    @Override
    public Value visitMulDiv(LabeledExprParser.MulDivContext ctx) {
        float left = Float.valueOf(visit(ctx.expr(0)).asFloat());
        float right = Float.valueOf(visit(ctx.expr(1)).asFloat());
        float result;

        if (ctx.op.getType() == LabeledExprParser.MUL) {
            result = left * right;
        } else {
            result = left / right;
        }

        if ((int)result == result) {
            return new Value((int)result);
        }

        return new Value(result);
    }

    /** expr op=('+' | '-') */
    @Override
    public Value visitAddSub(LabeledExprParser.AddSubContext ctx) {
        float left = visit(ctx.expr(0)).asFloat();
        float right = visit(ctx.expr(1)).asFloat();
        float result;

        if (ctx.op.getType() == LabeledExprParser.ADD) {
            result = left + right;
        } else {
            result = left - right;
        }

        if ((int)result == result) {
            return new Value((int)result);
        }

        return new Value(result);
    }

    /** '(' expr ')' */
    @Override
    public Value visitParens(LabeledExprParser.ParensContext ctx) {
        return visit(ctx.expr());
    }

    @Override
    public Value visitEvalGreat(LabeledExprParser.EvalGreatContext ctx) {
        float left = visit(ctx.val(0)).asFloat();
        float right = visit(ctx.val(1)).asFloat();
        boolean result = left > right;

        return new Value(result);
    }

    @Override
    public Value visitEvalLess(LabeledExprParser.EvalLessContext ctx) {
        float left = visit(ctx.val(0)).asFloat();
        float right = visit(ctx.val(1)).asFloat();

        boolean result = left < right;

        return new Value(result);
    }

    @Override
    public Value visitElseStat(LabeledExprParser.ElseStatContext ctx) {
        for (LabeledExprParser.StatContext statement : ctx.stat()) {
            visit(statement);
        }
        return Value.VOID;
    }


    @Override
    public Value visitIfStatement(LabeledExprParser.IfStatementContext ctx) {
        boolean evaluatedCondition = visit(ctx.cond()).asBoolean();

        if (evaluatedCondition) {
            for (LabeledExprParser.StatContext statement : ctx.stat()) {
                visit(statement);
            }
        }
        return Value.VOID;
    }

    @Override
    public Value visitIfElseStatement(LabeledExprParser.IfElseStatementContext ctx) {
        boolean evaluatedCondition = visit(ctx.cond()).asBoolean();

        if (evaluatedCondition) {
            for (LabeledExprParser.StatContext statement : ctx.stat()) {
                visit(statement);
            }
        } else {
            visit(ctx.else_stat());
            
        }

        return Value.VOID;
    }

    @Override
    public Value visitWhileStatement(LabeledExprParser.WhileStatementContext ctx) {

        boolean evaluatedCondition = visit(ctx.cond()).asBoolean();

        while (evaluatedCondition) {
            for (LabeledExprParser.StatContext statement : ctx.stat()) {
                visit(statement);
            }
            evaluatedCondition = visit(ctx.cond()).asBoolean();
        }

        return Value.VOID;
    }

    @Override
    public Value visitForStatement(LabeledExprParser.ForStatementContext ctx) {

        String id = ctx.ID().getText();
        Value index = new Value(Integer.valueOf(ctx.INTVAL().getText()));

        memory.put(id, index);

        boolean evaluatedCondition = visit(ctx.cond()).asBoolean();

        while (evaluatedCondition) {
            for (LabeledExprParser.StatContext statement : ctx.stat()) {
                visit(statement);
            }
            index = new Value(Integer.valueOf(index.asInteger().intValue() + 1));
            memory.replace(id, index);
            evaluatedCondition = visit(ctx.cond()).asBoolean();
        }
        memory.remove(id);

        return Value.VOID;
    }

    @Override
    public Value visitConcatString(LabeledExprParser.ConcatStringContext ctx) {
        
        String left = visit(ctx.str_concat(0)).asString();
        String right = visit(ctx.str_concat(1)).asString();

        return new Value(left + right);
    }

}
