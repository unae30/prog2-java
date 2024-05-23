package letrab;

import java.time.LocalDate;

public class Empregado implements Comparable <Empregado>{
	
	private String ID;
	private String nome;
	private double salario;
	private String data;
	private LocalDate dataFinal;


	public Empregado(String ID, String nome, double salario, String data) {
		this.ID = ID;
		this.nome = nome;
		this.salario = salario; 
		this.data = data;
		this.dataFinal = LocalDate.parse(data);
	}
	
	
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

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	
	public LocalDate getDataFinal() {
		return dataFinal;
	}

	public void setDataFinal(LocalDate dataFinal) {
		this.dataFinal = dataFinal;
	}


	@Override
	public int compareTo(Empregado e) {
		if(this.getSalario() < e.getSalario())
			return -1;
		if(this.getSalario() > e.getSalario())
			return 1;		
		return 0;
	}
	
	@Override
	public String toString() {
		String src = "ID: " + this.getID() + "\r\n";
		src += "Nome: " + this.getNome() + "\r\n";
		src += "Salario: " + this.getSalario() + "\r\n";
		src+= "Data de admiss�o: " + this.getDataFinal() + "\r\n";
		src+= "------------------------------------------";
		return src;
	}

}
