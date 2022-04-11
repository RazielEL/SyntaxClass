package com.syntax.homework9;

//Create a Card class that will have implemented  and
//        unimplemented methods and a constructor that will initializes
//        credit card type.  Create 3 subclasses of a Card card. Create 3
//        objects of different card and store them into LinkedList.
//        Using for loop/advanced for loop/ iterator access all methods of the class.

import java.util.LinkedList;

class Card {

    String name;
    String number;
    String exp;

    Card(String name, String number, String exp){

        this.name = name;
        this.exp = exp;
        this.number = number;

    }

    void ExpDate(){
        System.out.println("CC of " + name + " expires on " + exp );
    }

    void CCNum(){
        System.out.println(name + ", your CC number is " + number);
    }
}

class Visa extends Card{

    Visa(String name, String number, String exp) {
        super(name, number, exp);
    }

    @Override
    void ExpDate() {
        super.ExpDate();
    }

    @Override
    void CCNum() {
        super.CCNum();
    }
}

class MasterCard extends Card{

    MasterCard(String name, String number, String exp) {
        super(name, number, exp);
    }

    @Override
    void ExpDate() {
        super.ExpDate();
    }

    @Override
    void CCNum() {
        super.CCNum();
    }
}

class AmericanExpress extends Card {

    AmericanExpress(String name, String number, String exp) {
        super(name, number, exp);
    }

    @Override
    void ExpDate() {
        super.ExpDate();
    }

    @Override
    void CCNum() {
        super.CCNum();
    }
}


public class CreditCards {
    public static void main (String[] args){

        Card visa = new Visa("Ziemski", "123456", "02/10");
        Card ae = new AmericanExpress("Bardyka", "567890", "10/02");
        Card mc = new MasterCard("Jachac", "7777", "07/07");

        Card[] cards = {new Visa("Ziemski", "123456", "02/10"), new AmericanExpress("Bardyka", "567890", "10/02"), new MasterCard("Jachac", "7777", "07/07")};

        for (Card i : cards){
            i.CCNum();
            i.ExpDate();
        }

        System.out.println();

        LinkedList<Card> cc = new LinkedList<Card>();
        cc.add(ae);
        cc.add(visa);
        cc.add(mc);


        for (Card a : cc){
            a.ExpDate();
            a.CCNum();
        }
    }

}
