package ex2;

public class Departamento {
	
	private Universidade universidade;
	private String nome;
	
	public Departamento (Universidade universidade, String nome) {
		this.universidade = universidade;
		this.nome = nome;
	}
	
	public Universidade getUniversidade() {
		return universidade;
	}

	public void setUniversidade(Universidade universidade) {
		this.universidade = universidade;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	
}
