package exe8;

import java.util.InputMismatchException;

public class Divisao {
	
	private int num1;
	private int num2;
	 
	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public double resultado() throws Exception{
		
		if(this.num1 == 0) {
			Exception e = new ArithmeticException("Erro Inesperado!");
			throw e;
		}
			try {
				double r = (this.num1/this.num2);
				return r;
			}catch (ArithmeticException a) {
				System.out.println("ERRO: O denominador é zero!");
				Thread.dumpStack();
				return 0;
			}	
	}
	

}
