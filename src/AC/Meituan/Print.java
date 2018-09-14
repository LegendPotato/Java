package AC.Meituan;

public class Print implements Runnable {
    private volatile int i = 1;

    @Override
    public void run() {
        while (i <= 100) {
            System.out.println(i++);
        }
    }

    public static void main(String[] args) {
        Print print = new Print();
        Thread thread = new Thread(print, "t1");
        Thread thread1 = new Thread(print, "t2");
        thread.start();
        thread1.start();
    }

}
