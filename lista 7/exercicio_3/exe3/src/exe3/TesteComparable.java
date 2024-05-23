package exe3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

//(a) Crie um ArrayList de inteiros e armazene 50 numeros aleatorios pertencentes a um 
//intervalo de [0,99]. Realize as seguintes operac~oes sobre a colec~ao de numeros:
//i) Obtenha o menor e o maior numero armazenado;
//ii) Conte quantas vezes o menor numero apareceu na colec~ao;
//iii) Ordene a lista em ordem crescente;
//iv) Utilize as
public class TesteComparable {

	public static void main(String[] args) {
		
		Random random = new Random();
		List<Integer> listaDeNumeros = new ArrayList<Integer>();
		
		for(int i = 0; i < 50; i++) {
			listaDeNumeros.add(random.nextInt(99));
		}
		
		imprimeLista(listaDeNumeros);
		
		System.out.println("Maior elemento do vetor: " + Collections.max(listaDeNumeros));
		System.out.println("Menor elemento do vetor: " + Collections.min(listaDeNumeros));
		System.out.println("O menor elemento do vetor aparece " + Collections.frequency(listaDeNumeros, Collections.min(listaDeNumeros)));
		
		Collections.sort(listaDeNumeros);
		imprimeLista(listaDeNumeros);

	}
	
	
	
	public static void imprimeLista(List <Integer> lista) {
		System.out.println("------------------------");
		for(int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
	}
}
