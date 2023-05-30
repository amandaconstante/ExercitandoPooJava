package Aula02;

public class caneta {
	// atributos: 
	String modelo;
	String cor;
	float ponta;
	int carga;
	boolean tampada;
	
	void status() {
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Cor: " + this.cor);
		System.out.println("está tampada? "+ this.tampada);
		System.out.println("ponta: " + this.ponta);
		System.out.println("Carga: " + this.carga);
	}
	
	void rabiscar() { // métodos
		if(this.tampada == true) {
			System.out.println("ERRO!Não posso rabiscar, a caneta está tampada.");
		}else {
			System.out.println("Rabiscando...");
		}
	}
	
	void tampar() {
		this.tampada = true;
	}
	
	void destampar() {
		this.tampada = false;
	}

}
