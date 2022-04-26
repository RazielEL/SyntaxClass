package com.syntax.Exercises;

class Main10 {
    public static void main(String[] args) {
        int N = 1234;
       System.out.println(reverseInteger(N));


    }

    public static int reverseInteger(int N) {

        String str = String.valueOf(N);
        StringBuilder tempstr = new StringBuilder();
        tempstr.append(str);
        String a = tempstr.reverse().toString();
        int reversed = Integer.parseInt(a);


        return reversed;
    }
}