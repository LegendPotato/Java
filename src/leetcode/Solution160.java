package leetcode;

public class Solution160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a = headA;
        ListNode b = headB;
        int countA = 0;
        while (a != null) {
            countA++;
            a = a.next;
        }
        int countB = 0;
        while (b != null) {
            countB++;
            b = b.next;
        }
        int min = countA < countB ? countA : countB;

        a = headA;
        b = headB;
        while (countA - min != 0) {
            a = a.next;
            countA--;
        }
        while (countB - min != 0) {
            b = b.next;
            countB--;
        }
        while (a != null && a != null) {
            if (a == b) {
                return a;
            } else {
                a = a.next;
                b = b.next;
            }
        }
        return null;

    }
}
