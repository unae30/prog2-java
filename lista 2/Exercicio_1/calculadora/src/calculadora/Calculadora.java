package calculadora;

public class Calculadora {
	
	private double num1;
	private double num2;
	private double soma;
	private double subtracao;
	private double divisao;
	private double multiplicacao;
	

		public void setNum1(double num1) {
			this.num1 = num1;
		}
		
		public double getNum1() {
			return this.num1;
		}
		
		public void setNum2(double num2) {
			this.num2 = num2;
		}
		
		public double getNum2() {
			return this.num2;
		}
		
		public void setSoma(double soma) {
			this.soma = soma;
		}		
		
		public double getSoma() {
			return this.soma;
		}
		
		public void setSubtracao(double subtracao) {
			this.subtracao = subtracao;
		}		
		
		public double getSubtracao() {
			return this.subtracao;
		}
		
		public void setMultiplicacao(double multiplicacao) {
			this.multiplicacao = multiplicacao;
		}		
		
		public double getMultiplicacao() {
			return this.multiplicacao;
		}
		
		public void setDivisao(double divisao) {
			this.divisao = divisao;
		}		
		
		public double getDivisao() {
			return this.divisao;
		}
		
		//opera��es
		
		public double Soma(double num1, double num2) {
			soma = num1 + num2;
			return this.soma;
		}
		
		public double Subtracao(double num1, double num2) {
			subtracao = num1 - num2;
			return this.subtracao;
		}
		
		public double Multiplicacao(double num1, double num2) {
			multiplicacao = num1 * num2;
			return this.multiplicacao;
		}
		
		public double Divisao(double num1, double num2) {
			divisao = num1 / num2;
			return this.divisao;
			}
			
		}
