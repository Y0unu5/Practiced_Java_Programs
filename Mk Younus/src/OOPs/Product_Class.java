package OOPs;

class Product {
	private String item_no;
	private String name;
	private double price;
	private int qty;

	public String getItemNo() {
		return item_no;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;

	}

	public int getQuantity() {
		return qty;
	}

	public Product(String item_no) {

		this.item_no = item_no;
	}

	public Product(String item_no, String name) {

		this.item_no = item_no;
		this.name = name;
	}

	public Product(String item_no, String name, double price, int qty) {

		this.item_no = item_no;
		this.name = name;
		setPrice(price);
		setQuantity(qty);
	}

	public void setPrice(double p) {
		this.price = price;
	}

	public void setQuantity(int q) {
		this.qty = qty;
	}

	@Override
	public String toString() {
		return "Product [item_no=" + item_no + ", name=" + name + ", price=" + price + ", qty=" + qty + "]";
	}

}

public class Product_Class {
	public static void main(String[] args) {
		Product p1 = new Product("102Bf6");
		Product p2 = new Product("120GF3", "Pigeon");
		Product p3 = new Product("1023A4", "Tesla", 234.444d, 2);
		System.out.println(p1.getItemNo());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		System.out.println(p3.getPrice());
		System.out.println(p2.getQuantity());
	}
}
