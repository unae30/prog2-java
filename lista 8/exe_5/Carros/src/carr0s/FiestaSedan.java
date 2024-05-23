package carr0s;

public class FiestaSedan extends CarroSedan{

	private String marca;
	
	protected FiestaSedan(String marca) {
		super("Fiesta Sedan");
		this.marca = marca;
	}
	
	@Override
	public String toString() {
		return super.toString() + " - " + this.marca;
	}

}
