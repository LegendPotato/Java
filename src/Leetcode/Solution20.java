package Leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Solution20 {

    //利用一个map来保存我们需要的映射关系
    private Map<Character, Character> map;

    {
        map = new HashMap<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');
    }

    public boolean isValid(String s) {

        if (s.length() == 0) return true;
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            //如果c是 ] or } or ),即c在map的keyset中
            if (map.containsKey(c)) {
                //一定要对stack做判空，弹出来的一定为 ( or { or [
                char temp = stack.empty() ? '#' : stack.pop();
                if (temp != map.get(c)) {
                    return false;
                }
            } else {
                // ( or { or [ 入栈
                stack.push(c);
            }
        }
        //这一步很关键，还要判断stack是否有剩余，有剩余就说明不是严格对称的
        return stack.empty();
    }
}
