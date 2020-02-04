package ac.tencent;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            boolean flag = false;
            for (int j = 1; j < Integer.MAX_VALUE; j++) {
                if (j * A % B == C) {
                    System.out.println("YES");
                    flag = true;
                    break;
                }
            }
            if (flag == false) {
                System.out.println("NO");
            }
        }
    }
}
