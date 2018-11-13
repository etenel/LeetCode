package com.eternel.jet.leetcode.easy;

public class JewelsAndStones {
    /*You're given strings J representing the types of stones that are jewels,
    and S representing the stones you have.  Each character in S is a type of stone you have.
    You want to know how many of the stones you have are also jewels.
    The letters in J are guaranteed distinct, and all characters in J and S are letters.
    Letters are case sensitive, so "a" is considered a different type of stone from "A".
    */
    public static void main(String[] args) {
        System.out.print(num("aA", "aAAbbb"));
    }

    public static int num(String J, String S) {
        int number = 0;
        for(int i = 0; i < J.length(); i++) {
            char c = J.charAt(i);
            for (int j = 0; j < S.length(); j++) {
                char charAt = S.charAt(j);
                if(c==charAt) {
                    number++;
                }
            }
        }
        return number;
    }
}
