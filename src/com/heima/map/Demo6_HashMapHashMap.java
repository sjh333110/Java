package com.heima.map;

import com.heima.bean.Person;

import java.util.HashMap;

public class Demo6_HashMapHashMap {
    public static void main(String[] args) {
        HashMap<Person,String> hm88 = new HashMap<>();
        hm88.put(new Person("张三",23),"北京");
        hm88.put(new Person("李四",24),"上海");
        hm88.put(new Person("王五",25),"广州");
        hm88.put(new Person("赵六",26),"深圳");

        HashMap<Person,String> hm99 = new HashMap<>();
        hm99.put(new Person("哈哈",23),"北京");
        hm99.put(new Person("呼呼",24),"上海");
        hm99.put(new Person("嘻嘻",25),"广州");
        hm99.put(new Person("呵呵",26),"深圳");

        HashMap<HashMap<Person,String>,String> hm = new HashMap<>();
        hm.put(hm88,"第88期");
        hm.put(hm99,"第99期");

        for (HashMap<Person,String> hmk : hm.keySet()) {
            System.out.println(hm.get(hmk));
            for (Person key : hmk.keySet()) {
                System.out.println("姓名:" + key.getName() + " ,年龄:" +
                        key.getAge() + " ,住址:" + hmk.get(key));
            }
        }
    }

}
