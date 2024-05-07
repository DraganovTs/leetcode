package com.leedtraining.sorts;

import java.util.Arrays;

public class SelectionSortMemory {


    public static void main(String[] args) {
        int[] array = {3, 6, 1, 8, 7, 2, 4, 5};

        System.out.println(Arrays.toString(array));

        selectionSortMemory(array);

        System.out.println(Arrays.toString(array));

    }

    private static void selectionSortMemory(int[] array) {

        for (int i = 0; i < array.length-1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length ; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }
    }
}
