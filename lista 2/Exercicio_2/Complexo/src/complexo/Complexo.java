package complexo;

public class Complexo {
		
		private double num1;
		private double num2;
		
		public Complexo(double num1,double num2) {
			this.num1 = num1;
			this.num2 = num2;
		}
		
		public Complexo() {
			this.num1 = 0.0;
			this.num2 = 0.0;
		}
		
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
			
			//operações
			
			public Complexo Soma(Complexo x, Complexo y) {
				return new Complexo(x.num1 + y.num1 , x.num2 + y.num2);
			}
			
			public Complexo Subtracao(Complexo x, Complexo y) {
				return new Complexo(x.num1 - y.num1, x.num2 - y.num2);
			}
			
			public Complexo Multiplicacao(Complexo x, Complexo y) {
				return new Complexo(x.num1 * y.num1, x.num2 * y.num2);
			}
			
			public Complexo Divisao(Complexo x, Complexo y) {
				return new Complexo(x.num1 / y.num1, x.num2 / y.num2);
			}
			
			public String toString() {
				return "(" + num1 + "," + num2 + ")";
				
	}


}