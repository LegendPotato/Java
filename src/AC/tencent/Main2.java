package AC.tencent;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = n+1;
        while (true){
            if ( LCM(1,m) == LCM(n+1,m) * m){
                System.out.println(m);
                break;
            }else {
                m++;
            }
        }
    }
    public static int LCM(int start,int end){
        if (start==end) return start;
        int result = 1;
        for (int i = start; i <= end; i++) {
            result *= i;
        }
        return result;
    }
}
