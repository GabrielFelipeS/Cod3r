package ModuloDeClassesEMetodos.classe;

public class ValorVsReferencia {
	public static void main(String[] args) {
		double a = 2;
		double b = a;
		a++;
		b--;
		
		System.out.println(a + " " + b);
		
		Data d1 = new Data(1, 6, 2022);
		Data d2 = d1;
		d2.ano = 2023;
		
		voltarDataParaValorPadrao(d1.clone());
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		
		int c = 5;
		alterarPrimitivo(c);
		System.out.println(c);
	}
	
	static void voltarDataParaValorPadrao(Data d) {
		d.dia = 1;
		d.mes = 1;
		d.ano = 1979;
	}
	
	static void alterarPrimitivo(int a) {
		a++;
	}
}
