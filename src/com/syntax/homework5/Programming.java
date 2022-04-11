package com.syntax.homework5;

import org.jetbrains.annotations.NotNull;

public class Programming {

    String language;
    String empty;
    Programming(){

    String empty = "I love programming languages";
        this.empty = empty;
    }

    Programming(@NotNull String language){
        this.language = language;

        if (language.equalsIgnoreCase("Java")){
            language = "Java";

        }
        else if (language.equalsIgnoreCase("C++")){
            language = "C++";
        }
        else {
           language = "Something else";
        }

        }
        String display(){
        return language;
        }



    public static void main (String [] args){

        Programming obj1 = new Programming();
        Programming obj2 = new Programming("Java");
        Programming obj3 = new Programming("C++");
        Programming obj4 = new Programming("Python");

        System.out.println("I love " + obj4.display());
        System.out.println(obj1.empty);

    }

}
