package com.eternel.jet.leetcode.medium;

import java.util.HashMap;

public class TwoSum {
    /**
     * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
     *
     * You may assume that each input would have exactly one solution, and you may not use the same element twice.
     *
     * Example:
     *
     * Given nums = [2, 7, 11, 15], target = 9,
     *
     * Because nums[0] + nums[1] = 2 + 7 = 9,
     * return [0, 1].
     * @param args
     */
    public static void main(String[] args) {
        int[] ints = twoSum2(new int[]{1, 5, 8, 10, 6}, 11);
        System.out.print(ints.length);
    }

    /**
     * 暴力破解 复杂度O(n²)
     *
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    /**
     * 复杂度O(n)
     *
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum2(int[] nums, int target) {
        int[] num = new int[2];
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            //map中包含key=target-nums[i],返回
            if (hashMap.containsKey(target - nums[i])) {
                num[0] = hashMap.get(target - nums[i]);
                num[1] = i;
                break;
            }
            hashMap.put(nums[i], i);

        }
        return num;
    }
}
