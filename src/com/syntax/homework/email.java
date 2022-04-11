package com.syntax.homework;
import java.util.Scanner;
public class email {

    void CreateEmail(String firstName, String lastName, String client){
        client = client.toLowerCase();
        firstName = firstName.toLowerCase();
        lastName = lastName.toLowerCase();

        System.out.println("Your email address is: " + lastName + "." + firstName + "@" + client + ".com");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("First name: ");
        String firstName = sc.nextLine();
        System.out.println("Last name: ");
        String lastName = sc.nextLine();
        System.out.println("Gmail, Yahoo, Onet, ProtonMail? :");
        String client = sc.nextLine();
        email id1 = new email();

        id1.CreateEmail(firstName, lastName, client);
    }
}
