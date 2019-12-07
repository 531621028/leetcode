package com.hkk.simple;

/**
 * Created by kang on 2019/4/27.
 */
public class DeleteDuplicates {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode preNode = head, currNode = head.next;
        int tmp = preNode.val;
        while (currNode != null) {
            if (currNode.val != tmp) {
                tmp = currNode.val;
                preNode.next = currNode;
                preNode = currNode;
            }
            currNode = currNode.next;
        }
        preNode.next = null;
        return head;
    }

    private static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) { val = x; }
    }
}
