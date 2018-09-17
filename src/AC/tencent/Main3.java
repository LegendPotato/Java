package AC.tencent;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt()-1;
        int m = sc.nextInt()-1;
        // 0为入，1为出
        int[][] array = new int[n][2];
        for (int i = 0; i < m; i++) {
            int out = sc.nextInt()-1;
            int in = sc.nextInt()-1;
            array[out][1]++;

            if (array[out][0] !=0){
                array[in][0] +=array[out][0];
            }
            array[in][0]++;
        }
        int count =0;
        for (int i = 0; i < array.length; i++) {
            if (array[i][0]>array[i][1]){
                count++;
            }
        }
        System.out.println(count);
    }
}
