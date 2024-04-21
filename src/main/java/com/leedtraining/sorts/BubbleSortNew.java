package com.leedtraining.sorts;

import java.util.Arrays;

public class BubbleSortNew {

    public static void bubblesort(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }


    }

    public static void main(String[] args) {
        int[] myArray = {5, 3, 2, 6, 1, 4};
        bubblesort(myArray);
        System.out.println(Arrays.toString(myArray));
    }

}
