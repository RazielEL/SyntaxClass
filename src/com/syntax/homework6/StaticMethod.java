package com.syntax.homework6;

class StaticX {

    static void track (int a){
        System.out.println("This is static void with int " + a);
    }
    static void track (String str){
       System.out.println("This is static void with String " + str);
  }
    static void track (boolean bu) {
       System.out.println("This is static void with boolean " + bu);
    }




}

public class StaticMethod {

    private void song (int b){
        System.out.println("This is privet void with int " + b);
    }
    private void song (String st){
        System.out.println("This is privet void with String " + st);
    }
    private void song (boolean bul) {
        System.out.println("This is privet void with boolean " + bul);
    }
    public static void main (String[] args){

        StaticX.track(5);
        StaticX.track("Pan Robert Maklowicz");
        StaticX.track(true);

        StaticMethod one = new StaticMethod();
        one.song(6);
        one.song("Pani magda gessler");
        one.song("false");


    }
}
