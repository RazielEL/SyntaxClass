package com.syntax.homework4;

public class Test {

    public static void main(String[] args) {

        Execute dolars = new Execute(20);
        Execute wydruk = new Execute();
        System.out.println(dolars);
        System.out.println(wydruk);
//        FourConstructors Obj1 = new FourConstructors(10,20);
//        Obj1.add();
//        FourConstructors Obj2 = new FourConstructors();
//        Obj2.add();

        StudentInfo stu1 = new StudentInfo("Jerzy", "666 Hellview Ave");
        StudentInfo stu2 = new StudentInfo("Marek", "777 Heavenview Ln");
        stu1.displayInfo();
        stu2.displayInfo();


    }
}
