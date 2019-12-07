package com.hkk.simple;

/**
 * Created by kang on 2019/4/28.
 */
public class IsSameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p != null && q != null) {
            return p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        } else
            return p == null && q == null;
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) { val = x; }
    }
}
