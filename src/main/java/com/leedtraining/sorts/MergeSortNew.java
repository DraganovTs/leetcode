package com.leedtraining.sorts;

import java.util.Arrays;

public class MergeSortNew {

    public static int[] mergeArrays(int[] array1, int[] array2) {
        int[] combinedArray = new int[array1.length + array2.length];
        int index = 0;
        int i = 0;
        int j = 0;

        while (i < array1.length && j < array2.length) {
            if (array1[i] < array2[j]) {
                combinedArray[index] = array1[i];
                i++;
            } else {
                combinedArray[index] = array2[j];
                j++;
            }
            index++;
        }

        while (i < array1.length) {
            combinedArray[index] = array1[i];
            i++;
            index++;
        }
        while (j < array2.length) {
            combinedArray[index] = array2[j];
            j++;
            index++;
        }


        return combinedArray;
    }

    public static int[] mergeSort(int[] array) {
        if (array.length == 1) return array;

        int midIndex = array.length / 2;

        int[] left = mergeSort(Arrays.copyOfRange(array, 0, midIndex));
        int[] right = mergeSort(Arrays.copyOfRange(array, midIndex, array.length));

        return mergeArrays(left, right);
    }


    public static void main(String[] args) {
        int[] myArray = {4, 1, 3, 6, 5, 2, 8, 7};

        System.out.println(Arrays.toString(myArray));
        System.out.println(Arrays.toString(mergeSort(myArray)));

    }
}
