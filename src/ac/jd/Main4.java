package ac.jd;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int number = sc.nextInt();

            sum(number);
        }
    }

    static void sum(int number) {

        List<Integer> listTotal = new ArrayList<>();
        for (int i = 2; i < number; i++) {
            List<Integer> list = new ArrayList<>();
            int alias = number;
            while (alias != 0) {
                list.add(alias % i);
                alias /= i;
            }
            int size = list.size();
            int count = 0;
            for (Integer integer : list) {
                count += integer;
            }
            listTotal.add(count);
        }
        int total = 0;
        for (Integer integer : listTotal) {
            total += integer;
        }
        int totalSize = listTotal.size();
        int gcd = gcd(total, totalSize);
        System.out.println(String.valueOf(total / gcd) + "/" + String.valueOf(totalSize / gcd));

    }

    static int gcd(int m, int n) {
        while (m % n != 0) {
            int mod = m % n;
            int temp = n;
            n = mod;
            m = temp;
        }
        return n;
    }


}
