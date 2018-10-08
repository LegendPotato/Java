package AC.bytecode;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int k = sc.nextInt();
        int result =0;
        int start = (int) Math.pow(10,k-1);
        int end = (int)Math.pow(10,k);
        for (int i = start; i < end; i++) {
            int total = f(i);
            if ((total == a || total ==b )&& f2(i,a,b)){
                result++;
            }
        }
        System.out.println(result);
    }
    public static boolean f2(int i,int a,int b){
        while (i>0){
            if (i % 10 == a || i % 10 ==b){
                i = i/10;
            }else {
                return false;
            }
        }
        return true;
    }
    public static int f(int i){
        int total = 0;
        while (i>0){
            total+= i%10;
            i /=10;
        }
        return total;
    }
}
