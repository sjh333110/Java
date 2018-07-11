package com.heima.test;

import java.util.*;

public class Demo4_Poker_Sort {
    public static void main(String[] args) {
        String[] num = {"3","4","5","6","7","8","9","J","Q","K","A","1","2"};
        String[] color = {"红桃","方片","黑桃","梅花"};

        HashMap<Integer,String> pokerHm = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        TreeSet<Integer> person1 = new TreeSet<>();
        TreeSet<Integer> person2 = new TreeSet<>();
        TreeSet<Integer> person3 = new TreeSet<>();
        TreeSet<Integer> other = new TreeSet<>();

        int index = 0;
        for (String n : num){
            for (String c : color){
                pokerHm.put(index,c.concat(n));
                list.add(index);
                index++;
            }
        }
        pokerHm.put(index,"小王");
        list.add(index);
        index++;
        pokerHm.put(index,"大王");
        list.add(index);
        Collections.shuffle(list);

        for (int i=0; i<list.size(); i++){
            if(i >= list.size()-3) {
                other.add(list.get(i));
            }else if(i % 3 == 0){
                person1.add(list.get(i));
            }else if(i % 3 == 2){
                person2.add(list.get(i));
            }else {
                person3.add(list.get(i));
            }
        }

        lookPoker(pokerHm,person1,"你");
        lookPoker(pokerHm,person2,"我");
        lookPoker(pokerHm,person3,"他");
        lookPoker(pokerHm,other,"底牌");
    }

    public static void lookPoker (HashMap<Integer,String> hm, TreeSet<Integer> ts, String name){
        System.out.print(name +"的牌是：");
        for (Integer it : ts){
            System.out.print(hm.get(it) +" ");
        }
        System.out.println();
    }
}


