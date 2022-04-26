package com.syntax.Exercises;

public class Main5 {
    public static void main(String[] args) {
        // ignorowane exception - co mnie nie obchodza
        // np pracuje w excelu i ktos zamiast 2 wpisze 2d

        String number = "2d";
        parseNumber(number);
    }


    private static void parseNumber(String number) {
        try {
            Integer integer = Integer.valueOf(number);
        } catch (Exception ex) {
            ex.printStackTrace();

        }

    }

}