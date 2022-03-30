package com.syntax.class026;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListRetrieval {
    public static void main (String[] args) {

        ArrayList<String> trost = new ArrayList<String>();

        trost.add("Eren");
        trost.add("Mikasa");
        trost.add("Armin");

        System.out.println(trost);

        System.out.println();
        System.out.println();
        System.out.println();


        for (String i : trost){
            System.out.print(i + "             ");
        }

        System.out.println();
        System.out.println();
        System.out.println();


        for (int i = 0; i < trost.size(); i++){
            System.out.print(trost.get(i) + " ");
        }

        System.out.println();
        System.out.println();
        System.out.println();



        Iterator<String> iterator = trost.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());

        }






    }
}
