package OOPs;

class Student {
	public String rollNumber;
	public String name;
	public String course;
	public int m1, m2, m3;

	public int total() {
		return m1 + m2 + m3;
	}

	public float average() {
		return (float) total() / 3;
	}

	public char grade() {
		if (average() >= 70)
			return 'A';
		else
			return 'B';
	}

	public String details() {
		return "Roll No:" + rollNumber + "\n" + "Name:" + name + "\n" + "Course:" + course;
	}

}

public class Student_Class {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.rollNumber = "012";
		s1.name = "Mohammed";
		s1.course = "Science";
		s1.m1 = 60;
		s1.m2 = 70;
		s1.m3 = 80;

		Student s2 = new Student();
		s2.rollNumber = "013";
		s2.name = "younus";
		s2.course = "commerce";
		s2.m1 = 60;
		s2.m2 = 50;
		s2.m3 = 40;

		System.out.println("Details are:" + s1.details());
		System.out.println("Total:" + s1.total());
		System.out.println("Average is:" + s1.average());
		System.out.println("Grade is:" + s1.grade());

		System.out.println("Details are:" + s2.details());
		System.out.println("Total:" + s2.total());
		System.out.println("Average is:" + s2.average());
		System.out.println("Grade is:" + s2.grade());

	}

}
