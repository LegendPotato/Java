package AC.iqiyi;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> set = new HashSet<>();
        while (sc.hasNext()){
            int temp = sc.nextInt();
            if (set.contains(temp)){
                System.out.println(temp);
            }else {
                set.add(temp);
            }
        }
    }
}
