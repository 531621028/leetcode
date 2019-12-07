package com.hkk.simple;

/**
 * Created by kang on 2019/4/27.
 */
public class ClimbStairs {
    public int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }
        int[] tmp = new int[n];
        tmp[0] = 0;
        tmp[1] = 1;
        tmp[2] = 2;
        for (int i = 3; i < n; i++) {
            tmp[i] = tmp[i - 1] + tmp[i - 2];
        }
        return tmp[n - 1] + tmp[n - 2];
    }
}
