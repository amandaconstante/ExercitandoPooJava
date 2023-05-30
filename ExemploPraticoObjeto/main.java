package ExemploPraticoObjeto;

public class main {

	public static void main(String[] args) {
		
		ContaBanco p1 = new ContaBanco();
		p1.setNumConta(11112);
		p1.setDono("Jubileu");
		p1.abrirConta("CC");
		p1.depositar(1150);
		p1.sacar(150);
		p1.pagarMensal();

		
		ContaBanco p2 = new ContaBanco();
		p2.setNumConta(11113);
		p2.setDono("Creuza");
		p2.abrirConta("CP");
		p2.pagarMensal();
		p2.depositar(300);
		p2.sacar(200);
		
		
		p1.estadoAtual();
		p2.estadoAtual();

	}

}
