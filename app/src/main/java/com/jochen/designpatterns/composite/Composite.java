package com.jochen.designpatterns.composite;

import java.util.Vector;

/**
 * Created by JoChen on 2020/5/22.
 * 组合模式
 * android中的viewgroup view
 */
public class Composite {
    public abstract class Component {
        public abstract void process();
    }

    // 树节点
    public class CompositeDemo extends Component {
        String name;
        Vector<Component> elements;

        public CompositeDemo(String s) {
            name = s;
        }

        public void add(Component element) {
            elements.add(element);
        }

        public void remove(Component element) {
            elements.remove(element);
        }

        @Override
        public void process() {
            // 1.process current node
            // 2.process leaf nodes
            for (Component e : elements) {
                e.process(); // 多态调用
            }
        }
    }

    // 叶子节点
    public class Leaf extends Component {
        String name;

        public Leaf(String s) {
            name = s;
        }

        @Override
        public void process() {

        }
    }

    public class ClientApp {
        public void invoke(Component c) {
            c.process();
        }
        public void main(String args[]) {
            CompositeDemo root = new CompositeDemo("root");
            CompositeDemo treeNode1 = new CompositeDemo("treeNode1");
            CompositeDemo treeNode2 = new CompositeDemo("treeNode2");
            CompositeDemo treeNode3 = new CompositeDemo("treeNode3");
            CompositeDemo treeNode4 = new CompositeDemo("treeNode4");
            Leaf leaf1 = new Leaf("leaf1");
            Leaf leaf2 = new Leaf("leaf2");

            root.add(treeNode1);
            treeNode1.add(treeNode2);
            treeNode2.add(leaf1);

            root.add(treeNode3);
            treeNode3.add(treeNode4);
            treeNode3.add(leaf2);

            invoke(root);
            invoke(leaf2);
            invoke(treeNode3);
        }
    }
}
