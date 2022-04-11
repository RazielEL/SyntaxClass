package com.syntax.homework8;

import java.util.ArrayList;
import java.util.Iterator;

public class Array1To500RemoveDivBy5 {
    public static void main (String[] args){

        ArrayList<Integer> numbers = new ArrayList<>();


        for (int i = 1; i < 501; i++){
            if (i%2==0)
            numbers.add(i);
        }

        System.out.println(numbers);
        System.out.println();


        Iterator<Integer> iterator = numbers.iterator();

        while (iterator.hasNext()){
            if(iterator.next()%5==0){
                iterator.remove();
            }
        }

        System.out.println(numbers);



    }
}
