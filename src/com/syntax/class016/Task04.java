package com.syntax.class016;

public class Task04 {

    public static void main(String[] args) {

        // palindrome checking

        String s = "kajak";
        StringBuilder b = new StringBuilder(s);
        b.reverse();
        String a = b.toString();
        System.out.println(a);

        if (s.equals(a)){
            System.out.println("It is a palindrome");
        }
        else {
            System.out.println("It is NOT a palindrome");
        }











    }
}
