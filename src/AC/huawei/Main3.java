package AC.huawei;

import java.util.Scanner;

/**
 * 输入两个字符串形式的数字，求两个数字相乘的积，并且结果也为字符串
 * 如输入 200000和300000，则输出为60000000000
 * 最简单的方法是用BigInteger类，但不是考察这个
 */
public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String result = multiply(s1, s2);
        System.out.println(result);
    }

    public static String multiply(String a, String b) {
        int[] result = new int[a.length() + b.length()];
        for (int i = a.length() - 1; i >= 0; i--) {
            for (int j = b.length() - 1; j >= 0; j--) {
                result[i + j + 1] += (a.charAt(i) - '0') * (b.charAt(j) - '0');
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = result.length - 1; i >= 0; i--) {
            int digital = result[i] % 10;
            int jinwei = result[i] / 10;
            if (i - 1 >= 0) {
                result[i - 1] += jinwei;
            }
            if (i == 0 && result[i] == 0) continue;
            sb.insert(0, digital);
        }
        return sb.toString();
    }

}
