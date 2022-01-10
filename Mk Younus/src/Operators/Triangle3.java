package Operators;

import java.util.Scanner;

public class Triangle3 {

	public static void main(String[] args) {
		float a, b, c;
		float s;
		double area;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st num:");
		a = sc.nextFloat();
		System.out.println("Enter the 2nd num:");
		b = sc.nextFloat();
		System.out.println("Enter the 3rd num:");
		c = sc.nextFloat();

		s = (a + b + c) / 2;
		System.out.println(s);
		area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
		System.out.println("Area is:" + area);

	}

}
