package AC.Meituan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(count(n));
    }
    static int count(int n){
        if (n == 1){
            return 1;
        }else {
            return 2*count(n-1);
        }
    }

}
