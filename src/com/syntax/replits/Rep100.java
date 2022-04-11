package com.syntax.replits;
import java.util.Scanner;

public class Rep100 {




    public static void main(String[] args) {

            Scanner inp = new Scanner(System.in);
            System.out.print("In:");
            String s = inp.nextLine();

           String[] s1 = s.split("");

        for (int i = s1.length-1; i >=0 ; i--) {
            System.out.print(s1[i]);


                 }

    }
}
