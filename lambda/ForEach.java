package Lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ForEach {
	public static void main(String[] args) {
		List<String> aprovados = Arrays
				.asList("Ana", "Bia", "Lia", "Gui");
		
		System.out.println("Forma tradicional...");
		for(String nome: aprovados) {
			System.out.println(nome);
		}

		// jeito 1
		aprovados.sort(new Teste());
		
		// jeito 2
		Comparator<String> comp = new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
			}

		};
		
		// jeito 3
		aprovados.sort( (x,y) -> {
			return x.compareTo(y);
		} );
		// jeito 4
		aprovados.sort( (x,y) -> y.compareTo(x));
		
		System.out.println("\nLambda #01...");
		aprovados.forEach((nome) -> {System.out.println(nome);});
		
		System.out.println("\nLambda #02...");
		aprovados.forEach((nome) -> System.out.println(nome));
		
		System.out.println("\nMethod Reference...");
		aprovados.forEach(System.out::println);
		
		System.out.println("\nLambda #03...");
		aprovados.forEach(nome -> meuImprimir(nome));
		
		System.out.println("\nMy method Reference...");
		aprovados.forEach(ForEach::meuImprimir);
	}
	
	static void meuImprimir(String nome) {
		System.out.println("Oi! Meu nome é " + nome);
	}
}
