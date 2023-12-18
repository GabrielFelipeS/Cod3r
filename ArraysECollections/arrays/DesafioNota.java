package ArraysECollections.arrays;

import java.util.Locale;
import java.util.Scanner;

public class DesafioNota {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		System.out.print("How many? ");
		int qtdNotas = scan.nextInt();
		double[] notas = new double[qtdNotas];
		
		for(int i = 0;i < notas.length; i++) {
			scan.nextLine();
			System.out.printf("Write note %d: ", i + 1);
			notas[i] = scan.nextDouble();
		}
		
		double sum = 0;
		for(double nota : notas) {
			sum += nota;
		}
		System.out.printf("This average note is %.2f! %n", sum/notas.length);
		scan.close();
	}
}
