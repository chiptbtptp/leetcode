package com.leetcode;

import java.util.List;

/**
 * 判断一个链表是否是回文的
 * @author
 * @since 1.0
 */
public class T234PalindromeLinkedList {

    public boolean isParlindrome(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {

            slow = slow.next;
            fast = fast.next.next;
        }

        slow = reverseList(slow);
        fast = head;
        while (fast != null) {
            if (fast.val != slow.val) {
                return false;
            }
            fast = fast.next;
            slow = slow.next;
        }

        return true;
    }

    //非递归
    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        return pre;
    }

    //递归（尾递归）
    public ListNode reverseList2(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }
        ListNode p = reverseList2(head.next);
        head.next.next = head;
        head.next = null;
        return p;
    }
}
