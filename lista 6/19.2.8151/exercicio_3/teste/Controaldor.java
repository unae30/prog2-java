package exe3;

public class Controaldor {

	public static void main(String[] args) {
		
		
		Dispositivo novo = new DiscoOtico();
		
		System.out.println(((DiscoOtico)novo).capacidadeEmMegabytes());
		System.out.println(((DiscoOtico)novo).toString());
	}

}
