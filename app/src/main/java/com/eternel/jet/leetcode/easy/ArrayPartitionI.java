package com.eternel.jet.leetcode.easy;

import java.util.Arrays;

public class ArrayPartitionI {
    /**
     * Given an array of 2n integers, your task is to group these integers into n pairs of integer,
     * <p>
     * say (a1, b1), (a2, b2), ..., (an, bn) which makes sum of min(ai, bi) for all i from 1 to n as large as possible.
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.print(arrayPairSum(new int[]{7, 3, 1, 0, 0, 6}));
    }

    private static int arrayPairSum(int[] nums) {
        int num = 0;
        Arrays.sort(nums);
        //简单选择排序
//        for (int i = 0; i < nums.length; i++) {
//            int min = nums[i];
//            int position = i;
//            for (int j = i + 1; j < nums.length; j++) {
//                if (min > nums[j]) {
//                    min = nums[j];
//                    position = j;
//                }
//            }
//            nums[position] = nums[i];
//            nums[i] = min;
//        }
//        冒泡排序
//        int temp=0;
//        for(int i = 0; i < nums.length; i++) {
//            for (int j = 0; j < nums.length - 1 - i; j++) {
//                if(nums[j]>nums[j+1]) {
//                    temp=nums[j+1];
//                    nums[j+1]=nums[j];
//                    nums[j]=temp;
//                }
//            }
//        }
        for (int i = 0; i < nums.length; i+=2) {
            num += nums[i];
        }
        return num;
    }
}
