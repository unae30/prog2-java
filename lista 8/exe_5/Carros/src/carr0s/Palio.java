package carr0s;

public class Palio extends CarroPopular{

	private String marca;
	
	protected Palio(String marca) {
		super("Pálio");
		this.marca = marca;
	}
	
	@Override
	public String toString() {
		return super.toString() + " - " + this.marca;
	}

}
