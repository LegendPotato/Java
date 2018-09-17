package AC.meituan;

public class DeadLockDemo {
    private String A = "A";
    private String B = "b";

    public static void main(String[] args) {
        new DeadLockDemo().deadLock();
    }

    private void deadLock() {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (A) {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (B) {
                        System.out.println(1);
                    }
                }
            }
        }, "yyyyyyyyyyyyyyyyyyyyyy");
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (B) {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (A) {
                        System.out.println(2);
                    }
                }
            }
        }, "zzzzzzzzzzzzzzzzzzzzzzzz");
        t1.start();
        t2.start();
    }
}
