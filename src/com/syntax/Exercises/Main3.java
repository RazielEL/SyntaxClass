package com.syntax.Exercises;

import java.util.Arrays;

public class Main3 {
    public static void main (String[] args){

        int[] arr;
        int N = 1;
        arr = new int[N];
        int sum = 0;
        for (int i = 0; i <= arr.length-1; i++){

          if (arr.length > 1){
              arr[i] = 2*i - N + 1;
          }
        }
        System.out.println(Arrays.toString(arr));















    }
}
