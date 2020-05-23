package com.jochen.designpatterns.template_method;

/**
 * Created by JoChen on 2020/5/20.
 * 分析好哪些是稳定的，哪些是变化的
 */
public class Template2_App extends Template2_Lib{

    @Override
    boolean step2() {
        // ...子类重写实现
        return true;
    }

    @Override
    void step4() {
        // ...子类重写实现
    }

    public static void main(String[] args) {
        // 多态
        Template2_Lib lib = new Template2_App();
        lib.run();
    }
}
