package encapsulamento;

public class ControleRemoto implements Controlador{
//Attributes
	private int volume;
	private boolean ligado;
	private boolean tocando;
	
	
	public void ligar() {
		this.setLigado(true);
		
	}

	public void desligar() {
		this.setLigado(false);
		
	}
	public void abrirMenu() {
		System.out.println("-------- MENU --------");
		System.out.println("Está ligado: " + this.isLigado());
		System.out.print(this.getVolume());
		
		for(int i = 0; i <= this.getVolume(); i += 10) {
			System.out.print("|");
		}
		System.out.println("");
	}
	
	public void fecharMenu() {
		System.out.println("Fechando menu...");
	}
	
	public void maisVolume() {
		if(this.isLigado()) {
			this.setVolume(this.getVolume() + 1);
		}
	}
	public void menosVolume() {
		if(this.isLigado()){
			this.setVolume(this.getVolume() - 1);
		} else {
			System.out.println("Impossível diminuir volume");
		}
	}
	public void ligarMudo() {
		if(this.isLigado() && (this.getVolume() > 0)) {
			this.setVolume(0);
		}
	}
	public void desligarMudo() {
		if(this.isLigado() && this.getVolume() == 0) {
			this.setVolume(50);
		}
	}
	
	public void play() {
		if(this.isLigado() && !this.isTocando()) {
			this.setTocando(true);
		}
	}
	
	public void pause() {
		if(this.isLigado() && this.isTocando()){
			this.setTocando(false);
		}
	}
	
	
//métodos especiais
	// método construtor
	public ControleRemoto() {
		this.volume = 50;
		this.ligado = false;
		this.tocando = false;
	}
	// métodos getters and setters
	private int getVolume() {
		return volume;
	}
	private void setVolume(int volume) {
		this.volume = volume;
	}
	private boolean isLigado() {
		return ligado;
	}
	private void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
	private boolean isTocando() {
		return tocando;
	}
	private void setTocando(boolean tocando) {
		this.tocando = tocando;
	}
}
