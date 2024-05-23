package exe4;
import java.util.Scanner;

public class DVD extends Midia {
	
	private int nFaixas;

	//construtores
	public DVD() {};
	
	public DVD(int c, double p, String s, int f) {
		super(c,p,s);
		this.nFaixas = f;
	}
	
	//getters e setters
	public int getFaixas() {
		return nFaixas;
	}

	public void setnFaixas(int nFaixas) {
		this.nFaixas = nFaixas;
	}
	
	//métodos interface

	@Override
	public String getTipo() {
		return super.getTipo();
	}

	@Override
	public String getDetalhes() {
		super.getDetalhes();
		String infoDVD = ("NÚMERO DE FAIXAS : " + this.nFaixas);		
		return infoDVD;		
	}

	Scanner sc1 = new Scanner (System.in);
	
	@Override
	public void inserirDados() {
		super.inserirDados();
		System.out.println("NÚMERO DE FAIXAS: ");
		String faixas = sc1.nextLine();
		this.nFaixas = Integer.parseInt(faixas);
	}
	
	@Override
	public void printDados() {
		super.printDados();
		System.out.println(getDetalhes());
		this.capaDoDVD();
	}
	
	public void capaDoDVD() {
		System.out.println("--------------------------------");
		System.out.println("--------------------------------");
		System.out.println("--------------------------------");
		System.out.println("--------------------------------");
		System.out.println("-----------CAPA DO DVD----------");
		System.out.println("--------------------------------");
		System.out.println("--------------------------------");
		System.out.println("--------------------------------");
		System.out.println("--------------------------------");
	
	}
}
