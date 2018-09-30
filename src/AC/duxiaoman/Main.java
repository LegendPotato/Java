package AC.duxiaoman;

import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int count = sc.nextInt();
//        int[] array = new int[count];
//        for (int i = 0; i < count; i++) {
//            array[i] = sc.nextInt();
//        }
//        int[] weight = new int[count-1];
//        for (int i = 0; i < count-1; i++) {
//            weight[i] = f(array,i,count);
//        }
//        for (int i = 0; i < count-2; i++) {
//            System.out.print(weight[i] + " ");
//        }
//        System.out.print(weight[weight.length-1]);
//    }
//    public static int f(int[] array,int index,int count){
//        int result = 0;
//        for (int left = index;left>=0;left--){
//            int temp = array[left];
//            for (int right = index+1;right<count;right++){
//                if (array[left] != array[right]){
//                    result++;
//                }
//            }
//        }
//        return result;
//    }
//}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] array = new int[count];
        int[] weight = new int[count-1];
        for (int i = 0; i < count; i++) {
            array[i] = sc.nextInt();
        }
        for (int i = 0; i < count-1; i++) {
            for (int left = i;left>=0;left--){
                int temp = array[left];
                for (int right = i+1;right<count;right++){
                    if (array[left] != array[right]){
                        weight[i]++;
                    }
                }
            }
        }
        for (int i = 0; i < count-2; i++) {
            System.out.print(weight[i] + " ");
        }
        System.out.print(weight[weight.length-1]);
    }
}

