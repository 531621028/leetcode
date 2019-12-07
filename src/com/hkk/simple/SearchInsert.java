package com.hkk.simple;

/**
 * Created by kang on 2019/4/22.
 */
public class SearchInsert {
    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target) {
                return i;
            }
        }
        return nums.length;
    }
}
