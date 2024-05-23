package brasil;

public class Main {

	public static void main(String[] args) {
		
		PresidenteDoBrasil meuPresida = PresidenteDoBrasil.GetInstance();
		meuPresida.setNome("Luiz Inácio Lula da Silva");
		meuPresida.setPartidoPolitico("Partido dos Trabalhadores");
		
		System.out.println(meuPresida);
		
	}

}
