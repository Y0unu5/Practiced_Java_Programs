package Methods;

public class MethodOverloding {
	static int area(int x, int y) {
		return x * y;
	}

	static double area(double r) {
		return Math.PI * r * r;
	}

	static double area(double l, double b, double h) {
		return (l + b) / 2 + h;
	}

	public static void main(String[] args) {
		System.out.println(area(20,10,5));
	}

}
