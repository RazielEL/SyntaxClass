package com.syntax.homework;
import java.util.Scanner;
public class Welcome {
    void hello(int a){
        String hi;
        switch (a) {
            case 0 : hi = "Hi!";
                break;
            case 1 : hi = "Czesc!";
                break;
            case 2 : hi = "Привет!";
                break;
            case 3 : hi = "Hej!";
                break;
            case 4 : hi = "Salut!";
                break;
            case 5 : hi = "Hola!";
                break;
            case 6 : hi = "Szia!";
                break;
            case 7 : hi = "Ni hao!";
                break;
            case 8 : hi = "Ya!";
                break;
            case 9 : hi = "oi!";
                break;
            case 10 : hi = "moi!";
                break;
            default: hi = "Nie rozumiem co Ty do mnie rozmawiasz!";
        }
        System.out.println(hi);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] languages = {"English", "Polish", "Russia", "Swedish", "French", "Spanish", "Hungarian", "China", "Japan", "Portuguese", "Suomi"};
        System.out.println("Choose your language: ");
        for (int i = 0; i < languages.length; i++){

            System.out.println("For " + languages[i] + " choose " + i );
        }
        int a = sc.nextInt();

        Welcome witajcie = new Welcome();

        witajcie.hello(a);
    }

}