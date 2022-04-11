package com.syntax.class027;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

public class HashMapDemo3 {
    public static void main(String[] args) {


        HashMap<String, Double> fruitMap = new HashMap<>();

        fruitMap.put("Apple", 20.0);
        fruitMap.put("Banana", 10.2);
        fruitMap.put("Kiwi", 22.0);
        fruitMap.put("Orange", 210.0);
        fruitMap.put("Mango", 12.2); // to nie usuwa, tlko jak mamy dubla key to nadpisuje dlatego druga, albo ostatnia wartosc bedzie pokazana

        Collection<Double> values = fruitMap.values();

        Iterator<Double> iterator = values.iterator();

        while (iterator.hasNext()){
            if(iterator.next()>=20){
                iterator.remove();
            }
        }

        System.out.println(fruitMap);












    }
}