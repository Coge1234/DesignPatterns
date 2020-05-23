package com.jochen.designpatterns.template_method;

/**
 * Created by JoChen on 2020/5/20.
 * 程序库开发人员
 * Template Method 模块方法
 */
abstract class Template2_Lib {
    public void run () {
        step1();
        if (step2()) { // 支持变化 ===》 虚函数的多态调用
            step3();
        }
        for (int i = 0; i < 4; i++) {
            step4(); // 支持变化 ===》 虚函数的多态调用
        }
        step5();
    }
    // 假设是稳定的，不会改动的
    public void step1() {
        // ...
    }
    // 假设是稳定的，不会改动的
    public void step3() {
        // ...
    }
    // 假设是稳定的，不会改动的
    public void step5() {
        // ...
    }

    abstract boolean step2(); // 变化

    abstract void step4(); // 变化
}
