package com.eternel.jet.leetcode.easy;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PeakIndexInAMountainArray {
    /**
     * Let's call an array A a mountain if the following properties hold:
     * <p>
     * A.length >= 3
     * There exists some 0 < i < A.length - 1 such that A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1]
     * <p>
     * Given an array that is definitely a mountain, return any i such that A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1].
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.print(peakIndexInMountainArray(new int[]{24, 69, 100, 99, 79, 78, 67, 36, 26, 19}));
    }

    private static int peakIndexInMountainArray(int[] A) {
        int position=0;
//        int[] clone = Arrays.copyOf(A, A.length);
//        Arrays.sort(clone);
//        int max = clone[clone.length - 1];
//        for (int i = 0; i < A.length; i++) {
//            if (A[i] == max) {
//               position=i;
//               break;
//            }
//        }
        while (A[position]<A[position+1]){
            position++;
        }
        return position;
    }
}
