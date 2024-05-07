package com.leedtraining.sorts;

import java.util.Arrays;

public class MergeSortMemory {
    public static int[] mergeArrays(int[] array1, int[] array2) {
        int[] mergeArray = new int[array1.length + array2.length];
        int index = 0;
        int i = 0;
        int j = 0;

        while (i < array1.length && j < array2.length) {
            if (array1[i] < array2[j]) {
                mergeArray[index] = array1[i];
                i++;
            } else {
                mergeArray[index] = array2[j];
                j++;
            }
            index++;
        }
        while (i < array1.length) {
            mergeArray[index] = array1[i];
            i++;
            index++;
        }
        while (j < array2.length) {
            mergeArray[index] = array2[j];
            j++;
            index++;
        }
        return mergeArray;
    }

    public static int[] mergeSort(int[] input) {
        if (input.length == 1) return input;
        int middleIndex = input.length / 2;
        int[] leftArray = mergeSort(Arrays.copyOfRange(input, 0, middleIndex));
        int[] rightArray = mergeSort(Arrays.copyOfRange(input, middleIndex, input.length));

        return mergeArrays(leftArray, rightArray);
    }


    public static void main(String[] args) {
        int[] array = {3, 6, 1, 8, 7, 2, 4, 5};

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(mergeSort(array)));
    }
}
