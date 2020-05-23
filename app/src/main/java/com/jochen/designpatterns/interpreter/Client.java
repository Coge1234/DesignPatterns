package com.jochen.designpatterns.interpreter;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by JoChen on 2020/5/23.
 */
public class Client {
    public static void main(String[] args) {
        String expStr = "a+b";
        Map<String, Integer> var = new HashMap<>();
        var.put("a", 5);
        var.put("b", 5);
        Expression expression = Expression.analyse(expStr);
        int result = expression.interpreter(var);
    }
}
