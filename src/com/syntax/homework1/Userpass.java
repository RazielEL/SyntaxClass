package com.syntax.homework1;
import org.jetbrains.annotations.NotNull;
import java.util.Scanner;
public class Userpass {

    String login (String username, String password) {

            if (username.isEmpty() ) {
                return "Username cannot be empty";
            }
            else if (username.isEmpty() && password.isEmpty()){
                return "Username and password cannot be empty";
        }
            else return " ";
    }

    String passphrase (String username, @NotNull String password, String confpass){

            if (password.equalsIgnoreCase(username)) {
                return "Password cannot contain username";
            }
            else if (!password.equalsIgnoreCase(confpass)){
                return "Passwords do not match";
            }
            else if (password.length() < 8 && password.length() > 0) {
                return "Password is too short";
            }
            else if (password.isEmpty()) {
                return "Password cannot be empty";
            }
            else if (username.isEmpty() && password.isEmpty()) {
                return "Username and password cannot be empty";
            }
            else {
                return "Your username and password has been created";

            }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("New Username: ");
        String username = sc.nextLine();

        System.out.println(("New password: "));
        String password = sc.nextLine();

        System.out.println("Confirm new password: ");
        String confpass = sc.nextLine();

        Userpass user = new Userpass();
        Userpass pass = new Userpass();

        System.out.println(user.login(username, password));
        System.out.println(pass.passphrase(username, password, confpass));







    }
}
