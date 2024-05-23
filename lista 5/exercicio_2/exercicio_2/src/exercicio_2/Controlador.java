package exercicio_2;

public class Controlador {

	public static void main(String[] args) {

		Lampada l1 = new Lampada();
		Lampada l2 = new Lampada(40);
		
		LampadaFluorescente lf1 = new LampadaFluorescente(13);
		LampadaFluorescente lf2 = new LampadaFluorescente(120, 13);
		
		lf2.Acender();
		lf2.Desligar();
		lf2.Desligar();
		
		System.out.println(lf2.getComprimento());
		System.out.println(lf2.getWatts());
		

	}

}
