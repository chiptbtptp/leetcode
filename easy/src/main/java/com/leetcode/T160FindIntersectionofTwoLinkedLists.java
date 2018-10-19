package com.leetcode;

/**
 * 找到两个链表的第一个共同个节点，没有则返回null
 * @author
 * @since 1.0
 */
public class T160FindIntersectionofTwoLinkedLists {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int aLength = 0;
        ListNode aIndex = headA;
        while (aIndex != null) {
            aLength++;
            aIndex = aIndex.next;
        }
        int bLength = 0;
        ListNode bIndex = headB;
        while (bIndex != null) {
            bLength++;
            bIndex = bIndex.next;
        }

        int differ = aLength - bLength;
        if (differ > 0) {
            for (int i=0;i<differ;i++) {
                headA = headA.next;
            }
        }else {
            for (int i=0; i<-differ;i++) {
                headB = headB.next;
            }
        }

        while (headA != null && headB != null) {
            if (headA == headB) {
                return headA;
            }else{
                headA = headA.next;
                headB = headB.next;
            }
        }
        return null;
    }
}
