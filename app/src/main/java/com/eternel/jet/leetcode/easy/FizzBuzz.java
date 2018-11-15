package com.eternel.jet.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    /**
     * Write a program that outputs the string representation of numbers from 1 to n.
     * <p>
     * But for multiples of three it should output “Fizz” instead of the number and for the multiples of five output “Buzz”.
     * <p>
     * For numbers which are multiples of both three and five output “FizzBuzz”.
     */
    public static void main(String[] args) {
        List<String> fizzBuzz = fizzBuzz(15);
        for (String str : fizzBuzz) {
            System.out.print(str+",\n");
        }
    }

    public static List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
           if(i%3!=0&&i%5!=0) {
               list.add(i+"");
           }else{
             if(i%3==0&&i%5==0) {
                 list.add("FizzBuzz");
             }else if(i%3==0) {
                 list.add("Fizz");
             }else if(i%5==0) {
                 list.add("Buzz");
             }
           }
        }
        return list;
    }
}
