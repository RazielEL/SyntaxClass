package com.syntax.class027;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo5 {
    public static void main(String[] args) {


        HashMap<String, Double> fruitMap = new HashMap<>();

        fruitMap.put("Apple", 20.0);
        fruitMap.put("Banana", 10.2);
        fruitMap.put("Kiwi", 22.0);
        fruitMap.put("Orange", 210.0);
        fruitMap.put("Mango", 12.2);
        fruitMap.put("Tangerine", 3.0);


       System.out.println(fruitMap.entrySet());

        for (Map.Entry<String, Double> entry: fruitMap.entrySet()) {
            System.out.println(entry);
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
















    }
}
