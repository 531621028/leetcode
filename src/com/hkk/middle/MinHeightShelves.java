package com.hkk.middle;

import java.util.Arrays;

/**
 * @author kang
 * @date 2023/4/23
 */
public class MinHeightShelves {

    public int minHeightShelves(int[][] books, int shelfWidth) {
        int[] dp = new int[books.length + 1];
        Arrays.fill(dp, 1000000);
        dp[0] = 0;
        for (int i = 0; i < books.length; i++) {
            int currentWidth = 0;
            int maxHeight = 0;
            for (int j = i; j >= 0; j--) {
                currentWidth += books[j][0];
                if (currentWidth > shelfWidth) {
                    break;
                }
                maxHeight = Math.max(maxHeight, books[j][1]);
                dp[i + 1] = Math.min(dp[j] + maxHeight, dp[i + 1]);
            }
        }
        return dp[books.length];
    }


    public static void main(String[] args) {
        int[][] books = new int[][]{{1, 1}, {2, 3}, {2, 3}, {1, 1}, {1, 1}, {1, 1}, {1, 2}};
        System.out.println(new MinHeightShelves().minHeightShelves(books, 4));
    }
}
