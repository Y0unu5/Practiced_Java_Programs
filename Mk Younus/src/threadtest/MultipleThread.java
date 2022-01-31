package threadtest;

public class MultipleThread {

	public static void main(String[] args) {
		MultiThread mt1 = new MultiThread("One");
		MultiThread mt2 = new MultiThread("Two");
		MultiThread mt3 = new MultiThread("Three");

		// Start the threads.
		mt1.t.start();
		mt2.t.start();
		mt3.t.start();

		try {
			// Wait for other threads to end
			Thread.sleep(10000);

		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("Main thread exiting..");
	}

}
