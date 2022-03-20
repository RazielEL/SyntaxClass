package com.syntax.class024;
import java.util.ArrayList;
import java.util.Arrays;

public class CollectionsDemo {
    public static void main (String[] args){

        String name = "Yazgul";
        String name2 = "Farah";

        String[] names2 = new String[1000];
        names2[0] = "Elena";
        names2[2] = "Andrew";

        System.out.println(Arrays.toString(names2));
        ArrayList<String> syntaxStudents = new ArrayList<>();
        // Arraylist => name of the class
        // < > diamond operator
        // String datatype
        syntaxStudents.add("Dimitry");
        syntaxStudents.add("Mike");
        syntaxStudents.add("Adam");
        System.out.println(syntaxStudents);

        // lepiej jest tak w cholere.


    }
}
