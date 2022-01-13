package Methods;

public class MethodDemo {
	static void change(int X[], int index, int value) {
		X[index] = value;
	}

	static boolean isPrime(int n) {
		for (int i = 2; i < n / 2; i++) {
			if (n % i == 0) // to find prime num
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		int A[] = { 2, 4, 6, 8, 10, 12 };
		change(A, 2, 15);

		for (int x : A) {
			System.out.println(x);
			System.out.println(isPrime(51));
		}

	}
}
