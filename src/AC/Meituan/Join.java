package AC.Meituan;

public class Join {
    public static void main(String[] args) {
        Object o = new Object();
        Thread t = new Thread(new Runnable() {

            @Override
            public void run() {
                try {

                    Thread.sleep(2000);
                    System.out.println(Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        //主线程开一个t线程
        t.start();
        try {
            //主线程等待t线程结束后再运行
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("main");
    }
}
