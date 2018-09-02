package Thread;

public class Test extends Thread{
    private int i = 10000;

    @Override
    public void run() {
        while ( i  > 0){
            System.out.println(i);
            i--;
        }
    }

    public static void main(String[] args) {
        Thread thread = new Test();
        thread.start();
        }
}
