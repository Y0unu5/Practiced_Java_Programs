package Loops;

public class NestedLoop {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print("(" + i + "," + j + ")");
			}
			System.out.println("");
		}

		// Patterns
		int count = 0;
		for (int a = 1; a <= 5; a++) {
			for (int k = 1; k <= 5; k++) {
				// System.out.print(a+k + " ");
				++count;
				System.out.print(count + " ");
			}
			System.out.println(" ");
			// 2nd Pattern
			for (int a2 = 1; a2 <= 5; a2++) {
				for (int k = 1; k <= a2; k++) {
					System.out.print(k + " ");
				}
				System.out.println("");

				// 3rd Pattern
				int count1 = 0;
				for (int a1 = 1; a1 <= 5; a1++) {
					for (int k1 = 1; k1 <= a1; k1++) {
						count1++;
						System.out.print(count1 + " ");
					}
					System.out.println("");

					for (int i1 = 1; i1 <= 5; i1++) {
						for (int j = 1; j <= 5 - i1; j++) {
							System.out.print(j + " ");
						}
						System.out.println("");
					}
				}
			}
		}
	}
}
