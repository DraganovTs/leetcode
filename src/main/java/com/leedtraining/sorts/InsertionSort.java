package com.leedtraining.sorts;

import java.util.Arrays;

public class InsertionSort {

    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i - 1;
            while (j > -1 && temp < array[j]) {
                array[j + 1] = array[j];
                array[j] = temp;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 4, 6, 3};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
