package com.syntax.class026;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo2 {
    public static void main (String[] args){

        ArrayList arrayList = new ArrayList(); // nie dalismy tego w < > bo mamy mieszana. to w tym < > znaczy ze cala arraylist jest taka
        arrayList.add("10");
        arrayList.add("Name");
        arrayList.add(12.5);
        arrayList.add(true);


        for (int i = 0; i < arrayList.size(); i++){
            System.out.println(((String)arrayList.get(i)).length()); // zmieniamy cala array list na string
        }



    }
}
