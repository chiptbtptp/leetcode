package com.leetcode;

/**
 *
 * 合并两个有序链表
 *
 * 这类问题有两种解法：
 *  1. 非递归解法
 *  2. 递归解法
 *
 * @author
 * @since 1.0
 */
public class T021Merge2SortedLists {

    public static void main(String[] args) {

    }

    //非递归解法
    private static ListNode merge2Lists(ListNode l1, ListNode l2) {
        //不要忘记处理l1 或者l2为空的情况
        if (l1==null) return l2;
        if (l2==null) return l1;
        int head = l1.val < l2.val ? l1.val : l2.val;
        ListNode l = new ListNode(head);
        ListNode lIndex = l;
        ListNode l1Index = l1;
        ListNode l2Index = l2;
        while (l1Index != null && l2Index != null) {
            if (l1Index.val < l2Index.val) {
                lIndex.next = l1Index;
                l1Index = l1Index.next;
                lIndex = lIndex.next;
            }else {
                lIndex.next = l2Index;
                l2Index = l2Index.next;
                lIndex = lIndex.next;
            }
        }

        if (l1Index == null) {
            lIndex.next = l2Index;
        }
        if (l2Index == null) {
            lIndex.next = l1Index;
        }

        //注意不是return l.
        return l.next;
    }

    //递归解法
    private static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            //注意return
            return l1;
        }else{
            l2.next = mergeTwoLists(l1, l2.next);
            //注意 return
            return l2;
        }
    }
}
