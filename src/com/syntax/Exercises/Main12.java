package com.syntax.Exercises;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;


class Main12 {
    public static void main(String[] args) {

        String s = "00-44 48 555555";

        System.out.println(formatString(s));


    }
    public static String formatString(String s){

        s = s.replaceAll("[^0-9_]", "");

        StringBuilder str = new StringBuilder(s);
        for(int i = 3; i<s.length(); i+=4){
            str.insert(i,"-");
        }

        String S = str.toString();


        return S;
    }
}