package com.heima.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by SJH on 2018/7/5.
 */
public class Demo1_Map_Iterator {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<String, Integer>();
        map.put("song",23);
        map.put("liang",26);
        map.put("wang",24);
        map.put("my",21);

        //遍历方式1  获取keySet
        Set<String> keySet = map.keySet();
        Iterator<String> it = keySet.iterator();
        while (it.hasNext()){
            String key = it.next();
            System.out.print(map.get(key) +",");
        }
        System.out.println("\n"+"-----------");

        //遍历方式2 增强For遍历
        for (String key : map.keySet()){
            System.out.print(map.get(key) +",");
        }
        System.out.println();

        //遍历方式3 entrySet
        Set<Map.Entry<String,Integer>> entrySet =  map.entrySet();
        Iterator<Map.Entry<String,Integer>> entryIterator = entrySet.iterator();
        while (entryIterator.hasNext()){
            Map.Entry<String,Integer> en = entryIterator.next();
            String key = en.getKey();
            Integer value = en.getValue();
            System.out.println(key +"="+ value);
        }
        System.out.println("--------------------");

        //遍历方式4 增强for循环 entrySet
        for (Map.Entry<String,Integer> entry : map.entrySet() ){
            System.out.println(entry.getKey() +"="+ entry.getValue());
        }
    }
}
