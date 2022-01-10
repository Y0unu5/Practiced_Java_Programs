package Operators;

import java.util.Scanner;

public class Cuboid {

	public static void main(String[] args) {
		int lenght, breadth, hieght;
		int totalArea, volume;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the lenght:");
		lenght = sc.nextInt();
		System.out.println("Enter the breadth:");
		breadth = sc.nextInt();
		System.out.println("Enter the hieght:");
		hieght = sc.nextInt();

		totalArea = 2 * (lenght * hieght + breadth * hieght + lenght * breadth);
		System.out.println("The total area is:" + totalArea + "");
		volume = lenght * breadth * hieght;
		System.out.println("The total volume is:" + volume);
	}

}
