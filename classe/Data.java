package classe;

public class Data implements Cloneable{
	int dia;
	int mes;
	int ano;
	
	public Data() {}
	
	public Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	public void teste() {
		Data teste =  this.clone();
		teste.printarData();
	}
	
	public void printarData() {
		System.out.print(this.toString());
	}
		
	public String obterDataFormatada() {
		return String.format("%02d/%02d/%04d", dia, mes, ano);
	}
	
	@Override
	public Data clone() {
		return new Data(dia, mes, ano);
	}
	
	@Override
	public String toString() {
		return obterDataFormatada();
	}
}