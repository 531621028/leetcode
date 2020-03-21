package com.hkk.simple;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by kang on 2019/4/11.
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer leave = target - nums[i];
            if (map.containsKey(leave) && map.get(leave) != i + 1) {
                return new int[]{map.get(leave) - 1, i};
            }
            map.put(nums[i], i + 1);
        }
        return null;
    }

    public void quickSort(int[] nums, int start, int end) {
        if (start < end) {
            int i = partition(nums, start, end);
            quickSort(nums, start, i - 1);
            quickSort(nums, i + 1, end);
        }
    }

    public int partition(int[] nums, int start, int end) {
        int i = start;
        int j = start;
        while (j < end) {
            if (nums[j] < nums[end]) {
                swap(nums, i, j);
                i++;
            }
            j++;
        }
        swap(nums, i, end);
        return i;
    }

    public void swap(int[] nums, int i, int j) {
        if (nums[i] != nums[j]) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{3, 2, 4};
        new TwoSum().quickSort(nums, 0, 2);
        System.out.println(Arrays.toString(nums));
    }
}
