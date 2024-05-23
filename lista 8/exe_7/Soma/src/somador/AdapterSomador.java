package somador;


public class AdapterSomador extends SomadorExistente {
	
	private SomadorEsperado somador;
	
	public AdapterSomador(SomadorEsperado somador) {
		this.somador = somador;
	}
	
		public int somavetor(int [] vetor) {
			int resultado = this.somador.somavetor(vetor);
			return resultado;
		}
	}

