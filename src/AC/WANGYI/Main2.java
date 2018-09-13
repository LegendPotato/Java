package AC.WANGYI;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        for (int i = 0; i < number; i++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            System.out.print(0);
            System.out.print(" ");
            System.out.println(calculate(n,k));
        }
    }
    public static int calculate(int n,int k){
        if (n ==k) return 0;
        if (k==0 ||k ==1) return 0;
        if(k + k-1 < n){
            return k-1;
        }else return n-k;
    }
}
