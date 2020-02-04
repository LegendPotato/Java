package ac.jd;

import java.util.Scanner;

/**
 * https://www.nowcoder.com/question/next?pid=5715499&qid=105621&tid=18130454
 * 幸运数，算某个数的十进制表示的各位数字之和，和二进制表示的各位数字之和
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            System.out.println(count(n));
        }
    }

    static int count(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (demical(i) == binary(i)) {
                count++;
            }
        }
        return count;
    }

    //算一个数的十进制表示的各位数字之和，n%10表示最后一位数字，n/10表示扣除最后一位数字，继续运算
    static int demical(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n = n / 10;
        }
        return sum;
    }

    //算一个数的二进制表示的各位数字之和，n循环模2，得到的余数数组为二进制表示的逆序序列
    static int binary(int n) {
        int sum = 0;
        while (n != 0) {
            sum += (n % 2);
            n = n / 2;
        }
        return sum;
    }


}
