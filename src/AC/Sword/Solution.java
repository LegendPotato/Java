package AC.Sword;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ListNode root = listNode;
        if (root == null)
            return new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        while (root != null) {
            stack.push(root.val);
            root = root.next;
        }
        ArrayList<Integer> list = new ArrayList<>();
        while (!stack.isEmpty()) {
            list.add(stack.pop());
        }
        return list;
    }

}
