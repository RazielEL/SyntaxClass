package com.syntax.homework4;

public class StudentsTest {



    public static void main(String[] args) {

        Students pupil1 = new Students("Wojtek", 4, 2, 5);
        Students pupil2 = new Students("Jerzy", 2, 3, 4);
        Students pupil3 = new Students("Jacek", 6, 3, 2);
        Students pupil4 = new Students("Marcin", 1, 2, 3);
        Students pupil5 = new Students("Mariusz", 4, 4, 2);

        pupil1.displayInfo();
        pupil2.displayInfo();
        pupil3.displayInfo();
        pupil4.displayInfo();
        pupil5.displayInfo();

    }
}