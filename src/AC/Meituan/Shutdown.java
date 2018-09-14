package AC.Meituan;

import java.util.ArrayList;

public class Shutdown {
    public static class Runner implements Runnable {

        private long i;
        //
        private volatile boolean on = true;

        @Override
        public void run() {
            //判断条件
            while (on == true && !Thread.currentThread().isInterrupted()) {
                i++;
            }
            System.out.println("i=" + i);
        }

        public void cancel() {
            on = false;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ArrayList list = new ArrayList();

        Runner runner = new Runner();
        Thread t = new Thread(runner, "runner1");
        t.start();
        Thread.sleep(2000);
        //interrupt方式结束线程
        t.interrupt();
        Runner runner2 = new Runner();
        Thread t2 = new Thread(runner2, "runner2");
        t2.start();
        Thread.sleep(2000);
        //更改布尔变量的方式结束线程
        runner2.cancel();
    }
}
