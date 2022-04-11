package com.syntax.homework8;

import java.util.ArrayList;
import java.util.Collections;

public class AlphabeticalOrder {


    public static void main (String[] args){

        ArrayList<String> shiganshina = new ArrayList<>();

        shiganshina.add("Conne");
        shiganshina.add("Eren");
        shiganshina.add("Ymir");
        shiganshina.add("Historia");
        shiganshina.add("Jean");
        shiganshina.add("Mikasa");
        shiganshina.add("Reiner");
        shiganshina.add("Falco");
        shiganshina.add("Berthold");
        shiganshina.add("Levi");
        shiganshina.add("Erwin");
        shiganshina.add("Sasha");
        shiganshina.add("Theo");

        Collections.sort(shiganshina);

        for (String i : shiganshina){
            System.out.print(i + " ");
        }



    }
}
