package com.syntax.homework8;


import java.util.ArrayList;
import java.util.Iterator;

// Create a class Insurance that will have an attribute as insuranceName and unimplemented behaviour as getQuote and cancelInsurance.
// Create 3 subclasses Car, Pet, Health. Car class has it’s own attribute as carModel and Class Pet has petType attribute. Create 3
// objects of the sub classes and store them in ArrayList. Using for loop/advanced for loop/ iterator access all methods of the class.


class Insurance{

    String iName;

    Insurance(String iName){
        this.iName = iName;
    }

    void getQuote(){
        System.out.println();
    }

    void cancelInsurance(){
        System.out.println();
    }

}

class Car extends Insurance {
    String carModel;

    Car(String iName, String carModel) {
        super(iName);
        this.carModel = carModel;
    }

    @Override
    void getQuote() {
        System.out.println("We will cancell your " + iName + " for your " + carModel);
    }

    @Override
    void cancelInsurance() {
        System.out.println(iName + " " + carModel + " insurance costs extra");
    }
}

class Pet extends Insurance {
    String petType;

    Pet(String iName, String petType) {
        super(iName);
        this.petType = petType;
    }

    @Override
    void getQuote() {
        System.out.println("You " + petType + " insurance is " + iName);
    }

    @Override
    void cancelInsurance() {
        System.out.println("Your " + iName + " for your " + petType + " has been cancelled");
    }
}

class Health extends Insurance {
    String healthStatus;

    Health(String iName, String healthStatus) {
        super(iName);
        this.healthStatus = healthStatus;
    }

    @Override
    void cancelInsurance() {
        System.out.println("We will cancell " + iName + " because your health status is " + healthStatus );
    }

    @Override
    void getQuote() {
        System.out.println("We will check your if you have " + healthStatus + " health status in order to give you a quote for your " + iName);
    }
}



public class Inszurans {
    public static void main (String[] args){

        Insurance one = new Car("Extended Insurance", "Toyota");
        Insurance two = new Pet("Basic Insurance", "Turtle");
        Insurance three = new Health("Additional Insurance", "Poor");

        ArrayList<Insurance> insurances = new ArrayList<>();

        insurances.add(one);
        insurances.add(two);
        insurances.add(three);

        for (Insurance i : insurances){
            i.cancelInsurance();
            i.getQuote();
        }

        Iterator<Insurance> iterator = insurances.iterator();
        while (iterator.hasNext()){
            iterator.next().getQuote();
        }

        Iterator<Insurance> iterator2 = insurances.iterator();
        while (iterator2.hasNext()){
            iterator2.next().cancelInsurance();
        }







    }
}
