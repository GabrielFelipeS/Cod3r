package ModuloDeClassesEMetodos.Desafio_Conversao;

import java.math.BigDecimal;
import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe o primeiro salário: ");
		String salarioString1 = entrada.nextLine().replace(',', '.');
		
		System.out.print("Informe o segundo salário: ");
		String salarioString2 = entrada.nextLine().replace(',', '.');

		System.out.print("Informe o terceiro salário: ");
		String salarioString3 = entrada.nextLine().replace(',', '.');
		
		Double salario1 = Double.parseDouble(salarioString1);
		Double salario2 = Double.parseDouble(salarioString2);
		Double salario3 = Double.parseDouble(salarioString3);
		
		
		BigDecimal media = BigDecimal.valueOf((salario1 + salario2 + salario3)/3);
		System.out.printf("A média de salarios é %.2f", media);
		
		entrada.close();
	}
}
