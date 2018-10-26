package com.leetcode;

/**
 * @author
 * @since 1.0
 */
public class T002AndTwoNumbers {

    public static void main(String[] args) {
        long a = 9;
        long b = 9999999991L;
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);//新建一个节点，值为0， 最后返回结果的时候，返回head.next就好了
        ListNode p = l1, q = l2, curr = head; //用curr指向头节点
        int carry = 0;
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = x + y + carry;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (p!=null) p = p.next;
            if (q!=null) q = q.next;
        }

        if (carry > 0) {
            curr.next = new ListNode(1);
        }
        return head.next;
    }
}
