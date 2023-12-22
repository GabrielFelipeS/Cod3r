package OrientacaoObjeto.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {
	List<Item> itens = new ArrayList<>();
	
	
	void adicionarItem(String nome, double preco, int quantidade) {
		Produto produto = new Produto(nome, preco);
		adicionarItem(new Item(produto, quantidade));
	}
	
	void adicionarItem(Produto produto, int quantidade) {
		adicionarItem(new Item(produto, quantidade));
	}
	
	void adicionarItem(Item item) {
		itens.add(item);
	}
	
	double gastoTotal() {
		double sum = 0;
		for(Item item: itens) {
			sum += item.totalPago();
		}
		return sum;
	}
}
