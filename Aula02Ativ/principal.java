package Aula02Ativ;

public class principal {

	public static void main(String[] args) {
		
		Notebook notebook01 = new Notebook();
		
		notebook01.marca = "Vaio";
		notebook01.sistema = "i5";
		notebook01.geracaoSistema = 7;
		notebook01.ram = 8;
		notebook01.hd = "HDD";
		notebook01.peso = 2f;
		notebook01.cor = "cinza";
		notebook01.funciona = false;
		
		notebook01.desligar();
		notebook01.status();
		
		notebook01.usar();
	}

}
