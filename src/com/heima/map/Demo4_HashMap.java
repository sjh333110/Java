package com.heima.map;

import com.heima.bean.Person;

import java.util.HashMap;
import java.util.HashSet;

public class Demo4_HashMap {
    public static void main(String[] args) {
        HashMap<Person,String> hm = new HashMap<>();
        hm.put(new Person("zhangsan",23),"北京");
        hm.put(new Person("lisi",24),"北京");
        hm.put(new Person("zhangsan",23),"上海");
        hm.put(new Person("王五",25),"深圳");

        System.out.println(hm);
    }
}
