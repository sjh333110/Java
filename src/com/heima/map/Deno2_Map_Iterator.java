package com.heima.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Deno2_Map_Iterator {
    public static void main(String[] args) {
        Map<String,Integer> mp = new HashMap<>();
        mp.put("zhangsan",23);
        mp.put("lisi",24);
        mp.put("wangwu",25);
        mp.put("zhaoliu",26);

//        Integer i = mp.get("zhangsan");
//        Set<String> keySet = mp.keySet();
//        System.out.println(i);
//        System.out.println(keySet);
//        Iterator<String> it = keySet.iterator();
//        while (it.hasNext()){
//            String key = it.next();
//            System.out.println(mp.get(key));
//        }
        for(String key : mp.keySet()){
            System.out.println(mp.get(key));
        }

    }
}
