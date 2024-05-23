package matriz;
import java.util.Scanner;

public class Matriz{
	
	Scanner sc = new Scanner(System.in);
	
	private int numeroDeLinhas;
	private int numeroDeColunas;
	private int num[][];	
	
	public Matriz(){
		System.out.println("Digite o numero de linhas: ");
		this.numeroDeLinhas = sc.nextInt();
		System.out.println("Digite o numero de colunas: ");
		this.numeroDeColunas = sc.nextInt();
		this.num = new int[numeroDeLinhas][numeroDeColunas];
	}
	
	public int getNumeroDeLinhas() {
		return numeroDeLinhas;
	}

	public void setNumeroDeLinhas(int numeroDeLinhas) {
		this.numeroDeLinhas = numeroDeLinhas;
	}

	public int getNumeroDeColunas() {
		return numeroDeColunas;
	}

	public void setNumeroDeColunas(int numeroDeColunas) {
		this.numeroDeColunas = numeroDeColunas;
	}

	public int[][] getNum() {
		return num;
	}

	public void setNum(int[][] num) {
		this.num = num;
	}
	
	public void informeNumLinhas(){
		System.out.println("O numero de linhas da matriz � " + this.numeroDeLinhas);
	}
	
	public void informeNumColunas() {
		System.out.println("O numero de colunas da matriz � " + this.numeroDeColunas);
	}
	
	public void preencheMatriz() {
		for(int i=0; i< this.num.length ; i++) {
			for(int j=0; j< this.num[0].length ; j++) {
			System.out.println("Digite o numero da linha " + (i+1) + " da coluna " + (j+1));
			this.num[i][j] = sc.nextInt(); 
			}	
		}
	}
	
	public void editaMatriz() {
		System.out.println("EDITAR VALOR DA MATRIZ DE TAMANHO " + this.numeroDeLinhas + " x " + this.numeroDeColunas);
		System.out.println("Digite a posi��o da linha da matriz deseja alterar: ");
		int linha = sc.nextInt();
		System.out.println("Digite a posi��o da coluna da matriz deseja alterar: ");
		int coluna = sc.nextInt();
		System.out.println("Digite o novo valor: ");
		this.num[linha-1][coluna-1] = sc.nextInt();
	}
	
	public void matrizTransposta() {
		if(this.numeroDeLinhas==this.numeroDeColunas) {
			for(int i=0; i< this.num.length ; i++) {
				for(int j=0; j< this.num[i].length ; j++) {
					num[j][i] = num[i][j];
				}
			}
		}
		else {
			System.out.println("Matriz de tamanho inv�lido para transposta");
		}

	}
	
	public void imprimeMatriz() {
		for(int i = 0; i < this.num.length;i++) {
			for(int j = 0; j < this.num[i].length; j++) {
				System.out.print(this.num[i][j] + " ");
			}
			System.out.println();
		}
	}
}

