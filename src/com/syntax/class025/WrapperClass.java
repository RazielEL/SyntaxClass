package com.syntax.class025;

public class WrapperClass {
    public static void main (String[] args){

        int i = 10;
        System.out.println(i);

        Integer in = new Integer(5); //zwykly boxing, ale przekresla bo mozemy zrobic jak nizej, autoboxing
        Integer ni = 5; // oto wlasnie autoboxing. W ta strone to dziala.

        System.out.println(in);
        System.out.println(ni);

        int int1 = Integer.valueOf(in); //unboxing
        int int2 = ni; // autounboxing

        System.out.println(int1);
        System.out.println(int2);










    }
}
