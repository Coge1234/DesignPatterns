package com.jochen.designpatterns.adapter;

/**
 * Created by JoChen on 2020/5/22.
 * 适配器模式
 */
public class Adapter {
    public interface ITarget {
        public void process();
    }

    // 目标环境(新环境)
    public class TargetLibrary {
        public void invoke(ITarget target) {
            target.process();
        }
    }
    // 现存接口(老接口)
    public interface IAdapter {
        public void foo(int data);
        public int bar();
    }
    // 现存类型
    public class OldClass implements IAdapter {

        @Override
        public void foo(int data) {

        }

        @Override
        public int bar() {
            return 0;
        }
    }
    // 对象适配器
    public class MyAdapter implements ITarget { // 继承
        IAdapter adapter; // 组合

        public MyAdapter(IAdapter adapter) {
            this.adapter = adapter;
        }

        @Override
        public void process() {
            int data = adapter.bar();
            adapter.foo(data);
        }
    }
}
