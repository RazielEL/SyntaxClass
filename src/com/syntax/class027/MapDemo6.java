package com.syntax.class027;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapDemo6 {
    public static void main(String[] args) {


        HashMap<String, Double> fruitMap = new HashMap<>();



        fruitMap.put("Apple", 20.0);
        fruitMap.put("Banana", 10.2);
        fruitMap.put("Kiwi", 22.0);
        fruitMap.put("Orange", 210.0);
        fruitMap.put("Banana", 12.2);



        System.out.println(fruitMap.keySet()); // printuje wszystkie kijs
        System.out.println(fruitMap.values());  // printuje wszystkie weljus
        System.out.println(fruitMap.entrySet()); // printuje wszystko

        Iterator<Map.Entry<String, Double>> iterator = fruitMap.entrySet().iterator(); // do entry set zawsze 2 wartosci do tego. jak widac. W tych
                                                                                          //  rzeczach tak jest

        while (iterator.hasNext()){
            System.out.println(iterator.next()); // tu printuje tak wszystko tez
            System.out.println(iterator.next().getKey()); // tylko key
            System.out.println(iterator.next().getValue()); // tylko values
        }














    }
}