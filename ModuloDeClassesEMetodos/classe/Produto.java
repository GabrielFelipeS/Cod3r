package ModuloDeClassesEMetodos.classe;

public class Produto {
	String nome;
	double preco;
	static double desconto;
	
	Produto() {}
	
	public Produto(String nome, double preco, double desconto) {
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
	}
	
	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	public String getNome() {
		return nome;
	}
	
	double precoComDesconto() {
		return this.preco * (1 - this.desconto);
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public static double getDesconto() {
		return desconto;
	}

	public static void setDesconto(double desconto) {
		Produto.desconto = desconto;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public static String teste(String t) {
		return t;
	}
	
}
