package com.syntax.homework6;

class A {

    void print(){
        System.out.println("la la land");
    }

    static void printF(){
        System.out.println("Static inheritance");
    }
}

class B extends A {

}

class C extends B {

    @Override
    void print() {
        super.print();
    }
}

public class inheritanceExe {
    public static void main (String[] args){

        C test = new C();

        test.print();

        B.printF();

    }
}
