package exe2;

public class Empregado {
	
	private String ID;
	private String nome;
	private String cargo;
	private double salario;
	

	public Empregado(String ID, String nome, String cargo, double salario) {
		this.ID = ID;
		this.nome = nome;
		this.cargo = cargo;
		this.salario = salario;
	}
	
//criei pra fazer o teste da letra a) e n�o consigo mapear um objeto sem o atributo definido;
//	public Empregado() {};
	
	
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		Empregado e = (Empregado)obj;
			if(this.getID().equals(e.getID())) {
				return true;
			}else {
				return false;
			}
		}
	
	@Override
	public int hashCode() {
			return this.getID().charAt(0) + this.getID().charAt(1) + this.getID().charAt(2)
					+ this.getID().charAt(3) + this.getID().charAt(4);
	}
	
	@Override
	public String toString() {
		String str = " ID: " + this.getID() + "\r\n";
		str += " Nome: " + this.getNome() + "\r\n";
		str += " Cargo: " + this.getCargo() + "\r\n";
		str += " Sal�rio: " + this.getSalario() + "\r\n";
		str += "----------------------------------------";
		return str;
	}
	
	

}