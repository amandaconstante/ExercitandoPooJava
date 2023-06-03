package exRelacEntreClasses;

public class Principal {
	public static void main(String[] args) {
	CadastroLutador lutador[] = new CadastroLutador[6];
	
	lutador[0] = new CadastroLutador("Pretty Boy", "França", 31, 1.75f, 68.9f, 11, 2, 1);
	lutador[1] = new CadastroLutador("PuttyScript", "Brasil", 29, 1.68f, 57.8f, 14, 2, 3);
	
	
/*	lutador[0].apresentar();
	lutador[0].status();
	
	lutador[1].apresentar();
	lutador[1].status();
*/
	
	Luta UEC01 = new Luta();
	UEC01.marcarLuta(lutador[0], lutador[1]);
	UEC01.lutar();
	
	lutador[0].status();
	lutador[1].status();
	
	}
}
