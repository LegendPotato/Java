package AC.meituan;

class Demo implements Runnable {
    boolean flag = true;

    @Override
    public synchronized void run() {
        //demo一直运行，一直在wait()
        while (flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
                flag = false;
            }

            System.out.println(Thread.currentThread().getName() + "...Hello World!");
        }
    }
}

public class Daemon {
    public static void main(String[] args) throws Exception {
        Demo demo = new Demo();
        Thread t1 = new Thread(demo, "t1");
        Thread t2 = new Thread(demo, "t2");
        //t2成为守护线程，t1和主线程结束之后,守护线程t2也就结束了
        t2.setDaemon(true);
        t1.start();
        t2.start();
        Thread.sleep(2000);
        int i = 1;
        while (true) {
            if (i++ == 500) {
                //打断t1
                t1.interrupt();
                break;
            }
        }
        Thread.sleep(1000);
        System.out.println(t2.isInterrupted());
        System.out.println("main finished");
    }
}
