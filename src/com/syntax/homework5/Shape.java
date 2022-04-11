package com.syntax.homework5;

public class Shape {
    static final double PI = 3.1415;
    int r;
    Shape(int r){
        this.r = r;
    }



    public static void main (String[] args){

        Circle kolo = new Circle(4);
        System.out.println("Circle area = " + kolo.display());

    }

}
class Circle extends Shape {
    double area;
Circle(int r){
    super(r);
    area = PI * r*r;

}

double display(){
    return area;
}
}


