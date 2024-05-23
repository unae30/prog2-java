package calculadora;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Calculadora calcula = new Calculadora();
		
		Scanner sc = new Scanner(System.in);

		System.out.println("-----CALCULADORA-----");
		System.out.println("Digite o 1� n�mero:");
		double numero1= sc.nextDouble();
		System.out.println("Digite o 2� numero:");
		double numero2= sc.nextDouble();
		
		System.out.println("Agora escolha qual opera��o deseja realizar com o numeral referente:");
		System.out.println("[1] - PARA SOMAR");
		System.out.println("[2] - PARA SUBTRAIR");
		System.out.println("[3] - PARA MULTIPLICAR");
		System.out.println("[4] - PARA DIVDIR");
		
		int digito = sc.nextInt();
		sc.close();
		switch(digito) {
		
		case 1 :
			System.out.println(numero1 + " + " + numero2 + ": " + calcula.Soma(numero1, numero2));
			break;
			
		case 2: 
			System.out.println(numero1 + " - " + numero2 + ": " + calcula.Subtracao(numero1, numero2));
			break;
			
		case 3: 
			System.out.println(numero1 + " * " + numero2 + ":" + calcula.Multiplicacao(numero1, numero2));
			break;
			
		case 4: 
			System.out.println(numero1 + " / " + numero2 +": " + calcula.Divisao(numero1, numero2));
			break;
		
		}
		
	
	}

}
