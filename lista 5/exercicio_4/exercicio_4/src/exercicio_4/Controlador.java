package exercicio_4;

public class Controlador {

	public static void main(String[] args) {
		
		Cachorro c1 = new Cachorro("Bob");
		Cachorro c2 = new Cachorro();
		
		Gato g1 = new Gato("Lucy");
		Gato g2 = new Gato();
		
		System.out.println(c1.late());
		System.out.println(g1.mia());
		System.out.println(c1.caminha());
		System.out.println(g1.caminha());
		
		System.out.println();
		
		System.out.println(c2.late());
		System.out.println(g2.mia());
		System.out.println(c2.caminha());
		System.out.println(g2.caminha());
		

	}

}
