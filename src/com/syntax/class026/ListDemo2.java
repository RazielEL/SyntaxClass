package com.syntax.class026;

import java.util.LinkedList;
import java.util.List;

public class ListDemo2 {
    public static void main (String[] args){


        List<String> courses = new LinkedList<>();

        courses.add("SDLC");
        courses.add("Manual Testing");
        courses.add("Java");
        courses.add("Git");
        courses.add("Selenium");
        courses.add("TestNG");
        courses.add("Cucumber");
        courses.add("SQL");
        courses.add("API");
        courses.add("Jenkins");
        courses.add("Interview");
        courses.add("Resume Prep");
        courses.add("AWS");
        courses.add("APM");
        courses.add("Docker");
        courses.add("Dead");

        int a = courses.indexOf("Dead");
        System.out.println(a);
        courses.set(15, "Happy");

        for (String i : courses){
            System.out.print(i + " ");
        }

        System.out.println();

        courses.set(courses.indexOf("Git"), "Shiganshina" );

        for (String i : courses){
            System.out.print(i + " ");
        }

    }
}
