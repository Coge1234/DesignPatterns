package com.jochen.designpatterns.singleton;

/**
 * Created by JoChen on 2020/5/22.3
 * 保证一个类仅有一个实例，并提供一个该实例的全局访问点
 */
public class Singleon1 {
    private static Singleon1 instance;

    private Singleon1() {

    }

    public static Singleon1 getInstance() {
        if (instance == null) {
            instance = new Singleon1();
        }
        return instance;
    }
}
