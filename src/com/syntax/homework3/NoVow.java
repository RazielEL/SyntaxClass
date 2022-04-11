package com.syntax.homework3;

public class NoVow {
    String done;
    String samogloska (String samo){

        done = samo
                .replace("a", "")
                .replace("e", "")
                .replace("i", "")
                .replace("o", "")
                .replace("u", "");

        return done;
    }



}
