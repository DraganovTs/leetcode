package com.leedtraining.hashTable;

import java.util.*;

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

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int pairNum = target - num;
            if (numMap.containsKey(pairNum)) {
                return new int[]{numMap.get(pairNum), i};
            }
            numMap.put(num, i);


        }


        return new int[]{};
    }

    public static List<List<String>> groupAnagrams(String[] strings) {
        Map<char[], List<String>> hashMap = new HashMap<>();

        for (int i = 0; i < strings.length; i++) {
            char[] key = strings[i].toCharArray();
            Arrays.sort(key);

            if (hashMap.containsKey(key)) {
                hashMap.get(key).add(strings[i]);
            } else {
                List<String> group = new ArrayList<>();
                group.add(strings[i]);
                hashMap.put(key, group);
            }
        }

        return new ArrayList<>(hashMap.values());
    }

    public static void main(String[] args) {

        System.out.println("1st set:");
        System.out.println(groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));

        System.out.println("\n2nd set:");
        System.out.println(groupAnagrams(new String[]{"abc", "cba", "bac", "foo", "bar"}));

        System.out.println("\n3rd set:");
        System.out.println(groupAnagrams(new String[]{"listen", "silent", "triangle", "integral", "garden", "ranged"}));

        /*
            EXPECTED OUTPUT:
            ----------------
            1st set:
            [[eat, tea, ate], [tan, nat], [bat]]

            2nd set:
            [[abc, cba, bac], [foo], [bar]]

            3rd set:
            [[listen, silent], [triangle, integral], [garden, ranged]]

        */
    }
}
