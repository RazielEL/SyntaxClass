package com.syntax.homework3;

public class Arrays {
    int sum = 0;

    int arr (int[] arr1)  {

        for (int i = 0; i < arr1.length; i++){
            sum = sum + arr1[i];
        }

       return sum;
    }

}
