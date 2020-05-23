package com.jochen.designpatterns.proxy;

/**
 * Created by JoChen on 2020/5/22.
 */
public class Proxy {
    public interface ISubject {
        public void process();
    }

    public class RealSubiect implements ISubject {

        @Override
        public void process() {

        }
    }

    ////////////////////////////////
    // Proxy的设计
    public class SubjectProxy implements ISubject {

        //        RealSubiect realSubiect;
        @Override
        public void process() {
            // 对RealSubject的一种间接访问
//            realSubiect.process();
        }
    }

    public class ClientApp {
        ISubject subject;

        public ClientApp() {
            subject = new SubjectProxy();
        }

        public void DoTask() {
            // ...
            subject.process();
            // ...
        }
    }
}
