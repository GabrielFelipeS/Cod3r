package Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import ModuloDeClassesEMetodos.classe.Produto;



public class Consumidor {
	public static void main(String[] args) {
		Consumer<Produto> imprimir = 
				p -> System.out.println(p.getNome() + "!!!");
				
		Produto p1 = new Produto("Caneta", 12.34);
		Produto p2 = new Produto("Notebook", 12.34);
		Produto p3 = new Produto("Caderno", 12.34);
		Produto p4 = new Produto("Lapis", 12.34);
		Produto p5 = new Produto("Boracha", 12.34);
		
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);
		produtos.forEach(imprimir);
	}
}
