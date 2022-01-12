package Arrays;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		int A[] = new int[5];
		int B[] = { 1, 2, 3, 4, 5 };
		for (int i = 0; i < A.length; i++) {
			System.out.println(i);

		}
		for (int m = 0; m < B.length; m++) {
			System.out.println(m);
		}
		// Sum of All Elements
		int C[] = { 1, 3, 4, 5, 6, 7, 8, 9, 5 };
		int sum = 0;
		for (int k = 0; k < C.length; k++) {
			sum = sum + C[k];
			System.out.println(sum);
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter A key");
		int key = sc.nextInt();
		int D[] = { 2, 3, 4, 5, 6, 7, 8, 9 };
		for (int l = 0; l < D.length; l++) {
			if (D[l] == key) {
				System.out.println(l);
				System.exit(0);
			}
		}
		System.out.println("Not found");
	}
}