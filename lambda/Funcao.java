package Lambda;

import java.util.function.Function;

public class Funcao {
	public static void main(String[] args) {
		Function<Integer, String> parOuImpar = 
				numero -> numero % 2 == 0 ? "Par" : "Impar";
		System.out.println(parOuImpar.apply(32));
		
		Function<String, String> oReultadoE = 
				valor -> "O resultado é " + valor;
		
		System.out.println(oReultadoE.apply("32"));
		
		String resultadoFinal = parOuImpar.apply(32);
		System.out.println(oReultadoE.apply(resultadoFinal));
		
		System.out.println(oReultadoE.apply(parOuImpar.apply(32)));
		
		resultadoFinal = parOuImpar.andThen(oReultadoE).apply(32);
		System.out.println(resultadoFinal);
		
		Function<String, String> empolgado = valor -> valor + "!!!";
		resultadoFinal = parOuImpar.andThen(oReultadoE).andThen(empolgado).apply(32);
		System.out.println(resultadoFinal);
	}
}
