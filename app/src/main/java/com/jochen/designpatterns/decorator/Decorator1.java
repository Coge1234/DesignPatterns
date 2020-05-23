package com.jochen.designpatterns.decorator;

/**
 * Created by JoChen on 2020/5/20.
 * Decorator 单一职责
 */
public class Decorator1 {
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

    // 扩展操作
    class CryptoFileStream extends FileStream {
        @Override
        public char read(int number) {
            // 额外的加密操作
            return super.read(number);
        }

        @Override
        public void seek(int position) {
            // 额外的加密操作
            super.seek(position);
            // 额外的加密操作
        }

        @Override
        public void write(char data) {
            // 额外的加密操作
            super.write(data);
            // 额外的加密操作
        }
    }

    class CryptoNetworkStream extends NetworkStream {
        @Override
        public char read(int number) {
            // 额外的加密操作
            return super.read(number);
        }

        @Override
        public void seek(int position) {
            // 额外的加密操作
            super.seek(position);
            // 额外的加密操作
        }

        @Override
        public void write(char data) {
            // 额外的加密操作
            super.write(data);
            // 额外的加密操作
        }
    }

    class CryptoMemoryStream extends MemoryStream {
        @Override
        public char read(int number) {
            // 额外的加密操作
            return super.read(number);
        }

        @Override
        public void seek(int position) {
            // 额外的加密操作
            super.seek(position);
            // 额外的加密操作
        }

        @Override
        public void write(char data) {
            // 额外的加密操作
            super.write(data);
            // 额外的加密操作
        }
    }

    class BufferedFileStream extends FileStream {

    }

    class BufferedNetworkStream extends NetworkStream {

    }

    class BufferedMemoryStream extends MemoryStream {

    }

    class CryptoBufferedStream extends FileStream {
        @Override
        public char read(int number) {
            // 额外的加密操作
            // 额外的缓冲操作
            // 读文件流
            return super.read(number);
        }

        @Override
        public void seek(int position) {
            super.seek(position);
        }

        @Override
        public void write(char data) {
            super.write(data);
        }
    }

    class Client {
        public void main(String[] args) {
            // 编译时装配
            CryptoFileStream fs1 = new CryptoFileStream();
            BufferedFileStream fs2 = new BufferedFileStream();
            CryptoBufferedStream fs3 = new CryptoBufferedStream();
        }
    }
}

