package Static;

import java.util.Date;

class Student {
	private String rollNo;
	private static int count = 1;

	private String assignRollNo() {
		Date d = new Date();
		String rno = "1HM-" + (d.getYear() + 1900) + " " + "ME" + "  " + count;
		count++;
		return rno;
	}

	Student() {
		rollNo = assignRollNo();

	}

	public String getRollNo() {
		return rollNo;
	}

}

public class StudentEx3 {

	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		System.out.println("Roll number is:" + s1.getRollNo());
		System.out.println("Roll number is:" + s2.getRollNo());
		System.out.println("Roll number is:" + s3.getRollNo());
	}

}
