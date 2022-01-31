package threadtest;

class MyThread1 extends Thread {

	@Override
	public void run() {
		int count = 1;
		while (true) {
			System.out.println(count++);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}

}

public class ThreadEx {

	public static void main(String[] args) {
		MyThread1 t1 = new MyThread1();
		t1.setDaemon(true);
		t1.start();
		// t1.interrupt();
		Thread m=new Thread();
		try {
			m.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}

}
