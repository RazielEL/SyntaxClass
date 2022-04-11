package com.syntax.homework;
import java.util.Scanner;
public class prime {
    void PrimeNumber(int a){
        if(a == 0 || a == 1){
            System.out.println(a + " is not a prime number");
        }
        else {
            boolean mark = false;
            for (int i = 2; i < a; i++) {
                if (a % i == 0) {
                    mark = true;
                    break;
                }
            }
            if (!mark) {
                System.out.println(a + " = Prime");
            } else {
                System.out.println(a + " = Not Prime");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int b = sc.nextInt();

        prime mark1 = new prime();
        mark1.PrimeNumber(5101);
    }
}
