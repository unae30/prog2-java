package ex2;

public class Pessoa {
	
	private Departamento departamento;
	private String nome;
	private Universidade universidade;
	private String dataNascimento;
	
	public Pessoa(String nome, String dataDeNascimento) {
		this.nome = nome;
		this.dataNascimento = dataDeNascimento;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Universidade getUniversidade() {
		return universidade;
	}

	public void setUniversidade(Universidade universidade) {
		this.universidade = universidade;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}	

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
}
