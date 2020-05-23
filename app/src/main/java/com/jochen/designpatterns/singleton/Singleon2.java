package com.jochen.designpatterns.singleton;

/**
 * Created by JoChen on 2020/5/22.3
 * 保证一个类仅有一个实例，并提供一个该实例的全局访问点
 */
public class Singleon2 {
    private static volatile Singleon2 instance;

    private Singleon2() {

    }

    public static Singleon2 getInstance() {
        if (instance == null) {
            synchronized (Singleon2.class) {
                if (instance == null) {
                    // 下面这一行还是会有问题，虚拟局内部还是有多个步骤执行
                    // 1.先分配内存，将内存地址赋值给instance，执行构造器
                    // 2.先分配内存，执行构造器，将内存地址赋值给instance
                    // 后来添加volatile关键字
                    instance = new Singleon2();
                }
            }
        }
        return instance;
    }
}
