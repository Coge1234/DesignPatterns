package com.jochen.designpatterns.bridge;

import android.media.Image;

/**
 * Created by JoChen on 2020/5/21.
 */
public class Client2 {
    public abstract class Messager {
        protected MessagerImp msgImp;

        public Messager(MessagerImp msgImp) {
            this.msgImp = msgImp;
        }

        public abstract void login(String username, String password);

        public abstract void sendMessage(String message);

        public abstract void sendPicture(Image image);
    }

    public abstract class MessagerImp {
        public abstract void playSound();

        public abstract void drawShape();

        public abstract void writeText();

        public abstract void connect();
    }

    // 平台实现
    public abstract class PCMessagerImp extends MessagerImp {
        @Override
        public void playSound() {
            // **********
        }

        @Override
        public void drawShape() {
            // **********
        }

        @Override
        public void writeText() {
            // **********
        }

        @Override
        public void connect() {
            // **********
        }
    }

    public abstract class MobileMessagerBase extends MessagerImp {
        @Override
        public void playSound() {
            // ==========
        }

        @Override
        public void drawShape() {
            // ==========
        }

        @Override
        public void writeText() {
            // ==========
        }

        @Override
        public void connect() {
            // ==========
        }
    }

    // 业务抽象
    public class PCMessagerLite extends Messager{
        public PCMessagerLite(MessagerImp msgImp) {
            super(msgImp);
        }
        // MessagerImp msgImp; // 在运行时 = new PCMessagerImp()

        public void login(String username, String password) {
            msgImp.connect();
            // ......
        }

        public void sendMessage(String message) {
            msgImp.writeText();
            // ......
        }

        public void sendPicture(Image image) {
            msgImp.drawShape();
            // ......
        }
    }

    // 商业版
    public class MessagerPerfect extends Messager {

        public MessagerPerfect(MessagerImp msgImp) {
            super(msgImp);
        }

        @Override
        public void login(String username, String password) {
            msgImp.playSound();
            // ******
            msgImp.connect();
            // ......
        }

        @Override
        public void sendMessage(String message) {
            msgImp.playSound();
            // ******
            msgImp.writeText();
            // ......
        }

        @Override
        public void sendPicture(Image image) {
            msgImp.playSound();
            // ******
            msgImp.drawShape();
            // ......
        }
    }

    public void main(String[] args) {
        // 编译时装配
        Messager m = new MessagerPerfect(new PCMessagerImp() {
        });
    }
}
