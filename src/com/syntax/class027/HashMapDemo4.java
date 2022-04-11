package com.syntax.class027;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapDemo4 {
    public static void main(String[] args) {


        HashMap<String, Double> fruitMap = new HashMap<>();

        fruitMap.put("Apple", 20.0);
        fruitMap.put("Banana", 10.2);
        fruitMap.put("Kiwi", 22.0);
        fruitMap.put("Orange", 210.0);
        fruitMap.put("Mango", 12.2);
        fruitMap.put("Tangerine", 3.0);

        Iterator<String> iterator = fruitMap.keySet().iterator(); //we are creating iterator

        while (iterator.hasNext()){ // checks if there are elements in iterator
            String key = iterator.next(); // gets keys from iterator
            Double value = fruitMap.get(key); // getting the corresponding valuse from the map by passing the keys
            if(key.contains("e") && value >=20){
                iterator.remove(); // if both conditions are ok we remove the element from the map
            }
        }


        System.out.println(fruitMap);








    }
}