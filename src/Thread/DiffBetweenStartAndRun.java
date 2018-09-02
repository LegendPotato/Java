package Thread;

public class DiffBetweenStartAndRun {
    public static void main(String[] args) {
        TestThread myThread = new TestThread();
        //.start()才算开线程，交由线程处理器处理
        //.run()只是普通的调用方法，单线程操作
        myThread.start();
        //myThread.run();
        System.out.println(Thread.currentThread().getName());
        for (int i=0;i<100;i++){
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }


}
class TestThread extends Thread{
    public void run(){
        for (int i = 100; i < 200; i++) {
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}