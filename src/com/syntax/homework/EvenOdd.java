package com.syntax.homework;
import java.util.Scanner;

public class EvenOdd {
    void moduloCheck(int a){
        if (a%2==0){
            System.out.println("Number is even");
        }
        if (a%2!=0){
            System.out.println("Number is odd");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number: ");
        int a = sc.nextInt();
        EvenOdd number1 = new EvenOdd();
        number1.moduloCheck(a);

    }
}
