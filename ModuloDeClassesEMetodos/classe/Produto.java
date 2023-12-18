package ModuloDeClassesEMetodos.classe;

public class Produto {
	String nome;
	double preco;
	static double desconto;
	
	Produto() {}
	
	Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	double precoComDesconto() {
		return this.preco * (1 - this.desconto);
	}
}
