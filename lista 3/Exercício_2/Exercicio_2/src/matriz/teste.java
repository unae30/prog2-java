package matriz;

public class teste {

	public static void main(String[] args) {
		
		Matriz m1 = new Matriz();
		
		m1.informeNumColunas();
		m1.informeNumLinhas();
		System.out.println();
		m1.preencheMatriz();
		System.out.println();
		m1.imprimeMatriz();
		System.out.println();
//		m1.editaMatriz();
//		System.out.println();
//		m1.imprimeMatriz();
		System.out.println();
		m1.matrizTransposta();
		System.out.println();
		m1.imprimeMatriz();

	}

}
