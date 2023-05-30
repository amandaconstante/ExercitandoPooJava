package encapsulamento;

public class main {

	public static void main(String[] args) {
		ControleRemoto c = new ControleRemoto();
		c.ligar();
		c.maisVolume();
		c.play();
		c.abrirMenu();
		c.fecharMenu();
		c.desligar();
		c.menosVolume();
	}
}
