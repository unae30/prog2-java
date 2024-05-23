package exe5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {
		
		int x = 0;
		int y = 0;
		double r = 0;
		int aux = 0;
		do{
		try {
			Scanner teclado = new Scanner(System.in);
			aux = 0;
			System.out.println("Eu sei dividir!");
			System.out.println("Informe o primeiro valor: ");
			x = teclado.nextInt();
			System.out.println("Informe o segundo valor: ");
			y = teclado.nextInt();
			r = (x/y);
			}catch (InputMismatchException e) {
				System.out.println("ERRO: Entrada de dados inválida! "
						+ "O número tem de ser um inteiro!");
				aux=1;
			
			}catch (ArithmeticException e) {
				System.out.println("ERRO: O denominador não pode ser 0.");
				aux = 1;
			}catch(Exception e) {
				System.out.println("Erro inesperado!");
				aux = 1;
			}finally {
				if(aux == 1) {
					System.out.println("TENTE NOVAMENTE");
					System.out.println("---------------");
					System.out.println();
				}else {
					aux = 2;
				}
					
			}
		}while(aux != 2);
		
		System.out.println("O resultado da divisão é: " + r);
	}

}
