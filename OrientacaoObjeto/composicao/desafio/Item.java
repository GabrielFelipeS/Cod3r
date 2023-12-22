package OrientacaoObjeto.composicao.desafio;

public class Item {
	Produto produto;
	int quantidade;
	
	Item(Produto produto, int quantidade) {
		this.produto = produto;
		this.quantidade = quantidade;
	}
	
	double totalPago() {
		return produto.getPreco() * quantidade;
	}
}
