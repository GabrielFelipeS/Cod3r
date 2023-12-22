package OrientacaoObjeto.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	String nome;
	List<Compra> compras = new ArrayList<>();
	
	void adicionarCompra(Compra compra) {
		compras.add(compra);
	}
	
	double totalGastoNaLoja() {
		double sum = 0;
		
		for(Compra compra: compras) {
			sum += compra.gastoTotal();
		}
		
		return sum;
	}
}
