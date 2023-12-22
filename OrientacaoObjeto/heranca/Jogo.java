package OrientacaoObjeto.heranca;

public class Jogo {
	public static void main(String[] args) {
		Jogador j1 = new Monstro();
		j1.andar(Direcao.NORTE);
		j1.andar(Direcao.NORTE);
		j1.andar(Direcao.NORTE);
		j1.andar(Direcao.NORTE);
		
		
		j1.x = 10;
		j1.y = 10;
		
		Heroi j2 = new Heroi(10, 11);
		j2.x = 10;
		j2.y = 11;
		
		System.out.println(j1.vida);
		System.out.println(j2.vida);
		
		j1.atacar(j2);
		
		System.out.println(j1.vida);
		System.out.println(j2.vida);
	}
}
