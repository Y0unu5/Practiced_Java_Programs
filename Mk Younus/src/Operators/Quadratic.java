package Operators;

import java.util.Scanner;

public class Quadratic {

	public static void main(String[] args) {
		float a, b, c;
		double r1, r2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st Num:");
		a = sc.nextFloat();
		System.out.println("Enter the 2nd Num:");
		b = sc.nextFloat();
		System.out.println("Enter the 3rd Num:");
		c = sc.nextFloat();

		r1 = (-b + Math.sqrt((b * b) - 4 * a * c)) / (2 * a);
		System.out.println("Root 1 is:" + r1);
		r2 = (-b - Math.sqrt((b * b) - 4 * a * c)) / (2 * a);
		System.out.println("Root 2 is:" + r2);

	}

}
