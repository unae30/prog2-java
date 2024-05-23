package brasil;

public class PresidenteDoBrasil {
	
	private static PresidenteDoBrasil instance;
	private String nome;
	private String partidoPolitico;
	
	private PresidenteDoBrasil() {}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setPartidoPolitico(String partidoPolitico) {
		this.partidoPolitico = partidoPolitico;
	}
	
	public static PresidenteDoBrasil GetInstance() {
		if(instance == null)
			instance = new PresidenteDoBrasil();
		return instance;
	}
	
	@Override
	public String toString() {
		return "-PRESIDÊNCIA NO BRASIL- \r\n" + "Nome: " + this.nome + "\r\n" + "Partido Político: " + this.partidoPolitico;
	}
	
}
