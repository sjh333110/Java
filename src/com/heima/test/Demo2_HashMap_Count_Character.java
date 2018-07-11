package com.heima.test;

import java.util.HashMap;

public class Demo2_HashMap_Count_Character {
    public static void main(String[] args) {
        String str = "aabaabdddcbddcbe";
        char[] arr = str.toCharArray();
        HashMap<Character,Integer> hm = new HashMap<>();
        for (char c : arr){
//            if(!hm.containsKey(c)){
//                hm.put(c,1);
//            }else{
//                hm.put(c,hm.get(c) + 1);
//            }
            hm.put(c,hm.containsKey(c) ? hm.get(c) +1 : 1);
        }

        System.out.println(hm);
        for (char key : hm.keySet()){
            System.out.println(key +"="+ hm.get(key));
        }
    }
}
