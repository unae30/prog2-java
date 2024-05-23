package tp01;

public class Exercicio_01 {
	public static void main (String[] args) {
		float [] vetor = {10, -55, -98, 20, 48, 90, -55, -1, 0};	
		int contador = negativos(vetor);
		System.out.println("A quantidade de numeros negativos do Array é: " + contador);
	}
	
	public static int negativos(float vet[]) {
		int contador = 0;
		
		for (float i: vet) {
			if (i<0) {
				contador++;
			}
		}
		return contador;
	}

}
