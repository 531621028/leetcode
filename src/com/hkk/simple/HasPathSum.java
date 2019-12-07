package com.hkk.simple;

/**
 * Created by kang on 2019/5/8.
 */
public class HasPathSum {

    public boolean hasPathSum(TreeNode root, int sum) {
        return hasPathSum(root, sum);
    }


    public boolean hasPathSum(TreeNode root, int target, int current) {
        if (root == null) {
            return false;
        }
        current = root.val + current;
        if (root.left == null && root.right == null && current == target) {
            return true;
        }
        return hasPathSum(root.left, target, current) || hasPathSum(root.right, target, current);
    }


    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) { val = x; }
    }
}
