package com.hkk.simple;

/**
 * Created by kang on 2019/4/18.
 */
public class MergeTwoLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        ListNode head = null;
        ListNode next = null;
        while (l1 != null && l2 != null) {
            ListNode p;
            if (l1.val <= l2.val) {
                p = l1;
                l1 = l1.next;
            } else {
                p = l2;
                l2 = l2.next;
            }
            if (head == null) {
                head = p;
                next = head;
            } else {
                next.next = p;
                next = p;
            }
        }
        if (l1 != null) {
            next.next = l1;
        }
        if (l2 != null) {
            next.next = l2;
        }
        return head;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) { val = x; }
    }
}
