package com.syntax.homework;
import java.util.Scanner;

public class email2 {

    String personal(String firstName, String lastName, String domain){
           return lastName+"."+firstName+"@"+domain+".com";

    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("First Name: ");
    String firstName = sc.nextLine();
    System.out.println("Last Name: ");
    String lastName = sc.nextLine();
    System.out.println("Domain: ");
    String domain = sc.nextLine();

    email2 mail = new email2();

    System.out.println(mail.personal(firstName, lastName, domain));


    }
}
