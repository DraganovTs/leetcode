package com.leedtraining.sorts;

import java.util.Arrays;

public class InsertionSortMemory {

    public static void main(String[] args) {
        int[] array = {3, 6, 1, 8, 7, 2, 4, 5};

        System.out.println(Arrays.toString(array));

        insertionSortMemory(array);

        System.out.println(Arrays.toString(array));

    }

    private static void insertionSortMemory(int[] array) {

        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i - 1;
            while (j > -1 && array[j] > array[j + 1]) {
                array[j + 1] = array[j];
                array[j] = temp;
                j--;
            }

        }
    }
}
