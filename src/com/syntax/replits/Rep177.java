package com.syntax.replits;

interface Outputs {
    void displays();
}
interface Functions extends Outputs {

    double addition();
    double subtraction();
    double multiplication();
    double division();

}

public class Rep177 implements Functions {

    double firstNumber;
    double secondNumber;

    Rep177(double firstNumber, double secondNumber){
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    @Override
    public double addition() {
        return firstNumber + secondNumber ;
    }

    @Override
    public double subtraction() {
        return firstNumber - secondNumber ;
    }

    @Override
    public double multiplication() {
        return firstNumber * secondNumber ;
    }

    @Override
    public double division() {
        return firstNumber/secondNumber ;
    }

    @Override
    public void displays() {

        System.out.println("Result is ::: " + addition());
        System.out.println("Result is ::: " + subtraction());
        System.out.println("Result is ::: " + multiplication());
        System.out.println("Result is ::: " + division());

    }



    public static void main (String[] args){

        double firstNumber = 100.00;
        double secondNumber = 20.00;

        Rep177 a = new Rep177(firstNumber, secondNumber);

        a.displays();


    }
}
