package com.syntax.homework3;

public class Method {

    public static void main(String[] args) {

        int[] arr1 = {123, 542, 21, 545, 21, 543, 12, 54, 123145, 12345, 12, 346, 14};
        Arrays task1 = new Arrays();
        System.out.println(task1.arr(arr1));

        String str = "Lech Poznan Pany";
        Reverse task2  = new Reverse();
        System.out.println(task2.rev(str));

        String samo = "W czasie suszy szosa sucha";
        NoVow task3 = new NoVow();
        System.out.println(task3.samogloska(samo));


    }
}
