package com.jochen.designpatterns.interpreter;

import java.util.Map;
import java.util.Stack;

/**
 * Created by JoChen on 2020/5/23.
 * 解析器模式
 */
public abstract class Expression {

    public abstract int interpreter(Map<String, Integer> var);

    public static Expression analyse(String expStr) {
        Stack<Expression> expStack = new Stack<>();
        Expression left;
        Expression right;
        for (int i = 0; i < expStr.length(); i++) {
            switch (expStr.charAt(i)) {
                case '+':
                    // 加法运算
                    left = expStack.pop();
                    right = new VarExpression(expStr.charAt(++i));
                    expStack.push(new AddExpression(left, right));
                    break;
                default:
                    //变量表达式
                    expStack.push(new VarExpression(expStr.charAt(i)));
            }
        }
        Expression expression = expStack.pop();
        return expression;
    }
}
