package com.jochen.designpatterns.prototype;

/**
 * Created by JoChen on 2020/5/22.
 */
public class SpitterPrototype {
    abstract class ISplitter {
        public abstract void split();
        public abstract ISplitter clone();
    }

}
