package ac.wangyi;

import java.util.Arrays;
import java.util.Scanner;

public class wangyi1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        Arrays.sort(a);
        int min = a[0];
        int max = a[n];

        int heightSum = 0;
        for (int i = 0; i < n; i++) {
            heightSum += a[i];
        }
        //最小不稳定值
        int result1 = heightSum % n;
        //平均高度
        int avg = heightSum / n;
        //传入平均高度，计算最少操作次数
        int result2 = count(a, avg);

        System.out.println(result1 + " " + result2);

        echo(a, avg, n);
    }

    public static void echo(int[] a, int avg, int n) {
        for (int i = 0; i < n; i++) {
        }
    }

    //计算最少操作次数
    public static int count(int[] a, int avg) {
        int num = a.length;
        int oprationCount = 0;
        for (int i = 0; i < num; i++) {
            if (a[i] > avg) {
                oprationCount += (a[i] - avg);
            }
        }
        return oprationCount;
    }
}
