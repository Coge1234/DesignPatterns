package com.jochen.designpatterns.template_method;

/**
 * Created by JoChen on 2020/5/20.
 * main方法里面整体步骤稳定，但是个别step是经常变化不稳定的
 */
public class Template1_App {

    // 这个方法是会变化的
    public boolean step2() {
        // ...
        return true;
    }
    // 会变化的
    public void step4() {
        //...
    }
    // 假设是稳定的，不会改动的
    public static void main(String[] args) {
        Template1_Lib lib = new Template1_Lib();
        Template1_App app = new Template1_App();
        lib.step1();
        if (app.step2()) {
            lib.step3();
        }
        for (int i = 0; i < 4; i++) {
            app.step4();
        }
        lib.step5();
    }
}
