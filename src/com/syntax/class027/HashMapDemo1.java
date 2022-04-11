package com.syntax.class027;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapDemo1 {

        public static void main (String[] args){


            HashMap<String, Double> fruitMap = new HashMap<>();

            fruitMap.put("Apple", 20.0);
            fruitMap.put("Banana", 10.2);
            fruitMap.put("Kiwi", 22.0);
            fruitMap.put("Orange", 210.0);
            fruitMap.put("Banana", 12.2); // to nie usuwa, tlko jak mamy dubla key to nadpisuje dlatego druga, albo ostatnia wartosc bedzie pokazana
            System.out.println(fruitMap);

            System.out.println(fruitMap.get("Kiwi")); // tu tylko wartosc wg tego klucza

            fruitMap.remove("Apple"); //usuwamy wartosc od key jablko
            System.out.println(fruitMap); // printuje bez tego

            System.out.println(fruitMap.containsKey("Kiwi")); //bulinuje czy jest tam takie cos
            System.out.println(fruitMap.containsKey("Mango")); // tu false bo nie ma mango

            System.out.println(fruitMap.containsValue(22.0)); // szukamy po wartosci

            fruitMap.replace("Banana", 50.0);
            System.out.println(fruitMap);

            Set<String> keys = fruitMap.keySet(); //konwertujemy hashmap KEYS na set.
            System.out.println(keys);

            Iterator<String> iterator = keys.iterator();
            while (iterator.hasNext()){
                if(iterator.next().contains("e")){
                    iterator.remove();
                }
            }
            System.out.println(keys);
        }
    }


