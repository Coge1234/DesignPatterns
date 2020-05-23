package com.jochen.designpatterns.interpreter;

/**
 * Created by JoChen on 2020/5/23.
 */
public abstract class SymbolExpression extends Expression {
    // 运算符左右两个参数
    protected Expression left;
    protected Expression right;
    public SymbolExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
}
