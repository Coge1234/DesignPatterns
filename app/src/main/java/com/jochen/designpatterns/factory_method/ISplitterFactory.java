package com.jochen.designpatterns.factory_method;

import android.widget.EditText;
import android.widget.ProgressBar;

/**
 * Created by JoChen on 2020/5/21.
 */
public class ISplitterFactory {
    // 抽象类
    abstract class ISplitter {
        public abstract void split();
    }

    // 工厂基类
    abstract class SplitterFactory {
        public abstract ISplitter createSplitter();
    }

    class FileSplitter2 {
        class BinarySplitter extends ISplitter {

            @Override
            public void split() {

            }
        }

        class TxtSplitter extends ISplitter {

            @Override
            public void split() {

            }
        }

        class PictureSplitter extends ISplitter {

            @Override
            public void split() {

            }
        }

        class VideoSplitter extends ISplitter {

            @Override
            public void split() {

            }
        }

        // 具体工厂
        class BinarySplitterFactory extends SplitterFactory {

            @Override
            public ISplitter createSplitter() {
                return new FileSplitter2.BinarySplitter();
            }
        }

        class TxtSplitterFactory extends SplitterFactory {

            @Override
            public ISplitter createSplitter() {
                return new FileSplitter2.TxtSplitter();
            }
        }


        class PictureSplitterFactory extends SplitterFactory {

            @Override
            public ISplitter createSplitter() {
                return new FileSplitter2.PictureSplitter();
            }
        }

        class VideoSplitterFactory extends SplitterFactory {

            @Override
            public ISplitter createSplitter() {
                return new FileSplitter2.VideoSplitter();
            }
        }
    }

    class ThirdActivity {
        SplitterFactory factory;

        public ThirdActivity(SplitterFactory factory) {
            this.factory = factory;
        }

        public void buttonOnClick() {
            ISplitter splitter = factory.createSplitter(); // 多态
            splitter.split();
        }
    }
}
