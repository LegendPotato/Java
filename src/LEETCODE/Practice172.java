package LEETCODE;

import java.util.Scanner;


public class Practice172 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(tail(number));
    }

    static int tail(int n) {

        //最优解
        int count = 0;
        while (n > 0) {
            count += n / 5;
            n /= 5;
        }
        return count;
        //次优解
//        int count = 0;
//        for (int i = n; i > 0; i--) {
//            int j = i;
//            while (j % 5 == 0) {
//                count++;
//                j /= 5;
//            }
//        }
//        return count;
    }

}
