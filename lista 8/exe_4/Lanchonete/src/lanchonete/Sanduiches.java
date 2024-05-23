package lanchonete;

public class Sanduiches {
	
	private ISanduiches sanduiche;
	
	public Sanduiches(String nome) {
		this.sanduiche = FabricaDeSanduiches.CriarSanduiches(nome);
	}
	
	public ISanduiches getSanduiche() {
		return this.sanduiche;
	}
}
