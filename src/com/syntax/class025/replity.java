package com.syntax.class025;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;


class Main {
    public static void main (String[] args){

        ArrayList<String> trost = new ArrayList<String>();

        trost.add("hi");
        trost.add("yo");
        trost.add("sup");
        trost.add("yolo");
        trost.add("boop");

        for (int i = 0; i < trost.size(); i++){
            if(i == 0 || i == 2 || i == 4){
                trost.remove(i);
            }
            System.out.println(trost.get(i));
        }



    }
}