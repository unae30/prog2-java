package principal;

public class Controlador {

	public static void main(String[] args) {
		
		Lampada l1 = new Lampada();
		Lampada l2 = new Lampada(39);

		l1.Acender();
		l1.Luminosidade(10);
		l1.Luminosidade(0);
		l1.Luminosidade(100);
		l1.Desligar();
		l1.Acender();
		l1.Acender();
		l1.Desligar();
		l1.Desligar();
		System.out.println(l1.éEconomica());
		l1.quantasVezesFoiLigada();
		System.out.println();
		System.out.println(l2.éEconomica());
		
		
		
	
	
	}

}
