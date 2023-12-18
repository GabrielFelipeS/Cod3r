package ArraysECollections.arrays;

import java.util.ArrayList;
import java.util.List;

public class Lista {
	public static void main(String[] args) {

		List<Usuario> list = new ArrayList<>();
		
		list.add(new Usuario("Carlos"));
		list.add(new Usuario("Lia"));
		list.add(new Usuario("Bia"));
		list.add(new Usuario("Ana"));
		
		//System.out.println(list.get(3).nome);
		
		//list.remove(0);
		//list.remove(new Usuario("Ana"));
		
		for(Usuario u: list) {
			System.out.println(u.nome);
		}
	}
}
