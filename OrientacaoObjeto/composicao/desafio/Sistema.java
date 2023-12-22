package OrientacaoObjeto.composicao.desafio;

public class Sistema {
	public static void main(String[] args) {
		Compra compra = new Compra();
		Produto produto = new Produto("Computador", 1000.0);
		
		compra.adicionarItem(new Item(produto, 5));
		compra.adicionarItem(new Item(produto, 5));
		compra.adicionarItem("Caderno", 10.00, 10);
		compra.adicionarItem(new Item(new Produto("Computador", 1000), 5));
		
		Compra compra2 = new Compra();
		Produto produto2 = new Produto("Computador", 1000);
		
		compra2.adicionarItem(new Item(produto2, 5));
		compra2.adicionarItem(new Item(produto2, 5));
		compra2.adicionarItem("Caderno", 10.00, 10);
		compra2.adicionarItem(new Item(new Produto("Computador", 4000), 5));
		
		
		Cliente cliente = new Cliente();
		cliente.adicionarCompra(compra);
		cliente.adicionarCompra(compra2);
		 
		System.out.println("Total valor gasto foi de: " + cliente.totalGastoNaLoja());
		System.out.println("Total valor gasto foi de: " + compra.gastoTotal());
		System.out.println("Total valor gasto foi de: " + compra2.gastoTotal());
	}
}
