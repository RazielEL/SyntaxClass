package com.syntax.class016;

public class StringBuild {

        public static void main(String[] args) {
            String s = "Asghar is Great";
            System.out.println(s.replace(" ", ""));
            System.out.println(s); // stays in original state

            // String builder class
            StringBuilder sb = new StringBuilder("Asghar is great");
            sb.append(" Hahah, jokes.");
            System.out.println(sb.reverse());
            System.out.println(sb);


        }
    }
