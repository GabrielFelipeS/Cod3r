package Lambda;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {
	public static void main(String[] args) {
		BinaryOperator<Double> soma = (x, y) -> x + y; 
		System.out.println(soma.apply(5.0, 7.0));
	}
}
