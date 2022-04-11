package com.syntax.homework8;


import java.util.LinkedList;

class Student{
    String name;
    int id;

    Student(String name, int id){
        this.name = name;
        this.id = id;
    }

}


public class ObjectStudentName {

    public static void main (String[] args){

        Student S1 = new Student("Eren", 111);
        Student S2 = new Student("Mikasa", 121);
        Student S3 = new Student("Armin", 133);
        Student S4 = new Student("Jean", 144);
        Student S5 = new Student("Levi", 131);
        Student S6 = new Student("Sasha", 141);

        LinkedList<Student> shiganshina = new LinkedList<>();
        shiganshina.add(S1);
        shiganshina.add(S2);
        shiganshina.add(S3);
        shiganshina.add(S4);
        shiganshina.add(S5);
        shiganshina.add(S6);

        for (Student i : shiganshina){
            System.out.println(i.name + " " + i.id);
        }









    }
}
