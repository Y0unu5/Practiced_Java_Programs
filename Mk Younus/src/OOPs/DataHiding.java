package OOPs;

class RecTangle {
	private int length;
	private int breadth;

	public int getLength() {
		return length;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setLength(int l) {
		length = l;
	}

	public void setBreadth(int b) {
		breadth = b;
	}

	public int area() {
		return length * breadth;
	}

	public int perimeter() {
		return 2 * (length + breadth);
	}

	boolean isSquare() {
		if (length == breadth)
			return true;
		else
			return false;
	}

}

public class DataHiding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RecTangle r1 = new RecTangle();
		r1.setLength(10);
		r1.setBreadth(5);
		RecTangle r2 = new RecTangle();
		r2.setBreadth(20);
		r2.setLength(20);

		System.out.println("Area of r1 is:" + r1.area());
		System.out.println("Perimeter of r1 is:" + r1.perimeter());
		System.out.println(r1.isSquare());
		System.out.println(r1.getLength());
		System.out.println(r1.getBreadth());
		

		System.out.println("Area of r2 is:" + r2.area());
		System.out.println("Perimeter of r2 is:" + r2.perimeter());
		System.out.println(r2.isSquare());

	}

}
