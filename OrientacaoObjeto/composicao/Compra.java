package OrientacaoObjeto.composicao;

import java.util.ArrayList;
import java.util.List;

public class Compra {
	String cliente;
	List<Item> itens = new ArrayList<>();
	
	double obterValorTotal() {
		double total = 0;
		
		for(Item item: itens) {
			total += item.quantidade * item.preco;
		}
		return total;
	}
	
	void adicionarItem(String nome, int quantidade, double preco) {
		adicionarItem(new Item(nome, quantidade, preco));
	}	
	
	void adicionarItem(Item item) {
		this.itens.add(item);
		item.compra = this;
	}
	

}
