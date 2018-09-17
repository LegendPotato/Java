package AC.wangyi;

import java.util.Scanner;

public class wangyi3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] input = new int[3];
        for (int i = 0; i < 3; i++) {
            input[i] = in.nextInt();
        }
        int max = input[0];
        int j = 0;
        for (int i = 0; i < 3; i++) {
            if (max < input[i]) {
                max = input[i];
                j = i;
            }
        }
        int sum = 0;
        for (int i = 0; i < 3; i++) {

            if (i != j) {
                sum += input[i];
            }
        }
        int result = sum * max;

        int result2 = input[0] * input[1] * input[2];
        System.out.println(result > result2 ? result : result2);

    }
}
