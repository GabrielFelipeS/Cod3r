package OrientacaoObjeto.heranca.DesafioHeranca;

public class Ferrari extends Carro{
	
	public Ferrari() {
		this(315);
	}
	
	Ferrari(int velocidadeMaxima) {
		super(velocidadeMaxima);
		this.acelerar = 15;
		this.desacelerar = 15;
	}
}
