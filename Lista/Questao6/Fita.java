package Questao6;

public class Fita {
	private String titulo;
	private double preço;
	
	public double FitaLancamento(){
		return preço += (preço * 0.2); 
	}
	
	public double FitaInfantil(){		
		return preço -= (preço * 0.4);
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public double getPreço() {
		return preço;
	}

	public void setPreço(double preço) {
		this.preço = preço;
	}

}