package com.syntax.homework6;

class Teacher{
    String name;
    int age;
    String school;
    int graduation;
    String subject;

    Teacher (String name, int age, String school, int graduation, String subject ){
        this.name = name;
        this.age = age;
        this.school = school;
        this.graduation = graduation;
        this.subject = subject;
    }

    void teaching(){
        System.out.println(name + " is a good teacher");
    }

    void displayInfo(){
    System.out.println("Name is " + name + ", is " + age + " old school teacher at " + school + "with " + graduation +  " years if exp. He is teaching " + subject);

    }
        }



class MathTeacher extends Teacher{
    String a = "briliant";
    MathTeacher(String name, int age, String school, int graduation, String subject ){
        super(name, age, school, graduation, subject );
        }

        void special(){
        System.out.println(name + "is a " + a + " teacher");
        }

}

class PianoTeacher extends Teacher{
    String a = "briliant";
    PianoTeacher(String name, int age, String school, int graduation, String subject ){
        super(name, age, school, graduation, subject );
    }
    void special(){
        System.out.println(name + "is a " + a + " teacher");
    }

}

public class School {
  public static void main (String[] args){

      MathTeacher one = new MathTeacher("Janusz", 53, "Podstawowka", 15, "math");
      one.displayInfo();
      one.teaching();
      one.special();

      PianoTeacher two = new PianoTeacher("Marek", 30, "Liceum", 10, "muzyka");
      two.displayInfo();
      two.teaching();
      two.special();


  }
}
