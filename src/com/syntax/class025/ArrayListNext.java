package com.syntax.class025;

import java.util.ArrayList;

public class ArrayListNext {
    public static void main (String[] args){

        ArrayList<Boolean> flags=new ArrayList<>();
        flags.add(true);
        flags.add(true);
        flags.add(true);
        flags.add(true);

        System.out.println(flags.contains(false)); // to sprawdza, czy KTORAKOLWIEK flaga ma FLASE. jak chociaz
                                                    // JEDNA ma to wtedy drukuje TRUE. Teraz wszystkie true, to wydrukowalo FALSE.


        ArrayList<String> fruits=new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Banana");

        ArrayList<String> vegetables=new ArrayList<>();
        vegetables.add("Potato");
        vegetables.add("Onion");
        vegetables.add("Carrot");

        ArrayList<String> groceries=new ArrayList<>();
        groceries.addAll(fruits);
        groceries.addAll(vegetables);
        System.out.println(groceries); // Funkcja dodawania dwoch arraylistow. sumowatyarray.addAll(nazwa arrayu) dodaje pierwszy, potem
                                        // to samo z nazwa drugiego araju do dodania i mamy to o.

        ArrayList<String> grocerie=new ArrayList<>();
        grocerie.add("Apple");
        grocerie.add("Orange");
        grocerie.add("Banana");
        grocerie.add("Potato");
        grocerie.add("Onion");
        grocerie.add("Carrot");
        System.out.println(grocerie);

        ArrayList<String> itemsToBeRemoved=new ArrayList<>();
        itemsToBeRemoved.add("Apple");
        itemsToBeRemoved.add("Onion");
        itemsToBeRemoved.add("Pillow");

        groceries.removeAll(itemsToBeRemoved);
        System.out.println(groceries); // tutaj jak sie usuwa
    }
}
