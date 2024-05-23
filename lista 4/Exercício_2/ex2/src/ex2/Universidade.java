package ex2;

public class Universidade {
	
	private String nome;	 
	private Departamento [] departamento = new Departamento [50];
	
	public Universidade(String nome) {
		this.nome = nome;
	}
	
	public Departamento[] getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento[] departamento) {
		this.departamento = departamento;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
