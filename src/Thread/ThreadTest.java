package Thread;

public class ThreadTest {

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
            if (i == 30) {
                Runnable myRunnable = new MyRunnable();
                Thread thread = new Thread(myRunnable);
                thread.start();
            }
        }
    }
}

class MyRunnable implements Runnable {
    private int i = 0;
    @Override
    public void run() {
        System.out.println("in MyRunnable run");
        for (i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}

class MyThread extends Thread {
  


    @Override
    public void run() {
        System.out.println("in MyThread run");

    }
}