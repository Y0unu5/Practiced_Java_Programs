package threadtest;

class MyData {
	synchronized public void display(String str) {
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
		}
	}
}

class MyThread3 extends Thread {
	MyData d;

	public MyThread3(MyData d) {
		this.d = d;

	}

	@Override
	public void run() {
		System.out.println("Hello World");
	}

}

class MyThread2 extends Thread {
	MyData d;

	public MyThread2(MyData d) {
		this.d = d;

	}

	@Override
	public void run() {
		System.out.println("Wellcome all");
	}
	
}

public class SynchronizedTest {

	public static void main(String[] args) {
		MyData d1 = new MyData();
		MyThread3 t1 = new MyThread3(d1);
		MyThread2 t2 = new MyThread2(d1);
	}

}
