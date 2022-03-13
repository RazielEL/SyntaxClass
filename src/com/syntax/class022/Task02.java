package com.syntax.class022;


class Shape {
    double radius;
    Shape(double radius){
        this.radius = radius;
    }
}

class Circle extends Shape {
    Circle (double radius){
        super(radius);
    }

    void calculateArea() {

        double area = 3.14 * radius * radius;
        System.out.println("Area of the circle is: " + area);

    }

    public static void main (String[] args){
        Circle circle = new Circle(10);
        circle.calculateArea();
    }

}









public class Task02 {


}
