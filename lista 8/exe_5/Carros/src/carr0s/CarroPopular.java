package carr0s;

public class CarroPopular {
	
	private String nome;
	
	protected CarroPopular(String nome) {
		this.nome = nome;
	}
	
	public String getTipo() {
		return this.nome;
	}
	
	@Override
	public String toString() {
		return "CARRO POPULAR: " + this.nome;
	}
}
