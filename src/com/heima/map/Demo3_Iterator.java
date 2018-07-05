package com.heima.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Demo3_Iterator {
    public static void main(String[] args) {
        Map<String,Integer> mp = new HashMap<String,Integer>();
        mp.put("zhangsan",23);
        mp.put("lisi",24);
        mp.put("wangwu",25);
        mp.put("zhaoliu",26);

//        Set<Map.Entry<String,Integer>> entrySet = mp.entrySet();
//        Iterator<Map.Entry<String,Integer>> it = entrySet.iterator();
//        while (it.hasNext()){
//            Map.Entry<String,Integer> en = it.next();
//            String key = en.getKey();
//            Integer value = en.getValue();
//            System.out.println(key +"="+ value);
//        }
        for (Map.Entry<String,Integer> en : mp.entrySet()){
            System.out.println(en.getKey() +"="+ en.getValue());
        }
    }
}
