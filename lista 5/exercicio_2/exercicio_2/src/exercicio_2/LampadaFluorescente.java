package exercicio_2;

public class LampadaFluorescente extends Lampada {
	
	private float comprimento;

	//construtor
	public LampadaFluorescente(int watts, float comprimento) {
		super(watts);
		this.comprimento = comprimento;
	}
	
	public LampadaFluorescente(float comprimento) {
		super();
		this.comprimento = comprimento;
	}
	
	//getters e setters
	public float getComprimento() {
		return comprimento;
	}

	public void setComprimento(float comprimento) {
		this.comprimento = comprimento;
	}
	
	
}
