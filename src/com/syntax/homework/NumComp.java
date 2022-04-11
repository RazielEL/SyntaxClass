package com.syntax.homework;
import java.util.Scanner;
public class NumComp {
    void numbers(int a, int b){

        if (a > b) {
            System.out.println(a + " is larger");
        }
        else if (a < b) {
            System.out.println(b + " is larger");
        }
        else {
            System.out.println(a + " is equal to " + b);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input first number: ");
        int a = sc.nextInt();
        System.out.println("Input second number: ");
        int b = sc.nextInt();
        NumComp comparison = new NumComp();
        comparison.numbers(a, b);
    }
}
