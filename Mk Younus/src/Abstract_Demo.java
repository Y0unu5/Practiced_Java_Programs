abstract class Shape {
	abstract public double perimeter();

	abstract public double area();
}

class Circle extends Shape {
	double radius;

	@Override
	public double perimeter() {

		return 2 * Math.PI * radius;
	}

	@Override
	public double area() {

		return Math.PI * radius * radius;
	}

}

class Rectangle extends Shape {
	double length, breadth;

	@Override
	public double perimeter() {
		return 2 * (length + breadth);
	}

	@Override
	public double area() {

		return length * breadth;
	}

}

public class Abstract_Demo {

	public static void main(String[] args) {
		Circle c = new Circle();
		c.radius = 5.5;
		System.out.println("Perimeter is:" + c.perimeter() + "\n" + "Area is:" + c.area());

		Rectangle r = new Rectangle();
		r.breadth = 12.66;
		r.length = 10.65;

		// Shape s = r; // Polymorphism
		System.out.println("Perimeter is:" + r.perimeter() + "\n" + "Area is:" + r.area());
		// System.out.println(s.area() + " " + s.perimeter());
	}

}
