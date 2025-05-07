package application;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {

	public static void main(String[] args) {

		Set<String> set = new LinkedHashSet<>();
		// mantém a ordem em que os elementos foram inseridos

		set.add("TV");
		set.add("Tablet");
		set.add("Notebook");
		set.add("Smartphone");
		set.add("Console");
		set.add("Smartwatch");
		set.add("Câmera");
		set.add("Impressora");
		set.add("Monitor");
		set.add("Caixa de som");

		set.remove("Monitor");
		set.removeIf(x -> x.length() >= 8); // remove todo o elemento x que a quantidade de letras for maior que 8
		set.removeIf(x -> x.charAt(0) == 'S'); // remove todo o elemento x que a primeira letra for T

		for (String p : set) {
			System.out.println(p);
		}
	}

}
