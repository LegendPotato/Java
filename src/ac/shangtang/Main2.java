package ac.shangtang;

import java.util.Random;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        Random random = new Random();
        int count = sc.nextInt();
        int[] array = new int[count];
        int[] result = new int[count];

        for (int i = 0; i < count; i++) {
            result[i] = -1;
        }
        for (int i = 0; i < count; i++) {
            array[i] = sc.nextInt();
            int deepth = array[i];
            int total = 0;
            while (total < deepth) {
                total += (random.nextInt(a) + 1);
                if (total >= deepth) {
                    result[i] = 1;
                    break;
                } else {
                    total += (random.nextInt(b) + 1);
                }
            }
        }
        for (int i = 0; i < count - 1; i++) {
            System.out.print(result[i] + " ");
        }

        System.out.print(result[result.length - 1]);

    }
}
