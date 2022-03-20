package com.syntax.class023;

public abstract class Phone {
    void makePhoneCall(){
        System.out.println("Making a phone call");
    }
    void sentText(){
        System.out.println("Sending a text");
    }
   abstract void displayPicture();
}

class Iphone extends Phone{

    @Override
    void displayPicture() {
        System.out.println("Use photo app to display the pics");
    }
}

class Samsung extends Phone{
    @Override
    void displayPicture() {
        System.out.println("Use gallery to display pics");
    }
}

class Phones {
    public static void main(String[] args){
        Phone samsung = new Samsung();
        samsung.displayPicture();
        samsung.makePhoneCall();





    }
}