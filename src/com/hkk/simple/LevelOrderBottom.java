package com.hkk.simple;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by kang on 2019/4/29.
 */
public class LevelOrderBottom {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        LinkedList<List<Integer>> result = new LinkedList<>();
        Queue<TreeNode> treeNodes = new LinkedList<>();
        Queue<TreeNode> tmpNodes = new LinkedList<>();
        List<Integer> line = new LinkedList<>();
        treeNodes.add(root);
        while (!treeNodes.isEmpty() || !tmpNodes.isEmpty()) {
            TreeNode t = treeNodes.poll();
            line.add(t.val);
            if (t.left != null) {
                tmpNodes.add(t.left);
            }
            if (t.right != null) {
                tmpNodes.add(t.right);
            }
            if (treeNodes.isEmpty()) {
                treeNodes = tmpNodes;
                tmpNodes = new LinkedList<>();
                result.addFirst(line);
                line = new LinkedList<>();
            }
        }
        return result;
    }

    public static class TreeNode {
        int val;
        TreeNode left;

        TreeNode right;

        TreeNode(int x) { val = x; }
    }
}
