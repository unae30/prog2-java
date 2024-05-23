package complexo;

public class Main {
	public static void main(String[] args) {
		
		Complexo operador1 = new Complexo();
		
		Complexo a = new Complexo(2.0,3.0);
		Complexo a1 = new Complexo(7.0,0.0);
		
		Complexo b = new Complexo(5.0,4.0);
		Complexo b2 = new Complexo(2.0,2.0);
		
		Complexo c = new Complexo(3.0,0.0);
		Complexo c2 = new Complexo(4.0,2.0);
		
		
		System.out.println(operador1.Soma(a,a1));
		System.out.println(operador1.Multiplicacao(b,b2));
		System.out.println(operador1.Divisao(c, c2));

}

}
