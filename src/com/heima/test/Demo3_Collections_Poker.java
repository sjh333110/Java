package com.heima.test;

import java.util.ArrayList;
import java.util.Collections;

public class Demo3_Collections_Poker {
    public static void main(String[] args) {
        String[] num = {"A","1","2","3","4","5","6","7","8","9","J","Q","K",};
        String[] color = {"红桃","方片","黑桃","梅花"};
        ArrayList<String> buffer = new ArrayList<>();

        ArrayList<String> person1 = new ArrayList<>();
        ArrayList<String> person2 = new ArrayList<>();
        ArrayList<String> person3 = new ArrayList<>();
        ArrayList<String> other = new ArrayList<>();

        for (String c : color) {
            for (String n : num) {
                buffer.add(c.concat(n));
            }
        }
        buffer.add("大王");
        buffer.add("小王");
        Collections.shuffle(buffer);
        for (int i=0; i<buffer.size(); i++) {
            if(i >= buffer.size()-3){
                other.add(buffer.get(i));
            }else if (i%3 == 0){
                person1.add(buffer.get(i));
            }else if (i%3 == 2){
                person2.add(buffer.get(i));
            }else {
                person3.add(buffer.get(i));
            }
        }

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
        System.out.println(other);
    }
}
