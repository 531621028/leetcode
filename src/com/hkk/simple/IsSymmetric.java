package com.hkk.simple;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by kang on 2019/4/28.
 */
public class IsSymmetric {

    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root.left);
        queue.offer(root.right);
        while (!queue.isEmpty()) {
            TreeNode l = queue.poll();
            TreeNode r = queue.poll();
            if (l != null && r != null && l.val != r.val) {
                queue.offer(l.left);
                queue.offer(r.right);
                queue.offer(l.right);
                queue.offer(r.left);
            } else if (r != l) {
                return false;
            }
        }
        return true;
//        return isSameTree(root.right, root.left);
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p != null && q != null) {
            return p.val == q.val && isSameTree(p.left, q.right) && isSameTree(p.right, q.left);
        } else { return p == null && q == null; }
    }


    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) { val = x; }
    }
}
