package OrientacaoObjeto.ModificadoresDeVisibilidade.testeModif;

import OrientacaoObjeto.heranca.DesafioHeranca.Civic;
import OrientacaoObjeto.heranca.DesafioHeranca.Ferrari;

public class CarroExer {
	public static void main(String[] args) {
		Civic civic = new Civic();
		Ferrari ferrari = new Ferrari();
		
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		
		civic.acelerar();
		civic.acelerar();
		civic.acelerar();
		
		System.out.println(ferrari.velocidadeAtual);
		System.out.println(civic.velocidadeAtual);
		
		ferrari.frear();
		ferrari.frear();
		ferrari.frear();
		
		civic.frear();
		civic.frear();
		civic.frear();
		civic.frear();
		System.out.println(ferrari.velocidadeAtual);
		System.out.println(civic.velocidadeAtual);
	}
}
