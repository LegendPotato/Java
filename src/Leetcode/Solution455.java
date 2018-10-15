package Leetcode;

import java.util.Arrays;

public class Solution455 {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i = g.length - 1, j = s.length - 1;
        int result = 0;
        while (i >= 0 && j >= 0) {
            if (s[j] >= g[i]) {
                result++;
                i--;
                j--;
            } else {
                i--;
            }
        }
        return result;
    }
}
