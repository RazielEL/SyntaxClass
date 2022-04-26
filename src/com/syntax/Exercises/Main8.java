package com.syntax.Exercises;

import org.apache.poi.ss.formula.functions.T;

import java.lang.reflect.Array;
import java.util.*;


class Main8 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,2,2,1,4,5,2,2));
       Collections.sort(list);
       Collections.reverse(list);
       Set<Integer> set = new LinkedHashSet<>();
        set.addAll(list);
        list.clear();
        list.addAll(set);
        System.out.println(list);



        System.out.println(findMaxSum(list));
    }

    public static int findMaxSum(List<Integer> list) {
        int sum = 0;
        sum = list.get(0) + list.get(1);



        return sum;
    }
}