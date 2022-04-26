package com.syntax.Exercises;

import java.util.*;

class Main4 {

    static int countDuplicates(List<Integer> numbers){
        HashSet<Integer> dup = new HashSet<>();


    for (int i = 0; i<numbers.size(); i++){
        for (int j = 0; j < numbers.size(); j++){
            if (i == j){
                continue;
            }
            if (numbers.get(i).equals(numbers.get(j))){
                dup.add(numbers.get(i));
            }
        }
    }


        return dup.size();


}

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<Integer>(Arrays.asList(12,12,12,13,45,78,7,7));



        System.out.println(countDuplicates(numbers));
        System.out.println("Proba mikrofonu");


    }

}