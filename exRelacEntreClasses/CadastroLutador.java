package exRelacEntreClasses;

public class CadastroLutador implements DadosLutador{
//Atributos
	private String nome;
	private String nacionalidade;
	private int idade;
	private float altura;
	private float peso;
	private String categoria;
	private int vitorias, derrotas, empates;

	
	public void apresentar() {
		System.out.println("---------------------------");
		System.out.println("Lutador: "+ this.getNome()+
						   "\nOrigem: " + this.getNacionalidade()+"\n"+
						   this.getIdade() + " anos\n" +
						   this.getAltura() + "m"+
						   "\nPesando: " + this.getPeso() + "kg"+
						   "\nGanhou: " + this.getVitorias()+
						   "\nPerdeu: " + this.getDerrotas()+
						   "\nEmpatou: " + this.getEmpates());
	}

	public void status() {
		System.out.println("---------------------------");
		System.out.println(this.getNome()+" é um peso "+
						   this.getCategoria()+ "\n"+
						   this.getVitorias()+" vitorias"+"\n"+
						   this.getDerrotas()+" derrotas"+"\n"+
						   this.getEmpates()+" empates");
	}
	
	public void ganharLuta() {
		this.setVitorias(this.getVitorias() + 1);
	}
	
	
	public void perderLuta() {
		this.setDerrotas(this.getDerrotas() + 1);
	}
	
	
	public void empatarLuta() {
		this.setEmpates(this.getEmpates() + 1);
	}
	
		//Métodos especiais
//Método construtor
	public CadastroLutador(String nome, 
						   String nacionalidade, 
						   int idade, 
						   float altura, 
						   float peso, 
						   int vitorias, 
						   int derrotas, 
						   int empates) {
		this.setNome(nome);
		this.nacionalidade = nacionalidade;
		this.setIdade(idade);
		this.altura = altura;
		this.setPeso(peso);
		this.vitorias = vitorias;
		this.derrotas = derrotas;
		this.empates = empates;
	}
	
//Métodos getters and setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
		this.setCategoria();
	}
	
	public String getCategoria() {
		return categoria;
	}
	private void setCategoria() {
		if(peso < 52.2) {
			this.categoria = "Invalido";
		}else if(peso <= 70.3) {
			this.categoria = "Leve";
		}else if (peso <= 83.9) {
			this.categoria = "Médio";
		}else if(peso <= 120.2) {
			this.categoria = "Pesado";
		}else {
			this.categoria = "Invalido";
		}
	}
	
	public int getVitorias() {
		return vitorias;
	}
	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}
	
	public int getDerrotas() {
		return derrotas;
	}
	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}
	
	public int getEmpates() {
		return empates;
	}
	public void setEmpates(int empates) {
		this.empates = empates;
	}
	
}
