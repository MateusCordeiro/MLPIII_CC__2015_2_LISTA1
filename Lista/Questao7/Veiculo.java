package Questao7;

public class Veiculo {
	private String placa;
	private String marca;
	private String modelo;
	private int ano;
	private double valorKmRodado;
	private double KmInicial;
	private double KmFinal;
	private double ValorLoca��o;	
	
	public double Loca�ao() {
		return this.ValorLoca��o = (this.KmFinal - this.KmInicial)* this.valorKmRodado;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public double getValorKmRodado() {
		return valorKmRodado;
	}
	public void setValorKmRodado(double valorKmRodado) {
		this.valorKmRodado = valorKmRodado;
	}
	public double getKmInicial() {
		return KmInicial;
	}
	public void setKmInicial(double kmInicial) {
		KmInicial = kmInicial;
	}
	public double getKmFinal() {
		return KmFinal;
	}
	public void setKmFinal(double kmFinal) {
		KmFinal = kmFinal;
	}
	public double getValorLoca��o() {
		return ValorLoca��o;
	}
	public void setValorLoca��o(double valorLoca��o) {
		ValorLoca��o = valorLoca��o;
	}
}