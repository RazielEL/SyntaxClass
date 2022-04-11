package com.syntax.homework8;

import java.util.ArrayList;

public class RemoveNameStartsWithE {
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

        System.out.print(shiganshina);

        System.out.println();

        for (int i = 0; i < shiganshina.size(); i++){
            if (shiganshina.get(i).startsWith("E")){
                shiganshina.remove(i);
            }
        }

        System.out.print(shiganshina);



    }
}

