package application;

import java.util.Set;
import java.util.TreeSet;

import entities.Product;

public class TreeSetExample {

	public static void main(String[] args) {

		Set<Product> set = new TreeSet<>();
		// ordena os dados em ordem alfabética

		set.add(new Product("Tv", 900.0));
		set.add(new Product("Tablet", 1200.0));
		set.add(new Product("Notebook", 400.0));

		for (Product p : set) {
			System.out.println(p);
		}
	}

}
