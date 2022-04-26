package com.syntax.Exercises;

import com.syntax.homework3.Arrays;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.io.*;
import java.util.*;


class Main7 {


    public static void main(String[] args) {
        String str = "Janusz Majekeeeeeee Jan ze zeeeffff ffff";

        System.out.println(findMaxLenEven(str));

    }

    public static String findMaxLenEven(String str) {

        String longest = "-1";
        String[] s = str.split(" ");

        for (int i = 0; i < s.length - 1; i++) {

            if (s[i].length() % 2 == 0) {
                if (s[i].length() >= s[s.length-1].length()){
                    longest = s[i];
                } else {
                    if (s[s.length-1].length() %2 ==0)
                    longest = s[s.length - 1];
                }

            }


        }
        return longest;
    }

}