package com.syntax.homework2;

public class TwoNames {


    public static void main(String[] args) {

       String dad = "Adam";
       String mom = "Justyna";
       char gender = 'f';
       String maleName = " ";
       String femaleName = " ";

       String dadFirstHalf = dad.substring(0, dad.length()/2);
       String momFirstHalf = mom.substring(0, mom.length()/2);
       String dadLastHalf = dad.substring(dad.length()/2, dad.length());
       String momLastHalf = mom.substring(mom.length()/2, mom.length());

       if (gender == 'm'){
           System.out.println("Name of the boy should be: " +dadFirstHalf+momLastHalf);
       }
       else if (gender == 'f'){
           System.out.println("Name of the girls should be: " +momFirstHalf+dadLastHalf);
       }
        else {
            System.out.println("Gender is m or f");
       }



    }
}
