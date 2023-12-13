package ModuloDeClassesEMetodos.classe;

public class Produto {
	String nome;
	double preco;
	static double desconto;
	
	double precoComDesconto() {
		return this.preco * (1 - this.desconto);
	}
}
