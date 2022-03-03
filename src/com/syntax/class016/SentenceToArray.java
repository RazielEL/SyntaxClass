package com.syntax.class016;

import java.util.Arrays;

public class SentenceToArray {

    public static void main(String[] args) {

        String s = "This is a sentence";

        String[] strArr = s.split("");
        String[] strArr1 = s.split(" ");

        System.out.println(Arrays.toString(strArr));
        System.out.println(Arrays.toString(strArr1));
        System.out.println(strArr1[3]);

        String s2 = ("This is a sentence. Batch 12 is great." + "Edward is not great. He is super right.");

        String[] strArr2 = s2.split("[.]");
        System.out.println(strArr2.length);
        System.out.println(strArr2[3].trim());



    }
}
