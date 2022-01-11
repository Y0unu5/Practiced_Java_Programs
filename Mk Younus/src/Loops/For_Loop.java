package Loops;

import java.util.Scanner;

public class For_Loop {

	public static void main(String[] args) {

		for (int i = 0, j = 1; i <= 10; i++, j = j * 2) {
			System.out.println(i + " " + j);
		}

		// Multiplication Table 
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter the number");
		int n = sc.nextInt();
		for (int i = 1; i <= 10; i++) {
			System.out.println(n + "X" + i + "=" + n * i);
		}

		// Find the sum of n numbers
		Scanner sc1 = new Scanner(System.in);
		System.out.println("ENter a Number");
		int num = sc1.nextInt();
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			sum = sum + i;
			System.out.println(sum);
		}

		// Calculate a factorial number
		Scanner sc2 = new Scanner(System.in);
		System.out.println("ENter a Number");
		int num1 = sc2.nextInt();
		int fact = 1;
		for (int i = 1; i <= num1; i++) {
			fact = fact * i;
			System.out.println(fact);
		}

	}

}
