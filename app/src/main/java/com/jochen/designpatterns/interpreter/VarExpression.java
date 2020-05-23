package com.jochen.designpatterns.interpreter;

import java.util.Map;

/**
 * Created by JoChen on 2020/5/23.
 */
public class VarExpression extends Expression {
    char key;

    public VarExpression(char key) {
        this.key = key;
    }

    @Override
    public int interpreter(Map<String, Integer> var) {
        return var.get(String.valueOf(key));
    }
}
