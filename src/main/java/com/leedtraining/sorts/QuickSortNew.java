package com.leedtraining.sorts;

import java.util.Arrays;

public class QuickSortNew {


    private static int pivot(int[] array, int pivotIndex, int endIndex) {
        int swapIndex = pivotIndex;
        for (int i = pivotIndex + 1; i <= endIndex; i++) {
            if (array[i] < array[pivotIndex]) {
                swapIndex++;
                swapItems(array, swapIndex, i);
            }
        }
        swapItems(array, pivotIndex, swapIndex);
        return swapIndex;
    }

    private static void quickSortHelper(int[] array, int left, int right) {
        if (left < right) {
            int pivotIndex = pivot(array, left, right);
            quickSortHelper(array, left, pivotIndex - 1);
            quickSortHelper(array, pivotIndex + 1, right);
        }
    }

    public static void quickSort(int[] array) {
        quickSortHelper(array, 0, array.length - 1);
    }


    private static void swapItems(int[] array, int firstIndex, int secondIndex) {
        int temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
    }


    public static void main(String[] args) {
        int[] array = {6, 2, 1, 4, 7, 5};

        quickSort(array);

        System.out.println(Arrays.toString(array));

    }
}
