package exe4;


public class Controlador {

	public static void main(String[] args) {
		
		System.out.println("Cadastrando CD...");
		
		iMidia midia [] = new iMidia [4]; 
		midia[0] = new DVD(001, 29.99, "Trupe Delirante", 10);
		midia[1] = new CD(002, 20.99, "O rappa nacional", 8);
		
		Midia midias = new DVD();
		Midia midias1 = new CD();
		
		((DVD)midias).inserirDados();
		((CD)midias1).inserirDados();
		
		midia[2] =  midias;
		midia[3] = midias1;
		
		
		
		for(int i = 0; i < midia.length; i++) {
			midia[i].printDados();
		}
		
		
		
		
		
	}

}