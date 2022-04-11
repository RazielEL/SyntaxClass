package com.syntax.homework4;

public class FourConstructors {

    int priv;
    int pub;
    int def;
    int pro;
    int addition;

    FourConstructors(){
    addition = 123;
    }

    private FourConstructors(int priv){

        this.priv = priv;
        addition = priv + 5;
    }

    public FourConstructors(int priv, int pub){
        this.priv = priv;
        this.pub = pub;
        addition = priv + pub;
    }

    protected FourConstructors obj3 = new FourConstructors(5,5);




    void add(){
        System.out.println("The sum is " + this.addition);
    }





}
