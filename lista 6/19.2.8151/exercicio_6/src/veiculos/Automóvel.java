package veiculos;

public class Automóvel extends Veiculo {

	private float velocidade;
	private float litros;
	
	//getters e setters
	public float getVelocidade() {
		return velocidade;
	}
	
	public float getLitros() {
		return litros;
	}


	public void setLitros(float litros) {
		this.litros = litros;
	}


	//metodos exigidos classe pai
	@Override
	public float acelerar(float velocidade) {
		this.velocidade = velocidade;
		return velocidade;
	}

	@Override
	public void parar() {
		this.velocidade = 0;
	}
	
	//metodo da propria classe
	public void trocarOleo(float litros) {
		this.litros = litros;
	}

}
