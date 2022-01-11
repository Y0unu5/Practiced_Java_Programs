package Loops;

import java.util.Scanner;

public class While_Loop {

	public static void main(String[] args) {
		// print the given number
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter a number");
		int n = sc.nextInt();
		int r;
		while (n > 0) {
			r = n % 10;
			n = n / 10;
			System.out.println(r);
		}

		// Find the Armstrong Number
		Scanner sc1 = new Scanner(System.in);
		System.out.println("ENter a number");
		int n1 = sc1.nextInt();
		int m = n1;
		int r1;
		int sum = 0;
		while (n1 > 0) {
			r1 = n1 % 10;
			n1 = n1 / 10;
			sum = sum + r1 * r1 * r1;

		}
		if (m == sum)
			System.out.println("Its a Armstrong Number");
		else
			System.out.println("Its not an Armstrong Number");

		// Reverse a number
		Scanner sc2 = new Scanner(System.in);
		System.out.println("ENter a number");
		int n2 = sc2.nextInt();
		int rev = 0;
		int r3;
		int m1 = n2;
		while (n2 > 0) {
			r3 = n2 % 10;
			rev = rev * 10 + r3;
			n2 = n2 / 10;

		}
		System.out.println("The reverse num is:" + rev);

		// CHeck whether it is Palindrome or not
		Scanner sc3 = new Scanner(System.in);
		System.out.println("ENter a number");
		int n3 = sc3.nextInt();
		int rev1 = 0;
		int r4;
		int m2 = n3;
		while (n3 > 0) {
			r4 = n3 % 10;
			rev1 = rev1 * 10 + r4;
			n3 = n3 / 10;

		}
		if (m2 == rev1)
			System.out.println("Its Palindrome");
		else
			System.out.println("Its Palindrome");

		// Display Number in words
		Scanner scan = new Scanner(System.in);
		System.out.println("ENter a number");
		int n4 = scan.nextInt();
		int i;
		int r5;
		int c;
		String str = "";
		while (n4 > 0) {
			r5 = n4 % 10;

			n4 = n4 / 10;
			str = str + r5;

		}
		System.out.println(str);
		for (i = str.length() - 1; i >= 0; i--) {
			c = str.charAt(i);
			switch (c) {
			case '0':
				System.out.println("Zero");
				break;
			case '1':
				System.out.println("One");
				break;
			case '2':
				System.out.println("two");
				break;
			case '3':
				System.out.println("three");
				break;
			case '4':
				System.out.println("four");
				break;
			case '5':
				System.out.println("five");
				break;
			case '6':
				System.out.println("six");
				break;
			case '7':
				System.out.println("seven");
				break;
			case '8':
				System.out.println("eight");
				break;
			case '9':
				System.out.println("Nine");
				break;
			default:
				System.out.println();

			}
		}
	}
}
