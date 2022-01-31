package exceptionhandling;

public class nestedcatch {

	public static void main(String[] args) {
		int A[] = { 10, 20, 0, 30, 40 };
		int c = A[1] / A[0];
		System.out.println("Division  is:" + c);

		try {
			int d = A[1] / A[2];
			System.out.println("Division  is:" + d);
			try {
				System.out.println(A[10]);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Index is not valid");
			}

		} catch (ArithmeticException e) {
			System.out.println("Denominator should not be zero");

		}
	}

}
