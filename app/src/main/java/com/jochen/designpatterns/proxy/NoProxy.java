package com.jochen.designpatterns.proxy;

/**
 * Created by JoChen on 2020/5/22.
 */
public class NoProxy {
    public interface ISubject {
        public void process();
    }

    public class RealSubiect implements ISubject {

        @Override
        public void process() {

        }
    }
    // 上面是在A进程
    ////////////////////////////////
    // 下面是在B进程
    public class ClientApp {
        ISubject subject;
        public ClientApp() {
            subject = new RealSubiect();
        }

        public void DoTask() {
            // ...
            subject.process();
            // ...
        }
    }
}
