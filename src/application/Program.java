package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {

	public static void main(String[] args) {

		List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
		List<Double> myDoubles = Arrays.asList(3.14, 6.28);
		List<Object> myObjs = new ArrayList<Object>();

		copy(myInts, myObjs);
		copy(myDoubles, myObjs);

		printList(myObjs);
	}

	// a lista source (origem) é um caso de covariância, permitindo o acesso aos
	// elementos.
	// a lista destiny (destino) é um caso de contravariância, permitindo a adição
	// de elementos.
	private static void copy(List<? extends Number> source, List<? super Number> destiny) {
		for (Number number : source) {
			destiny.add(number);
		}
	}

	public static void printList(List<?> list) {
		for (Object obj : list) {
			System.out.println(obj + " ");
		}
		System.out.println();
	}

}
