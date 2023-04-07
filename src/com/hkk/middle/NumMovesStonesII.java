package com.hkk.middle;

import java.util.Arrays;

/**
 * @author kang
 * @date 2023/4/7
 */
public class NumMovesStonesII {

    // https://leetcode.com/problems/moving-stones-until-consecutive-ii/solutions/289357/c++-with-picture/
    public int[] numMovesStonesII(int[] stones) {
        int n = stones.length;
        Arrays.sort(stones);
        int min = n;
        for (int i = 0, j = 0; i < n; ++i) {
            while (stones[i] - stones[j] + 1 > n) {
                ++j;
            }
            int alreadyStore = (i - j + 1);
            if (alreadyStore == n - 1 && stones[i] - stones[j] + 1 == n - 1) {
                min = Math.min(min, 2);
            } else {
                min = Math.min(min, n - alreadyStore);
            }
        }
        int max = Math.max(stones[n - 1] - stones[1] - n + 2, stones[n - 2] - stones[0] - n + 2);
        return new int[]{min, max};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new NumMovesStonesII().numMovesStonesII(new int[]{
            6, 5, 4, 3, 10})));
    }
}
