package exe4;
import java.util.Scanner;

public abstract class Midia implements iMidia{
	private int codigo;
	private double preco;
	private String nome;
	
	public Midia() {};
	
	public Midia(int c, double p, String n) {
		this.codigo = c;
		this.preco = p;
		this.nome = n;
	}
	
	
	//getters e setters
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	
	//metodos interface
	
	public String getTipo() {
		return nome;
	}
	
	public String getDetalhes() {
		String informacoes = "C�digo: "+ this.codigo + "\r\n" + "Pre�o: " + this.preco;
		return informacoes;
	}

	Scanner sc = new Scanner(System.in);
	
	public void inserirDados() {
		System.out.println("Insira os dados da m�dia: ");
		System.out.println("C�DIGO: ");
		String cod = sc.nextLine();
		this.codigo = Integer.parseInt(cod);
		System.out.println("PRE�O: ");
		String precoString = sc.nextLine(); 
		this.preco = Double.parseDouble(precoString);
		System.out.println("NOME: ");
		this.nome = sc.nextLine();
	}
	
	public void printDados() {
		System.out.println("INFOMRA��ES DA M�DIA: ");
		System.out.println("C�DIGO: " + getCodigo());
		System.out.println("PRE�O: " + getPreco());
		System.out.println("NOME: " + getTipo());
	}
}
