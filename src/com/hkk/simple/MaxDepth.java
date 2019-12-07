package com.hkk.simple;

/**
 * Created by kang on 2019/4/29.
 */
public class MaxDepth {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int l = maxDepth(root.left);
        int r = maxDepth(root.right);
        return l > r ? l + 1 : r + 1;
    }


    public static class TreeNode {
        int val;
        TreeNode left;

        TreeNode right;

        TreeNode(int x) { val = x; }
    }

}

