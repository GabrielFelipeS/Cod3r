package OrientacaoObjeto.Interface;

public class Ferrari extends Carro implements Esportivo, Luxo{
	private boolean ligarTurbo;
	private boolean ligarAr;
	
	public Ferrari() {
		this(315);
	}
	
	Ferrari(int velocidadeMaxima) {
		super(velocidadeMaxima);
		setAcelerar(15);
		setDesacelerar(15);
	}
	
	@Override
	public void ligarTurbo() {
		ligarTurbo = true;
	}
	
	@Override
	public void desligarTurbo() {
		ligarTurbo = false;
	}

	@Override
	public void ligarAr() {
		ligarAr = true;
	}

	@Override
	public void desligarAr() {
		ligarAr = false;
	}
	
	@Override
	int getAcelerar() {
		if(ligarTurbo && !ligarAr) {
			return 35;
		} else if(ligarTurbo && ligarAr) {
			return 30;
		}if(!ligarTurbo && !ligarAr) {
			return 20;
		} else {
			return 15;			
		}
	}
}
