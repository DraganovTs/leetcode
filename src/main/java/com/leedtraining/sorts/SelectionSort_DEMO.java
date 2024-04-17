package com.leedtraining.sorts;

import java.util.Arrays;

public class SelectionSort_DEMO {

    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            if (i!=minIndex){
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {4, 5, 3, 2, 1};
        selectionSort(array);
        System.out.println(Arrays.toString(array));
    }
}
