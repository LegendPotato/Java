package ac.wangyi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        for (int i = 0; i < number; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] array = new int[n][m];
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < m; k++) {
                    array[j][k] = 0;
                }
            }
            int count = calculate(n, m, array);
            System.out.println(count);
        }
    }

    public static int calculate(int n, int m, int[][] a) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

            }

        }
        return 1;
    }

}
