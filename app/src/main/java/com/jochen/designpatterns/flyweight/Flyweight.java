package com.jochen.designpatterns.flyweight;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by JoChen on 2020/5/22.
 * 享元模式
 */
public class Flyweight {
    public class Font {
        private String key;
        private String name;
        private String decorator;
        private boolean isBold;
        private int size;

        public Font(String key) {
            this.key = key;
            // ...
        }
    }

    public class FontFactory {
        private Map<String, Font> fonts= new ConcurrentHashMap<String, Font>();
        Font getFont(String key) {
            if (!fonts.containsKey(key)) {
                fonts.put(key, new Font(key));
            }
            return fonts.get(key);
        }
    }

    class Client {
        public void main(String[] args) {
            String s1 = "Hello,World!";
            String s2 = "Hello,World!";

            String s3 = getString();
            // intern就是系统中字符串池里面有没有s3的值，
            // 比如"Hello,World!"，如果有的话，就把返回值指向池里面的字符串
            // 其实也就是享元模式
            s3 = s3.intern();
        }

        private String getString() {
            return "";
        }
    }
}
