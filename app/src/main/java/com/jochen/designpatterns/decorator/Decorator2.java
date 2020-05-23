package com.jochen.designpatterns.decorator;

/**
 * Created by JoChen on 2020/5/20.
 * Decorator 单一职责
 * 在软件组件的设计中，如果责任划分的不清晰，
 * 使用继承得到的结果往往是随着需求的变化，
 * 子类急剧膨胀，同时充斥着重复的代码，这时候
 * 的关键是划清责任
 */
public class Decorator2 {
    public abstract class Stream {
        public abstract char read(int number);

        public abstract void seek(int position);

        public abstract void write(char data);
    }

    // 主体类
    public class FileStream extends Stream {
        // 读文件流
        @Override
        public char read(int number) {
            return 0;
        }

        // 定位文件流
        @Override
        public void seek(int position) {

        }

        // 写文件流
        @Override
        public void write(char data) {

        }
    }

    class NetworkStream extends Stream {
        // 读网络流
        @Override
        public char read(int number) {
            return 0;
        }

        // 定位网络流
        @Override
        public void seek(int position) {

        }

        // 写网络流
        @Override
        public void write(char data) {

        }
    }

    class MemoryStream extends Stream {

        @Override
        public char read(int number) {
            return 0;
        }

        @Override
        public void seek(int position) {

        }

        @Override
        public void write(char data) {

        }
    }

    // 继承：接口协议
    class CryptoStream extends Stream{
        // 组合：复用实现
        Stream s; // s = new FileStream() s = new NetwordStream() s = new MemoryStream()

        public CryptoStream(Stream s) {
            this.s = s;
        }

        public char read(int number) {
            // 额外的加密操作
            return s.read(number);
        }

        public void seek(int position) {
            // 额外的加密操作
            s.seek(position);
            // 额外的加密操作
        }

        public void write(char data) {
            // 额外的加密操作
            s.write(data);
            // 额外的加密操作
        }
    }

    class BufferedStream extends Stream {
        Stream s;

        public BufferedStream(Stream s) {
            this.s = s;
        }

        @Override
        public char read(int number) {
            return 0;
        }

        @Override
        public void seek(int position) {

        }

        @Override
        public void write(char data) {

        }
    }

    class Client {
        public void main(String[] args) {
            // 运行时装配

            Stream s1 = new CryptoStream(new FileStream());
            Stream fs2 = new BufferedStream(new FileStream());
            Stream fs3 = new CryptoStream(new BufferedStream(new FileStream()));
        }
    }
}
