package Leetcode;

import java.util.Arrays;

public class Solution66 {
    public int[] plusOne(int[] digits) {
        int number = digits.length;
        boolean flag = true;
        int j = number - 1;
        digits[j]++;
        while (flag && j > 0) {
            if (digits[j] == 10) {
                digits[j] = 0;
                digits[j - 1]++;
                j--;
            } else {
                flag = false;
            }
        }
        if (digits[j] == 10){
            digits[j] = 0;
            int[] newInt = new int[number+1];
            for (int i = 0; i < number; i++) {
                newInt[i+1] = digits[i];
            }
            newInt[0] = 1;
            return newInt;
        }
        return digits;
    }

    public static void main(String[] args) {
        Solution66 s = new Solution66();
        System.out.println(Arrays.toString(s.plusOne(new int[]{9,9,9})));
    }
}
