package com.hkk.simple;

/**
 * Created by kang on 2019/4/27.
 */
public class Merge {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1, j = n - 1;
        int last = m + n - 1;
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[last--] = nums1[i--];
            } else {
                nums1[last--] = nums2[j--];
            }
        }
        if (j >= 0) {
            while (j >= 0) {
                nums1[last--] = nums2[j--];
            }
        }
    }
}
