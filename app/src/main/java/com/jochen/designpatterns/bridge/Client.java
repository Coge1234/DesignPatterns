package com.jochen.designpatterns.bridge;

import android.media.Image;

/**
 * Created by JoChen on 2020/5/21.
 */
public class Client {
    public abstract class Messager {
        public abstract void login(String username, String password);

        public abstract void sendMessage(String message);

        public abstract void sendPicture(Image image);

        public abstract void playSound();

        public abstract void drawShape();

        public abstract void writeText();

        public abstract void connect();
    }

    public abstract class MobileMessagerBase extends Messager {
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

    public class MobileMessagerLite extends MobileMessagerBase {
        @Override
        public void login(String username, String password) {
            super.connect();
            // ......
        }

        @Override
        public void sendMessage(String message) {
            super.writeText();
            // ......
        }

        @Override
        public void sendPicture(Image image) {
            super.drawShape();
            // ......
        }
    }

    // 商业版
    public class MobileMessagerPerfect extends MobileMessagerBase {
        @Override
        public void login(String username, String password) {
            super.playSound();
            // ******
            super.connect();
            // ......
        }

        @Override
        public void sendMessage(String message) {
            super.playSound();
            // ******
            super.writeText();
            // ......
        }

        @Override
        public void sendPicture(Image image) {
            super.playSound();
            // ******
            super.drawShape();
            // ......
        }
    }

    // 平台实现
    public abstract class PCMessagerBase extends Messager {
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

    public class PCMessagerLite extends PCMessagerBase {
        @Override
        public void login(String username, String password) {
            super.connect();
            // ......
        }

        @Override
        public void sendMessage(String message) {
            super.writeText();
            // ......
        }

        @Override
        public void sendPicture(Image image) {
            super.drawShape();
            // ......
        }
    }

    // 商业版
    public class PCMessagerPerfect extends PCMessagerBase {
        @Override
        public void login(String username, String password) {
            super.playSound();
            // ******
            super.connect();
            // ......
        }

        @Override
        public void sendMessage(String message) {
            super.playSound();
            // ******
            super.writeText();
            // ......
        }

        @Override
        public void sendPicture(Image image) {
            super.playSound();
            // ******
            super.drawShape();
            // ......
        }
    }

    public void main(String[] args) {
        // 编译时装配
        Messager m = new MobileMessagerPerfect();
    }
}
