package Lambda;

import java.util.function.Function;
import java.util.function.UnaryOperator;

import ModuloDeClassesEMetodos.classe.Produto;

public class Desafio {
	public static void main(String[] args) {
		Produto produto = new Produto("IPad", 3235.89, 0.13);
		/*
		 * 1. A partir do produto calcular o preco real (com desconto)
		 * 2. Imposto Municipal: >= 2500 (8,5%) / < 2500 (Isento)
		 * 3. Frete: >= 3000 (100) / < 3000 (50) 
		 * 4. Arredondar: Deixar duas cases decimais
		 * 5. Formatar: R$1234,56
		 */
		/*
		// 1. A partir do produto calcular o preco real (com desconto)
		UnaryOperator<Produto> precoReal = p -> {
			p.setPreco(p.getPreco() * (1 - p.getDesconto()));
			return p;
		};
		
		// 2. Imposto Municipal: >= 2500 (8,5%) / < 2500 (Isento)
		UnaryOperator<Produto> impostoMunicipal = p -> {
			double novoValor = p.getPreco() >= 2500.0? p.getPreco() * 1.085 : p.getPreco();
			p.setPreco(novoValor);
			return p;
		};
		
		// 3. Frete: >= 3000 (100) / < 3000 (50) 
		UnaryOperator<Produto> frete = p -> {
			double novoValor = p.getPreco() >= 3000.0? p.getPreco() + 100 : p.getPreco() + 50;
			p.setPreco(novoValor);
			return p;
		};
		
		// 4. Arredondar: Deixar duas cases decimais
		Function<Produto, Double> arredondarValorProduto = p -> Math.round(p.getPreco() * 100.0)/100.0;
		
		
		// 5. Formatar: R$1234,56
		Function<Double, String> formatar = d -> ("R$" + d).replace(".", ",");
		*/
		
		// 1. A partir do produto calcular o preco real (com desconto)
		Function<Produto, Double> precoReal = p -> 
			p.getPreco() * (1 - p.getDesconto());
		
		// 2. Imposto Municipal: >= 2500 (8,5%) / < 2500 (Isento)
		UnaryOperator<Double> impostoMunicipal = p -> 
			p >= 2500.0? p * 1.085 : p;
		
		// 3. Frete: >= 3000 (100) / < 3000 (50) 
		UnaryOperator<Double> frete = p -> 
			p >= 3000.0? p + 100 : p + 50;
		
		// 4. Arredondar: Deixar duas cases decimais
		UnaryOperator<Double> arredondarValorProduto = p -> Math.round(p * 100.0)/100.0;
		
		// 5. Formatar: R$1234,56
		Function<Double, String> formatar = d -> ("R$" + d).replace(".", ",");
	
		String preco = precoReal
				.andThen(impostoMunicipal)
				.andThen(frete)
				.andThen(arredondarValorProduto)
				.andThen(formatar)
				.andThen(Produto::teste)
				.apply(produto);
		
		System.out.println("O preço final é " + preco);
	}
}
