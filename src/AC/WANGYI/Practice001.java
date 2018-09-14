package AC.WANGYI;
///**
// * https://www.nowcoder.com/profile/6707061/myFollowings/detail/6121810
// */


import java.util.Arrays;
import java.util.Scanner;

public class Practice001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int number = sc.nextInt();
        int[] list = new int[row];
        for (int i = 0; i < row; i++) {
            list[i] = 0;
        }
        for (int i = 0; i < number; i++) {
            list[sc.nextInt() - 1]++;
        }
        Arrays.sort(list);
        System.out.println(list[0]);
    }
}