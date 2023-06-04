package aula04getterSetterConstrutor;

public class Caneta {
	public String modelo;
	private float ponta;
	private String cor;
	private boolean tampada;
	
	
	public Caneta(String modelo, float ponta, String cor) {
		this.modelo = modelo;
		this.ponta = ponta;
		this.cor = cor;
	}
	
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public float getPonta() {
		return ponta;
	}
	public void setPonta(float ponta) {
		this.ponta = ponta;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}


	
	public void status() {
		System.out.println("Sobre a caneta: \n" +
							"\nModelo: " + this.modelo +
							"\nPonta: " + this.ponta +
							"\ncor: " + this.cor + 
							"\nTampada: ",this.tampada);
	}
	

}
