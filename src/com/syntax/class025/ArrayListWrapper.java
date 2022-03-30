package com.syntax.class025;

import java.util.ArrayList;
import java.util.Collections; // trzeba zaimportowac zeby uzywac np sort

public class ArrayListWrapper {
    public static void main (String[] args){

        ArrayList<Integer> myNumbers = new ArrayList<Integer>(); //jak widac, dalismy w < > INT bo jest to OBJECT
        myNumbers.add(10);
        myNumbers.add(15);
        myNumbers.add(35);
        myNumbers.add(2340);
        myNumbers.add(0);
        myNumbers.add(-4);
        myNumbers.add(23);
        myNumbers.add(2);  // dodalem sobie do listy tam tyle elementow

        for (int i : myNumbers) {
            System.out.println(i);  // tu je printuje w pionie
        }

        System.out.println(myNumbers); // tu w lini jak je dodalem, po indeksach



        Collections.sort(myNumbers); // tu sortuje

        System.out.println(myNumbers); // indeksy sie zmienily, ale sa rosnaco

        Collections.reverse(myNumbers);

        System.out.println(myNumbers); // tu po prostu jedzie od tylu












    }
}
