package Questao6;

public class Fita {
	private String titulo;
	private double pre�o;
	
	public double FitaLancamento(){
		return pre�o += (pre�o * 0.2); 
	}
	
	public double FitaInfantil(){		
		return pre�o -= (pre�o * 0.4);
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public double getPre�o() {
		return pre�o;
	}

	public void setPre�o(double pre�o) {
		this.pre�o = pre�o;
	}

}