package application;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {

		Set<String> set = new TreeSet<>();
		// ordena os dados em ordem alfabética

		set.add("Tv");
		set.add("Tablet");
		set.add("Notebook");

		System.out.println(set.contains("Notebook"));

		for (String p : set) {
			System.out.println(p);
		}
	}

}
