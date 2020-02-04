package ac.didi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int np = sc.nextInt();
        int nq = sc.nextInt();
        int nr = sc.nextInt();
        int sum = np + nq + nr;
        System.out.println(calculate(np, sum));
    }

    //组合求值
    static int calculate(int m, int n) {
        int temp = 1;
        for (int i = n; i > m; i--) {
            temp *= i;
        }
        return temp / factorial(m);
    }

    static int factorial(int n) {
        if (n == 1) return 1;
        return n * factorial(n - 1);
    }

}
