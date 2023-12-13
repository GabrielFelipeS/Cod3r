package ModuloDeClassesEMetodos.classe;

public class AreaCirc {
	double raio;
	
	AreaCirc(double raioInicial) {
		raio = raioInicial;
	}
	
	double area() {
		return Math.PI * Math.pow(raio, 2);
	}
}
