package Arrays;

public class Array_2D {

	public static void main(String[] args) {
		int A[][] = new int[5][5];
		int B[][] = { { 1, 2, 3 }, { 3, 4, 6 }, { 5, 7, 9 } };
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < B[0].length; j++) {
				System.out.print(B[i][j] + "");

			}
			System.out.println("");

			// MUltiplication of 2 Matrices
			int A1[][] = { { 1, 3, 4 }, { 2, 3, 5 }, { 4, 6, 8 } };
			int B1[][] = { { 1, 2, 3 }, { 3, 4, 6 }, { 5, 7, 9 } };
			int C[][] = new int[3][3];
			for (int l = 0; l < 3; l++) {
				for (int m = 0; m < 3; m++) {
					C[l][m] = 0;
					for (int n = 0; n < 3; n++) {
						C[l][m] += A1[l][n] * B1[n][m];

					}
					System.out.print(C[l][m] + " ");
				}
				System.out.println("");

			}
		}
	}
}
