package leetcode;

public class Solution92 {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        int len = 0;
        ListNode node1 = head;
        ListNode front = null;
        ListNode back = null;
        //走一遍链表，找到反转部分的前一个节点和后一个节点
        while (node1 != null) {
            len++;
            front = len == m - 1 ? node1 : front;
            back = len == n + 1 ? node1 : back;
            node1 = node1.next;
        }
        //如果输入参数不对，要么小于1，要么大于长度，都不操作
        if (m >= n || m < 1 || n > len) {
            return head;
        }
        //如果是从1开始反转，赋head,如果不是，赋font.next
        node1 = m == 1 ? head : front.next;

        ListNode node2 = node1.next;
        node1.next = back;
        ListNode next = null;
        while (node2 != back) {
            next = node2.next;
            node2.next = node1;
            node1 = node2;
            node2 = next;
        }
        if (front != null) {
            front.next = node1;
            return head;
        } else {
            return node1;
        }
    }
}
