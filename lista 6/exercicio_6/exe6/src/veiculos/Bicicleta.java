package veiculos;

public class Bicicleta extends Veiculo {
	
	private float velocidade;
	
	//get
	public float getVelocidade() {
		return velocidade;
	}

	//metodos abstratos
	@Override
	public float acelerar(float velocidade) {
		this.velocidade = velocidade;
		return velocidade;
	}

	@Override
	public void parar() {
		this.velocidade = 0;	
	}
	


}
