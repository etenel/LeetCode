package com.eternel.jet.leetcode.easy;

public class HammingDistance {
    /**
     * The Hamming distance between two integers is the number of positions at which the corresponding bits are different.
     * <p>
     * Given two integers x and y, calculate the Hamming distance.
     * <p>
     * Note:
     * 0 ≤ x, y < 2^31
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.print(hammingDistance(10,
                20));
    }

    private static int hammingDistance(int x, int y) {
        int num = 0;
        String x2 = Integer.toBinaryString(x);
        String y2 = Integer.toBinaryString(y);
        //转换成二进制后前面的0会自动去掉，所以要手动加零。变成相同长度
        while (x2.length() != y2.length()) {
            if (x2.length() > y2.length()) {
                y2 = 0 + y2;
            } else {
                x2 = 0 + x2;
            }
        }
        for (int i = 0; i < x2.length(); i++) {
            if (x2.charAt(i) != y2.charAt(i)) {
                num++;
            }
        }

        return num;
    }


}
