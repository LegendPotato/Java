package normal;

/**
 * 处理二进制问题：
    两个int32整数m和n的二进制表达，有多少个位(bit)不同么？
    (1)m^n后，将结果赋值给一个String类型的变量，循环遍历变量的每一位，看是否等于1.
    (2)m^n后，将二进制结果的最后一位&1,然后将二进制右移。
 */
public class Practice005 {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(countBitDiff(a,b));
    }
    public static int countBitDiff(int a ,int b){
        int y=a ^ b;
        int count = 0;
        while (y>0){
            //如果最后一位与1相与，即2的0次幂，等于1，则说明该位为0，该位表示a和b的位不同
            if (( y&1) == 1){
                count++;
            }
            //y右移一位
            y = y>>1;

        }
        return count;
    }
}
