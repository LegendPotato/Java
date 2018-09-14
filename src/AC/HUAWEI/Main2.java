package AC.HUAWEI;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] strArray = input.split(" ");
        StringBuilder sb = new StringBuilder();
        if (strArray.length == 1) {
            System.out.println(A(strArray[0]));
            return;
        }
        for (int i = 0; i < strArray.length - 1; i++) {
            sb.append(A(strArray[i]));
            sb.append(" ");
        }
        sb.append(A(strArray[strArray.length - 1]));
        System.out.println(sb.toString());
    }

    static String A(String str) {
        char[] temp = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = temp.length - 1; i >= 0; i--) {
            sb.append(temp[i]);
        }
        return sb.toString();
    }

}