package Thread;

public class RunWhatMethod {
    public static void main(String[] args) {
        Thread th = new Thread(new Runnable() {
            public void run() {
                System.out.println("Runnable.Run()");
            }
        }) {
            //如果Thread里重写了run方法，而没有调用super.run()，只运行Thread里面的run()方法
            public void run() {
                //super.run();
                System.out.println("Thread.Run()");
            }
        };
        th.start();
    }

}
