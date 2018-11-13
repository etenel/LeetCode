package com.eternel.jet.leetcode.easy;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FlippingAnImage {
    /**
     * Given a binary matrix A, we want to flip the image horizontally, then invert it, and return the resulting image.
     * <p>
     * To flip an image horizontally means that each row of the image is reversed.
     * <p>
     * For example, flipping [1, 1, 0] horizontally results in [0, 1, 1].
     * <p>
     * To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0. For example,
     * <p>
     * inverting [0, 1, 1] results in [1, 0, 0].
     *
     * @param args
     */
    public static void main(String[] args) {
        int[][] ints = flipAndInvertImage(new int[][]{new int[]{1, 1, 0}, new int[]{1, 0, 1}, new int[]{0, 0, 0}});
        for (int i = 0; i < ints.length; i++) {
            System.out.print("[");
            for (int j = 0; j < ints[i].length; j++) {
                System.out.print(ints[i][j] + ",");
            }
            System.out.print("]");
        }

    }

    private static int[][] flipAndInvertImage(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            int[] ints = A[i];
            for (int j = 0; j < ints.length; j++) {
                if (j < (ints.length / 2)) {
                    int temp = ints[j];
                    ints[j] = ints[ints.length - j - 1];
                    ints[ints.length - j - 1] = temp;
                }
                ints[j] = Math.abs(ints[j] - 1);
            }
        }
        return A;
    }
}
