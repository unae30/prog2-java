package tp01;

import java.util.Scanner;

public class Exercicio_04 {
	public static void main (String[] args) {
		
		Scanner sc1 = new Scanner(System.in);		
		System.out.println("Quantos alunos serão cadastrados? ");
		int quantidadeDeAlunos = sc1.nextInt();
		
		int matriz[][] = new int [quantidadeDeAlunos][4];
		
		preenchaMatriz(matriz, quantidadeDeAlunos);
		imprimaValores(matriz);
		
		System.out.println("Digite o código do curso referente ao sorteio: ");
		int curso = sc1.nextInt();
		
		auxiliarPremiacao(matriz, curso);
		
		sc1.close();
 	}
	
	
	public static void preenchaMatriz(int matriz[][], int q) {
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < q; i++) {
			System.out.println("Preencha a matricula do aluno: ");
			int matricula = sc.nextInt();
			matriz[i][0] = matricula;
			
			System.out.println("Preencha o sexo do aluno (CODIGO 0 para meninas e CODIGO 1 para menino: ");
			int sexo = sc.nextInt();
			matriz[i][1] = sexo;
			
			System.out.println("Preencha o código do curso do aluno: ");
			int codigoDoCurso = sc.nextInt();
			matriz[i][2] = codigoDoCurso;
			
			System.out.println("Preencha o CR do aluno: ");
			int cr = sc.nextInt();
			matriz[i][3]= cr;			
					
		}
		
		sc.close();
	}
	
	
	public static void imprimaValores(int matriz[][]) {
		for(int linha = 0; linha < matriz.length; linha++) {
			for(int coluna = 0; coluna < matriz[linha].length; coluna++) {
				System.out.println(matriz[linha][coluna] + "- ");
			}
				System.out.println();
		}
	}
	
	public static void auxiliarPremiacao(int matriz[][], int codigoDoCurso) {
		
		int maiorCR = 0;
		int matriculaDaAluna = 1;
		for (int linha = 0; linha < matriz.length; linha++) {
			if(matriz[linha][1] == 0 && matriz[linha][2] == codigoDoCurso && matriz[linha][3] > maiorCR) {
				matriculaDaAluna = matriz[linha][0];
				maiorCR = matriz[linha][3];
				}			
		}
		
		System.out.println("A aluna premiada pelo melhor desempenho é: " + matriculaDaAluna);
	}
	
	
}
