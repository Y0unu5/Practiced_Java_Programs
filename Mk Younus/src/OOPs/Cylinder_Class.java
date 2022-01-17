package OOPs;

class Cylinder {
	public double radius;
	public double hieght;

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

}

public class Cylinder_Class {

	public static void main(String[] args) {
		Cylinder c = new Cylinder();
		c.radius = 20.44d;
		c.hieght = 30.45d;

		System.out.println("Lid Area of c is:" + c.lidArea());
		System.out.println("surface Area of c is:" + c.surfaceArea());
		System.out.println("volume of c is:" + c.volume());
		Cylinder c1 = new Cylinder();
		c1.hieght = 23.5555d;
		c1.radius = 10.333d;
		System.out.println("Lid Area of c1 is:" + c1.lidArea());
		System.out.println("surface area of c1 is:" + c1.surfaceArea());
		System.out.println("volume of c1 is:" + c1.volume());

	}

}
