package LEETCODE;

public class Solution263 {
    //计算丑数，只含有质因数2，3，5的数，14就不是，因为含有质因数7
    public boolean isUgly(int num) {
        if (num == 1) return true;
        if (num < 1) return false;
        while (num % 2 == 0) num /= 2;
        while (num % 3 == 0) num /= 3;
        while (num % 5 == 0) num /= 5;
        if (num == 1) return true;
        return false;
    }
}
