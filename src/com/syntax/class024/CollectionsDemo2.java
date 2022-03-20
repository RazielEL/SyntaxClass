package com.syntax.class024;

import java.util.ArrayList;

public class CollectionsDemo2 {

    public static void main (String[] args) {

        ArrayList<String> countries = new ArrayList<>();

        countries.add("USA");
        countries.add("Wlochy");
        countries.add("Polska");
        countries.add("Francja");
        countries.add("UK");
        countries.add("Maroko");
        countries.add("Chiny");
        countries.add("Australia");
        countries.add("Peru");
        countries.add("Kanada");

        System.out.println(countries.get(3)); // printuje miejsce 3, czyli czwarta pozycje.
        System.out.println(countries.get(0)); // printuje miejsce 0 czyli pierwsza pozycje.
        System.out.println(countries.get(4)); // printuje miejsce 4

        System.out.println(countries); // printuje wszystko
        System.out.println(countries.size()); // printuje sajz
        countries.add(4,"Turcja"); // wyzej 4 to jest UK. dodajemy turcje w to miejsce, UK wskakuje na miejsce 5 jak widac ponizej.
        System.out.println(countries.get(5)); // printuje miejsce 4
        System.out.println(countries.get(4)); // printuje miejsce 4
        System.out.println(countries.size()); // dodalismy turcje, to wszystko ponad 4 poszlo +1 i mamy

        countries.remove(4);


    }

}
