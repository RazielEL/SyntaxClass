package com.syntax.class020;

public class ChemTeacher extends Teacher{

    int chemSkill;
    void displayInfo(){

        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + EmployeeID);
        System.out.println("Age: " + age);
        System.out.println("How good is the teacher: " + chemSkill);
    }

    public static void main (String[] args){

        ChemTeacher chem = new ChemTeacher();

        chem.name = "Jasiek";
        chem.EmployeeID = "456";
        chem.age = 20;
        chem.chemSkill = 101;

        chem.displayInfo();






    }


}
