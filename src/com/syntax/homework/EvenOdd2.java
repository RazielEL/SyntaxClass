package com.syntax.homework;
import java.util.Scanner;
public class EvenOdd2 {
    int b = 0;

    String EvenOdd2(int a) {
        if (a % 2 == 0)
        {
            return "Number is even";

        } else {

            return "Number is not even";
        }

    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Input number: ");
    int a = sc.nextInt();
    EvenOdd2 mark1 = new EvenOdd2();
    System.out.println(mark1.EvenOdd2(5));


    }
}
