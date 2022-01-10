package Conditional_Statements;

import java.util.Scanner;

public class Radix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String num;
		System.out.println("Enter the number:");
		num = sc.nextLine();
		if (num.matches("[01]+")) {
			System.out.println("Its Binary the Radix is 2");
		} else if (num.matches("[0-7]+")) {
			System.out.println("Its Octal the Radix is 8");
		} else if (num.matches("[0-9A-F]+")) {
			System.out.println("Its Hexa Decimal the Radix is 16");

		} else if (num.matches("[0-9]+")) {
			System.out.println("Its  Decimal the Radix is 10");
		} else {
			System.out.println("The Number is Inavlid");
		}
	}

}
