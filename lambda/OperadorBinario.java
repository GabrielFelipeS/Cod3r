package Lambda;

import java.util.function.BinaryOperator;

public class OperadorBinario {
	public static void main(String[] args) {
		BinaryOperator<Double> media = (n1, n2) -> (n1 + n2) / 2;
		
	}
}
