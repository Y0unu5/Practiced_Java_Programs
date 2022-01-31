package threadtest;

class ExThread extends Thread {
	public ExThread(String name) {
		super(name);
		System.out.println(Thread.MAX_PRIORITY);
	}
}

public class Test {

	public static void main(String[] args) {
		ExThread t = new ExThread("Yunus");
		System.out.println("ID is:" + t.getId());
		System.out.println("Name is:" + t.getName());
		System.out.println(t.getPriority());
		t.start();
		System.out.println(t.getState());
		System.out.println(t.isAlive());
	}

}
