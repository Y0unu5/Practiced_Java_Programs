package Conditional_Statements;

import java.util.Scanner;

public class ConditionalEx3 {

	public static void main(String[] args) {
		/*int day;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		day = sc.nextInt();
		if (day == 1) {
			System.out.println("This is Monday");
		} else if (day == 2) {
			System.out.println("This is Tuesday");
		} else if (day == 3) {
			System.out.println("This is Wednesday");
		} else if (day == 4) {
			System.out.println("This is Thursday");
		} else if (day == 5) {
			System.out.println("This is Friday");
		} else if (day == 6) {
			System.out.println("This is Saturday");
		} else if (day == 7) {
			System.out.println("This is Sunday");
		} else {
			System.out.println("Invalid Number");
		}*/
		// find the protocol used in the website
		String url;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the url");
		url = s.nextLine();
		String protocol = url.substring(0, url.indexOf(":"));
		if (protocol.equals("http")) {
			System.out.println("Hypertext Transfer Protocol");
		} else if (protocol.equals("ftp")) {
			System.out.println("File Transfer Protocol");
		}
		String ext = url.substring(url.lastIndexOf("."));
		if (ext.equals("com")) {
			System.out.println("Commercial");
		} else if (ext.equals("org")) {
			System.out.println("Organizational");
		} else if (ext.equals("net")) {
			System.out.println("Network");
		}
	}
}
