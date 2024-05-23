package carr0s;

public class Fiesta extends CarroPopular {

	private String marca;
	
	protected Fiesta(String marca) {
		super("Fiesta");
		this.marca = marca;
	}
	
	@Override
	public String toString() {
		return super.toString() + " - " + this.marca;
	}
}
