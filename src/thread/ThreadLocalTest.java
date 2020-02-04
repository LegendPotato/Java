package thread;

import java.util.Random;

public class ThreadLocalTest {

    static ThreadLocal<Integer> tl = new ThreadLocal<Integer>();

    public static void main(String[] args) {

        for (int i = 0; i < 2; i++) {

            new Thread(new Runnable() {

                public void run() {
                    String threadName = Thread.currentThread().getName();
                    int dataValue = new Random().nextInt();
                    System.out.println(threadName + "创建的" + dataValue);
                    tl.set(dataValue);

                    new MyClass().visitData();
                }

            }).start();
        }
    }

    private static class MyClass {
        public void visitData() {
            String threadName = Thread.currentThread().getName();
            Integer data = tl.get();
            System.out.println(threadName + ":" + data);
        }
    }

}
