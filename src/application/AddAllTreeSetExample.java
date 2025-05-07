package application;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class AddAllTreeSetExample {

	public static void main(String[] args) {

		Set<Integer> a = new TreeSet<>(Arrays.asList(0, 2, 4, 5, 6, 8, 9, 10));
		Set<Integer> b = new TreeSet<>(Arrays.asList(5, 6, 7, 8, 10));

		// UNIÃO DOS CONJUNTOS SET
		Set<Integer> c = new TreeSet<>(a); // COPIA O SET A
		c.addAll(b); // ADICIONA O SET B
		System.out.println(c);

		// INTERSECÇÃO DOS CONJUNTOS SET
		Set<Integer> d = new TreeSet<>(a);
		d.retainAll(b); // VERIFICA QUAIS ELEMENTOS ESTÃO EM AMBOS OS CONJUNTOS
		System.out.println(d);

		// DIFERENÇA DOS CONJUNTOS SET
		Set<Integer> e = new TreeSet<>(a);
		e.removeAll(b); // REMOVE OS ELEMENTOS QUE ESTÃO EM AMBOS OS CONJUNTOS
		System.out.println(e);

	}

}
