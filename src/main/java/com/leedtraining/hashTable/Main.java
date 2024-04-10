package com.leedtraining.hashTable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public class Main {

    public static boolean itemInCommon(int[] array1, int[] array2) {
        HashMap<Integer, Boolean> hashMap = new HashMap<>();

        for (int i : array1) {
            hashMap.put(i, true);
        }

        for (int j : array2) {
            if (hashMap.get(j) != null) return true;
        }
        return false;
    }

    public static List<Integer> findDuplicates(int[] array) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i : array) {
            if (hashMap.containsKey(i)) {
                hashMap.put(i, hashMap.get(i) + 1);
            } else {
                hashMap.put(i, 1);
            }
        }
        List<Integer> result = new ArrayList<>();
        hashMap.forEach((k, v) -> {
            if (v > 1) {
                result.add(k);
            }
        });
        return result;
    }

    public static Character firstNonRepeatingChar(String input) {
        HashMap<Character, Integer> hashMap = new LinkedHashMap<>();
        for (char i : input.toCharArray()) {
            if (hashMap.containsKey(i)) {
                hashMap.put(i, hashMap.get(i) + 1);
            } else {
                hashMap.put(i, 1);
            }
        }

        for (char c : input.toCharArray()) {
            if (hashMap.get(c) == 1) {
                return c;
            }
        }
        return null;
    }

    public static void main(String[] args) {

        System.out.println(firstNonRepeatingChar("leetcode"));
        System.out.println(firstNonRepeatingChar("hello"));
        System.out.println(firstNonRepeatingChar("aabbcc"));
    }
}
