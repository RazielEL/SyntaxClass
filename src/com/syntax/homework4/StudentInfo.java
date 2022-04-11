package com.syntax.homework4;

public class StudentInfo {
    String name;
    String address;



    public StudentInfo(String name, String address){

        this.name = name;
        this.address = address;

    }

    void displayInfo(){
        System.out.println("Student's name is " + name + " and an address is " + address);
    }
}
