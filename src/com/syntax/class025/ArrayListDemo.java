package com.syntax.class025;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main (String[] args){

        ArrayList<String> trost = new ArrayList<String>(); // tak robimy ArrayList OBDZEKT.

        // teraz sie pobawimy.

        trost.add("Eren");
        trost.add("Mikasa");
        trost.add("Armin");
        trost.add("Jean");
        trost.add("Zeke");
        trost.add("Grisha");
        trost.add("Reiner");
        trost.add("Bertold");
        trost.add("Annie");

        System.out.println(trost.size()); // rozmiar

        System.out.println(trost); // tak nam printuje cala liste w [ ].

        System.out.println(trost.get(0)); // tak wyswietla nam dany element. zaczynamy jak w Arrays - od zera.

        System.out.println(trost.get(5)); // wyswietla nam tutaj element 5
        trost.set(5, "Falco");  // podmieniamy 5, falco za grisze
        System.out.println(trost.get(5)); // i cyk, juz jest falco.

        System.out.println(trost.get(1)); // dwojeczka czyli Mikasa
        System.out.println(trost.get(2)); // trojeczka czyli Armin
        System.out.println(trost.get(3)); // czworeczka czyli Jean

        trost.add(2, "Galliard"); // wrzucamy na miejsce czwarte Galliarda

        System.out.println(trost.get(1));
        System.out.println(trost.get(2));
        System.out.println(trost.get(3));

        // jak widac jak sie wyprintowalo - dodalem galliarda na miejsce 2, czyli on dostal z automatu
        // miejsce 2, miejsce 2 poprzednie poszlo W GORE.

        for (int i = 0; i < trost.size(); i++){
            System.out.print(trost.get(i) + " ");
        } // tak printujemy wszystkie jak standardowy array.

        System.out.println();

        for (String i : trost) {
            System.out.print(i);
        } // albo tak, w princie bez spacji.








    }
}
