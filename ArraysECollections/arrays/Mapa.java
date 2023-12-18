package ArraysECollections.arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
	public static void main(String[] args) {
		Map<Integer, String> usuarios = new HashMap<>();
		usuarios.put(20, "Roberto");
		usuarios.put(5, "Carlos");
		usuarios.put(1, "Carlos");
		usuarios.put(4, "Gabriel");
		
		System.out.println("Key set: " + usuarios.keySet());
		System.out.println("Values: " + usuarios.values());
		System.out.println("Entry Set: " + usuarios.entrySet());
		
		for(Integer idUsuarios: usuarios.keySet()) {
			System.out.println(usuarios.get(idUsuarios) + ": " + idUsuarios);
		}
		System.out.println("============");
		for(Entry<Integer, String> entry: usuarios.entrySet()) {
			System.out.println(entry.getValue() + ": " + entry.getKey());
		}
		
		System.out.println(usuarios.remove(1));
		System.out.println(usuarios.remove(1, "Ana"));
	}
}
