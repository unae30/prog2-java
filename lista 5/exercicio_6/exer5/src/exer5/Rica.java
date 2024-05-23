package exer5;

public class Rica extends Pessoa {
	
	private double dinheiro;
	
	//construtor
	public Rica() {};
	
	public Rica (String nome, int idade, double dinheiro) {
		super(nome, idade);
		this.dinheiro = dinheiro;
	}
	
	//getters e setters
	public double getDinheiro() {
		return dinheiro;
	}

	public void setDinheiro(double dinheiro) {
		this.dinheiro = dinheiro;
	}
	
	//metodo fazCompras	
	public void fazCompras() {
		if(super.getNome() != null && dinheiro != 0) {
			System.out.println(super.getNome() + " faz compras porque tem " + dinheiro + " reais");
		}
		else {
			System.out.println("Rico faz compras porque tem dinheiro");
		}
	}
	
	
}
