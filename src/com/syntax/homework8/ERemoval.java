package com.syntax.homework8;

import java.util.ArrayList;
import java.util.Iterator;

public class ERemoval {
    public static void main (String[] args){


        ArrayList<String> shiganshina = new ArrayList<String>();

        shiganshina.add("Conne");
        shiganshina.add("Eren");
        shiganshina.add("Ymir");
        shiganshina.add("Historia");
        shiganshina.add("Jean");
        shiganshina.add("Mikasa");


        Iterator<String> iterator = shiganshina.iterator();

        while (iterator.hasNext()) {
            if (iterator.next().endsWith("e")){
                iterator.remove();
            }
        }

        System.out.println(shiganshina);

    }
}
