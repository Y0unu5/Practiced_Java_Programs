package Methods;

public class MethodsDemo2 {
	static int GCD(int x, int y) {
		while (x != y) {
			if (x > y)
				x -= y;
			else
				y -= x;
		}
		return x;
	}

	public static void main(String[] args) {
		System.out.println(GCD(50, 5));
	}

}
