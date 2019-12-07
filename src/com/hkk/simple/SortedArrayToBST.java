package com.hkk.simple;

/**
 * Created by kang on 2019/5/5.
 */
public class SortedArrayToBST {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }
        return sortedArrayToTree(nums, 0, nums.length - 1);
    }

    public TreeNode sortedArrayToTree(int[] nums, int start, int end) {
        int mid = (start + end) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        if (mid > start) {
            root.left = sortedArrayToTree(nums, start, mid - 1);
        }
        if (end > mid) {
            root.right = sortedArrayToTree(nums, mid + 1, end);
        }

        return root;
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) { val = x; }
    }
}
