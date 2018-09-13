package Test;

import java.util.Random;
        import java.util.concurrent.locks.ReadWriteLock;
        import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteLockTest {
    public static void main(String[] args) {
        final ReadWriteSharedData dataSource = new ReadWriteSharedData();
        for(int i=0;i<3;i++)
        {
            new Thread(){
                public void run(){
                    while(true){
                        dataSource.get();
                    }
                }

            }.start();

            new Thread(){
                public void run(){
                    while(true){
                        dataSource.put(new Random().nextInt(10000));
                    }
                }

            }.start();
        }

    }
}

class ReadWriteSharedData{
    //��������ݣ�ֻ����һ���߳���д�����ݣ��������ж���߳�ͬʱ�������ݡ�
    private Object data = null;
    //��д��
    ReadWriteLock rwl = new ReentrantReadWriteLock();

    public void get(){
        rwl.readLock().lock();
        try {
            System.out.println(Thread.currentThread().getName() + " be ready to read data!");
            Thread.sleep((long)(Math.random()*1000));
            System.out.println(Thread.currentThread().getName() + " have read data :" + data);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally{
            rwl.readLock().unlock();
        }
    }

    public void put(Object data){

        rwl.writeLock().lock();
        try {
            System.out.println(Thread.currentThread().getName() + " be ready to write data!");
            Thread.sleep((long)(Math.random()*1000));
            this.data = data;
            System.out.println(Thread.currentThread().getName() + " have write data: " + data);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally{
            rwl.writeLock().unlock();
        }


    }
}
