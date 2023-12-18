package ArraysECollections.arrays;

import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
	public static void main(String[] args) {
		SortedSet<String> lista = new TreeSet<>();
		lista.add("Gabriel");
		lista.add("Ana");
		lista.add("Zé");
		
		for(String string: lista) {
			System.out.println(string);
		}
	}
}
