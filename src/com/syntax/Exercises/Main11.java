package com.syntax.Exercises;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Main11 {
    public static void main(String[] args) {
        String str = "I am a great Java Programer";
        System.out.println(reverse(str));
    }
    public static String reverse(String strToRev){

        String[] s = strToRev.split(" ");
        ArrayList<String> list = new ArrayList<String>(Arrays.asList(s));

        Collections.reverse(list);

        String formattedString = list.toString()
                .replace(",", "")
                .replace("[", "")
                .replace("]", "")
                .trim();

        return formattedString;
    }
}