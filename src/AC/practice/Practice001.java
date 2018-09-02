package AC.practice;
/**
 * 1.输入一个正数n，输出所有和为n的连续正数序列。
 分析：设定两个指针，min指向和为n的连续正数序列的最小值，max指向和为n的连续正数序列最大值。sum表示真正的和。
 初始情况下,min、max和sum 都指向1.
 当sum小于n时，max++；
 当sum大于n时，min++;
 当sum等于n时，输出整个序列。
 链接：https://blog.csdn.net/hqm12345qw/article/details/52154249
 */

public class Practice001 {

    public static void getAns(int n) {

        for (int min = 1; min < n / 2 + 1; min++) {
            for (int max = min + 1; max < n / 2 + 1; max++) {
                int sum = add(min, max);
                //连续相加相等，打印出来
                if (sum == n) {
                    echo(min, max);
                    System.out.println();
                }
                //如果连续相加大于n,则没必要再移动max指针，直接跳出内存循环
                else if (sum > n) {
                    break;
                }
                //如果连续相加小于n,则将max自增，继续找这个序列，内层循环继续
                else {
                    continue;
                }
            }
        }
    }

    public static void echo(int min,int max){
        for (int i = min; i <=max ; i++) {
            System.out.println(i);
        }
    }

    public static int add(int min, int max) {
        int sum = 0;
        for (int i = min; i <= max; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        getAns(15);
    }
}
