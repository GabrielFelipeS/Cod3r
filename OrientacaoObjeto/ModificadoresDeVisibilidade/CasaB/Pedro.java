package OrientacaoObjeto.ModificadoresDeVisibilidade.CasaB;

import OrientacaoObjeto.ModificadoresDeVisibilidade.CasaA.Ana;

public class Pedro extends Ana {
	
	
	void testeDeAcesso() {
		Ana mae = new Ana();
		
		//System.out.println(mae.segredo);
		//System.out.println(mae.facoDentroDeCasa);
		//System.out.println(mae.formaDeFalar);
		System.out.println(mae.todosSabem);
		
		
		//System.out.println(segredo);
		//System.out.println(facoDentroDeCasa);
		System.out.println(formaDeFalar);
		System.out.println(todosSabem);
	}
}
