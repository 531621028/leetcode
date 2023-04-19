package com.hkk.middle;

/**
 * @author kang
 * @date 2023/4/19
 */
public class MaxSumAfterPartitioning {

    public int maxSumAfterPartitioning(int[] arr, int k) {
        int[] dp = new int[arr.length + 1];

        for (int i = 1; i <= arr.length; i++) {
            int maxValue = 0;
            for (int j = 1; j <= k && i - j >= 0; j++) {
                maxValue = Math.max(arr[i - j], maxValue);
                dp[i] = Math.max(dp[i], dp[i - j] + maxValue * j);
            }
        }
        return dp[arr.length];
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 15, 7, 9, 2, 5, 10};
        System.out.println(new MaxSumAfterPartitioning().maxSumAfterPartitioning(arr, 3));
    }

}
