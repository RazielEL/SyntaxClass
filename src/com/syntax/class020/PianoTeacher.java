package com.syntax.class020;

public class PianoTeacher extends Teacher{

    int pianoSkill;

    void displayInfo(){

        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + EmployeeID);
        System.out.println("Age: " + age);
        System.out.println("How good is the teacher: " + pianoSkill);

    }

    public static void main (String[] args){

        PianoTeacher piano = new PianoTeacher();

        piano.name = "Jerzy";
        piano.EmployeeID = "123";
        piano.age = 22;
        piano.pianoSkill = 99;

        piano.displayInfo();






    }




}
