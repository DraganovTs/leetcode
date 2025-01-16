package com.leedtraining.sorts;

import java.util.Arrays;

public class MergeSort01 {

    public static int[] mergeSort(int[] arr , int s, int e) {
        if(e-s + 1 <= 1){
            return arr;
        }

        int m = (s + e)/2;
        mergeSort(arr, s, m);
        mergeSort(arr, m + 1, e);

        mergeArr(arr,s,m,e);

        return arr;
    }

    public static void mergeArr(int[] arr, int s , int m , int e) {
        int[] left = Arrays.copyOfRange(arr, s, m+1);
        int[] right = Arrays.copyOfRange(arr, m+1, e+1);

        int i = 0, j = 0, k =s;
        while(i < left.length && j < right.length){
            if(left[i] <= right[j]){
                arr[k++] = left[i++];
            }else {
                arr[k++] = right[j++];
            }
        }

        while(i < left.length){
            arr[k++] = left[i++];
        }

        while(j < right.length){
            arr[k++] = right[j++];
        }
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(mergeSort(new int[]{1,5,3,12,52,7,2,44,13}, 0, 8)));
    }
}
