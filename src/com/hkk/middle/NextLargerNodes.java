package com.hkk.middle;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @author kang
 * @date 2023/4/10
 */
public class NextLargerNodes {


    public int[] nextLargerNodes(ListNode head) {
        int[] result = new int[10000];
        List<Integer> numbers = new ArrayList<>();
        Deque<Integer> stack = new LinkedList<>();
        ListNode p = head;
        int cnt = 0;
        while (p != null) {
            numbers.add(p.val);
            result[cnt] = 0;
            while (!stack.isEmpty() && numbers.get(stack.getLast()) < p.val) {
                result[stack.getLast()] = p.val;
                stack.removeLast();
            }
            stack.addLast(cnt++);
            p = p.next;
        }
        return Arrays.copyOf(result, cnt);
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(2);
        head.next = new ListNode(7);
        head.next.next = new ListNode(4);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(5);
        // head.next.next.next.next.next = new ListNode(8);
        System.out.println(Arrays.toString(new NextLargerNodes().nextLargerNodes(head)));
    }


    public static class ListNode {

        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}


