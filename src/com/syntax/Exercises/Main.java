package com.syntax.Exercises;

import java.util.Arrays;

class Main {
    public static void main(String[] args) {


        String s = "(())";
        System.out.println(isBalanced(s));


    }


    public static boolean isBalanced(String s) {

        boolean flag = false;

        for (int i = 0; i < s.length(); i++) {
            flag = s.charAt(i) == s.charAt(s.length() - 1 - i);
        }

        return flag;
    }
}