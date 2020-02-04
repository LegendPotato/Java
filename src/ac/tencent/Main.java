package ac.tencent;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int aLength = sc.nextInt();
        int aCount = sc.nextInt();
        int bLength = sc.nextInt();
        int bCount = sc.nextInt();
        for (int i = 0; i <= aCount; i++) {
            for (int j = 0; j <= bCount; j++) {
                if (length == i * aLength + j * bLength) {
                    count += C(i, aCount) * C(j, bCount);
                }
            }
        }
        System.out.println(count % 100000007);

    }

    static long C(int a, int b) {
        long temp = A(b) / (A(a) * A(b - a));
        return temp;
    }

    static long A(int s) {
        if (s == 0) {
            return 1;
        } else {
            long temp = 1;
            for (int i = 1; i <= s; i++) {
                temp *= i;
            }
            return temp;
        }
    }
}
