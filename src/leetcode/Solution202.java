package leetcode;

import java.util.HashSet;
import java.util.Set;

public class Solution202 {

    public boolean isHappy(int n) {
        // 用一个set来保存中间结果，如果中间结果集中有重复元素出现，
        // 说明会有死循环，即没有解，可以终止循环了
        Set<Integer> set = new HashSet<>();
        while (n != 1 && !set.contains(n)) {
            set.add(n);
            int temp = 0;
            while (n > 0) {
                int digit = n % 10;
                temp += digit * digit;
                n /= 10;
            }
            n = temp;
        }
        return n == 1;
    }
}