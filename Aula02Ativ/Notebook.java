package Aula02Ativ;

public class Notebook {
	String marca;
	String sistema;
	int geracaoSistema;
	int ram;
	String hd;
	float peso;
	String cor;
	boolean funciona;
	
	
	void status() {
		System.out.println("Marca: " + this.marca + 
						   "\nSistema: " + this.sistema + 
						   "\nGeração: " + this.geracaoSistema + 
						   "\nHD: " + this.hd + 
						   "\nPeso: " + this.peso + "kg"+
						   "\nCor: " + this.cor);
	}
	
	void ligar() {
		this.funciona = true;
	}
	
	void desligar() {
		this.funciona = false;
	}
	
	void usar() {
		if(this.funciona == true) {
			System.out.println("Estou usando...");
		}else {
			System.out.println("ERRO! o notebook está desligado");
		}
	}
	
}
