package exercicio_3;

public class Empresa {
	
	private String nome;
	private String endereco;
	private String cidade;
	private String estado;
	private String CEP;
	private String telefone;
	
	public Empresa () {}
	
	public Empresa(String nome, String endereco, String cidade, String estado, String CEP, String telefone){
		this.nome = nome;
		this.endereco = endereco;
		this.cidade = cidade;
		this.estado = estado;
		this.CEP = CEP;
		this.telefone = telefone;
	}
	
	//getters e setters
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public String getCEP() {
		return CEP;
	}
	public void setCEP(String cEP) {
		CEP = cEP;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	//método print
	
	public void imprimir() {
		System.out.println("Dados da empresa:");
		System.out.println("NOME: "+ nome);
		System.out.println("ENDEREÇO: " + endereco);
		System.out.println("CIDADE: " + cidade);
		System.out.println("ESTADO: " + estado);
		System.out.println("CEP: " + CEP);
		System.out.println("TELEFONE: " + telefone);
		
	}
	
	
}
