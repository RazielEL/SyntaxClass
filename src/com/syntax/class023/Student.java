package com.syntax.class023;

class Student{
    void study() {
        System.out.println("Students must study to pass");
    }
    void doHomeWork(){
        System.out.println("Students must do homeworks");
    }
    void practice(){
        System.out.println("Studnets must to practice");
    }
}

class SyntaxStudent extends Student{
    void study(){
        System.out.println("Syntax students must study 25 hours a week");
    }
    void doHomeWork(){
        System.out.println("Syntax students must solve Repls");
    }

    @Override
    void practice() {
        System.out.println("Syntax students must do their own research");
    }
}

class SchoolStudent extends Student {

}

class Main {

    public static void main(String[] args){

        Student syntaxStudent = new SyntaxStudent();
        Student schoolStudent = new SchoolStudent();


        Student[] students = {new SyntaxStudent(), new SchoolStudent()};

        for (Student student:students) {
                student.study();
                student.doHomeWork();
                student.practice();
        }

    }
}
