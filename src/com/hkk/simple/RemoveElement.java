package com.hkk.simple;

/**
 * Created by kang on 2019/4/18.
 */
public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int length = 0;
        for (int num : nums) {
            if (num != val) {
                nums[length++] = num;
            }
        }
        return length;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
        System.out.println(new RemoveElement().removeElement(nums, 2));
    }
}
