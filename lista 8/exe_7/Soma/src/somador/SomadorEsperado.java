package somador;

public class SomadorEsperado implements ISomadorEsperado{

	@Override
	public int somavetor(int[] vetor) {
		int resultado = 0;
		for(int i = 0; i < 10; i++) {
			resultado = resultado + vetor[i];
		}
		return resultado;
	}
}