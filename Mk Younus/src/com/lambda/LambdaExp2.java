package com.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Product {
	int id;
	String name;
	float price;

	public Product(int id, String name, float price) {

		this.id = id;
		this.name = name;
		this.price = price;
	}

}

public class LambdaExp2 {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<Product>();
		Product p2 = new Product(2, "Dell", 3000f);
		Product p3 = new Product(3, "ell", 30000f);

		list.add(new Product(1, "HP Laptop", 25000f));
		list.add(p2);
		list.add(p3);
		System.out.println("Sorting on the basis of name:");

		Collections.sort(list, (p1, p4) -> {
			return p1.name.compareTo(p4.name);
		});
		for (Product p : list) {
			System.out.println(p.id + " " + p.name + " " + p.price);
		}
	}

}
