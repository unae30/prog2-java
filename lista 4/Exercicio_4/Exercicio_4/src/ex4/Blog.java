package ex4;

public class Blog {
	private Postagem [] postagem;
	int numeroDePostagem;
	
	public Blog (int numeroDePostagem) {
		this.postagem = new Postagem [numeroDePostagem];
	}

	public Postagem[] getPostagem() {
		return postagem;
	}

	public void setPostagem(Postagem[] postagem) {
		this.postagem = postagem;
	}
	
	
	public int getNumeroDePostagem() {
		return numeroDePostagem;
	}

	public void setNumeroDePostagem(int numeroDePostagem) {
		this.numeroDePostagem = numeroDePostagem;
	}

	public void adicionarPostagem(Postagem postagem) {
		int identificador = 0;
		
		for(int i = 0; i < this.postagem.length; i++) {
			if(identificador == 0) {
				if(this.postagem[i] == null) {
					this.postagem[i] = postagem;
					identificador = 1;
				}
			}
		}
		System.out.println();
	}	
	
	public void publicarPostagem(Postagem postagem) {	
		int identificador = 0;
		for(int i = 0; i < this.postagem.length; i++) {
			if(identificador == 0) {
				if(this.postagem[i].getId() == postagem.getId()) {
					this.postagem[i] = postagem;
					Datetime dataPublicacao = new Datetime(); 
					this.postagem[i].setDataPublicacao(dataPublicacao);
					identificador = 1;
				}
			}
		}
		System.out.println();
	}
	
	public void listarPostagensPublicadas() {
		System.out.println("TODAS AS POSTAGENS J� PUBLICADAS NO BLOG:");
		for(int i =0; i < this.postagem.length; i++) {
			if(this.postagem[i].getDataPublicacao() != null){
				System.out.println(this.postagem[i].getId() + " - " + this.postagem[i].getTitulo());
			}
		}
		System.out.println();
	}
	
	public void listarTodasAsPostagens() {
		System.out.println("TODAS AS POSTAGENS INSERIDAS NO SISTEMA DO BLOG:");
		for(int i = 0; i < this.postagem.length; i++) {
			System.out.println(this.postagem[i].getId() + " - " + this.postagem[i].getTitulo());
		}
		System.out.println();
	}
	
	public void apagarPostagem(Postagem postagem) {
		for(int i = 0; i < this.postagem.length; i++) {
			if(this.postagem[i].getId() == postagem.getId()) {
				this.postagem[i].setDataPublicacao(null);
				System.out.println("Postagem " + postagem.getTitulo() + " apagada com sucesso.");
			}
		}
		System.out.println();
	}
}
