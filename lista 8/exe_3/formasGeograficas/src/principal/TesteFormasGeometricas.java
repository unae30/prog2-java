package principal;

import formasGeometricas.FormasGeometricas;
import formasGeometricas.IFormasGeometricas;

public class TesteFormasGeometricas {

	public static void main(String[] args) {

		FormasGeometricas formas = new FormasGeometricas("tri�ngulo");
		IFormasGeometricas iformas = formas.getForma();
		iformas.desenhar();
		
	}

}
