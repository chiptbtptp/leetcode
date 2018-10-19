package com.leetcode;

/**
 * 判断链表是否有环
 * 能够不适用额外的空间？
 * @author
 * @since 1.0
 */
public class T141LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        if (head == null) return false;
        ListNode walker = head;
        ListNode runner = head;
        while (runner.next != null && runner.next.next != null) {
            walker = walker.next;
            runner = runner.next.next;
            if (walker==runner) return true;
        }
        return false;
    }
}
