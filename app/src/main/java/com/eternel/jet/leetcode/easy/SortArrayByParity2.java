package com.eternel.jet.leetcode.easy;

public class SortArrayByParity2 {
    /*
     * Given an array A of non-negative integers, half of the integers in A are odd, and half of the integers are even.
     *
     * Sort the array so that whenever A[i] is odd, i is odd; and whenever A[i] is even, i is even.
     *
     * You may return any answer array that satisfies this condition.
     */
    public static void main(String[] args) {
        int[] ints = sortArrayByParityII(new int[]{4, 2, 5, 7});
        for (int i : ints) {
            System.out.print(i + ",");
        }
    }

    public static int[] sortArrayByParityII(int[] A) {
        int[] clone = new int[A.length];
        int t=0;
        for(int i = 0; i < A.length; i++) {
            if(A[i]%2==0) {
                clone[t]=A[i];
                t+=2;
            }
        }
         t=1;
        for(int i = 0; i < A.length; i++) {
            if(A[i]%2!=0) {
                clone[t]=A[i];
                t+=2;
            }
        }
        return clone;
    }
}
