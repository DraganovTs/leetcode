package com.leedtraining.sorts;

import java.util.Arrays;

public class BubbleSort_Last {

    public static void bubbleSort(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < array.length-1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {4, 2, 1, 3, 6, 5};

        bubbleSort(array);

        System.out.println(Arrays.toString(array));
    }
}
