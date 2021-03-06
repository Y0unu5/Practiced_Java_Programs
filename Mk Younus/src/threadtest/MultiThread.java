package threadtest;

//Create a multiple threads
class MultiThread implements Runnable {
	String name;
	Thread t;

	MultiThread(String threadname) {
		name = threadname;
		t = new Thread(this, name);
		System.out.println("New thread:" + t);

	}

	// This entry point for thread
	@Override
	public void run() {
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println(name + " " + i);
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println(name + " " + " Exiting.");
	}

}
