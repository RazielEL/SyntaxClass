package com.syntax.class020;

public class Lion  extends Animal {
    boolean huntOthers = true;

    void roar(){
        System.out.println(name + " is roaring and is " + color + " and " + huntOthers);
    }


    public static void main(String[] args) {

        Lion lion = new Lion();
        lion.name = "Alex";
        lion.color = "Pink";
        lion.sleep();
        lion.eat();
        lion.roar();









    }
}