package Arrays;

public class ArrayDemo2 {
//Find the largest value
	public static void main(String[] args) {
		int A[] = { 1, 3, 4, 5, 7, 12, 15, 19, 20, 25 };
		int max = 0;
		for (int i = 0; i < A.length; i++) {
			if (A[i] > max) {
				max = A[i];
			}

		}
		System.out.println(max);

		// Find the 2nd largest value
		int B[] = { 3, 6, 9, 12, 9, 18, 19, 25, 3 };
		int max1, max2;
		max1 = max2 = B[0];
		for (int k = 0; k < B.length; k++) {
			if (B[k] > max1) {
				max2 = max1;
				max1 = B[k];
			} else if (B[k] > max2) {
				max2 = B[k];
			}
		}
		System.out.println("Second largest number" + max2);
	}

}
