package somador;

public class TesteAdapterSomador {

	public static void main(String[] args) {
		
		
		
		int [] vetor = new int[] {1,2,3,4,5,6,7,8,9,10};
		SomadorEsperado somador = new SomadorEsperado();		
		AdapterSomador somador1 = new AdapterSomador(somador);
		
		
		System.out.println(somador1.somavetor(vetor));
		
		

	}

}
