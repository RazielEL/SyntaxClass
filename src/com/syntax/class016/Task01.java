package com.syntax.class016;

public class Task01 {

    // Create a String that should be combination of letters, numbers and special characters.
    //Find out how many Alphanumeric characters are there in the String.

    public static void main(String[] args) {

        String a = "l;kxchgkjlshKJHlKJSLKHJJHzzz983720942hujoasdfh8YF(*AY*FY_A*SHFI)HA)*H(_B@I!+$(U*()@U)IHAO{BVA_S*VY&_SZ(*D&)(*YI)BH@#!OJ$BRUI";

        System.out.println(a.length());
        System.out.println(a.replaceAll("[^A-Za-z8-9]", "").length());

        System.out.println(a);
        System.out.println(a.replaceAll("[^A-Za-z8-9]", ""));  // ^ znaczy ze to zostawiamy. bez tego bedziemy wypieprzac.



    }
}
