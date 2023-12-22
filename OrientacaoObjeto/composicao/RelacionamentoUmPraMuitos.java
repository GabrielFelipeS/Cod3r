package OrientacaoObjeto.composicao;

public class RelacionamentoUmPraMuitos {
	public static void main(String[] args) {
		String a = "Otimo ";
		StringBuilder b = new StringBuilder();
		a += "exemplo";
		System.out.println(a);
		Compra c = new Compra();
		c.cliente = "João Predo";
		c.itens.add(new Item("Caneta", 20,  7.45));
		c.itens.add(new Item("Borracha", 12,  3.89));
		c.itens.add(new Item("Caneta", 3,  18.79));
		
		System.out.println(c.itens.size());
		System.out.println(c.obterValorTotal());
	}
}
