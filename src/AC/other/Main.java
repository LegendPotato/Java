package AC.other;

import java.util.Scanner;

/**
 * 给一个长度为N的正整数数组A，如果对于数组A中存在连续的三个数A[i],A[i+1],A[i+2]满足
 *
 * A[i] < A[i + 1] < A[i + 2] 或 A[i] > A[i + 1] > A[i + 2] , 则这个数组就不是ZigZag数组，
 *
 * 现在可以删除掉数组A中的一些数使得A变为ZigZag数组，请问最少需要删除多少个数呢?
 *
 * 输入
 * 输入的第一行一个正整数N(1<=N<=100)，表示数组大小.
 *
 * 接下来一行N个正整数表示A[i](1<=A[i]<=100)，表示数组元素.
 *
 * 输出
 * 输出一行表示答案
 *
 *
 * 样例输入
 * 5
 * 5 2 3 6 1
 * 样例输出
 * 1
 *
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n<3){
            System.out.println(0);
            return;
        }
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        int k =0;
        for (int i = 0; i+2 < n; i++) {
            if ((array[i] < array[i+1]) && (array[i+1] < array[i+2])
            || (array[i] > array[i+1]) && (array[i+1] > array[i+2])){
                k = i;
                break;
            }
        }
        int count =0;
        for (int i = k; i+2 < n; i++) {
            if (array[i] < array[i+1]){
                while (i+2<n){
                    if (array[i+1] < array[i+2] ){
                        count++;
                        i++;
                    }else {
                        break;
                    }
                }
            }else {
                while (i+2<n){
                    if (array[i+1] > array[i+2] ){
                        count++;
                        i++;
                    }else {
                        break;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
