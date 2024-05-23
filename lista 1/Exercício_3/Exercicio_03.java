package tp01;

public class Exercicio_03 {
	public static void main(String[] args) {
		int resultado = F(12);
		System.out.println(resultado);
	}
	
	public static int F(int n) {
		
		if (n == 1) {
			return 1;
		}
		
		if (n == 2) {
			return 2;
		}
		
		int calculo = 2 * F(n -1) + 3 * F(n-2);
		return calculo;
	}
}
