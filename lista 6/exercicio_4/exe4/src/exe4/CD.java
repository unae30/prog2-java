package exe4;

import java.util.Scanner;

public class CD extends Midia {

	private int nMusicas;
	
	//construtores
	
	public CD() {};

	public CD(int c, double p, String s, int m) {
		super(c,p,s);
		this.nMusicas = m;
	}
	
	
	//getters e setters
	
	public int getnMusicas() {
		return nMusicas;
	}

	public void setnMusicas(int nMusicas) {
		this.nMusicas = nMusicas;
	}

	//metodos interface
	@Override
	public String getTipo() {
		return super.getTipo();
	}

	@Override
	public String getDetalhes() {
		super.getDetalhes();
		String infoDVD = ("NÚMERO DE FAIXAS : " + this.nMusicas);		
		return infoDVD;		
	}

	Scanner sc2 = new Scanner (System.in);
	
	@Override
	public void inserirDados() {
		super.inserirDados();
		System.out.println("NÚMERO DE MÚSICAS: ");
		String musicas = sc2.nextLine();
		this.nMusicas = Integer.parseInt(musicas);
	}
	
	@Override
	public void printDados() {
		super.printDados();
		System.out.println(getDetalhes());
		this.musicaAmostra();
	}
	
	public void musicaAmostra() {
		System.out.println("--------------------------------");
		System.out.println("--------------------------------");
		System.out.println("-----REPRODUZINHO MÚSICA 1------");
		System.out.println("--------------------------------");
		System.out.println("--------------------------------");

	
	}
}
