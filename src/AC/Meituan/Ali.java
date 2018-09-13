package AC.Meituan;

import java.util.Arrays;
import java.util.Scanner;

public class Ali {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] array = new int[n];
        for (int i=0;i<n;i++){
            array[i] = s.nextInt();
        }
        System.out.println(calculate(array));
    }
    static int calculate(int[] a){
        int count = 0;
        if (test(a) == true){
            count++;
        }
        //最大可以分max组
        int max = a.length/3;
        for (int i = 2;i<max;i++){

        }

        return count;
    }
    //看看是否为等比或等差数列
    static boolean test(int[] array){
        if (array.length==1) return true;
        for (int i=1;i<array.length-2;i++){
            if (array[i]*array[i] != array[i-1]*array[i+1]){
                return false;
            }
        }
        for (int i = 1; i <array.length-2 ; i++) {
            if (array[i+1]-array[i] != array[i]-array[i-1]){
                return false;
            }
        }
        return true;
    }

}
