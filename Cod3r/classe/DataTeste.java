package Cod3r.classe;

public class DataTeste {
	public static void main(String[] args) {
		DesafioClasseData data = new DesafioClasseData();
		data.dia = 14;
		data.mes = 04;
		data.ano = 2003;
		data.teste();
		
		System.out.printf("\n%s\n", data.toString());
		data.printarData();
	}
}
