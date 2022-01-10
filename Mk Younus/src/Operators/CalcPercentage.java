package Operators;

import java.util.Scanner;

public class CalcPercentage {

	public static void main(String[] args) {
		int kannada, hindi, english, physics, chem, bio;
		int total;
		float percentage;
		int totalMarks = 600;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter kannada marks:");
		kannada = sc.nextInt();
		System.out.println("Enter hindi marks:");
		hindi = sc.nextInt();
		System.out.println("Enter english marks:");
		english = sc.nextInt();
		System.out.println("Enter physics marks:");
		physics = sc.nextInt();
		System.out.println("Enter chem marks:");
		chem = sc.nextInt();
		System.out.println("Enter bio marks:");
		bio = sc.nextInt();
		total = (kannada + hindi + english + physics + chem + bio);
		System.out.println(total);
		percentage = (float)total / totalMarks * 100;
		System.out.println(percentage);
	}

}
