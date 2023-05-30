package Aula03Visibilidade;

public class principal {

	public static void main(String[] args) {
		caneta c1 = new caneta(); 
		
		c1.modelo =  "BIC cristal";
		c1.cor = "Azul";
	
		c1.status();
		c1.carga = 7;

	//	c1.tampar();
	}

}
