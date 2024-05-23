package exer5;

public class VIP extends Ingresso{
	private float adicional;
	
	//getters e setters
	public float getAdicional() {
		return adicional;
	}

	public void setAdicional(float adicional) {
		this.adicional = adicional;
	}
	
	//metodo valor ingresso vip
	public float valorVIP() {
		float valorFinalVIP = super.getValor() + adicional;
		return valorFinalVIP;
	}
	
	public void Imprime() {
		System.out.println("Selecionado pelo usuário: Ingresso VIP");
	}
	
	
}
