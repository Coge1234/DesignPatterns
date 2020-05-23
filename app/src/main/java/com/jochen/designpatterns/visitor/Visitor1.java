package com.jochen.designpatterns.visitor;

/**
 * Created by JoChen on 2020/5/23.
 * 访问模式
 */
public class Visitor1 {
    public abstract class Element {
        public abstract void func1();
        public abstract void func12(int data);
    }

    public class ElementA extends Element {
        @Override
        public void func1() {

        }

        @Override
        public void func12(int data) {

        }
    }
    public class ElementB extends Element {
        @Override
        public void func1() {

        }

        @Override
        public void func12(int data) {

        }
    }
}
