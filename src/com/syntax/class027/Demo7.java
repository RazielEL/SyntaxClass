package com.syntax.class027;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Demo7 {
    public static void main(String[] args) {


        HashMap<String, Double> fruitMap = new HashMap<>();


        fruitMap.put("Apple", 20.0);
        fruitMap.put("Banana", 10.2);
        fruitMap.put("Kiwi", 22.0);
        fruitMap.put("Orange", 210.0);
        fruitMap.put("Banana", 12.2);


        Iterator<Map.Entry<String, Double>> iterator = fruitMap.entrySet().iterator(); // do entry set zawsze 2 wartosci do tego. jak widac. W tych
        //  rzeczach tak jest

        while (iterator.hasNext()) {
            Map.Entry<String, Double> entry = iterator.next();
            if (entry.getKey().endsWith("e") || entry.getValue() >= 20){
                iterator.remove();
            }

        }
        System.out.println(fruitMap);
    }
}