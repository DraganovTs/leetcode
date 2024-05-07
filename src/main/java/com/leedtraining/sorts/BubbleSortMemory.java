package com.leedtraining.sorts;

import java.util.Arrays;

public class BubbleSortMemory {

    public static void bubbleSortMemory(int[] input) {

        for (int i = input.length; i > 0; i--) {
            for (int j = 0; j < input.length - 1; j++) {
                if (input[j] > input[j + 1]) {
                    int temp = input[j];
                    input[j] = input[j + 1];
                    input[j + 1] = temp;
                }
            }
        }


    }

    public static void main(String[] args) {
        int[] array = {3, 6, 1, 8, 7, 2, 4, 5};

        System.out.println(Arrays.toString(array));

        bubbleSortMemory(array);

        System.out.println(Arrays.toString(array));

    }
}
