package OrientacaoObjeto.ModificadoresDeVisibilidade.CasaB;

import OrientacaoObjeto.ModificadoresDeVisibilidade.CasaA.Ana;

public class Julia {
	 void testeDeAcesso() {
		Ana sogra = new Ana();
		
		//System.out.println(sogra.segredo);
		//System.out.println(sogra.facoDentroDeCasa);
		//System.out.println(sogra.formaDeFalar);
		System.out.println(sogra.todosSabem);
	}
}
