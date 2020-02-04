package ac.wangyi;
//import java.util.Scanner;
//
//public class wangyi.wangyi2 {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int[]a = new int[n];
//        for (int i = 0; i < n; i++) {
//            a[i] = in.nextInt();
//        }
//        int[]b = new int[n];
//        for (int i=0;i<n;i++){
//            b[i] = sum(a,i);
//        }
//        int questionCount = in.nextInt();
//        int[] question = new int[questionCount];
//        for (int i = 0; i < questionCount; i++) {
//            question[i] = in.nextInt();
//            count(question[i],b,n);
//        }
//    }
//    public static int sum(int[]a,int j){
//        int sum = 0;
//        for (int i=0;i<=j;i++){
//            sum+=a[i];
//        }
//        return sum;
//    }
//
//    public static void count(int number,int[]b,int n){
//        for (int i=0;i<n;i++){
//            if (number>b[i]){
//                continue;
//            }else {
//                System.out.println(i+1);
//                break;
//            }
//        }
//
//    }
//}

import java.util.Scanner;

public class wangyi2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        int questionCount = in.nextInt();
        int[] question = new int[questionCount];
        for (int i = 0; i < questionCount; i++) {
            question[i] = in.nextInt();
            count(question[i], a, n);
        }
    }

    public static void count(int number, int[] a, int n) {
        int temp = a[0];
        for (int i = 0; i < n; i++) {
            if (number > temp) {
                temp += a[i + 1];
                continue;
            } else {
                System.out.println(i + 1);
                break;
            }
        }

    }
}
