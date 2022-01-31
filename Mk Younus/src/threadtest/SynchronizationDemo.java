package threadtest;

class WhiteBoard {
	String text;
	int noOfStudents;
	int count = 0;

	public void attendance() {
		noOfStudents++;
	}

	synchronized public void write(String t) {
		System.out.println("Teacher is writing" + t);
		while (count != 0)

			try {
				wait();
			} catch (Exception e) {

			}
		text = t;
		count = noOfStudents;
		notifyAll();
	}

	synchronized public String read() {
		while (count == 0)
			try {
				wait();
			} catch (Exception e) {
			}
		String t = text;
		count--;
		if (count == 0)
			notify();
		return t;
	}
}

class Teacher extends Thread {
	WhiteBoard wb;
	String notes[] = { "Java is language", "Its OOPs", "It supports Thhreading", "Platform Independent" };

	public Teacher(WhiteBoard w) {

		wb = w;
	}

	@Override
	public void run() {
		for (int i = 0; i < notes.length; i++)
			wb.write(notes[i]);
	}

}

class Student extends Thread {
	WhiteBoard wb;
	String name;

	public Student(String n, WhiteBoard wc) {

		wb = wc;
		name = n;
	}

	@Override
	public void run() {
		String text;
		wb.attendance();
		do {
			text = wb.read();
			System.out.println(name + " " + "Reading" + " " + text);
			System.out.flush();
		} while (!text.equals("end"));
	}
}

public class SynchronizationDemo {

	public static void main(String[] args) {
		WhiteBoard ww = new WhiteBoard();
		Teacher t = new Teacher(ww);
		Student s1 = new Student("1. John", ww);
		Student s2 = new Student("2. smitch", ww);
		Student s3 = new Student("3. Mkj", ww);
		Student s4 = new Student("4. snow", ww);
		t.start();
		s1.start();
		s2.start();
		s3.start();
		s4.start();
	}

}
