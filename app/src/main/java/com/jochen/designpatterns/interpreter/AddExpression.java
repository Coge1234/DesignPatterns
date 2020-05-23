package com.jochen.designpatterns.interpreter;

import java.util.Map;

/**
 * Created by JoChen on 2020/5/23.
 */
public class AddExpression extends SymbolExpression {
    public AddExpression(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int interpreter(Map<String, Integer> var) {
        return left.interpreter(var) + right.interpreter(var);
    }
}
