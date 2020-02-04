package ac.iqiyi;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int foodCount = sc.nextInt();
        int days = sc.nextInt();
        int target = sc.nextInt() - 1;
        //食物初始量
        int[] array = new int[foodCount];
        for (int i = 0; i < foodCount; i++) {
            array[i] = sc.nextInt();
        }
        for (int i = 0; i < days; i++) {
            String input = sc.next();
            int liang = sc.nextInt();
            if (input.equals("A")) {
                array[liang - 1]++;
            } else {
                array[liang - 1]--;
            }
        }


        int temp = array[target];
        for (int i = 1; i < array.length; i++) {
            int j = i;
            int temp2 = array[j];
            for (; j > 0 && temp2 > array[j - 1]; j--) {
                array[j] = array[j - 1];
            }
            array[j] = temp2;
        }
        int rank = 1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == temp) {
                System.out.println(rank);
                break;
            } else {
                rank++;
            }
        }

    }
}
