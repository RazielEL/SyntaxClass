package com.syntax.class017;

public class HealthyDog {
    // when the information is expected to be different from object to object
    // we store that info in an instance variable

    String name; // instance
    String color; // instance

    // if we know that value will stay same for all the objects of a class
    // we create a static variable for that why because
    // for calling that it is better to use class names because static stays same and it is better practice

    static int numberOfLegs; //static
    void eat(){
        int noOfTimes = 3; // local
        System.out.println(name + " eats " + noOfTimes);
    }

    public static void main(String[] args) {

        HealthyDog dog = new HealthyDog(); // local

        dog.name = "Scooby";
        dog.color = "Pink";
        HealthyDog.numberOfLegs = 4;
        dog.eat();

        HealthyDog dog2 = new HealthyDog();
        dog2.name = "Tomy";
        dog2.color = "Navi Blue";
        HealthyDog.numberOfLegs = 4;
        dog2.eat();


    }
    }
