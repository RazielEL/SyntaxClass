package com.syntax.homework3;

public class Students{

    public static int numberOfStudents = 0;

    public Students(){
        numberOfStudents++;
    }

    String name;
    String id;

    public static void main(String[] args) {

    Students S1 = new Students();
    S1.name = "Adam";
    S1.id = "123";
    System.out.println(S1.name);
    System.out.println(S1.id);
    System.out.println(S1.numberOfStudents);

    Students S2 = new Students();
    S2.name = "Pawel";
    S2.id = "456";
    System.out.println(S2.name);
    System.out.println(S2.id);
    System.out.println(S2.numberOfStudents);

    Students S3 = new Students();
    S2.name = "Jerzy";
    S2.id = "789";
    System.out.println(S3.name);
    System.out.println(S3.id);
    System.out.println(S3.numberOfStudents);



    }
}
