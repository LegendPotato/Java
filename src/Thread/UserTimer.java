package Thread;

import java.util.Timer;
import java.util.TimerTask;


public class UserTimer {

    public static void main(String[] args) {

        //必须现有一个TimerTask
        TimerTask task = new TimerTask() {
            private int counter = 0;

            public void run() {
                counter++;
                System.out.println(counter + ":invoked!");

            }
        };
        Timer timer = new Timer();
        //delay的时间以后开始执行，每period执行一次
        timer.schedule(task, 1000, 100);
    }

}
