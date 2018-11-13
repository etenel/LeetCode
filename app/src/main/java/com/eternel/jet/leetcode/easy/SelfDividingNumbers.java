package com.eternel.jet.leetcode.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SelfDividingNumbers {
    /**
     * A self-dividing number is a number that is divisible by every digit it contains.
     *
     * For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0.
     *
     * Also, a self-dividing number is not allowed to contain the digit zero.
     *
     * Given a lower and upper number bound, output a list of every possible self dividing number, including the bounds if possible.
     * @param args
     */
    public static void main(String[] args) {
        List<Integer> integers = selfDividingNumbers(21500, 22000);
        for (int i : integers) {
            System.out.print(i + ",");
        }
    }

    private static List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = left; i <= right; i++) {
          if(i%10!=0) {
              String number = String.valueOf(i);
              boolean add=true;
              for (char c:number.toCharArray()){
                  int parseInt = Integer.parseInt(String.valueOf(c));
                  if(parseInt==0||i% parseInt !=0) {
                      add=false;
                  }
              }
              if(add) {
                     list.add(i);
              }
          }
        }
        return list;
    }
}
