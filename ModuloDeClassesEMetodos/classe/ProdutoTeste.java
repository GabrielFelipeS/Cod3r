package ModuloDeClassesEMetodos.classe;

public class ProdutoTeste {
	public static void main(String[] args) {
		Produto produto = new Produto();
		produto.nome = "Abacate";
		Produto.desconto = 0.1;
		produto.preco = 200;
		System.out.printf("O nome do produto é %s ele possui o preço %f e com desconto de %f fica %f", produto.nome,  produto.preco,  produto.desconto, produto.precoComDesconto());
	}
}
