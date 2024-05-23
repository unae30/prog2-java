package ex4;

import java.util.Scanner;

public class Postagem {
	private int id;
	private String titulo;
	private String texto;
	private Datetime dataPublicacao;
	
	public Postagem(Usuario usuario) {
		Scanner sc = new Scanner(System.in);
		
		if(usuario.getLogin() == null && usuario.getSenha() == null) {
			System.out.println("Este usu�rio n�o pode criar uma postagem.");
		}
		else {
			System.out.printf("Numero da postagem: ");
			String numero = sc.nextLine();
			int numeroConvertido = Integer.parseInt(numero);
			this.id = numeroConvertido;
			System.out.print("Titulo: ");
			this.titulo = sc.nextLine();
			System.out.printf("Texto: ");
			this.texto = sc.nextLine();		
			
			System.out.println("O(a) autor(a) dessa postagem �: " + usuario.getNome());
			System.out.println();
		}
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public Datetime getDataPublicacao() {
		return dataPublicacao;
	}
	public void setDataPublicacao(Datetime dataPublicacao) {
		this.dataPublicacao = dataPublicacao;
	}
	
	
}
