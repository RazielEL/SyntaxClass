package com.syntax.homework4;

public class Students {

    String name;
    double biology;
    double chemistry;
    double math;
    double avgGrade;

    public Students(String name, double biology, double chemistry, double math){

        avgGrade = (biology + chemistry + math)/3;
        this.name = name;


    }

    public void displayInfo() {

        System.out.println("Student's name is " + this.name + " and his average GPA is " + avgGrade);

    }






}
