package Operators;

import java.util.Scanner;

public class Triangle1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number:");

		int a = sc.nextInt();
		System.out.println("Enter the 2nd number:");
		int b = sc.nextInt();
		float area = (a * b) / 2;
		System.out.println("Area of triangle is:" + area);

	}

}
