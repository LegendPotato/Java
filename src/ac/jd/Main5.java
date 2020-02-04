package ac.jd;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[] a = new int[number];
        int[] b = new int[number];
        int[] c = new int[number];
        for (int i = 0; i < number; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            c[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                if (a[i] < a[j] && b[i] < b[j] && c[i] < c[j]) {
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);
    }
}
