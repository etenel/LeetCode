package com.eternel.jet.leetcode.easy;

import android.graphics.YuvImage;

public class PowerOfThree {
    /**
     * Given an integer, write a function to determine if it is a power of three.
     * @param args
     */
    public static void main(String[] args) {
        System.out.print(isPowerOfThree(27));
    }
    public static boolean isPowerOfThree(int n) {
       if(n<1) {
           return false;
       }
       while(n%3==0) {
           n/=3;
       }
    return n==1;
    }
}
