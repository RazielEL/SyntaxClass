package com.syntax.homework8;

import java.util.ArrayList;

public class AandEDrinksReplaceWater {
    public static void main (String[] args){


        ArrayList<String> drinks = new ArrayList<>();

        drinks.add("Vodka");
        drinks.add("Whisky");
        drinks.add("Bourbon");
        drinks.add("Malibu");
        drinks.add("Wine");
        drinks.add("Tequila");

        for (int i = 0; i < drinks.size(); i++){
            if(drinks.get(i).contains("a") || drinks.get(i).contains("e")){
                drinks.set(i, "Water");
            }
        }

        System.out.println(drinks);









    }
}
