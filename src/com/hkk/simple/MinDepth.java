package com.hkk.simple;

/**
 * Created by kang on 2019/5/7.
 */
public class MinDepth {
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return minDepth(root, 0);
    }

    public int minDepth(TreeNode root, int depth) {
        if (root.left == null && root.right == null) {
            return depth + 1;
        }
        int l = Integer.MAX_VALUE;
        if (root.left != null) {
            l = minDepth(root.left, depth + 1);
        }
        int r = Integer.MAX_VALUE;
        if (root.left != null) {
            r = minDepth(root.right, depth + 1);
        }
        return l <= r ? l : r;
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) { val = x; }
    }
}
