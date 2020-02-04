package ac.iqiyi;

import java.util.Scanner;

//变换牌的数字，前三位之和要等于后三位之和，问最少变更几张牌的数字

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] strChar = str.toCharArray();
        int[] input = new int[strChar.length];
        for (int i = 0; i < strChar.length; i++) {
            input[i] = strChar[i] - '0';
        }
        int number1 = input[0] + input[1] + input[2];
        int number2 = input[3] + input[4] + input[5];

        int value = Math.abs(number1 - number2);
        if (number1 == number2) {
            System.out.println(0);
            return;
        }
        if ((number1 == 0 && number2 != 0) || number1 != 0 && number2 == 0) {
            if (value % 9 == 0) System.out.println(value / 9);
            else System.out.println(value / 9 + 1);
        } else {
            if (value / 9 == 0) System.out.println(value % 9);
        }
    }
}
