package com.leedtraining.sorts;

import java.util.Arrays;

public class InsertionSortNew {

    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i - 1;
            while (j > -1 && array[j] > array[j + 1]){
                array[j + 1] = array[j];
                array[j] = temp;
                j--;
            }
        }

    }

    public static void main(String[] args) {
        int[] myArray = {2, 5, 6, 1, 3, 5};

        insertionSort(myArray);
        System.out.println(Arrays.toString(myArray));
    }
}
