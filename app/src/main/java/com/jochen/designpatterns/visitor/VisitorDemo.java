package com.jochen.designpatterns.visitor;

/**
 * Created by JoChen on 2020/5/23.
 * 访问模式
 */
public class VisitorDemo {
    public abstract class Element {
        public abstract void accept(Visitor visitor); // 第一次多态辨析
    }

    public class ElementA extends Element {

        @Override
        public void accept(Visitor visitor) {
            visitor.visitElementA(this);
        }
    }

    public class ElementB extends Element {

        @Override
        public void accept(Visitor visitor) {
            visitor.visitElementB(this); // 第二次多态辨析
        }
    }

    public abstract class Visitor {
        public abstract void visitElementA(ElementA element);

        public abstract void visitElementB(ElementB element);
    }

    // =====================================
    // 扩展
    public class Visitor1 extends Visitor {

        @Override
        public void visitElementA(ElementA element) {
            System.out.println("Visitor1 is processing ElementA");
        }

        @Override
        public void visitElementB(ElementB element) {
            System.out.println("Visitor1 is processing ElementB");
        }
    }

    // 扩展2
    public class Visitor2 extends Visitor {

        @Override
        public void visitElementA(ElementA element) {
            System.out.println("Visitor2 is processing ElementA");
        }

        @Override
        public void visitElementB(ElementB element) {
            System.out.println("Visitor2 is processing ElementB");
        }
    }

    public void main(String[] args) {
        Visitor2 visitor = new Visitor2();
        ElementB elementB = new ElementB();
        elementB.accept(visitor); // double dispatch
        ElementA elementA = new ElementA();
        elementA.accept(visitor);
    }
}
