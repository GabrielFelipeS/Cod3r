package OrientacaoObjeto.Interface;

public class Carro {
	final int VELOCIDADE_MAXIMA;
	public int velocidadeAtual;
	
	private int acelerar = 5;
	private int desacelerar = 5;
	
	public Carro(int valocidadeMaxima) {
		VELOCIDADE_MAXIMA = valocidadeMaxima;
	}
	
	int getAcelerar() {
		return this.acelerar;
	}
	
	void setAcelerar(int acelerar) {
		this.acelerar = acelerar;
	}
	
	void setDesacelerar(int desacelerar) {
		this.desacelerar = desacelerar;
	}
	
	public void acelerar() {
		if(velocidadeAtual + getAcelerar() > VELOCIDADE_MAXIMA) {
			velocidadeAtual = VELOCIDADE_MAXIMA;
		} else {
			velocidadeAtual += getAcelerar();
		}
	}
	
	public void frear() {
		if(velocidadeAtual > 0) {
			velocidadeAtual -= desacelerar;
		}
	}
	

	@Override
	public String toString() {
		return String.format("Velocidade atual é %dKm/h", velocidadeAtual);
	}
}
