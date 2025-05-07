package application;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {

		Set<String> set = new HashSet<>();
		// não garante a ordem

		set.add("TV");
		set.add("Tablet");
		set.add("Notebook");

		System.out.println(set.contains("Notebook"));

		for (String p : set) {
			System.out.println(p);
		}
	}
}
