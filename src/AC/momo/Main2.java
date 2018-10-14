package AC.momo;

import java.util.Arrays;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char[] array = input.toCharArray();
        Arrays.sort(array);
        int count = f(array.length);
        for (int i = 0; i < count; i++) {

        }
    }
    public static int f(int number){
        if (number == 0) return 0;
        if (number == 1 || number == 2) return number;
        return number*f(number-1);
    }
}
