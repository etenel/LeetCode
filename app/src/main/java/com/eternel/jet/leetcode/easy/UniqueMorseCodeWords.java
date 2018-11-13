package com.eternel.jet.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

public class UniqueMorseCodeWords {
    /**
     * International Morse Code defines a standard encoding where each letter is mapped to a series of dots and dashes, as follows: "a" maps to ".-", "b" maps to "-...", "c" maps to "-.-.", and so on.
     *
     * For convenience, the full table for the 26 letters of the English alphabet is given below:
     *
     * [".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."]
     * Now, given a list of words, each word can be written as a concatenation of the Morse code of each letter. For example, "cba" can be written as "-.-.-....-", (which is the concatenation "-.-." + "-..." + ".-"). We'll call such a concatenation, the transformation of a word.
     *
     * Return the number of different transformations among all words we have.
     * @param args
     */
    public static void main(String[] args){
System.out.print(num(new String[]{"gin", "zen", "gig", "msg"}));
    }
    public static int num(String[] words){
        String[] morse=new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> set=new HashSet<>();
        for(int i = 0; i < words.length; i++) {
            String word = words[i];
            StringBuilder stringBuilder = new StringBuilder();
            for (int j = 0; j < word.length(); j++) {
                char c = word.charAt(j);
                //利用ascii值计算字母对应摩斯密码的位置。'a'为0位置。所以用c-'a'（a到z的ascii值为97到122）
                stringBuilder.append(morse[c-'a']);
            }
            set.add(stringBuilder.toString());
        }
        return set.size();
    }
}
