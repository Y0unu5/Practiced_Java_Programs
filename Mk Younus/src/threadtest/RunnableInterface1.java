package threadtest;

class myRunnable implements Runnable {

	@Override
	public void run() {
		int i = 1;
		while (true) {
			System.out.println(i + "Hi");
			i++;
		}
	}

}

public class RunnableInterface1 {

	public static void main(String[] args) {
		myRunnable t = new myRunnable();
		Thread th = new Thread(t);
		th.start();
		int i = 1;
		while (true) {
			System.out.println(i + "Yunus");
			i++;
		}

	}

}
