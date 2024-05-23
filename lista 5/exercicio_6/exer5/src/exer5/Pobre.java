package exer5;

public class Pobre extends Pessoa {
	
	//construtores
	public Pobre() {};
	
	public Pobre(String nome, int idade) {
		super(nome, idade);
	}
	
	//metodo trabalha	
	public void trabalha() {
		if(super.getNome() != null) {
			System.out.println(super.getNome() + " trabalha para se sustentar");
		}
		else {
			System.out.println(" O pobre trabalha para se sustentar");
		}
		
	}
}
