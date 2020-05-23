package com.jochen.designpatterns.iterator;

import java.util.Iterator;
import java.util.Vector;

/**
 * Created by JoChen on 2020/5/23.
 */
public class ClientApp {
    public static void main(String[] args) {
        Vector<String> mc = new Vector<>();
        mc.add("Beijing");
        mc.add("Shanghai");
        mc.add("New York");
        mc.add("Paris");
        mc.add("London");
        Iterator<String> iter = mc.iterator();
        while(iter.hasNext()) {
            String item = iter.next();
            System.out.println(item);
        }
        for (String data : mc) {
            System.out.println(data);
        }
    }
}
