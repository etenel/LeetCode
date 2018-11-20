package com.eternel.jet.leetcode.medium;

import java.util.HashMap;
import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {
    /**
     * Given a string, find the length of the longest substring without repeating characters.
     * <p>
     * Example 1:
     * <p>
     * Input: "abcabcbb"
     * Output: 3
     * Explanation: The answer is "abc", with the length of 3.
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.print(lengthOfLongestSubstring2("abcaa"));
    }

    public static int lengthOfLongestSubstring(String s) {
        int result = 0;
        int n = s.length();
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0, j = 0; i < n; i++) {
            if (hashMap.containsKey(s.charAt(i))) {
                j = Math.max(j, hashMap.get(s.charAt(i)));
            }
            result = Math.max(result, i-j + 1);
            hashMap.put(s.charAt(i), i + 1);
        }
        return result;
    }

    public static int lengthOfLongestSubstring2(String s) {
        int result = 0;
        int n = s.length();
        int left = 0, right = 0;
        HashSet<Character> hashSet = new HashSet<>();
        while (right < n) {
            if (!hashSet.contains(s.charAt(right))) {
                hashSet.add(s.charAt(right));
                result = Math.max(result, hashSet.size());
                right++;
            } else {
                hashSet.remove(s.charAt(left));
                left++;
            }
        }
        return result;
    }
}
