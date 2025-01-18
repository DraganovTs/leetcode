package com.leedtraining.sorts;

import java.util.Arrays;

public class MergeSort03 {


    public static int[] mergeSort(int[] arr) {
        if(arr.length==1)return arr;
        int mid = arr.length / 2;

        int[]left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return mergeArrays(left,right);
    }

    private static int[] mergeArrays(int[] array1, int[] array2) {
        int[] combined = new int[array1.length + array2.length];
        int i = 0, j = 0, index = 0;

        while (i < array1.length && j < array2.length) {
            if (array1[i] < array2[j]) {
                combined[index++] = array1[i++];
            } else {
                combined[index++] = array2[j++];
            }
        }
        while (i < array1.length) {
            combined[index++] = array1[i++];
        }
        while (j < array2.length) {
            combined[index++] = array2[j++];
        }
        return combined;
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(mergeSort(new int[]{32,15,8,33,56,89,0})));
    }
}
