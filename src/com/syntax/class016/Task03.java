package com.syntax.class016;

import java.util.Arrays;

public class Task03 {
    // How would you reverse a String word by word? for example
    //		// input=>This is sentence i want to reverse
    //		// output=>sihT si ecnetnes i tnaw ot esrever

    public static void main(String[] args) {


        StringBuilder s = new StringBuilder("This is sentence i want to reverse");
        System.out.println(s.reverse());

        String a = "Sunday is great";
        String[] b = a.split(" ");
        System.out.println(Arrays.toString(b));

        for (int i = b.length-1; i >= 0; i--){
            System.out.print(b[i]);
        }




    }
}
