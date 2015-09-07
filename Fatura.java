package Questao1;

public class Fatura {
	private String numero;
	private String descriçao;
	private int qnt;
	private double preço;
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getDescriçao() {
		return descriçao;
	}
	public void setDescriçao(String descriçao) {
		this.descriçao = descriçao;
	}
	public int getItem() {
		return qnt;
	}
	public void setItem(int item) {
		this.qnt = item;
	}
	public double getPreço() {
		return preço;
	}
	public void setPreço(double preço) {
		if(!(preço >= 0))
			this.preço = preço;
		this.preço = 0.0;				
	}
	public double getValorFatura(int qnt,double preço){
		double fatura=0;
		fatura = qnt*preço;
		if (!(fatura >=0)){
			fatura = 0;
		}			
		return fatura;
	}
}