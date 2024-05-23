package tp01;
import java.util.Scanner;

public class Exercicio_02 {
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantas posições terá o vetor?");
		int n = sc.nextInt();
		
		int [] array = new int[n];
		
		System.out.println("Digite os " + n + " valores do vetor:");
		receberValores(array);
		
		for(int u = 0; u < array.length; u++) {
			if (numerosPrimos(array[u])) {
				System.out.println(array[u] + " é primo e está na posição " + u + " do vetor");
			}
		}
		
		
		sc.close();	
		
	}
	
	public static void receberValores(int [] vet) {
		Scanner sc1 = new Scanner(System.in);
		for(int i = 0; i<vet.length; i++) {
			vet[i] = sc1.nextInt();	
		}
		sc1.close();		
	}
	
	public static boolean numerosPrimos(int num) {
		
	        for (int j = 2; j < num; j++) {
	            if (num % j == 0)
	                return false;   
	        }
	        return true;		
	}
	
	

}
