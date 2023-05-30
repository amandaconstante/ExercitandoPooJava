package ExemploPraticoObjeto;

public class ContaBanco {
// Atributos
	public int numConta;
	protected String tipo;
	private String dono;
	private float saldo;
	private boolean status;
	
// métodos personalizados
	
	public void estadoAtual() {
		System.out.println("---------------------------------");
		System.out.println("\nConta: " + this.getNumConta()
						 + "\nTipo: " + this.getTipo()
						 + "\nDono: " + this.getDono()
						 + "\nSaldo: " + this.getSaldo()
						 + "\nStatus: " + this.isStatus());
	}
	
	public void abrirConta(String tipoConta) {
		this.setTipo(tipoConta); // ou: tipo = tipoConta
		this.setStatus(true);
		System.out.println("\nConta aberta com sucesso!");
		
		if(tipoConta == "CC") {
			this.setSaldo(50);
		}else if(tipoConta == "CP") {
			this.setSaldo(150);
		}
	}
	
	public void fecharConta() {
		if(this.getSaldo() > 0) {
			System.out.println("Conta não pode ser fechada, está com saldo");
		}else if(this.getSaldo() < 0) {
			System.out.println("Não pode ser fechada, Conta em débito");
		}else {
			this.setStatus(false); // ou: status = false;
			System.out.println("Conta fechada com sucesso!");
		}
	}
	
	public void depositar(float deposito) {
		if(this.isStatus()){
		  //this.saldo += deposito; //alternativa alterando diretamente pelos atributos. 
			this.setSaldo(this.getSaldo() + deposito);
			System.out.println("Déposito realizado na conta  de " + this.getDono());
		}else {
			System.out.println("Impossível depositar em conta fechada.");
		}
	}
	
	public void sacar(float valorSaque) {
		if(this.isStatus()) {
			if(this.getSaldo() > valorSaque) {
				this.setSaldo(this.getSaldo() - valorSaque);
				System.out.println("Saque realizado na conta de " + this.getDono());
			}else {
				System.out.println("Saldo insuficiente para saque");
			}
		}else {
			System.out.println("impossível sacar de conta fechada");
		}
	}
// as varáveis dentro do parâmetros são variáveis locais
	public void pagarMensal() {
		float valor = 0;
		
		if(this.getTipo() == "CC") {
			valor = 12;
		}else if(this.getTipo() == "CP") {
			valor = 20;
		}
		
		if(this.isStatus()) {
			if(this.getSaldo() > valor) {
				this.setSaldo(this.getSaldo() - valor);
			}else {
				System.out.println("Saldo insuficiente");
			}
		}else {
			System.out.println("Impossível pagar");
		}
	}
	
// método construtor (método especial)
	
	public ContaBanco() {
		this.setSaldo(0);
		this.setStatus(false);
	}

	
// métodos getters and setters (métodos especiais)

	// o parâmetro numConta é apenas um parâmetro, não é um atributo e poderia ter outro nome qualquer
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	public int getNumConta() {
		return numConta;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getTipo() {
		return tipo;
	}
	
	public void setDono(String dono) {
		this.dono = dono;
	}
	public String getDono() {
		return dono;
	}
	
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	public float getSaldo() {
		return saldo;
	}
	
	public void setStatus(boolean status) {
		this.status = status;
	}
	public boolean isStatus() {
		return status;
	}	
}
