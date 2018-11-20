package com.eternel.jet.leetcode.medium;

import java.util.Arrays;

public class CoinChange {
    public static void main(String[] args) {
        System.out.print(coinChange(new int[]{1, 4, 3, 5}, 10));
    }

    public static int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount);
        dp[0] = 0;
        //从dp[1]到dp[amount]
        for (int i = 1; i <= amount; i++) {
            //钱币种类
            for (int j = 0; j < coins.length; j++) {
                //最大次数为amount个，钱币为1的时候
                //硬币的面额<=总金额的时候
                if(coins[j]<=i) {
                    dp[i]=Math.min(dp[i],dp[i-coins[j]]+1);
                }
            }
        }
        return dp[amount]>amount?-1:dp[amount];
    }
}
