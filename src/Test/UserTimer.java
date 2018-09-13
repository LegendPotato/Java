package Test;

import java.util.Timer;
import java.util.TimerTask;


public class UserTimer {

    public static void main(String[] args) {
        TimerTask task=new TimerTask(){
            private int counter=0;
            public void run() {
                    counter++;
                    System.out.println(counter+":invoked!");

            }
        };
        Timer timer=new Timer();
        timer.schedule(task, 1000,100);
    }

}
