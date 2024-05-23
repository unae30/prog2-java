package exe10;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Calculator calculadora = new Calculator();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite: \r\n 1- para divis�o || 2 - para log10");
		String i = sc.nextLine();
		int aux = Integer.parseInt(i);
		
		switch(aux) {
			case 1: 
				try {
					System.out.println("Divis�o");
					System.out.println("Digite o primeiro numero: ");
					double numero1 = sc.nextDouble();
					System.out.println("Digite o segundo numero: ");
					double numero2 = sc.nextDouble();
					System.out.println("o resultado da divis�o �: " + calculadora.div(numero1, numero2));
		
				}catch(InvalidOperationException invalido) {
					System.out.println("O denominador precisa ser diferente de 0");
					Thread.dumpStack();
				}
				break;
			case 2:
				try {
					System.out.println("Log10");
					System.out.println("Digite o numero: ");
					double numero = sc.nextDouble();
					System.out.println("o resultado do Log de " + numero + " na base 10 �: " + calculadora.log10(numero));
				}catch(InvalidOperationException invalido2) {
					System.out.println("O logaritimando precisa ser maior que 0.");
					Thread.dumpStack();
				}
				break;
		}

	}

}