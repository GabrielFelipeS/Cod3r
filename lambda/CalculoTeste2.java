package Lambda;

public class CalculoTeste2 {
	public static void main(String[] args) {
		Calculo soma = (x, y) -> x + y; 
		
		System.out.println(soma.executar(10, 7));
		System.out.println(soma.legal());
		System.out.println(Calculo.muitoLegal());
	}
}
