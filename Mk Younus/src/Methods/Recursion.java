package Methods;

public class Recursion {
	static void fun(int n) {
		if (n > 0)
			fun(n - 1);
		System.out.println(n);

	}

	static int factorial(int m) {
		if (m == 0 || m == 1)
			return 1;
		else
			return m * factorial(m - 1);
	}

	static int factorial_iterative(int m) {
		if (m == 0 | m == 1) {
			return 1;
		} else {
			int product = 1;
			for (int i = 1; i <= m; i++) {
				product *= i;
			}
			return product;
		}
	}

	public static void main(String[] args) {
		// fun(6);
		int x = 7;
		System.out.println("The value of factorial x is: " + factorial(x));
		System.out.println("The value of factorial x is: " + factorial_iterative(x));
	}

}
