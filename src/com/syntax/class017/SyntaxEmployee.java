package com.syntax.class017;

import java.sql.SQLOutput;

public class SyntaxEmployee {

    String empID;
    double salary;
    static String CEO = "Sumair";


    public static void main(String[] args) {

    SyntaxEmployee aselsClassObject = new SyntaxEmployee();
    aselsClassObject.empID = "123";
    aselsClassObject.salary = 200000;
    System.out.println(aselsClassObject.empID);
    System.out.println(aselsClassObject.salary);
    System.out.println(SyntaxEmployee.CEO);

    System.out.println();

    SyntaxEmployee mozzamObject = new SyntaxEmployee();
    mozzamObject.empID = "456";
    mozzamObject.salary = 198000;
    System.out.println(mozzamObject.empID);
    System.out.println(mozzamObject.salary);
    System.out.println(SyntaxEmployee.CEO);



    }
}
