package Questao5;

public class Data {
	private int dia;
	private int mes;
	private int ano;
	
	public Data(){
		
	}
	
	public Data (int dia,int mes,int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;		
	}
	
	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String toString() {
		System.out.print(dia + "/" + mes + "/" + ano);
		if ((this.dia >=0 && this.dia <=31 || this.mes >=0 && this.mes <=12 || this.ano <=0))			
			System.out.println("(data invalida)");
		return "";		
	}	
}