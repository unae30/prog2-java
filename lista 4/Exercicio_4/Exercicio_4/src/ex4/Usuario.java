package ex4;

import java.util.Scanner;

public class Usuario {
	private int id;
	private String nome;
	private String login;
	private String senha;
	
	public Usuario() {
		Scanner sc1 = new Scanner(System.in);
		
		System.out.printf("ID do usu�rio");
		String numero = sc1.nextLine();
		int numeroConvertido = Integer.parseInt(numero);
		this.id = numeroConvertido;
		System.out.print("Nome: ");
		this.nome = sc1.nextLine();
		System.out.printf("Login: ");
		this.login = sc1.nextLine();
		System.out.printf("Senha: ");
		this.senha = sc1.nextLine();
		System.out.println();

	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
}
