class Outer {
	int x = 20;

	class Inner {
		int y = 10;

		public void innerDisplay() {
			System.out.println(x + " " + y);
		}
	}

	public void outerDisplay() {
		Inner i = new Inner();
		System.out.println(i.y);

	}
}

public class Nested_Inner {

	public static void main(String[] args) {
		Outer.Inner oi = new Outer().new Inner();
		oi.innerDisplay();

	}

}
