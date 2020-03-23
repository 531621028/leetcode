package com.hkk.simple;

import com.hkk.simple.MergeTwoLists.ListNode;

public class MiddleNode {

    public ListNode middleNode(ListNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }
        ListNode quick = head;
        while (quick.next != null && quick.next.next != null) {
            head = head.next;
            quick = quick.next.next;
        }
        if (quick.next == null) {
            return head;
        } else {
            return head.next;
        }
    }
}
