package ex1;

import java.util.Scanner;

public class Empregado {
	private String nome;
	private double salario;
	private int numeroDeHoras;
	
	Scanner sc  = new Scanner(System.in);
	
	public Empregado(String nome, double salario){
		
		this.nome = nome;
		this.salario = salario;
				
		System.out.println("Deseja informar o numero de horas? ");
		System.out.println("Digite [S] para sim, ou ");
		System.out.println("Digite [N] para não ");
		String resposta = sc.nextLine();
		
		
		switch(resposta){
		
			case "S":
				System.out.println("NÚMERO DE HORAS: ");
				numeroDeHoras = sc.nextInt();
				break;
				
			case "N":
				numeroDeHoras = 8;
				break;
		}		
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


	public int getNumeroDeHoras() {
		return numeroDeHoras;
	}


	public void setNumeroDeHoras(int numeroDeHoras) {
		this.numeroDeHoras = numeroDeHoras;
	}	
	
	public void printInfo() {
		System.out.println("---INFORMAÇÕES DO EMPREGADO:---");
		System.out.println("-- NOME: " + getNome());
		System.out.println();
		System.out.println("-- SALÁRIO: " + getSalario());
		System.out.println();
		System.out.println("-- NUMERO DE HORAS: " + getNumeroDeHoras());
		System.out.println();
		
	}
	
	public double promoção(double percentualAumento) {
		double salarioPromocao = this.salario * percentualAumento;
		this.salario = this.salario + salarioPromocao;
		return this.salario;
		
	}
	
	public double adicionaGratificação() {
		if(this.numeroDeHoras > 6) {	
			System.out.println("O valor da gratificação a ser adicionado é: ");
			double gratificacao = sc.nextDouble();			
			this.salario += gratificacao;
			return this.salario;		
			
			
		}else {
			return this.salario;
		}
	}
}
