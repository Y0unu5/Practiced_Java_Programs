package threadtest;

public class RunnableInterfaceDemo implements Runnable {
	@Override
	public void run() {
		int i = 1;
		while (true) {
			System.out.println(i + "MK");
			i++;
		}

	}

	public static void main(String[] args) {
		RunnableInterfaceDemo t = new RunnableInterfaceDemo();
		Thread th = new Thread(t);

		th.start();
		int i = 1;
		while (true) {
			System.out.println(i + "younus");
			i++;
		}
	}
}
