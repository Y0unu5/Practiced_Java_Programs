
public class IfStatement {

	public static void main(String[] args) {

		int x = 5;
		if (x >= 0) {
			System.out.println("Positive");
		} else {
			System.out.println("Negative");
		}

		int a = 5, b = 8, c = 14;
		if (a < b && a > c) {
			System.out.println(a);
		} else if (b > c) {
			System.out.println(b);
		} else {
			System.out.println(c);
		}
	}

}
