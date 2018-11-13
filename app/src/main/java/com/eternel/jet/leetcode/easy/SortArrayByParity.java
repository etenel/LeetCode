package com.eternel.jet.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class SortArrayByParity {
    /**
     * Given an array A of non-negative integers, return an array consisting of all the even elements of A,
     * <p>
     * followed by all the odd elements of A.
     * <p>
     * You may return any answer array that satisfies this condition.
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] parity = sortArraryParity(new int[]{3, 1, 2, 4});
        for (int i : parity) {
            System.out.print(i + "\n");
        }
    }

    public static int[] sortArraryParity(int[] A) {
        List<Integer> numbers = new ArrayList<>(A.length);
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 != 0) {
                //奇数放后面。
                numbers.add(A[i]);
            } else {
//                偶数放前面
                numbers.add(0, A[i]);
            }
        }
        for (int i = 0; i < numbers.size(); i++) {
            A[i] = numbers.get(i);
        }
        return A;
    }



}
