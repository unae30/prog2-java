package carr0s;

public class Siena extends CarroSedan{

	private String marca;
	
	protected Siena(String marca) {
		super("Siena");
		this.marca = marca;
	}
	
	@Override
	public String toString() {
		return super.toString() + " - " + this.marca;
	}

}
