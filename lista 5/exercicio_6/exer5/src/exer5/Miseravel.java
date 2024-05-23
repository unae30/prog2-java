package exer5;

public class Miseravel extends Pessoa{
	
	//construtores
	public Miseravel() {};
	
	public Miseravel (String nome, int idade) {
		super(nome, idade);
	}
	
	//metodo Mendiga	
	public void mediga() {
		if(super.getNome() != null) {
			System.out.println(super.getNome() + " mendiga para comer");
		}
		else {
			System.out.println("O miserável mendiga para comer");
		}
	}
}
