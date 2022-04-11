package com.syntax.homework5;

public class RecSqBoxArea {

    int a;
    int b;
    int recArea;
    int sqArea;
    int boxVol;

    RecSqBoxArea(int a, int b){
        this.a = a;
        this.b = b;
    }

    int rectangleArea(){
        recArea = a * b;
        return recArea;
    }
    int squareArea(){
        sqArea = a * a;
        return sqArea;
    }
    int boxVolume(){
        boxVol = a*a*a;
        return boxVol;
    }

    public static void main (String[] args){

        RecSqBoxArea area = new RecSqBoxArea(4, 5);

       System.out.println("Rectangle area: " + area.rectangleArea());
       System.out.println("Square area: " + area.squareArea());
       System.out.println("Box volume: " + area.boxVolume());


    }



}
