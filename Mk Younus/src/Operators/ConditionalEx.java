package Operators;

import java.util.Scanner;

public class ConditionalEx {

	public static void main(String[] args) {
		// Find given number is odd or even
		/*
		 * int num; Scanner sc = new Scanner(System.in);
		 * System.out.println("Enter a number"); num = sc.nextInt(); if (num % 2 == 0) {
		 * System.out.println("The entered number is Even"); } else {
		 * System.out.println("The entered number is ODD"); }
		 */
// to find young or older
		/*int age;
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the age");
		age = sc1.nextInt();
		if (age >= 14 && age <= 55) {
			System.out.println("He/She is Young");

		} else {
			System.out.println("He/She is Older");
		}*/
		// to find the grades
		int m1, m2, m3, total;
		float avg;
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter the m1 marks");
		m1 = sc2.nextInt();
		System.out.println("Enter the m2 marks");
		m2 = sc2.nextInt();
		System.out.println("Enter the m3 marks");
		m3 = sc2.nextInt();
		total = m1 + m2 + m3;
		avg = (float) total / 3;
		if (avg >= 80&& avg<=100) {
			System.out.println("The Grade is A");
		} else if (avg >= 60 && avg < 70) {
			System.out.println("The Grade is B ");
		} else if (avg >= 40 && avg < 60) {
			System.out.println("The Grade is C");
		} else {
			System.out.println("The Grade is F");
		}
	}

}
