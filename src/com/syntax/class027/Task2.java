package com.syntax.class027;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Task2 {
    public static void main (String[] args){

        HashMap<String, String> countries = new HashMap<>();

        countries.put("Poland", "Warsaw");
        countries.put("Germany", "Berlin");
        countries.put("France", "Paris");
        countries.put("Australia", "Melbourne");
        countries.put("USA", "Washington");
        countries.put("Israel", "Tel Aviv");
        countries.put("Italy", "Rome");

        System.out.println(countries);
        System.out.println();

// ALPHABETIC ORDER

        Map<String,String> alphCountries = new TreeMap<>(countries);

        System.out.println(alphCountries);
        System.out.println();

// FOR EACH KEY VALUE

        for (Map.Entry<String,String> entry : alphCountries.entrySet()){
            System.out.println("Key : " + entry.getKey());
            System.out.println("Value : " + entry.getValue());
        }

        System.out.println();

// ITERATOR KEY VALUE

        Iterator<Map.Entry<String, String>> iterator = alphCountries.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            System.out.println(entry);
        }

        System.out.println();

 // FOR EACH VALUE

        for (Map.Entry<String,String> entry : alphCountries.entrySet()){
            System.out.println("Value : " + entry.getValue());
        }

        System.out.println();

// ITERATOR VALUE ONLY
        Iterator<Map.Entry<String, String>> iterator2 = alphCountries.entrySet().iterator();

        while (iterator2.hasNext()) {
            System.out.println(iterator2.next().getValue());
        }

        System.out.println();




    }
}


