package AC.huawei;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char[] str = input.toCharArray();
        int length = str.length;
        HashMap<Character, Integer> map = new HashMap();
        for (int i = 0; i < length; i++) {
            if (!map.containsKey(str[i])) {
                map.put(str[i], 1);
            } else {
                map.put(str[i], map.get(str[i]) + 1);
            }
        }
        int flag = 1;
        for (int i = length - 1; i >= 0; i--) {
            if (map.get(str[i]) == 1) {

                System.out.println(str[i]);
                flag = 0;
                break;
            }
        }
        if (flag == 0) System.out.println("NULL");
    }
}
