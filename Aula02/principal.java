package Aula02;

public class principal {

	public static void main(String[] args) {
		caneta c1 = new caneta(); // objeto c1 criado a aprtir da classe caneta
		c1.modelo = "Bic";
		c1.cor = "Azul";
		c1.ponta = 0.5f;
		c1.tampada = false;
		c1.destampar();
		
		c1.status(); 
		c1.rabiscar();
// 2 instâncias: c1 e c2		
		caneta c2 = new caneta();
		c2.modelo = "Hostnet";
		c2.cor = "Preta";
		c2.ponta = 0.1f;
		c2.tampada = false;
		c2.tampar();
		
		c2.status();
		c2.rabiscar();
		
	}

}
