package com.syntax.class027;

import java.util.HashMap;

public class Task1 {
    public static void main (String[] args){

        HashMap<Integer, String> building = new HashMap<>();

        building.put(1, "Google");
        building.put(2, "Nokia");
        building.put(3, "Samsung");
        building.put(4, "Apple");
        building.put(1, "LG");
        building.put(6, "Samsung");
        building.put(7, "Motorola");

        System.out.println(building);
        System.out.println(building.size());

        building.replace(4, "SonyEricson");
        building.remove(7);

        System.out.println(building);
        System.out.println(building.size());










    }
}
