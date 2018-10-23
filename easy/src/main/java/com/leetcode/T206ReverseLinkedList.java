package com.leetcode;

/**
 * 反转链表，递归和非递归两种方法
 *
 * @author
 * @since 1.0
 */
public class T206ReverseLinkedList {
    //非递归
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next ==null) {
            return head;
        }

        ListNode p = head;
        ListNode q = head.next;
        ListNode t = q.next;
        p.next = null;
        while (t != null) {
            q.next = p;
            p = q;
            q = t;
            t = t.next;
        }
        q.next = p;
        return q;

    }

    //递归（尾递归）

    public ListNode reverseList2(ListNode head) {
        return reverseHelper(head, null);
    }

    public ListNode reverseHelper(ListNode head, ListNode newHead) {
        if (head == null) return newHead;
        ListNode next = head.next;
        head.next = newHead;
        return reverseHelper(next, head);
    }
}
