package com.syntax.class020;

public class SuperKeyword {

}

class Parent {
    String color = "Black";
}
class Child extends Parent{

    String color = "Red";
    void printColor(){
        String color = "Green";
        System.out.println(color);
        System.out.println(super.color);
    }

    public static void main(String[] args){


        Child child = new Child();
        child.printColor();


    }


}