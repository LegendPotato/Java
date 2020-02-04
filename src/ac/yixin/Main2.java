package ac.yixin;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int w = sc.nextInt();
        int result = f(n, w);
        System.out.println(result);
    }

    public static int f(int n, int w) {
        if (w == 1) return 0;
        int result = (int) (n % 100003 * (Math.pow(n, w - 1) - Math.pow(n - 1, w - 1)));
        //int total = (int) Math.pow(n,w);
        //int special = n;
        //special *= (int)Math.pow(n-1,w-1);
        //return (total-special)%100003;
        return result;
    }
}
