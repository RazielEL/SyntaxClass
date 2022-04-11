package com.syntax.homework;

import java.util.Scanner;

public class WelcomePawel {

    void printHello (String language) {
        if (language.equals("Polish")) {
            System.out.println("Czesc");

        }	else if (language.equals("English")) {
            System.out.println("Hello");

        }	else if (language.equals("Spanish")) {
            System.out.println("Hola");
        }
        else {
            System.out.println("I dont know your language");
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your language ");
        String language = sc.nextLine();

        WelcomePawel Test= new WelcomePawel();

        Test.printHello(language);
    }
}

