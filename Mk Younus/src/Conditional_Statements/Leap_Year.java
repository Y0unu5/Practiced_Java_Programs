package Conditional_Statements;

import java.util.Scanner;

public class Leap_Year {

	public static void main(String[] args) {
		int year;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Year:");
		year = sc.nextInt();
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					System.out.println("Its a Leap year");
				} else {
					System.out.println("Its not a Leap year");
				}
			} else {
				System.out.println("Its not a Leap year");
			}
		} else {
			System.out.println("Its not a Leap year");
		}

	}

}
