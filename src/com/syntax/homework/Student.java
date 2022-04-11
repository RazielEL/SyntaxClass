package com.syntax.homework;

public class Student {

        String grade(int score) {
            if (score > 90) {
                return "A";
            } else if (score > 80 && score < 90) {
                return "B";
            } else if (score > 70 && score < 80) {
                return "C";
            } else if (score > 60 && score < 70) {
                return "D";
            } else {
                return "F";
            }
        }

        public static void main(String[] args) {

            Student pupil = new Student();
            System.out.println("Your grade is " + pupil.grade(67));







        }



}
