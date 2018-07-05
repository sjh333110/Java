package com.heima.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Demo1_Map {
    public static void main(String[] args) {
        //demo1();
        //demo2();
        Map<String,Integer> mp = new HashMap<String,Integer>();
        mp.put("zhangsan",23);
        mp.put("lisi",24);
        mp.put("wangwu",25);
        mp.put("zhaoliu",26);

        Collection<Integer> c = mp.values();
        System.out.println(c);
        System.out.println(mp.size());
    }

    private static void demo2() {
        Map<String,Integer> mp = new HashMap<String,Integer>();
        mp.put("zhangsan",23);
        mp.put("lisi",24);
        mp.put("wangwu",25);
        mp.put("zhaoliu",26);

        //Integer value = mp.remove("zhangsan");
        System.out.println(mp.containsKey("zhangsan"));
        System.out.println(mp.containsValue(100));
        //System.out.println(value);
        //System.out.println(mp);
    }

    private static void demo1() {
        Map<String,Integer> mp = new HashMap<String,Integer>();
        mp.put("zhagnsan",23);
        mp.put("lisi",24);
        mp.put("wangwu",25);
        mp.put("zhaoliu",26);
        mp.put("zhangsan",33); //覆盖key值相同的元素的value
        System.out.println(mp);
    }
}
