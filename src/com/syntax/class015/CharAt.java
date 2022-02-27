package com.syntax.class015;

public class CharAt {

    public static void main(String[] args) {

        String name = "How are you guys?";
        System.out.println(name);

        System.out.println(name.charAt(0)); //Strings are arrays of letters, using this method we can access particular letters

        for (int i = 0; i < name.length(); i++) {
            if (i == name.length() - 1 ) {
                System.out.print(name.charAt(i));
                break;
            } else {
                System.out.print(name.charAt(i) + "_");
            }


        }



    }
}
