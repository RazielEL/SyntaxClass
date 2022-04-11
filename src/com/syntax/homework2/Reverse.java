package com.syntax.homework2;
public class Reverse {


    public static void main(String[] args) {

        String a = "Syntax";
        char b[] = new char[a.length()];

        for(int i = 0; i < a.length(); i++){
            b[i] = a.charAt(i);
        }
        for(int i = a.length()-1; i >= 0; i--){

            System.out.print(b[i]);
        }
    }
}
