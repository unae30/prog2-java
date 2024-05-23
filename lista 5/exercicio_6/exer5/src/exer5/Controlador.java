package exer5;

public class Controlador {

	public static void main(String[] args) {
		
		Rica p1 = new Rica("Joana", 22, 3000000);
		Rica p2 = new Rica();
		
		Pobre p3 = new Pobre ("Unaê", 23);
		Pobre p4 = new Pobre();
		
		Miseravel p5 = new Miseravel("João", 30);
		Miseravel p6 = new Miseravel();
		
		p1.fazCompras();
		p2.fazCompras();
		
		p3.trabalha();
		p4.trabalha();
		
		p5.mediga();
		p6.mediga();

	}

}
