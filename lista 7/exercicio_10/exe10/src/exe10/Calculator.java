package exe10;

public class Calculator {
	
	public double div(double numero, double numero2) throws InvalidOperationException{
		if(numero2 == 0) {
			InvalidOperationException inv = new InvalidOperationException("Garanta que o denominador seja diferente de 0");
			throw inv;
		}
		return numero/numero2;
	}
	
	public double log10(double numero) throws InvalidOperationException{
		if(numero <= 0) {
			InvalidOperationException inv = new InvalidOperationException("Garanta que o logaritimando seja maior que 0");
			throw inv;
		}
	
		double log = numero * numero * numero * numero * numero * numero * numero * numero * numero * numero;

		return log;
	}
}