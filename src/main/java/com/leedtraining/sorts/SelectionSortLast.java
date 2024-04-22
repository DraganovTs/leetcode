package com.leedtraining.sorts;

import java.util.Arrays;

public class SelectionSortLast {

    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[minIndex] > array[j]) {
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

    public static void main(String[] args) {
        int[] array = {5, 3, 1, 2, 6, 4};

        selectionSort(array);

        System.out.println(Arrays.toString(array));
    }
}
