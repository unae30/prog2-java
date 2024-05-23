package carr0s;

public class CarroSedan {
	
	private String nome;
	
	protected CarroSedan(String nome) {
		this.nome = nome;
	}
	
	public String getTipo() {
		return this.nome;
	}
	
	@Override
	public String toString() {
		return "CARRO SEDAN: " + this.nome;
	}
}
