package exRelacEntreClasses;

import java.util.Random;

public class Luta {
	private CadastroLutador desafiado;
	private CadastroLutador desafiante;
	private int rounds;
	private boolean aprovada;
	
// métodos públicos
	public void marcarLuta(CadastroLutador l1, CadastroLutador l2) {
		if(l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
			this.aprovada = true;
			this.desafiado = l1;
			this.desafiante = l2;
		}else {
			this.aprovada = false;
			this.desafiado = null;
			this.desafiante = null;
		}
	}
	
	public void lutar() {
		if(this.aprovada) {
			System.out.println("### DESAFIADO ###");
			this.desafiado.apresentar();
			System.out.println("\n### DESAFIANTE ###");
			this.desafiante.apresentar();
			
			Random aleatorio = new Random();
			int vencedor = aleatorio.nextInt(3); // 0 1 2
			
			switch(vencedor) {
				case 0:		// empate
					System.out.println("\nEmpatou!");
					this.desafiado.empatarLuta();
					this.desafiante.empatarLuta();
					break;
				case 1:		// desafiado vence
					System.out.println("\nVitória do " + this.desafiado.getNome());
					this.desafiado.ganharLuta();
					this.desafiante.perderLuta();
					break;
				case 2:		// desafiante vence
					System.out.println("\nVitória do " + this.desafiante.getNome());
					this.desafiante.ganharLuta();
					this.desafiado.perderLuta();
					break;
			}
			
			
			//vencedor = 2;
		}else {
			System.out.println("Luta não pode acontecer!");
		}
	}
	
// Métodos especiais
	// getters and setters
	public void setDesafiado(CadastroLutador desafiado) {
		this.desafiado = desafiado;
	}
	public CadastroLutador getDesafiado() {
		return desafiado;
	}

	public CadastroLutador getDesafiante() {
		return desafiante;
	}

	public void setDesafiante(CadastroLutador desafiante) {
		this.desafiante = desafiante;
	}

	public int getRounds() {
		return rounds;
	}

	public void setRounds(int rounds) {
		this.rounds = rounds;
	}

	public boolean isAprovada() {
		return aprovada;
	}

	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}
	

}
