package com.leedtraining.sorts;

import java.util.Arrays;

public class InsertionSortLast {

    public static void insertionSort(int[] array) {

        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i - 1;
            while (j > -1 && array[j + 1] < array[j]) {
                array[j + 1] = array[j];
                array[j] = temp;
                j--;
            }
        }

    }


    public static void main(String[] args) {
        int[] array = {3, 1, 6, 4, 5, 2};

        insertionSort(array);

        System.out.println(Arrays.toString(array));
    }
}
