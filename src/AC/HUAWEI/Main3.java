package AC.HUAWEI;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String result = multiply(s1,s2);
        System.out.println(result);
    }
    public static String multiply(String a, String b){
        int[] result = new int[a.length()+b.length()];
        for (int i = a.length()-1; i >=0; i--) {
            for (int j = b.length()-1; j >=0 ; j--) {
                result[i+j] += (a.charAt(i)-'0') * (b.charAt(j)-'0');
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = result.length-1; i >=0 ; i--) {
            int digital = result[i]%10;
            int jinwei = result[i]/10;
            if (i-1 >= 0){
                result[i-1] += jinwei;
            }
            sb.insert(0,digital);
        }
        return sb.toString();
    }

}
