package ex1;


public class teste {

	public static void main(String[] args) {
		
		Empregado e1 = new Empregado("Una�", 2000.00);
		
		e1.printInfo();
		
		System.out.println(e1.promo��o(0.6));
		
		e1.adicionaGratifica��o();
		
		e1.printInfo();

	}

}
