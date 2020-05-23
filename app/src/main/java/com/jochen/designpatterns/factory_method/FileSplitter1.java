package com.jochen.designpatterns.factory_method;

import android.widget.EditText;
import android.widget.ProgressBar;

/**
 * Created by JoChen on 2020/5/21.
 */
public class FileSplitter1 {
    abstract class ISplitter {
        public abstract void split();
    }

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

    public class SecondActivity {
        private EditText txtFilePath;
        private EditText txtFileNumber;
        private ProgressBar progressBar;

        public void buttonClick() {
            FileSplitter1.ISplitter splitter = new FileSplitter1.BinarySplitter(); // 依赖具体类
            splitter.split();
        }
    }
}
