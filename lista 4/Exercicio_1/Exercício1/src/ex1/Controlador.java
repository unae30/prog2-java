package ex1;

public class Controlador {

	public static void main(String[] args) {
		
		Pessoa a1 = new Pessoa ("Albert Einstein","14/3/1879");
		Pessoa a2 = new Pessoa ("Isaac Newton", "4/1/1643");
		
		Universidade u1 = new Universidade ("Princeton (Nova Jersey - EUA)");
		Universidade u2 = new Universidade ("Cambridge (Inglaterra)");
		
		a1.setUniversidade(u1);
		a2.setUniversidade(u2);
		
		System.out.println(a1.getNome() + " trabalho como professor de física em " + a1.getUniversidade().getNome());
		System.out.println(a2.getNome() + " trabalho como professor de matemática em " + a2.getUniversidade().getNome());
	}
}
