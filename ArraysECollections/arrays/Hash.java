package ArraysECollections.arrays;

import java.util.HashSet;

public class Hash {
	public static void main(String[] args) {
		HashSet<Usuario> usuarios = new HashSet<>();
		usuarios.add(new Usuario("Carlos"));
		
		System.out.println(usuarios.contains(new Usuario("Carlos")));
	}
}
