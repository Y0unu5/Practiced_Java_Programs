package Loops;

import java.util.Scanner;

public class LoopEx {

	public static void main(String[] args) {
		// Arithmetic Progression
		System.out.println("Program to print AP");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a");
		int a = sc.nextInt();
		System.out.println("Enter d");
		int d = sc.nextInt();
		System.out.println("Enter n");
		int n = sc.nextInt();
		int term = a;
		for (int i = 0; i < n; i++) {
			System.out.print(term + ",");
			term = term + d;
		}

		// GP Series
		System.out.println("Program to print GP");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter b");
		int b = scan.nextInt();
		System.out.println("Enter c");
		int c = scan.nextInt();
		System.out.println("Enter m");
		int m = scan.nextInt();
		int term1 = b;
		for (int i1 = 0; i1 < m; i1++) {
			System.out.print(term1 + ",");
			term1 = term1 * c;
		}

		// Fibonacci series
		Scanner s = new Scanner(System.in);
		System.out.println("Program for Fibonacci series");
		System.out.println("Enter no. of terms");
		int n1 = s.nextInt();
		int x = 0, y = 1, z;
		System.out.print(x + "," + y + ",");
		for (int f = 0; f < n1 - 2; f++) {
			z = x + y;
			System.out.print(z + ",");
			x = y;
			y = z;

		}
	}

}
