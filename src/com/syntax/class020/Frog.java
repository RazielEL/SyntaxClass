package com.syntax.class020;

public class Frog {

        String name;
        String color;
        int age;
        double weight;

    public Frog(String name, String color, int age, double weight) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.weight = weight;
    }

    void printInfo(){
        System.out.println("Name of the frog is " + this.name + ", he is " + this.color + " his is " + this.age + " years old and he weights " + this.weight + " pounds.");
    }



}


