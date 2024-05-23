package ex4;

public class Controlador {

	public static void main(String[] args) {
		
		Usuario u1 = new Usuario();
			
		Postagem p1 = new Postagem (u1);
		Postagem p2 = new Postagem (u1);
		Postagem p3 = new Postagem(u1);
		
		Blog b1 = new Blog(3);
		
		b1.adicionarPostagem(p1);
		b1.adicionarPostagem(p2);
		b1.adicionarPostagem(p3);
		b1.publicarPostagem(p1);

		b1.listarPostagensPublicadas();
		b1.listarTodasAsPostagens();

		
		b1.apagarPostagem(p1);
		
		b1.listarPostagensPublicadas();
		b1.listarTodasAsPostagens();

		
	}

}