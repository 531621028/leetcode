package com.hkk.simple;

/**
 * Created by kang on 2019/5/7.
 */
public class IsBalanced {
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        int diff = depth(root.right) - depth(root.left);
        if (diff > 1 || diff < -1) {
            return false;
        }
        return isBalanced(root.left) && isBalanced(root.right);
    }

    public int depth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int l = depth(root.left);
        int r = depth(root.right);
        return l > r ? l + 1 : r + 1;
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) { val = x; }
    }
}
