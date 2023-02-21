package com.hkk.hard;

import java.util.Arrays;

/**
 * 1326 https://www.cnblogs.com/grandyang/p/17046561.html
 *
 * @author kang
 * @date 2023/2/21
 */
public class MinTaps {

    public int minTaps(int n, int[] ranges) {
        int[][] jumps = jumps(n, ranges);
        int[] dp = new int[n + 1];
        Arrays.fill(dp, n + 2);
        dp[0] = 0;
        for (int i = 0; i <= n; i++) {
            final int left = jumps[i][0];
            final int right = jumps[i][1];
            for (int j = left + 1; j <= right; j++) {
                dp[j] = Math.min(dp[j], dp[left] + 1);
            }
        }
        return dp[n] == n + 2 ? -1 : dp[n];
    }

    private int[][] jumps(int n, int[] ranges) {
        int[][] jumps = new int[n + 1][2];
        for (int i = 0; i <= n; i++) {
            jumps[i] = new int[]{
                Math.max(i - ranges[i], 0),
                Math.min(i + ranges[i], n)
            };
        }
        return jumps;
    }

    public static void main(String[] args) {
        System.out.println(new MinTaps().minTaps(7, new int[]{
            1, 2, 1, 0, 2, 1, 0, 1
        }));
    }
}
