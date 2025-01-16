package com.leedtraining.sorts;

import java.util.Arrays;

public class MergeSort02 {


    public static int[] mergeSort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }
        int mid = arr.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left,right);
    }

    public static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int i = 0, j = 0 , index = 0 ;

        while (i<left.length && j < right.length) {
            if (left[i] < right[j]) {
                result[index++] = left[i++];

            }else {
                result[index++] = right[j++];
            }
        }

        while (i < left.length) {
            result[index++] = left[i++];
        }

        while (j < right.length) {
            result[index++] = right[j++];
        }

        return result;
    }




    public static void main(String[] args) {
        System.out.println(Arrays.toString(mergeSort(new int[]{3,6,8,33,67,12,899,2})));
    }
}
