package com.jochen.designpatterns.singleton;

/**
 * Created by JoChen on 2020/5/22.3
 * 保证一个类仅有一个实例，并提供一个该实例的全局访问点
 */
public class Singleon5 {
    private Singleon5() {

    }

    // 这是一个内部嵌套类，外部无法直接访问到它，外部的classloader无法加载到这个类
    private static class SinglonHolder {
        private static final Singleon5 instance = new Singleon5();
    }
    public static Singleon5 getInstance() {
        return SinglonHolder.instance;
    }
}
