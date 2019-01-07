package Test;

/**
 * @author zhangshuai_sx
 * @date 2018/12/19 15:13
 */

public class Main3 {

    public static void main(String[] args) {
        long a = System.currentTimeMillis();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long b = System.currentTimeMillis();

        System.out.println(a < b);

        double temp = (double) a;
        double temp2 = (double) b;
        System.out.println(a);
        System.out.println(b);
        System.out.println(temp < temp2);
    }


}
