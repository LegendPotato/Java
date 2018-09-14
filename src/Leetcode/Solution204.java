package Leetcode;

public class Solution204 {

    //正常解，n^2的时间复杂度，不是最优解
//    public int countPrimes(int n) {
//        int count =0;
//        //题目要求是小于N的所有质数，也就是从2~n-1的遍历范围
//        for(int i =2;i<n;i++){
//            if(isPrime(i)){
//                count++;
//            }
//        }
//        return count;
//    }

    //质数的定义是 只能被1和本身整除 不能被其他数字整除 所以遍历范围为2~a-1
    //这里可以有一个小加速，即比较i*i<=num就可以，不要用i<= sqart(num)，这个方法比相乘更耗时
    // Loop's ending condition is i * i <= num instead of i <= sqrt(num)
    // to avoid repeatedly calling an expensive function sqrt().
    //这种的时间复杂度为 n^1.5，有小步提升
    public boolean isPrime(int num) {
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    //最优解
    public int countPrimes(int num) {
        //开始的时候设定大家都为质数
        boolean[] isPrime = new boolean[num];
        //从2到n-1，1和n没用
        for (int i = 2; i < num; i++) {
            isPrime[i] = true;
        }

        for (int i = 2; i * i < num; i++) {
            //如果不是质数就跳过，
            if (!isPrime(i)) continue;
            //是质数，要把所有能被该质数整除的数标记出来
            for (int j = i * i; j < num; j += i) {
                isPrime[j] = false;
            }
        }
        int count = 0;
        for (int i = 2; i < num; i++) {
            if (isPrime[i]) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Solution204 s = new Solution204();
        System.out.println(s.countPrimes(10));
    }

}
