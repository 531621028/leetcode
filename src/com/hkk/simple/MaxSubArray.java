package com.hkk.simple;

/**
 * Created by kang on 2019/4/23.
 */
public class MaxSubArray {
    public int maxSubArray(int[] nums) {
        int[] record = new int[nums.length];
        int max = nums[0];
        record[0] = max;
        for (int i = 1; i < nums.length; i++) {
            int tmp = record[i - 1] + nums[i];
            if (tmp < nums[i]) {
                record[i] = nums[i];
            } else {
                record[i] = tmp;
            }
            if (max < record[i]) {
                max = record[i];
            }
        }
        return max;
    }
}
