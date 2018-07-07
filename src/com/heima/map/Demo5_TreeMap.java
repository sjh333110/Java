package com.heima.map;

import com.heima.bean.Person;

import java.util.Comparator;
import java.util.TreeMap;

public class Demo5_TreeMap {
    public static void main(String[] args) {
        //demo1();
        TreeMap<Person,String> tm = new TreeMap<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                int num = o1.getAge() - o2.getAge();
                return num == 0 ? o1.getName().compareTo(o2.getName()) : num;
            }
        });
        tm.put(new Person("张三",23),"北京");
        tm.put(new Person("李四",13),"上海");
        tm.put(new Person("王五",43),"广州");
        tm.put(new Person("赵六",33),"深圳");
        System.out.println(tm);
    }

    private static void demo1() {
        TreeMap<Person,String> tm = new TreeMap<>();
        tm.put(new Person("张三",23),"北京");
        tm.put(new Person("李四",13),"上海");
        tm.put(new Person("王五",43),"广州");
        tm.put(new Person("赵六",33),"深圳");

        System.out.println(tm);
    }
}
