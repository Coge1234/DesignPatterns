package com.jochen.designpatterns.singleton;

/**
 * Created by JoChen on 2020/5/22.3
 * 保证一个类仅有一个实例，并提供一个该实例的全局访问点
 *
 * 多线程读取机会不是那么多的话
 */
public class Singleon3 {
    private static volatile Singleon3 instance;

    private Singleon3() {

    }

    // 多线程读取性能比较差
    public static synchronized Singleon3 getInstance() {
        if (instance == null) {
            instance = new Singleon3();
        }
        return instance;
    }
}
