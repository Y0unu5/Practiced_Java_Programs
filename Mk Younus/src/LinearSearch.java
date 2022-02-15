import java.util.Scanner;

public class LinearSearch {
	/*
	 * public static int linearSearch(int[] arr, int key) { for (int i = 0; i <
	 * arr.length; i++) { if (arr[i] == key) { return i; } } return -1; }
	 */

	public static void main(String[] args) {
		/*
		 * int a1[] = { 10, 20, 30, 34, 45, 56 }; int key = 34; System.out.println(key +
		 * " is found at index: " + linearSearch(a1, key));
		 */

		int c, n, search, array[];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of elements");
		n = sc.nextInt();
		array = new int[n];
		System.out.println("Enter those " + n + "  elements");
		for (c = 0; c < n; c++) {
			array[c] = sc.nextInt();
		}
		System.out.println("enter value to find");
		search = sc.nextInt();
		for (c = 0; c < n; c++) {
			if (array[c] == search) {
				System.out.println(search + "is present location " + (c + 1) + ".");
				break;
			}
		}
		if (c == n)
			System.out.println(search + " is not present in array");
	}

}
