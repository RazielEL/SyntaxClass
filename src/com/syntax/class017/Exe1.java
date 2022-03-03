package com.syntax.class017;

import java.util.Arrays;

public class Exe1 {

    public static void main(String[] args) {


        String s = "Sunday is great";
        String[] strArray = s.split(" ");
        for (int i = 0; i < strArray.length; i++){
            System.out.println(strArray[i]);
        }

        System.out.println();

        String a = "Sunday is Good";
        Exe1 exe1 = new Exe1(); //  tworzymy obiekt
        String[] ar = a.split(" "); // rozdzielamy zdanie na slowa
        System.out.println(Arrays.toString(ar)); // to tu tylko pokazuje w [ ] ze jest zdanie rozdzielone]

        for (int i = 0; i < ar.length; i++){
            System.out.print(exe1.reverseString(ar[i]) + " "); // w tej petli puszczamy zeby indeksy byly te same, ale slowa inne
        }

        System.out.println();

        System.out.println(exe1.reverseString(a)); // wszystko zmienia, index 0 na ostatni, indeks ostatni na 0, litery w druga strone

    }

    String reverseString(String inputString){
        //converting S string to StringBuilder so that we can use the reverse method
        StringBuilder stringBuilder = new StringBuilder(inputString);
        stringBuilder.reverse();
        return stringBuilder.toString();
    }


}
