package com.leedtraining.sorts;

import java.util.Arrays;

public class InsertionSort_01 {

    public static void insertionSort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i - 1;
            while (j >  -1 && temp < arr[j]) {
                arr[j+1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }


    }


    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 4, 6, 6, 7 ,2, 3};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
