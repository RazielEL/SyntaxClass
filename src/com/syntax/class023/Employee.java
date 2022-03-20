package com.syntax.class023;

interface Employee {
    void work();
    int age = 18;

}


class Tester implements Employee{

    @Override
    public void work() {
        System.out.println("Testing a website");
    }

    public static void main (String[] args){

        Tester tester = new Tester();
        tester.work();
        System.out.println(Employee.age);



    }
}