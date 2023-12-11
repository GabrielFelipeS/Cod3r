package Cod3r.classe;

public class DesafioClasseData implements Cloneable{
	int dia;
	int mes;
	int ano;
	
	public void teste() {
		try {
			DesafioClasseData teste =  (DesafioClasseData) this.clone();
			teste.printarData();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void printarData() {
		System.out.print(this.toString());
	}
		
	public String obterDataFormatada() {
		return String.format("%02d/%02d/%04d", dia, mes, ano);
	}
	
	@Override
	public String toString() {
		return obterDataFormatada();
	}
}
