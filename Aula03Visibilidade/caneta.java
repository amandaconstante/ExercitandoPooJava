package Aula03Visibilidade;

public class caneta { 
		public String modelo;
		public String cor;
		private float ponta;
		protected int carga;
		private boolean tampada;
		
		public void status() {
			System.out.println("Modelo: " + this.modelo);
			System.out.println("Cor: " + this.cor);
			System.out.println("está tampada? "+ this.tampada);
			System.out.println("ponta: " + this.ponta);
			System.out.println("Carga: " + this.carga);
		}
		
		public void rabiscar() { // métodos
			if(this.tampada == true) {
				System.out.println("ERRO!Não posso rabiscar, a caneta está tampada.");
			}else {
				System.out.println("Rabiscando...");
			}
		}
		
		public void tampar() {
			this.tampada = true;
		}
		
		public void destampar() {
			this.tampada = false;
		}

	}
