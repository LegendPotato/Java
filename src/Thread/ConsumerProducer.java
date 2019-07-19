package Thread;

import java.util.Scanner;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ConsumerProducer {
    public static void main(String[] args) {
        CostumTask costumTask = new CostumTask();
        Producer p = new Producer(costumTask);
        Consumer c1 = new Consumer(costumTask);
        p.start();
        c1.start();
    }
}

class Consumer extends Thread {
    private CostumTask costumTask;

    public Consumer(CostumTask costumTask) {
        this.costumTask = costumTask;
    }

    public void run() {
        while (true) {
            costumTask.remove();
        }
    }
}

class Producer extends Thread {
    private CostumTask costumTask;

    public Producer(CostumTask costumTask) {
        this.costumTask = costumTask;
    }

    public void run() {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            int time = scanner.nextInt();
            costumTask.add(time);
        }
    }
}

class CostumTask {
    private BlockingQueue<Integer> blockingQueue = new LinkedBlockingQueue(3);

    public void add(int time) {
        try {
            if (blockingQueue.size() < 3) {
                blockingQueue.put(time);
                System.out.println("生产者生产一件资源，需要" + time + "ms完成投递");

            } else {
                System.out.println("快递员都有任务，该任务无法接收");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void remove() {
        try {
            if (blockingQueue.size() > 0) {
                Integer time = blockingQueue.remove();
                Thread.sleep(time);
                System.out.println("快递员完成投递");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
