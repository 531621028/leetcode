package com.hkk.simple;

/**
 * Created by kang on 2019/4/18.
 */
public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int current = nums[0];
        int length = 1;
        for (int num : nums) {
            if (num != current) {
                current = num;
                nums[length++] = num;
            }
        }
        return length;
    }
}
