package ArraysECollections.arrays;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>();
		fila.add("a");
		fila.add("b");
		fila.add("c");
		fila.add("d");
		fila.add("e");
		
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		fila.remove();
	}
}
