package com.syntax.homework7;

import java.util.ArrayList;

public class ArrayListHW {
    public static void main (String[] args){

        ArrayList<String> shiganshina = new ArrayList<String>();
        shiganshina.add("Eren");
        shiganshina.add("Mikasa");
        shiganshina.add("Armin");
        shiganshina.add("Reiner");
        shiganshina.add("Erwin");

        //check the size of the arraylist

        System.out.println("Size of the ArrayList is equal to " + shiganshina.size());

        // check if the array is empty

        if(shiganshina.isEmpty()) {
            System.out.println("ArrayList is empty");
        } else {
            System.out.println("ArrayList is not empty");
        }

        // check if the ArrayList contains a certain name

        if(shiganshina.contains("Levi")){
            System.out.println("There is Levi in the ArrayList");
        } else {
            System.out.println("There is no Levi in the ArrayList");
        }

        if(shiganshina.contains("Eren")){
            System.out.println("There is Erwin in the ArrayList");
        } else {
            System.out.println("There is no Erwin in the ArrayList");
        }

        // print out the ArrayList (3 ways)

        System.out.println(shiganshina);

        for (int i = 0; i < shiganshina.size(); i++){
            System.out.println("Index ["+i+"] = " + shiganshina.get(i));
        }

        for (String i : shiganshina){
            System.out.println(i);
        }





    }
}
