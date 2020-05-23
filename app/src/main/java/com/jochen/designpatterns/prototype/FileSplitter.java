package com.jochen.designpatterns.prototype;

/**
 * Created by JoChen on 2020/5/22.
 * 原型模式
 */
public class FileSplitter {
    abstract class ISplitter {
        public abstract void split();
        public abstract ISplitter clone();
    }

    class BinarySplitter extends ISplitter {

        @Override
        public void split() {

        }

        @Override
        public ISplitter clone() {
            BinarySplitter prototype = new BinarySplitter();
            // prototype.data = this.data;
            // ...
            // 深拷贝 不是共用的指针，在值上是一样的
            // 通过序列化和反序列化实现深拷贝
            return prototype;
        }
    }
    class TxtSplitter extends ISplitter {

        @Override
        public void split() {

        }
        @Override
        public ISplitter clone() {
            TxtSplitter prototype = new TxtSplitter();
            // prototype.data = this.data;
            // ...
            return prototype;
        }
    }
    class PictureSplitter extends ISplitter {

        @Override
        public void split() {

        }
        @Override
        public ISplitter clone() {
            PictureSplitter prototype = new PictureSplitter();
            // prototype.data = this.data;
            // ...
            return prototype;
        }
    }
    class VideoSplitter extends ISplitter {

        @Override
        public void split() {

        }
        @Override
        public ISplitter clone() {
            VideoSplitter prototype = new VideoSplitter();
            // prototype.data = this.data;
            // ...
            return prototype;
        }
    }

    class MainActivity {
        ISplitter prototype;
        public MainActivity(ISplitter prototype) {
            this.prototype = prototype;
        }
        public void buttonClick() {
            ISplitter splitter = prototype.clone();
            splitter.split();

            // 直接使用原型对象，就破坏了设计初衷了
            prototype.split();
        }
    }
}
