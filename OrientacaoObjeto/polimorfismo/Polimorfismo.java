package OrientacaoObjeto.polimorfismo;

public class Polimorfismo {
	public static void main(String[] args) {
		Arroz a = new Arroz(1.00);
		Feijao f = new Feijao(1.00);
		Sorvete s = new Sorvete(1.00);
		Pessoa p = new Pessoa(90);
		p.comer(a);
		p.comer(f);
		p.comer(s);
		System.out.println(p.getPeso());
		
		a.teste();
	}
}
