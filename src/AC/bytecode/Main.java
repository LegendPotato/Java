package AC.bytecode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] players = new String[]{"312", "321"};
        Arrays.sort(players, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return (s1.compareTo(s2));
            }
        });


        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char[] array = input.toCharArray();
        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder();
        boolean flag = false;
        for (int i = array.length - 1; i > 0; i--) {
            if (array[i] == '/') {
                if (!flag) {
                    flag = true;
                    sb1.append('/');
                    continue;
                } else {
                    break;
                }
            } else if (array[i] >= 'a' && array[i] <= 'z') {
                sb.append(array[i]);
            } else {
                break;
            }
        }
        System.out.println(sb1.append(sb.reverse()).toString());
    }
}
