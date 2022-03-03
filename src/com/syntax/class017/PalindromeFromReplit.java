package com.syntax.class017;

public class PalindromeFromReplit {
    // How would you check if String is palindrome or not?
    //Example1: aba ---> true
    // Example2: Abbc --> false

    String reverseString(String inputStr){
        //converting S string to StringBuilder so that we can use the reverse method
        StringBuilder stringBuilder = new StringBuilder(inputStr);
        stringBuilder.reverse();
        return stringBuilder.toString();
    }

    boolean isPalindrome(String inputStr){
        String reversedStr = reverseString(inputStr);
        return reversedStr.equals(inputStr);
    }

    public static void main(String[] args) {

        PalindromeFromReplit task = new PalindromeFromReplit();

        System.out.println(task.isPalindrome("aba"));
        System.out.println(task.isPalindrome("abca"));












    }



}
