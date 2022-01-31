package exceptionhandling;

class NegativeDimensionException extends Exception {
	public String toString() {
		return "Dimensions of Rectangle cannot be nagative";
	}
}

public class ThrowThrowsDemo {
	static int area(int l, int b) throws Exception {
		if (l < 0 || b < 0)
			throw new NegativeDimensionException();
		return l * b;
	}

	static void meth1() throws Exception {
		System.out.println("area is:" + area(10,-5));
	}

	public static void main(String[] args) {
		try {
			meth1();
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("Hello Excepion");
	}

}
