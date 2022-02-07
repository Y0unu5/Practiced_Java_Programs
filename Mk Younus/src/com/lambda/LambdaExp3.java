package com.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class Product1 {
	int id;
	String name;
	float price;

	public Product1(int id, String name, float price) {

		this.id = id;
		this.name = name;
		this.price = price;
	}

}

public class LambdaExp3 {

	public static void main(String[] args) {
		List<Product1> list = new ArrayList<Product1>();
		list.add(new Product1(1, "Samsung A5", 11000f));
		list.add(new Product1(3, "Iphone 6S", 61000f));
		list.add(new Product1(2, "Nokia", 10000f));
		list.add(new Product1(4, "Xperia", 12000f));
		list.add(new Product1(9, "Realme", 17000f));
		list.add(new Product1(6, "Oppo", 18000f));
		list.add(new Product1(8, "Park", 11000f));

		Stream<Product1> filtered_data = list.stream().filter(p -> p.price > 11000);
		filtered_data.forEach(product -> System.out.println(product.name + " " + product.price));

	}

}
