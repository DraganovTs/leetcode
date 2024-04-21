package com.leedtraining.sorts;

import java.util.Arrays;

public class SelectionSortNew {

    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i; j < array.length; j++) {
                if (array[minIndex] > array[j]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = array[minIndex];
                array[minIndex] = array[i];
                array[i] = temp;
            }
        }

    }

    public static void main(String[] args) {
        int[] myArray = {4, 2, 1, 3, 6, 5};

        selectionSort(myArray);

        System.out.println(Arrays.toString(myArray));
    }
}
