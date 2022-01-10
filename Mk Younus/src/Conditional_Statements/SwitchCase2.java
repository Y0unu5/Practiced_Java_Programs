package Conditional_Statements;

import java.util.Scanner;

public class SwitchCase2 {

	public static void main(String[] args) {
		/*String domain;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the domain");
		domain = sc.nextLine();
		String ext = domain.substring(domain.lastIndexOf(".") + 1);
		switch (ext) {
		case "com":
			System.out.println("Commercial");
			break;
		case "org":
			System.out.println("Organisation");
			break;
		case "gov":
			System.out.println("Government");
			break;
		case "net":
			System.out.println("Network");
			break;
		default:
			System.out.println("Invalid");
		}*/
		// Menu driven Arithmetic Program
		Scanner scan = new Scanner(System.in);
		System.out.println("MENU");
		System.out.println("===");
		System.out.println("ADD");
		System.out.println("SUB");
		System.out.println("MULTI");
		System.out.println("DIV");

		int x;
		System.out.println("eNTER the x number");
		x = scan.nextInt();
		int y;
		System.out.println("eNTER the y number");
		y = scan.nextInt();
		System.out.println("eNTER option in words");
		String option = scan.nextLine();

		switch (option) {
		case "ADD":
			System.out.println("Addition is :" + (x + y));
			break;
		case "SUB":
			System.out.println("The diff is :" + (x - y));
			break;
		case "MULTI":
			System.out.println("The multiplication is :" + (x * y));
			break;
		case "DIV":
			System.out.println("The ratio is :" + (x / y));
			break;
		default:
			System.out.println("Invalid");
		}

	}

}
