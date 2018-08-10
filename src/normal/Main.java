package normal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String string = scanner.nextLine();
            if (string.equals("") || string == null) {
                continue;
            }
            //只有两种情况，字符串长度被8整除和不被8整除
            if (string.length() % 8 == 0) {
                int j = string.length() / 8;
                for (int i = 0; i < j; i++) {
                    System.out.println(string.substring(8 * i, 8 * (i + 1)));
                }
            } else {
                int j = string.length() / 8 + 1;
                for (int i = 0; i < j - 1; i++) {
                    System.out.println(string.substring(8 * i, 8 * (i + 1)));
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(string.substring(8 * (j - 1)));
                int num = 8 * j - string.length();
                for (int i = 0; i < num; i++) {
                    sb2.append("0");
                }
                System.out.println(sb2.toString());
            }
        }
    }
}
