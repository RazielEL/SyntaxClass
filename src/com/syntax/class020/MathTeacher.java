package com.syntax.class020;

public class MathTeacher extends Teacher {

    int mathSkill;

    void displayInfo() {

        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + EmployeeID);
        System.out.println("Age: " + age);
        System.out.println("How good is the teacher: " + mathSkill);
    }

    public static void main(String[] args) {

        MathTeacher math = new MathTeacher();

        math.name = "Marcin";
        math.EmployeeID = "789";
        math.age = 39;
        math.mathSkill = 66;

        math.displayInfo();
    }

}
