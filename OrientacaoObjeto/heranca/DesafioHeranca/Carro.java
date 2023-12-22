package OrientacaoObjeto.heranca.DesafioHeranca;

public class Carro {
	final int VELOCIDADE_MAXIMA;
	int velocidadeAtual;
	
	protected int acelerar = 5;
	protected int desacelerar = 5;
	
	Carro(int valocidadeMaxima) {
		VELOCIDADE_MAXIMA = valocidadeMaxima;
	}
	
	void acelerar() {
		if(velocidadeAtual + 5 > VELOCIDADE_MAXIMA) {
			velocidadeAtual = VELOCIDADE_MAXIMA;
		} else {
			velocidadeAtual += acelerar;
		}
	}
	
	void frear() {
		if(velocidadeAtual > 0) {
			velocidadeAtual -= desacelerar;
		}
	}
	
	@Override
	public String toString() {
		return String.format("Velocidade atual é %dKm/h", velocidadeAtual);
	}
}
