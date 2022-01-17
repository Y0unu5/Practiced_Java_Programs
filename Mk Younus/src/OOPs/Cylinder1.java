package OOPs;

class Cylinder2 {
	private int radius;
	private int hieght;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int r) {
		radius = r;
	}

	public int getHieght() {
		return hieght;
	}

	public void setHieght(int h) {
		hieght = h;
	}

	public double lidArea() {
		return Math.PI * radius * radius;
	}

	public double surfaceArea() {
		return 2 * lidArea() * circumference() * hieght;
	}

	public double circumference() {
		return 2 * Math.PI * radius;
	}

	public double volume() {
		return lidArea() * hieght;
	}

	public Cylinder2() {

	}

	public Cylinder2(int r) {
		setRadius(r);
		setHieght(1);
	}

	public Cylinder2(int r, int h) {
		setRadius(r);
		setHieght(h);

	}
}

public class Cylinder1 {

	public static void main(String[] args) {
		Cylinder2 c1 = new Cylinder2();
		Cylinder2 c2 = new Cylinder2(5);
		Cylinder2 c3 = new Cylinder2(5, 10);
		System.out.println(c1.surfaceArea());
		System.out.println(c2.surfaceArea());
		System.out.println(c3.surfaceArea());

	}

}
