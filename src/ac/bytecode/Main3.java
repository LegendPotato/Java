package ac.bytecode;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input1 = sc.nextInt();
        int input2 = sc.nextInt();
        int count = 0;
        for (int i = input1; i <= input2; i++) {
            if (i <= 10) {
                count++;
                continue;
            }
            String temp = String.valueOf(i);
            int length = temp.length();
            char[] array = temp.toCharArray();
            boolean flag = false;
            for (int j = 1; j <= (int) Math.floor(length / 2); j++) {
                if (array[j - 1] == array[length - j]) {
                    flag = false;
                    break;
                } else {
                    flag = true;
                }
            }
            if (flag == true) {
                count++;
            }
        }
        System.out.println(count);
    }
}
