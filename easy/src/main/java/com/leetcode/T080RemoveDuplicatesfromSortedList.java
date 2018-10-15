package com.leetcode;

/**
 * @author
 * @since 1.0
 */
public class T080RemoveDuplicatesfromSortedList {
    public static void main(String[] args) {

    }

    private static ListNode deleteDuplicates(ListNode head) {
        ListNode index = head;
        ListNode delete = head.next;
        while (delete != null) {
            if (index.val == delete.val) {
                delete = delete.next;
                index.next = delete;//这句容易漏掉
            }else {
                index.next = delete;
                index = index.next;
                delete = delete.next;
            }
        }
        return head;
    }
}
