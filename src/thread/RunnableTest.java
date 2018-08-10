package thread;

class MyRunnable2 implements Runnable {

	private int i = 0;

	@Override
	public void run() {
		for (i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + "" + i);
		}
	}

}

public class RunnableTest {

	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + "" + i);
			if (i == 30) {
				Runnable myRunnable = new MyRunnable();
				Thread thread1 = new Thread(myRunnable);
				thread1.start();
				Thread thread2 = new Thread(myRunnable);
				thread2.start();
			}
		}

	}
}
