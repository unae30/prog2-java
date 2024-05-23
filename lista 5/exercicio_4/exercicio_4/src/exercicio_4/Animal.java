package exercicio_4;

public class Animal {
	private String nome;
	private String raca;
	private String caminhar;

	//construtor
	public Animal() {}
	
	public Animal(String nome) {
		this.nome = nome;
	}
	
	//getters e setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	public String getCaminhar() {
		return caminhar;
	}

	public void setCaminhar(String caminhar) {
		this.caminhar = caminhar;
	}
	
	//método caminhar
	
	public String caminha() {
		if(nome == null) {
			this.caminhar = "passos passos passos";
			System.out.println("Venha aqui");
			return caminhar;
		}
		else {
			this.caminhar = "passos passos passos";
			System.out.println("Venha aqui " + nome);
			return caminhar;
		}
	}
}
