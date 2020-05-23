package com.jochen.designpatterns.singleton;

/**
 * Created by JoChen on 2020/5/22.3
 * 保证一个类仅有一个实例，并提供一个该实例的全局访问点
 *
 * 这就变成了我明明不使用，都已经加载内存了，性能不好
 */
public class Singleon4 {
    private static final Singleon4 instance = new Singleon4();

    private Singleon4() {

    }

    public static Singleon4 getInstance() {
        return instance;
    }
}
