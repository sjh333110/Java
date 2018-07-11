package com.heima.collections;

import java.util.ArrayList;
import java.util.Collections;

public class Demo1_Collections {
    public static void main(String[] args) {
        //demo1();
        //demo2();
        //demo3();
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("d");
        list.add("f");
        list.add("f");
        Collections.shuffle(list);
        //Collections.reverse(list);
        System.out.println(list);
    }

    private static void demo3() {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("d");
        list.add("f");
        list.add("f");
        System.out.println(Collections.max(list));
    }

    private static void demo2() {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("d");
        list.add("f");
        list.add("f");
        System.out.println(Collections.binarySearch(list,"f"));
    }

    private static void demo1() {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("a");
        list.add("c");
        list.add("d");

        Collections.sort(list);
        System.out.println(list);
    }
}
