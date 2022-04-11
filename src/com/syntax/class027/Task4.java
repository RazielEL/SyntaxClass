package com.syntax.class027;

import java.util.Map;
import java.util.TreeMap;

public class Task4 {
    public static void main (String[] args){


        TreeMap<String,Person> personTreeMap = new TreeMap<>();

        personTreeMap.put("123ABC",new Person("Piotr", "Ziemski", 36, 80000.0) );
        personTreeMap.put("456DEF", new Person("Marek", "Dzwirek", 45, 60000.0));
        personTreeMap.put("123fsd", new Person("Adam", "Madon", 99, 2.0));
        personTreeMap.put("12451f", new Person("Fortino", "Monroy", 31, 1000000));

        for (Map.Entry<String, Person> darek : personTreeMap.entrySet()){
            System.out.println(darek);
        }







    }

}

class Person{
    String name;
    String lastName;
    int age;
    double salary;

    public Person(String name, String lastName, int age, double salary) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;

    }

    @Override
    public String toString() { //metoda do printowania, z prawy-> generate
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}

