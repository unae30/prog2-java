package letrab;

public class Produtos {
	private String ID;
	private String nome;
	private double preco;
	
	public Produtos(String ID, String nome, double preco){
		this.ID = ID;
		this.nome = nome;
		this.preco = preco;
	}
	
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		this.ID = iD;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	@Override
	public boolean equals(Object obj) {
		Produtos p = (Produtos)obj;
		if(this.getID().equals(p.getID())) {
			return true;
		}else {
			return false;
		}
	}
	
	@Override
	public int hashCode(){
		return this.getID().charAt(0) + this.getID().charAt(1) + this.getID().charAt(2) + this.getID().charAt(3);
	}
	
	@Override
	public String toString() {
		String str = "ID: " + this.getID();
		str += " Nome: " + this.getNome();
		str+= " Pre�o: " + this.getPreco();
		return str;
	}
	
}
